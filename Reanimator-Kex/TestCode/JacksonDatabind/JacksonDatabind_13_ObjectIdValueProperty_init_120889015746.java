package com.fasterxml.jackson.databind.deser.impl;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.deser.impl.EqualityUtils.*;
import java.lang.Object;

public class ObjectIdValueProperty_init_120889015746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11360;
     Object term12058;
     Object term13834;
     Object term13843;
     Object term13844;

    public ObjectIdValueProperty_init_120889015746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10676 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term10768 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term10882 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term10974 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term11074 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term11710 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setIntField(term10676, term10676.getClass(), "_propertyIndex", 0);
        setField(term10676, term10676.getClass(), "_propName", term10768);
        setField(term10676, term10676.getClass(), "_type", term10882);
        setField(term10676, term10676.getClass(), "_wrapperName", term10974);
        setField(term10676, term10676.getClass(), "_metadata", term11074);
        setField(term10676, term10676.getClass(), "_contextAnnotations", term11710);
        setField(term10676, term10676.getClass(), "_valueTypeDeserializer", null);
        setField(term10676, term10676.getClass(), "_managedReferenceName", "");
        term11360 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term11452 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term11552 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term11652 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term11852 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term11360, term11360.getClass(), "_propName", term11452);
        setField(term11360, term11360.getClass(), "_type", term11552);
        setField(term11360, term11360.getClass(), "_wrapperName", null);
        setField(term11360, term11360.getClass(), "_metadata", term11652);
        setField(term11360, term11360.getClass(), "_contextAnnotations", term11710);
        setField(term11360, term11360.getClass(), "_valueTypeDeserializer", term11852);
        setField(term11360, term11360.getClass(), "_managedReferenceName", "");
        setIntField(term11360, term11360.getClass(), "_propertyIndex", 0);
        term12058 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser"));
        term13834 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term13835 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term13836 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term13837 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term13838 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser"));
        Object term13839 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        Object term13840 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term13834, term13834.getClass(), "_objectIdReader", null);
        setField(term13835, term13835.getClass(), "_simpleName", null);
        setField(term13835, term13835.getClass(), "_namespace", null);
        setField(term13835, term13835.getClass(), "_encodedSimple", null);
        setField(term13834, term13834.getClass(), "_propName", term13835);
        setField(term13836, term13836.getClass(), "_keyType", null);
        setField(term13836, term13836.getClass(), "_valueType", null);
        setField(term13836, term13836.getClass(), "_canonicalName", null);
        setField(term13836, term13836.getClass(), "_class", null);
        setIntField(term13836, term13836.getClass(), "_hash", 0);
        setField(term13836, term13836.getClass(), "_valueHandler", null);
        setField(term13836, term13836.getClass(), "_typeHandler", null);
        setBooleanField(term13836, term13836.getClass(), "_asStatic", false);
        setField(term13834, term13834.getClass(), "_type", term13836);
        setField(term13834, term13834.getClass(), "_wrapperName", null);
        setField(term13837, term13837.getClass(), "_annotations", null);
        setField(term13834, term13834.getClass(), "_contextAnnotations", term13837);
        setField(term13838, term13838.getClass(), "_valueClass", null);
        setField(term13834, term13834.getClass(), "_valueDeserializer", term13838);
        setField(term13839, term13839.getClass(), "_idResolver", null);
        setField(term13839, term13839.getClass(), "_baseType", null);
        setField(term13839, term13839.getClass(), "_property", null);
        setField(term13839, term13839.getClass(), "_defaultImpl", null);
        setField(term13839, term13839.getClass(), "_typePropertyName", null);
        setBooleanField(term13839, term13839.getClass(), "_typeIdVisible", false);
        setField(term13839, term13839.getClass(), "_deserializers", null);
        setField(term13839, term13839.getClass(), "_defaultImplDeserializer", null);
        setField(term13834, term13834.getClass(), "_valueTypeDeserializer", term13839);
        setField(term13834, term13834.getClass(), "_nullProvider", null);
        setField(term13840, term13840.getClass(), "_required", null);
        setField(term13840, term13840.getClass(), "_description", null);
        setField(term13840, term13840.getClass(), "_index", null);
        setField(term13840, term13840.getClass(), "_defaultValue", null);
        setField(term13834, term13834.getClass(), "_metadata", term13840);
        setField(term13834, term13834.getClass(), "_managedReferenceName", "");
        setField(term13834, term13834.getClass(), "_objectIdInfo", null);
        setField(term13834, term13834.getClass(), "_viewMatcher", null);
        setIntField(term13834, term13834.getClass(), "_propertyIndex", 0);
        term13843 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$BooleanDeser"));
        setField(term13843, term13843.getClass(), "_valueClass", null);
        term13844 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term13845 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term13846 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term13847 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term13848 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        Object term13849 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term13844, term13844.getClass(), "_objectIdReader", null);
        setField(term13845, term13845.getClass(), "_simpleName", null);
        setField(term13845, term13845.getClass(), "_namespace", null);
        setField(term13845, term13845.getClass(), "_encodedSimple", null);
        setField(term13844, term13844.getClass(), "_propName", term13845);
        setField(term13846, term13846.getClass(), "_keyType", null);
        setField(term13846, term13846.getClass(), "_valueType", null);
        setField(term13846, term13846.getClass(), "_canonicalName", null);
        setField(term13846, term13846.getClass(), "_class", null);
        setIntField(term13846, term13846.getClass(), "_hash", 0);
        setField(term13846, term13846.getClass(), "_valueHandler", null);
        setField(term13846, term13846.getClass(), "_typeHandler", null);
        setBooleanField(term13846, term13846.getClass(), "_asStatic", false);
        setField(term13844, term13844.getClass(), "_type", term13846);
        setField(term13844, term13844.getClass(), "_wrapperName", null);
        setField(term13847, term13847.getClass(), "_annotations", null);
        setField(term13844, term13844.getClass(), "_contextAnnotations", term13847);
        setField(term13844, term13844.getClass(), "_valueDeserializer", null);
        setField(term13848, term13848.getClass(), "_idResolver", null);
        setField(term13848, term13848.getClass(), "_baseType", null);
        setField(term13848, term13848.getClass(), "_property", null);
        setField(term13848, term13848.getClass(), "_defaultImpl", null);
        setField(term13848, term13848.getClass(), "_typePropertyName", null);
        setBooleanField(term13848, term13848.getClass(), "_typeIdVisible", false);
        setField(term13848, term13848.getClass(), "_deserializers", null);
        setField(term13848, term13848.getClass(), "_defaultImplDeserializer", null);
        setField(term13844, term13844.getClass(), "_valueTypeDeserializer", term13848);
        setField(term13844, term13844.getClass(), "_nullProvider", null);
        setField(term13849, term13849.getClass(), "_required", null);
        setField(term13849, term13849.getClass(), "_description", null);
        setField(term13849, term13849.getClass(), "_index", null);
        setField(term13849, term13849.getClass(), "_defaultValue", null);
        setField(term13844, term13844.getClass(), "_metadata", term13849);
        setField(term13844, term13844.getClass(), "_managedReferenceName", "");
        setField(term13844, term13844.getClass(), "_objectIdInfo", null);
        setField(term13844, term13844.getClass(), "_viewMatcher", null);
        setIntField(term13844, term13844.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term11360;
        args[1] = term12058;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term13834));
        assertTrue(recursiveEquals(term11360, term13843));
        assertTrue(recursiveEquals(term12058, term13844));
    }

};


