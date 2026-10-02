package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class InlineCostEstimatorTest {

    @Test
    public void testGetCost_singleArg_numberNode_returnsPositiveCost() {
        Node numberNode = Node.newNumber(42);
        int cost = InlineCostEstimator.getCost(numberNode);
        assertTrue(cost > 0);
    }

    @Test
    public void testGetCost_singleArg_stringNode_returnsPositiveCost() {
        Node stringNode = Node.newString("hello");
        int cost = InlineCostEstimator.getCost(stringNode);
        assertTrue(cost > 0);
    }

    @Test
    public void testGetCost_withThreshold_higherThanActual_sameAsUnbounded() {
        Node numberNode = Node.newNumber(123);
        int costUnbounded = InlineCostEstimator.getCost(numberNode);
        int costWithThreshold = InlineCostEstimator.getCost(numberNode, Integer.MAX_VALUE);
        assertEquals(costUnbounded, costWithThreshold);
    }

    @Test
    public void testGetCost_withZeroThreshold_stopsEarly() {
        Node block = new Node(Token.BLOCK);
        for (int i = 0; i < 5; i++) {
            Node exprResult = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "var" + i));
            block.addChildToBack(exprResult);
        }
        int costFull = InlineCostEstimator.getCost(block);
        int costThresholded = InlineCostEstimator.getCost(block, 0);
        assertTrue(costThresholded <= costFull);
        assertTrue(costThresholded >= 0);
    }

    @Test
    public void testGetCost_withSmallThreshold_stopsBeforeFullCost() {
        Node block = new Node(Token.BLOCK);
        for (int i = 0; i < 10; i++) {
            Node exprResult = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "identifier" + i));
            block.addChildToBack(exprResult);
        }
        int costFull = InlineCostEstimator.getCost(block);
        int costThresholded = InlineCostEstimator.getCost(block, 3);
        assertTrue(costThresholded <= costFull);
    }

    @Test(expected = NullPointerException.class)
    public void testGetCost_nullNode_throwsNullPointerException() {
        InlineCostEstimator.getCost(null);
    }

    @Test(expected = NullPointerException.class)
    public void testGetCost_nullNodeWithThreshold_throwsNullPointerException() {
        InlineCostEstimator.getCost(null, 100);
    }

    @Test
    public void testEstimatedIdentifierCost_constantValue_equalsTwo() {
        assertEquals(2, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
    }

    @Test
    public void testGetCost_negativeThreshold_returnsNonNegativeCost() {
        Node numberNode = Node.newNumber(5);
        int cost = InlineCostEstimator.getCost(numberNode, -1);
        assertTrue(cost >= 0);
    }

    @Test
    public void testGetCost_emptyBlockNode_returnsNonNegativeCost() {
        Node block = new Node(Token.BLOCK);
        int cost = InlineCostEstimator.getCost(block);
        assertTrue(cost >= 0);
    }

    @Test
    public void testGetCost_identifierNode_usesEstimatedIdentifierCostOrMore() {
        Node exprResult = new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "someLongVariableName"));
        int cost = InlineCostEstimator.getCost(exprResult);
        assertTrue(cost >= InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
    }

    @Test
    public void testGetCost_thresholdExactlyEqualsCost_boundaryCase() {
        Node numberNode = Node.newNumber(7);
        int fullCost = InlineCostEstimator.getCost(numberNode);
        int boundaryCost = InlineCostEstimator.getCost(numberNode, fullCost);
        assertTrue(boundaryCost <= fullCost);
    }
}
