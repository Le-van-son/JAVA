package QuanLiXe;

public class QuanLiXeMay implements QuanLy<XeMay>{
    public XeMay xm [] = new XeMay[5];
    int size =0;

    public QuanLiXeMay() {
    }

    public QuanLiXeMay(String yamah, String black, String sh125, int i, int i1) {
    }

    @Override
    public void them(XeMay xeMay) {
        xm [size]=xeMay;
        size++;
    }

    @Override
    public void sua(String name, XeMay xeMay) {
        xm [timkiem(name)]=xeMay;

    }

    @Override
    public void xoa(String name) {
        for (int i = 0; i < size; i++) {
            xm[timkiem(name)]=null;
        }

    }

    @Override
    public int timkiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == xm[i].getTen()){
                return i;
            }
        }

        return -1;
    }

    @Override
    public void sapxep() {

    }

    @Override
    public void in() {
        for (int i = 0; i < size; i++) {
            System.out.println(xm[i]);
        }
        System.out.println("_____________________________________");
    }
}
