package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    // ---------- Normal / typical cases ----------

    @Test
    public void testParse_tagSelector_returnsTagEvaluator() {
        Evaluator eval = QueryParser.parse("div");
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_idSelector_returnsIdEvaluator() {
        Evaluator eval = QueryParser.parse("#my-id");
        assertTrue(eval instanceof Evaluator.Id);
    }

    @Test
    public void testParse_classSelector_returnsClassEvaluator() {
        Evaluator eval = QueryParser.parse(".my_class");
        assertTrue(eval instanceof Evaluator.Class);
    }

    @Test
    public void testParse_universalSelector_returnsAllElementsEvaluator() {
        Evaluator eval = QueryParser.parse("*");
        assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void testParse_attributeSelectorNoValue_returnsAttributeEvaluator() {
        Evaluator eval = QueryParser.parse("[data-foo]");
        assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void testParse_attributeSelectorStartingCaret_returnsAttributeStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[^data]");
        assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testParse_attributeSelectorEquals_returnsAttributeWithValueEvaluator() {
        Evaluator eval = QueryParser.parse("[attr=value]");
        assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_attributeSelectorNotEquals_returnsAttributeWithValueNotEvaluator() {
        Evaluator eval = QueryParser.parse("[attr!=value]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testParse_attributeSelectorStartsWith_returnsAttributeWithValueStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[attr^=value]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testParse_attributeSelectorEndsWith_returnsAttributeWithValueEndingEvaluator() {
        Evaluator eval = QueryParser.parse("[attr$=value]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testParse_attributeSelectorContains_returnsAttributeWithValueContainingEvaluator() {
        Evaluator eval = QueryParser.parse("[attr*=value]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testParse_attributeSelectorMatches_returnsAttributeWithValueMatchingEvaluator() {
        Evaluator eval = QueryParser.parse("[attr~=va.*]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test
    public void testParse_combinatorChild_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div > p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorAdjacentSibling_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div + p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorGeneralSibling_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div ~ p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorDescendant_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorOr_returnsOrEvaluator() {
        Evaluator eval = QueryParser.parse("div, p");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_combinatorOrMultiple_returnsOrEvaluator() {
        Evaluator eval = QueryParser.parse("div, p, span");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_orWithChildPrecedence_returnsOrEvaluator() {
        Evaluator eval = QueryParser.parse("p, div > a");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_leadingCombinator_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("> div");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_multipleAnd_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div.class#id");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_pseudoIndexLessThan_returnsIndexLessThanEvaluator() {
        Evaluator eval = QueryParser.parse(":lt(3)");
        assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testParse_pseudoIndexGreaterThan_returnsIndexGreaterThanEvaluator() {
        Evaluator eval = QueryParser.parse(":gt(3)");
        assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testParse_pseudoIndexEquals_returnsIndexEqualsEvaluator() {
        Evaluator eval = QueryParser.parse(":eq(3)");
        assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test
    public void testParse_pseudoHas_returnsHasEvaluator() {
        Evaluator eval = QueryParser.parse(":has(p)");
        assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test
    public void testParse_pseudoHasNested_returnsHasEvaluator() {
        Evaluator eval = QueryParser.parse(":has(p:contains(word))");
        assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test
    public void testParse_pseudoContains_returnsContainsTextEvaluator() {
        Evaluator eval = QueryParser.parse(":contains(text)");
        assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test
    public void testParse_pseudoContainsOwn_returnsContainsOwnTextEvaluator() {
        Evaluator eval = QueryParser.parse(":containsOwn(text)");
        assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test
    public void testParse_pseudoContainsData_returnsContainsDataEvaluator() {
        Evaluator eval = QueryParser.parse(":containsData(text)");
        assertTrue(eval instanceof Evaluator.ContainsData);
    }

    @Test
    public void testParse_pseudoMatches_returnsMatchesEvaluator() {
        Evaluator eval = QueryParser.parse(":matches(reg.*ex)");
        assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void testParse_pseudoMatchesOwn_returnsMatchesOwnEvaluator() {
        Evaluator eval = QueryParser.parse(":matchesOwn(reg.*ex)");
        assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test
    public void testParse_pseudoNot_returnsNotEvaluator() {
        Evaluator eval = QueryParser.parse(":not(p)");
        assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test
    public void testParse_nthChild_returnsIsNthChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-child(2)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildOdd_returnsIsNthChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-child(odd)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildEven_returnsIsNthChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-child(even)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildFormula_returnsIsNthChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-child(2n+1)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildNegativeFormula_returnsIsNthChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-child(-2n+3)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChildJustN_returnsIsNthChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-child(n)");
        assertTrue(eval instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthLastChild_returnsIsNthLastChildEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-last-child(2)");
        assertTrue(eval instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void testParse_nthOfType_returnsIsNthOfTypeEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-of-type(2)");
        assertTrue(eval instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void testParse_nthLastOfType_returnsIsNthLastOfTypeEvaluator() {
        Evaluator eval = QueryParser.parse(":nth-last-of-type(2)");
        assertTrue(eval instanceof Evaluator.IsNthLastOfType);
    }

    @Test
    public void testParse_firstChild_returnsIsFirstChildEvaluator() {
        Evaluator eval = QueryParser.parse(":first-child");
        assertTrue(eval instanceof Evaluator.IsFirstChild);
    }

    @Test
    public void testParse_lastChild_returnsIsLastChildEvaluator() {
        Evaluator eval = QueryParser.parse(":last-child");
        assertTrue(eval instanceof Evaluator.IsLastChild);
    }

    @Test
    public void testParse_firstOfType_returnsIsFirstOfTypeEvaluator() {
        Evaluator eval = QueryParser.parse(":first-of-type");
        assertTrue(eval instanceof Evaluator.IsFirstOfType);
    }

    @Test
    public void testParse_lastOfType_returnsIsLastOfTypeEvaluator() {
        Evaluator eval = QueryParser.parse(":last-of-type");
        assertTrue(eval instanceof Evaluator.IsLastOfType);
    }

    @Test
    public void testParse_onlyChild_returnsIsOnlyChildEvaluator() {
        Evaluator eval = QueryParser.parse(":only-child");
        assertTrue(eval instanceof Evaluator.IsOnlyChild);
    }

    @Test
    public void testParse_onlyOfType_returnsIsOnlyOfTypeEvaluator() {
        Evaluator eval = QueryParser.parse(":only-of-type");
        assertTrue(eval instanceof Evaluator.IsOnlyOfType);
    }

    @Test
    public void testParse_empty_returnsIsEmptyEvaluator() {
        Evaluator eval = QueryParser.parse(":empty");
        assertTrue(eval instanceof Evaluator.IsEmpty);
    }

    @Test
    public void testParse_root_returnsIsRootEvaluator() {
        Evaluator eval = QueryParser.parse(":root");
        assertTrue(eval instanceof Evaluator.IsRoot);
    }

    @Test
    public void testParse_namespaceWildcard_returnsOrEvaluator() {
        Evaluator eval = QueryParser.parse("*|div");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_namespaceTag_returnsTagEvaluator() {
        Evaluator eval = QueryParser.parse("ns|div");
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_complexCombinationChain_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div p > span ~ a + b");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_chainedPseudoSelectors_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("p:first-child:last-child");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_nullQuery_throwsException() {
        try {
            QueryParser.parse(null);
            fail("Expected an exception to be thrown for null query");
        } catch (Exception e) {
            // expected - exact exception type depends on TokenQueue/Validate implementation
            assertTrue(true);
        }
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyQuery_throwsSelectorParseException() {
        QueryParser.parse("");
    }

    @Test
    public void testParse_emptyIdSelector_throwsException() {
        try {
            QueryParser.parse("#");
            fail("Expected an exception to be thrown for empty id");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testParse_emptyClassSelector_throwsException() {
        try {
            QueryParser.parse(".");
            fail("Expected an exception to be thrown for empty class");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testParse_indexNotNumeric_throwsException() {
        try {
            QueryParser.parse(":lt(abc)");
            fail("Expected an exception to be thrown for non numeric index");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_nthChildInvalidFormat_throwsSelectorParseException() {
        QueryParser.parse(":nth-child(xyz)");
    }

    @Test
    public void testParse_hasWithEmptySubquery_throwsException() {
        try {
            QueryParser.parse(":has()");
            fail("Expected an exception to be thrown for empty :has() subquery");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testParse_containsWithEmptyText_throwsException() {
        try {
            QueryParser.parse(":contains()");
            fail("Expected an exception to be thrown for empty :contains() text");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testParse_notWithEmptySubquery_throwsException() {
        try {
            QueryParser.parse(":not()");
            fail("Expected an exception to be thrown for empty :not() subquery");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_unhandledToken_throwsSelectorParseException() {
        QueryParser.parse("]invalidtoken[");
    }

    @Test
    public void testParse_singleWhitespace_throwsExceptionOrHandlesGracefully() {
        try {
            Evaluator eval = QueryParser.parse(" ");
            // if it doesn't throw, it should at least return a non-null evaluator
            assertNotNull(eval);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // ---------- Exception cases (explicit) ----------

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_onlyCombinatorComma_throwsSelectorParseExceptionOnUnhandledSubquery() {
        // A leading comma with nothing valid afterwards should eventually fail
        QueryParser.parse(",");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_attributeUnknownOperatorInBalancedBrackets_throwsSelectorParseException() {
        QueryParser.parse("[attr#value]");
    }
}
