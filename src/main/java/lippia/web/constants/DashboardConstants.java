package lippia.web.constants;

public class DashboardConstants {
    public static final String PROFILE_BUTTON = "xpath://span[.='Ca']";
    public static final String LOGOUT_BUTTON = "xpath://a[@data-cy='logout']";
    //public static final String ACTIVE_BUTTON = "xpath://div[@class='cl-dropdown-toggle pointer cl-cut-text']";
    public static final String ACTIVE_BUTTON = "xpath://div[contains( text(), 'CarlosWS')]";
    //public static final String MANAGE_BUTTON = "xpath://a[@data-testid=\"manage-workspaces-link\"]";
    public static final String MANAGE_BUTTON = "xpath://a[contains( text(), 'Manage')]";
    public static final String PROJECT_BUTTON = "xpath://img[@alt=\"View Projects\"] ";
}
