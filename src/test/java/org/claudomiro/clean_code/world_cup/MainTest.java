package org.claudomiro.clean_code.world_cup;

import org.junit.jupiter.api.*;
import org.omg.SendingContext.RunTime;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.claudomiro.clean_code.world_cup.Group.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

}
