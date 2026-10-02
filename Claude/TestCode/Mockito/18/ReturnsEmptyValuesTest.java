import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues;
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

public class ReturnsEmptyValuesTest {

    private ReturnsEmptyValues returnsEmptyValues;

    @Before
    public void setUp() {
        returnsEmptyValues = new ReturnsEmptyValues();
    }

    // ---------- Helper fake InvocationOnMock implementation ----------
    private static class FakeInvocation implements InvocationOnMock {
        private final Method method;
        private final Object mock;
        private final Object[] arguments;

        FakeInvocation(Method method, Object mock, Object[] arguments) {
            this.method = method;
            this.mock = mock;
            this.arguments = arguments == null ? new Object[0] : arguments;
        }

        @Override
        public Method getMethod() {
            return method;
        }

        @Override
        public Object[] getArguments() {
            return arguments;
        }

        @SuppressWarnings("unchecked")
        @Override
        public <T> T getArgument(int index) {
            return (T) arguments[index];
        }

        @SuppressWarnings("unchecked")
        @Override
        public <T> T getArgument(int index, Class<T> clazz) {
            return (T) arguments[index];
        }

        @Override
        public Object getMock() {
            return mock;
        }

        @Override
        public Object callRealMethod() throws Throwable {
            return null;
        }
    }

    // Helper sample class with various return types for reflection
    static class SampleClass {
        public int getInt() { return 0; }
        public Integer getInteger() { return null; }
        public boolean getBoolean() { return false; }
        public List<String> getList() { return null; }
        public Set<String> getSet() { return null; }
        public Map<String, String> getMap() { return null; }
        public String getString() { return null; }
        public Object getObject() { return null; }
    }

    // Helper comparable class to test compareTo branch
    static class ComparableThing implements Comparable<ComparableThing> {
        @Override
        public int compareTo(ComparableThing o) {
            return 0;
        }
    }

    // ---------------------- answer() tests ----------------------

    @Test
    public void testAnswer_toStringMethod_nonMockObject_throwsException() throws Exception {
        Method toStringMethod = Object.class.getMethod("toString");
        Object plainObject = new Object();
        InvocationOnMock invocation = new FakeInvocation(toStringMethod, plainObject, new Object[0]);

        try {
            returnsEmptyValues.answer(invocation);
            fail("Expected an exception since the object passed is not an actual Mockito mock");
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testAnswer_compareToMethod_sameReference_returnsZero() throws Exception {
        Method compareToMethod = ComparableThing.class.getMethod("compareTo", ComparableThing.class);
        ComparableThing thing = new ComparableThing();
        InvocationOnMock invocation = new FakeInvocation(compareToMethod, thing, new Object[]{thing});

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_compareToMethod_differentReference_returnsOne() throws Exception {
        Method compareToMethod = ComparableThing.class.getMethod("compareTo", ComparableThing.class);
        ComparableThing thing1 = new ComparableThing();
        ComparableThing thing2 = new ComparableThing();
        InvocationOnMock invocation = new FakeInvocation(compareToMethod, thing1, new Object[]{thing2});

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(1, result);
    }

    @Test
    public void testAnswer_normalIntMethod_returnsZero() throws Exception {
        Method intMethod = SampleClass.class.getMethod("getInt");
        InvocationOnMock invocation = new FakeInvocation(intMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(0, result);
    }

    @Test
    public void testAnswer_normalBooleanMethod_returnsFalse() throws Exception {
        Method booleanMethod = SampleClass.class.getMethod("getBoolean");
        InvocationOnMock invocation = new FakeInvocation(booleanMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertEquals(false, result);
    }

    @Test
    public void testAnswer_normalListMethod_returnsEmptyList() throws Exception {
        Method listMethod = SampleClass.class.getMethod("getList");
        InvocationOnMock invocation = new FakeInvocation(listMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof List);
        assertTrue(((List<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_normalSetMethod_returnsEmptySet() throws Exception {
        Method setMethod = SampleClass.class.getMethod("getSet");
        InvocationOnMock invocation = new FakeInvocation(setMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof Set);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void testAnswer_normalMapMethod_returnsEmptyMap() throws Exception {
        Method mapMethod = SampleClass.class.getMethod("getMap");
        InvocationOnMock invocation = new FakeInvocation(mapMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertNotNull(result);
        assertTrue(result instanceof Map);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testAnswer_normalStringMethod_returnsNull() throws Exception {
        Method stringMethod = SampleClass.class.getMethod("getString");
        InvocationOnMock invocation = new FakeInvocation(stringMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertNull(result);
    }

    @Test
    public void testAnswer_normalObjectMethod_returnsNull() throws Exception {
        Method objectMethod = SampleClass.class.getMethod("getObject");
        InvocationOnMock invocation = new FakeInvocation(objectMethod, new Object(), new Object[0]);

        Object result = returnsEmptyValues.answer(invocation);

        assertNull(result);
    }

    // ---------------------- returnValueFor() tests ----------------------

    @Test
    public void testReturnValueFor_intPrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(int.class);
        assertEquals(0, result);
    }

    @Test
    public void testReturnValueFor_IntegerWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Integer.class);
        assertEquals(0, result);
    }

    @Test
    public void testReturnValueFor_booleanPrimitive_returnsFalse() {
        Object result = returnsEmptyValues.returnValueFor(boolean.class);
        assertEquals(false, result);
    }

    @Test
    public void testReturnValueFor_BooleanWrapper_returnsFalse() {
        Object result = returnsEmptyValues.returnValueFor(Boolean.class);
        assertEquals(false, result);
    }

    @Test
    public void testReturnValueFor_bytePrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(byte.class);
        assertEquals((byte) 0, result);
    }

    @Test
    public void testReturnValueFor_ByteWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Byte.class);
        assertEquals((byte) 0, result);
    }

    @Test
    public void testReturnValueFor_shortPrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(short.class);
        assertEquals((short) 0, result);
    }

    @Test
    public void testReturnValueFor_ShortWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Short.class);
        assertEquals((short) 0, result);
    }

    @Test
    public void testReturnValueFor_longPrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(long.class);
        assertEquals(0L, result);
    }

    @Test
    public void testReturnValueFor_LongWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Long.class);
        assertEquals(0L, result);
    }

    @Test
    public void testReturnValueFor_floatPrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(float.class);
        assertEquals(0f, result);
    }

