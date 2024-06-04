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
    public static final String DESCRIPT_GRILLA = "xpath:(//input[@type='text'])[2]";
    public static final String HORAINI_GRILLA = "xpath:(//input[@autocomplete='off'])[3]";
    public static final String HORAFIN_GRILLA = "xpath:(//input[@autocomplete='off'])[4]";
    public static final String FACTURABLE_GRILLA = "xpath:(//span[contains(.,'$')])[2]";
    public static final String PROJECT_OPTION = "xpath:(//img[@alt='assets/ui-icons/plus-blue.svg'])[2]";
    public static final String PROJECT_INPUT = "xpath://input[@placeholder='Search project or client']";
    public static final String PROJECT_CREATE = "xpath://a[@class='cl-text-break']";
    public static final String TAG_OPTION = "xpath:(//img[@class='tag-icon'])[2]";
    public static final String TAG_INPUT = "xpath://input[@placeholder='Add/Search tags']";
    public static final String TAG_CREATE = "xpath://a[@class='cl-color-blue']";
    public static final String TAREA_VARIABLE = "xpath://div[contains(text(),'%s')]";
}