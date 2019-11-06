import java.util.HashMap;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;


public class relationship {

    //Data Structure > Hashmap1 with Root Id as Key -> Mapped to ArrayList of Linked Ids
    //Utilize another Hashmap2 to store a list of Id and printed instead of storing each value repeatedly for each Id
    //Hashmap3 to store where the dependency Id was attached to in order to prevent looping through EntrySet. //2 -> 1, 3->1 

    //Process and store information as we reach through each text file instead of using one loop to store data and another to process/manipulate
    //Logic:
        //store orders into a HashMap2 with RootId as key and Mapped to the String name
            //(used when printing out and look up in constant time rather than storing name for each ID)
        //if the root Id does not exist in Key in Hashmap1 || Value in Hasahmap1
            //then store rootId has Key and map to new array with dependency_id as initial Id
        //else if rootId exist in Key in Hashmap1
            //then take arraylist at the value and add dependency_id to arraylist
        //else if rootId exists in Value in Hashmap1
            //then get 
        //else
        //Hashmap3.put(dependency, id) to overwrite newest link

    public static void main(String[] args) throws IOException {
        HashMap<String, ArrayList<String>> links = new HashMap<>();
        HashMap<String, String> nameList = new HashMap<>();
        HashMap<String, String> updatedLink = new HashMap<>();

        //store names from orders.txt file
        storeFiles("/input/orders.txt", nameList);
        
        createDependencies( "/input/dependencies.txt", links, updatedLink);
    }

    public static void storeFiles(String ordersFile, HashMap<String, String> list) throws IOException {
        Path path = Paths.get(ordersFile);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");

        //read line by line
        while(scanner.hasNextLine()){
            //process each line
            String[] line = scanner.nextLine().split(" ");
            list.put(line[0], line[1]);
        }
        scanner.close();
    }
    
    public static void createDependencies(String dependFiles, HashMap<String, ArrayList<String>> hm, HashMap<String, String> updated) throws IOException{
        //if the root Id does not exist in Key in Hashmap1 || Value in Hasahmap1
            //then store rootId has Key and map to new array with dependency_id as initial Id
        //else if rootId exist in Key in Hashmap1
            //then take arraylist at the value and add dependency_id to arraylist
        //else if rootId exists in Value in Hashmap1
            //then get 
        //else
        //Hashmap3.put(dependency, id) to overwrite newest link

        Path path = Paths.get(dependFiles);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");

        //read line by line
        while(scanner.hasNextLine()){
            //process each line
            String[] line = scanner.nextLine().split(" ");
            String rootId = line[0];
            String dependId = line[1];
            if(!hm.containsKey(rootId)){
                if()
            }
        }
        scanner.close();
    }

}
