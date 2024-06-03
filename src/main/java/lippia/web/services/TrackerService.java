package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LandingConstants;
import lippia.web.constants.TrackerConstants;
import org.openqa.selenium.Point;
import org.testng.Assert;



public class TrackerService extends ActionManager {
    public static void setTimeEntryDescription(String nombre) {
        WebActionManager.waitPresence(TrackerConstants.NAME_INPUT);
        WebActionManager.getElement(TrackerConstants.NAME_INPUT).click();
        WebActionManager.setInput(TrackerConstants.NAME_INPUT,nombre);
    }

    public static void clickOnTempOption() {
        MainService.esperar(3);
        WebActionManager.waitPresence(TrackerConstants.TEMPORIZADOR_OPTION);
        WebActionManager.getElement(TrackerConstants.TEMPORIZADOR_OPTION).click();
    }

    public static void clickOnManualOption() {
        MainService.esperar(3);
        WebActionManager.waitPresence(TrackerConstants.MANUAL_OPTION);
        WebActionManager.getElement(TrackerConstants.MANUAL_OPTION).click();
    }

    public static void setTimeEntry(String timeIn, String timeOut, String day) {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.HORAINI_INPUT).click();
        WebActionManager.setInput(TrackerConstants.HORAINI_INPUT, timeIn);
        WebActionManager.getElement(TrackerConstants.HORAFIN_INPUT).click();
        WebActionManager.setInput(TrackerConstants.HORAFIN_INPUT, timeOut);
        WebActionManager.getElement(TrackerConstants.FECHA_INPUT).click();
        WebActionManager.setInput(TrackerConstants.FECHA_INPUT, day);
    }

    public static void clickOnInitButton() {
        MainService.esperar(3);
        WebActionManager.waitPresence(TrackerConstants.INIT_BUTTON);
        WebActionManager.getElement(TrackerConstants.INIT_BUTTON).click();
    }

    public static void clickOnStopButton() {
        MainService.esperar(5);
        WebActionManager.waitPresence(TrackerConstants.STOP_BUTTON);
        WebActionManager.getElement(TrackerConstants.STOP_BUTTON).click();
    }
    public static void testCreatedTimeEntry(String existe, String descTimeEntry) {
        MainService.esperar(5);
        boolean encuentra = false;
        try {
            String TAREA = "xpath://div[contains( text(),'" + descTimeEntry + "')]";
            Point Location = WebActionManager.getElement(TAREA).getLocation();
            encuentra = true;
            System.out.println("Se encontró la tarea: " + descTimeEntry + " en la grilla");
        } catch (Exception e) {
            System.out.println("No se encontró la tarea ... Error: " + e.getMessage());
        }
        switch (existe) {
            case "SI": {
                Assert.assertTrue(encuentra);
                System.out.println("assertTrue: " + encuentra);
                break;
            }
            case "NO": {
                Assert.assertFalse(encuentra);
                System.out.println("assertFalse: " + encuentra);
                break;
            }
            default: {
                encuentra = false;
                Assert.assertTrue(encuentra);
                break;
            }
        }
    }

    public static void clickManageButton() {
        MainService.esperar(5);
        WebActionManager.getElement(TrackerConstants.MANAGE_BUTTON).click();
    }

    public static void clickDiscardOption() {
        MainService.esperar(5);
        WebActionManager.waitPresence(TrackerConstants.DISCARD_OPTION);
        WebActionManager.getElement(TrackerConstants.DISCARD_OPTION).click();
    }

    public static void clickDiscardButton() {
        MainService.esperar(5);
        WebActionManager.waitPresence(TrackerConstants.DISCARD_BUTTON);
        WebActionManager.getElement(TrackerConstants.DISCARD_BUTTON).click();
    }

    public static void updateTimeEntryDescription(String nombre) {
        MainService.esperar(3);
        WebActionManager.waitPresence(TrackerConstants.DESCRIPT_GRILLA);
        WebActionManager.getElement(TrackerConstants.DESCRIPT_GRILLA).clear();
        WebActionManager.getElement(TrackerConstants.DESCRIPT_GRILLA).click();
        WebActionManager.setInput(TrackerConstants.DESCRIPT_GRILLA,nombre);
        WebActionManager.getElement(LandingConstants.TRACK_BUTTON).click();
    }

    public static void clickOnProjectOption() {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.PROJECT_OPTION).click();
    }

    public static void setNewProject(String nombre) {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.PROJECT_INPUT).click();
        WebActionManager.setInput(TrackerConstants.PROJECT_INPUT,nombre);
    }

    public static void clickOnAsociateProject() {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.PROJECT_CREATE).click();
    }

    public static void clickOnTagOption() {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.TAG_OPTION).click();
    }

    public static void setNewTag(String nombre) {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.TAG_INPUT).click();
        WebActionManager.setInput(TrackerConstants.TAG_INPUT,nombre);
    }

    public static void clickOnAsociateTag() {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.TAG_CREATE).click();
    }

    public static void setBillable() {
        MainService.esperar(3);
        WebActionManager.getElement(TrackerConstants.FACTURABLE_GRILLA).click();
    }

    public static void updateDataEntry(String timeIn, String timeOut) {
        WebActionManager.getElement(TrackerConstants.HORAINI_GRILLA).click();
        WebActionManager.setInput(TrackerConstants.HORAINI_GRILLA, timeIn);
        WebActionManager.getElement(TrackerConstants.HORAFIN_GRILLA).click();
        WebActionManager.setInput(TrackerConstants.HORAFIN_GRILLA, timeOut);
        WebActionManager.getElement(LandingConstants.TRACK_BUTTON).click();
    }
}
