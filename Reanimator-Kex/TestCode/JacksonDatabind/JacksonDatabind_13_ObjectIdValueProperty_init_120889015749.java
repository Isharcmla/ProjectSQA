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

public class ObjectIdValueProperty_init_120889015749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19364;
     Object term20074;
     Object term20094;
     Object term20103;
     Object term20104;

    public ObjectIdValueProperty_init_120889015749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term18702 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term18794 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term18886 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term18978 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term19078 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term19728 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        setIntField(term18702, term18702.getClass(), "_propertyIndex", 0);
        setField(term18702, term18702.getClass(), "_propName", term18794);
        setField(term18702, term18702.getClass(), "_type", term18886);
        setField(term18702, term18702.getClass(), "_wrapperName", term18978);
        setField(term18702, term18702.getClass(), "_metadata", term19078);
        setField(term18702, term18702.getClass(), "_contextAnnotations", term19728);
        setField(term18702, term18702.getClass(), "_valueTypeDeserializer", null);
        setField(term18702, term18702.getClass(), "_managedReferenceName", "");
        term19364 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term19456 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term19570 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term19670 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term19870 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        setField(term19364, term19364.getClass(), "_propName", term19456);
        setField(term19364, term19364.getClass(), "_type", term19570);
        setField(term19364, term19364.getClass(), "_wrapperName", null);
        setField(term19364, term19364.getClass(), "_metadata", term19670);
        setField(term19364, term19364.getClass(), "_contextAnnotations", term19728);
        setField(term19364, term19364.getClass(), "_valueTypeDeserializer", term19870);
        setField(term19364, term19364.getClass(), "_managedReferenceName", "");
        setIntField(term19364, term19364.getClass(), "_propertyIndex", 0);
        term20074 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer"));
        term20094 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term20095 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term20096 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term20097 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term20098 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer"));
        Object term20099 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        Object term20100 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term20094, term20094.getClass(), "_objectIdReader", null);
        setField(term20095, term20095.getClass(), "_simpleName", null);
        setField(term20095, term20095.getClass(), "_namespace", null);
        setField(term20095, term20095.getClass(), "_encodedSimple", null);
        setField(term20094, term20094.getClass(), "_propName", term20095);
        setField(term20096, term20096.getClass(), "_elementType", null);
        setField(term20096, term20096.getClass(), "_canonicalName", null);
        setField(term20096, term20096.getClass(), "_class", null);
        setIntField(term20096, term20096.getClass(), "_hash", 0);
        setField(term20096, term20096.getClass(), "_valueHandler", null);
        setField(term20096, term20096.getClass(), "_typeHandler", null);
        setBooleanField(term20096, term20096.getClass(), "_asStatic", false);
        setField(term20094, term20094.getClass(), "_type", term20096);
        setField(term20094, term20094.getClass(), "_wrapperName", null);
        setField(term20097, term20097.getClass(), "_annotations", null);
        setField(term20094, term20094.getClass(), "_contextAnnotations", term20097);
        setField(term20098, term20098.getClass(), "_customFormat", null);
        setField(term20098, term20098.getClass(), "_formatString", null);
        setField(term20098, term20098.getClass(), "_valueClass", null);
        setField(term20094, term20094.getClass(), "_valueDeserializer", term20098);
        setField(term20099, term20099.getClass(), "_idResolver", null);
        setField(term20099, term20099.getClass(), "_baseType", null);
        setField(term20099, term20099.getClass(), "_property", null);
        setField(term20099, term20099.getClass(), "_defaultImpl", null);
        setField(term20099, term20099.getClass(), "_typePropertyName", null);
        setBooleanField(term20099, term20099.getClass(), "_typeIdVisible", false);
        setField(term20099, term20099.getClass(), "_deserializers", null);
        setField(term20099, term20099.getClass(), "_defaultImplDeserializer", null);
        setField(term20094, term20094.getClass(), "_valueTypeDeserializer", term20099);
        setField(term20094, term20094.getClass(), "_nullProvider", null);
        setField(term20100, term20100.getClass(), "_required", null);
        setField(term20100, term20100.getClass(), "_description", null);
        setField(term20100, term20100.getClass(), "_index", null);
        setField(term20100, term20100.getClass(), "_defaultValue", null);
        setField(term20094, term20094.getClass(), "_metadata", term20100);
        setField(term20094, term20094.getClass(), "_managedReferenceName", "");
        setField(term20094, term20094.getClass(), "_objectIdInfo", null);
        setField(term20094, term20094.getClass(), "_viewMatcher", null);
        setIntField(term20094, term20094.getClass(), "_propertyIndex", 0);
        term20103 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer"));
        setField(term20103, term20103.getClass(), "_customFormat", null);
        setField(term20103, term20103.getClass(), "_formatString", null);
        setField(term20103, term20103.getClass(), "_valueClass", null);
        term20104 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty"));
        Object term20105 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term20106 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term20107 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.AnnotationMap"));
        Object term20108 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer"));
        Object term20109 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        setField(term20104, term20104.getClass(), "_objectIdReader", null);
        setField(term20105, term20105.getClass(), "_simpleName", null);
        setField(term20105, term20105.getClass(), "_namespace", null);
        setField(term20105, term20105.getClass(), "_encodedSimple", null);
        setField(term20104, term20104.getClass(), "_propName", term20105);
        setField(term20106, term20106.getClass(), "_elementType", null);
        setField(term20106, term20106.getClass(), "_canonicalName", null);
        setField(term20106, term20106.getClass(), "_class", null);
        setIntField(term20106, term20106.getClass(), "_hash", 0);
        setField(term20106, term20106.getClass(), "_valueHandler", null);
        setField(term20106, term20106.getClass(), "_typeHandler", null);
        setBooleanField(term20106, term20106.getClass(), "_asStatic", false);
        setField(term20104, term20104.getClass(), "_type", term20106);
        setField(term20104, term20104.getClass(), "_wrapperName", null);
        setField(term20107, term20107.getClass(), "_annotations", null);
        setField(term20104, term20104.getClass(), "_contextAnnotations", term20107);
        setField(term20104, term20104.getClass(), "_valueDeserializer", null);
        setField(term20108, term20108.getClass(), "_idResolver", null);
        setField(term20108, term20108.getClass(), "_baseType", null);
        setField(term20108, term20108.getClass(), "_property", null);
        setField(term20108, term20108.getClass(), "_defaultImpl", null);
        setField(term20108, term20108.getClass(), "_typePropertyName", null);
        setBooleanField(term20108, term20108.getClass(), "_typeIdVisible", false);
        setField(term20108, term20108.getClass(), "_deserializers", null);
        setField(term20108, term20108.getClass(), "_defaultImplDeserializer", null);
        setField(term20104, term20104.getClass(), "_valueTypeDeserializer", term20108);
        setField(term20104, term20104.getClass(), "_nullProvider", null);
        setField(term20109, term20109.getClass(), "_required", null);
        setField(term20109, term20109.getClass(), "_description", null);
        setField(term20109, term20109.getClass(), "_index", null);
        setField(term20109, term20109.getClass(), "_defaultValue", null);
        setField(term20104, term20104.getClass(), "_metadata", term20109);
        setField(term20104, term20104.getClass(), "_managedReferenceName", "");
        setField(term20104, term20104.getClass(), "_objectIdInfo", null);
        setField(term20104, term20104.getClass(), "_viewMatcher", null);
        setIntField(term20104, term20104.getClass(), "_propertyIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        Object[] args = new Object[2];
        args[0] = term19364;
        args[1] = term20074;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term20094));
        assertTrue(recursiveEquals(term19364, term20103));
        assertTrue(recursiveEquals(term20074, term20104));
    }

};


