package QuanLiXe;

public class Oto extends PhuongTien {
    private int socho;
    public Oto(){

    }

    public Oto(int socho) {
        this.socho = socho;
    }

    public Oto(String hang, String mau, String ten, double gia, int socho) {
        super(hang, mau, ten, gia);
        this.socho = socho;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }
}
