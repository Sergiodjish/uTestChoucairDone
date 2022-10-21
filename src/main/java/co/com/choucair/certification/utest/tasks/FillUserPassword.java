package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.Utest_Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.UtestPassword.*;

public class FillUserPassword implements Task {
    private List<Utest_Data> data;

    public FillUserPassword(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillUserPassword theForm(List<Utest_Data> data) {
        return Tasks.instrumented(FillUserPassword.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(data.get(0).getStrPassword()).into(CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(TERMS),
                Click.on(PRIVACY),
                Click.on(COMPLETE_BTN)
        );
    }
}
