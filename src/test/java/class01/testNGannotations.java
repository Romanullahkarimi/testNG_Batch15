package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGannotations {
    @BeforeTest

    public void BeforeMethods() {
        System.out.println("i am first method");
    }
        @AfterMethod
                public void afterMethod(){
            System.out.println("i am after method");

        }
    @Test(groups = "regression")
    public void aFirstTEstCase(){
        System.out.println(" i am second test case");
    }
        @Test
    public void bSecondTEstCase(){
            System.out.println(" i am second test case");
        }
    @Test
    public void tThirdTEstCase(){
        System.out.println(" i am third test case");

    }

}


