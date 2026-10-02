package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTypeTest {

    private TypeFactory _typeFactory;
    private JavaType _stringType;

    @Before
    public void setUp() {
        _typeFactory = TypeFactory.defaultInstance();
        _stringType = _typeFactory.constructType(String.class);
    }

    @Test
    public void testConstruct_withBindingsAndSuperTypes_returnsValidCollectionType() {
        TypeBindings bindings = TypeBindings.create(ArrayList.class, _stringType);
        JavaType superClass = _typeFactory.constructType(Object.class);
        JavaType[] superInterfaces = new JavaType[] { _typeFactory.constructType(List.class) };

        CollectionType type = CollectionType.construct(ArrayList.class, bindings, superClass, superInterfaces, _stringType);

        Assert.assertNotNull(type);
        Assert.assertEquals(ArrayList.class, type.getRawClass());
        Assert.assertEquals(_stringType, type.getContentType());
        Assert.assertEquals(bindings, type.getBindings());
        Assert.assertEquals(superClass, type.getSuperClass());
        Assert.assertEquals(1, type.getInterfaces().size());
        Assert.assertFalse(type.useStaticType());
    }

    @Test
    public void testConstruct_deprecatedTwoArg_returnsValidCollectionType() {
        @SuppressWarnings("deprecation")
        CollectionType type = CollectionType.construct(ArrayList.class, _stringType);

        Assert.assertNotNull(type);
        Assert.assertEquals(ArrayList.class, type.getRawClass());
        Assert.assertEquals(_stringType, type.getContentType());
        Assert.assertFalse(type.useStaticType());
    }

    @Test
    public void testNarrow_changesRawClassPreservingElementType() {
        CollectionType type = _typeFactory.constructCollectionType(List.class, String.class);
        
        @SuppressWarnings("deprecation")
        JavaType narrowed = type._narrow(ArrayList.class);

        Assert.assertNotNull(narrowed);
        Assert.assertTrue(narrowed instanceof CollectionType);
        Assert.assertEquals(ArrayList.class, narrowed.getRawClass());
        Assert.assertEquals(_stringType, narrowed.getContentType());
    }

    @Test
    public void testWithContentType_sameContentType_returnsSameInstance() {
        CollectionType type = _typeFactory.constructCollectionType(ArrayList.class, String.class);
        JavaType result = type.withContentType(_stringType);

        Assert.assertSame(type, result);
    }

    @Test
    public void testWithContentType_differentContentType_returnsNewInstance() {
        CollectionType type = _typeFactory.constructCollectionType(ArrayList.class, String.class);
        JavaType intType = _typeFactory.constructType(Integer.class);
        JavaType result = type.withContentType(intType);

        Assert.assertNotSame(type, result);
        Assert.assertEquals(intType, result.getContentType());
        Assert.assertEquals(ArrayList.class, result.getRawClass());
    }

    @Test
    public void testWithTypeHandler_andWithContentTypeHandler() {
        CollectionType type = _typeFactory.constructCollectionType(ArrayList.class, String.class);
        Object typeHandler = "TypeHandlerObj";
        Object contentTypeHandler = "ContentTypeHandlerObj";

        CollectionType withTh = type.withTypeHandler(typeHandler);
        Assert.assertNotSame(type, withTh);
        Assert.assertEquals(typeHandler, withTh.getTypeHandler());
        Assert.assertNull(withTh.getContentType().getTypeHandler());

        CollectionType withCth = type.withContentTypeHandler(contentTypeHandler);
        Assert.assertNotSame(type, withCth);
        Assert.assertNull(withCth.getTypeHandler());
        Assert.assertEquals(contentTypeHandler, withCth.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler_andWithContentValueHandler() {
        CollectionType type = _typeFactory.constructCollectionType(ArrayList.class, String.class);
        Object valueHandler = "ValueHandlerObj";
        Object contentValueHandler = "ContentValueHandlerObj";

        CollectionType withVh = type.withValueHandler(valueHandler);
        Assert.assertNotSame(type, withVh);
        Assert.assertEquals(valueHandler, withVh.getValueHandler());
        Assert.assertNull(withVh.getContentType().getValueHandler());

        CollectionType withCvh = type.withContentValueHandler(contentValueHandler);
        Assert.assertNotSame(type, withCvh);
        Assert.assertNull(withCvh.getValueHandler());
        Assert.assertEquals(contentValueHandler, withCvh.getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_fromDynamic_returnsStaticInstance() {
        CollectionType dynamicType = _typeFactory.constructCollectionType(ArrayList.class, String.class);
        Assert.assertFalse(dynamicType.useStaticType());

        CollectionType staticType = dynamicType.withStaticTyping();
        Assert.assertNotSame(dynamicType, staticType);
        Assert.assertTrue(staticType.useStaticType());
        Assert.assertTrue(staticType.getContentType().useStaticType());

        CollectionType staticTypeAgain = staticType.withStaticTyping();
        Assert.assertSame(staticType, staticTypeAgain);
    }

    @Test
    public void testRefine_updatesClassAndSuperTypes() {
        CollectionType original = _typeFactory.constructCollectionType(List.class, String.class);
        TypeBindings bindings = TypeBindings.create(LinkedList.class, _stringType);
        JavaType superClass = _typeFactory.constructType(Object.class);
        JavaType[] superInterfaces = new JavaType[0];

        JavaType refined = original.refine(LinkedList.class, bindings, superClass, superInterfaces);

        Assert.assertNotNull(refined);
        Assert.assertTrue(refined instanceof CollectionType);
        Assert.assertEquals(LinkedList.class, refined.getRawClass());
        Assert.assertEquals(bindings, refined.getBindings());
        Assert.assertEquals(superClass, refined.getSuperClass());
        Assert.assertEquals(_stringType, refined.getContentType());
    }

    @Test
    public void testToString_formatsCorrectly() {
        CollectionType type = _typeFactory.constructCollectionType(ArrayList.class, String.class);
        String str = type.toString();

        Assert.assertNotNull(str);
        Assert.assertTrue(str.startsWith("[collection type; class java.util.ArrayList, contains "));
        Assert.assertTrue(str.endsWith("]"));
    }

    @Test
    public void testProtectedConstructor_viaSubclass() {
        TypeBase base = (TypeBase) _typeFactory.constructType(ArrayList.class);
        CollectionType subclassInstance = new CollectionType(base, _stringType) {};

        Assert.assertEquals(ArrayList.class, subclassInstance.getRawClass());
        Assert.assertEquals(_stringType, subclassInstance.getContentType());
    }
}
