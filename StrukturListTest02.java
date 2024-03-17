public class StrukturListTest02 {
	 public static void main(String[] args) {
         // 1. Create list dengan keyword new
         StrukturList myList = new StrukturList();
        System.out.println("LATIHAN 4");
       

        // 2. Tambah elemen sehingga elemen list berisi (7, 6, 4, 2, 3)
        myList.addTail(7);
        myList.addTail(6);
        myList.addTail(4);
        myList.addTail(2);
        myList.addTail(3);

        // 3. Tampilkan elemen list
        System.out.print("Elemen list: ");
        myList.displayElement();

        // 4. Tampilkan size elemen list
        System.out.println("Ukuran list: " + myList.size());
    }
}
