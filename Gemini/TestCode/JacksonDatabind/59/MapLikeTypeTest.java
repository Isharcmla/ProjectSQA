package com.fasterxml.jackson.databind.type;

import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.JavaType;

public class MapLikeTypeTest {

    private JavaType stringType;
    private JavaType intType;
    private JavaType longType;
    private MapLikeType mapLikeType;

    @Before
    public void setUp() {
        stringType = SimpleType.constructUnsafe(String.class);
        intType = SimpleType.constructUnsafe(Integer.class);
        longType = SimpleType.constructUnsafe(Long.class);
        mapLikeType = MapLikeType.construct(Map.class, stringType, intType);
    }

    @Test
    public void testConstruct_twoTypeParameters_createsMapLikeType() {
        MapLikeType type = MapLikeType.construct(Map.class, stringType, intType);
        Assert.assertNotNull(type);
        Assert.assertEquals(Map.class, type.getRawClass());
        Assert.assertEquals(stringType, type.getKeyType());
        Assert.assertEquals(intType, type.getContentType());
        Assert.assertEquals(2, type.getBindings().size());
    }

    @Test
    public void testConstruct_nonTwoTypeParameters_createsMapLikeTypeWithEmptyBindings() {
        MapLikeType type = MapLikeType.construct(String.class, stringType, intType);
        Assert.assertNotNull(type);
        Assert.assertEquals(String.class, type.getRawClass());
        Assert.assertTrue(type.getBindings().isEmpty());
    }

