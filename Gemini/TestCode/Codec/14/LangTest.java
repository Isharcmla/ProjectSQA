package org.apache.commons.codec.language.bm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LangTest {

    private static final String RESOURCE_NAME = "org/apache/commons/codec/language/bm/lang.txt";

    @Test
    public void testInstance_validNameTypes_returnsNonNull() {
        for (final NameType nameType : NameType.values()) {
            final Lang lang = Lang.instance(nameType);
            Assert.assertNotNull("Lang instance should not be null for " + nameType, lang);
        }
    }

    @Test
    public void testInstance_nullNameType_returnsNull() {
        final Lang lang = Lang.instance(null);
        Assert.assertNull("Lang instance should be null for null NameType", lang);
    }

    @Test
    public void testLoadFromResource_validResource_loadsSuccessfully() {
        final Languages languages = Languages.getInstance(NameType.GENERIC);
        final Lang lang = Lang.loadFromResource(RESOURCE_NAME, languages);
        Assert.assertNotNull("Loaded Lang instance should not be null", lang);
    }

    @Test(expected = IllegalStateException.class)
    public void testLoadFromResource_nonExistentResource_throwsIllegalStateException() {
        final Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang.loadFromResource("org/apache/commons/codec/language/bm/non_existent_file.txt", languages);
    }

    @Test
    public void testGuessLanguage_singleMatch_returnsSpecificLanguage() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final String language = lang.guessLanguage("szczepanski");
        Assert.assertEquals("polish", language);
    }

    @Test
    public void testGuessLanguage_multipleMatches_returnsAny() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final String language = lang.guessLanguage("smith");
        Assert.assertEquals(Languages.ANY, language);
    }

    @Test
    public void testGuessLanguage_emptyString_returnsAny() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final String language = lang.guessLanguage("");
        Assert.assertEquals(Languages.ANY, language);
    }

    @Test
    public void testGuessLanguage_caseInsensitive() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final String languageLower = lang.guessLanguage("szczepanski");
        final String languageUpper = lang.guessLanguage("SZCZEPANSKI");
        final String languageMixed = lang.guessLanguage("SzCzEpAnSkI");

        Assert.assertEquals("polish", languageLower);
        Assert.assertEquals("polish", languageUpper);
        Assert.assertEquals("polish", languageMixed);
    }

    @Test
    public void testGuessLanguages_singleMatch_returnsSingletonLanguageSet() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final Languages.LanguageSet ls = lang.guessLanguages("szczepanski");

        Assert.assertNotNull(ls);
        Assert.assertTrue("Language set should be singleton", ls.isSingleton());
        Assert.assertFalse("Language set should not be empty", ls.isEmpty());
        Assert.assertEquals("polish", ls.getAny());
    }

    @Test
    public void testGuessLanguages_multipleMatches_returnsNonSingletonSet() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final Languages.LanguageSet ls = lang.guessLanguages("rossi");

        Assert.assertNotNull(ls);
        Assert.assertFalse("Language set should not be empty", ls.isEmpty());
        Assert.assertEquals("italian", lang.guessLanguage("rossi"));
    }

    @Test
    public void testGuessLanguages_emptyString_returnsLanguagesSet() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        final Languages.LanguageSet ls = lang.guessLanguages("");

        Assert.assertNotNull(ls);
        Assert.assertFalse("Language set should not be empty for empty string", ls.isEmpty());
    }

    @Test
    public void testGuessLanguages_allNameTypesCoverage() {
        final String testWord = "abram";
        for (final NameType nameType : NameType.values()) {
            final Lang lang = Lang.instance(nameType);
            final Languages.LanguageSet ls = lang.guessLanguages(testWord);
            final String language = lang.guessLanguage(testWord);

            Assert.assertNotNull(ls);
            Assert.assertNotNull(language);
        }
    }

    @Test(expected = NullPointerException.class)
    public void testGuessLanguage_nullInput_throwsNullPointerException() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        lang.guessLanguage(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGuessLanguages_nullInput_throwsNullPointerException() {
        final Lang lang = Lang.instance(NameType.GENERIC);
        lang.guessLanguages(null);
    }
}