    @Test
    public void testReturnValueFor_FloatWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Float.class);
        assertEquals(0f, result);
    }

    @Test
    public void testReturnValueFor_doublePrimitive_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(double.class);
        assertEquals(0d, result);
    }

    @Test
    public void testReturnValueFor_DoubleWrapper_returnsZero() {
        Object result = returnsEmptyValues.returnValueFor(Double.class);
        assertEquals(0d, result);
    }

    @Test
    public void testReturnValueFor_charPrimitive_returnsDefaultChar() {
        Object result = returnsEmptyValues.returnValueFor(char.class);
        assertNotNull(result);
        assertTrue(result instanceof Character);
    }

    @Test
    public void testReturnValueFor_CharacterWrapper_returnsDefaultChar() {
        Object result = returnsEmptyValues.returnValueFor(Character.class);
        assertNotNull(result);
        assertTrue(result instanceof Character);
    }

    @Test
    public void testReturnValueFor_CollectionClass_returnsLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(Collection.class);
        assertTrue(result instanceof LinkedList);
        assertTrue(((Collection<?>) result).isEmpty());
    }

    @Test
    public void testReturnValueFor_SetClass_returnsHashSet() {
        Object result = returnsEmptyValues.returnValueFor(Set.class);
        assertTrue(result instanceof HashSet);
        assertTrue(((Set<?>) result).isEmpty());
    }

    @Test
    public void testReturnValueFor_HashSetClass_returnsHashSet() {
        Object result = returnsEmptyValues.returnValueFor(HashSet.class);
        assertTrue(result instanceof HashSet);
    }

    @Test
    public void testReturnValueFor_SortedSetClass_returnsTreeSet() {
        Object result = returnsEmptyValues.returnValueFor(SortedSet.class);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testReturnValueFor_TreeSetClass_returnsTreeSet() {
        Object result = returnsEmptyValues.returnValueFor(TreeSet.class);
        assertTrue(result instanceof TreeSet);
    }

    @Test
    public void testReturnValueFor_LinkedHashSetClass_returnsLinkedHashSet() {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashSet.class);
        assertTrue(result instanceof LinkedHashSet);
    }

    @Test
    public void testReturnValueFor_ListClass_returnsLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(List.class);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testReturnValueFor_LinkedListClass_returnsLinkedList() {
        Object result = returnsEmptyValues.returnValueFor(LinkedList.class);
        assertTrue(result instanceof LinkedList);
    }

    @Test
    public void testReturnValueFor_ArrayListClass_returnsArrayList() {
        Object result = returnsEmptyValues.returnValueFor(ArrayList.class);
        assertTrue(result instanceof ArrayList);
    }

    @Test
    public void testReturnValueFor_MapClass_returnsHashMap() {
        Object result = returnsEmptyValues.returnValueFor(Map.class);
        assertTrue(result instanceof HashMap);
        assertTrue(((Map<?, ?>) result).isEmpty());
    }

    @Test
    public void testReturnValueFor_HashMapClass_returnsHashMap() {
        Object result = returnsEmptyValues.returnValueFor(HashMap.class);
        assertTrue(result instanceof HashMap);
    }

    @Test
    public void testReturnValueFor_SortedMapClass_returnsTreeMap() {
        Object result = returnsEmptyValues.returnValueFor(SortedMap.class);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testReturnValueFor_TreeMapClass_returnsTreeMap() {
        Object result = returnsEmptyValues.returnValueFor(TreeMap.class);
        assertTrue(result instanceof TreeMap);
    }

    @Test
    public void testReturnValueFor_LinkedHashMapClass_returnsLinkedHashMap() {
        Object result = returnsEmptyValues.returnValueFor(LinkedHashMap.class);
        assertTrue(result instanceof LinkedHashMap);
    }

    @Test
    public void testReturnValueFor_UnknownType_returnsNull() {
        Object result = returnsEmptyValues.returnValueFor(String.class);
        assertNull(result);
    }

    @Test
    public void testReturnValueFor_CustomUnknownClass_returnsNull() {
        Object result = returnsEmptyValues.returnValueFor(SampleClass.class);
        assertNull(result);
    }

    @Test(expected = NullPointerException.class)
    public void testReturnValueFor_nullType_throwsNullPointerException() {
        returnsEmptyValues.returnValueFor(null);
    }
}
