package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PhoneticEngineTest {

    @Test
    public void testConstructorAndGetters_threeArgs() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        assertEquals(NameType.GENERIC, engine.getNameType());
        assertEquals(RuleType.APPROX, engine.getRuleType());
        assertTrue(engine.isConcat());
        assertEquals(20, engine.getMaxPhonemes());
        assertNotNull(engine.getLang());
    }

    @Test
    public void testConstructorAndGetters_fourArgs() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, false, 10);
        assertEquals(NameType.ASHKENAZI, engine.getNameType());
        assertEquals(RuleType.EXACT, engine.getRuleType());
        assertFalse(engine.isConcat());
        assertEquals(10, engine.getMaxPhonemes());
        assertNotNull(engine.getLang());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_rulesRuleType_throwsIllegalArgumentException() {
        new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true);
    }

    @Test
    public void testEncode_genericSingleWord() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        final String encoded = engine.encode("Smith");
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
    }

    @Test
    public void testEncode_genericDApostrophe() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        final String encoded = engine.encode("d'Angelo");
        assertNotNull(encoded);
        assertTrue(encoded.startsWith("("));
        assertTrue(encoded.contains(")-("));
    }

    @Test
    public void testEncode_genericPrefixMatch() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        final String encoded = engine.encode("van der Bilt");
        assertNotNull(encoded);
        assertTrue(encoded.startsWith("("));
        assertTrue(encoded.contains(")-("));
    }

    @Test
    public void testEncode_genericMultiWord_concatTrue() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        final String encoded = engine.encode("Jean-Pierre");
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
    }

    @Test
    public void testEncode_genericMultiWord_concatFalse() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        final String encoded = engine.encode("Jean Pierre");
        assertNotNull(encoded);
        assertTrue(encoded.contains("-"));
    }

    @Test
    public void testEncode_genericSingleWord_concatFalse() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false);
        final String encoded = engine.encode("Smith");
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
        assertFalse(encoded.contains("-"));
    }

    @Test
    public void testEncode_ashkenaziWithPrefix() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true);
        final String encodedWithPrefix = engine.encode("bar Cohen");
        final String encodedWithoutPrefix = engine.encode("Cohen");
        assertEquals(encodedWithoutPrefix, encodedWithPrefix);
    }

    @Test
    public void testEncode_sephardicWithPrefixAndApostrophe() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true);
        final String encoded = engine.encode("al'Habib");
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
    }

    @Test
    public void testEncode_sephardicMultiWordPrefixRemoval() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true);
        final String encodedWithPrefix = engine.encode("de Silva");
        final String encodedWithoutPrefix = engine.encode("Silva");
        assertEquals(encodedWithoutPrefix, encodedWithPrefix);
    }

    @Test
    public void testEncode_withExplicitLanguageSet() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        final Languages.LanguageSet langSet = Languages.LanguageSet.from(new HashSet<String>(Collections.singletonList("french")));
        final String encoded = engine.encode("dupont", langSet);
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
    }

    @Test
    public void testEncode_withAnyLanguageSet() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        final String encoded = engine.encode("test", Languages.ANY_LANGUAGE);
        assertNotNull(encoded);
        assertFalse(encoded.isEmpty());
    }

    @Test
    public void testEncode_withUnmatchedCharacters() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        final String encoded = engine.encode("12345");
        assertNotNull(encoded);
    }

    @Test
    public void testEncode_emptyString() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        final String encoded = engine.encode("");
        assertEquals("", encoded);
    }

    @Test
    public void testEncode_maxPhonemesExceeded() {
        final PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 1);
        final String encoded = engine.encode("Alexander");
        assertNotNull(encoded);
        assertFalse(encoded.contains("|"));
    }

    @Test
    public void testPhonemeBuilder_emptyAndAppend() {
        final Languages.LanguageSet langSet = Languages.LanguageSet.from(new HashSet<String>(Collections.singletonList("english")));
        final PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);
        assertEquals("", builder.makeString());
        assertEquals(1, builder.getPhonemes().size());

        builder.append("test");
        assertEquals("test", builder.makeString());
    }

    @Test
    public void testPhonemeBuilder_applyWithMaxLimit() {
        final Languages.LanguageSet langSet = Languages.ANY_LANGUAGE;
        final PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);

        final Rule.Phoneme ph1 = new Rule.Phoneme("a", langSet);
        final Rule.Phoneme ph2 = new Rule.Phoneme("b", langSet);
        final Rule.PhonemeList phList = new Rule.PhonemeList(java.util.Arrays.asList(ph1, ph2));

        builder.apply(phList, 1);
        assertEquals(1, builder.getPhonemes().size());
        assertEquals("a", builder.makeString());
    }

    @Test
    public void testPhonemeBuilder_makeStringMultiplePhonemes() {
        final Languages.LanguageSet langSet = Languages.ANY_LANGUAGE;
        final PhoneticEngine.PhonemeBuilder builder = PhoneticEngine.PhonemeBuilder.empty(langSet);

        final Rule.Phoneme ph1 = new Rule.Phoneme("a", langSet);
        final Rule.Phoneme ph2 = new Rule.Phoneme("b", langSet);
        final Rule.PhonemeList phList = new Rule.PhonemeList(java.util.Arrays.asList(ph1, ph2));

        builder.apply(phList, 5);
        final Set<Rule.Phoneme> phonemes = builder.getPhonemes();
        assertEquals(2, phonemes.size());
        assertEquals("a|b", builder.makeString());
    }
}
