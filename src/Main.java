import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = in.nextLine();

        //работа с текстом(задание 6)
        String[] words1 = text.split(" ");
        String[] words;

        char[] result = words1[0].toCharArray();
        char[] echo= "echo".toCharArray();

        if(result.length==4 && result[0] == echo[0] && result[1] == echo[1] && result[2] == echo[2] && result[3] == echo[3]){

                words = new String[words1.length - 2];
                words[0] = "";

                for (int j = 1; j < words1.length - 2; j++) {
                    words[j] = words1[j];
                }

                words[1] = words[1].substring(1);

                String hgf = words[words.length - 1];
                words[words.length - 1] = hgf.substring(0, hgf.length() - 1);

        }else {
          words = new String[words1.length];
            for (int p=0;p< words1.length;p++ ){
                words[p] = words1[p];
            }
        }


        System.out.println();
        System.out.println("Задание 1");
        System.out.println("Результат:");

        for (int i=1; i<words.length; i++)
        {
            System.out.println(words[i]);
        }

        System.out.println();
        System.out.println("Задание 2");
        System.out.println("Результат:");

        String mass[] = new String[words.length-1];
        for (int i = 1; i < words.length; i++) {
            mass[i-1]= words[i];
        }

        Arrays.sort(mass);
        for (int f = 0; f < mass.length; f++) {
            System.out.println(mass[f] + "  ");

        }

        System.out.println();
        System.out.println("Задание 3");
        System.out.println("Результат:");

        for (int i = 1; i < words.length; i++) {
            mass[i-1]= words[i];
        }

        Arrays.sort(mass);

        for (int f = 0; f < mass.length; f++) {
            char[] t1 = mass[f].toCharArray();

            for (int g = f+1; g < mass.length; g++) {
                char[] t2 = mass[g].toCharArray();

                if (t1.length == t2.length) {
                    int qer = 0;
                    for (int ss = 0; ss < t1.length; ss++) {
                        if (t1[ss] == t2[ss]) {
                            qer++;
                        }
                    }

                    if (qer == t1.length) {
                        mass[g] = "";
                    }
                }
            }
        }

        for (int h = 0; h < mass.length; h++) {
            if (mass[h]!=""){
                System.out.println(mass[h]);
            }
        }

        System.out.println();
        System.out.println("Задание 4");
        System.out.println("Результат:");

        for (int i = 1; i < words.length; i++) {
            mass[i-1]= words[i]+" 1";
        }

        Arrays.sort(mass);

        for (int f = 0; f < mass.length; f++) {
            char[] t1 = mass[f].toCharArray();
            int koll = 1;

            for (int g = f+1; g < mass.length; g++) {
                char[] t2 = mass[g].toCharArray();

                if (t1.length == t2.length) {
                    int qer = 0;
                    for (int ss = 0; ss < t1.length; ss++) {
                        if (t1[ss] == t2[ss]) {
                            qer++;
                        }
                    }
                    if (qer == t1.length) {
                        mass[g] = "";
                        koll++;
                    }
                }
            }

            if (mass[f]!=""){
                mass[f] = mass[f].substring(0, mass[f].length() - 1) +koll;
            }
        }

        for (int h = 0; h < mass.length; h++) {
            if (mass[h]!=""){
                System.out.println(mass[h]);
            }
        }

        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Результат:");

        int max_koll= 1;

        for (int i = 1; i < words.length; i++) {
            mass[i-1]= words[i]+" 1";
        }

        Arrays.sort(mass);

        for (int f = 0; f < mass.length; f++) {
            char[] t1 = mass[f].toCharArray();
            int koll = 1;

            for (int g = f+1; g < mass.length; g++) {
                char[] t2 = mass[g].toCharArray();

                if (t1.length == t2.length) {
                    int qer = 0;
                    for (int ss = 0; ss < t1.length; ss++) {
                        if (t1[ss] == t2[ss]) {
                            qer++;
                        }
                    }

                    if (qer == t1.length) {
                        mass[g] = "";
                        koll++;

                        if (max_koll < koll){
                            max_koll= koll;
                        }
                    }
                }
            }

            if (mass[f]!=""){
                mass[f] = mass[f].substring(0, mass[f].length() - 1) +koll;
            }
        }

        for (int k=max_koll ; k != 0; k--) {
            ArrayList<String> list = new ArrayList<String>();
            list.clear();

            int cifr=0;

            for (int l = 0; l < mass.length; l++) {
                String [] inf =  mass[l].split("");

                if (inf.length!=0 && inf[inf.length-1]!="" ){

                    Integer ad1 =  Integer.valueOf(k);
                    Integer ad = Integer.valueOf(inf[inf.length-1]);

                    if ( ad1 == ad) {
                        cifr++;
                        list.add(mass[l]);
                    }
                }
            }

            if (cifr>1){
                Collections.sort (list);
                for (String word:list) {
                    System.out.println(word);
                }

            }else
            if (cifr==1){
                for (String word:list) {
                    System.out.println(word);
                }
            }
        }

    }
}
