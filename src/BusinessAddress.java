public class BusinessAddress implements Address {
    private String businessAddress;

    BusinessAddress(String businessAddress){
        this.businessAddress = businessAddress;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    @Override
    public void showAddress() {
        System.out.println(getBusinessAddress());
    }

    @Override
    public void updateAddress(String businessAddress) {
        setBusinessAddress(businessAddress);
        System.out.println(businessAddress);
    }

    @Override
    public void deleteAddress() {
        this.businessAddress = null;
    }
}
