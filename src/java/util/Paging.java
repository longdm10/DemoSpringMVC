package util;

public class Paging {

    private String path;
    private int currentPage;
    private int previous;
    private int next;
    private int first;
    private int last;
    private int min;//bat dau ds trang hien thi
    private int max;//ket thuc ds trang hien thi

    //dinh nghia so dong hien thi
    private int tableRows;//dang bang
    private int indexRows;//dang title

    public Paging() {
        //Thiet dang dong
        this.tableRows = 10;
        this.indexRows = 5;
    }

    /**
     * @param path duong dan co dang
     * /Matrimony/countries/index/page/{pageNumber}.htm (pageNumber là place
     * holder)
     * @param currentPage
     * @param total tong so ban ghi trong csdl
     * @param tyle (1=dang bang, 2=dang title)
     */
    public Paging(String path, Integer currentPage, int total, int tyle) {
        this();
        this.path = path;
        if (currentPage == null) {
            this.currentPage = 1;
        } else {
            this.currentPage = currentPage;
        }
        //Thiết đặt thông số
        int rows = 0;
        if (tyle == 1) {
            rows = this.tableRows;
        } else {
            rows = this.indexRows;
        }
        this.setPaging(total, rows);
    }

    /**
     * Tao Danh sach trang
     *
     * @param total Tổng số bản ghi.
     * @param rows Số bản ghi được hiện thị mỗi lần
     */
    private void setPaging(int total, int rows) {
        //tổng số trang
        int count = total / rows;
        if (total % rows > 0) {
            count += 1;
        }
        if (count == 0)//truong hop khong co ban ghi nao trong database
        {
            count += 1;
        }
        //Số trang hiện thị trước và sau trang hiện tại.
        int ishow = 4;

        //đầu, trước, tiếp, cuối
        this.first = 1;
        this.previous = this.currentPage - 1;
        if (this.currentPage == 1) {
            this.first = -1;
            this.previous = -1;
        }
        this.next = this.currentPage + 1;
        this.last = count;
        if (this.currentPage == count) {
            this.next = -1;
            this.last = -1;
        }

        // max, min (so trang hien tren page)
        if (ishow * 2 + 1 >= count) {
            this.min = 1;
            this.max = count;
        } else {
            this.min = this.currentPage - ishow;
            this.max = this.currentPage + ishow;

            if (this.min <= 0 && this.max >= count) {
                this.min = 1;
                this.max = count;
            } else if (this.min <= 0 && this.max < count) {
                this.min = 1;
                this.max = this.min + (ishow * 2);
                if (this.max > count) {
                    this.max = count;
                }
            } else if (this.min > 0 && this.max >= count) {
                this.max = count;
                this.min = this.max - (ishow * 2);
                if (this.min <= 0) {
                    this.min = 1;
                }
            }
        }
    }

    /**
     * Tạo chuỗi html phân trang hiện trong view
     *
     * @return
     */
    public String getPaging() {
        String strResult;
        String strPath = this.path;
        //Tạo chuỗi phân trang
        strResult = "<p style='text-align: center'>";
        if (this.getFirst() == -1) {
            strResult += "    <span class='link-paging-left'>|&lt;</span>";
        } else {
            strResult += "    <a href='" + strPath.replace("{pageNumber}", String.valueOf(this.getFirst())) + "' class = 'link-paging'>|&lt;</a>";
        }
        if (this.getPrevious() == -1) {
            strResult += "    <span class='link-paging-left'>&lt;</span>";
        } else {
            strResult += "    <a href='" + strPath.replace("{pageNumber}", String.valueOf(this.getPrevious())) + "' class = 'link-paging'>&lt;</a>";
        }
        for (int i = this.getMin(); i <= this.getMax(); i++) {
            if (i == this.currentPage) {
                strResult += "    <span class='link-paging'>" + i + "</span>";
            } else {
                strResult += "    <a href='" + strPath.replace("{pageNumber}", String.valueOf(i)) + "' class = 'link-paging'>" + i + "</a>";
            }
        }
        if (this.getNext() == -1) {
            strResult += "    <span class='link-paging-right'>&gt;</span>";
        } else {
            strResult += "    <a href='" + strPath.replace("{pageNumber}", String.valueOf(this.getNext())) + "' class = 'link-paging'>&gt;</a>";
        }
        if (this.getLast() == -1) {
            strResult += "    <span class='link-paging-right'>&gt;|</span>";
        } else {
            strResult += "    <a href='" + strPath.replace("{pageNumber}", String.valueOf(this.getLast())) + "' class = 'link-paging'>&gt;|</a>";
        }
        strResult += "</p>";
        return strResult;
    }

    // <editor-fold defaultstate="collapsed" desc="properties">
    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @return the currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * @return the previous
     */
    public int getPrevious() {
        return previous;
    }

    /**
     * @return the next
     */
    public int getNext() {
        return next;
    }

    /**
     * @return the first
     */
    public int getFirst() {
        return first;
    }

    /**
     * @return the last
     */
    public int getLast() {
        return last;
    }

    /**
     * @return the min
     */
    public int getMin() {
        return min;
    }

    /**
     * @return the max
     */
    public int getMax() {
        return max;
    }

    // </editor-fold>
    /**
     * @return the table_rows
     */
    public int getTableRows() {
        return tableRows;
    }

    /**
     * @return the index_rows
     */
    public int getIndexRows() {
        return indexRows;
    }
}
