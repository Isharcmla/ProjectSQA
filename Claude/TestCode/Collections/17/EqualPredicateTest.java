package org.apache.commons.collections.functors;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.collections.Predicate;

public class EqualPredicateTest {

    // ---------- equalPredicate(T object) factory ----------

    @Test
    public void testEqualPredicateFactory_normalInput_createsEqualPredicate() {
        Predicate<String> predicate = EqualPredicate.equalPredicate("test");
        assertTrue(predicate instanceof EqualPredicate);
        assertTrue(predicate.evaluate("test"));
        assertFalse(predicate.evaluate("other"));
    }

    @Test
    public void testEqualPredicateFactory_nullObject_returnsNullPredicate() {
        Predicate<String> predicate = EqualPredicate.equalPredicate(null);
        assertNotNull(predicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("something"));
    }

    // ---------- equalPredicate(T object, Equator<T> equator) factory ----------

    @Test
    public void testEqualPredicateFactoryWithEquator_normalInput_createsEqualPredicate() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> predicate = EqualPredicate.equalPredicate("value", equator);
        assertTrue(predicate instanceof EqualPredicate);
        assertTrue(predicate.evaluate("value"));
        assertFalse(predicate.evaluate("different"));
    }

    @Test
    public void testEqualPredicateFactoryWithEquator_nullObject_returnsNullPredicate() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> predicate = EqualPredicate.equalPredicate(null, equator);
        assertNotNull(predicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("something"));
    }

    // ---------- Constructor EqualPredicate(T object) ----------

    @Test
    public void testConstructorSingleArg_normalInput_evaluatesEqual() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("abc");
        assertTrue(predicate.evaluate("abc"));
        assertFalse(predicate.evaluate("xyz"));
    }

    @Test
    public void testConstructorSingleArg_nullValue_evaluatesNullEqualsNull() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("notNull"));
    }

    @Test
    public void testConstructorSingleArg_emptyString_evaluatesCorrectly() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("");
        assertTrue(predicate.evaluate(""));
        assertFalse(predicate.evaluate("nonEmpty"));
    }

    // ---------- Constructor EqualPredicate(T object, Equator<T> equator) ----------

    @Test
    public void testConstructorWithEquator_normalInput_evaluatesEqual() {
        Equator<Integer> equator = new DefaultEquator<Integer>();
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(5, equator);
        assertTrue(predicate.evaluate(5));
        assertFalse(predicate.evaluate(10));
    }

    @Test
    public void testConstructorWithEquator_negativeValue_evaluatesCorrectly() {
        Equator<Integer> equator = new DefaultEquator<Integer>();
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(-1, equator);
        assertTrue(predicate.evaluate(-1));
        assertFalse(predicate.evaluate(1));
    }

    @Test
    public void testConstructorWithEquator_zeroValue_evaluatesCorrectly() {
        Equator<Integer> equator = new DefaultEquator<Integer>();
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(0, equator);
        assertTrue(predicate.evaluate(0));
        assertFalse(predicate.evaluate(1));
    }

    // ---------- evaluate method ----------

    @Test
    public void testEvaluate_bothNull_returnsTrue() {
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(null);
        assertTrue(predicate.evaluate(null));
    }

    @Test
    public void testEvaluate_storedNullInputNotNull_returnsFalse() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertFalse(predicate.evaluate("value"));
    }

    @Test
    public void testEvaluate_storedNotNullInputNull_returnsFalse() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("value");
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testEvaluate_equalObjects_returnsTrue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("same");
        assertTrue(predicate.evaluate("same"));
    }

    @Test
    public void testEvaluate_differentObjects_returnsFalse() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("one");
        assertFalse(predicate.evaluate("two"));
    }

    // ---------- getValue method ----------

    @Test
    public void testGetValue_normalInput_returnsStoredValue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("myValue");
        assertEquals("myValue", predicate.getValue());
    }

    @Test
    public void testGetValue_nullValue_returnsNull() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertNull(predicate.getValue());
    }

    @Test
    public void testGetValue_withEquatorConstructor_returnsStoredValue() {
        Equator<Integer> equator = new DefaultEquator<Integer>();
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(42, equator);
        assertEquals(Integer.valueOf(42), predicate.getValue());
    }
}
