public class Mahasiswa<T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 kelas;
    
    public void setNim(T1 nim) {
        this.nim = nim;
    }
    
    public void setName(T2 name) {
        this.name = name;
    }
    
    public void setClass(T3 kelas) {
        this.kelas = kelas;
    }
    
    public T1 getNim() {
        return nim;
    }
    
    public T2 getName() {
        return name;
    }
    
    public T3 getClassStudent() {
        return kelas;
    }
}