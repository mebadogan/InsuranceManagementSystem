public class HomeAddress implements Address{
    private String homeAddress;

    HomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public void showAddress() {
        System.out.println(getHomeAddress());
    }

    @Override
    public void updateAddress(String homeAddress) {
        setHomeAddress(homeAddress);
        System.out.println(homeAddress);
    }

    @Override
    public void deleteAddress() {
        this.homeAddress = null;
    }
}
