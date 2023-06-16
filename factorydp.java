package Factory;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Milkshake {
}

enum MilkshakeName {
    OreoMilkshake,
    ButterscotchMilkshake,
    VanillaMilkshake
}

class ButterscotchMilkshake implements Milkshake {
    public final String name;

    public ButterscotchMilkshake() {
        this.name = MilkshakeName.ButterscotchMilkshake.toString();
    }
}

class OreoMilkshake implements Milkshake {
    public final String name;

    public OreoMilkshake() {
        this.name = MilkshakeName.OreoMilkshake.toString();
    }
}

class VanillaMilkshake implements Milkshake {
    public final String name;

    public VanillaMilkshake() {
        this.name = MilkshakeName.VanillaMilkshake.toString();
    }
}

class MilkshakeFactory {
    private Map<Object, Object> milkshakeMenu;

    public MilkshakeFactory() {
        buildMilkshakeMenu();
    }

    public Milkshake prepare(MilkshakeName milkshakeName) {
        if (milkshakeName == null) {
            System.out.println("Please provide a milkshake name!");
            return null;
        }

        System.out.println(milkshakeName + " ready!");
        return (Milkshake) milkshakeMenu.get(milkshakeName);
    }

    private void buildMilkshakeMenu() {
        milkshakeMenu = new HashMap<Object, Object>();

        milkshakeMenu.put(MilkshakeName.OreoMilkshake, new OreoMilkshake());
        milkshakeMenu.put(MilkshakeName.ButterscotchMilkshake, new ButterscotchMilkshake());
        milkshakeMenu.put(MilkshakeName.VanillaMilkshake, new VanillaMilkshake());
    }
}

public class factorydp {
    public static void main(String[] args) {
        MilkshakeFactory milkshakeFactory = new MilkshakeFactory();

        System.out.println("Enter the flavor of the milkshake from below: ");
        System.out.println("1.Oreo");
        System.out.println("2.Vanilla");
        System.out.println("3.Butterscotch\n");
        int flavor_no;
        Scanner s = new Scanner(System.in);
        flavor_no = s.nextInt();
        switch (flavor_no) {
            case 1:
                milkshakeFactory.prepare(MilkshakeName.OreoMilkshake);
                break;
            case 2:
                milkshakeFactory.prepare(MilkshakeName.VanillaMilkshake);
                break;
            case 3:
                milkshakeFactory.prepare(MilkshakeName.ButterscotchMilkshake);
                break;

            default:
            System.out.println("Invalid choice!! Try Again");
                break;
        }
        // if (flavor.equals("Oreo")) {
        // milkshakeFactory.prepare(MilkshakeName.OreoMilkshake);
        // } else if (flavor.equals("Vanilla")) {
        // milkshakeFactory.prepare(MilkshakeName.VannilaMilkshake);
        // } else if (flavor.equals("Butterscotch")) {
        // milkshakeFactory.prepare(MilkshakeName.ButterscotchMilkshake);
        // }
        // else{
        // System.out.println("Invalid choice!!");
        // }

    }
}
