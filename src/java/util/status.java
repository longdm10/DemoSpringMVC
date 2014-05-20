package util;

import java.util.ArrayList;
import java.util.List;

public class status {

    private byte _active;
    private String _activeString;

    private byte _deactive;
    private String _deactiveString;

    private byte _lock;
    private String _lockString;

    public status() {
        this._active = 1;
        this._activeString = "Active";
        this._deactive = 2;
        this._deactiveString = "Deactive";
        this._deactive = 2;
        this._lockString = "Lock";
    }

    /**
     * Lay ten cua status
     *
     * @param status
     * @return
     */
    public String getStatus(byte status) {
        String strStatus = "";
        if (this.getActive() == status) {
            strStatus = this.getActiveString();
        } else if (this.getDeactive() == status) {
            strStatus = this.getDeactiveString();
        } else if (this.getLock() == status) {
            strStatus = this.getLockString();
        }
        return strStatus;
    }

    /**
     * Tao danh sach items cho select list (su dung trong view), chi co 2 trang
     * thai Active va Deactive
     *
     * @return
     */
    public List<selectItem> getListSelect() {
        List<selectItem> selectList = new ArrayList<selectItem>();
        selectItem item = new selectItem("0", "--- Select ---");
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getActive()), this.getActiveString());
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getDeactive()), this.getDeactiveString());
        selectList.add(item);
        return selectList;
    }

    /**
     * Tao danh sach items cho select list (su dung trong view), co 3 trang thai
     * Active, Deactive và Lock.
     *
     * @return
     */
    public List<selectItem> getListSelectForAccount() {
        List<selectItem> selectList = new ArrayList<selectItem>();
        selectItem item = new selectItem("0", "--- Select ---");
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getActive()), this.getActiveString());
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getDeactive()), this.getDeactiveString());
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getLock()), this.getLockString());
        selectList.add(item);
        return selectList;
    }

    /**
     * @return the _active
     */
    public byte getActive() {
        return _active;
    }

    /**
     * @return the _activeString
     */
    public String getActiveString() {
        return _activeString;
    }

    /**
     * @return the _deactive
     */
    public byte getDeactive() {
        return _deactive;
    }

    /**
     * @return the _deactiveString
     */
    public String getDeactiveString() {
        return _deactiveString;
    }

    /**
     * @return the _lock
     */
    public byte getLock() {
        return _lock;
    }

    /**
     * @return the _lockString
     */
    public String getLockString() {
        return _lockString;
    }

}
