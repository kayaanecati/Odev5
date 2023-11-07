import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /* 1-- UML nedir ? En yaygın kullanılan UML nedir?
        -UML, yazılım ve sistemlerin analiz, tasarım, ve belgelendirme süreçlerinde kullanılan standartlaştırılmış bir grafiksel modelleme dilidir.
        Bu dil, bir sistemi görsel olarak temsil etmek, tasarlamak, belgelemek ve iletişim kurmak için kullanılır.
        -En sık kullanılan UML diyagramı alt kategorisidir. Tüm nesne yönelimli yazılım sistemlerinin temel taşı, sınıf diyagramıdır. Kullanıcılar,
        bir sistemin sınıflarına ve özniteliklerine bakarak sistemin statik yapısını görselleştirebilir ve sınıflarının birbiriyle nasıl ilişkili
        olduğunu belirleyebilir.
        -

        2-- ArrayList, LinkedList, HashMap, HastSet farklarını ve kullanış amaçlarını belirtiniz
        -ArrayList: Verileri dinamik boyutta tutan bir dizidir. Bellekte ardışık olarak saklanır ve elemanlara endeks numarası üzerinden erişilir.
         Eleman ekleme ve silme işlemleri genellikle listenin sonunda yapıldığında daha hızlıdır.
         ArrayList, genellikle verilerin sık sık erişildiği ve değiştirilmediği durumlarda kullanılır.
        -LinkedList: Elemanları çift yönlü bağlı bir listede tutar. Her eleman, bir önceki ve bir sonraki elemana referans verir.
         LinkedList, sık sık eleman ekleme ve silme işlemleri yapılan durumlarda tercih edilebilir. Ancak, rastgele erişim veya sıralı erişim
         gerektiren durumlarda performansı düşük olabilir.
        -HashMap: Anahtar-değer eşlemesi üzerine kurulu bir veri yapısıdır. Anahtarlar benzersizdir ve her anahtar bir değere karşılık gelir.
         Genellikle performanslı arama, ekleme ve silme işlemleri gerektiğinde kullanılır. Anahtarlarına göre elemanlara erişmek için idealdir.
        -HashSet: Benzersiz elemanları tutan bir küme yapısıdır. Bir değer sadece bir kez bulunabilir, yani tekrarlayan elemanları içermez.
         Genellikle bir veri kümesinde yinelenen değerleri engellemek için kullanılır.
         */

        //Soru2
        Otel duja = new Otel("Duja");
        duja.addCustomer(1,"Necati", "Kaya",1343, 22 );
        duja.addCustomer(2,"Serhat", "Zorlu",1344, 23 );
        duja.addCustomer(3,"Bugra", "Güney",1345, 24 );
        duja.addReceptionist(4,"Dogukan", "Eren",1346, 25);
        duja.addAccounter( 5,"Cenk", "Sever",1347, 26);
        duja.addReservationist(6,"Samet", "Bilgin",1348, 27);
        duja.makeRes(1,6,4,"online");
        duja.makeRes(2,6,4,"phone");
        duja.makeRes(3,6,4,"phone");
        duja.deleteRes(0);
        duja.print(0);
        duja.print(1);
        duja.print(2);




        //Soru4
        String  myText = "HeLlO woRLd #123";
        System.out.println(changeCase(myText));



        // Soru5
        System.out.println(squeeze("Necati","ca"));







    }
        public static String changeCase(String text){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<text.length();i++){
            char gelenHarf = text.charAt(i);

            if(Character.isLowerCase(gelenHarf))
                stringBuilder.append(Character.toUpperCase(gelenHarf));
            else if (Character.isUpperCase(gelenHarf))
                stringBuilder.append(Character.toLowerCase(gelenHarf));

            else
                stringBuilder.append(gelenHarf);  // numara veya özel karaktere karşılık
        }
        return stringBuilder.toString();
    }

    public static String squeeze(String text1 ,String text2){

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<text1.length();i++){
            char gelenKarakter = text1.charAt(i);

            if(text2.indexOf(gelenKarakter)== -1){
                stringBuilder.append(gelenKarakter);
            }
                }


        return stringBuilder.toString();




    }
}


