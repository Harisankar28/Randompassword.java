import java.util.Scanner;

class RPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many random passwords you want to be generated:");
        int totalrp = in.nextInt();
        System.out.println("How many Characters long you want in your password:");
        int length = in.nextInt();
        String[] randomps = new String[totalrp];
        for (int i = 0; i < totalrp; i++) {
            String rp = "";
            for (int j = 0; j < length; j++) {
                rp += randomChar();
            }
            randomps[i] = rp;
        }
        printpwds(randomps);
        System.out.println(pwdcomplexity(length));
    }

    public static void printpwds(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static String pwdcomplexity(int length) {
        if (length < 5) {
            return "Weak";
        } else if (length < 10) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static char randomChar() {
        int rndm = (int) (Math.random() * 62);
        if (rndm <= 9) {
            int ascii = rndm + 48;
            return (char) (ascii);
        } else if (rndm <= 35) {
            int ascii = rndm + 55;
            return (char) (ascii);
        } else {
            int ascii = rndm + 61;
            return (char) (ascii);
        }
    }
}
