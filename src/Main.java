public class Main {
    public static void main(String[] args) {
          /*
    Написать следующие лямбды используя наши интерфейсы
    1. сложить строки a и  b
    2.есть строка, если ее длина равна 3 вернуть true  иначе  false
    3.Есть строка string распечатать ее в виде !string!
     */
        StringConcate stringConcate=(a,b)-> (Integer.toString(a)+Integer.toString(b));
        System.out.println(stringConcate.concat(12,12));
        //1212

        Checkable checkable=(a)->a.length()==3;
        System.out.println(checkable.check("hand"));//false
        System.out.println(checkable.check("cow"));//true

Printable printable=(a)-> System.out.println("!"+a+"!");
        printable.print("string");
        //!string!


    }
}
