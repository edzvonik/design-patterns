package behavioral.templateMethod;

import java.io.*;

public class PostManager {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Select a social network: "
                + "\n1 - Facebook"
                + "\n2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());
        AbstractSocialNetwork network = null;

        if (choice == 1) {
            network = new Facebook();
        } else {
            network = new Twitter();
        }

        network.post();
    }

}
