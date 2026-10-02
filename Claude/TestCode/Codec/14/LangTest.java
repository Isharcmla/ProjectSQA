package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LangTest {

    @Test
    public void testInstance_genericNameType_returnsNonNullLang() {
        Lang lang = Lang.instance(NameType.GENERIC);
        assertNotNull(lang);
    }

    @Test
    public void testInstance_ashkenaziNameType_returnsNonNullLang() {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        assertNotNull(lang);
    }

    @Test
    public void testInstance_sephardicNameType_returnsNonNullLang() {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        assertNotNull(lang);
    }

    @Test
    public void testLoadFromResource_validResource_returnsLangInstance() {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang lang = Lang.loadFromResource("org/apache/commons/codec/language/bm/lang.txt", languages);
        assertNotNull(lang);
    }

    @Test
    public void testLoadFromResource_sephardicLanguages_returnsLangInstance() {
        Languages languages = Languages.getInstance(NameType.SEPHARDIC);
        Lang lang = Lang.loadFromResource("org/apache/commons/codec/language/bm/lang.txt", languages);
        assertNotNull(lang);
    }

    @Test
    public void testLoadFromResource_ashkenaziLanguages_returnsLangInstance() {
        Languages languages = Languages.getInstance(NameType.ASHKENAZI);
        Lang lang = Lang.loadFromResource("org/apache/commons/codec/language/bm/lang.txt", languages);
        assertNotNull(lang);
    }

    @Test(expected = IllegalStateException.class)
    public void testLoadFromResource_nonExistentResource_throwsIllegalStateException() {
        Languages languages = Languages.getInstance(NameType.GENERIC);
        Lang.loadFromResource("nonexistent/resource/path/that/does/not/exist.txt", languages);
    }

    @Test
    public void testGuessLanguage_typicalWord_returnsNonNullResult() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result = lang.guessLanguage("Smith");
        assertNotNull(result);
    }

    @Test
    public void testGuessLanguage_emptyString_returnsAny() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result = lang.guessLanguage("");
        assertNotNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testGuessLanguage_nullInput_throwsNullPointerException() {
        Lang lang = Lang.instance(NameType.GENERIC);
        lang.guessLanguage(null);
    }

    @Test
    public void testGuessLanguages_typicalWord_returnsNonNullLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("Wojciech");
        assertNotNull(ls);
    }

    @Test
    public void testGuessLanguages_emptyString_returnsLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("");
        assertNotNull(ls);
    }

    @Test(expected = NullPointerException.class)
    public void testGuessLanguages_nullInput_throwsNullPointerException() {
        Lang lang = Lang.instance(NameType.GENERIC);
        lang.guessLanguages(null);
    }

    @Test
    public void testGuessLanguages_upperCaseInput_sameAsLowerCase() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet lsUpper = lang.guessLanguages("SMITH");
        Languages.LanguageSet lsLower = lang.guessLanguages("smith");
        assertEquals(lsLower, lsUpper);
    }

    @Test
    public void testGuessLanguage_ashkenaziNameType_returnsNonNullResult() {
        Lang lang = Lang.instance(NameType.ASHKENAZI);
        String result = lang.guessLanguage("Rosenberg");
        assertNotNull(result);
    }

    @Test
    public void testGuessLanguage_sephardicNameType_returnsNonNullResult() {
        Lang lang = Lang.instance(NameType.SEPHARDIC);
        String result = lang.guessLanguage("Cohen");
        assertNotNull(result);
    }

    @Test
    public void testGuessLanguages_specialCharacters_returnsNonNullLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("O'Brien-123");
        assertNotNull(ls);
    }

    @Test
    public void testGuessLanguages_numericInput_returnsLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("12345");
        assertNotNull(ls);
    }

    @Test
    public void testGuessLanguages_singleCharacter_returnsLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("a");
        assertNotNull(ls);
    }

    @Test
    public void testGuessLanguages_longString_returnsLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append("abcdefg");
        }
        Languages.LanguageSet ls = lang.guessLanguages(sb.toString());
        assertNotNull(ls);
    }

    @Test
    public void testGuessLanguage_multipleWords_returnsConsistentResults() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result1 = lang.guessLanguage("Johnson");
        String result2 = lang.guessLanguage("Johnson");
        assertEquals(result1, result2);
    }

    @Test
    public void testGuessLanguages_isSingletonCheck_worksAsExpected() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("xyz123nonexistentpattern");
        assertNotNull(ls);
        // just verify no exception and singleton check doesn't crash
        if (ls.isSingleton()) {
            assertNotNull(ls.getAny());
        } else {
            assertFalse(ls.isSingleton());
        }
    }

    @Test
    public void testLoadFromResource_multipleCallsSameResource_producesEquivalentResults() {
        Languages languages1 = Languages.getInstance(NameType.GENERIC);
        Languages languages2 = Languages.getInstance(NameType.GENERIC);
        Lang lang1 = Lang.loadFromResource("org/apache/commons/codec/language/bm/lang.txt", languages1);
        Lang lang2 = Lang.loadFromResource("org/apache/commons/codec/language/bm/lang.txt", languages2);
        assertNotNull(lang1);
        assertNotNull(lang2);
        String result1 = lang1.guessLanguage("Smith");
        String result2 = lang2.guessLanguage("Smith");
        assertEquals(result1, result2);
    }

    @Test
    public void testGuessLanguages_whitespaceOnlyInput_returnsLanguageSet() {
        Lang lang = Lang.instance(NameType.GENERIC);
        Languages.LanguageSet ls = lang.guessLanguages("   ");
        assertNotNull(ls);
    }

    @Test
    public void testInstance_allNameTypeValues_returnNonNullLangs() {
        for (NameType nameType : NameType.values()) {
            Lang lang = Lang.instance(nameType);
            assertNotNull(lang);
        }
    }

    @Test
    public void testGuessLanguage_mixedCaseInput_returnsNonNullResult() {
        Lang lang = Lang.instance(NameType.GENERIC);
        String result = lang.guessLanguage("MiXeDcAsE");
        assertNotNull(result);
    }
}
