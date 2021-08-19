public class Metaspace {
    static javassist.ClassPool cp = javassist.ClassPool.getDefault();

    public static void main(String[] args) throws Exception{
        // javac -cp "경로\javassist-3.27.0-GA.jar"; Metaspace.java
        // java -cp "경로\javassist-3.27.0-GA.jar"; -XX:MaxMetaspaceSize=256m Metaspace

        // javassist.CannotCompileException: by java.lang.ClassFormatError: Metaspace 발생
        for(int i = 0; ; i++){
            Class c = cp.makeClass("GGenerated"+i).toClass();
        }
    }
}
