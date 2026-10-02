package org.mockito.internal.util.reflection;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GenericMasterTest {

    private GenericMaster genericMaster;

    public List<String> stringList;
    public Set<Integer> integerSet;
    public Map<Double, String> doubleKeyMap;
    public String nonGenericString;
    public int primitiveField;
    @SuppressWarnings("rawtypes")
    public List rawList;
    public List<List<String>> nestedList;

    @Before
    public void setUp() {
        genericMaster = new GenericMaster();
    }

    @Test
    public void testGetGenericType_singleGenericParam_returnsParamType() throws Exception {
        Field field = GenericMasterTest.class.getField("stringList");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(String.class, result);
    }

    @Test
    public void testGetGenericType_setOfInteger_returnsIntegerClass() throws Exception {
        Field field = GenericMasterTest.class.getField("integerSet");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Integer.class, result);
    }

    @Test
    public void testGetGenericType_multipleGenericParams_returnsFirstParamType() throws Exception {
        Field field = GenericMasterTest.class.getField("doubleKeyMap");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Double.class, result);
    }

    @Test
    public void testGetGenericType_nonGenericObjectField_returnsObjectClass() throws Exception {
        Field field = GenericMasterTest.class.getField("nonGenericString");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_primitiveField_returnsObjectClass() throws Exception {
        Field field = GenericMasterTest.class.getField("primitiveField");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_rawTypeField_returnsObjectClass() throws Exception {
        Field field = GenericMasterTest.class.getField("rawList");
        Class<?> result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test(expected = ClassCastException.class)
    public void testGetGenericType_nestedGenericField_throwsClassCastException() throws Exception {
        Field field = GenericMasterTest.class.getField("nestedList");
        genericMaster.getGenericType(field);
    }

    @Test(expected = NullPointerException.class)
    public void testGetGenericType_nullField_throwsNullPointerException() {
        genericMaster.getGenericType(null);
    }

    @Test
    public void testConstructor_instantiationSuccess() {
        GenericMaster instance = new GenericMaster();
        assertNotNull(instance);
    }
}
