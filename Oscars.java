public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actorName = scan.nextLine();
        double startingPoints = Double.parseDouble(scan.nextLine());
        int juryCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < juryCount; i++) {
            String judgeName = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());

            startingPoints = startingPoints + (judgeName.length() * points / 2);

            if (startingPoints > 1250.5) {
                break;
            }
        }

        if (startingPoints > 1250.5) {
            System.out.println(String.format("Congratulations, %s got a nominee for leading role with %.1f!",
                    actorName , startingPoints));
        } else {
            System.out.println(String.format("Sorry, %s you need %.1f more!",
                    actorName , 1250.5 - startingPoints));
        }
    }
}
