package com.company;

import java.io.IOException;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        LinkedList<String> strings = new LinkedList<>();
        String data = "gatherer guideless fortiter john effluvium effluj emydidae eschscholtzia repelling receptacle radicle riyadh aris appeaser applaud albetur adulterously admeasurement bhadon burseraceae bloodsucking bootlegging passionflower phenol phagocyte queen neopallium numps noncollapsible hebdomadary hanoi hoox hoot calumniate chapatti chaq channelization closely closelfa coast unbowed unpublished uncalled zebra tradespeople trumpet tanker tasf taskmistress tasv touchily tsimshian lactescent licet limiting duma opp ocelot metagenesis metay melampodium mao maidenly sylvanus seam shiner scombroidea steeped sod ileum imperator wiggl";
        /*String data = "ean\n" +
                "eructation\n" +
                "epact\n" +
                "epipremnum\n" +
                "entertainingly\n" +
                "educt\n" +
                "fenestral\n" +
                "flacourtia\n" +
                "fraternity\n" +
                "forked\n" +
                "fiduciary\n" +
                "furcation\n" +
                "futilely\n" +
                "quovis\n" +
                "valedictorian\n" +
                "viewgraph\n" +
                "viverricula\n" +
                "vires\n" +
                "lyrurus\n" +
                "luxuriate\n" +
                "aweless\n" +
                "alalia\n" +
                "album\n" +
                "analogous\n" +
                "annual\n" +
                "admixture\n" +
                "acme\n" +
                "accost\n" +
                "acknowledge\n" +
                "abalone\n" +
                "autonomous\n" +
                "autosexing\n" +
                "autosomal\n" +
                "autocratically\n" +
                "josephs\n" +
                "meaningfully\n" +
                "membership\n" +
                "merry\n" +
                "meteorologic\n" +
                "mecaenas\n" +
                "malacopterygii\n" +
                "martyr\n" +
                "monad\n" +
                "motheaten\n" +
                "zambian\n" +
                "glassy\n" +
                "galicia\n" +
                "grammarian\n" +
                "gormandize\n" +
                "revulsion\n" +
                "religiosity\n" +
                "remit\n" +
                "registrary\n" +
                "rutundo\n" +
                "perching\n" +
                "petition\n" +
                "patas\n" +
                "preposition\n" +
                "presidents\n" +
                "praenomen\n" +
                "procyon\n" +
                "phenylalanine\n" +
                "poltroonery\n" +
                "porter\n" +
                "pinery\n" +
                "pithiness\n" +
                "neurobiology\n" +
                "demoralization\n" +
                "dragee\n" +
                "dislocated\n" +
                "discomycete\n" +
                "disbursement\n" +
                "habitmaker\n" +
                "haugh\n" +
                "hoyden\n" +
                "hydroplane\n" +
                "offish\n" +
                "orphan\n" +
                "onine\n" +
                "oboe\n" +
                "seldomness\n" +
                "semiterrestrial\n" +
                "settler\n" +
                "seclude\n" +
                "slurred\n" +
                "saqqara\n" +
                "sanatory\n" +
                "spikemoss\n" +
                "shetland\n" +
                "shabby\n" +
                "simoom\n" +
                "starve\n" +
                "scales\n" +
                "scars\n" +
                "scrabbly\n" +
                "sbirro\n" +
                "subtility\n" +
                "impregnable\n" +
                "inexorable\n" +
                "infancy\n" +
                "inofficious\n" +
                "instantaneous\n" +
                "intwine\n" +
                "telephonic\n" +
                "terreous\n" +
                "tenez\n" +
                "tremens\n" +
                "thiobacteria\n" +
                "clamorous\n" +
                "cannelloni\n" +
                "catechize\n" +
                "compliant\n" +
                "cosmic\n" +
                "cocytus\n" +
                "cyrilla\n" +
                "cyclosorus\n" +
                "cupido\n" +
                "blinker\n" +
                "balkans\n" +
                "banderilla\n" +
                "bathed\n" +
                "battology\n" +
                "breaking\n" +
                "boyhood\n" +
                "bump\n" +
                "bud\n" +
                "uninsured\n" +
                "unclassifiable\n" +
                "unconvincingly\n" +
                "usual\n";*/
        String[] x = data.split(" ");
        for (int i = 0; i < x.length; i++) {
            strings.addLast(x[i]);
        }
	// write your code here
       /* strings.addLast("gatherer");
        strings.addLast("guideless");
        strings.addLast("fortiter");
        strings.addLast("john");
        strings.addLast("effluvium");
        strings.addLast("effluj");

        strings.addLast("emydidae");
        strings.addLast("eschscholtzia");

        Files.lines(Paths.get("data.txt")).forEach();*/

        BadWorker worker = new BadWorker(strings);

        LinkedList<Character> characters = worker.getCharacters();

        System.out.println(characters);

        final LinkedList<Character> finalData = new LinkedList<>();
        boolean add = false;
        for (int i = 0; i < characters.size(); i++) {
            add = true;
            char curChar = characters.get(i);
            for (int j = i+1; j < characters.size(); j++) {
                if (curChar == characters.get(j)) {
                    add = false;
                    break;
                }
            }
            if (add) {
                finalData.addLast(curChar);
            }
        }

        System.out.println(finalData);
    }
}
