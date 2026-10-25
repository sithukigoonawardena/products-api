package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrk;
    private double fileSizeMB;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id,String name,double price,String downloadUrk, double fileSizeMB){
        super(id ,name ,price);
        this.downloadUrk = downloadUrk;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrk() {

        return downloadUrk;
    }
    public double getFileSizeMB(){

        return fileSizeMB;
    }

}
