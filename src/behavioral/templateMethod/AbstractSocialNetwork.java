package behavioral.templateMethod;

public abstract class AbstractSocialNetwork {

    public void post() {
        login();
        System.out.println("You`re create new post");
    }

    protected abstract void login();

}
