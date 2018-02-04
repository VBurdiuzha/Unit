import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Tests {
    public static void main(String[] args) {

    }



    @DataProvider(name = "provider1")
    public Object[][] createData1() {
        return new Object[][] {
                { "23213213@gmail.com", true },
                { "23213213@yandex.ru", true},
                { "@gmail.com", false },
                { " @gmail.com", false},
                { "23213213@", false },
                { "23213213@.com", false}
        };
    }

    @Test(dataProvider = "provider1")
    public void verifyData1(String n1, boolean n2) {
        System.out.println("E-mail: " + n1 + " " + n2);
    }

    @DataProvider(name = "provider2")
    public Object[][] createData2() {
        return new Object[][] {
                { "1450", true },
                { "1451", true},
                { "2450", true },
                { "1390", false},
                { "999", false },
                { "45 0", false}
        };
    }

    @Test(dataProvider = "provider2")
    public void verifyData2(String n1, boolean n2) {
        System.out.println("Value: " + n1 + " " + n2);
    }

    @DataProvider(name = "provider3")
    public Object[][] createData3() {
        return new Object[][] {
                { "100", true },
                { "100.4", true},
                { "100,4", false },
                { "99.99", false},
                { "99", false },
                { "101", true}
        };
    }

    @Test(dataProvider = "provider3")
    public void verifyData3(String n1, boolean n2) {
        System.out.println("Price: " + n1 + " " + n2);
    }






    // Test for first regex (^(?:[^@]+(?:@gmail.com|@yandex.ru)?(?:,|$))*$)
    @Test
    public static void testCheckEmail1() {
        Assert.assertFalse(Main.chekEmail("23213213@gmail.com"));
    }
    @Test
    public static void testCheckEmail2() {
        Assert.assertFalse(Main.chekEmail("23213213@yandex.ru"));
    }
    @Test
    public static void testCheckEmail3() {
        Assert.assertTrue(Main.chekEmail("@gmail.com"));
    }
    @Test
    public static void testCheckEmail4() {
        Assert.assertFalse(Main.chekEmail(" @gmail.com"));
    }
    @Test
    public static void testCheckEmail5() {
        Assert.assertTrue(Main.chekEmail("23213213@"));
    }
    @Test
    public static void testCheckEmail6() {
        Assert.assertTrue(Main.chekEmail("23213213@.com"));
    }

    // Test for second regex (^(?:[1][4-9][5-9]\\d)|(?:[2-9]\\d{3})|(?:[1][4][5-9]\\d)$)
    @Test
    public static void testCheckValue1() {
        Assert.assertFalse(Main.chekValue("1450"));
    }
    @Test
    public static void testCheckValue2() {
        Assert.assertFalse(Main.chekValue("1451"));
    }
    @Test
    public static void testCheckValue3() {
        Assert.assertFalse(Main.chekValue("2450"));
    }
    @Test
    public static void testCheckValue4() {
        Assert.assertTrue(Main.chekValue("1390"));
    }
    @Test
    public static void testCheckValue5() {
        Assert.assertTrue(Main.chekValue("999"));
    }
    @Test
    public static void testCheckValue6() {
        Assert.assertTrue(Main.chekValue("45 0"));
    }

    // Test for third regex (^(?:100|\d{2}(\d)+)(?:\.[0-9]{1,2})?$)
    @Test
    public static void testCheckPrice1() {
        Assert.assertFalse(Main.chekPrice("100"));
    }
    @Test
    public static void testCheckPrice2() {
        Assert.assertFalse(Main.chekPrice("100.4"));
    }
    @Test
    public static void testCheckPrice3() {
        Assert.assertFalse(Main.chekPrice("100.66"));
    }
    @Test
    public static void testCheckPrice4() {
        Assert.assertTrue(Main.chekPrice("99.99"));
    }
    @Test
    public static void testCheckPrice5() {
        Assert.assertTrue(Main.chekPrice("99"));
    }
    @Test
    public static void testCheckPrice6() {
        Assert.assertFalse(Main.chekPrice("101"));
    }



}

