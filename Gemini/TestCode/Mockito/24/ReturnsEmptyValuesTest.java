package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    private interface DummyComparable extends Comparable<DummyComparable> {
        int samplePrimitiveInt();
        Integer sampleWrapperInteger();
        List<String> sampleList();
        String sampleString();
        @Override
        int compareTo(DummyComparable other);
    }

    private static class DummyInvocation implements InvocationOnMock {
        private final Object mock;
        private final Method method;
        private final Object[] arguments;

        public DummyInvocation(Object mock, Method method, Object[] arguments) {
            this.mock = mock;
            this.method = method;
            this.arguments = arguments != null ? arguments : new Object[0];
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @Override
        public <T> T getArgumentAt(int index, Class<T> clazz) {
            return clazz.cast(arguments[index]);
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    @Test
    public void testReturnValueFor_primitives_returnsDefaultValues() {
        assertEquals(false, returnsEmptyValues.returnValueFor(boolean.class));
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(byte.class));
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(short.class));
        assertEquals('\u0000', returnsEmptyValues.returnValueFor(char.class));
        assertEquals(0, returnsEmptyValues.returnValueFor(int.class));
        assertEquals(0L, returnsEmptyValues.returnValueFor(long.class));
        assertEquals(0.0f, returnsEmptyValues.returnValueFor(float.class));
        assertEquals(0.0d, returnsEmptyValues.returnValueFor(double.class));
        assertNull(returnsEmptyValues.returnValueFor(void.class));
    }

    @Test
    public void testReturnValueFor_primitiveWrappers_returnsDefaultValues() {
        assertEquals(false, returnsEmptyValues.returnValueFor(Boolean.class));
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(Byte.class));
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(Short.class));
        assertEquals('\u0000', returnsEmptyValues.returnValueFor(Character.class));
        assertEquals(0, returnsEmptyValues.returnValueFor(Integer.class));
        assertEquals(0L, returnsEmptyValues.returnValueFor(Long.class));
        assertEquals(0.0f, returnsEmptyValues.returnValueFor(Float.class));
        assertEquals(0.0d, returnsEmptyValues.returnValueFor(Double.class));
        assertNull(returnsEmptyValues.returnValueFor(Void.class));
    }

    @Test
    public void testReturnValueFor_collectionInterfaces_returnsEmptyCollections() {
        Object collectionResult = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue(collectionResult instanceof LinkedList);
        assertTrue(((Collection<?>) collectionResult).isEmpty());

        Object listResult = returnsEmptyValues.returnValueFor(List.class);
        assertTrue(listResult instanceof LinkedList);
        assertTrue(((List<?>) listResult).isEmpty());

        Object setResult = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue(setResult instanceof HashSet);
        assertTrue(((Set<?>) setResult).isEmpty());

        Object sortedSetResult = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertTrue(sortedSetResult instanceof TreeSet);
        assertTrue(((SortedSet<?>) sortedSetResult).isEmpty());

        Object mapResult = returnsEmptyValues.returnValueFor(Map.class);
        assertTrue(mapResult instanceof HashMap);
        assertTrue(((Map<?, ?>) mapResult).isEmpty());

        Object sortedMapResult = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertTrue(sortedMapResult instanceof TreeMap);
        assertTrue(((SortedMap<?, ?>) sortedMapResult).isEmpty());
    }

    @Test
    public void testReturnValueFor_concreteCollectionTypes_returnsEmptyInstances() {
        Object hashSetResult = returnsEmptyValues.returnValueFor(HashSet.class);
        assertTrue(hashSetResult instanceof HashSet);
        assertTrue(((HashSet<?>) hashSetResult).isEmpty());

        Object treeSetResult = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertTrue(treeSetResult instanceof TreeSet);
        assertTrue(((TreeSet<?>) treeSetResult).isEmpty());

        Object linkedHashSetResult = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertTrue(linkedHashSetResult instanceof LinkedHashSet);
        assertTrue(((LinkedHashSet<?>) linkedHashSetResult).isEmpty());

        Object linkedListResult = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertTrue(linkedListResult instanceof LinkedList);
        assertTrue(((LinkedList<?>) linkedListResult).isEmpty());

        Object arrayListResult = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertTrue(arrayListResult instanceof ArrayList);
        assertTrue(((ArrayList<?>) arrayListResult).isEmpty());

        Object hashMapResult = returnsEmptyValues.returnValueFor(HashMap.class);
        assertTrue(hashMapResult instanceof HashMap);
        assertTrue(((HashMap<?, ?>) hashMapResult).isEmpty());

        Object treeMapResult = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertTrue(treeMapResult instanceof TreeMap);
        assertTrue(((TreeMap<?, ?>) treeMapResult).isEmpty());

        Object linkedHashMapResult = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertTrue(linkedHashMapResult instanceof LinkedHashMap);
        assertTrue(((LinkedHashMap<?, ?>) linkedHashMapResult).isEmpty());
    }

    @Test
    public void testReturnValueFor_nonMatchingTypes_returnsNull() {
        assertNull(returnsEmptyValues.returnValueFor(String.class));
        assertNull(returnsEmptyValues.returnValueFor(Object.class));
        assertNull(returnsEmptyValues.returnValueFor(DummyComparable.class));
        assertNull(returnsEmptyValues.returnValueFor(null));
    }

    @Test
    public void testAnswer_compareToMethod_returnsOne() throws NoSuchMethodException {
        Method compareToMethod = DummyComparable.class.getMethod("compareTo", DummyComparable.class);
        DummyInvocation invocation = new DummyInvocation(new Object(), compareToMethod, new Object[]{null});

        Object result = returnsEmptyValues.answer(invocation);
        assertEquals(1, result);
    }

    @Test
    public void testAnswer_primitiveReturningMethod_returnsZero() throws NoSuchMethodException {
        Method method = DummyComparable.class.getMethod("samplePrimitiveInt");
        DummyInvocation invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_wrapperReturningMethod_returnsZero() throws NoSuchMethodException {
        Method method = DummyComparable.class.getMethod("sampleWrapperInteger");
        DummyInvocation invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);
        assertEquals(0, result);
    }

    @Test
    public void testAnswer_collectionReturningMethod_returnsEmptyList() throws NoSuchMethodException {
        Method method = DummyComparable.class.getMethod("sampleList");
        DummyInvocation invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);
        assertNotNull(result);
        assertTrue(result instanceof LinkedList);
        assertTrue(((LinkedList<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_objectReturningMethod_returnsNull() throws NoSuchMethodException {
        Method method = DummyComparable.class.getMethod("sampleString");
        DummyInvocation invocation = new DummyInvocation(new Object(), method, new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);
        assertNull(result);
    }

    @Test(expected = NotAMockException.class)
    public void testAnswer_toStringOnNonMock_throwsNotAMockException() throws NoSuchMethodException {
        Method toStringMethod = Object.class.getMethod("toString");
        DummyInvocation invocation = new DummyInvocation(new Object(), toStringMethod, new Object[0]);

        returnsEmptyValues.answer(invocation);
    }

    @Test
    public void testSerialization_roundTrip_instanceMaintained() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(returnsEmptyValues);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object deserialized = ois.readObject();
        ois.close();

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsEmptyValues);
        assertEquals(0, ((ReturnsEmptyValues) deserialized).returnValueFor(int.class));
    }
}
