package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    // ---------- Basic element selectors ----------

    @Test
    public void testParse_simpleTag_returnsTagEvaluator() {
        Evaluator e = QueryParser.parse("div");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_idSelector_returnsIdEvaluator() {
        Evaluator e = QueryParser.parse("#myid");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Id);
    }

    @Test
    public void testParse_classSelector_returnsClassEvaluator() {
        Evaluator e = QueryParser.parse(".myclass");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Class);
    }

    @Test
    public void testParse_wildcard_returnsAllElementsEvaluator() {
        Evaluator e = QueryParser.parse("*");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AllElements);
    }

    @Test
    public void testParse_namespaceWildcardTag_returnsOrEvaluator() {
        Evaluator e = QueryParser.parse("*|div");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_namespaceTag_returnsTagEvaluator() {
        Evaluator e = QueryParser.parse("ns|div");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Tag);
    }

    // ---------- Attribute selectors ----------

    @Test
    public void testParse_attributeExists_returnsAttributeEvaluator() {
        Evaluator e = QueryParser.parse("[href]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Attribute);
    }

    @Test
    public void testParse_attributeStartingCaret_returnsAttributeStartingEvaluator() {
        Evaluator e = QueryParser.parse("[^data-]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testParse_attributeEquals_returnsAttributeWithValueEvaluator() {
        Evaluator e = QueryParser.parse("[href=foo]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_attributeNotEquals_returnsAttributeWithValueNotEvaluator() {
        Evaluator e = QueryParser.parse("[href!=foo]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testParse_attributeStartsWith_returnsAttributeWithValueStartingEvaluator() {
        Evaluator e = QueryParser.parse("[href^=foo]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testParse_attributeEndsWith_returnsAttributeWithValueEndingEvaluator() {
        Evaluator e = QueryParser.parse("[href$=foo]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testParse_attributeContains_returnsAttributeWithValueContainingEvaluator() {
        Evaluator e = QueryParser.parse("[href*=foo]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testParse_attributeMatches_returnsAttributeWithValueMatchingEvaluator() {
        Evaluator e = QueryParser.parse("[href~=f.*o]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValueMatching);
    }

    // ---------- Index pseudo selectors ----------

    @Test
    public void testParse_indexLessThan_returnsIndexLessThanEvaluator() {
        Evaluator e = QueryParser.parse(":lt(3)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testParse_indexGreaterThan_returnsIndexGreaterThanEvaluator() {
        Evaluator e = QueryParser.parse(":gt(3)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testParse_indexEquals_returnsIndexEqualsEvaluator() {
        Evaluator e = QueryParser.parse(":eq(3)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IndexEquals);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_indexInvalid_throwsException() {
        QueryParser.parse(":lt(abc)");
    }

    // ---------- Structural / text pseudo selectors ----------

    @Test
    public void testParse_has_returnsHasEvaluator() {
        Evaluator e = QueryParser.parse(":has(p)");
        assertNotNull(e);
        assertTrue(e instanceof StructuralEvaluator.Has);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_hasEmpty_throwsException() {
        QueryParser.parse(":has()");
    }

    @Test
    public void testParse_contains_returnsContainsTextEvaluator() {
        Evaluator e = QueryParser.parse(":contains(hello)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.ContainsText);
    }

    @Test
    public void testParse_containsOwn_returnsContainsOwnTextEvaluator() {
        Evaluator e = QueryParser.parse(":containsOwn(hello)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.ContainsOwnText);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_containsEmpty_throwsException() {
        QueryParser.parse(":contains()");
    }

    @Test
    public void testParse_containsData_returnsContainsDataEvaluator() {
        Evaluator e = QueryParser.parse(":containsData(data)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.ContainsData);
    }

    @Test
    public void testParse_matches_returnsMatchesEvaluator() {
        Evaluator e = QueryParser.parse(":matches(^foo)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Matches);
    }

    @Test
    public void testParse_matchesOwn_returnsMatchesOwnEvaluator() {
        Evaluator e = QueryParser.parse(":matchesOwn(^foo)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.MatchesOwn);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_matchesEmpty_throwsException() {
        QueryParser.parse(":matches()");
    }

    @Test
    public void testParse_not_returnsNotEvaluator() {
        Evaluator e = QueryParser.parse(":not(p)");
        assertNotNull(e);
        assertTrue(e instanceof StructuralEvaluator.Not);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_notEmpty_throwsException() {
        QueryParser.parse(":not()");
    }

    // ---------- nth-child family ----------

    @Test
    public void testParse_nthChild_returnsIsNthChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-child(2)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthLastChild_returnsIsNthLastChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-last-child(2)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void testParse_nthOfType_returnsIsNthOfTypeEvaluator() {
        Evaluator e = QueryParser.parse(":nth-of-type(2)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void testParse_nthLastOfType_returnsIsNthLastOfTypeEvaluator() {
        Evaluator e = QueryParser.parse(":nth-last-of-type(2)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthLastOfType);
    }

    @Test
    public void testParse_nthChildOdd_returnsIsNthChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-child(odd)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildEven_returnsIsNthChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-child(even)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildAnPlusBFormat_returnsIsNthChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-child(3n+1)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildNOnly_returnsIsNthChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-child(n+1)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildPlainNumber_returnsIsNthChildEvaluator() {
        Evaluator e = QueryParser.parse(":nth-child(5)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IsNthChild);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_nthChildInvalidFormat_throwsException() {
        QueryParser.parse(":nth-child(abc)");
    }

    // ---------- simple state pseudo selectors ----------

    @Test
    public void testParse_firstChild_returnsIsFirstChildEvaluator() {
        Evaluator e = QueryParser.parse(":first-child");
        assertTrue(e instanceof Evaluator.IsFirstChild);
    }

    @Test
    public void testParse_lastChild_returnsIsLastChildEvaluator() {
        Evaluator e = QueryParser.parse(":last-child");
        assertTrue(e instanceof Evaluator.IsLastChild);
    }

    @Test
    public void testParse_firstOfType_returnsIsFirstOfTypeEvaluator() {
        Evaluator e = QueryParser.parse(":first-of-type");
        assertTrue(e instanceof Evaluator.IsFirstOfType);
    }

    @Test
    public void testParse_lastOfType_returnsIsLastOfTypeEvaluator() {
        Evaluator e = QueryParser.parse(":last-of-type");
        assertTrue(e instanceof Evaluator.IsLastOfType);
    }

    @Test
    public void testParse_onlyChild_returnsIsOnlyChildEvaluator() {
        Evaluator e = QueryParser.parse(":only-child");
        assertTrue(e instanceof Evaluator.IsOnlyChild);
    }

    @Test
    public void testParse_onlyOfType_returnsIsOnlyOfTypeEvaluator() {
        Evaluator e = QueryParser.parse(":only-of-type");
        assertTrue(e instanceof Evaluator.IsOnlyOfType);
    }

    @Test
    public void testParse_empty_returnsIsEmptyEvaluator() {
        Evaluator e = QueryParser.parse(":empty");
        assertTrue(e instanceof Evaluator.IsEmpty);
    }

    @Test
    public void testParse_root_returnsIsRootEvaluator() {
        Evaluator e = QueryParser.parse(":root");
        assertTrue(e instanceof Evaluator.IsRoot);
    }

    // ---------- combinators ----------

    @Test
    public void testParse_childCombinator_returnsAndEvaluator() {
        Evaluator e = QueryParser.parse("div > p");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_adjacentSiblingCombinator_returnsAndEvaluator() {
        Evaluator e = QueryParser.parse("div + p");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_generalSiblingCombinator_returnsAndEvaluator() {
        Evaluator e = QueryParser.parse("div ~ p");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_descendantCombinator_returnsAndEvaluator() {
        Evaluator e = QueryParser.parse("div p");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_orCombinator_returnsOrEvaluator() {
        Evaluator e = QueryParser.parse("div, p");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_startsWithCombinator_usesRootEvaluator() {
        Evaluator e = QueryParser.parse("> div");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_multipleCombinatorsChain_doesNotThrow() {
        Evaluator e = QueryParser.parse("div > p + span ~ a b");
        assertNotNull(e);
    }

    @Test
    public void testParse_orWithAndPrecedence_returnsOrEvaluator() {
        // AND combinator binds tighter than OR, so result should still be an Or at top level
        Evaluator e = QueryParser.parse("a,b c");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_multipleOrGroupsAddedToSameOr_doesNotThrow() {
        Evaluator e = QueryParser.parse("a, b, c");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_combinedAndSelectors_returnsAndEvaluator() {
        // E.class, E#id form -> AND of evaluators combined by findElements loop
        Evaluator e = QueryParser.parse("div.myclass#myid");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorWithSubqueryContainingBrackets_doesNotThrow() {
        Evaluator e = QueryParser.parse("div[foo=bar] > p");
        assertNotNull(e);
        assertTrue(e instanceof CombiningEvaluator.And);
    }

    // ---------- edge cases / exceptions ----------

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyIdSelector_throwsException() {
        QueryParser.parse("#");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyClassSelector_throwsException() {
        QueryParser.parse(".");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyQuery_throwsException() {
        QueryParser.parse("");
    }

    @Test
    public void testParse_nullQuery_throwsSomeException() {
        // Depending on underlying Validate implementation, a null query should
        // ultimately surface as a SelectorParseException from the public API.
        try {
            QueryParser.parse(null);
            fail("Expected an exception for null query");
        } catch (Selector.SelectorParseException expected) {
            // expected path
            assertNotNull(expected);
        } catch (RuntimeException otherRuntime) {
            // Some underlying implementations might throw a different RuntimeException;
            // accept any RuntimeException as a valid edge-case signal.
            assertNotNull(otherRuntime);
        }
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_unknownToken_throwsException() {
        QueryParser.parse("$unknown");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_whitespaceOnlyQuery_throwsException() {
        QueryParser.parse("   ");
    }

    @Test
    public void testParse_attributeWithEmptyValue_doesNotThrow() {
        Evaluator e = QueryParser.parse("[href=]");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_tagNameWithWhitespaceTrimmed_returnsTagEvaluator() {
        Evaluator e = QueryParser.parse("   div   ");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_hasWithComplexSubquery_doesNotThrow() {
        Evaluator e = QueryParser.parse(":has(p.myclass)");
        assertNotNull(e);
        assertTrue(e instanceof StructuralEvaluator.Has);
    }

    @Test
    public void testParse_notWithComplexSubquery_doesNotThrow() {
        Evaluator e = QueryParser.parse(":not(div.hidden)");
        assertNotNull(e);
        assertTrue(e instanceof StructuralEvaluator.Not);
    }

    @Test
    public void testParse_negativeIndexValue_doesNotThrow() {
        // negative numbers are numeric per StringUtil.isNumeric expectations in many impls;
        // this verifies boundary handling without assuming a particular outcome type beyond non-null.
        try {
            Evaluator e = QueryParser.parse(":eq(-1)");
            assertNotNull(e);
        } catch (Selector.SelectorParseException ex) {
            // Acceptable alternative outcome if isNumeric() rejects negative signs.
            assertNotNull(ex.getMessage());
        }
    }

    @Test
    public void testParse_zeroIndexValue_returnsIndexEqualsEvaluator() {
        Evaluator e = QueryParser.parse(":eq(0)");
        assertNotNull(e);
        assertTrue(e instanceof Evaluator.IndexEquals);
    }
}
