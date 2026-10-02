package com.fasterxml.jackson.databind.type;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class TypeBindingsTest {

    private final TypeFactory _typeFactory = TypeFactory.defaultInstance();
    private final JavaType _stringType = _typeFactory.constructType(String.class);
    private final JavaType _integerType = _typeFactory.constructType(Integer.class);
    private final JavaType _longType = _typeFactory.constructType(Long.class);

    static class SingleGeneric<T> {}
    static class PairGeneric<K, V> {}
    static class TripleGeneric<A, B, C> {}
    static class NonGeneric {}

    @Test
    public void testEmptyBindings_returnsEmptyInstance() {
        TypeBindings empty = TypeBindings.emptyBindings();
        assertNotNull(empty);
        assertTrue(empty.isEmpty());
        assertEquals(0, empty.size());
        assertEquals("<>", empty.toString());
        assertEquals(Collections.emptyList(), empty.getTypeParameters());
        assertNull(empty.getBoundName(0));
        assertNull(empty.getBoundName(-1));
        assertNull(empty.getBoundType(0));
        assertNull(empty.getBoundType(-1));
        assertNull(empty.findBoundType("T"));
        assertFalse(empty.hasUnbound("T"));
        assertEquals(0, empty.typeParameterArray().length);
    }

    @Test
    public void testCreateWithList_emptyOrNullList() {
        TypeBindings b1 = TypeBindings.create(NonGeneric.class, (List<JavaType>) null);
        assertTrue(b1.isEmpty());

        TypeBindings b2 = TypeBindings.create(NonGeneric.class, Collections.<JavaType>emptyList());
        assertTrue(b2.isEmpty());

        TypeBindings b3 = TypeBindings.create(SingleGeneric.class, Collections.singletonList(_stringType));
        assertEquals(1, b3.size());
        assertEquals(_stringType, b3.getBoundType(0));
    }

    @Test
    public void testCreateWithArray_nullOrEmpty() {
        TypeBindings b1 = TypeBindings.create(NonGeneric.class, (JavaType[]) null);
        assertTrue(b1.isEmpty());

        TypeBindings b2 = TypeBindings.create(NonGeneric.class, new JavaType[0]);
        assertTrue(b2.isEmpty());
    }

    @Test
    public void testCreateWithArray_threeParams() {
        JavaType[] types = new JavaType[] { _stringType, _integerType, _longType };
        TypeBindings b = TypeBindings.create(TripleGeneric.class, types);
        assertEquals(3, b.size());
        assertEquals("A", b.getBoundName(0));
        assertEquals("B", b.getBoundName(1));
        assertEquals("C", b.getBoundName(2));
        assertEquals(_stringType, b.getBoundType(0));
        assertEquals(_integerType, b.getBoundType(1));
        assertEquals(_longType, b.getBoundType(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithArray_mismatchCountThrowsException() {
        JavaType[] types = new JavaType[] { _stringType, _integerType, _longType };
        TypeBindings.create(PairGeneric.class, types);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithArray_singleParamMismatchThrowsException() {
        JavaType[] types = new JavaType[] { _stringType };
        TypeBindings.create(NonGeneric.class, types);
    }

    @Test
    public void testCreate1Param_stashClasses() {
        TypeBindings bCol = TypeBindings.create(Collection.class, _stringType);
        assertEquals(1, bCol.size());
        assertEquals("E", bCol.getBoundName(0));
        assertEquals(_stringType, bCol.getBoundType(0));

        TypeBindings bList = TypeBindings.create(List.class, _stringType);
        assertEquals(1, bList.size());
        assertEquals("E", bList.getBoundName(0));

        TypeBindings bArrayList = TypeBindings.create(ArrayList.class, _stringType);
        assertEquals(1, bArrayList.size());
        assertEquals("E", bArrayList.getBoundName(0));

        TypeBindings bAbstractList = TypeBindings.create(AbstractList.class, _stringType);
        assertEquals(1, bAbstractList.size());
        assertEquals("E", bAbstractList.getBoundName(0));

        TypeBindings bIterable = TypeBindings.create(Iterable.class, _stringType);
        assertEquals(1, bIterable.size());
        assertEquals("T", bIterable.getBoundName(0));

        TypeBindings bCustom = TypeBindings.create(SingleGeneric.class, _stringType);
        assertEquals(1, bCustom.size());
        assertEquals("T", bCustom.getBoundName(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate1Param_wrongParamCountThrowsException() {
        TypeBindings.create(PairGeneric.class, _stringType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate1Param_nonGenericClassThrowsException() {
        TypeBindings.create(NonGeneric.class, _stringType);
    }

    @Test
    public void testCreate2Params_stashClasses() {
        TypeBindings bMap = TypeBindings.create(Map.class, _stringType, _integerType);
        assertEquals(2, bMap.size());
        assertEquals("K", bMap.getBoundName(0));
        assertEquals("V", bMap.getBoundName(1));
        assertEquals(_stringType, bMap.getBoundType(0));
        assertEquals(_integerType, bMap.getBoundType(1));

        TypeBindings bHashMap = TypeBindings.create(HashMap.class, _stringType, _integerType);
        assertEquals(2, bHashMap.size());

        TypeBindings bLinkedHashMap = TypeBindings.create(LinkedHashMap.class, _stringType, _integerType);
        assertEquals(2, bLinkedHashMap.size());

        TypeBindings bCustom = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        assertEquals(2, bCustom.size());
        assertEquals("K", bCustom.getBoundName(0));
        assertEquals("V", bCustom.getBoundName(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate2Params_wrongParamCountThrowsException() {
        TypeBindings.create(SingleGeneric.class, _stringType, _integerType);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate2Params_nonGenericClassThrowsException() {
        TypeBindings.create(NonGeneric.class, _stringType, _integerType);
    }

    @Test
    public void testCreateIfNeeded1Param_nonGenericReturnsEmpty() {
        TypeBindings b = TypeBindings.createIfNeeded(NonGeneric.class, _stringType);
        assertTrue(b.isEmpty());
    }

    @Test
    public void testCreateIfNeeded1Param_generic1ParamReturnsBindings() {
        TypeBindings b = TypeBindings.createIfNeeded(SingleGeneric.class, _stringType);
        assertEquals(1, b.size());
        assertEquals(_stringType, b.getBoundType(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeeded1Param_generic2ParamsThrowsException() {
        TypeBindings.createIfNeeded(PairGeneric.class, _stringType);
    }

    @Test
    public void testCreateIfNeededArray_nonGenericReturnsEmpty() {
        TypeBindings b1 = TypeBindings.createIfNeeded(NonGeneric.class, new JavaType[] { _stringType });
        assertTrue(b1.isEmpty());

        TypeBindings b2 = TypeBindings.createIfNeeded(NonGeneric.class, (JavaType[]) null);
        assertTrue(b2.isEmpty());
    }

    @Test
    public void testCreateIfNeededArray_matchingParams() {
        TypeBindings b = TypeBindings.createIfNeeded(PairGeneric.class, new JavaType[] { _stringType, _integerType });
        assertEquals(2, b.size());
        assertEquals(_stringType, b.getBoundType(0));
        assertEquals(_integerType, b.getBoundType(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeededArray_nullArrayForGenericThrowsException() {
        TypeBindings.createIfNeeded(PairGeneric.class, (JavaType[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeededArray_mismatchThrowsException() {
        TypeBindings.createIfNeeded(PairGeneric.class, new JavaType[] { _stringType });
    }

    @Test
    public void testUnboundVariables() {
        TypeBindings b = TypeBindings.create(SingleGeneric.class, _stringType);
        assertFalse(b.hasUnbound("U"));

        TypeBindings bWithUnbound1 = b.withUnboundVariable("U");
        assertTrue(bWithUnbound1.hasUnbound("U"));
        assertFalse(bWithUnbound1.hasUnbound("V"));

        TypeBindings bWithUnbound2 = bWithUnbound1.withUnboundVariable("V");
        assertTrue(bWithUnbound2.hasUnbound("U"));
        assertTrue(bWithUnbound2.hasUnbound("V"));
        assertFalse(bWithUnbound2.hasUnbound("W"));
    }

    @Test
    public void testFindBoundType_normalAndNotFound() {
        TypeBindings b = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        assertEquals(_stringType, b.findBoundType("K"));
        assertEquals(_integerType, b.findBoundType("V"));
        assertNull(b.findBoundType("NON_EXISTING"));
    }

    @Test
    public void testFindBoundType_resolvedRecursiveType() {
        ResolvedRecursiveType rrtResolved = new ResolvedRecursiveType(SingleGeneric.class, TypeBindings.emptyBindings());
        rrtResolved.setReference(_stringType);

        TypeBindings bResolved = TypeBindings.create(SingleGeneric.class, rrtResolved);
        assertEquals(_stringType, bResolved.findBoundType("T"));

        ResolvedRecursiveType rrtUnresolved = new ResolvedRecursiveType(SingleGeneric.class, TypeBindings.emptyBindings());
        TypeBindings bUnresolved = TypeBindings.create(SingleGeneric.class, rrtUnresolved);
        assertEquals(rrtUnresolved, bUnresolved.findBoundType("T"));
    }

    @Test
    public void testGetBoundNameAndType_boundaryChecks() {
        TypeBindings b = TypeBindings.create(SingleGeneric.class, _stringType);
        assertNull(b.getBoundName(-1));
        assertNull(b.getBoundName(1));
        assertEquals("T", b.getBoundName(0));

        assertNull(b.getBoundType(-1));
        assertNull(b.getBoundType(1));
        assertEquals(_stringType, b.getBoundType(0));
    }

    @Test
    public void testGetTypeParameters() {
        TypeBindings empty = TypeBindings.emptyBindings();
        assertEquals(0, empty.getTypeParameters().size());

        TypeBindings b = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        List<JavaType> params = b.getTypeParameters();
        assertEquals(2, params.size());
        assertEquals(_stringType, params.get(0));
        assertEquals(_integerType, params.get(1));
    }

    @Test
    public void testToString() {
        assertEquals("<>", TypeBindings.emptyBindings().toString());

        TypeBindings b1 = TypeBindings.create(SingleGeneric.class, _stringType);
        assertEquals("<" + _stringType.getGenericSignature() + ">", b1.toString());

        TypeBindings b2 = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        assertEquals("<" + _stringType.getGenericSignature() + "," + _integerType.getGenericSignature() + ">", b2.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        TypeBindings b1 = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        TypeBindings b2 = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        TypeBindings b3 = TypeBindings.create(PairGeneric.class, _stringType, _longType);
        TypeBindings b4 = TypeBindings.create(SingleGeneric.class, _stringType);

        assertTrue(b1.equals(b1));
        assertTrue(b1.equals(b2));
        assertEquals(b1.hashCode(), b2.hashCode());

        assertFalse(b1.equals(null));
        assertFalse(b1.equals("SomeString"));
        assertFalse(b1.equals(b3));
        assertFalse(b1.equals(b4));
    }

    @Test
    public void testSerialization_emptyBindings() throws Exception {
        TypeBindings empty = TypeBindings.emptyBindings();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(empty);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        ois.close();

        assertSame(TypeBindings.emptyBindings(), deserialized);
    }

    @Test
    public void testSerialization_nonEmptyBindings() throws Exception {
        TypeBindings bindings = TypeBindings.create(PairGeneric.class, _stringType, _integerType);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(bindings);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        Object deserialized = ois.readObject();
        ois.close();

        assertTrue(deserialized instanceof TypeBindings);
        assertEquals(bindings, deserialized);
    }
}
