package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;
import org.openqa.selenium.Point;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TrackerService extends ActionManager {
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static String setTimeEntryDescription() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        String timeEntryDesc = "Entry_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        WebActionManager.waitPresence(TrackerConstants.NAME_INPUT);
        WebActionManager.getElement(TrackerConstants.NAME_INPUT).click();
        WebActionManager.setInput(TrackerConstants.NAME_INPUT,timeEntryDesc);
        return timeEntryDesc;
    }

    public static void clickOnTempOption() {
        esperar(3);
        WebActionManager.waitPresence(TrackerConstants.TEMPORIZADOR_OPTION);
        WebActionManager.getElement(TrackerConstants.TEMPORIZADOR_OPTION).click();
    }

    public static void clickOnManualOption() {
        esperar(3);
        WebActionManager.waitPresence(TrackerConstants.MANUAL_OPTION);
        WebActionManager.getElement(TrackerConstants.MANUAL_OPTION).click();
    }

    public static void setTimeEntry(String timeIn, String timeOut, String day) {
        esperar(3);
        WebActionManager.getElement(TrackerConstants.HORAINI_INPUT).click();
        WebActionManager.setInput(TrackerConstants.HORAINI_INPUT, timeIn);
        WebActionManager.getElement(TrackerConstants.HORAFIN_INPUT).click();
        WebActionManager.setInput(TrackerConstants.HORAFIN_INPUT, timeOut);
        WebActionManager.getElement(TrackerConstants.FECHA_INPUT).click();
        WebActionManager.setInput(TrackerConstants.FECHA_INPUT, day);
    }

    public static void clickOnInitButton() {
        esperar(3);
        WebActionManager.waitPresence(TrackerConstants.INIT_BUTTON);
        WebActionManager.getElement(TrackerConstants.INIT_BUTTON).click();
        //System.out.println("Pasó por  clickManageButton");
    }

    public static void clickOnStopButton() {
        esperar(5);
        WebActionManager.waitPresence(TrackerConstants.STOP_BUTTON);
        WebActionManager.getElement(TrackerConstants.STOP_BUTTON).click();
    }
    public static void testCreatedTimeEntry(String descTimeEntry) {
        esperar(10);
        try {
            String TAREA = "xpath://div[contains( text(),'" + descTimeEntry + "')]";
            Point Location = WebActionManager.getElement(TAREA).getLocation();
            System.out.println("La nueva tarea Se registró correctamente: " + descTimeEntry);
        } catch (Exception e) {
            System.out.println("No se registró la nueva tarea ... Error: " + e.getMessage());
        }
    }

    public static void clickManageButton() {
        esperar(5);
        WebActionManager.getElement(TrackerConstants.MANAGE_BUTTON).click();
        //System.out.println("Pasó por  clickManageButton");
    }

    public static void clickDiscardOption() {
        esperar(5);
        WebActionManager.waitPresence(TrackerConstants.DISCARD_OPTION);
        WebActionManager.getElement(TrackerConstants.DISCARD_OPTION).click();
        //System.out.println("Pasó por  clickDiscardOption");
    }

    public static void clickDiscardButton() {
        esperar(5);
        WebActionManager.waitPresence(TrackerConstants.DISCARD_BUTTON);
        WebActionManager.getElement(TrackerConstants.DISCARD_BUTTON).click();
        //System.out.println("Pasó por  clickDiscardButton");
    }
}
