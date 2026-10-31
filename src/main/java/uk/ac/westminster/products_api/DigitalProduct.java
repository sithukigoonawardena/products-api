package uk.ac.westminster.products_api;

public class DigitalProduct extends Product  {
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id,String name,double price,String downloadUrk, double fileSizeMB){
        super(id ,name ,price);
        this.downloadUrl = downloadUrk;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    public void setFileSizeMB(double fileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public  String getSummary(){
        return "Product Name:"+getName()
                +"|Price:  "+getPrice()
                +"|Download Urk: "+getDownloadUrl()
                +"|File Size MB: "+getFileSizeMB();
    }


    @Override
    public void applyDiscount(double rate) {
        // no shipping: full rate applies
        discountedPrice = getPrice() * (1 -rate);
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
