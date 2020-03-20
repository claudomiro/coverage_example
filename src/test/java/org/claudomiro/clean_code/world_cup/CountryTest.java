package org.claudomiro.clean_code.world_cup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.claudomiro.clean_code.world_cup.Phase.*;
import static org.claudomiro.clean_code.world_cup.Group.*;
import static  org.claudomiro.clean_code.world_cup.Country.*;
import static org.junit.jupiter.api.Assertions.*;

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
        assertThat(Country.UY.getGroup(), equalTo(A));
        assertThat(Country.ES.getGroup(), equalTo(B));
        assertThat(Country.FR.getGroup(), equalTo(C));
        assertThat(Country.AR.getGroup(), equalTo(D));
        assertThat(Country.BR.getGroup(), equalTo(E));
        assertThat(Country.DE.getGroup(), equalTo(F));
        assertThat(Country.PA.getGroup(), equalTo(G));
        assertThat(Country.CO.getGroup(), equalTo(H));
    }

    @Test
    public void whenValidCountryReturnEliminationPosition() {
        assertThat(Country.FR.getEliminationPhase(), equalTo(NOT_ELIMINATED));
        assertThat(Country.GB_ENG.getEliminationPhase(), equalTo(FINALS));
        assertThat(Country.UY.getEliminationPhase(), equalTo(QUARTER_FINALS));
        assertThat(Country.BR.getEliminationPhase(), equalTo(QUARTER_FINALS));
        assertThat(Country.ES.getEliminationPhase(), equalTo(ROUND_OF_16));
        assertThat(Country.AR.getEliminationPhase(), equalTo(ROUND_OF_16));
        assertThat(Country.DE.getEliminationPhase(), equalTo(ROUND_OF_16));
        assertThat(Country.PA.getEliminationPhase(), equalTo(ROUND_OF_16));
        assertThat(Country.CO.getEliminationPhase(), equalTo(ROUND_OF_16));
    }

    @Test
    public void whenAskedReturnIfCountryisChampion()
    {
        assertTrue(FR.isChampion());
        assertFalse(BR.isChampion());
    }
}
