
public class CompressedCloudStream implements Stream{
    private Stream stream;
    public CompressedCloudStream(Stream stream)
    {
        this.stream = stream;

    }
    public void write(String data)
    {
        var compressed = compress(data);
        stream.write(compressed);

    }
    public String compress(String data)
    {
        return data.substring(0,5);
    }
    
}
