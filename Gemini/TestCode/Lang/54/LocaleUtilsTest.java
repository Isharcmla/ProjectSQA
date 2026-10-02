package org.apache.commons.lang;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
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
 * Unit tests for {@link LocaleUtils}.
 */
public class LocaleUtilsTest {

    private static final Locale LOCALE_EN = new Locale("en", "");
    private static final Locale LOCALE_EN_US = new Locale("en", "US");
    private static final Locale LOCALE_EN_US_WIN = new Locale("en", "US", "WIN");
    private static final Locale LOCALE_FR = new Locale("fr", "");
    private static final Locale LOCALE_FR_CA = new Locale("fr", "CA");
    private static final Locale LOCALE_DK = new Locale("dk", "");
    private static final Locale LOCALE_ZZ = new Locale("zz", "");

    @Test
    public void testConstructor() {
        assertNotNull(new LocaleUtils());
    }

    @Test
    public void testToLocale_validFormats() {
        assertNull(LocaleUtils.toLocale(null));

        assertEquals(new Locale("en", ""), LocaleUtils.toLocale("en"));
        assertEquals(new Locale("fr", ""), LocaleUtils.toLocale("fr"));

        assertEquals(new Locale("en", "GB"), LocaleUtils.toLocale("en_GB"));
        assertEquals(new Locale("en", "US"), LocaleUtils.toLocale("en_US"));

        assertEquals(new Locale("en", "GB", "xxx"), LocaleUtils.toLocale("en_GB_xxx"));
        assertEquals(new Locale("en", "GB", "POSIX"), LocaleUtils.toLocale("en_GB_POSIX"));
    }

    @Test
    public void testToLocale_invalidLength() {
        assertToLocaleThrowsIllegalArgumentException("");
        assertToLocaleThrowsIllegalArgumentException("e");
        assertToLocaleThrowsIllegalArgumentException("eng");
        assertToLocaleThrowsIllegalArgumentException("en_G");
        assertToLocaleThrowsIllegalArgumentException("en_GB_");
    }

    @Test
    public void testToLocale_invalidLanguageChars() {
        assertToLocaleThrowsIllegalArgumentException("12");
        assertToLocaleThrowsIllegalArgumentException("En");
        assertToLocaleThrowsIllegalArgumentException("eN");
        assertToLocaleThrowsIllegalArgumentException("EN");
        assertToLocaleThrowsIllegalArgumentException("e1");
        assertToLocaleThrowsIllegalArgumentException("1e");
        assertToLocaleThrowsIllegalArgumentException("en_GB#");
    }

    @Test
    public void testToLocale_invalidCountrySeparatorsAndChars() {
        assertToLocaleThrowsIllegalArgumentException("en-GB");
        assertToLocaleThrowsIllegalArgumentException("en#GB");
        assertToLocaleThrowsIllegalArgumentException("en_gb");
        assertToLocaleThrowsIllegalArgumentException("en_Gb");
        assertToLocaleThrowsIllegalArgumentException("en_gB");
        assertToLocaleThrowsIllegalArgumentException("en_1B");
        assertToLocaleThrowsIllegalArgumentException("en_G1");
        assertToLocaleThrowsIllegalArgumentException("en_GB-xxx");
    }

