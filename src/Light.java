public class Light extends TechObjects{
    private String name;
    private TechStatus status;
    private TechLocation location;
    private String serialNum;

    public Light(String name, TechStatus status, TechLocation location,String serialNum){
        super(name,status,location,serialNum, TechType.LIGHT);
    }

}