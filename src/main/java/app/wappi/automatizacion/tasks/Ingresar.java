package app.wappi.automatizacion.tasks;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ingresar implements Task {
    private Map<String, String> personalData;

    public Ingresar(DataTable data) {
        List<Map<String, String>> aux = data.asMaps(String.class, String.class);
        personalData = new HashMap<String, String>();
        for (Map<String, String> rows : aux) {
            personalData.putAll(rows);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue(personalData.get("Email")).into(AccessForm.INP_EMAIL),
                // Enter.theValue(personalData.get("Name")).into(AccessForm.INP_NAME),

        );
    }

    public static Ingresar usuarioYContrasena(DataTable personalData) {
        return Tasks.instrumented(Ingresar.class, personalData);
    }
}