package org.jsoup.select;

import org.junit.Assert;
import org.junit.Test;

public class QueryParserTest {

    @Test
    public void testParse_byId_returnsIdEvaluator() {
        Evaluator eval = QueryParser.parse("#main-content");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Id);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyId_throwsException() {
        QueryParser.parse("#");
    }

    @Test
    public void testParse_byClass_returnsClassEvaluator() {
        Evaluator eval = QueryParser.parse(".highlight");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_emptyClass_throwsException() {
        QueryParser.parse(".");
    }

    @Test
    public void testParse_byTag_returnsTagEvaluator() {
        Evaluator eval = QueryParser.parse("div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_byTagWithNamespace_replacesPipeWithColon() {
        Evaluator eval = QueryParser.parse("fb|like");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
        Assert.assertEquals("fb:like", eval.toString());
    }

    @Test
    public void testParse_allElements_returnsAllElementsEvaluator() {
        Evaluator eval = QueryParser.parse("*");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void testParse_attributeOnly_returnsAttributeEvaluator() {
        Evaluator eval = QueryParser.parse("[disabled]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void testParse_attributeStarting_returnsAttributeStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[^data-]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testParse_attributeWithValue_returnsAttributeWithValueEvaluator() {
        Evaluator eval = QueryParser.parse("[type=text]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_attributeWithValueNot_returnsAttributeWithValueNotEvaluator() {
        Evaluator eval = QueryParser.parse("[type!=hidden]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testParse_attributeWithValueStarting_returnsAttributeWithValueStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[href^=https]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testParse_attributeWithValueEnding_returnsAttributeWithValueEndingEvaluator() {
        Evaluator eval = QueryParser.parse("[src$=.png]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testParse_attributeWithValueContaining_returnsAttributeWithValueContainingEvaluator() {
        Evaluator eval = QueryParser.parse("[title*=jsoup]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testParse_attributeWithValueMatching_returnsAttributeWithValueMatchingEvaluator() {
        Evaluator eval = QueryParser.parse("[class~=btn-(primary|secondary)]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_attributeInvalidOperator_throwsException() {
        QueryParser.parse("[href ?= example]");
    }

    @Test
    public void testParse_indexLessThan_returnsIndexLessThanEvaluator() {
        Evaluator eval = QueryParser.parse(":lt(5)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testParse_indexGreaterThan_returnsIndexGreaterThanEvaluator() {
        Evaluator eval = QueryParser.parse(":gt(2)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testParse_indexEquals_returnsIndexEqualsEvaluator() {
        Evaluator eval = QueryParser.parse(":eq(0)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_indexNonNumeric_throwsException() {
        QueryParser.parse(":eq(abc)");
    }

    @Test
    public void testParse_has_returnsHasEvaluator() {
        Evaluator eval = QueryParser.parse(":has(p.highlight)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_hasEmpty_throwsException() {
        QueryParser.parse(":has()");
    }

    @Test
    public void testParse_contains_returnsContainsTextEvaluator() {
        Evaluator eval = QueryParser.parse(":contains(Search Text)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test
    public void testParse_containsOwn_returnsContainsOwnTextEvaluator() {
        Evaluator eval = QueryParser.parse(":containsOwn(Direct Text)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_containsEmpty_throwsException() {
        QueryParser.parse(":contains()");
    }

    @Test
    public void testParse_matches_returnsMatchesEvaluator() {
        Evaluator eval = QueryParser.parse(":matches(\\d+)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test
    public void testParse_matchesOwn_returnsMatchesOwnEvaluator() {
        Evaluator eval = QueryParser.parse(":matchesOwn([a-z]+)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_matchesEmpty_throwsException() {
        QueryParser.parse(":matches()");
    }

    @Test
    public void testParse_not_returnsNotEvaluator() {
        Evaluator eval = QueryParser.parse(":not(.hidden)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParse_notEmpty_throwsException() {
        QueryParser.parse(":not()");
    }

    @Test
    public void testParse_combinatorImmediateParent_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div > p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorParent_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorImmediatePreviousSibling_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("h1 + p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorPreviousSibling_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("h1 ~ p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_startWithImmediateParentCombinator_usesRoot() {
        Evaluator eval = QueryParser.parse("> span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_startWithSiblingCombinator_usesRoot() {
        Evaluator eval = QueryParser.parse("+ div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_startWithPreviousSiblingCombinator_usesRoot() {
        Evaluator eval = QueryParser.parse("~ div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_startWithWhitespaceCombinator_usesRoot() {
        Evaluator eval = QueryParser.parse(" span");
        Assert.assertNotNull(eval);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_startWithOrCombinator_throwsUnknownCombinatorException() {
        QueryParser.parse(", span");
    }

    @Test
    public void testParse_orCombinator_returnsOrEvaluator() {
        Evaluator eval = QueryParser.parse("div, p, span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_compoundSelector_returnsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div.class1#id1[attr1]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_compoundWithCombinator_chainsCorrectly() {
        Evaluator eval = QueryParser.parse("div.foo#bar > p.baz");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_complexSubQueryWithBalancedBracketsAndParentheses_parsesSuccessfully() {
        Evaluator eval = QueryParser.parse("div:not([href='(test)']) > a[data-val='[123]']");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_unhandledToken_throwsSelectorParseException() {
        QueryParser.parse("%invalid");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyQuery_throwsSelectorParseException() {
        QueryParser.parse("");
    }
}
