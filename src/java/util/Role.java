package util;

public class Role {

    private final int _admin;
    private final int _user;
    private final int _guest;

    private final String _adminString;
    private final String _userString;
    private final String _guestString;

    public Role() {
        this._admin = 1;
        this._user = 2;
        this._guest = 3;
        this._adminString = "Admin";
        this._userString = "User";
        this._guestString = "Guest";
    }

    /**
     * @return the _admin
     */
    public int getAdmin() {
        return _admin;
    }

    /**
     * @return the _user
     */
    public int getUser() {
        return _user;
    }

    /**
     * @return the _guest
     */
    public int getGuest() {
        return _guest;
    }

    /**
     * @return the _adminString
     */
    public String getAdminString() {
        return _adminString;
    }

    /**
     * @return the _userString
     */
    public String getUserString() {
        return _userString;
    }

    /**
     * @return the _guestString
     */
    public String getGuestString() {
        return _guestString;
    }

}
