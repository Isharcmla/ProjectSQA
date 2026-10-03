package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class InlineCostEstimatorTest {

  private static Node parse(String js) {
    Compiler compiler = new Compiler();
    Node n = compiler.parseTestCode(js);
    Assert.assertNotNull(n);
    return n;
  }

  @Test
  public void testGetCost_simpleIdentifier_estimatedIdentifierSize() {
    Node node = parse("foo");
    int cost = InlineCostEstimator.getCost(node);
    Assert.assertEquals(InlineCostEstimator.ESTIMATED_IDENTIFIER_COST, cost);
  }

  @Test
  public void testGetCost_twoIdentifiers_estimatedCostCalculated() {
    Node node = parse("foo + bar");
    int cost = InlineCostEstimator.getCost(node);
    // "ab+ab" -> 2 + 1 + 2 = 5
    Assert.assertEquals(5, cost);
  }

  @Test
  public void testGetCost_numberLiteral_correctCost() {
    Node node = parse("100");
    int cost = InlineCostEstimator.getCost(node);
    // "100" -> length 3
    Assert.assertEquals(3, cost);
  }

  @Test
  public void testGetCost_stringLiteral_correctCost() {
    Node node = parse("'hello'");
    int cost = InlineCostEstimator.getCost(node);
    // "\"hello\"" -> length 7
    Assert.assertEquals(7, cost);
  }

  @Test
  public void testGetCost_emptyString_correctCost() {
    Node node = parse("''");
    int cost = InlineCostEstimator.getCost(node);
    // "\"\"" -> length 2
    Assert.assertEquals(2, cost);
  }

  @Test
  public void testGetCost_booleanLiteral_freeCost() {
    Node trueNode = parse("true");
    Node falseNode = parse("false");
    Node nullNode = parse("null");

    int trueCost = InlineCostEstimator.getCost(trueNode);
    int falseCost = InlineCostEstimator.getCost(falseNode);
    int nullCost = InlineCostEstimator.getCost(nullNode);

    Assert.assertEquals(0, trueCost);
    Assert.assertEquals(0, falseCost);
    Assert.assertEquals(0, nullCost);
  }

  @Test
  public void testGetCost_thresholdExceeded_stopsProcessingEarly() {
    Node node = parse("1 + 2 + 3 + 4 + 5");
    int fullCost = InlineCostEstimator.getCost(node);

    int threshold = 3;
    int estimatedCost = InlineCostEstimator.getCost(node, threshold);

    Assert.assertTrue(fullCost > threshold);
    Assert.assertTrue(estimatedCost >= threshold);
    Assert.assertTrue(estimatedCost <= fullCost);
  }

  @Test
  public void testGetCost_zeroThreshold_stopsImmediately() {
    Node node = parse("foo + bar");
    int cost = InlineCostEstimator.getCost(node, 0);
    // Appending first identifier immediately reaches >= 0 threshold
    Assert.assertTrue(cost >= 0);
    Assert.assertTrue(cost <= InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
  }

  @Test
  public void testGetCost_negativeThreshold_stopsImmediately() {
    Node node = parse("12345");
    int cost = InlineCostEstimator.getCost(node, -1);
    Assert.assertTrue(cost >= 0);
  }

  @Test
  public void testGetCost_largeThreshold_returnsFullCost() {
    Node node = parse("function test(a, b) { return a + b; }");
    int defaultCost = InlineCostEstimator.getCost(node);
    int largeThresholdCost = InlineCostEstimator.getCost(node, Integer.MAX_VALUE);
    Assert.assertEquals(defaultCost, largeThresholdCost);
  }

  @Test
  public void testGetCost_thresholdExactMatch_processesUpToThreshold() {
    Node node = parse("123");
    int exactCost = InlineCostEstimator.getCost(node);
    int thresholdCost = InlineCostEstimator.getCost(node, exactCost);
    Assert.assertEquals(exactCost, thresholdCost);
  }

  @Test
  public void testGetCost_functionDeclaration_calculatesValidCost() {
    Node node = parse("function f(x) { return x; }");
    int cost = InlineCostEstimator.getCost(node);
    Assert.assertTrue(cost > 0);
  }

  @Test
  public void testGetCost_emptyBlock_zeroCost() {
    Node node = parse(";");
    int cost = InlineCostEstimator.getCost(node);
    Assert.assertEquals(0, cost);
  }

  @Test
  public void testConstants_fieldValues() {
    Assert.assertEquals(2, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST);
  }
}
