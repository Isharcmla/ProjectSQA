package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombiningEvaluatorTest {

    private Element root;
    private Element targetNode;

    private Evaluator matchTrue;
    private Evaluator matchFalse;

    @Before
    public void setUp() {
        root = new Element(Tag.valueOf("div"), "");
        targetNode = new Element(Tag.valueOf("p"), "");
        root.appendChild(targetNode);

        matchTrue = new Evaluator() {
            @Override
            public boolean matches(Element r, Element n) {
                return true;
            }

            @Override
            public String toString() {
                return "matchTrue";
            }
        };

        matchFalse = new Evaluator() {
            @Override
            public boolean matches(Element r, Element n) {
                return false;
            }

            @Override
            public String toString() {
                return "matchFalse";
            }
        };
    }

    @Test
    public void testCombiningEvaluator_baseConstructors() {
        CombiningEvaluator emptyEval = new CombiningEvaluator() {};
        Assert.assertNotNull(emptyEval.evaluators);
        Assert.assertEquals(0, emptyEval.evaluators.size());

        List<Evaluator> list = Arrays.asList(matchTrue, matchFalse);
        CombiningEvaluator collectionEval = new CombiningEvaluator(list) {};
        Assert.assertEquals(2, collectionEval.evaluators.size());
        Assert.assertEquals(matchTrue, collectionEval.evaluators.get(0));
        Assert.assertEquals(matchFalse, collectionEval.evaluators.get(1));
    }

    @Test
    public void testAnd_allMatch_returnsTrue() {
        CombiningEvaluator.And andEval = new CombiningEvaluator.And(matchTrue, matchTrue);
        Assert.assertTrue(andEval.matches(root, targetNode));
    }

    @Test
    public void testAnd_oneDoesNotMatch_returnsFalse() {
        CombiningEvaluator.And andEval = new CombiningEvaluator.And(matchTrue, matchFalse);
        Assert.assertFalse(andEval.matches(root, targetNode));

        CombiningEvaluator.And andEvalFirstFalse = new CombiningEvaluator.And(matchFalse, matchTrue);
        Assert.assertFalse(andEvalFirstFalse.matches(root, targetNode));
    }

    @Test
    public void testAnd_emptyEvaluators_returnsTrue() {
        CombiningEvaluator.And andEval = new CombiningEvaluator.And();
        Assert.assertTrue(andEval.matches(root, targetNode));
    }

    @Test
    public void testAnd_collectionConstructor() {
        List<Evaluator> list = Arrays.asList(matchTrue, matchTrue);
        CombiningEvaluator.And andEval = new CombiningEvaluator.And(list);
        Assert.assertTrue(andEval.matches(root, targetNode));
        Assert.assertEquals(2, andEval.evaluators.size());
    }

    @Test
    public void testAnd_toString() {
        CombiningEvaluator.And andEval = new CombiningEvaluator.And(matchTrue, matchFalse);
        Assert.assertEquals("matchTrue matchFalse", andEval.toString());

        CombiningEvaluator.And emptyAnd = new CombiningEvaluator.And();
        Assert.assertEquals("", emptyAnd.toString());
    }

    @Test
    public void testOr_constructorEmptyCollection() {
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(Collections.<Evaluator>emptyList());
        Assert.assertEquals(0, orEval.evaluators.size());
        Assert.assertFalse(orEval.matches(root, targetNode));
    }

    @Test
    public void testOr_constructorSingleElement() {
        List<Evaluator> list = Collections.singletonList(matchTrue);
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(list);
        Assert.assertEquals(1, orEval.evaluators.size());
        Assert.assertEquals(matchTrue, orEval.evaluators.get(0));
        Assert.assertTrue(orEval.matches(root, targetNode));
    }

    @Test
    public void testOr_constructorMultipleElements_wrapsInAnd() {
        List<Evaluator> list = Arrays.asList(matchTrue, matchFalse);
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(list);
        Assert.assertEquals(1, orEval.evaluators.size());
        Assert.assertTrue(orEval.evaluators.get(0) instanceof CombiningEvaluator.And);

        // Since inner is AND(true, false) => false
        Assert.assertFalse(orEval.matches(root, targetNode));
    }

    @Test
    public void testOr_addMethod() {
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(new ArrayList<Evaluator>());
        Assert.assertEquals(0, orEval.evaluators.size());

        orEval.add(matchFalse);
        Assert.assertEquals(1, orEval.evaluators.size());
        Assert.assertFalse(orEval.matches(root, targetNode));

        orEval.add(matchTrue);
        Assert.assertEquals(2, orEval.evaluators.size());
        Assert.assertTrue(orEval.matches(root, targetNode));
    }

    @Test
    public void testOr_matchesAnyMatch_returnsTrue() {
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(Collections.singletonList(matchFalse));
        orEval.add(matchTrue);
        Assert.assertTrue(orEval.matches(root, targetNode));
    }

    @Test
    public void testOr_matchesNoneMatch_returnsFalse() {
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(Collections.singletonList(matchFalse));
        orEval.add(matchFalse);
        Assert.assertFalse(orEval.matches(root, targetNode));
    }

    @Test
    public void testOr_toString() {
        CombiningEvaluator.Or orEval = new CombiningEvaluator.Or(Collections.singletonList(matchTrue));
        orEval.add(matchFalse);
        Assert.assertEquals(":or[matchTrue, matchFalse]", orEval.toString());
    }
}
