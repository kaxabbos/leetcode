package main.java.com.leetcode.not;

public class M649_Dota2Senate {
    static public String predictPartyVictory(String senate) {
        int radiant = 0;
        int dire = 0;

        for (String i : senate.split("")) {
            if (i.equals("R")) radiant++;
            else if (i.equals("D")) dire++;
        }

        if (radiant == 0) return "Dire";
        if (dire == 0) return "Radiant";

        String[] strings = senate.split("");

        while (true) {
            for (int i = 0; i < strings.length; i++) {
                switch (strings[i]) {
                    case "R" -> {
                        for (int j = 0; j < strings.length; j++) {
                            if (strings[j].equals("D")) {
                                strings[j] = "0";
                                dire--;
                                break;
                            }
                        }
                    }
                    case "D" -> {
                        for (int j = 0; j < strings.length; j++) {
                            if (strings[j].equals("R")) {
                                strings[j] = "0";
                                radiant--;
                                break;
                            }
                        }
                    }
                }
            }

            if (radiant == 0) break;
            if (dire == 0) break;
        }


        return radiant > dire ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        System.out.println(predictPartyVictory("DRRDRDRDRDDRDRDR"));
        System.out.println(predictPartyVictory("DRRD"));
        System.out.println(predictPartyVictory("RD"));
        System.out.println(predictPartyVictory("RDD"));
        System.out.println(predictPartyVictory("DR"));
        System.out.println(predictPartyVictory("DDR"));
        System.out.println(predictPartyVictory("DDRRR"));
        System.out.println(predictPartyVictory("DDRRRR"));
    }
}
