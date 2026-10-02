package com.fasterxml.jackson.databind.jsontype.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

public class StdTypeResolverBuilderTest {

    private ObjectMapper mapper;
    private SerializationConfig serConfig;
    private DeserializationConfig deserConfig;
    private JavaType baseType;
    private JavaType numberBaseType;

    @Before
    public void setUp() {
        mapper = new ObjectMapper();
        serConfig = mapper.getSerializationConfig();
        deserConfig = mapper.getDeserializationConfig();
        baseType = mapper.constructType(Object.class);
        numberBaseType = mapper.constructType(Number.class);
    }

    @Test
    public void testNoTypeInfoBuilder_valid_createsNoneResolver() {
        StdTypeResolverBuilder builder = StdTypeResolverBuilder.noTypeInfoBuilder();
        Assert.assertNotNull(builder);
        Assert.assertNull(builder.getDefaultImpl());
        Assert.assertFalse(builder.isTypeIdVisible());

        TypeSerializer ser = builder.buildTypeSerializer(serConfig, baseType, null);
        Assert.assertNull(ser);

        TypeDeserializer deser = builder.buildTypeDeserializer(deserConfig, baseType, null);
        Assert.assertNull(deser);
    }

    @Test
    public void testInit_nullIdType_throwsIllegalArgumentException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        try {
            builder.init(null, null);
            Assert.fail("Expected IllegalArgumentException when idType is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("idType can not be null", e.getMessage());
        }
    }

