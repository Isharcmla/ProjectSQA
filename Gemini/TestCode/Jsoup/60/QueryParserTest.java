package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueryParserTest {

    @Test
    public void testParse_tagSelector_success() {
        Evaluator eval = QueryParser.parse("div");
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_wildcardTagNamespace_success() {
        Evaluator eval = QueryParser.parse("*|div");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_specificNamespace_success() {
        Evaluator eval = QueryParser.parse("fb|like");
        assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_allElements_success() {
        Evaluator eval = QueryParser.parse("*");
        assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void testParse_idSelector_success() {
        Evaluator eval = QueryParser.parse("#main");
        assertTrue(eval instanceof Evaluator.Id);
    }

    @Test
    public void testParse_classSelector_success() {
        Evaluator eval = QueryParser.parse(".highlight");
        assertTrue(eval instanceof Evaluator.Class);
    }

    @Test
    public void testParse_compoundTagIdClass_success() {
        Evaluator eval = QueryParser.parse("div#main.highlight");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_attributeExists_success() {
        Evaluator eval = QueryParser.parse("[href]");
        assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void testParse_attributePrefix_success() {
        Evaluator eval = QueryParser.parse("[^data-]");
        assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testParse_attributeWithValue_success() {
        Evaluator eval = QueryParser.parse("[type=text]");
        assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_attributeWithValueNot_success() {
        Evaluator eval = QueryParser.parse("[type!=text]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testParse_attributeWithValueStarting_success() {
        Evaluator eval = QueryParser.parse("[href^=https]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testParse_attributeWithValueEnding_success() {
        Evaluator eval = QueryParser.parse("[href$=.pdf]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testParse_attributeWithValueContaining_success() {
        Evaluator eval = QueryParser.parse("[href*=jsoup]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testParse_attributeWithValueMatching_success() {
        Evaluator eval = QueryParser.parse("[href~=https?://.*]");
        assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test
    public void testParse_structuralImmediateParent_success() {
        Evaluator eval = QueryParser.parse("div > p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_structuralParent_success() {
        Evaluator eval = QueryParser.parse("div p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_structuralImmediatePreviousSibling_success() {
        Evaluator eval = QueryParser.parse("h1 + p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_structuralPreviousSibling_success() {
        Evaluator eval = QueryParser.parse("h1 ~ p");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_orCombinator_success() {
        Evaluator eval = QueryParser.parse("div, p, span");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_orCombinatorWithDescendants_success() {
        Evaluator eval = QueryParser.parse("div, p > span");
        assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_orCombinatorWithMultipleEvalsBeforeCombinator_success() {
        Evaluator eval = QueryParser.parse("div.btn#submit > span");
        assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_startingWithCombinator_success() {
        Evaluator eval1 = QueryParser.parse("> p");
        assertTrue(eval1 instanceof CombiningEvaluator.And);

        Evaluator eval2 = QueryParser.parse("+ p");
        assertTrue(eval2 instanceof CombiningEvaluator.And);

        Evaluator eval3 = QueryParser.parse("~ p");
        assertTrue(eval3 instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_consumeSubQueryWithParenthesesAndBrackets_success() {
        Evaluator eval = QueryParser.parse("div:has(p > a) > span[data-attr='[val]']");
        assertNotNull(eval);
    }

    @Test
    public void testParse_indexEquals_success() {
        Evaluator eval = QueryParser.parse(":eq(2)");
        assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test
    public void testParse_indexGreaterThan_success() {
        Evaluator eval = QueryParser.parse(":gt(2)");
        assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testParse_indexLessThan_success() {
        Evaluator eval = QueryParser.parse(":lt(2)");
        assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testParse_has_success() {
        Evaluator eval = QueryParser.parse(":has(p)");
        assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test
    public void testParse_contains_success() {
        Evaluator eval = QueryParser.parse(":contains(test)");
        assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test
    public void testParse_containsOwn_success() {
        Evaluator eval = QueryParser.parse(":containsOwn(test)");
        assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test
    public void testParse_containsData_success() {
        Evaluator eval = QueryParser.parse(":containsData(var a)");
        assertTrue(eval instanceof Evaluator.ContainsData);
    }

    @Test
    public void testParse_matches_success() {
        Evaluator eval = QueryParser.parse(":matches([a-z]+)");
        assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void testParse_matchesOwn_success() {
        Evaluator eval = QueryParser.parse(":matchesOwn([a-z]+)");
        assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test
    public void testParse_not_success() {
        Evaluator eval = QueryParser.parse(":not(div.active)");
        assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test
    public void testParse_nthChildVariants_success() {
        assertTrue(QueryParser.parse(":nth-child(odd)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(even)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(2n+1)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(+2n+1)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(2n)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(n)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(3)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(+3)") instanceof Evaluator.IsNthChild);
        assertTrue(QueryParser.parse(":nth-child(-3)") instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthLastChildVariants_success() {
        assertTrue(QueryParser.parse(":nth-last-child(odd)") instanceof Evaluator.IsNthLastChild);
        assertTrue(QueryParser.parse(":nth-last-child(2n+1)") instanceof Evaluator.IsNthLastChild);
        assertTrue(QueryParser.parse(":nth-last-child(3)") instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void testParse_nthOfTypeVariants_success() {
        assertTrue(QueryParser.parse(":nth-of-type(even)") instanceof Evaluator.IsNthOfType);
        assertTrue(QueryParser.parse(":nth-of-type(3n-1)") instanceof Evaluator.IsNthOfType);
        assertTrue(QueryParser.parse(":nth-of-type(1)") instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void testParse_nthLastOfTypeVariants_success() {
        assertTrue(QueryParser.parse(":nth-last-of-type(odd)") instanceof Evaluator.IsNthLastOfType);
        assertTrue(QueryParser.parse(":nth-last-of-type(2n)") instanceof Evaluator.IsNthLastOfType);
        assertTrue(QueryParser.parse(":nth-last-of-type(2)") instanceof Evaluator.IsNthLastOfType);
    }

    @Test
    public void testParse_structuralPseudoClasses_success() {
        assertTrue(QueryParser.parse(":first-child") instanceof Evaluator.IsFirstChild);
        assertTrue(QueryParser.parse(":last-child") instanceof Evaluator.IsLastChild);
        assertTrue(QueryParser.parse(":first-of-type") instanceof Evaluator.IsFirstOfType);
        assertTrue(QueryParser.parse(":last-of-type") instanceof Evaluator.IsLastOfType);
        assertTrue(QueryParser.parse(":only-child") instanceof Evaluator.IsOnlyChild);
        assertTrue(QueryParser.parse(":only-of-type") instanceof Evaluator.IsOnlyOfType);
        assertTrue(QueryParser.parse(":empty") instanceof Evaluator.IsEmpty);
        assertTrue(QueryParser.parse(":root") instanceof Evaluator.IsRoot);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_unhandledToken_throwsSelectorParseException() {
        QueryParser.parse("div%");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_invalidAttributeOperator_throwsSelectorParseException() {
        QueryParser.parse("[href%val]");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_invalidNthChildFormat_throwsSelectorParseException() {
        QueryParser.parse(":nth-child(foo)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyId_throwsException() {
        QueryParser.parse("#");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyClass_throwsException() {
        QueryParser.parse(".");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyAttribute_throwsException() {
        QueryParser.parse("[]");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_nonNumericIndex_throwsException() {
        QueryParser.parse(":eq(abc)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyHas_throwsException() {
        QueryParser.parse(":has()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyContains_throwsException() {
        QueryParser.parse(":contains()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyContainsOwn_throwsException() {
        QueryParser.parse(":containsOwn()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyContainsData_throwsException() {
        QueryParser.parse(":containsData()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyMatches_throwsException() {
        QueryParser.parse(":matches()");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyNot_throwsException() {
        QueryParser.parse(":not()");
    }
}
