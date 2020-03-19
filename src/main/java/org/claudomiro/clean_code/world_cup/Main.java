package org.claudomiro.clean_code.world_cup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.claudomiro.clean_code.world_cup.Country.*;
import static org.claudomiro.clean_code.world_cup.Country.CH;

public class Main
{
    public Optional<Phase> elimination(String countryName)
    {
        return Arrays.stream(Country.values())
                .filter(country -> country.getName().equals(countryName))
                .findFirst()
                .map(Country::getEliminationPhase)
                .orElseThrow(() -> new IllegalArgumentException(constructErrorMessage(countryName)));
    }

    private String constructErrorMessage(String countryName) {
        return String.format("Country '%s' " +
                    "is not a valid Country for the World Cup 2018!", countryName);
    }

    public List<Country> byGroup(final Group group) {

        return Arrays.stream(values())
                .filter(country -> group.equals(country.getGroup()))
                .sorted((c1, c2) -> new CountryNameComparator().compare(c1, c2))
                .collect(Collectors.toList());
    }

}
