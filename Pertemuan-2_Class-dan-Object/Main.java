public class Main{
    /**
     * 
     * Method main merupakan entry point dari setiap aplikasi yang kita jalankan
     * Pastikan untuk mendefiniskan method main pada class utama yang akan kita jalankan nantinya
     */
    public static void main(String[] args) {
        /**
         * Untuk membuat object, kita akan menggunakan keyword new kemudian diikuti oleh nama class yang akan kita buat objectnya
         * Object tersebut kita assign ke sebuah variable dimana type dari variable tersebut umumnya sama dengan nama dari class pembuat objectnya
         */
        Person person1 = new Person();
        Person person2 = new Person();

        /**
         * Disini kita membuat sebuah salinan dari person1
         */
        Person person3 = person1;

        person1.name = "Random";
        person2.name = "Bayu";
        person3.name = "Ayu";

        person1.iq = 200;

        System.out.println(person3.name);
        System.out.println(person2.name);
        
        /**
         * person1.name akan menghasilkan "Ayu" meskipun kita tidak mengatur namanya secara eksplisit.
         * Hal ini karena kita sebelumnya telah mengatur attribute name pada person3, dimana person1 dan person3 merujuk pada object yang sama 
         */
        System.out.println(person1.name);
        System.out.println(person1.getIq());
    }
}
