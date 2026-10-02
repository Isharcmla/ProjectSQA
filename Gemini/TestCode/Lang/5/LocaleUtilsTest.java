package org.apache.commons.lang3;

import org.junit.Test;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for {@link LocaleUtils}.
 */
public class LocaleUtilsTest {

    @Test
    public void testConstructor_publicInstanceCreated() {
        LocaleUtils utils = new LocaleUtils();
        assertNotNull(utils);
    }

    // -----------------------------------------------------------------------
    // toLocale tests
    // -----------------------------------------------------------------------

    @Test
    public void testToLocale_nullInput_returnsNull() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_validLanguageOnly_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("us");
        assertEquals("us", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());

        locale = LocaleUtils.toLocale("fr");
        assertEquals("fr", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testToLocale_validLanguageAndCountry_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("us_EN");
        assertEquals("us", locale.getLanguage());
        assertEquals("EN", locale.getCountry());
        assertEquals("", locale.getVariant());

        locale = LocaleUtils.toLocale("en_GB");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("", locale.getVariant());
    }

    @Test
    public void testToLocale_validLanguageAndVariantOnly_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en__POSIX");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());

        locale = LocaleUtils.toLocale("de__WIN");
        assertEquals("de", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("WIN", locale.getVariant());
    }

    @Test
    public void testToLocale_validLanguageCountryAndVariant_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en_US_POSIX");
        assertEquals("en", locale.getLanguage());
        assertEquals("US", locale.getCountry());
        assertEquals("POSIX", locale.getVariant());

