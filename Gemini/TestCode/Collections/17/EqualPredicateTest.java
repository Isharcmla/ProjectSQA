package org.apache.commons.collections.functors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.collections.Predicate;
import org.junit.Test;

public class EqualPredicateTest {

    @Test
    public void testEqualPredicate_withNullObject_returnsNullPredicate() {
        Predicate<String> predicate = EqualPredicate.equalPredicate((String) null);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("test"));
    }

    @Test
    public void testEqualPredicate_withNonNullObject_returnsEqualPredicate() {
        Predicate<String> predicate = EqualPredicate.equalPredicate("Hello");
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertEquals("Hello", ((EqualPredicate<String>) predicate).getValue());
        assertTrue(predicate.evaluate("Hello"));
        assertFalse(predicate.evaluate("World"));
    }

    @Test
    public void testEqualPredicateWithEquator_withNullObject_returnsNullPredicate() {
        Equator<String> equator = new DefaultEquator<String>();
        Predicate<String> predicate = EqualPredicate.equalPredicate((String) null, equator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof NullPredicate);
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("test"));
    }

    @Test
    public void testEqualPredicateWithEquator_withNonNullObject_returnsEqualPredicate() {
        Equator<String> caseInsensitiveEquator = new Equator<String>() {
            public boolean equate(String o1, String o2) {
                if (o1 == null) {
                    return o2 == null;
                }
                return o1.equalsIgnoreCase(o2);
            }

            public int hash(String o) {
                return o == null ? 0 : o.toLowerCase().hashCode();
            }
        };

        Predicate<String> predicate = EqualPredicate.equalPredicate("abc", caseInsensitiveEquator);
        assertNotNull(predicate);
        assertTrue(predicate instanceof EqualPredicate);
        assertEquals("abc", ((EqualPredicate<String>) predicate).getValue());
        assertTrue(predicate.evaluate("ABC"));
        assertTrue(predicate.evaluate("abc"));
        assertFalse(predicate.evaluate("def"));
    }

    @Test
    public void testConstructor_singleArg_initializesCorrectly() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("testValue");
        assertEquals("testValue", predicate.getValue());
        assertTrue(predicate.evaluate("testValue"));
        assertFalse(predicate.evaluate("differentValue"));
    }

    @Test
    public void testConstructor_twoArgs_initializesCorrectly() {
        Equator<Integer> equator = new DefaultEquator<Integer>();
        EqualPredicate<Integer> predicate = new EqualPredicate<Integer>(Integer.valueOf(100), equator);
        assertEquals(Integer.valueOf(100), predicate.getValue());
        assertTrue(predicate.evaluate(Integer.valueOf(100)));
        assertFalse(predicate.evaluate(Integer.valueOf(200)));
    }

    @Test
    public void testConstructor_withNullObject_allowsNullValue() {
        EqualPredicate<String> predicate = new EqualPredicate<String>(null);
        assertNull(predicate.getValue());
        assertTrue(predicate.evaluate(null));
        assertFalse(predicate.evaluate("nonNull"));
    }

    @Test
    public void testEvaluate_emptyString() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("");
        assertEquals("", predicate.getValue());
        assertTrue(predicate.evaluate(""));
        assertTrue(predicate.evaluate(new String("")));
        assertFalse(predicate.evaluate(" "));
        assertFalse(predicate.evaluate("non-empty"));
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testEvaluate_numericValues_zeroAndNegative() {
        EqualPredicate<Integer> zeroPredicate = new EqualPredicate<Integer>(Integer.valueOf(0));
        assertTrue(zeroPredicate.evaluate(Integer.valueOf(0)));
        assertFalse(zeroPredicate.evaluate(Integer.valueOf(1)));
        assertFalse(zeroPredicate.evaluate(Integer.valueOf(-1)));

        EqualPredicate<Integer> negativePredicate = new EqualPredicate<Integer>(Integer.valueOf(-42));
        assertTrue(negativePredicate.evaluate(Integer.valueOf(-42)));
        assertFalse(negativePredicate.evaluate(Integer.valueOf(42)));
        assertFalse(negativePredicate.evaluate(Integer.valueOf(0)));

        EqualPredicate<Integer> minIntPredicate = new EqualPredicate<Integer>(Integer.valueOf(Integer.MIN_VALUE));
        assertTrue(minIntPredicate.evaluate(Integer.valueOf(Integer.MIN_VALUE)));
        assertFalse(minIntPredicate.evaluate(Integer.valueOf(Integer.MAX_VALUE)));
    }

    @Test
    public void testEvaluate_emptyArrayReference() {
        int[] emptyArray = new int[0];
        EqualPredicate<int[]> predicate = new EqualPredicate<int[]>(emptyArray);
        assertSame(emptyArray, predicate.getValue());
        assertTrue(predicate.evaluate(emptyArray));
        assertFalse(predicate.evaluate(new int[0]));
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testEvaluate_nullInputAgainstNonNullTarget() {
        EqualPredicate<String> predicate = new EqualPredicate<String>("value");
        assertFalse(predicate.evaluate(null));
    }

    @Test
    public void testGetValue_returnsExactStoredReference() {
        Object obj = new Object();
        EqualPredicate<Object> predicate = new EqualPredicate<Object>(obj);
        assertSame(obj, predicate.getValue());
    }

    @Test
    public void testSerialization_preservesStateAndEvaluatesCorrectly() throws Exception {
        EqualPredicate<String> original = new EqualPredicate<String>("serializeMe");

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        @SuppressWarnings("unchecked")
        EqualPredicate<String> deserialized = (EqualPredicate<String>) ois.readObject();
        ois.close();

        assertEquals(original.getValue(), deserialized.getValue());
        assertTrue(deserialized.evaluate("serializeMe"));
        assertFalse(deserialized.evaluate("other"));
    }
}
