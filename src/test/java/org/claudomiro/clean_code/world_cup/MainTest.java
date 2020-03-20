package org.claudomiro.clean_code.world_cup;

import org.junit.jupiter.api.*;


import java.util.List;

import static org.claudomiro.clean_code.world_cup.Group.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import static org.claudomiro.clean_code.world_cup.Country.*;


public class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
    public void whenValidCountryNameReturnPositionOfElination()
    {
//        assertThat(main.position("France"), emptyOptional());
        assertThat(Phase.QUARTER_FINALS, equalTo(main.elimination("Brazil")));
        assertThat(Phase.ROUND_OF_16, equalTo(main.elimination("Germany")));
    }

    @Test
    void whenInvalidCountryThrowsException()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            main.elimination("Country that not exists"));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            main.elimination("China"));

    }

    @Test
    public void whenValidGroupReturnCountiresListOrderedByName()
    {
        assertThat(main.byGroup(C), contains(AU, DK, FR, PE));
        assertThat(main.byGroup(E), contains(BR, CR, RS, CH));
    }

    @Test
    public void whenEliinationPahseReturnCoutryList()
    {
        assertThat(main.byEliminationPhase(Phase.FINALS), contains(BE, HR, GB_ENG));
    }

    @Test
    public void returnAllCountries()
    {
        final List<Country> all = main.allOrderedByCountryName();
        assertThat(all, hasSize(32));
        assertThat(all.get(0), equalTo(AR));
        assertThat(all.get(13), equalTo(IR));
        assertThat(all.get(31), equalTo(UY));

    }

    @Test
    public void returnAllCoutryNames()
    {
        List<String> allNames = main.allNames();
        assertThat(allNames, hasSize(32));
        assertThat(main.allNames().get(0), equalTo("Argentina"));
        assertThat(allNames.get(13), equalTo("Iran"));
        assertThat(allNames.get(31), equalTo("Uruguay"));
    }

}
