package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Vector;

public class CollectionUtilsTest {

    @Test
    public void testConstructor_default_instanceCreated() {
        CollectionUtils utils = new CollectionUtils();
        Assert.assertNotNull(utils);
    }

    @Test
    public void testEmptyCollection_constant_unmodifiableAndEmpty() {
        Assert.assertNotNull(CollectionUtils.EMPTY_COLLECTION);
        Assert.assertTrue(CollectionUtils.EMPTY_COLLECTION.isEmpty());
        try {
            CollectionUtils.EMPTY_COLLECTION.add("element");
            Assert.fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            // Success
        }
    }

    @Test
    public void testUnion_twoCollections_returnsUnion() {
        List<String> listA = Arrays.asList("A", "A", "B", "C");
        List<String> listB = Arrays.asList("A", "B", "B", "D");
        Collection result = CollectionUtils.union(listA, listB);

        Assert.assertEquals(6, result.size());
        Assert.assertEquals(2, CollectionUtils.cardinality("A", result));
        Assert.assertEquals(2, CollectionUtils.cardinality("B", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("C", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("D", result));
    }

    @Test
    public void testIntersection_twoCollections_returnsIntersection() {
        List<String> listA = Arrays.asList("A", "A", "B", "C");
        List<String> listB = Arrays.asList("A", "B", "B", "D");
        Collection result = CollectionUtils.intersection(listA, listB);

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(1, CollectionUtils.cardinality("A", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("B", result));
        Assert.assertEquals(0, CollectionUtils.cardinality("C", result));
        Assert.assertEquals(0, CollectionUtils.cardinality("D", result));
    }

    @Test
    public void testDisjunction_twoCollections_returnsSymmetricDifference() {
        List<String> listA = Arrays.asList("A", "A", "B", "C");
        List<String> listB = Arrays.asList("A", "B", "B", "D");
        Collection result = CollectionUtils.disjunction(listA, listB);

        Assert.assertEquals(4, result.size());
        Assert.assertEquals(1, CollectionUtils.cardinality("A", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("B", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("C", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("D", result));
    }

    @Test
    public void testSubtract_twoCollections_returnsDifference() {
        List<String> listA = Arrays.asList("A", "A", "B", "C");
        List<String> listB = Arrays.asList("A", "B", "D");
        Collection result = CollectionUtils.subtract(listA, listB);

        Assert.assertEquals(2, result.size());
        Assert.assertEquals(1, CollectionUtils.cardinality("A", result));
        Assert.assertEquals(0, CollectionUtils.cardinality("B", result));
        Assert.assertEquals(1, CollectionUtils.cardinality("C", result));
    }

    @Test
    public void testContainsAny_smallerFirstMatches_returnsTrue() {
        List<String> listA = Arrays.asList("A");
        List<String> listB = Arrays.asList("A", "B", "C");
        Assert.assertTrue(CollectionUtils.containsAny(listA, listB));
    }

    @Test
    public void testContainsAny_smallerFirstNoMatch_returnsFalse() {
        List<String> listA = Arrays.asList("X");
        List<String> listB = Arrays.asList("A", "B", "C");
        Assert.assertFalse(CollectionUtils.containsAny(listA, listB));
    }

    @Test
    public void testContainsAny_largerFirstMatches_returnsTrue() {
        List<String> listA = Arrays.asList("A", "B", "C");
        List<String> listB = Arrays.asList("B");
        Assert.assertTrue(CollectionUtils.containsAny(listA, listB));
    }

    @Test
    public void testContainsAny_largerFirstNoMatch_returnsFalse() {
        List<String> listA = Arrays.asList("A", "B", "C");
        List<String> listB = Arrays.asList("X", "Y");
        Assert.assertFalse(CollectionUtils.containsAny(listA, listB));
    }

    @Test
    public void testGetCardinalityMap_nonEmptyCollection_returnsMap() {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B", "A");
        Map map = CollectionUtils.getCardinalityMap(list);

        Assert.assertEquals(3, map.get("A"));
        Assert.assertEquals(2, map.get("B"));
        Assert.assertEquals(1, map.get("C"));
        Assert.assertNull(map.get("D"));
    }

    @Test
    public void testIsSubCollection_variousCases_returnsExpected() {
        List<String> a = Arrays.asList("A", "B");
        List<String> b = Arrays.asList("A", "A", "B", "C");
        List<String> c = Arrays.asList("A", "B", "B");

        Assert.assertTrue(CollectionUtils.isSubCollection(a, b));
        Assert.assertFalse(CollectionUtils.isSubCollection(c, b));
    }

    @Test
    public void testIsProperSubCollection_variousCases_returnsExpected() {
        List<String> a = Arrays.asList("A", "B");
        List<String> b = Arrays.asList("A", "A", "B", "C");
        List<String> c = Arrays.asList("A", "B");

        Assert.assertTrue(CollectionUtils.isProperSubCollection(a, b));
        Assert.assertFalse(CollectionUtils.isProperSubCollection(a, c));
        Assert.assertFalse(CollectionUtils.isProperSubCollection(b, a));
    }

    @Test
    public void testIsEqualCollection_differentSizes_returnsFalse() {
        List<String> a = Arrays.asList("A", "B");
        List<String> b = Arrays.asList("A", "B", "C");
        Assert.assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_sameSizeDifferentUniqueCount_returnsFalse() {
        List<String> a = Arrays.asList("A", "A");
        List<String> b = Arrays.asList("A", "B");
        Assert.assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_sameSizeDifferentFrequencies_returnsFalse() {
        List<String> a = Arrays.asList("A", "B", "B");
        List<String> b = Arrays.asList("A", "A", "B");
        Assert.assertFalse(CollectionUtils.isEqualCollection(a, b));
    }

    @Test
    public void testIsEqualCollection_identicalElementsAndFrequencies_returnsTrue() {
        List<String> a = Arrays.asList("A", "B", "A");
        List<String> b = Arrays.asList("A", "A", "B");
        Assert.assertTrue(CollectionUtils.isEqualCollection(a, b));
    }

    private static class DummyBag implements Bag {
        private final Map<Object, Integer> map = new HashMap<Object, Integer>();

        public void add(Object object, int count) {
            map.put(object, count);
        }

        public int getCount(Object object) {
            Integer count = map.get(object);
            return count != null ? count : 0;
        }

        public int size() { return map.size(); }
        public boolean isEmpty() { return map.isEmpty(); }
        public boolean contains(Object o) { return map.containsKey(o); }
        public Iterator iterator() { return map.keySet().iterator(); }
        public Object[] toArray() { return map.keySet().toArray(); }
        public Object[] toArray(Object[] a) { return map.keySet().toArray(a); }
        public boolean add(Object o) { return false; }
        public boolean remove(Object o) { return false; }
        public boolean remove(Object object, int nCopies) { return false; }
        public boolean containsAll(Collection c) { return false; }
        public boolean addAll(Collection c) { return false; }
        public boolean removeAll(Collection c) { return false; }
        public boolean retainAll(Collection c) { return false; }
        public void clear() { map.clear(); }
        public Set uniqueSet() { return map.keySet(); }
    }

    @Test
    public void testCardinality_setCollection_returnsZeroOrOne() {
        Set<String> set = new HashSet<String>(Arrays.asList("A", "B"));
        Assert.assertEquals(1, CollectionUtils.cardinality("A", set));
        Assert.assertEquals(0, CollectionUtils.cardinality("C", set));
    }

    @Test
    public void testCardinality_bagCollection_delegatesToBag() {
        DummyBag bag = new DummyBag();
        bag.add("A", 5);
        Assert.assertEquals(5, CollectionUtils.cardinality("A", bag));
        Assert.assertEquals(0, CollectionUtils.cardinality("B", bag));
    }

    @Test
    public void testCardinality_listWithNullAndNonNull_countsAccurately() {
        List<String> list = Arrays.asList("A", null, "A", null, "B");
        Assert.assertEquals(2, CollectionUtils.cardinality(null, list));
        Assert.assertEquals(2, CollectionUtils.cardinality("A", list));
        Assert.assertEquals(1, CollectionUtils.cardinality("B", list));
        Assert.assertEquals(0, CollectionUtils.cardinality("C", list));
    }

    @Test
    public void testFind_variousScenarios_returnsFirstMatchOrNull() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "findMe".equals(object);
            }
        };

        Assert.assertNull(CollectionUtils.find(null, predicate));
        Assert.assertNull(CollectionUtils.find(Arrays.asList("A", "B"), null));
        Assert.assertNull(CollectionUtils.find(Arrays.asList("A", "B"), predicate));
        Assert.assertEquals("findMe", CollectionUtils.find(Arrays.asList("A", "findMe", "B"), predicate));
    }

    @Test
    public void testForAllDo_validAndNullArguments_executesClosure() {
        final List<Object> executed = new ArrayList<Object>();
        Closure closure = new Closure() {
            public void execute(Object input) {
                executed.add(input);
            }
        };

        CollectionUtils.forAllDo(null, closure);
        CollectionUtils.forAllDo(Arrays.asList("A"), null);
        Assert.assertTrue(executed.isEmpty());

        CollectionUtils.forAllDo(Arrays.asList("A", "B"), closure);
        Assert.assertEquals(Arrays.asList("A", "B"), executed);
    }

    @Test
    public void testFilter_validAndNullArguments_removesUnmatchedElements() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return !"remove".equals(object);
            }
        };

        CollectionUtils.filter(null, predicate);
        List<String> list = new ArrayList<String>(Arrays.asList("keep", "remove", "keep"));
        CollectionUtils.filter(list, null);
        Assert.assertEquals(3, list.size());

        CollectionUtils.filter(list, predicate);
        Assert.assertEquals(Arrays.asList("keep", "keep"), list);
    }

    @Test
    public void testTransform_listAndSet_transformsInPlaceOrReplaces() {
        Transformer transformer = new Transformer() {
            public Object transform(Object input) {
                return input + "!";
            }
        };

        CollectionUtils.transform(null, transformer);
        List<String> list = new ArrayList<String>(Arrays.asList("A", "B"));
        CollectionUtils.transform(list, null);
        Assert.assertEquals(Arrays.asList("A", "B"), list);

        CollectionUtils.transform(list, transformer);
        Assert.assertEquals(Arrays.asList("A!", "B!"), list);

        Set<String> set = new HashSet<String>(Arrays.asList("X", "Y"));
        CollectionUtils.transform(set, transformer);
        Assert.assertTrue(set.contains("X!"));
        Assert.assertTrue(set.contains("Y!"));
    }

    @Test
    public void testCountMatches_variousInputs_returnsCount() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "match".equals(object);
            }
        };

