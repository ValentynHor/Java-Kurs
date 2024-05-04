package section6_string;

public class StringBuilderVsStringConcatenation {
    public static void main(String[] args) {
        {
            long startTime, endTime = 0;
            String s1 = "hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo hallo ";
            String s2 = "asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg asrg ";
            String s3 = "gerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdthgerhehe sdth";

            startTime = System.currentTimeMillis();
            String res1 = s1 + s2 + s3;
            endTime = System.currentTimeMillis();
            System.out.println("StringConcatenation: " + (endTime - startTime) + " Millisekunden");
            //System.out.println(res1);

            startTime = System.currentTimeMillis();
            String res2 = new StringBuilder().append(s1).append(s2).append(s3).toString();
            endTime = System.currentTimeMillis();
            System.out.println("StringBuilder: " + (endTime - startTime) + " Millisekunden");
            //System.out.println(res2);
        }
        {
            long startTime, endTime = 0;
            String s1 = "str1";
            String s2 = "str2";
            String s3 = "str3";

            startTime = System.currentTimeMillis();
            String res1 = s1 + s2 + s3;
            endTime = System.currentTimeMillis();
            System.out.println("StringConcatenation: " + (endTime - startTime) + " Millisekunden");
            //System.out.println(res1);

            startTime = System.currentTimeMillis();
            String res2 = new StringBuilder().append(s1).append(s2).append(s3).toString();
            endTime = System.currentTimeMillis();
            System.out.println("StringBuilder: " + (endTime - startTime) + " Millisekunden");
            //System.out.println(res2);
        }


    }
}