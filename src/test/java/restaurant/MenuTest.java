package restaurant;

import org.junit.Assert;
import org.junit.Test;

public class MenuTest {
    @Test
    public void MenuChooseMainDish_Kotlet() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseMainDish(1);

        //Assert
        Assert.assertEquals("1. Kotlet", result);
    }

    @Test
    public void MenuChooseMainDish_Golabki() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseMainDish(2);

        //Assert
        Assert.assertEquals("2. Golabki", result);
    }

    @Test
    public void MenuChooseMainDish_PierogiZMiesem() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseMainDish(3);

        //Assert
        Assert.assertEquals("3. Pierogi z miesem", result);
    }

    @Test
    public void MenuChooseSoup_Grochowka() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseSoup(1);

        //Assert
        Assert.assertEquals("1. Grochowka", result);
    }

    @Test
    public void MenuChooseSoup_Pomidorowa() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseSoup(2);

        //Assert
        Assert.assertEquals("2. Pomidorowa", result);
    }

    @Test
    public void MenuChooseSoup_Rosol() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseSoup(3);

        //Assert
        Assert.assertEquals("3. Rosol", result);
    }

    @Test
    public void MenuChooseDrink_Woda() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseDrink(1);

        //Assert
        Assert.assertEquals("1. Woda", result);
    }

    @Test
    public void MenuChooseDrink_Cola() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseDrink(2);

        //Assert
        Assert.assertEquals("2. Cola", result);
    }

    @Test
    public void MenuChooseDrink_Sok() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseDrink(3);

        //Assert
        Assert.assertEquals("3. Sok", result);
    }

    @Test
    public void MenuChooseDrink_Sok1() throws Exception {
        //Arrange
        Menu menu = new Menu();

        //Act
        String result = menu.chooseDrink(4);

        //Assert
        Assert.assertEquals("4. Sok1", result);
    }
}
