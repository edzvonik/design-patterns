package behavioral.templateMethod;

public class Facebook extends AbstractSocialNetwork {

    @Override
    protected void login() {
        System.out.println("You are login in Facebook account");
    }

}
