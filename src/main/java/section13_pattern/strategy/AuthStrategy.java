package section13_pattern.strategy;

public interface AuthStrategy {

    boolean checkLogin(String name, String password);
}
