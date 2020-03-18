package org.claudomiro.clean_code.world_cup;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CountryTest {

    @Test
    public void whenValidCountryReturnName() {
        assertThat(Country.UY.getName(), equalTo("Uruguay"));
        assertThat(Country.ES.getName(), equalTo("Spain"));
        assertThat(Country.FR.getName(), equalTo("France"));
        assertThat(Country.RU.getName(), equalTo("Russian Federation"));
        assertThat(Country.AR.getName(), equalTo("Argentina"));
        assertThat(Country.BR.getName(), equalTo("Brazil"));
        assertThat(Country.DE.getName(), equalTo("Germany"));
        assertThat(Country.PA.getName(), equalTo("Panama"));
        assertThat(Country.CO.getName(), equalTo("Colombia"));
    }


    @Test
    public void whenValidCountryReturnGroup() {
        assertThat(Country.UY.getGroup(), equalTo(Group.A));
        assertThat(Country.ES.getGroup(), equalTo(Group.B));
        assertThat(Country.FR.getGroup(), equalTo(Group.C));
        assertThat(Country.AR.getGroup(), equalTo(Group.D));
        assertThat(Country.BR.getGroup(), equalTo(Group.E));
        assertThat(Country.DE.getGroup(), equalTo(Group.F));
        assertThat(Country.PA.getGroup(), equalTo(Group.G));
        assertThat(Country.CO.getGroup(), equalTo(Group.H));
    }

    @Test
    public void whenValidCountryReturnFinalPosition() {


        assertThat(Country.FR.getFinalPhase(), equalTo(Phase.CHAMPION));
        assertThat(Country.GB_ENG.getFinalPhase(), equalTo(Phase.FINALS));
        assertThat(Country.UY.getFinalPhase(), equalTo(Phase.QUARTER_FINALS));
        assertThat(Country.BR.getFinalPhase(), equalTo(Phase.QUARTER_FINALS));
        assertThat(Country.ES.getFinalPhase(), equalTo(Phase.ROUND_OF_16));
        assertThat(Country.AR.getFinalPhase(), equalTo(Phase.ROUND_OF_16));
        assertThat(Country.DE.getFinalPhase(), equalTo(Phase.ROUND_OF_16));
        assertThat(Country.PA.getFinalPhase(), equalTo(Phase.ROUND_OF_16));
        assertThat(Country.CO.getFinalPhase(), equalTo(Phase.ROUND_OF_16));
        /*



    UY("Uruguay", Group.A, null),
    RU("Russian Federation", Group.A, null),
    SA("Saudi Arabia", Group.A, null),
    EG("Egypt", Group.A,null),

    ES("Spain", Group.B, null),
    PT("Portugal", Group.B, null),
    IR("Iran", Group.B, null),
    MA(" Morocco", Group.B, null),

    FR("France", Group.C, Phase.CHAMPION),
    DK(" Denmark", Group.C, null),
    PE(" Peru", Group.C, null),
    AU(" Australia", Group.C, null),

    HR(" Croatia", Group.D, null),
    AR("Argentina", Group.D, null),
    NG(" Nigeria", Group.D, null),
    IS(" Iceland", Group.D, null),

    BR("Brazil", Group.E, null),
    CH("  Switzerland", Group.E, null),
    RS(" Serbia", Group.E, null),
    CR(" Costa Rica", Group.E, null),

    SE(" Sweden", Group.F, null),
    MX(" Mexico", Group.F, null),
    KR(" South Korea ", Group.F, null),
    DE("Germany", Group.F, null),

    BE(" Belgium", Group.G, null),
    GB_ENG(" England ", Group.G, null),
    PA("Panama", Group.G, null),
    TN("Tunisia", Group.G, null),

    CO("Colombia", Group.H, null),
    JP(" Japan", Group.H, null),
    SN(" Senegal", Group.H, null),
    PL(" Poland", Group.H, null);
         */
    }
}
