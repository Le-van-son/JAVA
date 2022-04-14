package QuanLiXe;

public interface QuanLy<T>{
    public void them(T t );
    public void sua(String name, T t);
    public void xoa(String name);
    int timkiem(String name);
    public void sapxep();
    void in();
}
