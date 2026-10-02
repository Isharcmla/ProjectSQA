package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.MockUtil;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockCreationSettings;
import org.mockito.mock.MockName;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    interface SampleInterface extends Comparable<SampleInterface> {
        String toString();
        int compareTo(SampleInterface other);
        List<String> listMethod();
        int intMethod();
        String stringMethod();
    }

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    private InvocationOnMock createInvocation(final Object mock, final Method method, final Object[] args) {
        return new InvocationOnMock() {
            public Object getMock() {
                return mock;
            }

            public Method getMethod() {
                return method;
            }

            public Object[] getArguments() {
                return args == null ? new Object[0] : args;
            }

            public Object callRealMethod() throws Throwable {
                return null;
            }

            public <T> T getArgument(int index) {
                return (T) getArguments()[index];
            }
        };
    }

    @Test
    public void testReturnValueFor_primitivesAndWrappers_returnsDefaultValues() {
        assertEquals(false, returnsEmptyValues.returnValueFor(boolean.class));
        assertEquals(false, returnsEmptyValues.returnValueFor(Boolean.class));
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(byte.class));
        assertEquals((byte) 0, returnsEmptyValues.returnValueFor(Byte.class));
        assertEquals((char) 0, returnsEmptyValues.returnValueFor(char.class));
        assertEquals((char) 0, returnsEmptyValues.returnValueFor(Character.class));
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(short.class));
        assertEquals((short) 0, returnsEmptyValues.returnValueFor(Short.class));
        assertEquals(0, returnsEmptyValues.returnValueFor(int.class));
        assertEquals(0, returnsEmptyValues.returnValueFor(Integer.class));
        assertEquals(0L, returnsEmptyValues.returnValueFor(long.class));
        assertEquals(0L, returnsEmptyValues.returnValueFor(Long.class));
        assertEquals(0.0f, returnsEmptyValues.returnValueFor(float.class));
        assertEquals(0.0f, returnsEmptyValues.returnValueFor(Float.class));
        assertEquals(0.0d, returnsEmptyValues.returnValueFor(double.class));
        assertEquals(0.0d, returnsEmptyValues.returnValueFor(Double.class));
    }

    @Test
    public void testReturnValueFor_collections_returnsEmptyInstances() {
        Object col = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue(col instanceof LinkedList);
        assertTrue(((Collection<?>) col).isEmpty());

        Object set = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue(set instanceof HashSet);
        assertTrue(((Set<?>) set).isEmpty());

        Object hashSet = returnsEmptyValues.returnValueFor(HashSet.class);
        assertTrue(hashSet instanceof HashSet);
        assertTrue(((HashSet<?>) hashSet).isEmpty());

        Object sortedSet = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertTrue(sortedSet instanceof TreeSet);
        assertTrue(((SortedSet<?>) sortedSet).isEmpty());

        Object treeSet = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertTrue(treeSet instanceof TreeSet);
        assertTrue(((TreeSet<?>) treeSet).isEmpty());

        Object linkedHashSet = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertTrue(linkedHashSet instanceof LinkedHashSet);
        assertTrue(((LinkedHashSet<?>) linkedHashSet).isEmpty());

        Object list = returnsEmptyValues.returnValueFor(List.class);
        assertTrue(list instanceof LinkedList);
        assertTrue(((List<?>) list).isEmpty());

        Object linkedList = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertTrue(linkedList instanceof LinkedList);
        assertTrue(((LinkedList<?>) linkedList).isEmpty());

        Object arrayList = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertTrue(arrayList instanceof ArrayList);
        assertTrue(((ArrayList<?>) arrayList).isEmpty());
    }

    @Test
    public void testReturnValueFor_maps_returnsEmptyInstances() {
        Object map = returnsEmptyValues.returnValueFor(Map.class);
        assertTrue(map instanceof HashMap);
        assertTrue(((Map<?, ?>) map).isEmpty());

        Object hashMap = returnsEmptyValues.returnValueFor(HashMap.class);
        assertTrue(hashMap instanceof HashMap);
        assertTrue(((HashMap<?, ?>) hashMap).isEmpty());

        Object sortedMap = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertTrue(sortedMap instanceof TreeMap);
        assertTrue(((SortedMap<?, ?>) sortedMap).isEmpty());

        Object treeMap = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertTrue(treeMap instanceof TreeMap);
        assertTrue(((TreeMap<?, ?>) treeMap).isEmpty());

        Object linkedHashMap = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertTrue(linkedHashMap instanceof LinkedHashMap);
        assertTrue(((LinkedHashMap<?, ?>) linkedHashMap).isEmpty());
    }

    @Test
    public void testReturnValueFor_unsupportedTypesAndNull_returnsNull() {
        assertNull(returnsEmptyValues.returnValueFor(String.class));
        assertNull(returnsEmptyValues.returnValueFor(Object.class));
        assertNull(returnsEmptyValues.returnValueFor(SampleInterface.class));
        assertNull(returnsEmptyValues.returnValueFor(null));
    }

    @Test
    public void testAnswer_toStringWithDefaultMockName_returnsDefaultDescription() throws NoSuchMethodException {
        final Object dummyMock = new Object();
        Method toStringMethod = SampleInterface.class.getMethod("toString");

        returnsEmptyValues.mockUtil = new MockUtil() {
            @Override
            public MockName getMockName(Object mock) {
                return new MockName() {
                    @Override
                    public String toString() {
                        return "mockName";
                    }

                    @Override
                    public boolean isDefault() {
                        return true;
                    }
                };
            }

            @Override
            public MockCreationSettings getMockSettings(Object mock) {
                return (MockCreationSettings<?>) Proxy.newProxyInstance(
                        MockCreationSettings.class.getClassLoader(),
                        new Class<?>[]{MockCreationSettings.class},
                        new InvocationHandler() {
                            @Override
                            public Object invoke(Object proxy, Method method, Object[] args) {
                                if ("getTypeToMock".equals(method.getName())) {
                                    return SampleInterface.class;
                                }
                                return null;
                            }
                        }
                );
            }
        };

        InvocationOnMock invocation = createInvocation(dummyMock, toStringMethod, new Object[0]);
        Object result = returnsEmptyValues.answer(invocation);

        String expected = "Mock for " + SampleInterface.class.getSimpleName() + ", hashCode: " + dummyMock.hashCode();
        assertEquals(expected, result);
    }

    @Test
    public void testAnswer_toStringWithCustomMockName_returnsCustomName() throws NoSuchMethodException {
        final Object dummyMock = new Object();
        Method toStringMethod = SampleInterface.class.getMethod("toString");

        returnsEmptyValues.mockUtil = new MockUtil() {
            @Override
            public MockName getMockName(Object mock) {
                return new MockName() {
                    @Override
                    public String toString() {
                        return "customMockName";
                    }

                    @Override
                    public boolean isDefault() {
                        return false;
                    }
                };
            }
        };

        InvocationOnMock invocation = createInvocation(dummyMock, toStringMethod, new Object[0]);
        Object result = returnsEmptyValues.answer(invocation);

        assertEquals("customMockName", result);
    }

    @Test
    public void testAnswer_compareToSameMockInstance_returnsZero() throws NoSuchMethodException {
        Object dummyMock = new Object();
        Method compareToMethod = SampleInterface.class.getMethod("compareTo", SampleInterface.class);

        InvocationOnMock invocation = createInvocation(dummyMock, compareToMethod, new Object[]{dummyMock});
        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_compareToDifferentMockInstance_returnsOne() throws NoSuchMethodException {
        Object dummyMock = new Object();
        Object otherMock = new Object();
        Method compareToMethod = SampleInterface.class.getMethod("compareTo", SampleInterface.class);

        InvocationOnMock invocation = createInvocation(dummyMock, compareToMethod, new Object[]{otherMock});
        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(1, result);
    }

    @Test
    public void testAnswer_regularCollectionMethod_returnsEmptyCollection() throws NoSuchMethodException {
        Object dummyMock = new Object();
        Method listMethod = SampleInterface.class.getMethod("listMethod");

        InvocationOnMock invocation = createInvocation(dummyMock, listMethod, new Object[0]);
        Object result = returnsEmptyValues.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof LinkedList);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_regularPrimitiveMethod_returnsDefaultValue() throws NoSuchMethodException {
        Object dummyMock = new Object();
        Method intMethod = SampleInterface.class.getMethod("intMethod");

        InvocationOnMock invocation = createInvocation(dummyMock, intMethod, new Object[0]);
        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_regularReferenceTypeMethod_returnsNull() throws NoSuchMethodException {
        Object dummyMock = new Object();
        Method stringMethod = SampleInterface.class.getMethod("stringMethod");

        InvocationOnMock invocation = createInvocation(dummyMock, stringMethod, new Object[0]);
        Object result = returnsEmptyValues.answer(invocation);

        assertNull(result);
    }
}
