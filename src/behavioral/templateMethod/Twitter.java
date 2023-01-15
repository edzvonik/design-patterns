package behavioral.templateMethod;

public class Twitter extends AbstractSocialNetwork {

    @Override
    protected void login() {
        System.out.println("You are login in Twitter account");
    }

}
