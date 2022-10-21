package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.UtestUserAddress.*;

public class FillUserAddress implements Task {

    private List<Utest_Data> data;

    public FillUserAddress(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillUserAddress theForm(List<Utest_Data> data) {
        return Tasks.instrumented(FillUserAddress.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getStrZip()).into(ZIP),
                Click.on(COUNTRY_BOX),
                Enter.theValue(data.get(0).getStrCountry()).into(COUNTRY),
                Click.on(NEXT_BTN)
        );

    }
}
