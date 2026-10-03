package org.apache.commons.codec.language.bm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.codec.language.bm.Languages.LanguageSet;
import org.junit.Test;

public class RuleTest {

    @Test
    public void testPhonemeConstructorAndGetters() {
        LanguageSet langs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("french", "english")));
        Rule.Phoneme phoneme = new Rule.Phoneme("test", langs);

        assertEquals("test", phoneme.getPhonemeText().toString());
        assertEquals(langs, phoneme.getLanguages());
        assertEquals("test[" + langs.toString() + "]", phoneme.toString());

        Iterable<Rule.Phoneme> iterable = phoneme.getPhonemes();
        assertNotNull(iterable);
        List<Rule.Phoneme> list = new ArrayList<Rule.Phoneme>();
        for (Rule.Phoneme p : iterable) {
            list.add(p);
        }
        assertEquals(1, list.size());
        assertSame(phoneme, list.get(0));
    }

    @Test
    public void testPhonemeAppend() {
        Rule.Phoneme phoneme = new Rule.Phoneme("foo", Languages.ANY_LANGUAGE);
        Rule.Phoneme result = phoneme.append("bar");
        assertSame(phoneme, result);
        assertEquals("foobar", phoneme.getPhonemeText().toString());
    }

    @Test
    public void testPhonemeCombinedConstructors() {
        LanguageSet langSet1 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("french")));
        LanguageSet langSet2 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("english")));

        Rule.Phoneme left = new Rule.Phoneme("left", langSet1);
        Rule.Phoneme right = new Rule.Phoneme("right", langSet2);

        Rule.Phoneme combined2Args = new Rule.Phoneme(left, right);
        assertEquals("leftright", combined2Args.getPhonemeText().toString());
        assertEquals(langSet1, combined2Args.getLanguages());

        LanguageSet customLangs = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("german")));
        Rule.Phoneme combined3Args = new Rule.Phoneme(left, right, customLangs);
        assertEquals("leftright", combined3Args.getPhonemeText().toString());
        assertEquals(customLangs, combined3Args.getLanguages());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testPhonemeJoin() {
        LanguageSet langSet1 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("french", "english")));
        LanguageSet langSet2 = Languages.LanguageSet.from(new HashSet<String>(Arrays.asList("english", "german")));

        Rule.Phoneme left = new Rule.Phoneme("abc", langSet1);
        Rule.Phoneme right = new Rule.Phoneme("def", langSet2);

        Rule.Phoneme joined = left.join(right);
        assertEquals("abcdef", joined.getPhonemeText().toString());
        assertTrue(joined.getLanguages().contains("english"));
        assertFalse(joined.getLanguages().contains("french"));
        assertFalse(joined.getLanguages().contains("german"));
    }

    @Test
    public void testPhonemeComparator() {
        Rule.Phoneme p1 = new Rule.Phoneme("abc", Languages.ANY_LANGUAGE);
        Rule.Phoneme p2 = new Rule.Phoneme("abc", Languages.ANY_LANGUAGE);
        Rule.Phoneme p3 = new Rule.Phoneme("abcd", Languages.ANY_LANGUAGE);
        Rule.Phoneme p4 = new Rule.Phoneme("abd", Languages.ANY_LANGUAGE);
        Rule.Phoneme p5 = new Rule.Phoneme("abb", Languages.ANY_LANGUAGE);

        assertEquals(0, Rule.Phoneme.COMPARATOR.compare(p1, p2));
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p3) < 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p3, p1) > 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p4) < 0);
        assertTrue(Rule.Phoneme.COMPARATOR.compare(p1, p5) > 0);
    }

    @Test
    public void testPhonemeList() {
        Rule.Phoneme p1 = new Rule.Phoneme("a", Languages.ANY_LANGUAGE);
        Rule.Phoneme p2 = new Rule.Phoneme("b", Languages.ANY_LANGUAGE);
        List<Rule.Phoneme> list = Arrays.asList(p1, p2);

        Rule.PhonemeList phonemeList = new Rule.PhonemeList(list);
        assertEquals(list, phonemeList.getPhonemes());
    }

    @Test
    public void testAllStringsRMHeading() {
        assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch(""));
        assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch("anything"));
        assertTrue(Rule.ALL_STRINGS_RMATCHER.isMatch(null));
    }

    @Test
    public void testRuleCreationAndGetters() {
        Rule.Phoneme phoneme = new Rule.Phoneme("out", Languages.ANY_LANGUAGE);
        Rule rule = new Rule("pat", "left", "right", phoneme);

        assertEquals("pat", rule.getPattern());
        assertSame(phoneme, rule.getPhoneme());
        assertNotNull(rule.getLContext());
        assertNotNull(rule.getRContext());
    }

    @Test
    public void testPatternAndContextMatches_Success() {
        Rule.Phoneme phoneme = new Rule.Phoneme("res", Languages.ANY_LANGUAGE);
        Rule rule = new Rule("mid", "start", "end", phoneme);

        assertTrue(rule.patternAndContextMatches("startmidend", 5));
    }

    @Test
    public void testPatternAndContextMatches_Failures() {
        Rule.Phoneme phoneme = new Rule.Phoneme("res", Languages.ANY_LANGUAGE);
        Rule rule = new Rule("mid", "start", "end", phoneme);

        // Pattern does not match
        assertFalse(rule.patternAndContextMatches("startxyzend", 5));
        // Not enough length for pattern
        assertFalse(rule.patternAndContextMatches("startm", 5));
        // Left context does not match
        assertFalse(rule.patternAndContextMatches("wrongmidend", 5));
        // Right context does not match
        assertFalse(rule.patternAndContextMatches("startmidwrong", 5));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPatternAndContextMatches_NegativeIndex() {
        Rule.Phoneme phoneme = new Rule.Phoneme("res", Languages.ANY_LANGUAGE);
        Rule rule = new Rule("mid", "start", "end", phoneme);
        rule.patternAndContextMatches("startmidend", -1);
    }

    @Test
    public void testRulePatternOptimizations() {
        Rule.Phoneme ph = new Rule.Phoneme("", Languages.ANY_LANGUAGE);

        // Exact match empty
        Rule ruleEmptyExact = new Rule("a", "^", "", ph);
        assertTrue(ruleEmptyExact.getLContext().isMatch(""));
        assertFalse(ruleEmptyExact.getLContext().isMatch("b"));

        // Exact match non-empty
        Rule ruleExact = new Rule("a", "^abc", "", ph);
        assertTrue(ruleExact.getLContext().isMatch("abc"));
        assertFalse(ruleExact.getLContext().isMatch("abcd"));
        assertFalse(ruleExact.getLContext().isMatch("ab"));

        // Starts-with prefix
        Rule ruleStarts = new Rule("a", "^abc.*", "", ph);
        // LContext appends '$', so '^abc.*$' becomes fallback regex
        assertTrue(ruleStarts.getLContext().isMatch("abcdef"));

        // RContext starts with regex pattern optimization: "^" + rContext
        Rule ruleRStarts = new Rule("a", "", "def", ph); // "^def"
        assertTrue(ruleRStarts.getRContext().isMatch("defghi"));
        assertFalse(ruleRStarts.getRContext().isMatch("de"));
        assertFalse(ruleRStarts.getRContext().isMatch("adef"));

        // Box patterns: startsWith & endsWith: ^[abc]$
        Rule ruleBoxExact = new Rule("a", "^[abc]", "", ph); // lContext becomes "^[abc]$"
        assertTrue(ruleBoxExact.getLContext().isMatch("a"));
        assertTrue(ruleBoxExact.getLContext().isMatch("b"));
        assertFalse(ruleBoxExact.getLContext().isMatch("d"));
        assertFalse(ruleBoxExact.getLContext().isMatch("ab"));
        assertFalse(ruleBoxExact.getLContext().isMatch(""));

        // Box negated exact: ^[^abc]$
        Rule ruleBoxNegExact = new Rule("a", "^[^abc]", "", ph); // lContext becomes "^[^abc]$"
        assertTrue(ruleBoxNegExact.getLContext().isMatch("d"));
        assertFalse(ruleBoxNegExact.getLContext().isMatch("a"));
        assertFalse(ruleBoxNegExact.getLContext().isMatch(""));
        assertFalse(ruleBoxNegExact.getLContext().isMatch("dd"));

        // Box startsWith: ^[abc]
        Rule ruleBoxStarts = new Rule("a", "", "[abc]", ph); // rContext becomes "^[abc]"
        assertTrue(ruleBoxStarts.getRContext().isMatch("axyz"));
        assertTrue(ruleBoxStarts.getRContext().isMatch("b"));
        assertFalse(ruleBoxStarts.getRContext().isMatch("dxyz"));
        assertFalse(ruleBoxStarts.getRContext().isMatch(""));

        // Box negated startsWith: ^[^abc]
        Rule ruleBoxNegStarts = new Rule("a", "", "[^abc]", ph); // rContext becomes "^[^abc]"
        assertTrue(ruleBoxNegStarts.getRContext().isMatch("dxyz"));
        assertFalse(ruleBoxNegStarts.getRContext().isMatch("axyz"));
        assertFalse(ruleBoxNegStarts.getRContext().isMatch(""));

        // Box endsWith: [abc]$
        Rule ruleBoxEnds = new Rule("a", "[abc]", "", ph); // lContext becomes "[abc]$"
        assertTrue(ruleBoxEnds.getLContext().isMatch("xyza"));
        assertTrue(ruleBoxEnds.getLContext().isMatch("b"));
        assertFalse(ruleBoxEnds.getLContext().isMatch("xyzd"));
        assertFalse(ruleBoxEnds.getLContext().isMatch(""));

        // Box negated endsWith: [^abc]$
        Rule ruleBoxNegEnds = new Rule("a", "[^abc]", "", ph); // lContext becomes "[^abc]$"
        assertTrue(ruleBoxNegEnds.getLContext().isMatch("xyzd"));
        assertFalse(ruleBoxNegEnds.getLContext().isMatch("xyza"));
        assertFalse(ruleBoxNegEnds.getLContext().isMatch(""));

        // Complex regex fallback
        Rule ruleFallback = new Rule("a", "(abc|def)", "g(h|i)j", ph);
        assertTrue(ruleFallback.getLContext().isMatch("prefixabc"));
        assertTrue(ruleFallback.getLContext().isMatch("def"));
        assertFalse(ruleFallback.getLContext().isMatch("xyz"));
        assertTrue(ruleFallback.getRContext().isMatch("ghjrest"));
        assertTrue(ruleFallback.getRContext().isMatch("gij"));
        assertFalse(ruleFallback.getRContext().isMatch("gaj"));
    }

    @Test
    public void testGetInstance_NameTypeRuleTypeLanguageSet() {
        List<Rule> rules = Rule.getInstance(NameType.GENERIC, RuleType.EXACT, Languages.LanguageSet.from(Collections.singleton("english")));
        assertNotNull(rules);
        assertFalse(rules.isEmpty());

        List<Rule> anyRules = Rule.getInstance(NameType.GENERIC, RuleType.EXACT, Languages.ANY_LANGUAGE);
        assertNotNull(anyRules);
        assertFalse(anyRules.isEmpty());
    }

    @Test
    public void testGetInstance_NameTypeRuleTypeString() {
        List<Rule> rules = Rule.getInstance(NameType.GENERIC, RuleType.EXACT, "english");
        assertNotNull(rules);
        assertFalse(rules.isEmpty());
    }

    @Test
    public void testGetInstanceMap_NameTypeRuleTypeLanguageSet() {
        Map<String, List<Rule>> ruleMapSingleton = Rule.getInstanceMap(
                NameType.ASHKENAZI,
                RuleType.APPROX,
                Languages.LanguageSet.from(Collections.singleton("russian"))
        );
        assertNotNull(ruleMapSingleton);
        assertFalse(ruleMapSingleton.isEmpty());

        Map<String, List<Rule>> ruleMapAny = Rule.getInstanceMap(
                NameType.ASHKENAZI,
                RuleType.APPROX,
                Languages.ANY_LANGUAGE
        );
        assertNotNull(ruleMapAny);
        assertFalse(ruleMapAny.isEmpty());
    }

    @Test
    public void testGetInstanceMap_NameTypeRuleTypeString() {
        Map<String, List<Rule>> ruleMap = Rule.getInstanceMap(NameType.SEPHARDIC, RuleType.RULES, "spanish");
        assertNotNull(ruleMap);
        assertFalse(ruleMap.isEmpty());

        // Verify rules have toString with line and loc
        for (List<Rule> list : ruleMap.values()) {
            for (Rule r : list) {
                String str = r.toString();
                assertNotNull(str);
                assertTrue(str.startsWith("Rule{line="));
                break;
            }
            break;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetInstanceMap_InvalidLanguage() {
        Rule.getInstanceMap(NameType.GENERIC, RuleType.EXACT, "non_existing_language");
    }

    @Test
    public void testConstants() {
        assertEquals("ALL", Rule.ALL);
    }
}