        locale = LocaleUtils.toLocale("fr_CA_xxx");
        assertEquals("fr", locale.getLanguage());
        assertEquals("CA", locale.getCountry());
        assertEquals("xxx", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_emptyString_throwsException() {
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthOne_throwsException() {
        LocaleUtils.toLocale("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_firstCharNotLowerCase_throwsException() {
        LocaleUtils.toLocale("Us");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_secondCharNotLowerCase_throwsException() {
        LocaleUtils.toLocale("uS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_numericChars_throwsException() {
        LocaleUtils.toLocale("12");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthThree_throwsException() {
        LocaleUtils.toLocale("en_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthFour_throwsException() {
        LocaleUtils.toLocale("en_U");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingFirstUnderscore_throwsException() {
        LocaleUtils.toLocale("en-US");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_countryChar3NotUpperCase_throwsException() {
        LocaleUtils.toLocale("en_uS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_countryChar4NotUpperCase_throwsException() {
        LocaleUtils.toLocale("en_Us");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_countryNumeric_throwsException() {
        LocaleUtils.toLocale("en_12");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthSix_throwsException() {
        LocaleUtils.toLocale("en_US_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingSecondUnderscore_throwsException() {
        LocaleUtils.toLocale("en_US#POSIX");
    }

    // -----------------------------------------------------------------------
    // localeLookupList tests
    // -----------------------------------------------------------------------

    @Test
    public void testLocaleLookupList_nullLocale_returnsEmptyList() {
        List<Locale> list = LocaleUtils.localeLookupList(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());

        List<Locale> listWithDefault = LocaleUtils.localeLookupList(null, Locale.ENGLISH);
        assertNotNull(listWithDefault);
        assertTrue(listWithDefault.isEmpty());
    }

    @Test
    public void testLocaleLookupList_languageOnly_returnsList() {
        Locale locale = new Locale("en");
        List<Locale> list = LocaleUtils.localeLookupList(locale);

        assertEquals(1, list.size());
        assertEquals(locale, list.get(0));
    }

    @Test
    public void testLocaleLookupList_languageAndCountry_returnsList() {
        Locale locale = new Locale("en", "US");
        List<Locale> list = LocaleUtils.localeLookupList(locale);

        assertEquals(2, list.size());
        assertEquals(new Locale("en", "US"), list.get(0));
        assertEquals(new Locale("en", ""), list.get(1));
    }

    @Test
    public void testLocaleLookupList_languageCountryAndVariant_returnsList() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List<Locale> list = LocaleUtils.localeLookupList(locale);

        assertEquals(3, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
    }

    @Test
    public void testLocaleLookupList_languageAndVariantOnly_returnsList() {
        Locale locale = new Locale("fr", "", "xxx");
        List<Locale> list = LocaleUtils.localeLookupList(locale);

        assertEquals(2, list.size());
        assertEquals(new Locale("fr", "", "xxx"), list.get(0));
        assertEquals(new Locale("fr", ""), list.get(1));
    }

    @Test
    public void testLocaleLookupList_withDefaultLocaleNotPresent_appendsDefault() {
        Locale locale = new Locale("en", "US");
        Locale defaultLocale = Locale.FRANCE;
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);

        assertEquals(3, list.size());
        assertEquals(new Locale("en", "US"), list.get(0));
        assertEquals(new Locale("en", ""), list.get(1));
        assertEquals(defaultLocale, list.get(2));
    }

    @Test
    public void testLocaleLookupList_withDefaultLocaleAlreadyPresent_doesNotDuplicate() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("fr", "CA");
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);

        assertEquals(3, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupList_isUnmodifiable() {
        List<Locale> list = LocaleUtils.localeLookupList(Locale.ENGLISH);
        list.add(Locale.FRENCH);
    }

    // -----------------------------------------------------------------------
    // availableLocaleList and availableLocaleSet tests
    // -----------------------------------------------------------------------

    @Test
    public void testAvailableLocaleList_returnsValidList() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertFalse(list.isEmpty());
        assertTrue(list.contains(Locale.US));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleList_isUnmodifiable() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        list.add(new Locale("fake", "FAKE"));
    }

    @Test
    public void testAvailableLocaleSet_returnsValidSet() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertFalse(set.isEmpty());
        assertTrue(set.contains(Locale.US));
        assertEquals(LocaleUtils.availableLocaleList().size(), set.size());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleSet_isUnmodifiable() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        set.add(new Locale("fake", "FAKE"));
    }

    // -----------------------------------------------------------------------
    // isAvailableLocale tests
    // -----------------------------------------------------------------------

    @Test
    public void testIsAvailableLocale_knownLocale_returnsTrue() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
        assertTrue(LocaleUtils.isAvailableLocale(Locale.GERMANY));
    }

    @Test
    public void testIsAvailableLocale_unknownLocale_returnsFalse() {
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("zz", "ZZ", "NONEXISTENT")));
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    // -----------------------------------------------------------------------
    // languagesByCountry tests
    // -----------------------------------------------------------------------

    @Test
    public void testLanguagesByCountry_nullInput_returnsEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_validCountry_returnsListAndCachesResult() {
        List<Locale> list1 = LocaleUtils.languagesByCountry("US");
        assertNotNull(list1);
        assertFalse(list1.isEmpty());
        for (Locale loc : list1) {
            assertEquals("US", loc.getCountry());
            assertTrue(loc.getVariant().isEmpty());
        }

        // Test caching branch (subsequent call)
        List<Locale> list2 = LocaleUtils.languagesByCountry("US");
        assertEquals(list1, list2);
    }

    @Test
    public void testLanguagesByCountry_unknownCountry_returnsEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLanguagesByCountry_isUnmodifiable() {
        List<Locale> list = LocaleUtils.languagesByCountry("US");
        list.add(new Locale("es", "US"));
    }

    // -----------------------------------------------------------------------
    // countriesByLanguage tests
    // -----------------------------------------------------------------------

    @Test
    public void testCountriesByLanguage_nullInput_returnsEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_validLanguage_returnsListAndCachesResult() {
        List<Locale> list1 = LocaleUtils.countriesByLanguage("en");
        assertNotNull(list1);
        assertFalse(list1.isEmpty());
        for (Locale loc : list1) {
            assertEquals("en", loc.getLanguage());
            assertFalse(loc.getCountry().isEmpty());
            assertTrue(loc.getVariant().isEmpty());
        }

        // Test caching branch (subsequent call)
        List<Locale> list2 = LocaleUtils.countriesByLanguage("en");
        assertEquals(list1, list2);
    }

    @Test
    public void testCountriesByLanguage_unknownLanguage_returnsEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage("zz");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCountriesByLanguage_isUnmodifiable() {
        List<Locale> list = LocaleUtils.countriesByLanguage("en");
        list.add(new Locale("en", "ZZ"));
    }
}
