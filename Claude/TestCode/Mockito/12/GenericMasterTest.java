package org.mockito.internal.util.reflection;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class GenericMasterTest {

    private GenericMaster genericMaster;

    @Before
    public void setUp() {
        genericMaster = new GenericMaster();
    }

    // Test fixture fields for reflection
    private static class TestClass {
        private List<String> genericListField;
        private List rawListField;
        private String simpleField;
        private Map<String, List<Integer>> nestedGenericField;
        private int primitiveField;
        private Object objectField;
    }

    @Test
    public void testGetGenericType_parameterizedField_returnsGenericType() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("genericListField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(String.class, result);
    }

    @Test
    public void testGetGenericType_rawListField_returnsObjectClass() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("rawListField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_nonGenericSimpleField_returnsObjectClass() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("simpleField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_nestedGenericField_returnsFirstActualTypeArgument() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("nestedGenericField");
        Class result = genericMaster.getGenericType(field);
        // Nested generics: only first type argument is returned (String.class for Map<String, List<Integer>>)
        assertEquals(String.class, result);
    }

    @Test
    public void testGetGenericType_primitiveField_returnsObjectClass() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("primitiveField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test
    public void testGetGenericType_objectField_returnsObjectClass() throws NoSuchFieldException {
        Field field = TestClass.class.getDeclaredField("objectField");
        Class result = genericMaster.getGenericType(field);
        assertEquals(Object.class, result);
    }

    @Test(expected = NullPointerException.class)
    public void testGetGenericType_nullField_throwsNullPointerException() {
        genericMaster.getGenericType(null);
    }
}
