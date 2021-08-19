public class JavaHeapSpace {
    public static void main(String[] args) {
        //java -Xmx256m JavaHeapSpace
        try{
            int[] arr = new int[100000 * 100000]; // 400MB
        }catch (Exception e){
            // JVM 옵션으로 최대 힙이 256MB 이므로 400MB 의 배열을 할당하면
            // OutOfMemoryError: Java heap space 가 발생한다.
            e.printStackTrace();
        }
    }
}
