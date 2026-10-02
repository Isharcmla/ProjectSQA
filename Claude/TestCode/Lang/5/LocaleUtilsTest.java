import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Locale;
import java.util.Set;

public class LocaleUtilsTest {

    private LocaleUtils localeUtils;

    @Before
    public void setUp() {
        localeUtils = new LocaleUtils();
    }

    // ---------- Constructor ----------
    @Test
    public void testConstructor_instanceCreated_notNull() {
        assertNotNull(localeUtils);
    }

    // ---------- toLocale(String) ----------
    @Test
    public void testToLocale_nullInput_returnsNull() {
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
        Locale locale = LocaleUtils.toLocale("en_GB_X");
        assertEquals("en", locale.getLanguage());
        assertEquals("GB", locale.getCountry());
        assertEquals("X", locale.getVariant());
    }

    @Test
    public void testToLocale_languageDoubleUnderscoreVariant_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en__xxx");
        assertEquals("en", locale.getLanguage());
        assertEquals("", locale.getCountry());
        assertEquals("xxx", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_emptyString_throwsException() {
        LocaleUtils.toLocale("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_singleCharString_throwsException() {
        LocaleUtils.toLocale("a");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_firstCharUppercase_throwsException() {
        LocaleUtils.toLocale("En");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_secondCharUppercase_throwsException() {
        LocaleUtils.toLocale("eN");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthThreeOrFour_throwsException() {
        LocaleUtils.toLocale("en_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthFourNoUnderscore_throwsException() {
        LocaleUtils.toLocale("enGB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingUnderscoreAtIndex2_throwsException() {
        LocaleUtils.toLocale("enGBX");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_countryNotUppercase_throwsException() {
        LocaleUtils.toLocale("en_Gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lengthSixLessThanSeven_throwsException() {
        LocaleUtils.toLocale("en_GB_");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingUnderscoreAtIndex5_throwsException() {
        LocaleUtils.toLocale("en_GBxx");
    }

    // ---------- localeLookupList(Locale) ----------
    @Test
    public void testLocaleLookupListSingleArg_nullLocale_returnsEmptyList() {
        List<Locale> list = LocaleUtils.localeLookupList(null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupListSingleArg_languageOnly_returnsSingleEntryList() {
        Locale locale = new Locale("en");
        List<Locale> list = LocaleUtils.localeLookupList(locale);
        assertEquals(1, list.size());
        assertEquals(locale, list.get(0));
    }

    @Test
    public void testLocaleLookupListSingleArg_languageCountryVariant_returnsFullHierarchy() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List<Locale> list = LocaleUtils.localeLookupList(locale);
        assertEquals(3, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr"), list.get(2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupListSingleArg_resultIsImmutable() {
        List<Locale> list = LocaleUtils.localeLookupList(new Locale("en"));
        list.add(new Locale("de"));
    }

    // ---------- localeLookupList(Locale, Locale) ----------
    @Test
    public void testLocaleLookupListTwoArgs_bothNull_returnsEmptyList() {
        List<Locale> list = LocaleUtils.localeLookupList(null, null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupListTwoArgs_defaultLocaleNotInList_appendsDefault() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(4, list.size());
        assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        assertEquals(new Locale("fr", "CA"), list.get(1));
        assertEquals(new Locale("fr"), list.get(2));
        assertEquals(defaultLocale, list.get(3));
    }

    @Test
    public void testLocaleLookupListTwoArgs_defaultLocaleAlreadyInList_doesNotDuplicate() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("fr");
        List<Locale> list = LocaleUtils.localeLookupList(locale, defaultLocale);
        assertEquals(3, list.size());
        assertEquals(new Locale("fr"), list.get(2));
    }

    @Test
    public void testLocaleLookupListTwoArgs_localeNullDefaultProvided_returnsEmptyList() {
        List<Locale> list = LocaleUtils.localeLookupList(null, new Locale("en"));
        assertTrue(list.isEmpty());
    }

    // ---------- availableLocaleList ----------
    @Test
    public void testAvailableLocaleList_notNullAndContainsUS() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertTrue(list.contains(Locale.US));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleList_resultIsImmutable() {
        List<Locale> list = LocaleUtils.availableLocaleList();
        list.add(new Locale("xx"));
    }

    // ---------- availableLocaleSet ----------
    @Test
    public void testAvailableLocaleSet_notNullAndContainsUS() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertTrue(set.contains(Locale.US));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleSet_resultIsImmutable() {
        Set<Locale> set = LocaleUtils.availableLocaleSet();
        set.add(new Locale("xx"));
    }

    // ---------- isAvailableLocale ----------
    @Test
    public void testIsAvailableLocale_knownLocale_returnsTrue() {
        assertTrue(LocaleUtils.isAvailableLocale(Locale.US));
    }

    @Test
    public void testIsAvailableLocale_unknownLocale_returnsFalse() {
        Locale fakeLocale = new Locale("zz", "ZZ", "unknown_variant_xyz");
        assertFalse(LocaleUtils.isAvailableLocale(fakeLocale));
    }

    @Test
    public void testIsAvailableLocale_nullLocale_returnsFalse() {
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    // ---------- languagesByCountry ----------
    @Test
    public void testLanguagesByCountry_nullCountryCode_returnsEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry(null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_validCountryCode_returnsNonEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry("US");
        assertNotNull(list);
        for (Locale locale : list) {
            assertEquals("US", locale.getCountry());
            assertTrue(locale.getVariant().isEmpty());
        }
    }

    @Test
    public void testLanguagesByCountry_calledTwice_usesCachedResult() {
        List<Locale> firstCall = LocaleUtils.languagesByCountry("GB");
        List<Locale> secondCall = LocaleUtils.languagesByCountry("GB");
        assertEquals(firstCall, secondCall);
    }

    @Test
    public void testLanguagesByCountry_unknownCountryCode_returnsEmptyList() {
        List<Locale> list = LocaleUtils.languagesByCountry("XX");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLanguagesByCountry_resultIsImmutable() {
        List<Locale> list = LocaleUtils.languagesByCountry("US");
        list.add(new Locale("xx"));
    }

    // ---------- countriesByLanguage ----------
    @Test
    public void testCountriesByLanguage_nullLanguageCode_returnsEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage(null);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_validLanguageCode_returnsNonEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage("en");
        assertNotNull(list);
        for (Locale locale : list) {
            assertEquals("en", locale.getLanguage());
            assertTrue(locale.getCountry().length() != 0);
            assertTrue(locale.getVariant().isEmpty());
        }
    }

    @Test
    public void testCountriesByLanguage_calledTwice_usesCachedResult() {
        List<Locale> firstCall = LocaleUtils.countriesByLanguage("fr");
        List<Locale> secondCall = LocaleUtils.countriesByLanguage("fr");
        assertEquals(firstCall, secondCall);
    }

    @Test
    public void testCountriesByLanguage_unknownLanguageCode_returnsEmptyList() {
        List<Locale> list = LocaleUtils.countriesByLanguage("zz");
        assertNotNull(list);
        assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCountriesByLanguage_resultIsImmutable() {
        List<Locale> list = LocaleUtils.countriesByLanguage("en");
        list.add(new Locale("xx"));
    }
}
