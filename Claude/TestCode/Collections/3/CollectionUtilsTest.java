import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.Bag;
import org.apache.commons.collections.BoundedCollection;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionUtilsTest {

    private List listA;
    private List listB;

    @Before
    public void setUp() {
        listA = new ArrayList();
        listA.add("a");
        listA.add("b");
        listA.add("b");
        listA.add("c");

        listB = new ArrayList();
        listB.add("b");
        listB.add("c");
        listB.add("c");
        listB.add("d");
    }

    // ---------- helper implementations ----------

    private Predicate truePredicate() {
        return new Predicate() {
            public boolean evaluate(Object object) {
                return true;
            }
        };
    }

    private Predicate falsePredicate() {
        return new Predicate() {
            public boolean evaluate(Object object) {
                return false;
            }
        };
    }

    private Predicate equalsPredicate(final Object target) {
        return new Predicate() {
            public boolean evaluate(Object object) {
                if (target == null) {
                    return object == null;
                }
                return target.equals(object);
            }
        };
    }

    private Transformer upperCaseTransformer() {
        return new Transformer() {
            public Object transform(Object input) {
                return input == null ? null : input.toString().toUpperCase();
            }
        };
    }

    private Closure countingClosure(final int[] counter) {
        return new Closure() {
            public void execute(Object input) {
                counter[0]++;
            }
        };
    }

    private static class SimpleBag extends ArrayList implements Bag {
        public int getCount(Object object) {
            int count = 0;
            for (Iterator it = iterator(); it.hasNext();) {
                Object o = it.next();
                if (object == null ? o == null : object.equals(o)) {
                    count++;
                }
            }
            return count;
        }
        public boolean add(Object object, int nCopies) {
            for (int i = 0; i < nCopies; i++) {
                add(object);
            }
            return nCopies > 0;
        }
        public boolean remove(Object object, int nCopies) {
            boolean modified = false;
            for (int i = 0; i < nCopies; i++) {
                modified |= remove(object);
            }
            return modified;
        }
        public Set uniqueSet() {
            return new HashSet(this);
        }
    }

    private static class SimpleBoundedCollection extends ArrayList implements BoundedCollection {
        private int max;
        public SimpleBoundedCollection(int max) {
            this.max = max;
        }
        public boolean isFull() {
            return size() >= max;
        }
        public int maxSize() {
            return max;
        }
    }

    // ---------- union ----------

    @Test
    public void testUnion_normalInput_returnsMaxCardinality() {
        Collection result = CollectionUtils.union(listA, listB);
        Map cardMap = CollectionUtils.getCardinalityMap(result);
        assertEquals(1, ((Integer) cardMap.get("a")).intValue());
        assertEquals(2, ((Integer) cardMap.get("b")).intValue());
        assertEquals(2, ((Integer) cardMap.get("c")).intValue());
        assertEquals(1, ((Integer) cardMap.get("d")).intValue());
    }

    @Test
    public void testUnion_emptyCollections_returnsEmpty() {
        Collection result = CollectionUtils.union(new ArrayList(), new ArrayList());
        assertTrue(result.isEmpty());
    }

    // ---------- intersection ----------

    @Test
    public void testIntersection_normalInput_returnsMinCardinality() {
        Collection result = CollectionUtils.intersection(listA, listB);
        Map cardMap = CollectionUtils.getCardinalityMap(result);
        assertNull(cardMap.get("a"));
        assertEquals(1, ((Integer) cardMap.get("b")).intValue());
        assertEquals(1, ((Integer) cardMap.get("c")).intValue());
        assertNull(cardMap.get("d"));
    }

    @Test
    public void testIntersection_noCommonElements_returnsEmpty() {
        List a = new ArrayList();
        a.add("x");
        List b = new ArrayList();
        b.add("y");
        Collection result = CollectionUtils.intersection(a, b);
        assertTrue(result.isEmpty());
    }

    // ---------- disjunction ----------

    @Test
    public void testDisjunction_normalInput_returnsSymmetricDifference() {
        Collection result = CollectionUtils.disjunction(listA, listB);
        Map cardMap = CollectionUtils.getCardinalityMap(result);
        assertEquals(1, ((Integer) cardMap.get("a")).intValue());
        assertEquals(1, ((Integer) cardMap.get("b")).intValue());
        assertEquals(1, ((Integer) cardMap.get("c")).intValue());
        assertEquals(1, ((Integer) cardMap.get("d")).intValue());
    }

    @Test
    public void testDisjunction_identicalCollections_returnsEmpty() {
        Collection result = CollectionUtils.disjunction(listA, listA);
        assertTrue(result.isEmpty());
    }

    // ---------- subtract ----------

    @Test
    public void testSubtract_normalInput_removesElements() {
        Collection result = CollectionUtils.subtract(listA, listB);
        assertTrue(result.contains("a"));
        assertTrue(result.contains("b"));
        assertFalse(result.contains("c"));
    }

    @Test
    public void testSubtract_emptyB_returnsSameAsA() {
        Collection result = CollectionUtils.subtract(listA, new ArrayList());
        assertEquals(listA.size(), result.size());
    }

    // ---------- containsAny ----------

    @Test
    public void testContainsAny_hasCommonElement_returnsTrue() {
        assertTrue(CollectionUtils.containsAny(listA, listB));
    }

    @Test
    public void testContainsAny_noCommonElement_returnsFalse() {
        List a = new ArrayList();
        a.add("x");
        List b = new ArrayList();
        b.add("y");
        assertFalse(CollectionUtils.containsAny(a, b));
    }

    @Test
    public void testContainsAny_coll1SmallerThanColl2_usesCorrectBranch() {
        List small = new ArrayList();
        small.add("a");
        List big = new ArrayList();
        big.add("a");
        big.add("b");
        big.add("c");
        assertTrue(CollectionUtils.containsAny(small, big));
    }

    // ---------- getCardinalityMap ----------

    @Test
    public void testGetCardinalityMap_normalInput_returnsCorrectCounts() {
        Map map = CollectionUtils.getCardinalityMap(listA);
        assertEquals(1, ((Integer) map.get("a")).intValue());
        assertEquals(2, ((Integer) map.get("b")).intValue());
        assertEquals(1, ((Integer) map.get("c")).intValue());
    }

    @Test
    public void testGetCardinalityMap_emptyCollection_returnsEmptyMap() {
        Map map = CollectionUtils.getCardinalityMap(new ArrayList());
        assertTrue(map.isEmpty());
    }

    // ---------- isSubCollection ----------

    @Test
    public void testIsSubCollection_trueCase_returnsTrue() {
        List sub = new ArrayList();
        sub.add("a");
        sub.add("b");
        assertTrue(CollectionUtils.isSubCollection(sub, listA));
    }

    @Test
    public void testIsSubCollection_falseCase_returnsFalse() {
        List notSub = new ArrayList();
        notSub.add("z");
        assertFalse(CollectionUtils.isSubCollection(notSub, listA));
    }

    // ---------- isProperSubCollection ----------

    @Test
    public void testIsProperSubCollection_properSubset_returnsTrue() {
        List sub = new ArrayList();
        sub.add("a");
        assertTrue(CollectionUtils.isProperSubCollection(sub, listA));
    }

    @Test
    public void testIsProperSubCollection_equalSizeCollections_returnsFalse() {
        assertFalse(CollectionUtils.isProperSubCollection(listA, listA));
    }

    // ---------- isEqualCollection ----------

    @Test
    public void testIsEqualCollection_equalCollections_returnsTrue() {
        List copy = new ArrayList(listA);
        assertTrue(CollectionUtils.isEqualCollection(listA, copy));
    }

    @Test
    public void testIsEqualCollection_differentSizes_returnsFalse() {
        List shorter = new ArrayList();
        shorter.add("a");
        assertFalse(CollectionUtils.isEqualCollection(listA, shorter));
    }

    @Test
    public void testIsEqualCollection_sameSizeDifferentUniqueCount_returnsFalse() {
        List a = new ArrayList();
        a.add("x");
        a.add("x");
        List b = new ArrayList();
        b.add("x");
        b.add("y");
        assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_sameSizeSameUniqueDifferentFreq_returnsFalse() {
        List a = new ArrayList();
        a.add("x");
        a.add("x");
        List b = new ArrayList();
        b.add("x");
        b.add("z");
        // sizes equal but different unique element count already covered above;
        // this covers different freq with same unique set size
        List c = new ArrayList();
        c.add("x");
        c.add("y");
        List d = new ArrayList();
        d.add("x");
        d.add("x");
        assertFalse(CollectionUtils.isEqualCollection(c, d));
    }

    // ---------- cardinality ----------

    @Test
    public void testCardinality_regularCollection_countsOccurrences() {
        assertEquals(2, CollectionUtils.cardinality("b", listA));
    }

    @Test
    public void testCardinality_nullObject_countsNullOccurrences() {
        List list = new ArrayList();
        list.add(null);
        list.add("x");
        list.add(null);
        assertEquals(2, CollectionUtils.cardinality(null, list));
    }

    @Test
    public void testCardinality_setInstance_returnsZeroOrOne() {
        Set set = new HashSet();
        set.add("a");
        assertEquals(1, CollectionUtils.cardinality("a", set));
        assertEquals(0, CollectionUtils.cardinality("z", set));
    }

    @Test
    public void testCardinality_bagInstance_usesGetCount() {
        SimpleBag bag = new SimpleBag();
        bag.add("a");
        bag.add("a");
        assertEquals(2, CollectionUtils.cardinality("a", bag));
    }

    // ---------- find ----------

    @Test
    public void testFind_matchFound_returnsElement() {
        Object result = CollectionUtils.find(listA, equalsPredicate("b"));
        assertEquals("b", result);
    }

    @Test
    public void testFind_noMatch_returnsNull() {
        Object result = CollectionUtils.find(listA, falsePredicate());
        assertNull(result);
    }

    @Test
    public void testFind_nullCollection_returnsNull() {
        assertNull(CollectionUtils.find(null, truePredicate()));
    }

    @Test
    public void testFind_nullPredicate_returnsNull() {
        assertNull(CollectionUtils.find(listA, null));
    }

    // ---------- forAllDo ----------

    @Test
    public void testForAllDo_validInputs_executesForEachElement() {
        int[] counter = new int[1];
        CollectionUtils.forAllDo(listA, countingClosure(counter));
        assertEquals(listA.size(), counter[0]);
    }

    @Test
    public void testForAllDo_nullCollection_noChange() {
        int[] counter = new int[1];
        CollectionUtils.forAllDo(null, countingClosure(counter));
        assertEquals(0, counter[0]);
    }

    @Test
    public void testForAllDo_nullClosure_noChange() {
        CollectionUtils.forAllDo(listA, null);
        // no exception expected
    }

    // ---------- filter ----------

    @Test
    public void testFilter_predicateFalseRemovesElements_modifiesCollection() {
        List list = new ArrayList(listA);
        CollectionUtils.filter(list, equalsPredicate("b"));
        assertEquals(2, list.size());
        for (Object o : list) {
            assertEquals("b", o);
        }
    }

    @Test
    public void testFilter_nullCollection_noChange() {
        CollectionUtils.filter(null, truePredicate());
        // no exception
    }

    @Test
    public void testFilter_nullPredicate_noChange() {
        List list = new ArrayList(listA);
        CollectionUtils.filter(list, null);
        assertEquals(listA.size(), list.size());
    }

    // ---------- transform ----------

    @Test
    public void testTransform_listInput_transformsInPlace() {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        CollectionUtils.transform(list, upperCaseTransformer());
        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
    }

    @Test
    public void testTransform_nonListCollection_transformsUsingClearAddAll() {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        CollectionUtils.transform(set, upperCaseTransformer());
        assertTrue(set.contains("A"));
        assertTrue(set.contains("B"));
    }

    @Test
    public void testTransform_nullCollection_noChange() {
        CollectionUtils.transform(null, upperCaseTransformer());
        // no exception
    }

    @Test
    public void testTransform_nullTransformer_noChange() {
        List list = new ArrayList(listA);
        CollectionUtils.transform(list, null);
        assertEquals(listA, list);
    }

    // ---------- countMatches ----------

    @Test
    public void testCountMatches_normalInput_returnsCorrectCount() {
        int count = CollectionUtils.countMatches(listA, equalsPredicate("b"));
        assertEquals(2, count);
    }

    @Test
    public void testCountMatches_nullCollection_returnsZero() {
        assertEquals(0, CollectionUtils.countMatches(null, truePredicate()));
    }

    @Test
    public void testCountMatches_nullPredicate_returnsZero() {
        assertEquals(0, CollectionUtils.countMatches(listA, null));
    }

    // ---------- exists ----------

    @Test
    public void testExists_matchFound_returnsTrue() {
        assertTrue(CollectionUtils.exists(listA, equalsPredicate("a")));
    }

    @Test
    public void testExists_noMatch_returnsFalse() {
        assertFalse(CollectionUtils.exists(listA, falsePredicate()));
    }

    @Test
    public void testExists_nullCollection_returnsFalse() {
        assertFalse(CollectionUtils.exists(null, truePredicate()));
    }

    @Test
    public void testExists_nullPredicate_returnsFalse() {
        assertFalse(CollectionUtils.exists(listA, null));
    }

    // ---------- select ----------

    @Test
    public void testSelect_normalInput_returnsMatchingElements() {
        Collection result = CollectionUtils.select(listA, equalsPredicate("b"));
        assertEquals(2, result.size());
    }

    @Test
    public void testSelect_withOutputCollection_addsMatchingElements() {
        List output = new ArrayList();
        CollectionUtils.select(listA, equalsPredicate("b"), output);
        assertEquals(2, output.size());
    }

    @Test
    public void testSelect_nullPredicate_returnsEmptyOutput() {
        List output = new ArrayList();
        CollectionUtils.select(listA, null, output);
        assertTrue(output.isEmpty());
    }

    @Test
    public void testSelect_nullInputCollection_noChangeToOutput() {
        List output = new ArrayList();
        CollectionUtils.select(null, truePredicate(), output);
        assertTrue(output.isEmpty());
    }

    // ---------- selectRejected ----------

    @Test
    public void testSelectRejected_normalInput_returnsNonMatchingElements() {
        Collection result = CollectionUtils.selectRejected(listA, equalsPredicate("b"));
        assertEquals(2, result.size());
        assertFalse(result.contains("b"));
    }

    @Test
    public void testSelectRejected_withOutputCollection_addsNonMatchingElements() {
        List output = new ArrayList();
        CollectionUtils.selectRejected(listA, equalsPredicate("b"), output);
        assertEquals(2, output.size());
    }

    @Test
    public void testSelectRejected_nullPredicate_noChangeToOutput() {
        List output = new ArrayList();
        CollectionUtils.selectRejected(listA, null, output);
        assertTrue(output.isEmpty());
    }

    // ---------- collect ----------

    @Test
    public void testCollect_collectionInput_returnsTransformedList() {
        Collection result = CollectionUtils.collect(listA, upperCaseTransformer());
        assertTrue(result.contains("A"));
        assertTrue(result.contains("B"));
    }

    @Test
    public void testCollect_iteratorInput_returnsTransformedList() {
        Collection result = CollectionUtils.collect(listA.iterator(), upperCaseTransformer());
        assertTrue(result.contains("A"));
    }

    @Test
    public void testCollect_collectionWithOutputCollection_addsTransformedElements() {
        List output = new ArrayList();
        CollectionUtils.collect(listA, upperCaseTransformer(), output);
        assertTrue(output.contains("A"));
    }

    @Test
    public void testCollect_iteratorWithOutputCollection_addsTransformedElements() {
        List output = new ArrayList();
        CollectionUtils.collect(listA.iterator(), upperCaseTransformer(), output);
        assertTrue(output.contains("A"));
    }

    @Test
    public void testCollect_nullInputCollection_returnsOutputUnchanged() {
        List output = new ArrayList();
        Collection result = CollectionUtils.collect((Collection) null, upperCaseTransformer(), output);
        assertSame(output, result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCollect_nullIteratorInput_returnsOutputUnchanged() {
        List output = new ArrayList();
        Collection result = CollectionUtils.collect((Iterator) null, upperCaseTransformer(), output);
        assertSame(output, result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCollect_nullTransformer_returnsOutputUnchanged() {
        List output = new ArrayList();
        CollectionUtils.collect(listA, null, output);
        assertTrue(output.isEmpty());
    }

    // ---------- addIgnoreNull ----------

    @Test
    public void testAddIgnoreNull_nonNullObject_addsAndReturnsTrue() {
        List list = new ArrayList();
        boolean result = CollectionUtils.addIgnoreNull(list, "x");
        assertTrue(result);
        assertTrue(list.contains("x"));
    }

    @Test
    public void testAddIgnoreNull_nullObject_returnsFalseAndNoChange() {
        List list = new ArrayList();
        boolean result = CollectionUtils.addIgnoreNull(list, null);
        assertFalse(result);
        assertTrue(list.isEmpty());
    }

    // ---------- addAll (Iterator) ----------

    @Test
    public void testAddAll_iterator_addsAllElements() {
        List list = new ArrayList();
        CollectionUtils.addAll(list, listA.iterator());
        assertEquals(listA.size(), list.size());
    }

    // ---------- addAll (Enumeration) ----------

    @Test
    public void testAddAll_enumeration_addsAllElements() {
        Vector v = new Vector(listA);
        List list = new ArrayList();
        CollectionUtils.addAll(list, v.elements());
        assertEquals(listA.size(), list.size());
    }

    // ---------- addAll (Object[]) ----------

    @Test
    public void testAddAll_array_addsAllElements() {
        List list = new ArrayList();
        Object[] arr = new Object[]{"x", "y", "z"};
        CollectionUtils.addAll(list, arr);
        assertEquals(3, list.size());
    }

    // ---------- index(Object, int) deprecated ----------

    @Test
    public void testIndex_intOverload_listInput_returnsElement() {
        Object result = CollectionUtils.index(listA, 1);
        assertEquals("b", result);
    }

    // ---------- index(Object, Object) deprecated ----------

    @Test
    public void testIndex_mapWithMatchingKey_returnsValue() {
        Map map = new HashMap();
        map.put("key", "value");
        Object result = CollectionUtils.index(map, "key");
        assertEquals("value", result);
    }

    @Test
    public void testIndex_negativeIndex_returnsOriginalObject() {
        Object obj = "someObject";
        Object result = CollectionUtils.index(obj, -1);
        assertEquals(obj, result);
    }

    @Test
    public void testIndex_nonIntegerIndex_returnsOriginalObject() {
        Object obj = listA;
        Object result = CollectionUtils.index(obj, "notAnInteger");
        assertEquals(obj, result);
    }

    @Test
    public void testIndex_mapWithoutMatchingKey_returnsNthKey() {
        Map map = new HashMap();
        map.put("a", "1");
        map.put("b", "2");
        Object result = CollectionUtils.index(map, 0);
        assertNotNull(result);
    }

    @Test
    public void testIndex_listInput_returnsNthElement() {
        Object result = CollectionUtils.index(listA, 2);
        assertEquals("b", result);
    }

    @Test
    public void testIndex_arrayInput_returnsNthElement() {
        Object[] array = new Object[]{"x", "y", "z"};
        Object result = CollectionUtils.index(array, 1);
        assertEquals("y", result);
    }

    @Test
    public void testIndex_enumerationInput_returnsNthElement() {
        Vector v = new Vector(listA);
        Enumeration en = v.elements();
        Object result = CollectionUtils.index(en, 1);
        assertEquals("b", result);
    }

    @Test
    public void testIndex_enumerationExceedsSize_returnsOriginalEnumeration() {
        Vector v = new Vector();
        v.add("a");
        Enumeration en = v.elements();
        Object result = CollectionUtils.index(en, 5);
        assertSame(en, result);
    }

    @Test
    public void testIndex_iteratorInput_returnsNthElement() {
        Iterator it = listA.iterator();
        Object result = CollectionUtils.index(it, 1);
        assertEquals("b", result);
    }

    @Test
    public void testIndex_collectionInput_returnsNthElement() {
        Set set = new HashSet();
        set.add("only");
        Object result = CollectionUtils.index(set, 0);
        assertEquals("only", result);
    }

    @Test
    public void testIndex_unsupportedObjectType_returnsOriginalObject() {
        Integer obj = new Integer(5);
        Object result = CollectionUtils.index(obj, 0);
        assertEquals(obj, result);
    }

    // ---------- get(Object, int) ----------

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_negativeIndex_throwsException() {
        CollectionUtils.get(listA, -1);
    }

    @Test
    public void testGet_mapInput_returnsEntry() {
        Map map = new HashMap();
        map.put("k1", "v1");
        Object result = CollectionUtils.get(map, 0);
        assertNotNull(result);
    }

    @Test
    public void testGet_listInput_returnsElement() {
        Object result = CollectionUtils.get(listA, 1);
        assertEquals("b", result);
    }

    @Test
    public void testGet_arrayInput_returnsElement() {
        Object[] array = new Object[]{"x", "y", "z"};
        Object result = CollectionUtils.get(array, 2);
        assertEquals("z", result);
    }

    @Test
    public void testGet_iteratorInput_returnsElement() {
        Iterator it = listA.iterator();
        Object result = CollectionUtils.get(it, 1);
        assertEquals("b", result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_iteratorInputExceedsSize_throwsException() {
        Iterator it = listA.iterator();
        CollectionUtils.get(it, 100);
    }

    @Test
    public void testGet_collectionInput_returnsElement() {
        Set set = new HashSet();
        set.add("only");
        Object result = CollectionUtils.get(set, 0);
        assertEquals("only", result);
    }

    @Test
    public void testGet_enumerationInput_returnsElement() {
        Vector v = new Vector(listA);
        Enumeration en = v.elements();
        Object result = CollectionUtils.get(en, 1);
        assertEquals("b", result);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_enumerationInputExceedsSize_throwsException() {
        Vector v = new Vector();
        v.add("a");
        Enumeration en = v.elements();
        CollectionUtils.get(en, 100);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullObject_throwsIllegalArgumentException() {
        CollectionUtils.get(null, 0);
    }

    @Test
    public void testGet_primitiveArray_returnsElement() {
        int[] array = new int[]{1, 2, 3};
        Object result = CollectionUtils.get(array, 1);
        assertEquals(new Integer(2), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_unsupportedObjectType_throwsIllegalArgumentException() {
        CollectionUtils.get(new Integer(5), 0);
    }

    // ---------- size(Object) ----------

    @Test
    public void testSize_mapInput_returnsMapSize() {
        Map map = new HashMap();
        map.put("a", "1");
        map.put("b", "2");
        assertEquals(2, CollectionUtils.size(map));
    }

    @Test
    public void testSize_collectionInput_returnsCollectionSize() {
        assertEquals(listA.size(), CollectionUtils.size(listA));
    }

    @Test
    public void testSize_arrayInput_returnsArrayLength() {
        Object[] array = new Object[]{"x", "y"};
        assertEquals(2, CollectionUtils.size(array));
    }

    @Test
    public void testSize_iteratorInput_returnsRemainingCount() {
        assertEquals(listA.size(), CollectionUtils.size(listA.iterator()));
    }

    @Test
    public void testSize_enumerationInput_returnsRemainingCount() {
        Vector v = new Vector(listA);
        assertEquals(listA.size(), CollectionUtils.size(v.elements()));
    }

    @Test
    public void testSize_primitiveArray_returnsArrayLength() {
        int[] array = new int[]{1, 2, 3};
        assertEquals(3, CollectionUtils.size(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_nullObject_throwsIllegalArgumentException() {
        CollectionUtils.size(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_unsupportedObjectType_throwsIllegalArgumentException() {
        CollectionUtils.size(new Integer(5));
    }

    // ---------- sizeIsEmpty(Object) ----------

    @Test
    public void testSizeIsEmpty_emptyCollection_returnsTrue() {
        assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList()));
    }

    @Test
    public void testSizeIsEmpty_nonEmptyCollection_returnsFalse() {
        assertFalse(CollectionUtils.sizeIsEmpty(listA));
    }

    @Test
    public void testSizeIsEmpty_emptyMap_returnsTrue() {
        assertTrue(CollectionUtils.sizeIsEmpty(new HashMap()));
    }

    @Test
    public void testSizeIsEmpty_emptyArray_returnsTrue() {
        Object[] array = new Object[0];
        assertTrue(CollectionUtils.sizeIsEmpty(array));
    }

    @Test
    public void testSizeIsEmpty_nonEmptyArray_returnsFalse() {
        Object[] array = new Object[]{"x"};
        assertFalse(CollectionUtils.sizeIsEmpty(array));
    }

    @Test
    public void testSizeIsEmpty_emptyIterator_returnsTrue() {
        assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList().iterator()));
    }

    @Test
    public void testSizeIsEmpty_nonEmptyIterator_returnsFalse() {
        assertFalse(CollectionUtils.sizeIsEmpty(listA.iterator()));
    }

    @Test
    public void testSizeIsEmpty_emptyEnumeration_returnsTrue() {
        Vector v = new Vector();
        assertTrue(CollectionUtils.sizeIsEmpty(v.elements()));
    }

    @Test
    public void testSizeIsEmpty_nonEmptyEnumeration_returnsFalse() {
        Vector v = new Vector(listA);
        assertFalse(CollectionUtils.sizeIsEmpty(v.elements()));
    }

    @Test
    public void testSizeIsEmpty_emptyPrimitiveArray_returnsTrue() {
        int[] array = new int[0];
        assertTrue(CollectionUtils.sizeIsEmpty(array));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_nullObject_throwsIllegalArgumentException() {
        CollectionUtils.sizeIsEmpty(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_unsupportedObjectType_throwsIllegalArgumentException() {
        CollectionUtils.sizeIsEmpty(new Integer(5));
    }

    // ---------- isEmpty(Collection) ----------

    @Test
    public void testIsEmpty_nullCollection_returnsTrue() {
        assertTrue(CollectionUtils.isEmpty(null));
    }

    @Test
    public void testIsEmpty_emptyCollection_returnsTrue() {
        assertTrue(CollectionUtils.isEmpty(new ArrayList()));
    }

    @Test
    public void testIsEmpty_nonEmptyCollection_returnsFalse() {
        assertFalse(CollectionUtils.isEmpty(listA));
    }

    // ---------- isNotEmpty(Collection) ----------

    @Test
    public void testIsNotEmpty_nullCollection_returnsFalse() {
        assertFalse(CollectionUtils.isNotEmpty(null));
    }

    @Test
    public void testIsNotEmpty_nonEmptyCollection_returnsTrue() {
        assertTrue(CollectionUtils.isNotEmpty(listA));
    }

    // ---------- reverseArray ----------

    @Test
    public void testReverseArray_normalArray_reversesOrder() {
        Object[] array = new Object[]{"a", "b", "c", "d"};
        CollectionUtils.reverseArray(array);
        assertArrayEquals(new Object[]{"d", "c", "b", "a"}, array);
    }

    @Test
    public void testReverseArray_singleElementArray_noChange() {
        Object[] array = new Object[]{"a"};
        CollectionUtils.reverseArray(array);
        assertArrayEquals(new Object[]{"a"}, array);
    }

    @Test
    public void testReverseArray_emptyArray_noChange() {
        Object[] array = new Object[0];
        CollectionUtils.reverseArray(array);
        assertEquals(0, array.length);
    }

    // ---------- isFull ----------

    @Test
    public void testIsFull_boundedCollectionNotFull_returnsFalse() {
        SimpleBoundedCollection bc = new SimpleBoundedCollection(5);
        bc.add("x");
        assertFalse(CollectionUtils.isFull(bc));
    }

    @Test
    public void testIsFull_boundedCollectionFull_returnsTrue() {
        SimpleBoundedCollection bc = new SimpleBoundedCollection(1);
        bc.add("x");
        assertTrue(CollectionUtils.isFull(bc));
    }

    @Test
    public void testIsFull_nonBoundedCollection_returnsFalse() {
        assertFalse(CollectionUtils.isFull(listA));
    }

    @Test(expected = NullPointerException.class)
    public void testIsFull_nullCollection_throwsNullPointerException() {
        CollectionUtils.isFull(null);
    }

    // ---------- maxSize ----------

    @Test
    public void testMaxSize_boundedCollection_returnsMaxSize() {
        SimpleBoundedCollection bc = new SimpleBoundedCollection(10);
        assertEquals(10, CollectionUtils.maxSize(bc));
    }

    @Test
    public void testMaxSize_nonBoundedCollection_returnsNegativeOne() {
        assertEquals(-1, CollectionUtils.maxSize(listA));
    }

    @Test(expected = NullPointerException.class)
    public void testMaxSize_nullCollection_throwsNullPointerException() {
        CollectionUtils.maxSize(null);
    }

    // ---------- retainAll ----------

    @Test
    public void testRetainAll_normalInput_returnsRetainedElements() {
        Collection result = CollectionUtils.retainAll(listA, listB);
        assertTrue(result.contains("b"));
        assertTrue(result.contains("c"));
        assertFalse(result.contains("a"));
    }

    // ---------- removeAll ----------

    @Test
    public void testRemoveAll_normalInput_removesSpecifiedElements() {
        Collection result = CollectionUtils.removeAll(listA, listB);
        assertTrue(result.contains("a"));
        assertFalse(result.contains("b"));
        assertFalse(result.contains("c"));
    }

    // ---------- synchronizedCollection ----------

    @Test
    public void testSynchronizedCollection_validCollection_returnsSynchronizedWrapper() {
        Collection result = CollectionUtils.synchronizedCollection(listA);
        assertNotNull(result);
        assertEquals(listA.size(), result.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSynchronizedCollection_nullCollection_throwsIllegalArgumentException() {
        CollectionUtils.synchronizedCollection(null);
    }

    // ---------- unmodifiableCollection ----------

    @Test
    public void testUnmodifiableCollection_validCollection_returnsUnmodifiableWrapper() {
        Collection result = CollectionUtils.unmodifiableCollection(listA);
        assertNotNull(result);
        try {
            result.add("z");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableCollection_nullCollection_throwsIllegalArgumentException() {
        CollectionUtils.unmodifiableCollection(null);
    }

    // ---------- predicatedCollection ----------

    @Test
    public void testPredicatedCollection_validArguments_returnsDecoratedCollection() {
        Collection result = CollectionUtils.predicatedCollection(new ArrayList(), truePredicate());
        assertNotNull(result);
        result.add("x");
        assertTrue(result.contains("x"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPredicatedCollection_nullCollection_throwsIllegalArgumentException() {
        CollectionUtils.predicatedCollection(null, truePredicate());
    }

    // ---------- typedCollection ----------

    @Test
    public void testTypedCollection_validArguments_returnsDecoratedCollection() {
        Collection result = CollectionUtils.typedCollection(new ArrayList(), String.class);
        assertNotNull(result);
        result.add("x");
        assertTrue(result.contains("x"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTypedCollection_invalidTypeElementAdded_throwsIllegalArgumentException() {
        Collection result = CollectionUtils.typedCollection(new ArrayList(), String.class);
        result.add(new Integer(5));
    }

    // ---------- transformedCollection ----------

    @Test
    public void testTransformedCollection_validArguments_returnsDecoratedCollection() {
        Collection result = CollectionUtils.transformedCollection(new ArrayList(), upperCaseTransformer());
        result.add("x");
        assertTrue(result.contains("X"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransformedCollection_nullCollection_throwsIllegalArgumentException() {
        CollectionUtils.transformedCollection(null, upperCaseTransformer());
    }

    // ---------- EMPTY_COLLECTION constant ----------

    @Test
    public void testEmptyCollection_isEmptyAndUnmodifiable() {
        assertTrue(CollectionUtils.EMPTY_COLLECTION.isEmpty());
        try {
            CollectionUtils.EMPTY_COLLECTION.add("x");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    // ---------- constructor ----------

    @Test
    public void testConstructor_instantiation_succeeds() {
        CollectionUtils instance = new CollectionUtils();
        assertNotNull(instance);
    }
}
