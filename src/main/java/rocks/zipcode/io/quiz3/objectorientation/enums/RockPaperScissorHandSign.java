package rocks.zipcode.io.quiz3.objectorientation.enums;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK, PAPER, SCISSORS;

    private static final Map<RockPaperScissorHandSign, RockPaperScissorHandSign> beats = new EnumMap<>(RockPaperScissorHandSign.class);

    static {
        beats.put(ROCK, SCISSORS);
        beats.put(PAPER, ROCK);
        beats.put(SCISSORS, PAPER);
    }

    public RockPaperScissorHandSign getWinner() {
        final Set<RockPaperScissorHandSign> sign = beats.keySet();
        RockPaperScissorHandSign value = beats.get(sign);
        RockPaperScissorHandSign curHand = ROCK;
        RockPaperScissorHandSign losHand = PAPER;
        for(int i = 0; i < sign.size(); i++) {
            if (beats.keySet().contains(ROCK)) {
                curHand = ROCK;
                losHand = beats.get(ROCK);
            }
            if (beats.keySet().contains(PAPER)) {
                curHand = PAPER;
                losHand = beats.get(PAPER);
            }
            if (beats.keySet().contains(SCISSORS)) {
                curHand = SCISSORS;
                losHand = beats.get(SCISSORS);
            } else {
                return null;
            }
        }
            if (value == curHand) {
                return curHand;
            }
        return curHand;
    }

    public RockPaperScissorHandSign getLoser() {
        final Set<RockPaperScissorHandSign> sign = beats.keySet();
        RockPaperScissorHandSign curHand = null;
        RockPaperScissorHandSign losHand = null;
        RockPaperScissorHandSign value = beats.get(sign);
        for(int i = 0; i < sign.size(); i++) {
            if (beats.keySet().contains(ROCK)) {
                curHand = ROCK;
                losHand = beats.get(ROCK);
            }
            if (beats.keySet().contains(PAPER)) {
                curHand = PAPER;
                losHand = beats.get(PAPER);
            }
            if (beats.keySet().contains(SCISSORS)) {
                curHand = SCISSORS;
                losHand = beats.get(SCISSORS);
            }
            if (value == curHand) {
                return losHand;
            }
        }
        return losHand;
    }
}
