package com.fasterxml.jackson.databind.jsontype.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class StdTypeResolverBuilderTest {

    private ObjectMapper mapper;
    private SerializationConfig serConfig;
    private DeserializationConfig deserConfig;
    private JavaType baseType;
    private Collection<NamedType> subtypes;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        serConfig = mapper.getSerializationConfig();
        deserConfig = mapper.getDeserializationConfig();
        baseType = mapper.constructType(Object.class);
        subtypes = new ArrayList<NamedType>();
    }

    // ---- init() ----

    @Test
    public void testInit_normalIdType_setsFieldsCorrectly() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        StdTypeResolverBuilder result = builder.init(JsonTypeInfo.Id.CLASS, null);
        assertSame(builder, result);
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInit_nullIdType_throwsException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(null, null);
    }

    // ---- noTypeInfoBuilder() ----

    @Test
    public void testNoTypeInfoBuilder_createsBuilderWithNoneIdType() {
        StdTypeResolverBuilder builder = StdTypeResolverBuilder.noTypeInfoBuilder();
        assertNotNull(builder);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNull(ts);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNull(td);
    }

    // ---- buildTypeSerializer() ----

    @Test
    public void testBuildTypeSerializer_idTypeNone_returnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.NONE, null);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNull(ts);
    }

    @Test
    public void testBuildTypeSerializer_wrapperArray_returnsAsArrayTypeSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.WRAPPER_ARRAY);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsArrayTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_property_returnsAsPropertyTypeSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsPropertyTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_wrapperObject_returnsAsWrapperTypeSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.WRAPPER_OBJECT);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsWrapperTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_externalProperty_returnsAsExternalTypeSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.EXTERNAL_PROPERTY);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsExternalTypeSerializer);
    }

    @Test
    public void testBuildTypeSerializer_existingProperty_returnsAsExistingPropertyTypeSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.EXISTING_PROPERTY);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
        assertTrue(ts instanceof AsExistingPropertyTypeSerializer);
    }

    @Test(expected = NullPointerException.class)
    public void testBuildTypeSerializer_includeAsNotSet_throwsException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        // _includeAs not set -> null -> switch on null enum throws NPE
        builder.buildTypeSerializer(serConfig, baseType, subtypes);
    }

    @Test
    public void testBuildTypeSerializer_idTypeMinimalClass_buildsSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.MINIMAL_CLASS, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
    }

    @Test
    public void testBuildTypeSerializer_idTypeName_buildsSerializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.NAME, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeSerializer ts = builder.buildTypeSerializer(serConfig, baseType, subtypes);
        assertNotNull(ts);
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildTypeSerializer_idTypeCustomWithoutResolver_throwsException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CUSTOM, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        builder.buildTypeSerializer(serConfig, baseType, subtypes);
    }

    // ---- buildTypeDeserializer() ----

    @Test
    public void testBuildTypeDeserializer_idTypeNone_returnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.NONE, null);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNull(td);
    }

    @Test
    public void testBuildTypeDeserializer_wrapperArray_returnsAsArrayTypeDeserializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.WRAPPER_ARRAY);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsArrayTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_property_returnsAsPropertyTypeDeserializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsPropertyTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_existingProperty_returnsAsPropertyTypeDeserializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.EXISTING_PROPERTY);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsPropertyTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_wrapperObject_returnsAsWrapperTypeDeserializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.WRAPPER_OBJECT);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsWrapperTypeDeserializer);
    }

    @Test
    public void testBuildTypeDeserializer_externalProperty_returnsAsExternalTypeDeserializer() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.EXTERNAL_PROPERTY);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
        assertTrue(td instanceof AsExternalTypeDeserializer);
    }

    @Test(expected = NullPointerException.class)
    public void testBuildTypeDeserializer_includeAsNotSet_throwsException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
    }

    @Test
    public void testBuildTypeDeserializer_withDefaultImplVoidClass_buildsSuccessfully() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        builder.defaultImpl(Void.class);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
    }

    @Test
    public void testBuildTypeDeserializer_withDefaultImplNoClass_buildsSuccessfully() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        builder.defaultImpl(com.fasterxml.jackson.databind.annotation.NoClass.class);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
    }

    @Test
    public void testBuildTypeDeserializer_withDefaultImplNormalClass_buildsSuccessfully() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        builder.defaultImpl(Object.class);
        TypeDeserializer td = builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
        assertNotNull(td);
    }

    @Test(expected = IllegalStateException.class)
    public void testBuildTypeDeserializer_idTypeCustomWithoutResolver_throwsException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CUSTOM, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);
        builder.buildTypeDeserializer(deserConfig, baseType, subtypes);
    }

    // ---- inclusion() ----

    @Test
    public void testInclusion_validValue_setsIncludeAs() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        StdTypeResolverBuilder result = builder.inclusion(JsonTypeInfo.As.PROPERTY);
        assertSame(builder, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInclusion_null_throwsException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.inclusion(null);
    }

    // ---- typeProperty() ----

    @Test
    public void testTypeProperty_validName_setsProperty() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.typeProperty("myType");
        assertEquals("myType", builder.getTypeProperty());
    }

    @Test
    public void testTypeProperty_null_restoresDefault() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.typeProperty(null);
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test
    public void testTypeProperty_emptyString_restoresDefault() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        builder.typeProperty("");
        assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    // ---- defaultImpl() ----

    @Test
    public void testDefaultImpl_setsAndReturnsCorrectly() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.defaultImpl(String.class);
        assertEquals(String.class, builder.getDefaultImpl());
    }

    @Test
    public void testDefaultImpl_null_setsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.defaultImpl(null);
        assertNull(builder.getDefaultImpl());
    }

    // ---- typeIdVisibility() ----

    @Test
    public void testTypeIdVisibility_true_setsVisibleTrue() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.typeIdVisibility(true);
        assertTrue(builder.isTypeIdVisible());
    }

    @Test
    public void testTypeIdVisibility_false_setsVisibleFalse() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.typeIdVisibility(false);
        assertFalse(builder.isTypeIdVisible());
    }

    // ---- getDefaultImpl(), getTypeProperty(), isTypeIdVisible() ----

    @Test
    public void testGetDefaultImpl_notSet_returnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        assertNull(builder.getDefaultImpl());
    }

    @Test
    public void testGetTypeProperty_notSet_returnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        assertNull(builder.getTypeProperty());
    }

    @Test
    public void testIsTypeIdVisible_defaultValue_returnsFalse() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        assertFalse(builder.isTypeIdVisible());
    }
}
