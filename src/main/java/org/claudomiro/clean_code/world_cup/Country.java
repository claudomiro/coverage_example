package org.claudomiro.clean_code.world_cup;


public enum  Country {
    UY("Uruguay", Group.A, Phase.QUARTER_FINALS),
    RU("Russian Federation", Group.A, Phase.QUARTER_FINALS),
    SA("Saudi Arabia", Group.A, Phase.ROUND_OF_16),
    EG("Egypt", Group.A,null),

    ES("Spain", Group.B, Phase.ROUND_OF_16),
    PT("Portugal", Group.B, Phase.ROUND_OF_16),
    IR("Iran", Group.B, Phase.ROUND_OF_16),
    MA(" Morocco", Group.B, Phase.ROUND_OF_16),

    FR("France", Group.C, Phase.CHAMPION),
    DK(" Denmark", Group.C, Phase.ROUND_OF_16),
    PE(" Peru", Group.C, Phase.ROUND_OF_16),
    AU(" Australia", Group.C, Phase.ROUND_OF_16),

    HR(" Croatia", Group.D, Phase.FINALS),
    AR("Argentina", Group.D, Phase.ROUND_OF_16),
    NG(" Nigeria", Group.D, Phase.ROUND_OF_16),
    IS(" Iceland", Group.D, Phase.ROUND_OF_16),

    BR("Brazil", Group.E, Phase.QUARTER_FINALS),
    CH("  Switzerland", Group.E, Phase.ROUND_OF_16),
    RS(" Serbia", Group.E, Phase.ROUND_OF_16),
    CR(" Costa Rica", Group.E, Phase.ROUND_OF_16),

    SE(" Sweden", Group.F, Phase.QUARTER_FINALS),
    MX(" Mexico", Group.F, Phase.ROUND_OF_16),
    KR(" South Korea ", Group.F, Phase.ROUND_OF_16),
    DE("Germany", Group.F, Phase.ROUND_OF_16),

    BE(" Belgium", Group.G, Phase.SEMI_FINALS),
    GB_ENG(" England ", Group.G, Phase.FINALS),
    PA("Panama", Group.G, Phase.ROUND_OF_16),
    TN("Tunisia", Group.G, Phase.ROUND_OF_16),

    CO("Colombia", Group.H, Phase.ROUND_OF_16),
    JP(" Japan", Group.H, Phase.ROUND_OF_16),
    SN(" Senegal", Group.H, Phase.ROUND_OF_16),
    PL(" Poland", Group.H, Phase.ROUND_OF_16);

    private final String name;
    private final Group group;
    private final Phase finalPhase;

    private Country(String name, Group group, Phase finalPhase)
    {
        this.name = name;
        this.group = group;
        this.finalPhase = finalPhase;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public Phase getFinalPhase() {
        return finalPhase;
    }

}
