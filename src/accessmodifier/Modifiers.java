package accessmodifier;

class Data {
    protected String name1;
    public String name2;
    private String name;
    // getter metodu
    public String getName() {
        return this.name;
    }
    // setter metodu
    public void setName(String name) {
        this.name= name;
    }


    public Data(String protname,String pubname, String privname){
        name1=protname;
        name2=pubname;
        this.setName(privname);
    }

}
