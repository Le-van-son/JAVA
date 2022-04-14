package QuanLiXe;

public class Main {
    public static void main(String[] args) {
        QuanLiXeMay ql = new QuanLiXeMay();
        XeMay xm1 = new XeMay("yamah", "black", "Sh125", 86, 125);
        XeMay xm2 = new XeMay("yamah", "black", "R15", 80, 150);
        XeMay xm3 = new XeMay("yamah", "black", "z1000", 80, 150);
        XeMay xm4 = new XeMay("yamah", "black", "z8000", 80, 150);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.in();
        ql.timkiem("R15");
        ql.sua("R15",xm4);
        ql.in();
        ql.xoa("R1000");
    }
}
