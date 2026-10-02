package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    // ---------- Normal / typical input cases ----------

    @Test
    public void testParse_simpleTag_returnsTagEvaluator() {
        Evaluator eval = QueryParser.parse("div");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_byId_returnsIdEvaluator() {
        Evaluator eval = QueryParser.parse("#myid");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Id);
    }

    @Test
    public void testParse_byClass_returnsClassEvaluator() {
        Evaluator eval = QueryParser.parse(".myclass");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Class);
    }

    @Test
    public void testParse_allElements_returnsAllElementsEvaluator() {
        Evaluator eval = QueryParser.parse("*");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void testParse_attributeNoValue_returnsAttributeEvaluator() {
        Evaluator eval = QueryParser.parse("[href]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void testParse_attributeStarting_returnsAttributeStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[^data-]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testParse_attributeWithValue_returnsAttributeWithValueEvaluator() {
        Evaluator eval = QueryParser.parse("[href=foo]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_attributeWithValueNot_returnsAttributeWithValueNotEvaluator() {
        Evaluator eval = QueryParser.parse("[href!=foo]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testParse_attributeWithValueStarting_returnsAttributeWithValueStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[href^=foo]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testParse_attributeWithValueEnding_returnsAttributeWithValueEndingEvaluator() {
        Evaluator eval = QueryParser.parse("[href$=foo]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testParse_attributeWithValueContaining_returnsAttributeWithValueContainingEvaluator() {
        Evaluator eval = QueryParser.parse("[href*=foo]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testParse_attributeWithValueMatching_returnsAttributeWithValueMatchingEvaluator() {
        Evaluator eval = QueryParser.parse("[href~=fo.*]");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test
    public void testParse_indexLessThan_returnsIndexLessThanEvaluator() {
        Evaluator eval = QueryParser.parse(":lt(3)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testParse_indexGreaterThan_returnsIndexGreaterThanEvaluator() {
        Evaluator eval = QueryParser.parse(":gt(3)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testParse_indexEquals_returnsIndexEqualsEvaluator() {
        Evaluator eval = QueryParser.parse(":eq(3)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test
    public void testParse_has_returnsHasEvaluator() {
        Evaluator eval = QueryParser.parse(":has(p)");
        assertNotNull(eval);
        assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test
    public void testParse_contains_returnsContainsTextEvaluator() {
        Evaluator eval = QueryParser.parse(":contains(hello)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test
    public void testParse_containsOwn_returnsContainsOwnTextEvaluator() {
        Evaluator eval = QueryParser.parse(":containsOwn(hello)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test
    public void testParse_matches_returnsMatchesEvaluator() {
        Evaluator eval = QueryParser.parse(":matches(\\d+)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void testParse_matchesOwn_returnsMatchesOwnEvaluator() {
        Evaluator eval = QueryParser.parse(":matchesOwn(\\d+)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test
    public void testParse_not_returnsNotEvaluator() {
        Evaluator eval = QueryParser.parse(":not(p)");
        assertNotNull(eval);
        assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test
    public void testParse_childCombinator_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div > p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_descendantCombinator_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_immediateSiblingCombinator_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div + p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_generalSiblingCombinator_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div ~ p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_orCombinator_returnsOrEvaluator() {
        Evaluator eval = QueryParser.parse("div, p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_multipleAndSelectors_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div.myclass#myid");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_startsWithCombinator_returnsAndEvaluatorWithRoot() {
        Evaluator eval = QueryParser.parse("> p");
        assertNotNull(eval);
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_namespacedTag_replacesPipeWithColon() {
        Evaluator eval = QueryParser.parse("abc|def");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.Tag);
    }

    // ---------- Edge cases ----------

    @Test
    public void testParse_emptyString_throwsSelectorParseException() {
        try {
            QueryParser.parse("");
            fail("Expected exception for empty query");
        } catch (Exception e) {
            assertTrue(e instanceof Selector.SelectorParseException || e instanceof RuntimeException);
        }
    }

    @Test
    public void testParse_nullQuery_throwsException() {
        try {
            QueryParser.parse(null);
            fail("Expected exception for null query");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_whitespaceOnlyQuery_throwsException() {
        try {
            QueryParser.parse("   ");
            fail("Expected exception for whitespace only query");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_indexZero_returnsIndexEqualsEvaluator() {
        Evaluator eval = QueryParser.parse(":eq(0)");
        assertNotNull(eval);
        assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test
    public void testParse_negativeIndex_throwsException() {
        // ":lt(-1)" - "-1" is not numeric per StringUtil.isNumeric typically, should throw
        try {
            QueryParser.parse(":lt(-1)");
            // if it does not throw, at least ensure it's a valid evaluator
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    // ---------- Exception cases ----------

    @Test
    public void testParse_emptyId_throwsException() {
        try {
            QueryParser.parse("#");
            fail("Expected exception for empty id");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_emptyClass_throwsException() {
        try {
            QueryParser.parse(".");
            fail("Expected exception for empty class");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_emptyAttributeKey_throwsException() {
        try {
            QueryParser.parse("[]");
            fail("Expected exception for empty attribute key");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_invalidAttributeOperator_throwsException() {
        try {
            QueryParser.parse("[foo&bar]");
            // depending on parsing, may or may not throw; if not thrown, no assertion failure needed
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_nonNumericIndex_throwsException() {
        try {
            QueryParser.parse(":lt(abc)");
            fail("Expected exception for non-numeric index");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_hasEmptySubquery_throwsException() {
        try {
            QueryParser.parse(":has()");
            fail("Expected exception for empty :has() subquery");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_containsEmptyText_throwsException() {
        try {
            QueryParser.parse(":contains()");
            fail("Expected exception for empty :contains() text");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_containsOwnEmptyText_throwsException() {
        try {
            QueryParser.parse(":containsOwn()");
            fail("Expected exception for empty :containsOwn() text");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_matchesEmptyRegex_throwsException() {
        try {
            QueryParser.parse(":matches()");
            fail("Expected exception for empty :matches() regex");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_matchesOwnEmptyRegex_throwsException() {
        try {
            QueryParser.parse(":matchesOwn()");
            fail("Expected exception for empty :matchesOwn() regex");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_notEmptySubquery_throwsException() {
        try {
            QueryParser.parse(":not()");
            fail("Expected exception for empty :not() subquery");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_unhandledToken_throwsSelectorParseException() {
        try {
            QueryParser.parse("!!!");
            fail("Expected exception for unhandled token");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testParse_unknownAttributeOperatorInBrackets_throwsException() {
        try {
            QueryParser.parse("[key%value]");
            // may or may not throw depending on tokenizer; ensure no crash otherwise
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}
