package section8_stream.module2;

import lombok.AllArgsConstructor;
import section8_stream.module2.acount.Account;
import section8_stream.module2.acount.Accounts;
import section8_stream.module2.acount.Sex;
import section8_stream.module2.exception.EntityNotFoundException;
import section8_stream.module2.exception.ExerciseNotCompletedException;

import java.math.BigDecimal;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
public class CrazyStreams {

    public static void main(String[] args) {

        List<Account> accounts = Accounts.generateAccountList(50);

        accounts.forEach(System.out::println);

        System.out.println("Reichste Account:");
        Optional<Account> richestPerson = findRichestPerson(accounts);
        richestPerson.ifPresentOrElse(
                p -> System.out.println(p.getBalance()),
                () -> System.out.println("Fehler")
        );
        System.out.println("*****************************************************************");

        System.out.println("Geburtsdatum im April");
        List<Account> accountsByBirthdayMonth = findAccountsByBirthdayMonth(Month.APRIL, accounts);
        accountsByBirthdayMonth.forEach(System.out::println);
        System.out.println("*****************************************************************");

        System.out.println("Männer und Frauen getrennt");
        Map<Boolean, List<Account>> listMapAccounts = partitionMaleAccounts(accounts);
        for (Map.Entry<Boolean, List<Account>> entry : listMapAccounts.entrySet()) {
            boolean isMale = entry.getKey();
            List<Account> accountList = entry.getValue();

            System.out.println("Male: " + isMale);
            System.out.println("Accounts: ");
            accountList.forEach(System.out::println);
        }
        System.out.println("*****************************************************************");

        System.out.println("Gruppierung nach Email domain");
        Map<String, List<Account>> groupAccountsByEmailDomain = groupAccountsByEmailDomain(accounts);
        for (Map.Entry<String, List<Account>> entry : groupAccountsByEmailDomain.entrySet()) {
            var domain = entry.getKey();
            var accountList = entry.getValue();

            System.out.println("Domain: " + domain);
            System.out.println("Accounts: ");
            accountList.forEach(System.out::println);
        }
        System.out.println("*****************************************************************");

        System.out.println("Summe allen Buchstaben von Namen");
        System.out.println(getNumOfLettersInFirstAndLastNames(accounts));
        System.out.println("*****************************************************************");

        System.out.println("Summe aller Balance");
        System.out.println(calculateTotalBalance(accounts));
        System.out.println("*****************************************************************");

        System.out.println("Sortierte liste");
        List<Account> sortByFirstAndLastNames = sortByFirstAndLastNames(accounts);
        sortByFirstAndLastNames.forEach(System.out::println);
        System.out.println("*****************************************************************");

        System.out.println("Gibts Domain gmail.com?");
        System.out.println(containsAccountWithEmailDomain("gmail.com", accounts));
        System.out.println("*****************************************************************");

        System.out.println("Get Balance by email");
        try {
            System.out.println(getBalanceByEmail("e.gmail.com", accounts));
        } catch (EntityNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("*****************************************************************");


    }

    /**
     * Returns {@link Optional} that contains an {@link Account} with the max value of balance
     *
     * @param list a list of accounts
     * @return account with max balance wrapped with optional
     */
    public static Optional<Account> findRichestPerson(List<Account> list) {
        return list.stream().max(Comparator.comparing(Account::getBalance));
    }

    /**
     * Returns a {@link List} of {@link Account} that have a birthday month equal to provided.
     *
     * @param list          a list of accounts
     * @param birthdayMonth a month of birth
     * @return a list of accounts
     */
    public static List<Account> findAccountsByBirthdayMonth(Month birthdayMonth, List<Account> list) {

        return list.stream()
                .filter(a -> birthdayMatchesMonth(a.getBirthday(), birthdayMonth))
                .toList();
    }

    /**
     * Checks if the birth month of a given date matches the provided month.
     *
     * @param birthday the birthday date
     * @param month    the month to compare with
     * @return true if the birth month matches the provided month, false otherwise
     */
    private static boolean birthdayMatchesMonth(Date birthday, Month month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(birthday);
        int birthMonth = calendar.get(Calendar.MONTH) + 1;
        return birthMonth == month.getValue();
    }

    /**
     * Returns a map that separates all accounts into two lists - male and female. Map has two keys {@code true} indicates
     * male list, and {@code false} indicates female list.
     *
     * @param list a list of accounts
     * @return a map where key is true or false, and value is list of male, and female accounts
     */
    public static Map<Boolean, List<Account>> partitionMaleAccounts(List<Account> list) {

        return list.stream()
                .collect(Collectors.partitioningBy(a -> a.getSex().equals(Sex.MALE)));
    }

    /**
     * Returns a {@link Map} that stores accounts grouped by its email domain. A map key is {@link String} which is an
     * email domain like "gmail.com". And the value is a {@link List} of {@link Account} objects with a specific email domain.
     *
     * @param list a list of accounts
     * @return a map where key is an email domain and value is a list of all account with such email
     */
    public static Map<String, List<Account>> groupAccountsByEmailDomain(List<Account> list) {

        return list.stream()
                .collect(Collectors.groupingBy(CrazyStreams::extractEmailDomain));
    }

    /**
     * Returns a number of letters in all first and last names.
     *
     * @param list a list of accounts
     * @return total number of letters of first and last names of all accounts
     */
    public static int getNumOfLettersInFirstAndLastNames(List<Account> list) {
        return list.stream()
                .mapToInt(a -> a.getFirstName().length() + a.getLastName().length())
                .sum();
    }

    /**
     * Returns a total balance of all accounts.
     *
     * @param list a list of accounts
     * @return total balance of all accounts
     */
    public static BigDecimal calculateTotalBalance(List<Account> list) {
        return list.stream()
                .map(Account::getBalance)
                .reduce(BigDecimal.ZERO, (BigDecimal::add));
    }

    /**
     * Returns a {@link List} of {@link Account} objects sorted by first and last names.
     *
     * @param list a list of accounts
     * @return list of accounts sorted by first and last names
     */
    public static List<Account> sortByFirstAndLastNames(List<Account> list) {
        return list.stream()
                .sorted(Comparator.comparing(Account::getFirstName)
                        .thenComparing(Account::getLastName)
                ).toList();
    }

    /**
     * Checks if there is at least one account with provided email domain.
     *
     * @param list        a list of accounts
     * @param emailDomain
     * @return true if there is an account that has an email with provided domain
     */
    public static boolean containsAccountWithEmailDomain(String emailDomain, List<Account> list) {
        return list.stream()
                .map(CrazyStreams::extractEmailDomain)
                .anyMatch(domain -> domain.equals(emailDomain));
    }

    /**
     * Extracts the domain from the email address of an account.
     *
     * @param account the account from which to extract the email domain
     * @return the domain part of the email address
     */
    private static String extractEmailDomain(Account account) {
        return account.getEmail().split("@")[1];
    }

    /**
     * Returns account balance by its email. Throws {@link EntityNotFoundException} with message
     * "Cannot find Account by email={email}" if account is not found.
     *
     * @param list  a list of accounts
     * @param email account email
     * @return account balance
     */
    public static BigDecimal getBalanceByEmail(String email, List<Account> list) {
        return list.stream().filter(a -> a.getEmail().equals(email))
                .findAny()
                .map(Account::getBalance)
                .orElseThrow(() -> new EntityNotFoundException("Cannot find Account by email = " + email));

    }

    /**
     * Collects all existing accounts into a {@link Map} where a key is account id, and the value is {@link Account} instance
     *
     * @param list a list of accounts
     * @return map of accounts by its ids
     */
    public static Map<Long, Account> collectAccountsById(List<Account> list) {
        return list.stream()
                .collect(Collectors.toMap(Account::getId, Function.identity()));
    }

    /**
     * Filters accounts by the year when an account was created. Collects account balances by its emails into a {@link Map}.
     * The key is email and the value is balance
     *
     * @param year the year of account creation
     * @return map of account by its ids the were created in a particular year
     */
    public Map<String, BigDecimal> collectBalancesByEmailForAccountsCreatedOn(int year) {
        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns a {@link Map} where key is {@link Account#lastName} and values is a {@link Set} that contains first names
     * of all accounts with a specific last name.
     *
     * @return a map where key is a last name and value is a set of first names
     */
    public Map<String, Set<String>> groupFirstNamesByLastNames() {
        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns a {@link Map} where key is a birthday month, and value is a {@link String} that stores comma and space
     * -separated first names (e.g. "Polly, Dylan, Clark"), of all accounts that have the same birthday month.
     *
     * @return a map where a key is a birthday month and value is comma-separated first names
     */
    public Map<Month, String> groupCommaSeparatedFirstNamesByBirthdayMonth() {
        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns a {@link Map} where key is a {@link Month} of {@link Account#creationDate}, and value is total balance
     * of all accounts that have the same value creation month.
     *
     * @return a map where key is a creation month and value is total balance of all accounts created in that month
     */
    public Map<Month, BigDecimal> groupTotalBalanceByCreationMonth() {
        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns a {@link Map} where key is a letter {@link Character}, and value is a number of its occurrences in
     * {@link Account#firstName}.
     *
     * @return a map where key is a letter and value is its count in all first names
     */
    public Map<Character, Long> getCharacterFrequencyInFirstNames() {
        throw new ExerciseNotCompletedException();
    }

    /**
     * Returns a {@link Map} where key is a letter {@link Character}, and value is a number of its occurrences ignoring
     * case, in all {@link Account#firstName} and {@link Account#lastName} that are equal or longer than nameLengthBound.
     * Inside the map, all letters should be stored in lower case.
     *
     * @return a map where key is a letter and value is its count ignoring case in all first and last names
     */
    public Map<Character, Long> getCharacterFrequencyIgnoreCaseInFirstAndLastNames(int nameLengthBound) {
        throw new ExerciseNotCompletedException();
    }

}

