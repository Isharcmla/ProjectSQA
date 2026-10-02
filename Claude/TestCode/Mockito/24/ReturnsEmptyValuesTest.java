package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;

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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    // Sample interface used to obtain Method objects with various return types
    private interface SampleMethods {
        int primitiveIntMethod();
        long primitiveLongMethod();
        boolean primitiveBooleanMethod();
        double primitiveDoubleMethod();
        void voidMethod();
        List<String> listMethod();
        Set<String> setMethod();
        Map<String, String> mapMethod();
        String stringMethod();
    }

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    private InvocationOnMock invocationFor(final Object mock, final Method method) {
        return new InvocationOnMock() {
            public Method getMethod() {
                return method;
            }

            public Object[] getArguments() {
                return new Object[0];
            }

            public <T> T getArgument(int index) {
                throw new UnsupportedOperationException("not used in these tests");
            }

            public Object getMock() {
                return mock;
            }

            public Object callRealMethod() throws Throwable {
                throw new UnsupportedOperationException("not used in these tests");
            }
        };
    }

    // ---------------------- answer() tests ----------------------

    @Test
    public void testAnswer_toStringMethodDefaultMockName_returnsMockDescription() throws Exception {
        List<String> mock = Mockito.mock(List.class);
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = invocationFor(mock, toStringMethod);

        Object result = returnsEmptyValues.answer(invocation);

        assertTrue(result instanceof String);
        assertTrue(((String) result).startsWith("Mock for"));
    }

    @Test
    public void testAnswer_toStringMethodCustomMockName_returnsCustomName() throws Exception {
        List<String> mock = Mockito.mock(List.class, "myListMock");
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = invocationFor(mock, toStringMethod);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals("myListMock", result);
    }

    @Test
    public void testAnswer_compareToMethod_returnsOne() throws Exception {
        Method compareToMethod = Comparable.class.getMethod("compareTo", Object.class);
        InvocationOnMock invocation = invocationFor(null, compareToMethod);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(1, result);
    }

    @Test
    public void testAnswer_primitiveIntReturnType_returnsZero() throws Exception {
        Method m = SampleMethods.class.getMethod("primitiveIntMethod");
        InvocationOnMock invocation = invocationFor(null, m);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_primitiveBooleanReturnType_returnsFalse() throws Exception {
        Method m = SampleMethods.class.getMethod("primitiveBooleanMethod");
        InvocationOnMock invocation = invocationFor(null, m);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(false, result);
    }

    @Test
    public void testAnswer_listReturnType_returnsEmptyList() throws Exception {
        Method m = SampleMethods.class.getMethod("listMethod");
        InvocationOnMock invocation = invocationFor(null, m);

        Object result = returnsEmptyValues.answer(invocation);

        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_unknownReturnType_returnsNull() throws Exception {
        Method m = SampleMethods.class.getMethod("stringMethod");
        InvocationOnMock invocation = invocationFor(null, m);

        Object result = returnsEmptyValues.answer(invocation);

        assertNull(result);
    }

    @Test(expected = RuntimeException.class)
    public void testAnswer_toStringMethodOnNonMockObject_throwsException() throws Exception {
        Object notAMock = new Object();
        Method toStringMethod = Object.class.getMethod("toString");
        InvocationOnMock invocation = invocationFor(notAMock, toStringMethod);

        returnsEmptyValues.answer(invocation);
    }

    // ---------------------- returnValueFor() tests ----------------------

    @Test
    public void testReturnValueFor_intPrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(int.class);
        assertEquals(0, result);
    }

    @Test
    public void testReturnValueFor_booleanPrimitive_returnsFalse() {
        Object result = returnsEmptyValues.returnValueFor(boolean.class);
        assertEquals(false, result);
    }

    @Test
    public void testReturnValueFor_longPrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(long.class);
        assertEquals(0L, result);
    }

    @Test
    public void testReturnValueFor_doublePrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(double.class);
        assertEquals(0.0d, result);
    }

    @Test
    public void testReturnValueFor_IntegerWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Integer.class);
        assertEquals(0, result);
    }

    @Test
    public void testReturnValueFor_voidType_returnsNull() {
        Object result = returnsEmptyValues.returnValueFor(void.class);
        assertNull(result);
    }

    @Test
    public void testReturnValueFor_Collection_returnsEmptyLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void testReturnValueFor_Set_returnsEmptyHashSet() {
        Object result = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void testReturnValueFor_HashSet_returnsEmptyHashSet() {
        Object result = returnsEmptyValues.returnValueFor(HashSet.class);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testReturnValueFor_SortedSet_returnsEmptyTreeSet() {
        Object result = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testReturnValueFor_TreeSet_returnsEmptyTreeSet() {
        Object result = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testReturnValueFor_LinkedHashSet_returnsEmptyLinkedHashSet() {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertTrue(result instanceof LinkedHashSet);
    }

    @Test
    public void testReturnValueFor_List_returnsEmptyLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(List.class);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testReturnValueFor_LinkedList_returnsEmptyLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testReturnValueFor_ArrayList_returnsEmptyArrayList() {
        Object result = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertTrue(result instanceof ArrayList);
    }

    @Test
    public void testReturnValueFor_Map_returnsEmptyHashMap() {
        Object result = returnsEmptyValues.returnValueFor(Map.class);
        assertTrue(result instanceof HashMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testReturnValueFor_HashMap_returnsEmptyHashMap() {
        Object result = returnsEmptyValues.returnValueFor(HashMap.class);
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void testReturnValueFor_SortedMap_returnsEmptyTreeMap() {
        Object result = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testReturnValueFor_TreeMap_returnsEmptyTreeMap() {
        Object result = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testReturnValueFor_LinkedHashMap_returnsEmptyLinkedHashMap() {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testReturnValueFor_UnknownType_returnsNull() {
        Object result = returnsEmptyValues.returnValueFor(String.class);
        assertNull(result);
    }

    @Test
    public void testReturnValueFor_CustomClassType_returnsNull() {
        Object result = returnsEmptyValues.returnValueFor(ReturnsEmptyValuesTest.class);
        assertNull(result);
    }

    @Test
    public void testReturnValueFor_FloatWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Float.class);
        assertEquals(0f, result);
    }

    @Test
    public void testReturnValueFor_ByteWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Byte.class);
        assertFalse(result == null);
    }
}
