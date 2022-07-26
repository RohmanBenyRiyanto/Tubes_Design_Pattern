public class SingleObject {

    //Membuat Objek Tunggal
    private static SingleObject instance = new SingleObject();
    /*jadikan konstruktor privat sehingga kelas ini tidak bisa
    diinstansiasi lain*/
    private SingleObject(){}

    //Mendapatkan satu-satunya objek yang tersedia
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(String s){
        System.out.println(s+" terdeteksi");
    }
}