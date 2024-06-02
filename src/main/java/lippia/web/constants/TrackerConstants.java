package lippia.web.constants;

public class TrackerConstants {
    public static final String NAME_INPUT = "xpath://input[@name=\"autocomplete-input\"]";
    public static final String INIT_BUTTON = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";
    public static final String STOP_BUTTON = "xpath://button[@class='cl-btn cl-btn-danger cl-d-none cl-d-lg-custom-block']";
    public static final String MANAGE_BUTTON = "xpath://img[@class=\"cl-px-2\"]";
    public static final String DISCARD_OPTION = "xpath://a[contains( text(), 'Discard')]";
    public static final String DISCARD_BUTTON = "xpath://button[contains( text(), 'Discard')]";
    public static final String MANUAL_OPTION = "xpath://img[@alt='Add time manually not selected']";
    public static final String TEMPORIZADOR_OPTION = "xpath://img[@alt='Track time using timer selected']";
    public static final String HORAINI_INPUT = "xpath:(//input[@autocomplete='off'])[2]";
    public static final String HORAFIN_INPUT = "xpath:(//input[@autocomplete='off'])[3]";
    public static final String FECHA_INPUT = "xpath:(//input[@autocomplete='off'])[4]";
}