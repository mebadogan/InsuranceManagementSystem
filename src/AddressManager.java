import java.util.Scanner;

public class AddressManager {
    private static User user;
    public static void addAddress(Address address){
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
}