    @Test
    public void testInit_validIdType_initializesDefaultPropertyName() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);
        Assert.assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test
    public void testInclusion_nullInclusion_throwsIllegalArgumentException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        try {
            builder.inclusion(null);
            Assert.fail("Expected IllegalArgumentException when inclusion is null");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("includeAs can not be null", e.getMessage());
        }
    }

    @Test
    public void testTypeProperty_nullOrEmpty_restoresDefaultPropertyName() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);

        builder.typeProperty("customProp");
        Assert.assertEquals("customProp", builder.getTypeProperty());

        builder.typeProperty(null);
        Assert.assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());

        builder.typeProperty("");
        Assert.assertEquals(JsonTypeInfo.Id.CLASS.getDefaultPropertyName(), builder.getTypeProperty());
    }

    @Test
    public void testTypeIdVisibilityAndDefaultImplAccessors() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        Assert.assertFalse(builder.isTypeIdVisible());
        Assert.assertNull(builder.getDefaultImpl());

        builder.typeIdVisibility(true);
        Assert.assertTrue(builder.isTypeIdVisible());

        builder.defaultImpl(Integer.class);
        Assert.assertEquals(Integer.class, builder.getDefaultImpl());
    }

    @Test
    public void testBuildTypeSerializer_idTypeNone_returnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.NONE, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);

        TypeSerializer ser = builder.buildTypeSerializer(serConfig, baseType, null);
        Assert.assertNull(ser);
    }

    @Test
    public void testBuildTypeSerializer_allInclusions() {
        JsonTypeInfo.As[] inclusions = new JsonTypeInfo.As[] {
            JsonTypeInfo.As.WRAPPER_ARRAY,
            JsonTypeInfo.As.PROPERTY,
            JsonTypeInfo.As.WRAPPER_OBJECT,
            JsonTypeInfo.As.EXTERNAL_PROPERTY,
            JsonTypeInfo.As.EXISTING_PROPERTY
        };

        Class<?>[] expectedSerializerClasses = new Class<?>[] {
            AsArrayTypeSerializer.class,
            AsPropertyTypeSerializer.class,
            AsWrapperTypeSerializer.class,
            AsExternalTypeSerializer.class,
            AsExistingPropertyTypeSerializer.class
        };

        for (int i = 0; i < inclusions.length; i++) {
            StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
            builder.init(JsonTypeInfo.Id.CLASS, null);
            builder.inclusion(inclusions[i]);
            builder.typeProperty("@type");

            TypeSerializer serializer = builder.buildTypeSerializer(serConfig, baseType, null);
            Assert.assertNotNull(serializer);
            Assert.assertEquals(expectedSerializerClasses[i], serializer.getClass());
        }
    }

    @Test
    public void testBuildTypeSerializer_missingInclusion_throwsIllegalStateException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);

        try {
            builder.buildTypeSerializer(serConfig, baseType, null);
            Assert.fail("Expected IllegalStateException when inclusion is not set");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Do not know how to construct standard type serializer"));
        }
    }

    @Test
    public void testBuildTypeDeserializer_idTypeNone_returnsNull() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.NONE, null);
        builder.inclusion(JsonTypeInfo.As.PROPERTY);

        TypeDeserializer deser = builder.buildTypeDeserializer(deserConfig, baseType, null);
        Assert.assertNull(deser);
    }

    @Test
    public void testBuildTypeDeserializer_allInclusions() {
        JsonTypeInfo.As[] inclusions = new JsonTypeInfo.As[] {
            JsonTypeInfo.As.WRAPPER_ARRAY,
            JsonTypeInfo.As.PROPERTY,
            JsonTypeInfo.As.EXISTING_PROPERTY,
            JsonTypeInfo.As.WRAPPER_OBJECT,
            JsonTypeInfo.As.EXTERNAL_PROPERTY
        };

        Class<?>[] expectedDeserializerClasses = new Class<?>[] {
            AsArrayTypeDeserializer.class,
            AsPropertyTypeDeserializer.class,
            AsPropertyTypeDeserializer.class,
            AsWrapperTypeDeserializer.class,
            AsExternalTypeDeserializer.class
        };

        for (int i = 0; i < inclusions.length; i++) {
            StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
            builder.init(JsonTypeInfo.Id.CLASS, null);
            builder.inclusion(inclusions[i]);
            builder.typeProperty("@type");
            builder.typeIdVisibility(true);

            TypeDeserializer deserializer = builder.buildTypeDeserializer(deserConfig, baseType, null);
            Assert.assertNotNull(deserConfig);
            Assert.assertNotNull(deserializer);
            Assert.assertEquals(expectedDeserializerClasses[i], deserializer.getClass());
        }
    }

    @Test
    public void testBuildTypeDeserializer_missingInclusion_throwsIllegalStateException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        builder.init(JsonTypeInfo.Id.CLASS, null);

        try {
            builder.buildTypeDeserializer(deserConfig, baseType, null);
            Assert.fail("Expected IllegalStateException when inclusion is not set");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Do not know how to construct standard type deserializer"));
        }
    }

    @Test
    public void testBuildTypeDeserializer_defaultImplHandling() {
        StdTypeResolverBuilder builder1 = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.PROPERTY)
                .defaultImpl(Void.class);
        TypeDeserializer deser1 = builder1.buildTypeDeserializer(deserConfig, baseType, null);
        Assert.assertNotNull(deser1);
        Assert.assertEquals(Void.class, deser1.getDefaultImpl());

        StdTypeResolverBuilder builder2 = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.PROPERTY)
                .defaultImpl(NoClass.class);
        TypeDeserializer deser2 = builder2.buildTypeDeserializer(deserConfig, baseType, null);
        Assert.assertNotNull(deser2);
        Assert.assertEquals(NoClass.class, deser2.getDefaultImpl());

        StdTypeResolverBuilder builder3 = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CLASS, null)
                .inclusion(JsonTypeInfo.As.PROPERTY)
                .defaultImpl(Integer.class);
        TypeDeserializer deser3 = builder3.buildTypeDeserializer(deserConfig, numberBaseType, null);
        Assert.assertNotNull(deser3);
        Assert.assertEquals(Integer.class, deser3.getDefaultImpl());
    }

    @Test
    public void testIdResolver_customResolver() {
        TypeIdResolver customResolver = new ClassNameIdResolver(baseType, mapper.getTypeFactory());
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder()
                .init(JsonTypeInfo.Id.CUSTOM, customResolver)
                .inclusion(JsonTypeInfo.As.PROPERTY);

        TypeIdResolver resolved = builder.idResolver(serConfig, baseType, null, true, false);
        Assert.assertSame(customResolver, resolved);
    }

    @Test
    public void testIdResolver_uninitialized_throwsIllegalStateException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder();
        try {
            builder.idResolver(serConfig, baseType, null, true, false);
            Assert.fail("Expected IllegalStateException when idType is null");
        } catch (IllegalStateException e) {
            Assert.assertEquals("Can not build, 'init()' not yet called", e.getMessage());
        }
    }

    @Test
    public void testIdResolver_allStandardIdTypes() {
        Collection<NamedType> subtypes = new ArrayList<NamedType>();
        subtypes.add(new NamedType(Integer.class, "int"));

        StdTypeResolverBuilder builderClass = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CLASS, null);
        TypeIdResolver resClass = builderClass.idResolver(serConfig, baseType, subtypes, true, false);
        Assert.assertTrue(resClass instanceof ClassNameIdResolver);

        StdTypeResolverBuilder builderMinClass = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.MINIMAL_CLASS, null);
        TypeIdResolver resMinClass = builderMinClass.idResolver(serConfig, baseType, subtypes, true, false);
        Assert.assertTrue(resMinClass instanceof MinimalClassNameIdResolver);

        StdTypeResolverBuilder builderName = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NAME, null);
        TypeIdResolver resName = builderName.idResolver(serConfig, baseType, subtypes, true, false);
        Assert.assertTrue(resName instanceof TypeNameIdResolver);

        StdTypeResolverBuilder builderNone = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NONE, null);
        TypeIdResolver resNone = builderNone.idResolver(serConfig, baseType, subtypes, true, false);
        Assert.assertNull(resNone);
    }

    @Test
    public void testIdResolver_customWithoutResolver_throwsIllegalStateException() {
        StdTypeResolverBuilder builder = new StdTypeResolverBuilder().init(JsonTypeInfo.Id.CUSTOM, null);
        try {
            builder.idResolver(serConfig, baseType, null, true, false);
            Assert.fail("Expected IllegalStateException for Id.CUSTOM without custom resolver");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("Do not know how to construct standard type id resolver"));
        }
    }
}
