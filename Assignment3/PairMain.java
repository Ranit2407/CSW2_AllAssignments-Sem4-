public class PairMain {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1 = new Pair<>(1,2);
        System.out.println(p1.getKey()+" "+p1.getValue());
    }
}
class Pair<K,V>{

    private K key;
    private V value;
    Pair(K key,V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}