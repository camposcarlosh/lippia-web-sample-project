package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainService extends ActionManager {
    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static String getDescription(String tipoNombre) {
        String nombre;
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        switch (tipoNombre) {
            case "new": {
                nombre = "Entry_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            case "update": {
                nombre = "UpdateDescription_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            case "project": {
                nombre = "Project_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            case "tag": {
                nombre = "Tag_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
                break;
            }
            default: {
                nombre = "TimeEntry_" + fechaHoraActual.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            }
        }
        return nombre;
    }
}
