package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TypeBindingsTest {

    // Helper generic class with 3 type parameters, used to trigger "general path" logic
    static class ThreeParamHolder<A, B, C> {}

    private JavaType stringType;
    private JavaType intType;
    private JavaType longType;

    @Before
    public void setUp() {
        TypeFactory tf = TypeFactory.defaultInstance();
        stringType = tf.constructType(String.class);
        intType = tf.constructType(Integer.class);
        longType = tf.constructType(Long.class);
    }

    // ---------- emptyBindings() ----------

    @Test
    public void testEmptyBindings_returnsEmptyInstance() {
        TypeBindings tb = TypeBindings.emptyBindings();
        assertNotNull(tb);
        assertTrue(tb.isEmpty());
        assertEquals(0, tb.size());
    }

    @Test
    public void testEmptyBindings_sameInstanceReturnedEachTime() {
        TypeBindings tb1 = TypeBindings.emptyBindings();
        TypeBindings tb2 = TypeBindings.emptyBindings();
        assertSame(tb1, tb2);
    }

    // ---------- create(Class, List<JavaType>) ----------

    @Test
    public void testCreateWithList_singleTypeParam_success() {
        List<JavaType> list = new ArrayList<JavaType>();
        list.add(stringType);
        TypeBindings tb = TypeBindings.create(List.class, list);
        assertEquals(1, tb.size());
        assertEquals(stringType, tb.getBoundType(0));
    }

    @Test
    public void testCreateWithList_emptyList_returnsEmpty() {
        List<JavaType> list = new ArrayList<JavaType>();
        TypeBindings tb = TypeBindings.create(Object.class, list);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateWithList_nullList_returnsEmpty() {
        TypeBindings tb = TypeBindings.create(Object.class, (List<JavaType>) null);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateWithList_twoTypeParams_success() {
        List<JavaType> list = new ArrayList<JavaType>();
        list.add(stringType);
        list.add(intType);
        TypeBindings tb = TypeBindings.create(Map.class, list);
        assertEquals(2, tb.size());
    }

    @Test
    public void testCreateWithList_threeTypeParams_generalPath() {
        List<JavaType> list = new ArrayList<JavaType>();
        list.add(stringType);
        list.add(intType);
        list.add(longType);
        TypeBindings tb = TypeBindings.create(ThreeParamHolder.class, list);
        assertEquals(3, tb.size());
    }

    // ---------- create(Class, JavaType[]) ----------

    @Test
    public void testCreateWithArray_zeroTypes_success() {
        TypeBindings tb = TypeBindings.create(Object.class, new JavaType[0]);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateWithArray_nullTypes_success() {
        TypeBindings tb = TypeBindings.create(Object.class, (JavaType[]) null);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateWithArray_oneType_delegatesToSingleArgCreate() {
        JavaType[] types = new JavaType[] { stringType };
        TypeBindings tb = TypeBindings.create(List.class, types);
        assertEquals(1, tb.size());
        assertEquals(stringType, tb.getBoundType(0));
    }

    @Test
    public void testCreateWithArray_twoTypes_delegatesToTwoArgCreate() {
        JavaType[] types = new JavaType[] { stringType, intType };
        TypeBindings tb = TypeBindings.create(Map.class, types);
        assertEquals(2, tb.size());
    }

    @Test
    public void testCreateWithArray_threeTypes_generalPath() {
        JavaType[] types = new JavaType[] { stringType, intType, longType };
        TypeBindings tb = TypeBindings.create(ThreeParamHolder.class, types);
        assertEquals(3, tb.size());
        assertEquals(stringType, tb.getBoundType(0));
        assertEquals(intType, tb.getBoundType(1));
        assertEquals(longType, tb.getBoundType(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithArray_mismatchedParamCount_throwsException() {
        JavaType[] types = new JavaType[] { stringType, intType, longType };
        TypeBindings.create(Object.class, types);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateWithArray_threeParamsWrongCount_throwsException() {
        JavaType[] types = new JavaType[] { stringType, intType, longType, stringType };
        TypeBindings.create(ThreeParamHolder.class, types);
    }

    // ---------- create(Class, JavaType) 1-arg ----------

    @Test
    public void testCreate1Arg_listClass_success() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertEquals(1, tb.size());
        assertEquals(stringType, tb.getBoundType(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate1Arg_wrongParamCount_throwsException() {
        TypeBindings.create(Map.class, stringType);
    }

    // ---------- create(Class, JavaType, JavaType) 2-arg ----------

    @Test
    public void testCreate2Arg_mapClass_success() {
        TypeBindings tb = TypeBindings.create(Map.class, stringType, intType);
        assertEquals(2, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreate2Arg_wrongParamCount_throwsException() {
        TypeBindings.create(List.class, stringType, intType);
    }

    // ---------- createIfNeeded(Class, JavaType) ----------

    @Test
    public void testCreateIfNeeded1Arg_zeroParams_returnsEmpty() {
        TypeBindings tb = TypeBindings.createIfNeeded(Object.class, stringType);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateIfNeeded1Arg_oneParam_success() {
        TypeBindings tb = TypeBindings.createIfNeeded(List.class, stringType);
        assertEquals(1, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeeded1Arg_wrongParamCount_throwsException() {
        TypeBindings.createIfNeeded(Map.class, stringType);
    }

    // ---------- createIfNeeded(Class, JavaType[]) ----------

    @Test
    public void testCreateIfNeeded2Arg_zeroParams_returnsEmpty() {
        TypeBindings tb = TypeBindings.createIfNeeded(Object.class, new JavaType[] { stringType });
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateIfNeeded2Arg_nullTypesArrayZeroVars_returnsEmpty() {
        TypeBindings tb = TypeBindings.createIfNeeded(Object.class, null);
        assertTrue(tb.isEmpty());
    }

    @Test
    public void testCreateIfNeeded2Arg_normalCase_success() {
        JavaType[] types = new JavaType[] { stringType, intType };
        TypeBindings tb = TypeBindings.createIfNeeded(Map.class, types);
        assertEquals(2, tb.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeeded2Arg_nullTypesArrayWithVars_throwsException() {
        TypeBindings.createIfNeeded(List.class, (JavaType[]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateIfNeeded2Arg_mismatchedCount_throwsException() {
        JavaType[] types = new JavaType[] { stringType };
        TypeBindings.createIfNeeded(Map.class, types);
    }

    // ---------- withUnboundVariable / hasUnbound ----------

    @Test
    public void testWithUnboundVariable_addsVariable_hasUnboundReturnsTrue() {
        TypeBindings tb = TypeBindings.emptyBindings();
        TypeBindings tb2 = tb.withUnboundVariable("T");
        assertTrue(tb2.hasUnbound("T"));
        assertFalse(tb2.hasUnbound("U"));
    }

    @Test
    public void testWithUnboundVariable_multipleAdds_allTracked() {
        TypeBindings tb = TypeBindings.emptyBindings();
        TypeBindings tb2 = tb.withUnboundVariable("T").withUnboundVariable("U");
        assertTrue(tb2.hasUnbound("T"));
        assertTrue(tb2.hasUnbound("U"));
    }

    @Test
    public void testHasUnbound_noUnboundVariables_returnsFalse() {
        TypeBindings tb = TypeBindings.emptyBindings();
        assertFalse(tb.hasUnbound("T"));
    }

    // ---------- findBoundType ----------

    @Test
    public void testFindBoundType_existingName_returnsType() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        JavaType found = tb.findBoundType("E");
        assertEquals(stringType, found);
    }

    @Test
    public void testFindBoundType_nonExistingName_returnsNull() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertNull(tb.findBoundType("X"));
    }

    @Test
    public void testFindBoundType_emptyBindings_returnsNull() {
        TypeBindings tb = TypeBindings.emptyBindings();
        assertNull(tb.findBoundType("T"));
    }

    // ---------- isEmpty / size ----------

    @Test
    public void testIsEmpty_emptyBindings_returnsTrue() {
        assertTrue(TypeBindings.emptyBindings().isEmpty());
    }

    @Test
    public void testIsEmpty_nonEmptyBindings_returnsFalse() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertFalse(tb.isEmpty());
    }

    @Test
    public void testSize_variousBindings() {
        assertEquals(0, TypeBindings.emptyBindings().size());
        assertEquals(1, TypeBindings.create(List.class, stringType).size());
        assertEquals(2, TypeBindings.create(Map.class, stringType, intType).size());
    }

    // ---------- getBoundName ----------

    @Test
    public void testGetBoundName_validIndex_returnsName() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertEquals("E", tb.getBoundName(0));
    }

    @Test
    public void testGetBoundName_negativeIndex_returnsNull() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertNull(tb.getBoundName(-1));
    }

    @Test
    public void testGetBoundName_indexTooLarge_returnsNull() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertNull(tb.getBoundName(5));
    }

    // ---------- getBoundType ----------

    @Test
    public void testGetBoundType_validIndex_returnsType() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertEquals(stringType, tb.getBoundType(0));
    }

    @Test
    public void testGetBoundType_negativeIndex_returnsNull() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertNull(tb.getBoundType(-1));
    }

    @Test
    public void testGetBoundType_indexTooLarge_returnsNull() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertNull(tb.getBoundType(5));
    }

    // ---------- getTypeParameters ----------

    @Test
    public void testGetTypeParameters_emptyBindings_returnsEmptyList() {
        List<JavaType> params = TypeBindings.emptyBindings().getTypeParameters();
        assertTrue(params.isEmpty());
    }

    @Test
    public void testGetTypeParameters_nonEmptyBindings_returnsList() {
        TypeBindings tb = TypeBindings.create(Map.class, stringType, intType);
        List<JavaType> params = tb.getTypeParameters();
        assertEquals(2, params.size());
        assertEquals(stringType, params.get(0));
        assertEquals(intType, params.get(1));
    }

    // ---------- toString ----------

    @Test
    public void testToString_emptyBindings_returnsEmptyBrackets() {
        assertEquals("<>", TypeBindings.emptyBindings().toString());
    }

    @Test
    public void testToString_nonEmptyBindings_containsBrackets() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        String s = tb.toString();
        assertTrue(s.startsWith("<"));
        assertTrue(s.endsWith(">"));
    }

    @Test
    public void testToString_multipleTypes_containsComma() {
        TypeBindings tb = TypeBindings.create(Map.class, stringType, intType);
        String s = tb.toString();
        assertTrue(s.contains(","));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_consistentAcrossCalls() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        int h1 = tb.hashCode();
        int h2 = tb.hashCode();
        assertEquals(h1, h2);
    }

    @Test
    public void testHashCode_equalObjectsHaveSameHashCode() {
        TypeBindings tb1 = TypeBindings.create(List.class, stringType);
        TypeBindings tb2 = TypeBindings.create(List.class, stringType);
        assertEquals(tb1.hashCode(), tb2.hashCode());
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertTrue(tb.equals(tb));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertFalse(tb.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        assertFalse(tb.equals("not a TypeBindings"));
    }

    @Test
    public void testEquals_differentSize_returnsFalse() {
        TypeBindings tb1 = TypeBindings.create(List.class, stringType);
        TypeBindings tb2 = TypeBindings.create(Map.class, stringType, intType);
        assertFalse(tb1.equals(tb2));
    }

    @Test
    public void testEquals_sameContent_returnsTrue() {
        TypeBindings tb1 = TypeBindings.create(List.class, stringType);
        TypeBindings tb2 = TypeBindings.create(List.class, stringType);
        assertTrue(tb1.equals(tb2));
    }

    @Test
    public void testEquals_differentContent_returnsFalse() {
        TypeBindings tb1 = TypeBindings.create(List.class, stringType);
        TypeBindings tb2 = TypeBindings.create(List.class, intType);
        assertFalse(tb1.equals(tb2));
    }

    // ---------- typeParameterArray (package-private) ----------

    @Test
    public void testTypeParameterArray_returnsUnderlyingArray() {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        JavaType[] arr = tb.typeParameterArray();
        assertEquals(1, arr.length);
        assertEquals(stringType, arr[0]);
    }

    // ---------- readResolve (protected) ----------

    @Test
    public void testReadResolve_emptyNames_returnsEmptyInstance() throws Exception {
        TypeBindings tb = TypeBindings.emptyBindings();
        Object resolved = tb.readResolve();
        assertSame(TypeBindings.emptyBindings(), resolved);
    }

    @Test
    public void testReadResolve_nonEmptyNames_returnsSameInstance() throws Exception {
        TypeBindings tb = TypeBindings.create(List.class, stringType);
        Object resolved = tb.readResolve();
        assertSame(tb, resolved);
    }
}
