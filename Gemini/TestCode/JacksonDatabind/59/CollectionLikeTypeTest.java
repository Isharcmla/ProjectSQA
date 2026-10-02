package com.fasterxml.jackson.databind.type;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JavaType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionLikeTypeTest {

    private JavaType stringType;
    private JavaType intType;
    private CollectionLikeType collectionLikeType;

    @Before
    public void setUp() {
        stringType = SimpleType.constructUnsafe(String.class);
        intType = SimpleType.constructUnsafe(Integer.class);
        collectionLikeType = CollectionLikeType.construct(
                ArrayList.class,
                TypeBindings.create(ArrayList.class, stringType),
                SimpleType.constructUnsafe(Object.class),
                new JavaType[0],
                stringType
        );
    }

    @Test
    public void testConstruct_withFullArguments_createsInstance() {
        TypeBindings bindings = TypeBindings.create(ArrayList.class, stringType);
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] superInts = new JavaType[0];

        CollectionLikeType type = CollectionLikeType.construct(
                ArrayList.class, bindings, superClass, superInts, stringType);

        Assert.assertNotNull(type);
        Assert.assertEquals(ArrayList.class, type.getRawClass());
        Assert.assertEquals(stringType, type.getContentType());
        Assert.assertFalse(type.useStaticType());
        Assert.assertNull(type.getValueHandler());
        Assert.assertNull(type.getTypeHandler());
    }

    @Test
    public void testConstruct_deprecatedWithSingleTypeParam_createsBindings() {
        // ArrayList has 1 type variable <E>
        CollectionLikeType type = CollectionLikeType.construct(ArrayList.class, stringType);
        Assert.assertNotNull(type);
        Assert.assertEquals(ArrayList.class, type.getRawClass());
        Assert.assertEquals(stringType, type.getContentType());
        Assert.assertFalse(type.getBindings().isEmpty());
    }

    @Test
    public void testConstruct_deprecatedWithZeroOrMultipleTypeParams_emptyBindings() {
        // String has 0 type variables -> empty bindings branch
        CollectionLikeType type0 = CollectionLikeType.construct(String.class, stringType);
        Assert.assertNotNull(type0);
        Assert.assertTrue(type0.getBindings().isEmpty());

        // Map has 2 type variables -> empty bindings branch
        CollectionLikeType type2 = CollectionLikeType.construct(Map.class, stringType);
        Assert.assertNotNull(type2);
        Assert.assertTrue(type2.getBindings().isEmpty());
    }

    @Test
    public void testUpgradeFrom_validTypeBase_returnsCollectionLikeType() {
        JavaType baseType = SimpleType.constructUnsafe(ArrayList.class);
        CollectionLikeType upgraded = CollectionLikeType.upgradeFrom(baseType, stringType);

        Assert.assertNotNull(upgraded);
        Assert.assertEquals(ArrayList.class, upgraded.getRawClass());
        Assert.assertEquals(stringType, upgraded.getContentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_invalidNonTypeBase_throwsIllegalArgumentException() {
        // Create an anonymous JavaType that is NOT an instance of TypeBase
        JavaType customJavaType = new JavaType(
                String.class, 0, null, null, false
        ) {
            private static final long serialVersionUID = 1L;

            @Override
            public JavaType withContentType(JavaType contentType) { return this; }
            @Override
            public JavaType withTypeHandler(Object h) { return this; }
            @Override
            public JavaType withContentTypeHandler(Object h) { return this; }
            @Override
            public JavaType withValueHandler(Object h) { return this; }
            @Override
            public JavaType withContentValueHandler(Object h) { return this; }
            @Override
            public JavaType withStaticTyping() { return this; }
            @Override
            public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return this; }
            @Override
            public boolean isContainerType() { return false; }
            @Override
            public JavaType getContentType() { return null; }
            @Override
            public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }
            @Override
            public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }
            @Override
            public String toString() { return "custom"; }
            @Override
            public boolean equals(Object o) { return false; }
        };

        CollectionLikeType.upgradeFrom(customJavaType, stringType);
    }

    @Test
    public void testNarrow_validSubclass_returnsNarrowedInstance() {
        JavaType narrowed = collectionLikeType._narrow(List.class);
        Assert.assertNotNull(narrowed);
        Assert.assertEquals(List.class, narrowed.getRawClass());
        Assert.assertEquals(stringType, narrowed.getContentType());
    }

    @Test
    public void testWithContentType_sameContentType_returnsThis() {
        JavaType result = collectionLikeType.withContentType(stringType);
        Assert.assertSame(collectionLikeType, result);
    }

    @Test
    public void testWithContentType_differentContentType_returnsNewInstance() {
        JavaType result = collectionLikeType.withContentType(intType);
        Assert.assertNotSame(collectionLikeType, result);
        Assert.assertEquals(intType, result.getContentType());
    }

    @Test
    public void testWithTypeHandler_validHandler_setsTypeHandler() {
        Object handler = "typeHandlerObj";
        CollectionLikeType result = collectionLikeType.withTypeHandler(handler);

        Assert.assertNotSame(collectionLikeType, result);
        Assert.assertEquals(handler, result.getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandler_validHandler_setsContentTypeHandler() {
        Object handler = "contentTypeHandlerObj";
        CollectionLikeType result = collectionLikeType.withContentTypeHandler(handler);

        Assert.assertNotSame(collectionLikeType, result);
        Assert.assertEquals(handler, result.getContentTypeHandler());
        Assert.assertEquals(handler, result.getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandler_validHandler_setsValueHandler() {
        Object handler = "valueHandlerObj";
        CollectionLikeType result = collectionLikeType.withValueHandler(handler);

        Assert.assertNotSame(collectionLikeType, result);
        Assert.assertEquals(handler, result.getValueHandler());
    }

    @Test
    public void testWithContentValueHandler_validHandler_setsContentValueHandler() {
        Object handler = "contentValueHandlerObj";
        CollectionLikeType result = collectionLikeType.withContentValueHandler(handler);

        Assert.assertNotSame(collectionLikeType, result);
        Assert.assertEquals(handler, result.getContentValueHandler());
        Assert.assertEquals(handler, result.getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_whenDynamic_returnsStaticInstance() {
        Assert.assertFalse(collectionLikeType.useStaticType());
        CollectionLikeType staticType = collectionLikeType.withStaticTyping();

        Assert.assertNotSame(collectionLikeType, staticType);
        Assert.assertTrue(staticType.useStaticType());
        Assert.assertTrue(staticType.getContentType().useStaticType());

        // When already static, should return `this`
        CollectionLikeType sameStaticType = staticType.withStaticTyping();
        Assert.assertSame(staticType, sameStaticType);
    }

    @Test
    public void testRefine_validArguments_returnsRefinedInstance() {
        TypeBindings newBindings = TypeBindings.emptyBindings();
        JavaType newSuperClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] newSuperInts = new JavaType[] { SimpleType.constructUnsafe(Cloneable.class) };

        JavaType refined = collectionLikeType.refine(Collection.class, newBindings, newSuperClass, newSuperInts);

        Assert.assertNotNull(refined);
        Assert.assertEquals(Collection.class, refined.getRawClass());
        Assert.assertEquals(stringType, refined.getContentType());
    }

    @Test
    public void testBasicProperties_isContainerAndCollectionLike() {
        Assert.assertTrue(collectionLikeType.isContainerType());
        Assert.assertTrue(collectionLikeType.isCollectionLikeType());
        Assert.assertEquals(stringType, collectionLikeType.getContentType());
        Assert.assertNull(collectionLikeType.getContentValueHandler());
        Assert.assertNull(collectionLikeType.getContentTypeHandler());
    }

    @Test
    public void testHasHandlers_combinations() {
        // Neither collection nor element has handlers
        Assert.assertFalse(collectionLikeType.hasHandlers());

        // Value handler on collection
        CollectionLikeType withValHandler = collectionLikeType.withValueHandler("vh");
        Assert.assertTrue(withValHandler.hasHandlers());

        // Type handler on collection
        CollectionLikeType withTypeHandler = collectionLikeType.withTypeHandler("th");
        Assert.assertTrue(withTypeHandler.hasHandlers());

        // Content value handler on element
        CollectionLikeType withContentValHandler = collectionLikeType.withContentValueHandler("cvh");
        Assert.assertTrue(withContentValHandler.hasHandlers());

        // Content type handler on element
        CollectionLikeType withContentTypeHandler = collectionLikeType.withContentTypeHandler("cth");
        Assert.assertTrue(withContentTypeHandler.hasHandlers());
    }

    @Test
    public void testSignatures_erasedAndGeneric() {
        StringBuilder erasedSb = new StringBuilder();
        collectionLikeType.getErasedSignature(erasedSb);
        Assert.assertEquals("Ljava/util/ArrayList;", erasedSb.toString());

        StringBuilder genericSb = new StringBuilder();
        collectionLikeType.getGenericSignature(genericSb);
        Assert.assertEquals("Ljava/util/ArrayList<Ljava/lang/String;>;", genericSb.toString());
    }

    @Test
    public void testBuildCanonicalName_returnsCanonicalRepresentation() {
        String canonical = collectionLikeType.toCanonical();
        Assert.assertEquals("java.util.ArrayList<java.lang.String>", canonical);
    }

    @Test
    public void testIsTrueCollectionType_collectionVsNonCollectionClass() {
        // ArrayList implements java.util.Collection -> true
        Assert.assertTrue(collectionLikeType.isTrueCollectionType());

        // String does not implement java.util.Collection -> false
        CollectionLikeType nonCollection = CollectionLikeType.construct(String.class, stringType);
        Assert.assertFalse(nonCollection.isTrueCollectionType());
    }

    @Test
    public void testEqualsAndToString() {
        // Same instance
        Assert.assertEquals(collectionLikeType, collectionLikeType);

        // Null comparison
        Assert.assertFalse(collectionLikeType.equals(null));

        // Different class comparison
        Assert.assertFalse(collectionLikeType.equals("NotAJavaType"));

        // Same class and elementType
        CollectionLikeType same = CollectionLikeType.construct(
                ArrayList.class,
                TypeBindings.create(ArrayList.class, stringType),
                SimpleType.constructUnsafe(Object.class),
                new JavaType[0],
                stringType
        );
        Assert.assertEquals(collectionLikeType, same);
        Assert.assertEquals(collectionLikeType.hashCode(), same.hashCode());

        // Different rawClass
        CollectionLikeType diffClass = CollectionLikeType.construct(
                List.class,
                TypeBindings.create(List.class, stringType),
                SimpleType.constructUnsafe(Object.class),
                new JavaType[0],
                stringType
        );
        Assert.assertNotEquals(collectionLikeType, diffClass);

        // Different elementType
        CollectionLikeType diffElem = CollectionLikeType.construct(
                ArrayList.class,
                TypeBindings.create(ArrayList.class, intType),
                SimpleType.constructUnsafe(Object.class),
                new JavaType[0],
                intType
        );
        Assert.assertNotEquals(collectionLikeType, diffElem);

        // toString validation
        String str = collectionLikeType.toString();
        Assert.assertTrue(str.contains("collection-like type"));
        Assert.assertTrue(str.contains("class java.util.ArrayList"));
        Assert.assertTrue(str.contains("contains [simple type, class java.lang.String]"));
    }
}
