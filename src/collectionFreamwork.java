
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class collectionFreamwork {
    public static void main(String[] args){
        HashSet<String> hs= new HashSet<String>();
            hs.add("ahmet");
            hs.add("mehmet");
            hs.add("ramazan");
            hs.add("sedat");
            hs.add("sedat");

            //hashmapler tekrar eden veriye izin vermez
        System.out.println("hs"+hs);

        Iterator<String>iter=hs.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            System.out.println("iteration  " +str);
        }

        hs.remove("ahmet");
            if (hs.contains("ramazan")){
                System.out.println("ramazan hashsetin içinde");
            }
        //mapler farklı adreslerde aynı veriyi tutabılir fakat aynı adreslerde tutamazlar.
        //en son atanan veri ne ise onu tutar.
        Map<Integer,String> hm= new HashMap<Integer,String>();
            hm.put(1, "ali");
            hm.put(4, "veli");
            hm.put(56, "ali");
            hm.put(45, "ke");
            hm.put(7, "anıl");

            System.out.println("hm" +hm);

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        TreeSet<String> ts= new TreeSet<String>();
            ts.add("faruk");
            ts.add("ebubekir");
            ts.add("sıddık");
            ts.add("hasan");
            ts.add("murat");

        System.out.println("ts"+ts);

        Iterator<String>tsiter=hs.iterator();
        while(tsiter.hasNext()){
            String tstr = tsiter.next();
            System.out.println("iteration  " +tstr);
        }

        ts.remove("hasan");
        if (ts.contains("ramazan")){
            System.out.println("ramazan hashsetin içinde");
        }
        else{
            System.out.println("ramazan hashsetin içinde yok");
        }

        System.out.println("treesetin uzunluğu  "+ts.size());




    }
}
