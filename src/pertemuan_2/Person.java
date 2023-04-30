package pertemuan_2;

/**
 * Berikut merupakan contoh pendefinisian class.
 * Secara umum, kita membuat class dengan struktur seperti berikut
 * <access modifier> class <nama class>
 * Access modifier pada class dapat berupa public yakni dapat diakses dari mana
 * saja dari project kita, ataupun jika tidak dituliskan secara eksplisit maka
 * access modifiernya adalah default
 * Perhatikan bahwa nama class mengikuti pola penulisan PascalCase (sederhananya
 * setiap huruf pertama dalam kata diberi huruf kapital)
 */
public class Person {
    String name; // attribute
    int umur; // attribute
    int iq; // attribute

    /**
     * Dibawah ini merupakan contoh dari method
     * Method dibawah ini memiliki access modifier yaitu public yang mana kita dapat
     * mengakses method tersebut dimanapun dalam project kita
     * Method dibawah memiliki return type void artinya method tersebut tidak
     * mengembalikan nilai
     * Secara umum, pembuatan method mengikuti pola berikut
     * <modifier> <return type> <nama method>
     * Modifier dapat berupa access modifier dan non-access modifier
     */
    public void berjalan() {
        System.out.println("Sedang berjalan");
    }

    /**
     * 
     * Dibawah ini merupakan contoh method yang memiliki return type berupa int
     * Karena memiliki return type int, maka kita harus memastikan bahwa kita selalu
     * mengembalikan nilai int pada method tersebut.
     * Secara default, jika kita tidak mendefenisikan access_modifier, maka method
     * tersebut akan memiliki access modifier default.
     * Penjelasan lebih lengkapnya tentang access modifier tersebut akan dijelaskan
     * pada pertemuan-pertemuan berikutnya
     */
    int getIq() {
        return iq;
    }
}