    @Test
    public void testUpgradeFrom_validTypeBase_returnsMapLikeType() {
        JavaType baseType = SimpleType.constructUnsafe(HashMap.class);
        MapLikeType upgraded = MapLikeType.upgradeFrom(baseType, stringType, intType);

        Assert.assertNotNull(upgraded);
        Assert.assertEquals(HashMap.class, upgraded.getRawClass());
        Assert.assertEquals(stringType, upgraded.getKeyType());
        Assert.assertEquals(intType, upgraded.getContentType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpgradeFrom_nonTypeBase_throwsIllegalArgumentException() {
        JavaType nonTypeBase = new CustomNonTypeBaseJavaType(Map.class);
        MapLikeType.upgradeFrom(nonTypeBase, stringType, intType);
    }

    @Test
    public void testNarrow_validSubclass_returnsNarrowedType() {
        JavaType narrowed = mapLikeType._narrow(HashMap.class);
        Assert.assertNotNull(narrowed);
        Assert.assertEquals(HashMap.class, narrowed.getRawClass());
        Assert.assertEquals(stringType, ((MapLikeType) narrowed).getKeyType());
        Assert.assertEquals(intType, narrowed.getContentType());
    }

    @Test
    public void testWithKeyType_sameKeyType_returnsSameInstance() {
        MapLikeType same = mapLikeType.withKeyType(stringType);
        Assert.assertSame(mapLikeType, same);
    }

    @Test
    public void testWithKeyType_differentKeyType_returnsNewInstance() {
        MapLikeType modified = mapLikeType.withKeyType(longType);
        Assert.assertNotSame(mapLikeType, modified);
        Assert.assertEquals(longType, modified.getKeyType());
        Assert.assertEquals(intType, modified.getContentType());
    }

    @Test
    public void testWithContentType_sameContentType_returnsSameInstance() {
        JavaType same = mapLikeType.withContentType(intType);
        Assert.assertSame(mapLikeType, same);
    }

    @Test
    public void testWithContentType_differentContentType_returnsNewInstance() {
        JavaType modified = mapLikeType.withContentType(longType);
        Assert.assertNotSame(mapLikeType, modified);
        Assert.assertEquals(longType, modified.getContentType());
        Assert.assertEquals(stringType, ((MapLikeType) modified).getKeyType());
    }

    @Test
    public void testWithTypeHandler_and_withValueHandler() {
        Object typeHandler = "myTypeHandler";
        Object valHandler = "myValueHandler";

        MapLikeType withTH = mapLikeType.withTypeHandler(typeHandler);
        Assert.assertEquals(typeHandler, withTH.getTypeHandler());
        Assert.assertNull(mapLikeType.getTypeHandler());

        MapLikeType withVH = mapLikeType.withValueHandler(valHandler);
        Assert.assertEquals(valHandler, withVH.getValueHandler());
        Assert.assertNull(mapLikeType.getValueHandler());
    }

    @Test
    public void testWithContentTypeHandler_and_withContentValueHandler() {
        Object typeHandler = "contentTypeHandler";
        Object valHandler = "contentValueHandler";

        MapLikeType withCTH = mapLikeType.withContentTypeHandler(typeHandler);
        Assert.assertEquals(typeHandler, withCTH.getContentTypeHandler());
        Assert.assertNull(mapLikeType.getContentTypeHandler());

        MapLikeType withCVH = mapLikeType.withContentValueHandler(valHandler);
        Assert.assertEquals(valHandler, withCVH.getContentValueHandler());
        Assert.assertNull(mapLikeType.getContentValueHandler());
    }

    @Test
    public void testWithKeyTypeHandler_and_withKeyValueHandler() {
        Object typeHandler = "keyTypeHandler";
        Object valHandler = "keyValueHandler";

        MapLikeType withKTH = mapLikeType.withKeyTypeHandler(typeHandler);
        Assert.assertEquals(typeHandler, withKTH.getKeyType().getTypeHandler());

        MapLikeType withKVH = mapLikeType.withKeyValueHandler(valHandler);
        Assert.assertEquals(valHandler, withKVH.getKeyType().getValueHandler());
    }

    @Test
    public void testWithStaticTyping_fromNonStatic_returnsStaticInstance() {
        Assert.assertFalse(mapLikeType.useStaticType());
        MapLikeType staticType = mapLikeType.withStaticTyping();
        Assert.assertTrue(staticType.useStaticType());
        Assert.assertTrue(staticType.getContentType().useStaticType());

        // Calling on already static instance should return itself
        MapLikeType same = staticType.withStaticTyping();
        Assert.assertSame(staticType, same);
    }

    @Test
    public void testRefine_updatesFields() {
        TypeBindings bindings = TypeBindings.create(HashMap.class, new JavaType[] { longType, stringType });
        JavaType superClass = SimpleType.constructUnsafe(Object.class);
        JavaType[] superInterfaces = new JavaType[] { SimpleType.constructUnsafe(Cloneable.class) };

        JavaType refined = mapLikeType.refine(HashMap.class, bindings, superClass, superInterfaces);

        Assert.assertNotNull(refined);
        Assert.assertEquals(HashMap.class, refined.getRawClass());
        Assert.assertEquals(bindings, refined.getBindings());
        Assert.assertEquals(superClass, refined.getSuperClass());
        Assert.assertEquals(1, refined.getInterfaces().size());
        Assert.assertEquals(Cloneable.class, refined.getInterfaces().get(0).getRawClass());
    }

    @Test
    public void testBuildCanonicalName_returnsExpectedString() {
        String canonical = mapLikeType.toCanonical();
        Assert.assertEquals("java.util.Map<java.lang.String,java.lang.Integer>", canonical);
    }

    @Test
    public void testIsContainerType_returnsTrue() {
        Assert.assertTrue(mapLikeType.isContainerType());
    }

    @Test
    public void testIsMapLikeType_returnsTrue() {
        Assert.assertTrue(mapLikeType.isMapLikeType());
    }

    @Test
    public void testIsTrueMapType_trueForMap_falseForNonMap() {
        Assert.assertTrue(mapLikeType.isTrueMapType());

        MapLikeType nonMap = MapLikeType.construct(String.class, stringType, intType);
        Assert.assertFalse(nonMap.isTrueMapType());
    }

    @Test
    public void testHasHandlers_variousCombinations() {
        Assert.assertFalse(mapLikeType.hasHandlers());

        // Type handler on root
        MapLikeType withTH = mapLikeType.withTypeHandler("handler");
        Assert.assertTrue(withTH.hasHandlers());

        // Value handler on root
        MapLikeType withVH = mapLikeType.withValueHandler("handler");
        Assert.assertTrue(withVH.hasHandlers());

        // Handler on key
        MapLikeType withKH = mapLikeType.withKeyTypeHandler("handler");
        Assert.assertTrue(withKH.hasHandlers());

        // Handler on value
        MapLikeType withCH = mapLikeType.withContentTypeHandler("handler");
        Assert.assertTrue(withCH.hasHandlers());
    }

    @Test
    public void testGetErasedSignature_and_getGenericSignature() {
        StringBuilder sbErased = new StringBuilder();
        StringBuilder resErased = mapLikeType.getErasedSignature(sbErased);
        Assert.assertEquals("Ljava/util/Map;", resErased.toString());

        StringBuilder sbGeneric = new StringBuilder();
        StringBuilder resGeneric = mapLikeType.getGenericSignature(sbGeneric);
        Assert.assertEquals("Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;", resGeneric.toString());
    }

    @Test
    public void testToString() {
        String str = mapLikeType.toString();
        Assert.assertTrue(str.contains("[map-like type; class java.util.Map"));
        Assert.assertTrue(str.contains("java.lang.String"));
        Assert.assertTrue(str.contains("java.lang.Integer"));
    }

    @Test
    public void testEquals() {
        // Reflexive
        Assert.assertTrue(mapLikeType.equals(mapLikeType));

        // Null check
        Assert.assertFalse(mapLikeType.equals(null));

        // Different type
        Assert.assertFalse(mapLikeType.equals("Not A Type"));

        // Equal instance
        MapLikeType same = MapLikeType.construct(Map.class, stringType, intType);
        Assert.assertTrue(mapLikeType.equals(same));

        // Different class
        MapLikeType diffClass = MapLikeType.construct(HashMap.class, stringType, intType);
        Assert.assertFalse(mapLikeType.equals(diffClass));

        // Different key type
        MapLikeType diffKey = MapLikeType.construct(Map.class, longType, intType);
        Assert.assertFalse(mapLikeType.equals(diffKey));

        // Different value type
        MapLikeType diffVal = MapLikeType.construct(Map.class, stringType, longType);
        Assert.assertFalse(mapLikeType.equals(diffVal));
    }

    /**
     * Dummy JavaType extending JavaType directly (not extending TypeBase)
     * to test upgradeFrom failure branch.
     */
    private static class CustomNonTypeBaseJavaType extends JavaType {
        private static final long serialVersionUID = 1L;

        protected CustomNonTypeBaseJavaType(Class<?> raw) {
            super(raw, 0, null, null, false);
        }

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
        public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) {
            return this;
        }

        @Override
        public boolean isContainerType() { return false; }

        @Override
        public StringBuilder getErasedSignature(StringBuilder sb) { return sb; }

        @Override
        public StringBuilder getGenericSignature(StringBuilder sb) { return sb; }

        @Override
        public String toString() { return "[CustomNonTypeBaseJavaType]"; }

        @Override
        public boolean equals(Object o) { return o == this; }
    }
}