        Assert.assertEquals(0, CollectionUtils.countMatches(null, predicate));
        Assert.assertEquals(0, CollectionUtils.countMatches(Arrays.asList("match"), null));
        Assert.assertEquals(2, CollectionUtils.countMatches(Arrays.asList("match", "no", "match"), predicate));
    }

    @Test
    public void testExists_variousInputs_returnsBoolean() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "exist".equals(object);
            }
        };

        Assert.assertFalse(CollectionUtils.exists(null, predicate));
        Assert.assertFalse(CollectionUtils.exists(Arrays.asList("exist"), null));
        Assert.assertFalse(CollectionUtils.exists(Arrays.asList("no", "other"), predicate));
        Assert.assertTrue(CollectionUtils.exists(Arrays.asList("no", "exist"), predicate));
    }

    @Test
    public void testSelect_twoArgsAndThreeArgs_collectsMatches() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "yes".equals(object);
            }
        };

        Collection result = CollectionUtils.select(Arrays.asList("yes", "no", "yes"), predicate);
        Assert.assertEquals(Arrays.asList("yes", "yes"), result);

        List<Object> output = new ArrayList<Object>();
        CollectionUtils.select(null, predicate, output);
        CollectionUtils.select(Arrays.asList("yes"), null, output);
        Assert.assertTrue(output.isEmpty());

        CollectionUtils.select(Arrays.asList("yes", "no"), predicate, output);
        Assert.assertEquals(Arrays.asList("yes"), output);
    }

    @Test(expected = NullPointerException.class)
    public void testSelect_nullInputCollection_throwsNPE() {
        CollectionUtils.select(null, new Predicate() {
            public boolean evaluate(Object object) { return true; }
        });
    }

    @Test
    public void testSelectRejected_twoArgsAndThreeArgs_collectsNonMatches() {
        Predicate predicate = new Predicate() {
            public boolean evaluate(Object object) {
                return "reject".equals(object);
            }
        };

        Collection result = CollectionUtils.selectRejected(Arrays.asList("reject", "keep1", "keep2"), predicate);
        Assert.assertEquals(Arrays.asList("keep1", "keep2"), result);

        Collection nullPredResult = CollectionUtils.selectRejected(Arrays.asList("A", "B"), null);
        Assert.assertTrue(nullPredResult.isEmpty());

        List<Object> output = new ArrayList<Object>();
        CollectionUtils.selectRejected(null, predicate, output);
        CollectionUtils.selectRejected(Arrays.asList("A"), null, output);
        Assert.assertTrue(output.isEmpty());

        CollectionUtils.selectRejected(Arrays.asList("reject", "keep"), predicate, output);
        Assert.assertEquals(Arrays.asList("keep"), output);
    }

    @Test(expected = NullPointerException.class)
    public void testSelectRejected_nullInputCollection_throwsNPE() {
        CollectionUtils.selectRejected(null, new Predicate() {
            public boolean evaluate(Object object) { return true; }
        });
    }

    @Test
    public void testCollect_allOverloads_transformsElements() {
        Transformer transformer = new Transformer() {
            public Object transform(Object input) {
                return input + "-t";
            }
        };

        Collection resColl = CollectionUtils.collect(Arrays.asList("1", "2"), transformer);
        Assert.assertEquals(Arrays.asList("1-t", "2-t"), resColl);

        Collection resCollNullTrans = CollectionUtils.collect(Arrays.asList("1", "2"), (Transformer) null);
        Assert.assertTrue(resCollNullTrans.isEmpty());

        Collection resIter = CollectionUtils.collect(Arrays.asList("A", "B").iterator(), transformer);
        Assert.assertEquals(Arrays.asList("A-t", "B-t"), resIter);

        Collection resIterNull = CollectionUtils.collect((Iterator) null, transformer);
        Assert.assertTrue(resIterNull.isEmpty());

        List<Object> outColl = new ArrayList<Object>();
        Collection nullInput = CollectionUtils.collect((Collection) null, transformer, outColl);
        Assert.assertSame(outColl, nullInput);

        CollectionUtils.collect(Arrays.asList("X"), transformer, outColl);
        Assert.assertEquals(Arrays.asList("X-t"), outColl);

        List<Object> outIter = new ArrayList<Object>();
        CollectionUtils.collect((Iterator) null, transformer, outIter);
        CollectionUtils.collect(Arrays.asList("Y").iterator(), null, outIter);
        Assert.assertTrue(outIter.isEmpty());
        CollectionUtils.collect(Arrays.asList("Y").iterator(), transformer, outIter);
        Assert.assertEquals(Arrays.asList("Y-t"), outIter);
    }

    @Test(expected = NullPointerException.class)
    public void testCollect_nullCollectionTwoArgs_throwsNPE() {
        CollectionUtils.collect((Collection) null, new Transformer() {
            public Object transform(Object input) { return input; }
        });
    }

    @Test
    public void testAddIgnoreNull_nullAndNonNull_returnsExpected() {
        List<String> list = new ArrayList<String>();
        Assert.assertFalse(CollectionUtils.addIgnoreNull(list, null));
        Assert.assertEquals(0, list.size());
        Assert.assertTrue(CollectionUtils.addIgnoreNull(list, "item"));
        Assert.assertEquals(1, list.size());
    }

    @Test(expected = NullPointerException.class)
    public void testAddIgnoreNull_nullCollection_throwsNPE() {
        CollectionUtils.addIgnoreNull(null, "item");
    }

    @Test
    public void testAddAll_iteratorEnumerationAndArray_addsAll() {
        List<String> list1 = new ArrayList<String>();
        CollectionUtils.addAll(list1, Arrays.asList("A", "B").iterator());
        Assert.assertEquals(Arrays.asList("A", "B"), list1);

        Vector<String> vec = new Vector<String>(Arrays.asList("C", "D"));
        List<String> list2 = new ArrayList<String>();
        CollectionUtils.addAll(list2, vec.elements());
        Assert.assertEquals(Arrays.asList("C", "D"), list2);

        List<String> list3 = new ArrayList<String>();
        CollectionUtils.addAll(list3, new String[]{"E", "F"});
        Assert.assertEquals(Arrays.asList("E", "F"), list3);
    }

    @Test(expected = NullPointerException.class)
    public void testAddAll_nullIterator_throwsNPE() {
        CollectionUtils.addAll(new ArrayList<String>(), (Iterator) null);
    }

    @Test(expected = NullPointerException.class)
    public void testAddAll_nullEnumeration_throwsNPE() {
        CollectionUtils.addAll(new ArrayList<String>(), (Enumeration) null);
    }

    @Test(expected = NullPointerException.class)
    public void testAddAll_nullArray_throwsNPE() {
        CollectionUtils.addAll(new ArrayList<String>(), (Object[]) null);
    }

    @Test
    public void testIndex_deprecatedMethods_variousTypes() {
        Assert.assertEquals("item", CollectionUtils.index(Arrays.asList("item"), 0));

        Map<Object, Object> map = new HashMap<Object, Object>();
        map.put("key1", "val1");
        map.put(1, "valInt");
        Assert.assertEquals("valInt", CollectionUtils.index(map, 1));
        Assert.assertEquals("val1", CollectionUtils.index(map, "key1"));
        Assert.assertSame(map, CollectionUtils.index(map, "nonExistingKey"));

        Assert.assertEquals("item", CollectionUtils.index(new Object[]{"item"}, 0));

        Vector<String> v = new Vector<String>(Arrays.asList("first", "second"));
        Assert.assertEquals("second", CollectionUtils.index(v.elements(), 1));
        Object emptyEnum = CollectionUtils.index(v.elements(), 5);
        Assert.assertNull(emptyEnum);

        Iterator it = Arrays.asList("X", "Y").iterator();
        Assert.assertEquals("Y", CollectionUtils.index(it, 1));
        Object exhaustedIt = CollectionUtils.index(Arrays.asList("X").iterator(), 5);
        Assert.assertTrue(exhaustedIt instanceof Iterator);

        Set<String> set = new HashSet<String>(Arrays.asList("A"));
        Assert.assertEquals("A", CollectionUtils.index(set, 0));

        String nonColl = "stringObj";
        Assert.assertSame(nonColl, CollectionUtils.index(nonColl, 0));
        Assert.assertSame(nonColl, CollectionUtils.index(nonColl, -1));
    }

    @Test
    public void testGet_variousValidTypes_returnsValue() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        Assert.assertTrue(CollectionUtils.get(map, 0) instanceof Map.Entry);

        List<String> list = Arrays.asList("A", "B");
        Assert.assertEquals("B", CollectionUtils.get(list, 1));

        Object[] array = new Object[]{"X", "Y"};
        Assert.assertEquals("X", CollectionUtils.get(array, 0));

        int[] primArray = new int[]{10, 20};
        Assert.assertEquals(20, CollectionUtils.get(primArray, 1));

        Iterator it = Arrays.asList("I1", "I2").iterator();
        Assert.assertEquals("I2", CollectionUtils.get(it, 1));

        Vector<String> vec = new Vector<String>(Arrays.asList("E1", "E2"));
        Assert.assertEquals("E1", CollectionUtils.get(vec.elements(), 0));

        Set<String> set = Collections.singleton("S1");
        Assert.assertEquals("S1", CollectionUtils.get(set, 0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_negativeIndex_throwsIOOBE() {
        CollectionUtils.get(Arrays.asList("A"), -1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_iteratorOutOfBounds_throwsIOOBE() {
        CollectionUtils.get(Arrays.asList("A").iterator(), 5);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_enumerationOutOfBounds_throwsIOOBE() {
        Vector<String> vec = new Vector<String>(Arrays.asList("A"));
        CollectionUtils.get(vec.elements(), 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_nullObject_throwsIAE() {
        CollectionUtils.get(null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGet_unsupportedObject_throwsIAE() {
        CollectionUtils.get(new Object(), 0);
    }

    @Test
    public void testSize_variousTypes_returnsSize() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        Assert.assertEquals(1, CollectionUtils.size(map));

        Assert.assertEquals(2, CollectionUtils.size(Arrays.asList("A", "B")));
        Assert.assertEquals(3, CollectionUtils.size(new Object[]{1, 2, 3}));
        Assert.assertEquals(2, CollectionUtils.size(new int[]{10, 20}));

        Iterator it = Arrays.asList("A", "B").iterator();
        Assert.assertEquals(2, CollectionUtils.size(it));

        Vector<String> vec = new Vector<String>(Arrays.asList("A", "B", "C"));
        Assert.assertEquals(3, CollectionUtils.size(vec.elements()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_nullObject_throwsIAE() {
        CollectionUtils.size(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSize_unsupportedObject_throwsIAE() {
        CollectionUtils.size(new Object());
    }

    @Test
    public void testSizeIsEmpty_variousTypes_returnsBoolean() {
        Assert.assertTrue(CollectionUtils.sizeIsEmpty(new ArrayList<String>()));
        Assert.assertFalse(CollectionUtils.sizeIsEmpty(Arrays.asList("A")));

        Assert.assertTrue(CollectionUtils.sizeIsEmpty(new HashMap<String, String>()));
        Map<String, String> map = new HashMap<String, String>();
        map.put("k", "v");
        Assert.assertFalse(CollectionUtils.sizeIsEmpty(map));

        Assert.assertTrue(CollectionUtils.sizeIsEmpty(new Object[0]));
        Assert.assertFalse(CollectionUtils.sizeIsEmpty(new Object[]{"A"}));

        Assert.assertTrue(CollectionUtils.sizeIsEmpty(new int[0]));
        Assert.assertFalse(CollectionUtils.sizeIsEmpty(new int[]{1}));

        Assert.assertTrue(CollectionUtils.sizeIsEmpty(Collections.emptyList().iterator()));
        Assert.assertFalse(CollectionUtils.sizeIsEmpty(Arrays.asList("A").iterator()));

        Assert.assertTrue(CollectionUtils.sizeIsEmpty(new Vector<String>().elements()));
        Vector<String> v = new Vector<String>(Arrays.asList("A"));
        Assert.assertFalse(CollectionUtils.sizeIsEmpty(v.elements()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_nullObject_throwsIAE() {
        CollectionUtils.sizeIsEmpty(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSizeIsEmpty_unsupportedObject_throwsIAE() {
        CollectionUtils.sizeIsEmpty(new Object());
    }

    @Test
    public void testIsEmptyAndIsNotEmpty_variousCollections_returnsExpected() {
        Assert.assertTrue(CollectionUtils.isEmpty(null));
        Assert.assertTrue(CollectionUtils.isEmpty(Collections.emptyList()));
        Assert.assertFalse(CollectionUtils.isEmpty(Arrays.asList("A")));

        Assert.assertFalse(CollectionUtils.isNotEmpty(null));
        Assert.assertFalse(CollectionUtils.isNotEmpty(Collections.emptyList()));
        Assert.assertTrue(CollectionUtils.isNotEmpty(Arrays.asList("A")));
    }

    @Test
    public void testReverseArray_variousLengths_reversesInPlace() {
        Object[] arrayOdd = new Object[]{"A", "B", "C"};
        CollectionUtils.reverseArray(arrayOdd);
        Assert.assertArrayEquals(new Object[]{"C", "B", "A"}, arrayOdd);

        Object[] arrayEven = new Object[]{"1", "2", "3", "4"};
        CollectionUtils.reverseArray(arrayEven);
        Assert.assertArrayEquals(new Object[]{"4", "3", "2", "1"}, arrayEven);

        Object[] arrayEmpty = new Object[0];
        CollectionUtils.reverseArray(arrayEmpty);
        Assert.assertEquals(0, arrayEmpty.length);
    }

    private static class DummyBoundedCollection extends ArrayList implements BoundedCollection {
        private final int max;

        DummyBoundedCollection(int max) {
            this.max = max;
        }

        public boolean isFull() {
            return size() >= max;
        }

        public int maxSize() {
            return max;
        }
    }

    @Test
    public void testIsFullAndMaxSize_variousCollections() {
        DummyBoundedCollection bounded = new DummyBoundedCollection(2);
        Assert.assertFalse(CollectionUtils.isFull(bounded));
        Assert.assertEquals(2, CollectionUtils.maxSize(bounded));

        bounded.add("A");
        bounded.add("B");
        Assert.assertTrue(CollectionUtils.isFull(bounded));

        List<String> normalList = new ArrayList<String>();
        Assert.assertFalse(CollectionUtils.isFull(normalList));
        Assert.assertEquals(-1, CollectionUtils.maxSize(normalList));
    }

    @Test(expected = NullPointerException.class)
    public void testIsFull_nullCollection_throwsNPE() {
        CollectionUtils.isFull(null);
    }

    @Test(expected = NullPointerException.class)
    public void testMaxSize_nullCollection_throwsNPE() {
        CollectionUtils.maxSize(null);
    }

    @Test
    public void testRetainAllAndRemoveAll_collections_returnsExpected() {
        List<String> collection = Arrays.asList("A", "B", "C", "A");
        List<String> retain = Arrays.asList("A", "C");
        Collection retained = CollectionUtils.retainAll(collection, retain);
        Assert.assertEquals(Arrays.asList("A", "C", "A"), retained);

        List<String> remove = Arrays.asList("A");
        Collection removed = CollectionUtils.removeAll(collection, remove);
        Assert.assertEquals(Arrays.asList("A", "A"), removed);
    }

    @Test
    public void testDecorators_validArguments_wrapsCollectionCorrectly() {
        List<Object> list = new ArrayList<Object>();

        Collection syncColl = CollectionUtils.synchronizedCollection(list);
        Assert.assertNotNull(syncColl);

        Collection unmodColl = CollectionUtils.unmodifiableCollection(list);
        Assert.assertNotNull(unmodColl);

        Predicate pred = new Predicate() {
            public boolean evaluate(Object object) {
                return object instanceof String;
            }
        };
        Collection predColl = CollectionUtils.predicatedCollection(list, pred);
        Assert.assertNotNull(predColl);

        Collection typedColl = CollectionUtils.typedCollection(list, String.class);
        Assert.assertNotNull(typedColl);

        Transformer trans = new Transformer() {
            public Object transform(Object input) {
                return input;
            }
        };
        Collection transColl = CollectionUtils.transformedCollection(list, trans);
        Assert.assertNotNull(transColl);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSynchronizedCollection_nullCollection_throwsIAE() {
        CollectionUtils.synchronizedCollection(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnmodifiableCollection_nullCollection_throwsIAE() {
        CollectionUtils.unmodifiableCollection(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPredicatedCollection_nullCollection_throwsIAE() {
        CollectionUtils.predicatedCollection(null, new Predicate() {
            public boolean evaluate(Object object) { return true; }
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTransformedCollection_nullCollection_throwsIAE() {
        CollectionUtils.transformedCollection(null, new Transformer() {
            public Object transform(Object input) { return input; }
        });
    }
}
