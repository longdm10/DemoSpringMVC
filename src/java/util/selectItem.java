package util;

public class selectItem {
    private String _Value;
    private String _Label;

    public selectItem() {
    }

    public selectItem(String _Value, String _Label) {
        this._Value = _Value;
        this._Label = _Label;
    }

    /**
     * @return the _Value
     */
    public String getValue() {
        return _Value;
    }

    /**
     * @param _Value the _Value to set
     */
    public void setValue(String _Value) {
        this._Value = _Value;
    }

    /**
     * @return the _Label
     */
    public String getLabel() {
        return _Label;
    }

    /**
     * @param _Label the _Label to set
     */
    public void setLabel(String _Label) {
        this._Label = _Label;
    }

}
