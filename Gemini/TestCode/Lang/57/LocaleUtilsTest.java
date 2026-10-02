package org.apache.commons.lang;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test suite for LocaleUtils to achieve high branch and line coverage.
 */
public class LocaleUtilsTest {

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_POSIX = new Locale("en", "US", "POSIX");
    private static final Locale LOCALE_EN_NO_COUNTRY_VAR = new Locale("en", "", "POSIX");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_FR_CA_XXX = new Locale("fr", "CA", "xxx");

    @BeforeClass
    public static void setUpClass() {
        // Initialize the available locale set so static methods won't encounter uninitialized state
        LocaleUtils.availableLocaleSet();
    }

    // -----------------------------------------------------------------------
    // Constructor tests
    // -----------------------------------------------------------------------

    @Test
    public void testConstructor_instantiation() {
        assertNotNull(new LocaleUtils());
    }

    // -----------------------------------------------------------------------
    // toLocale tests
    // -----------------------------------------------------------------------

    @Test
    public void testToLocale_nullInput_returnsNull() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_validLanguageOnly() {
        assertEquals(new Locale("us", ""), LocaleUtils.toLocale("us"));
        assertEquals(new Locale("fr", ""), LocaleUtils.toLocale("fr"));
        assertEquals(new Locale("de", ""), LocaleUtils.toLocale("de"));
        assertEquals(new Locale("zh", ""), LocaleUtils.toLocale("zh"));
    }

    @Test
    public void testToLocale_validLanguageAndCountry() {
        assertEquals(new Locale("us", "US"), LocaleUtils.toLocale("us_US"));
        assertEquals(new Locale("fr", "FR"), LocaleUtils.toLocale("fr_FR"));
        assertEquals(new Locale("de", "DE"), LocaleUtils.toLocale("de_DE"));
        assertEquals(new Locale("zh", "CN"), LocaleUtils.toLocale("zh_CN"));
    }

