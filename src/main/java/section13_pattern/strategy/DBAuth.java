package section13_pattern.strategy;

public class DBAuth implements AuthStrategy {

    private Object dbRef;
    private String dburl;

    public DBAuth(String dburl) {
        this.dburl = dburl;
    }

    private void createConnection(String dbUrl){
        //dbRef=
    }

    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking...");

        String userHash;
        return true;
    }
}