    private void assertToLocaleThrowsIllegalArgumentException(String input) {
        try {
            LocaleUtils.toLocale(input);
            fail("Expected IllegalArgumentException for input: " + input);
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testLocaleLookupList_singleLocale() {
        List list = LocaleUtils.localeLookupList(null);
        assertNotNull(list);
        assertEquals(0, list.size());

        list = LocaleUtils.localeLookupList(LOCALE_EN);
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals(LOCALE_EN, list.get(0));

        list = LocaleUtils.localeLookupList(LOCALE_EN_US);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));

        list = LocaleUtils.localeLookupList(LOCALE_EN_US_WIN);
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals(LOCALE_EN_US_WIN, list.get(0));
        assertEquals(LOCALE_EN_US, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));
    }

    @Test
    public void testLocaleLookupList_withDefaultLocale() {
        List list = LocaleUtils.localeLookupList(null, LOCALE_EN);
        assertNotNull(list);
        assertEquals(0, list.size());

        list = LocaleUtils.localeLookupList(LOCALE_FR, LOCALE_EN);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_FR, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));

        list = LocaleUtils.localeLookupList(LOCALE_FR_CA, LOCALE_EN);
        assertNotNull(list);
        assertEquals(3, list.size());
        assertEquals(LOCALE_FR_CA, list.get(0));
        assertEquals(LOCALE_FR, list.get(1));
        assertEquals(LOCALE_EN, list.get(2));

        list = LocaleUtils.localeLookupList(LOCALE_EN_US, LOCALE_EN);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));

        list = LocaleUtils.localeLookupList(LOCALE_EN_US, LOCALE_EN_US);
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals(LOCALE_EN_US, list.get(0));
        assertEquals(LOCALE_EN, list.get(1));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupList_unmodifiable() {
        List list = LocaleUtils.localeLookupList(LOCALE_EN);
        list.add(LOCALE_FR);
    }

    @Test
    public void testAvailableLocaleList() {
        List list = LocaleUtils.availableLocaleList();
        List list2 = LocaleUtils.availableLocaleList();
        assertNotNull(list);
        assertSame(list, list2);
        assertUnmodifiableCollection(list);

        Locale[] jdkLocales = Locale.getAvailableLocales();
        List jdkLocaleList = Arrays.asList(jdkLocales);
        assertEquals(jdkLocaleList.size(), list.size());
        assertTrue(list.containsAll(jdkLocaleList));
    }

    @Test
    public void testAvailableLocaleSet() {
        Set set = LocaleUtils.availableLocaleSet();
        Set set2 = LocaleUtils.availableLocaleSet();
        assertNotNull(set);
        assertSame(set, set2);
        assertUnmodifiableCollection(set);

        Locale[] jdkLocales = Locale.getAvailableLocales();
        assertEquals(jdkLocales.length, set.size());
        for (int i = 0; i < jdkLocales.length; i++) {
            assertTrue(set.contains(jdkLocales[i]));
        }
    }

    @Test
    public void testIsAvailableLocale() {
        Set set = LocaleUtils.availableLocaleSet();
        for (Iterator it = set.iterator(); it.hasNext(); ) {
            Locale locale = (Locale) it.next();
            assertTrue(LocaleUtils.isAvailableLocale(locale));
        }
        assertFalse(LocaleUtils.isAvailableLocale(new Locale("invalidLanguageCode", "invalidCountryCode")));
        assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    @Test
    public void testLanguagesByCountry() {
        assertNotNull(LocaleUtils.languagesByCountry(null));
        assertEquals(0, LocaleUtils.languagesByCountry(null).size());

        List listCA = LocaleUtils.languagesByCountry("CA");
        assertNotNull(listCA);
        assertTrue(listCA.size() > 0);
        for (int i = 0; i < listCA.size(); i++) {
            Locale locale = (Locale) listCA.get(i);
            assertEquals("CA", locale.getCountry());
            assertEquals(0, locale.getVariant().length());
        }

        // Test caching returns the same list instance
        assertSame(listCA, LocaleUtils.languagesByCountry("CA"));

        List listEmpty = LocaleUtils.languagesByCountry("ZZ");
        assertNotNull(listEmpty);
        assertEquals(0, listEmpty.size());

        assertUnmodifiableCollection(listCA);
    }

    @Test
    public void testCountriesByLanguage() {
        assertNotNull(LocaleUtils.countriesByLanguage(null));
        assertEquals(0, LocaleUtils.countriesByLanguage(null).size());

        List listEN = LocaleUtils.countriesByLanguage("en");
        assertNotNull(listEN);
        assertTrue(listEN.size() > 0);
        for (int i = 0; i < listEN.size(); i++) {
            Locale locale = (Locale) listEN.get(i);
            assertEquals("en", locale.getLanguage());
            assertTrue(locale.getCountry().length() > 0);
            assertEquals(0, locale.getVariant().length());
        }

        // Test caching returns the same list instance
        assertSame(listEN, LocaleUtils.countriesByLanguage("en"));

        List listEmpty = LocaleUtils.countriesByLanguage("zz");
        assertNotNull(listEmpty);
        assertEquals(0, listEmpty.size());

        assertUnmodifiableCollection(listEN);
    }

    private void assertUnmodifiableCollection(Collection coll) {
        try {
            coll.add(new Object());
            fail("Collection is not unmodifiable");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }
}
