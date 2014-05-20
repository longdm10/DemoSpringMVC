package util;

import java.util.ArrayList;
import java.util.List;

public class Gender {

    private byte _male;
    private String _maleString;

    private byte _female;
    private String _femaleString;

    public Gender() {
        this._male = 1;
        this._maleString = "Male";
        this._female = 2;
        this._femaleString = "Female";
    }

    /**
     * Lay ten cua gender
     *
     * @param gender
     * @return
     */
    public String getGender(byte gender) {
        String strGender = "";
        if (this.getMale() == gender) {
            strGender = this.getMaleString();
        } else if (this.getFemale() == gender) {
            strGender = this.getFemaleString();
        }
        return strGender;
    }

    /**
     * Tao danh sach items cho select list (su dung trong view), chi co 2 trang
     * thai Male va Female
     *
     * @return
     */
    public List<selectItem> getListSelect() {
        List<selectItem> selectList = new ArrayList<selectItem>();
        selectItem item = new selectItem("0", "--- Select ---");
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getMale()), this.getMaleString());
        selectList.add(item);
        item = new selectItem(String.valueOf(this.getFemale()), this.getFemaleString());
        selectList.add(item);
        return selectList;
    }

    /**
     * @return the _male
     */
    public byte getMale() {
        return _male;
    }

    /**
     * @return the _maleString
     */
    public String getMaleString() {
        return _maleString;
    }

    /**
     * @return the _female
     */
    public byte getFemale() {
        return _female;
    }

    /**
     * @return the _femaleString
     */
    public String getFemaleString() {
        return _femaleString;
    }

}
