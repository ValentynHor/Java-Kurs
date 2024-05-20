package section11_junit;


import org.junit.Test;

public class NetworkUtilsTest {

    @Test(timeout = 1000)
    public void getConnectionShouldReturnFasterThanOneSecond() throws InterruptedException {
        NetworkUtils.getConnection();
    }

}