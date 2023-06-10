
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account implements Comparable<Account> {
    enum AuthenticationStatus{SUCCESS, FAIL}
    private User user;
    ArrayList<Insurance> usersInsurance;
    AuthenticationStatus userStatus;
    public Account(User user){
        this.user = user;
        this.userStatus = AuthenticationStatus.FAIL;
        this.usersInsurance = new ArrayList<>();
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if(this.user.getEmail().equals(email) && this.user.getPassword().equals(password)){
            this.userStatus = AuthenticationStatus.SUCCESS;
        }
        else{
            throw new InvalidAuthenticationException("Invalid Credentials!");
        }
    }

    public static void addAddress(User user, Address address){
        user.addressList.add(address);
    }
    public static void listAddresses(User user){
        for(int i = 1; i <= user.addressList.size(); i++){
            System.out.println(i + "- " + user.addressList.get(i));
        }
    }
    public static void removeAddress(User user, int i) {
        listAddresses(user);
        System.out.println("Which address do you want to delete?");
        Scanner input = new Scanner(System.in);
        int userChoose;
        boolean success = false;
        while (!success) {
            try {
                userChoose = input.nextInt();
                while (userChoose < 1 || userChoose > user.addressList.size()) {
                    System.out.println("You have to enter a number between 1 and " + user.addressList.size() + ".");
                    userChoose = input.nextInt();
                }
                Address removedAddress = user.addressList.remove(userChoose);
                System.out.println("You just removed " +  removedAddress);
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Error! You entered invalid input.");
            }
        }
    }
    public AuthenticationStatus getUserStatus(){
        return userStatus;
    }
    public abstract void addInsurance(Insurance insurance);

    @Override
    public int compareTo(Account other) {
        // you can compare accounts based on the email
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        // you can use the email as the basis for the hash code
        return user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        // you can check if two accounts are equal based on the email
        return this.user.getEmail().equals(other.user.getEmail());
    }
}
