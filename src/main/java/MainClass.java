import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dmkru\\IdeaProjects\\testselenium\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        //lesson1//
 //       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        driver.manage().window().maximize(); //
/*      driver.manage().window().setSize(new Dimension(1500,700));
        driver.get("https://www.google.ru/");
        driver.navigate().to("https://www.xlinenn.ru/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());*/


        //lesson2//
        //driver.get("https://www.xlinenn.ru/");
   /*       WebElement link = driver.findElement(By.linkText("ГОРНЫЕ ЛЫЖИ"));
        WebElement link2 = driver.findElement(By.partialLinkText("Сумки для"));
        WebElement searchField = driver.findElement(By.name("keyword"));
        WebElement searchButton = driver.findElement(By.className("input-main"));
        WebElement searchId = driver.findElement(By.id("changeCityQuestion"));
        WebElement searchTag = driver.findElement(By.tagName("input"));
        WebElement element = driver.findElement(By.cssSelector("div#header"));
        WebElement elementPath = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/a/img"));*/

        //lesson3//

        // driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div[2]/table/tbody/tr/td[1]/div/div[2]/form/table/tbody/tr/td[2]/div/a/img")).click();

        //driver.quit();//

        //lesson4 кнопки//
        /*driver.get("https://life.ibs.ru/");
        WebElement button = driver.findElement(By.xpath("//button[@class='btn-blue js-login-btn']"));
        if (button.getText().equals("Войти")) {
            System.out.println("Success");
        } else System.out.println("Fail");
        button.submit();*/

        /*driver.get("https://life.ibs.ru/");
        driver.findElement(By.xpath("//button[@class='btn-blue js-login-btn']")).click();*/

        /*driver.get("https://gb.ru/login");
        driver.findElement(By.xpath("//input[@class='btn btn-block btn-success']")).submit();*/

        //lesson5 поля//
        /*driver.get("https://encyclopatia.ru/wiki/%D0%A0%D0%B0%D1%81%D1%81%D1%82%D1%80%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_%D0%BF%D1%80%D0%B5%D0%BF%D0%B0%D1%80%D0%B0%D1%82%D0%BE%D0%B2");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("тест");
        driver.findElement(By.xpath("//input[@id='searchButton']")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id='searchText']/input")).getAttribute("value"));
        driver.findElement(By.xpath("//*[@id='searchText']/input")).clear();*/

        /*driver.get("https://gb.ru/login");
        driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("логин");
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("пароль");
        driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/input")).submit();
        System.out.println(driver.findElement(By.xpath("//*[@id='user_email']")).getAttribute("value"));*/

        //lesson6 ссылки//
        /*driver.get("https://encyclopatia.ru/wiki/%D0%A0%D0%B0%D1%81%D1%81%D1%82%D1%80%D0%B5%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA_%D0%BF%D1%80%D0%B5%D0%BF%D0%B0%D1%80%D0%B0%D1%82%D0%BE%D0%B2");
        WebElement link = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr/td[2]/p/a"));
        System.out.println(link.getText());
        link.click();*/

        //lesson7 чекбоксы//
        /*driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()='Дом']")).click();
        driver.findElement(By.xpath("//*[@id=\"126986994\"]/div/div/div[1]/div/a/div/picture/img")).click();

        System.out.println(driver.findElement(By.xpath("//span[text()='столик журнальный']/../../input")).isSelected());
        driver.findElement(By.xpath("//span[text()='столик журнальный']")).click();
        System.out.println(driver.findElement(By.xpath("//span[text()='плед']/../../input")).isSelected());
        driver.findElement(By.xpath("//span[text()='плед']")).click();
        selectChBox("плед");
        selectChBox("столик журнальный");
        selectChBox("ковер");
        deletChBox("ковер");

        System.out.println(driver.findElement(By.xpath("//span[text()='До 5 дней']/../../input")).isSelected());
        driver.findElement(By.xpath("//span[text()='До 5 дней']")).click();
        System.out.println(driver.findElement(By.xpath("//span[text()='До 5 дней']/../../input")).isSelected()); */

        /*//lesson7 выпадающие списки//
        driver.get("https://accounts.google.com/lifecycle/steps/signup/name?continue=https://www.google.ru/webhp?hl%3Dru%26ictx%3D2%26sa%3DX%26ved%3D0ahUKEwj3vdH-0YXRAhUBDiwKHcbtDu4QPQgD&dsh=S1728596162:1705260943858730&ec=GAlAmgQ&flowEntry=SignUp&flowName=GlifWebSignIn&hl=ru&theme=glif&TL=AHNYTISZzDpJgjdqq2REl8JfP_AEL677sgxSS0rgCPaZpkYlOlJcgZyWtNCzSBKD");
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/div/div/div/div[2]/ul/li[1]")).click();*/

        /*//lesson8 списки и findElements //
        driver.get("https://market.yandex.ru/");
        driver.findElement(By.xpath("//span[text()='Дом']")).click();
        driver.findElement(By.xpath("//*[@id=\"126986994\"]/div/div/div[1]/div/a/div/picture/img")).click();
        driver.findElement(By.xpath("//*[@id=\"132155256\"]/div/div/div[1]/div/a/div/picture/img")).click();
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//div[@data-filter-id='21194330']//span[@class='_2XaWK']"));
    //    checkBox.get(3).click();
        if (checkBoxes.size() == 5) System.out.println("OK");
        else System.out.println("FALSE");

        for (WebElement i:checkBoxes){
            i.click();
        }*/

        //lesson9 таблицы //

        /*driver.get("/html/body/div[1]/table/tbody/tr[2]/td[1]/table"); https://www.w3schools.com/html/html_tables.asp
        //WebElement tableElemets = driver.findElement(By.xpath("//table[@id='customers']"));
        WebElement link2 = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr[8]/td[1]"));
        System.out.println(link2.getText());*/

        /*driver.get("https://trekkingclub.ru/lukov.htm");
        WebElement tableElement = driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[1]/table"));
        Table table = new Table(tableElement,driver);
        System.out.println("Rows number: " + table.getRows().size());
        System.out.println(table.getValueFromCell(2,1));*/

        //lesson10 явные ожидания //
        /*WebDriverWait wait5 = (new WebDriverWait(driver, 5));
        WebDriverWait wait10 = (new WebDriverWait(driver, 10));

        driver.get("https://accounts.google.com");
        wait5.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(), 'Используйте аккаунт Google')]")));
        System.out.println("1");
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/div/div/div/div[1]")).click();
        System.out.println("2");
        wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/div/div/div/div[2]")));
        driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/div/div/div/div[2]/ul/li[9]")).click();
        wait10.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/div/div/div/div[2]")));
        */
        //lesson11 класс Actions //
        /*driver.get("https://sport-marafon.ru/");
        WebElement link = driver.findElement(By.xpath("//a[text()='Горные лыжи'] "));
        WebElement element2 = driver.findElement(By.xpath("//a[text()='Горные лыжи'] "));
        Actions action = new Actions(driver);
        action.moveToElement(link).build().perform();
        action.dragAndDrop(element2,link).build().perform();
        action.clickAndHold(link).moveToElement(element2).release().build().perform();
        action.doubleClick(element2);
        action.contextClick(element2);*/
        //lesson12 javascript + взаимодействие с алертами //
        /*JavascriptExecutor jse = (JavascriptExecutor)driver;
        driver.get("https://trekkingclub.ru");
        /*jse.executeScript("window.scrollBy(0,1000)", "");
        jse.executeScript("window.scrollBy(0,-500)", "");
        jse.executeScript("alert('Hello');");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        driver.get("https://www.google.ru");
        jse.executeScript("confirm('Hello2');");
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();*/

        //lesson13 работа с несколькии окнами //
        /*driver.get("https://trekkingclub.ru/semka.htm");
        String mainWindow = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@title =  'Поход по хребту Большой Таганай']")).click();
        for (String windowHandle:driver.getWindowHandles()){
            driver.switchTo().window(windowHandle);
        }
        driver.findElement(By.xpath("//*[@id=\"alb1\"]/a")).click();
        driver.switchTo().window(mainWindow);
        driver.findElement(By.xpath("//img[@alt='Наша виртуальная тусовка']")).click();

        driver.get("https://trekkingclub.ru/index.htm");
        String mainTab = driver.getWindowHandle();
        driver.findElement(By.xpath("//span[text()='Первый сайт нашего клуба']")).click();
        for (String tab:driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        driver.findElement(By.xpath("//a[@title = 'Как выбирать лучший рюкзак']")).click();
        driver.switchTo().window(mainTab);
        driver.findElement(By.xpath("//img[@alt='Наша виртуальная тусовка']")).click();*/

        //lesson13 работа с состояниями //
        /*driver.get("https://trekkingclub.ru/sostav.htm");
        WebElement button1 = driver.findElement(By.xpath("/html/body/div[1]/table[1]/tbody/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/form/center/input[2]"));

        System.out.println(button1.isEnabled());
        if (button1.isEnabled()) button1.click();

        driver.get("https://docs.google.com/forms/d/1M_5t8ni3XVpvZt_bIBzyNLjTmDMdrsY3ZEAjwREuu4U/viewform");
        WebElement rb1 = driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div"));
        System.out.println("Radio rb1: " + rb1.isSelected());
        if (!rb1.isSelected()) rb1.click();
        driver.get("https://sport-marafon.ru/");

        WebElement link1 = driver.findElement(By.xpath("//*[@id=\"shop-dd-menu-5\"]/div/div/div/ul[3]/li[3]/a"));
        WebElement link2 = driver.findElement(By.xpath("//*[@id=\"shop-dd-menu-4\"]/a"));
        System.out.println("link1: " + link1.isDisplayed());
        System.out.println("link2: " + link2.isDisplayed());
        if (link1.isDisplayed()) link1.click();
        else link2.click();*/

        //lesson14 проверка элементов //
        /*driver.get("https://trekkingclub.ru/sostav.htm");
        System.out.println(driver.findElements(By.xpath("//input[@value = 'Отправить']")).size());
        if (driver.findElements(By.xpath("//input[@value = 'Отправить']")).size() > 0) System.out.println("Element is presented");
        else System.out.println("Cannot find such element");*/

        //lesson15 нажатие на клавиши //
        /*driver.get("https://trekkingclub.ru/sostav.htm");
        WebElement search = driver.findElement(By.xpath("//input[@name= 'ima']"));
        //search.sendKeys(Keys.chord(Keys.SHIFT, "test"));
        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");
        search.sendKeys("test");
        search.sendKeys(select);
        search.sendKeys(cut);
        search.sendKeys(paste);
        search.sendKeys(Keys.ENTER);*/

        //lesson15 скриншоты //
    }




    public static void selectChBox(String name){
        String rbXpath = "//span[text()='%s']";
        if (!driver.findElement(By.xpath(String.format(rbXpath,name) + "/../../input")).isSelected())
            driver.findElement(By.xpath(String.format(rbXpath,name))).click();
    }

     public static void deletChBox(String name){
            String rbXpath = "//span[text()='%s']";
            if (driver.findElement(By.xpath(String.format(rbXpath,name) + "/../../input")).isSelected())
                driver.findElement(By.xpath(String.format(rbXpath,name))).click();
    }
}
