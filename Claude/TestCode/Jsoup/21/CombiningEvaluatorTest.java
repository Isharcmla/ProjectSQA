package org.jsoup.select;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class CombiningEvaluatorTest {

    private Element root;
    private Element node;

    // Simple concrete Evaluator implementation for testing purposes
    private static class StubEvaluator extends Evaluator {
        private final boolean result;

        StubEvaluator(boolean result) {
            this.result = result;
        }

        @Override
        public boolean matches(Element root, Element node) {
            return result;
        }

        @Override
        public String toString() {
            return "Stub(" + result + ")";
        }
    }

    @Before
    public void setUp() {
        Document doc = Jsoup.parse("<html><body><div id='test'>content</div></body></html>");
        root = doc;
        node = doc.getElementById("test");
    }

    // ---------- And Evaluator Tests ----------

    @Test
    public void testAnd_varargsAllTrue_returnsTrue() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(
                new StubEvaluator(true), new StubEvaluator(true));
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAnd_varargsOneFalse_returnsFalse() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(
                new StubEvaluator(true), new StubEvaluator(false));
        assertFalse(and.matches(root, node));
    }

    @Test
    public void testAnd_collectionConstructor_normalInput() {
        List<Evaluator> evaluators = new ArrayList<Evaluator>();
        evaluators.add(new StubEvaluator(true));
        evaluators.add(new StubEvaluator(true));
        CombiningEvaluator.And and = new CombiningEvaluator.And(evaluators);
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAnd_emptyCollection_returnsTrue() {
        // edge case: empty collection - vacuously true
        Collection<Evaluator> evaluators = new ArrayList<Evaluator>();
        CombiningEvaluator.And and = new CombiningEvaluator.And(evaluators);
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAnd_toString_returnsJoinedEvaluators() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(
                new StubEvaluator(true), new StubEvaluator(false));
        String result = and.toString();
        assertNotNull(result);
        assertTrue(result.contains("Stub"));
    }

    @Test
    public void testAnd_singleEvaluatorTrue_returnsTrue() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(new StubEvaluator(true));
        assertTrue(and.matches(root, node));
    }

    @Test
    public void testAnd_singleEvaluatorFalse_returnsFalse() {
        CombiningEvaluator.And and = new CombiningEvaluator.And(new StubEvaluator(false));
        assertFalse(and.matches(root, node));
    }

    // ---------- Or Evaluator Tests ----------

    @Test
    public void testOr_collectionWithMultipleElements_wrapsIntoAnd() {
        List<Evaluator> evaluators = new ArrayList<Evaluator>();
        evaluators.add(new StubEvaluator(true));
        evaluators.add(new StubEvaluator(true));
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        // Since size > 1, wraps into And - Or should contain exactly one evaluator (the And)
        assertEquals(1, or.evaluators.size());
        assertTrue(or.evaluators.get(0) instanceof CombiningEvaluator.And);
    }

    @Test
    public void testOr_collectionWithSingleElement_addsDirectly() {
        List<Evaluator> evaluators = new ArrayList<Evaluator>();
        evaluators.add(new StubEvaluator(true));
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        assertEquals(1, or.evaluators.size());
        assertFalse(or.evaluators.get(0) instanceof CombiningEvaluator.And);
    }

    @Test
    public void testOr_emptyCollection_hasNoEvaluators() {
        // edge case: empty collection
        Collection<Evaluator> evaluators = new ArrayList<Evaluator>();
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        assertEquals(0, or.evaluators.size());
    }

    @Test
    public void testOr_matches_anyTrue_returnsTrue() {
        List<Evaluator> evaluators = new ArrayList<Evaluator>();
        evaluators.add(new StubEvaluator(false));
        evaluators.add(new StubEvaluator(true));
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOr_matches_allFalse_returnsFalse() {
        List<Evaluator> evaluators = new ArrayList<Evaluator>();
        evaluators.add(new StubEvaluator(false));
        evaluators.add(new StubEvaluator(false));
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOr_matches_emptyEvaluators_returnsFalse() {
        // edge case: no evaluators at all
        Collection<Evaluator> evaluators = new ArrayList<Evaluator>();
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        assertFalse(or.matches(root, node));
    }

    @Test
    public void testOr_add_addsEvaluatorToList() {
        Collection<Evaluator> evaluators = new ArrayList<Evaluator>();
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        or.add(new StubEvaluator(true));
        assertEquals(1, or.evaluators.size());
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOr_add_multipleEvaluators_matchesTrueIfAnyTrue() {
        Collection<Evaluator> evaluators = new ArrayList<Evaluator>();
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        or.add(new StubEvaluator(false));
        or.add(new StubEvaluator(false));
        or.add(new StubEvaluator(true));
        assertTrue(or.matches(root, node));
    }

    @Test
    public void testOr_toString_returnsFormattedString() {
        List<Evaluator> evaluators = new ArrayList<Evaluator>();
        evaluators.add(new StubEvaluator(true));
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        String result = or.toString();
        assertNotNull(result);
        assertTrue(result.startsWith(":or"));
    }

    @Test
    public void testOr_toString_emptyEvaluators_returnsFormattedString() {
        Collection<Evaluator> evaluators = new ArrayList<Evaluator>();
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(evaluators);
        String result = or.toString();
        assertNotNull(result);
        assertTrue(result.startsWith(":or"));
    }

    // ---------- Additional edge cases ----------

    @Test
    public void testAnd_withNullNode_stillCallsEvaluators() {
        // edge case: passing null node - depends on StubEvaluator ignoring params
        CombiningEvaluator.And and = new CombiningEvaluator.And(new StubEvaluator(true));
        assertTrue(and.matches(root, null));
    }

    @Test
    public void testOr_withNullRoot_stillCallsEvaluators() {
        // edge case: passing null root - depends on StubEvaluator ignoring params
        CombiningEvaluator.Or or = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        or.add(new StubEvaluator(true));
        assertTrue(or.matches(null, node));
    }
}
