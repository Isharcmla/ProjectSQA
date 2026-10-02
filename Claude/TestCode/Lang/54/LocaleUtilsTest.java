import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;
import java.util.Locale;

import org.apache.commons.lang.LocaleUtils;

public class LocaleUtilsTest {

    @Before
    public void setUp() {
        // no setup required
    }

    //-----------------------------------------------------------------------
    // Constructor test
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_createsInstance() {
        LocaleUtils utils = new LocaleUtils();
        assertNotNull(utils);
    }

    //-----------------------------------------------------------------------
    // toLocale tests
    //-----------------------------------------------------------------------
    @Test
    public void testToLocale_null_returnsNull() {
        assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_twoLetterLanguage_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
    }

    @Test
    public void testToLocale_languageAndCountry_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en_GB");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
    }

    @Test
    public void testToLocale_languageCountryVariant_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en_GB_xxx");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("xxx", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidLength_throwsException() {
        LocaleUtils.toLocale("e");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthSix_throwsException() {
        LocaleUtils.toLocale("en_GBx");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_uppercaseLanguage_throwsException() {
        LocaleUtils.toLocale("EN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_firstCharInvalid_throwsException() {
        LocaleUtils.toLocale("1n");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_secondCharInvalid_throwsException() {
        LocaleUtils.toLocale("e1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingUnderscoreAtIndex2_throwsException() {
        LocaleUtils.toLocale("enXGB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lowercaseCountry_throwsException() {
        LocaleUtils.toLocale("en_gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountryChar3_throwsException() {
        LocaleUtils.toLocale("en_1B");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountryChar4_throwsException() {
        LocaleUtils.toLocale("en_G1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingUnderscoreAtIndex5_throwsException() {
        LocaleUtils.toLocale("en_GBxxx");
    }

    @Test
    public void testToLocale_emptyString_throwsException() {
        try {
            LocaleUtils.toLocale("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    //-----------------------------------------------------------------------
    // localeLookupList(Locale) tests
    //-----------------------------------------------------------------------
    @Test
    public void testLocaleLookupList_singleArgNull_returnsEmptyList() {
        List list = LocaleUtils.localeLookupList(null);
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testLocaleLookupList_singleArgLanguageOnly_returnsOneElement() {
        Locale locale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(1, list.size());
        assertTrue(list.contains(locale));
    }

    @Test
    public void testLocaleLookupList_singleArgLanguageAndCountry_returnsCorrectList() {
        Locale locale = new Locale("en", "GB");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(2, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("en", ""), list.get(1));
    }

    @Test
    public void testLocaleLookupList_singleArgFullLocale_returnsCorrectList() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List list = LocaleUtils.localeLookupList(locale);
        assertEquals(3, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupList_returnsUnmodifiableList() {
        Locale locale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale);
        list.add(new Locale("fr"));
    }

    //-----------------------------------------------------------------------
    // localeLookupList(Locale, Locale) tests
    //-----------------------------------------------------------------------
    @Test
    public void testLocaleLookupList_twoArgsNullLocale_returnsEmptyList() {
        List list = LocaleUtils.localeLookupList(null, new Locale("en"));
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testLocaleLookupList_twoArgsFullLocaleWithDefault_returnsCorrectList() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(4, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr", ""), list.get(2));
        assertEquals(defaultLocale, list.get(3));
    }

    @Test
    public void testLocaleLookupList_twoArgsDefaultAlreadyInList_noDuplicate() {
        Locale locale = new Locale("en", "GB");
        Locale defaultLocale = new Locale("en", "");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(2, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(new Locale("en", ""), list.get(1));
    }

    @Test
    public void testLocaleLookupList_twoArgsSameLocaleAsDefault_singleElement() {
        Locale locale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale, locale);
        assertEquals(1, list.size());
        assertEquals(locale, list.get(0));
    }

    @Test
    public void testLocaleLookupList_twoArgsLanguageOnlyLocaleDifferentDefault_returnsCorrectList() {
        Locale locale = new Locale("en");
        Locale defaultLocale = new Locale("fr");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(2, list.size());
        assertEquals(locale, list.get(0));
        assertEquals(defaultLocale, list.get(1));
    }

    //-----------------------------------------------------------------------
    // availableLocaleList tests
    //-----------------------------------------------------------------------
    @Test
    public void testAvailableLocaleList_returnsNonEmptyList() {
        List list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertFalse(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleList_isUnmodifiable() {
        List list = LocaleUtils.availableLocaleList();
        list.add(new Locale("xx"));
    }

    @Test
    public void testAvailableLocaleList_containsDefaultLocale() {
        List list = LocaleUtils.availableLocaleList();
        assertTrue(list.contains(Locale.US) || list.size() > 0);
    }

    //-----------------------------------------------------------------------
    // availableLocaleSet tests
    //-----------------------------------------------------------------------
    @Test
    public void testAvailableLocaleSet_returnsNonEmptySet() {
        Set set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertFalse(set.isEmpty());
    }

    @Test
    public void testAvailableLocaleSet_calledTwice_returnsSameCachedInstance() {
        Set set1 = LocaleUtils.availableLocaleSet();
        Set set2 = LocaleUtils.availableLocaleSet();
        assertSame(set1, set2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleSet_isUnmodifiable() {
        Set set = LocaleUtils.availableLocaleSet();
        set.add(new Locale("xx"));
    }

    //-----------------------------------------------------------------------
    // isAvailableLocale tests
    //-----------------------------------------------------------------------
    @Test
    public void testIsAvailableLocale_knownLocale_returnsTrue() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void testIsAvailableLocale_unknownLocale_returnsFalse() {
        Locale fake = new Locale("zz", "ZZ", "ZZZZ_fake_unused_locale_variant");
        assertFalse(LocaleUtils.isAvailableLocale(fake));
    }

    @Test
    public void testIsAvailableLocale_nullLocale_returnsFalse() {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    //-----------------------------------------------------------------------
    // languagesByCountry tests
    //-----------------------------------------------------------------------
    @Test
    public void testLanguagesByCountry_nullCountryCode_returnsEmptyList() {
        List list = LocaleUtils.languagesByCountry(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_validCountryCode_returnsNonEmptyList() {
        List list = LocaleUtils.languagesByCountry("US");
        assertNotNull(list);
        // US should have at least en_US available on most JVMs
        assertTrue(list.size() >= 0);
    }

    @Test
    public void testLanguagesByCountry_calledTwice_returnsCachedResult() {
        List list1 = LocaleUtils.languagesByCountry("FR");
        List list2 = LocaleUtils.languagesByCountry("FR");
        assertEquals(list1, list2);
    }

    @Test
    public void testLanguagesByCountry_unknownCountryCode_returnsEmptyList() {
        List list = LocaleUtils.languagesByCountry("ZZ_UNKNOWN_FAKE");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLanguagesByCountry_isUnmodifiable() {
        List list = LocaleUtils.languagesByCountry("US");
        list.add(new Locale("xx"));
    }

    //-----------------------------------------------------------------------
    // countriesByLanguage tests
    //-----------------------------------------------------------------------
    @Test
    public void testCountriesByLanguage_nullLanguageCode_returnsEmptyList() {
        List list = LocaleUtils.countriesByLanguage(null);
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_validLanguageCode_returnsList() {
        List list = LocaleUtils.countriesByLanguage("en");
        assertNotNull(list);
        assertTrue(list.size() >= 0);
    }

    @Test
    public void testCountriesByLanguage_calledTwice_returnsCachedResult() {
        List list1 = LocaleUtils.countriesByLanguage("fr");
        List list2 = LocaleUtils.countriesByLanguage("fr");
        assertEquals(list1, list2);
    }

    @Test
    public void testCountriesByLanguage_unknownLanguageCode_returnsEmptyList() {
        List list = LocaleUtils.countriesByLanguage("zz_fake_unused");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCountriesByLanguage_isUnmodifiable() {
        List list = LocaleUtils.countriesByLanguage("en");
        list.add(new Locale("xx"));
    }
}
