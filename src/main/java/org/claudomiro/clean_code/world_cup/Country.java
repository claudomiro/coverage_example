package org.claudomiro.clean_code.world_cup;


import java.util.Comparator;
import java.util.Optional;

import static org.claudomiro.clean_code.world_cup.Group.*;
import static org.claudomiro.clean_code.world_cup.Phase.*;

public enum  Country implements Comparator<Country>{
    UY("Uruguay", A, QUARTER_FINALS),
    RU("Russian Federation", A, QUARTER_FINALS),
    SA("Saudi Arabia", A, ROUND_OF_16),
    EG("Egypt", A, ROUND_OF_16),

    ES("Spain", B, ROUND_OF_16),
    PT("Portugal", B, ROUND_OF_16),
    IR("Iran", B, ROUND_OF_16),
    MA("Morocco", B, ROUND_OF_16),

    FR("France", C),
    DK("Denmark", C, ROUND_OF_16),
    PE("Peru", C, ROUND_OF_16),
    AU("Australia", C, ROUND_OF_16),

    HR("Croatia", D, FINALS),
    AR("Argentina", D, ROUND_OF_16),
    NG("Nigeria", D, ROUND_OF_16),
    IS("Iceland", D, ROUND_OF_16),

    BR("Brazil", E, QUARTER_FINALS),
    CH("Switzerland", E, ROUND_OF_16),
    RS("Serbia", E, ROUND_OF_16),
    CR("Costa Rica", E, ROUND_OF_16),

    SE("Sweden", F, QUARTER_FINALS),
    MX("Mexico", F, ROUND_OF_16),
    KR("South Korea ", F, ROUND_OF_16),
    DE("Germany", F, ROUND_OF_16),

    BE("Belgium", G, SEMI_FINALS),
    GB_ENG("England ", G, FINALS),
    PA("Panama", G, ROUND_OF_16),
    TN("Tunisia", G, ROUND_OF_16),

    CO("Colombia", H, ROUND_OF_16),
    JP("Japan", H, ROUND_OF_16),
    SN("Senegal", H, ROUND_OF_16),
    PL("Poland", H, ROUND_OF_16);

    public static final Country CHAMPION = FR;

    private final String name;
    private final Group group;
    private final Optional<Phase> eliminationPhase;

    Country(String name, Group group, Phase eliminationPhase) 
    {
        this.name = name;
        this.group = group;
        this.eliminationPhase = Optional.of(eliminationPhase);
    }

    Country(String name, Group group) 
    {
        this.name = name;
        this.group = group;
        this.eliminationPhase = Optional.empty();
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public Optional<Phase> getEliminationPhase() {
        return eliminationPhase;
    }

    @Override
    public int compare(Country c1, Country c2) {
        return c1.getName().compareTo(c2.getName());
    }

    public boolean isChampion() {
        return this.equals(CHAMPION);
    }
}