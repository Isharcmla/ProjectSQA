package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTypeTest {

    private JavaType stringType;
    private JavaType intType;
    private JavaType objectType;
    private TypeFactory typeFactory;

    @Before
    public void setUp() {
        typeFactory = TypeFactory.defaultInstance();
        stringType = typeFactory.constructType(String.class);
        intType = typeFactory.constructType(Integer.class);
        objectType = typeFactory.constructType(Object.class);
    }

    private CollectionType buildCollectionType() {
        return CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                objectType, new JavaType[0], stringType);
    }

    @Test
    public void testConstruct_withBindingsNormalInput_createsValidCollectionType() {
        CollectionType type = buildCollectionType();
        assertNotNull(type);
        assertEquals(List.class, type.getRawClass());
        assertEquals(stringType, type.getContentType());
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testConstructDeprecated_normalInput_createsValidCollectionType() {
        CollectionType type = CollectionType.construct(ArrayList.class, stringType);
        assertNotNull(type);
        assertEquals(ArrayList.class, type.getRawClass());
        assertEquals(stringType, type.getContentType());
    }

    @Test
    public void testConstruct_withEmptySuperInterfaces_edgeCase() {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                objectType, new JavaType[0], stringType);
        assertNotNull(type);
    }

    @Test
    public void testConstruct_withNullSuperClassAndSuperInts_edgeCase() {
        CollectionType type = CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                null, null, stringType);
        assertNotNull(type);
        assertEquals(stringType, type.getContentType());
    }

    @Test(expected = NullPointerException.class)
    public void testConstruct_withNullElementType_throwsException() {
        CollectionType.construct(List.class, TypeBindings.emptyBindings(),
                objectType, new JavaType[0], null);
    }

    @Test
    public void testWithContentType_sameType_returnsSameInstance() {
        CollectionType type = buildCollectionType();
        JavaType result = type.withContentType(stringType);
        assertSame(type, result);
    }

    @Test
    public void testWithContentType_differentType_returnsNewInstance() {
        CollectionType type = buildCollectionType();
        JavaType result = type.withContentType(intType);
        assertNotSame(type, result);
        assertEquals(intType, result.getContentType());
    }

    @Test
    public void testWithTypeHandler_normalInput_createsNewInstanceWithHandler() {
        CollectionType type = buildCollectionType();
        Object handler = new Object();
        CollectionType result = type.withTypeHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getTypeHandler());
    }

    @Test
    public void testWithTypeHandler_nullHandler_edgeCase() {
        CollectionType type = buildCollectionType();
        CollectionType result = type.withTypeHandler(null);
        assertNotNull(result);
        assertNull(result.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_normalInput_createsNewInstance() {
        CollectionType type = buildCollectionType();
        Object handler = new Object();
        CollectionType result = type.withContentTypeHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler_normalInput_createsNewInstanceWithHandler() {
        CollectionType type = buildCollectionType();
        Object handler = new Object();
        CollectionType result = type.withValueHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getValueHandler());
    }

    @Test
    public void testWithValueHandler_nullHandler_edgeCase() {
        CollectionType type = buildCollectionType();
        CollectionType result = type.withValueHandler(null);
        assertNotNull(result);
        assertNull(result.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler_normalInput_createsNewInstance() {
        CollectionType type = buildCollectionType();
        Object handler = new Object();
        CollectionType result = type.withContentValueHandler(handler);
        assertNotSame(type, result);
        assertEquals(handler, result.getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_notStatic_createsNewInstance() {
        CollectionType type = buildCollectionType();
        CollectionType result = type.withStaticTyping();
        assertNotSame(type, result);
        assertNotNull(result);
    }

    @Test
    public void testWithStaticTyping_alreadyStatic_returnsSameInstance() {
        CollectionType type = buildCollectionType();
        CollectionType staticType = type.withStaticTyping();
        CollectionType result = staticType.withStaticTyping();
        assertSame(staticType, result);
    }

    @Test
    public void testRefine_normalInput_createsNewInstance() {
        CollectionType type = buildCollectionType();
        JavaType result = type.refine(ArrayList.class, TypeBindings.emptyBindings(),
                objectType, new JavaType[0]);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
        assertTrue(result instanceof CollectionType);
        assertEquals(stringType, result.getContentType());
    }

    @Test
    public void testToString_normalInput_returnsExpectedFormat() {
        CollectionType type = buildCollectionType();
        String result = type.toString();
        assertNotNull(result);
        assertTrue(result.contains("collection type"));
        assertTrue(result.contains(List.class.getName()));
        assertTrue(result.contains(stringType.toString()));
    }

    @Test
    @SuppressWarnings("deprecation")
    public void testNarrow_deprecatedProtectedMethod_createsNewInstance() {
        CollectionType type = buildCollectionType();
        JavaType result = type._narrow(ArrayList.class);
        assertNotNull(result);
        assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testGetContentType_normalInput_returnsElementType() {
        CollectionType type = buildCollectionType();
        assertEquals(stringType, type.getContentType());
    }
}
