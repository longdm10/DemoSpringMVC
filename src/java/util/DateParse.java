package util;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateParse {

    /**
     * Lay ngay thang hien tai
     *
     * @return Date
     */
    public static Date getCurrentDate() {
        Date todayD = new Date(System.currentTimeMillis());
        return todayD;
    }

    /**
     * Lay ngay thang hien tai
     *
     * @return String dd/MM/yyyy
     * @throws ParseException
     */
    public static String getCurrentDateString() throws ParseException {
        Date todayD = new Date(System.currentTimeMillis());
        SimpleDateFormat dayFormat = new SimpleDateFormat("dd/MM/yyyy");
        String todayS = dayFormat.format(todayD.getTime());
        return todayS;
    }

    /**
     * Lay ngay thang hien tai
     *
     * @return String MM/dd/yyyy
     * @throws ParseException
     */
    public static String getCurrentDateString2() throws ParseException {
        Date todayD = new Date(System.currentTimeMillis());
        SimpleDateFormat dayFormat = new SimpleDateFormat("MM/dd/yyyy");
        String todayS = dayFormat.format(todayD.getTime());
        return todayS;
    }

    /**
     * Lay ngay thang hien tai
     *
     * @return String yyyy/MM/dd
     * @throws ParseException
     */
    public static String getCurrentDateString3() throws ParseException {
        Date todayD = new Date(System.currentTimeMillis());
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy/MM/dd");
        String todayS = dayFormat.format(todayD.getTime());
        return todayS;
    }

    /**
     * Lây chuỗi ngày tháng
     *
     * @param dateString có dạng MM/dd/yyyy
     * @return yyyy/MM/dd
     * @throws java.text.ParseException
     */
    public static String getDateToString(String dateString) throws ParseException {
        String strDate = dateString;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date convertedDate = dateFormat.parse(dateString);
        dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        strDate = dateFormat.format(convertedDate);
        return strDate;
    }

    /**
     * Chuyen ngay thang sang chuoi
     *
     * @param date
     * @return string MM/dd/yyyy
     * @throws java.text.ParseException
     */
    public static String getDateString(Date date) throws ParseException {
        String strDate = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        strDate = dateFormat.format(date);
        return strDate;
    }

    /**
     * Lây ngày tháng từ chuỗi
     *
     * @param dateString có dạng MM/dd/yyyy
     * @return Date
     */
    public static Date getDateToDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date convertedDate = dateFormat.parse(dateString);
        return convertedDate;
    }

    /**
     * loai bo gio.
     *
     * @param date
     * @return Date
     */
    public static Date getDateToDate(Date date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = dateFormat.format(date);
        return dateFormat.parse(dateString);
    }

    /**
     * Chuyen ngay thang sang chuoi
     *
     * @param date
     * @return Chuỗi có dạng yyyy/MM/dd
     * @throws ParseException
     */
    public static String getDateToString(Date date) throws ParseException {
        String strDate = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        strDate = dateFormat.format(date);
        return strDate;
    }
}
