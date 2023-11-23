package fr.diginamic.utils;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistance() {
        int resultat ;
        //cas de tests nominaux
        assertEquals(1, StringUtils.levenshteinDistance("Chat", "Chats"));

        assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));

        assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));

        assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));

        assertEquals(2,StringUtils.levenshteinDistance("Chien", "Chine"));

        // cas des parametres null
        assertEquals(-1,StringUtils.levenshteinDistance(null, "Chine"));

        assertEquals(-1,StringUtils.levenshteinDistance("Chien",null));

        assertEquals(-1,StringUtils.levenshteinDistance(null,null));
    }

}