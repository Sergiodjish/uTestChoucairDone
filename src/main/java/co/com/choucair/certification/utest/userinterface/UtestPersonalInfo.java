package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPersonalInfo {

    public static final Target FIRST_NAME = Target.the("User first name")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("User last name")
            .located(By.id("lastName"));

    public static final Target EMAIL = Target.the("User email")
            .located(By.id("email"));

    public static final Target BIRTH_M = Target.the("User birth month")
            .located(By.id("birthMonth"));

    public static final Target BIRTH_D = Target.the("User birth day")
            .located(By.id("birthDay"));

    public static final Target BIRTH_Y = Target.the("User birth year")
            .located(By.id("birthYear"));

    public static final Target NEXT_BTN = Target.the("Button that redirects us to the next step of registration")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}

