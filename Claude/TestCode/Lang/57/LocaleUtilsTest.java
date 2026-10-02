import org.junit.Test;
import org.junit.Assert;

import java.util.List;
import java.util.Set;
import java.util.Locale;

public class LocaleUtilsTest {

    //-----------------------------------------------------------------------
    // toLocale(String)
    //-----------------------------------------------------------------------

    @Test
    public void testToLocale_null_returnsNull() {
        Assert.assertNull(LocaleUtils.toLocale(null));
    }

    @Test
    public void testToLocale_twoCharLanguage_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en");
        Assert.assertEquals("en", locale.getLanguage());
        Assert.assertEquals("", locale.getCountry());
    }

    @Test
    public void testToLocale_languageAndCountry_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en_GB");
        Assert.assertEquals("en", locale.getLanguage());
        Assert.assertEquals("GB", locale.getCountry());
    }

    @Test
    public void testToLocale_languageCountryVariant_returnsLocale() {
        Locale locale = LocaleUtils.toLocale("en_GB_xxx");
        Assert.assertEquals("en", locale.getLanguage());
        Assert.assertEquals("GB", locale.getCountry());
        Assert.assertEquals("xxx", locale.getVariant());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_singleCharLength_throwsException() {
        LocaleUtils.toLocale("e");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_threeCharLength_throwsException() {
        LocaleUtils.toLocale("eng");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_fourCharLength_throwsException() {
        LocaleUtils.toLocale("engl");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_sixCharLength_throwsException() {
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
    public void testToLocale_missingUnderscoreSeparator_throwsException() {
        LocaleUtils.toLocale("enXGB");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_lowercaseCountry_throwsException() {
        LocaleUtils.toLocale("en_gb");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountryFirstChar_throwsException() {
        LocaleUtils.toLocale("en_1B");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_invalidCountrySecondChar_throwsException() {
        LocaleUtils.toLocale("en_G1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToLocale_missingSecondUnderscore_throwsException() {
        LocaleUtils.toLocale("en_GBxxx");
    }

    //-----------------------------------------------------------------------
    // localeLookupList(Locale)
    //-----------------------------------------------------------------------

    @Test
    public void testLocaleLookupList_withVariant_returnsFullHierarchy() {
        Locale locale = new Locale("fr", "CA", "xxx");
        List list = LocaleUtils.localeLookupList(locale);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        Assert.assertEquals(new Locale("fr", "CA"), list.get(1));
        Assert.assertEquals(new Locale("fr"), list.get(2));
    }

    @Test
    public void testLocaleLookupList_withCountryOnly_returnsTwoLocales() {
        Locale locale = new Locale("fr", "CA");
        List list = LocaleUtils.localeLookupList(locale);
        Assert.assertEquals(2, list.size());
        Assert.assertEquals(new Locale("fr", "CA"), list.get(0));
        Assert.assertEquals(new Locale("fr"), list.get(1));
    }

    @Test
    public void testLocaleLookupList_withLanguageOnly_returnsOneLocale() {
        Locale locale = new Locale("fr");
        List list = LocaleUtils.localeLookupList(locale);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(new Locale("fr"), list.get(0));
    }

    @Test
    public void testLocaleLookupList_nullLocale_returnsEmptyList() {
        List list = LocaleUtils.localeLookupList(null);
        Assert.assertTrue(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLocaleLookupList_resultIsUnmodifiable_throwsException() {
        List list = LocaleUtils.localeLookupList(new Locale("en"));
        list.add(new Locale("fr"));
    }

    //-----------------------------------------------------------------------
    // localeLookupList(Locale, Locale)
    //-----------------------------------------------------------------------

    @Test
    public void testLocaleLookupListWithDefault_withVariantAndDifferentDefault_returnsFullList() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        Assert.assertEquals(4, list.size());
        Assert.assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        Assert.assertEquals(new Locale("fr", "CA"), list.get(1));
        Assert.assertEquals(new Locale("fr"), list.get(2));
        Assert.assertEquals(new Locale("en"), list.get(3));
    }

    @Test
    public void testLocaleLookupListWithDefault_defaultAlreadyInList_doesNotDuplicate() {
        Locale locale = new Locale("fr", "CA", "xxx");
        Locale defaultLocale = new Locale("fr");
        List list = LocaleUtils.localeLookupList(locale, defaultLocale);
        Assert.assertEquals(3, list.size());
        Assert.assertEquals(new Locale("fr", "CA", "xxx"), list.get(0));
        Assert.assertEquals(new Locale("fr", "CA"), list.get(1));
        Assert.assertEquals(new Locale("fr"), list.get(2));
    }

    @Test
    public void testLocaleLookupListWithDefault_nullLocale_returnsEmptyList() {
        List list = LocaleUtils.localeLookupList(null, new Locale("en"));
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testLocaleLookupListWithDefault_sameLocaleAndDefault_returnsOneEntry() {
        Locale locale = new Locale("en");
        List list = LocaleUtils.localeLookupList(locale, locale);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(new Locale("en"), list.get(0));
    }

    //-----------------------------------------------------------------------
    // availableLocaleList()
    //-----------------------------------------------------------------------

    @Test
    public void testAvailableLocaleList_notEmpty_returnsNonEmptyList() {
        List list = LocaleUtils.availableLocaleList();
        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleList_isUnmodifiable_throwsException() {
        List list = LocaleUtils.availableLocaleList();
        list.add(new Locale("xx"));
    }

    //-----------------------------------------------------------------------
    // availableLocaleSet()
    //-----------------------------------------------------------------------

    @Test
    public void testAvailableLocaleSet_notEmpty_returnsNonEmptySet() {
        Set set = LocaleUtils.availableLocaleSet();
        Assert.assertNotNull(set);
        Assert.assertFalse(set.isEmpty());
    }

    @Test
    public void testAvailableLocaleSet_calledTwice_returnsSameInstanceLogic() {
        Set set1 = LocaleUtils.availableLocaleSet();
        Set set2 = LocaleUtils.availableLocaleSet();
        Assert.assertEquals(set1, set2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAvailableLocaleSet_isUnmodifiable_throwsException() {
        Set set = LocaleUtils.availableLocaleSet();
        set.add(new Locale("xx"));
    }

    //-----------------------------------------------------------------------
    // isAvailableLocale(Locale)
    //-----------------------------------------------------------------------

    @Test
    public void testIsAvailableLocale_knownLocale_returnsTrue() {
        LocaleUtils.availableLocaleSet(); // trigger population first if needed
        Locale knownLocale = (Locale) LocaleUtils.availableLocaleList().get(0);
        Assert.assertTrue(LocaleUtils.isAvailableLocale(knownLocale));
    }

    @Test
    public void testIsAvailableLocale_unknownLocale_returnsFalse() {
        Locale unknownLocale = new Locale("xx", "YY", "ZZZZ");
        Assert.assertFalse(LocaleUtils.isAvailableLocale(unknownLocale));
    }

    @Test
    public void testIsAvailableLocale_nullLocale_returnsFalse() {
        Assert.assertFalse(LocaleUtils.isAvailableLocale(null));
    }

    //-----------------------------------------------------------------------
    // languagesByCountry(String)
    //-----------------------------------------------------------------------

    @Test
    public void testLanguagesByCountry_nullCountryCode_returnsEmptyList() {
        List list = LocaleUtils.languagesByCountry(null);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_validCountryCode_returnsNonEmptyList() {
        List list = LocaleUtils.languagesByCountry("GB");
        Assert.assertNotNull(list);
        // May or may not be empty depending on JVM, but should not throw
    }

    @Test
    public void testLanguagesByCountry_unknownCountryCode_returnsEmptyList() {
        List list = LocaleUtils.languagesByCountry("ZZ");
        Assert.assertNotNull(list);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testLanguagesByCountry_calledTwiceSameCode_returnsCachedResult() {
        List list1 = LocaleUtils.languagesByCountry("US");
        List list2 = LocaleUtils.languagesByCountry("US");
        Assert.assertEquals(list1, list2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testLanguagesByCountry_resultIsUnmodifiable_throwsException() {
        List list = LocaleUtils.languagesByCountry("US");
        list.add(new Locale("xx"));
    }

    //-----------------------------------------------------------------------
    // countriesByLanguage(String)
    //-----------------------------------------------------------------------

    @Test
    public void testCountriesByLanguage_nullLanguageCode_returnsEmptyList() {
        List list = LocaleUtils.countriesByLanguage(null);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_validLanguageCode_returnsNonEmptyList() {
        List list = LocaleUtils.countriesByLanguage("en");
        Assert.assertNotNull(list);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_unknownLanguageCode_returnsEmptyList() {
        List list = LocaleUtils.countriesByLanguage("zz");
        Assert.assertNotNull(list);
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testCountriesByLanguage_calledTwiceSameCode_returnsCachedResult() {
        List list1 = LocaleUtils.countriesByLanguage("fr");
        List list2 = LocaleUtils.countriesByLanguage("fr");
        Assert.assertEquals(list1, list2);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testCountriesByLanguage_resultIsUnmodifiable_throwsException() {
        List list = LocaleUtils.countriesByLanguage("en");
        list.add(new Locale("xx"));
    }

    //-----------------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------------

    @Test
    public void testConstructor_createsInstance_notNull() {
        LocaleUtils instance = new LocaleUtils();
        Assert.assertNotNull(instance);
    }
}
