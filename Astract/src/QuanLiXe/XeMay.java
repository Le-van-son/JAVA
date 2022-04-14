package QuanLiXe;

public class XeMay extends PhuongTien {
    int dungtich;

    public XeMay() {
    }

    public XeMay(int dungtich) {
        this.dungtich = dungtich;
    }

    public XeMay(String hang, String mau, String ten, double gia, int dungtich) {
        super(hang, mau, ten, gia);
        this.dungtich = dungtich;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "hang='"  + getHang() +
                ", mau='"  + getMau() +
                ", ten='"  + getTen() +
                ", gia="  + getGia() +
                ", dungtich=" + getDungtich() +
                '}';
    }
}
