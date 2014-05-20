package util;

public class ViewPath {
    private String _guestLayout;
    private String _userLayout;
    private String _adminLayout;

    public ViewPath() {
        this._guestLayout = "share/layout_guest";
        this._userLayout = "share/layout_user";
        this._adminLayout = "share/layout_admin";
    }

    /**
     * @return the _guestLayout
     */
    public String getGuestLayout() {
        return _guestLayout;
    }

    /**
     * @return the _userLayout
     */
    public String getUserLayout() {
        return _userLayout;
    }

    /**
     * @return the _adminLayout
     */
    public String getAdminLayout() {
        return _adminLayout;
    }
}
