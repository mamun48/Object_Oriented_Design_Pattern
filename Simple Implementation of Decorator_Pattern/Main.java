
public class Main {
    public static void main(String[] args) {
        storeData(new CompressedCloudStream(new CloudStream()));

    }
    public static void storeData(Stream stream)
    {
        stream.write("Mamun hasan");
    }
    
}
