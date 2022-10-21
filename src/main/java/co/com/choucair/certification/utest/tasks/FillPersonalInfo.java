package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.Utest_Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.UtestPersonalInfo.*;

public class FillPersonalInfo implements Task {

    private List<Utest_Data> data;

    public FillPersonalInfo(List<Utest_Data> data) {
        this.data = data;
    }

    public static FillPersonalInfo theForm(List<Utest_Data> data) {
        return Tasks.instrumented(FillPersonalInfo.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getStrFirstName()).into(FIRST_NAME),
                Enter.theValue(data.get(0).getStrLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthMonth()).from(BIRTH_M),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthDay()).from(BIRTH_D),
                SelectFromOptions.byVisibleText(data.get(0).getStrBirthYear()).from(BIRTH_Y),
                Click.on(NEXT_BTN)
        );

    }
}