    @Test
    public void testToLocale_validLanguageCountryAndVariant() {
        assertEquals(new Locale("us", "US", "POSIX"), LocaleUtils.toLocale("us_US_POSIX"));
        assertEquals(new Locale("fr", "CA", "xxx"), LocaleUtils.toLocale("fr_CA_xxx"));
        assertEquals(new Locale("en", "GB", "special_edition"), LocaleUtils.toLocale("en_GB_special_edition"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidLength_empty() {
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidLength_oneChar() {
        LocaleUtils.toLocale("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidLength_threeChars() {
        LocaleUtils.toLocale("abc");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidLength_fourChars() {
        LocaleUtils.toLocale("abcd");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidLength_sixChars() {
        LocaleUtils.toLocale("us_USA");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidFirstCharNotLower_digit() {
        LocaleUtils.toLocale("1n");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidFirstCharNotLower_upper() {
        LocaleUtils.toLocale("En");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidFirstCharNotLower_special() {
        LocaleUtils.toLocale("_n");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidSecondCharNotLower_digit() {
        LocaleUtils.toLocale("e1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidSecondCharNotLower_upper() {
        LocaleUtils.toLocale("eN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidSecondCharNotLower_special() {
        LocaleUtils.toLocale("e_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountrySeparator_dash() {
        LocaleUtils.toLocale("en-US");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountrySeparator_space() {
        LocaleUtils.toLocale("en US");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountryFirstChar_lower() {
        LocaleUtils.toLocale("en_uS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountryFirstChar_digit() {
        LocaleUtils.toLocale("en_1S");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountrySecondChar_lower() {
        LocaleUtils.toLocale("en_Us");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountrySecondChar_digit() {
        LocaleUtils.toLocale("en_U1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidVariantSeparator_dash() {
        LocaleUtils.toLocale("en_US-POSIX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidVariantSeparator_space() {
        LocaleUtils.toLocale("en_US POSIX");
    }

    // -----------------------------------------------------------------------
    // localeLookupList tests
    // -----------------------------------------------------------------------

    @Test
    public void testLocaleLookupList_nullLocale_returnsEmptyList() {
        List list = LocaleUtils.localeLookupList(null);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testLocaleLookupList_nullLocaleWithDefault_returnsEmptyList() {
        List list = LocaleUtils.localeLookupList(null, LOCALE_EN);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testLocaleLookupList_languageOnly() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN);
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals(LOCALE_EN, list.get(0));
    }

    @Test
    public void testLocaleLookupList_languageAndCountry() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN_US);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
    }

    @Test
    public void testLocaleLookupList_languageCountryAndVariant() {
        List list = LocaleUtils.localeLookupList(LOCALE_FR_CA_XXX);
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals(LOCALE_FR_CA_XXX, list.get(0));
        assertEquals(LOCALE_FR_CA, list.get(1));
        assertEquals(LOCALE_FR, list.get(2));
    }

    @Test
    public void testLocaleLookupList_languageAndVariantNoCountry() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN_NO_COUNTRY_VAR);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_NO_COUNTRY_VAR, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
    }

    @Test
    public void testLocaleLookupList_withDefaultLocale_notInList() {
        List list = LocaleUtils.localeLookupList(LOCALE_FR_CA_XXX, LOCALE_EN);
        assertNotNull(list);
        assertEquals(4, list.size());
        assertEquals(LOCALE_FR_CA_XXX, list.get(0));
        assertEquals(LOCALE_FR_CA, list.get(1));
        assertEquals(LOCALE_FR, list.get(2));
        assertEquals(LOCALE_EN, list.get(3));
    }

    @Test
    public void testLocaleLookupList_withDefaultLocale_alreadyInList() {
        List list = LocaleUtils.localeLookupList(LOCALE_FR_CA, LOCALE_FR);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_FR_CA, list.get(0));
        assertEquals(LOCALE_FR, list.get(1));
    }

    @Test
    public void testLocaleLookupList_withNullDefaultLocale() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN_US, null);
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
        assertNull(list.get(2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupList_unmodifiable() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN);
        list.add(LOCALE_FR);
    }

    // -----------------------------------------------------------------------
    // availableLocaleList tests
    // -----------------------------------------------------------------------

    @Test
    public void testAvailableLocaleList_containsAllJdkLocales() {
        List list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        List jdkList = Arrays.asList(Locale.getAvailableLocales());
        assertEquals(jdkList.size(), list.size());
        assertTrue(list.containsAll(jdkList));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleList_unmodifiable() {
        List list = LocaleUtils.availableLocaleList();
        list.add(LOCALE_EN);
    }

    // -----------------------------------------------------------------------
    // availableLocaleSet tests
    // -----------------------------------------------------------------------

    @Test
    public void testAvailableLocaleSet_containsAllJdkLocales() {
        Set set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        Set jdkSet = new HashSet(Arrays.asList(Locale.getAvailableLocales()));
        assertEquals(jdkSet.size(), set.size());
        assertTrue(set.containsAll(jdkSet));
    }

    @Test
    public void testAvailableLocaleSet_cachedInstance() {
        Set set1 = LocaleUtils.availableLocaleSet();
        Set set2 = LocaleUtils.availableLocaleSet();
        assertSame(set1, set2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleSet_unmodifiable() {
        Set set = LocaleUtils.availableLocaleSet();
        set.add(LOCALE_EN);
    }

    // -----------------------------------------------------------------------
    // isAvailableLocale tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsAvailableLocale_knownLocale() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.ENGLISH));
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
        assertTrue(LocaleUtils.isAvailableLocale(Locale.GERMANY));
    }

    @Test
    public void testIsAvailableLocale_unknownLocale() {
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("qq", "QQ")));
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("xx", "YY", "ZZZ")));
    }

    @Test
    public void testIsAvailableLocale_nullLocale() {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    // -----------------------------------------------------------------------
    // languagesByCountry tests
    // -----------------------------------------------------------------------

    @Test
    public void testLanguagesByCountry_nullCountry() {
        List list = LocaleUtils.languagesByCountry(null);
        assertNotNull(list);
        assertEquals(0, list.size());

        // Test cache hit for null
        List listCached = LocaleUtils.languagesByCountry(null);
        assertSame(list, listCached);
    }

    @Test
    public void testLanguagesByCountry_validCountry() {
        List list = LocaleUtils.languagesByCountry("US");
        assertNotNull(list);
        assertTrue(list.size() > 0);
        for (int i = 0; i < list.size(); i++) {
            Locale loc = (Locale) list.get(i);
            assertEquals("US", loc.getCountry());
            assertEquals(0, loc.getVariant().length());
        }

        // Test cache hit
        List listCached = LocaleUtils.languagesByCountry("US");
        assertSame(list, listCached);
    }

    @Test
    public void testLanguagesByCountry_unknownCountry() {
        List list = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLanguagesByCountry_unmodifiable() {
        List list = LocaleUtils.languagesByCountry("US");
        list.add(LOCALE_EN);
    }

    // -----------------------------------------------------------------------
    // countriesByLanguage tests
    // -----------------------------------------------------------------------

    @Test
    public void testCountriesByLanguage_nullLanguage() {
        List list = LocaleUtils.countriesByLanguage(null);
        assertNotNull(list);
        assertEquals(0, list.size());

        // Test cache hit for null
        List listCached = LocaleUtils.countriesByLanguage(null);
        assertSame(list, listCached);
    }

    @Test
    public void testCountriesByLanguage_validLanguage() {
        List list = LocaleUtils.countriesByLanguage("en");
        assertNotNull(list);
        assertTrue(list.size() > 0);
        for (int i = 0; i < list.size(); i++) {
            Locale loc = (Locale) list.get(i);
            assertEquals("en", loc.getLanguage());
            assertTrue(loc.getCountry().length() > 0);
            assertEquals(0, loc.getVariant().length());
        }

        // Test cache hit
        List listCached = LocaleUtils.countriesByLanguage("en");
        assertSame(list, listCached);
    }

    @Test
    public void testCountriesByLanguage_unknownLanguage() {
        List list = LocaleUtils.countriesByLanguage("zz");
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCountriesByLanguage_unmodifiable() {
        List list = LocaleUtils.countriesByLanguage("en");
        list.add(LOCALE_EN_US);
    }
}
