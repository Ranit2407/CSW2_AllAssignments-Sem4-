package sem_4_Assignments.Assignment_3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    private String plotNum;
    private String at;
    private String post;

    public Address(String plotNum, String at, String post) {
        this.plotNum = plotNum;
        this.at = at;
        this.post = post;
    }

    // Getter and Setter methods
    public String getPlotNo() {
        return plotNum;
    }

    public void setPlotNo(String plotNum) {
        this.plotNum = plotNum;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Plot No: " + plotNum + ", At: " + at + ", Post: " + post;
    }
}

public class TreeMapAddress {
    public static void main(String[] args) {
        // Create a TreeMap with keys as names of persons and values as addresses
        TreeMap<String, Address> addressMap = new TreeMap<>();

        // Insert required key-value pairs
        addressMap.put("John", new Address("A-101", "Main Street", "City1"));
        addressMap.put("Alice", new Address("B-202", "Park Avenue", "City2"));
        addressMap.put("Bob", new Address("C-303", "Downtown", "City3"));

        // Use an iterator to display the TreeMap
        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        System.out.println("TreeMap contents:");
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}
