import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.text.Collator;
import java.util.*;

public class Application {

    public static void main(String[] args) {
        try {
            List<String> ListsName = new ArrayList<String>();
            Gson gson = new GsonBuilder().create();
            Stock stock = gson.fromJson(new FileReader("./stock.json"),Stock.class);
            for (Stock item: stock.stock){
                System.out.println("-------------");
                ListsName.add(item.name);
                System.out.println(item.id);
                System.out.println(item.price);
                System.out.println(item.count);
                System.out.println(item.onShelf);
                System.out.println("-------------");
            }
            ListsName.sort(Comparator.naturalOrder());
            System.out.println(ListsName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
