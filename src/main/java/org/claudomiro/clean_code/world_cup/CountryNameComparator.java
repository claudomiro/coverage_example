package org.claudomiro.clean_code.world_cup;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country>
{
    @Override
    public int compare(Country c1, Country c2) {
        return c1.getName().compareTo(c2.getName());
    }
}
