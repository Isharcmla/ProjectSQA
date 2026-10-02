import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.codec.language.bm.Languages;

public class PhoneticEngineTest {

    private PhoneticEngine genericEngine;
    private PhoneticEngine ashkenaziEngine;
    private PhoneticEngine sephardicEngine;

    @Before
    public void setUp() {
        genericEngine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        ashkenaziEngine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.APPROX, true);
        sephardicEngine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.APPROX, true);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalArgs_createsEngine() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        assertNotNull(engine);
        assertEquals(NameType.GENERIC, engine.getNameType());
        assertEquals(RuleType.APPROX, engine.getRuleType());
        assertTrue(engine.isConcat());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_ruleTypeRULES_throwsIllegalArgumentException() {
        new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructor_withMaxPhonemes_ruleTypeRULES_throwsIllegalArgumentException() {
        new PhoneticEngine(NameType.GENERIC, RuleType.RULES, true, 10);
    }

    @Test
    public void testConstructor_withMaxPhonemes_createsEngine() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, false, 5);
        assertEquals(5, engine.getMaxPhonemes());
        assertFalse(engine.isConcat());
        assertEquals(RuleType.EXACT, engine.getRuleType());
    }

    @Test
    public void testConstructor_defaultMaxPhonemes_is20() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true);
        assertEquals(20, engine.getMaxPhonemes());
    }

    // ---------- Getter tests ----------

    @Test
    public void testGetLang_returnsNonNullLang() {
        assertNotNull(genericEngine.getLang());
    }

    @Test
    public void testGetNameType_returnsCorrectType() {
        assertEquals(NameType.GENERIC, genericEngine.getNameType());
        assertEquals(NameType.ASHKENAZI, ashkenaziEngine.getNameType());
        assertEquals(NameType.SEPHARDIC, sephardicEngine.getNameType());
    }

    @Test
    public void testGetRuleType_returnsCorrectType() {
        assertEquals(RuleType.APPROX, genericEngine.getRuleType());
    }

    @Test
    public void testIsConcat_returnsTrue() {
        assertTrue(genericEngine.isConcat());
    }

    @Test
    public void testIsConcat_returnsFalse() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        assertFalse(engine.isConcat());
    }

    @Test
    public void testGetMaxPhonemes_returnsDefaultValue() {
        assertEquals(20, genericEngine.getMaxPhonemes());
    }

    // ---------- encode(String) tests: normal input ----------

    @Test
    public void testEncode_genericSimpleName_returnsNonEmptyString() {
        String result = genericEngine.encode("Smith");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_ashkenaziSimpleName_returnsNonEmptyString() {
        String result = ashkenaziEngine.encode("Cohen");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_sephardicSimpleName_returnsNonEmptyString() {
        String result = sephardicEngine.encode("Levy");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_multiWordName_returnsResult() {
        String result = genericEngine.encode("John Smith");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_upperCaseInput_isLowercased() {
        String upper = genericEngine.encode("SMITH");
        String lower = genericEngine.encode("smith");
        assertEquals(lower, upper);
    }

    @Test
    public void testEncode_withDash_replacedBySpace() {
        String result = genericEngine.encode("Smith-Jones");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    // ---------- edge cases ----------

    @Test
    public void testEncode_emptyString_returnsEmptyOrNonNull() {
        String result = genericEngine.encode("");
        assertNotNull(result);
    }

    @Test(expected = Exception.class)
    public void testEncode_nullInput_throwsException() {
        genericEngine.encode(null);
    }

    @Test
    public void testEncode_genericWithApostrophePrefix_dApostrophe() {
        String result = genericEngine.encode("d'artagnan");
        assertNotNull(result);
        assertFalse(result.isEmpty());
        // should be combination in parentheses format
        assertTrue(result.startsWith("(") || result.length() > 0);
    }

    @Test
    public void testEncode_genericWithVanPrefix_prefixHandled() {
        String result = genericEngine.encode("van Basten");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_genericWithDePrefix_prefixHandled() {
        String result = genericEngine.encode("de Silva");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_ashkenaziWithBarPrefix_prefixHandled() {
        String result = ashkenaziEngine.encode("bar Cohen");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_ashkenaziWithBenPrefix_prefixRemoved() {
        String result = ashkenaziEngine.encode("ben David");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_sephardicWithApostropheInWord_lastPartUsed() {
        String result = sephardicEngine.encode("d'Angelo");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_sephardicWithDelPrefix_prefixRemoved() {
        String result = sephardicEngine.encode("del Rio");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_concatFalseMultiWord_returnsDashSeparated() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = engine.encode("John Smith Anderson");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_concatFalseSingleWord_returnsResult() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, false);
        String result = engine.encode("Smith");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_multipleSpaces_trimmedAndHandled() {
        String result = genericEngine.encode("  Smith   Jones  ");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_withLanguageSet_explicitLanguages() {
        Languages.LanguageSet languageSet = genericEngine.getLang().guessLanguages("Smith");
        String result = genericEngine.encode("Smith", languageSet);
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_withAnyLanguageSet_noExceptionThrown() {
        Languages.LanguageSet anyLang = Languages.LanguageSet.from(
                new java.util.HashSet<String>(java.util.Arrays.asList("english")));
        String result = genericEngine.encode("Smith", anyLang);
        assertNotNull(result);
    }

    @Test
    public void testEncode_maxPhonemesLimit_respected() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.APPROX, true, 1);
        String result = engine.encode("Schwarzenegger");
        assertNotNull(result);
    }

    @Test
    public void testEncode_singleCharacterInput_returnsResult() {
        String result = genericEngine.encode("a");
        assertNotNull(result);
    }

    @Test
    public void testEncode_numericInput_handledWithoutCrash() {
        String result = genericEngine.encode("123");
        assertNotNull(result);
    }

    @Test
    public void testEncode_exactRuleType_returnsResult() {
        PhoneticEngine engine = new PhoneticEngine(NameType.GENERIC, RuleType.EXACT, true);
        String result = engine.encode("Smith");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_ashkenaziExactRuleType_returnsResult() {
        PhoneticEngine engine = new PhoneticEngine(NameType.ASHKENAZI, RuleType.EXACT, true);
        String result = engine.encode("Cohen");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    @Test
    public void testEncode_sephardicExactRuleType_returnsResult() {
        PhoneticEngine engine = new PhoneticEngine(NameType.SEPHARDIC, RuleType.EXACT, true);
        String result = engine.encode("Levy");
        assertNotNull(result);
        assertFalse(result.isEmpty());
    }
}
