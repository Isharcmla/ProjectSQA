package org.jsoup.select;

import org.junit.Assert;
import org.junit.Test;

public class QueryParserTest {

    @Test
    public void testParse_tag_createsTagEvaluator() {
        Evaluator eval = QueryParser.parse("div");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_allElements_createsAllElementsEvaluator() {
        Evaluator eval = QueryParser.parse("*");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AllElements);
    }

    @Test
    public void testParse_id_createsIdEvaluator() {
        Evaluator eval = QueryParser.parse("#main");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Id);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyId_throwsException() {
        QueryParser.parse("#");
    }

    @Test
    public void testParse_class_createsClassEvaluator() {
        Evaluator eval = QueryParser.parse(".highlight");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Class);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_emptyClass_throwsException() {
        QueryParser.parse(".");
    }

    @Test
    public void testParse_namespaceTagWildcard_createsOrTagEvaluator() {
        Evaluator eval = QueryParser.parse("*|svg");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_namespaceTagNamed_createsTagEvaluator() {
        Evaluator eval = QueryParser.parse("ns|custom");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Tag);
    }

    @Test
    public void testParse_attributeOnly_createsAttributeEvaluator() {
        Evaluator eval = QueryParser.parse("[disabled]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Attribute);
    }

    @Test
    public void testParse_attributeStarting_createsAttributeStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[^data-]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeStarting);
    }

    @Test
    public void testParse_attributeWithValue_createsAttributeWithValueEvaluator() {
        Evaluator eval = QueryParser.parse("[type=text]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValue);
    }

    @Test
    public void testParse_attributeWithValueNot_createsAttributeWithValueNotEvaluator() {
        Evaluator eval = QueryParser.parse("[type!=text]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueNot);
    }

    @Test
    public void testParse_attributeWithValueStarting_createsAttributeWithValueStartingEvaluator() {
        Evaluator eval = QueryParser.parse("[href^=https]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueStarting);
    }

    @Test
    public void testParse_attributeWithValueEnding_createsAttributeWithValueEndingEvaluator() {
        Evaluator eval = QueryParser.parse("[href$=.pdf]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueEnding);
    }

    @Test
    public void testParse_attributeWithValueContaining_createsAttributeWithValueContainingEvaluator() {
        Evaluator eval = QueryParser.parse("[class*=active]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueContaining);
    }

    @Test
    public void testParse_attributeWithValueMatching_createsAttributeWithValueMatchingEvaluator() {
        Evaluator eval = QueryParser.parse("[title~=[a-z]+]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.AttributeWithValueMatching);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_attributeEmpty_throwsException() {
        QueryParser.parse("[]");
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_attributeInvalidOperator_throwsException() {
        QueryParser.parse("[attr?val]");
    }

    @Test
    public void testParse_indexLessThan_createsIndexLessThanEvaluator() {
        Evaluator eval = QueryParser.parse(":lt(3)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexLessThan);
    }

    @Test
    public void testParse_indexGreaterThan_createsIndexGreaterThanEvaluator() {
        Evaluator eval = QueryParser.parse(":gt(5)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexGreaterThan);
    }

    @Test
    public void testParse_indexEquals_createsIndexEqualsEvaluator() {
        Evaluator eval = QueryParser.parse(":eq(0)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IndexEquals);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_indexNonNumeric_throwsException() {
        QueryParser.parse(":eq(abc)");
    }

    @Test
    public void testParse_has_createsHasEvaluator() {
        Evaluator eval = QueryParser.parse(":has(p)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Has);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_hasEmpty_throwsException() {
        QueryParser.parse(":has()");
    }

    @Test
    public void testParse_contains_createsContainsTextEvaluator() {
        Evaluator eval = QueryParser.parse(":contains(hello)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsText);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_containsEmpty_throwsException() {
        QueryParser.parse(":contains()");
    }

    @Test
    public void testParse_containsOwn_createsContainsOwnTextEvaluator() {
        Evaluator eval = QueryParser.parse(":containsOwn(unique)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsOwnText);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_containsOwnEmpty_throwsException() {
        QueryParser.parse(":containsOwn()");
    }

    @Test
    public void testParse_containsData_createsContainsDataEvaluator() {
        Evaluator eval = QueryParser.parse(":containsData(scriptData)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.ContainsData);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_containsDataEmpty_throwsException() {
        QueryParser.parse(":containsData()");
    }

    @Test
    public void testParse_matches_createsMatchesEvaluator() {
        Evaluator eval = QueryParser.parse(":matches(\\d+)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.Matches);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_matchesEmpty_throwsException() {
        QueryParser.parse(":matches()");
    }

    @Test
    public void testParse_matchesOwn_createsMatchesOwnEvaluator() {
        Evaluator eval = QueryParser.parse(":matchesOwn([a-z]+)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.MatchesOwn);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_matchesOwnEmpty_throwsException() {
        QueryParser.parse(":matchesOwn()");
    }

    @Test
    public void testParse_not_createsNotEvaluator() {
        Evaluator eval = QueryParser.parse(":not(div.ignore)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof StructuralEvaluator.Not);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_notEmpty_throwsException() {
        QueryParser.parse(":not()");
    }

    @Test
    public void testParse_nthChild_oddEven() {
        Evaluator evalOdd = QueryParser.parse(":nth-child(odd)");
        Assert.assertTrue(evalOdd instanceof Evaluator.IsNthChild);

        Evaluator evalEven = QueryParser.parse(":nth-child(even)");
        Assert.assertTrue(evalEven instanceof Evaluator.IsNthChild);
    }

    @Test
    public void testParse_nthChild_formulaVariations() {
        Assert.assertTrue(QueryParser.parse(":nth-child(2n+1)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(+2n+1)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(-2n-1)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(n+3)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(-n-3)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(3n)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(5)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(-5)") instanceof Evaluator.IsNthChild);
        Assert.assertTrue(QueryParser.parse(":nth-child(+5)") instanceof Evaluator.IsNthChild);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_nthChild_invalid_throwsException() {
        QueryParser.parse(":nth-child(invalidFormat)");
    }

    @Test
    public void testParse_nthLastChild_createsIsNthLastChild() {
        Evaluator eval = QueryParser.parse(":nth-last-child(2)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthLastChild);
    }

    @Test
    public void testParse_nthOfType_createsIsNthOfType() {
        Evaluator eval = QueryParser.parse(":nth-of-type(3n+1)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthOfType);
    }

    @Test
    public void testParse_nthLastOfType_createsIsNthLastOfType() {
        Evaluator eval = QueryParser.parse(":nth-last-of-type(odd)");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof Evaluator.IsNthLastOfType);
    }

    @Test
    public void testParse_simplePseudos_createsExpectedEvaluators() {
        Assert.assertTrue(QueryParser.parse(":first-child") instanceof Evaluator.IsFirstChild);
        Assert.assertTrue(QueryParser.parse(":last-child") instanceof Evaluator.IsLastChild);
        Assert.assertTrue(QueryParser.parse(":first-of-type") instanceof Evaluator.IsFirstOfType);
        Assert.assertTrue(QueryParser.parse(":last-of-type") instanceof Evaluator.IsLastOfType);
        Assert.assertTrue(QueryParser.parse(":only-child") instanceof Evaluator.IsOnlyChild);
        Assert.assertTrue(QueryParser.parse(":only-of-type") instanceof Evaluator.IsOnlyOfType);
        Assert.assertTrue(QueryParser.parse(":empty") instanceof Evaluator.IsEmpty);
        Assert.assertTrue(QueryParser.parse(":root") instanceof Evaluator.IsRoot);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_unknownPseudo_throwsException() {
        QueryParser.parse(":unknown-pseudo");
    }

    @Test
    public void testParse_combinatorDescendant_createsParentStructuralEvaluator() {
        Evaluator eval = QueryParser.parse("div p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorImmediateParent_createsImmediateParentStructuralEvaluator() {
        Evaluator eval = QueryParser.parse("div > p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorImmediatePreviousSibling_createsImmediatePreviousSiblingEvaluator() {
        Evaluator eval = QueryParser.parse("h1 + p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorPreviousSibling_createsPreviousSiblingEvaluator() {
        Evaluator eval = QueryParser.parse("h1 ~ p");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_combinatorOr_createsOrEvaluator() {
        Evaluator eval = QueryParser.parse("div, p, span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_combinatorOrWithPrecedence_correctRightMostReplacement() {
        Evaluator eval = QueryParser.parse("div, p > span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.Or);
    }

    @Test
    public void testParse_startsWithCombinator_createsRootStructuralEvaluator() {
        Evaluator eval = QueryParser.parse("> span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_andCombinedConditions_createsAndEvaluator() {
        Evaluator eval = QueryParser.parse("div.class#id[attr=value]");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_multipleEvaluatorsBeforeCombinator_groupsAndEvaluators() {
        Evaluator eval = QueryParser.parse("div.class#id > span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_subQueryWithBalancedParensAndBrackets() {
        Evaluator eval = QueryParser.parse("div:has(p > a[href]) > span");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_emptyQuery_returnsCombiningEvaluatorAnd() {
        Evaluator eval = QueryParser.parse("");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test
    public void testParse_whitespaceOnly_returnsCombiningEvaluatorAnd() {
        Evaluator eval = QueryParser.parse("   ");
        Assert.assertNotNull(eval);
        Assert.assertTrue(eval instanceof CombiningEvaluator.And);
    }

    @Test(expected = Selector.SelectorParseException.class)
    public void testParse_unhandledToken_throwsException() {
        QueryParser.parse("div!invalid");
    }
}
