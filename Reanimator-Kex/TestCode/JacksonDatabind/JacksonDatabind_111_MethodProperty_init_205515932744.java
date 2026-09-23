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

public class MethodProperty_init_205515932744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9057;
     Object term9325;
     Object term9977;
     Object term9980;
     Object term9982;

    public MethodProperty_init_205515932744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8497 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term8597 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyMetadata"));
        Object term8701 = newInstance(Class.forName("com.fasterxml.jackson.annotation.JsonFormat$Value"));
        Object term8793 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term8939 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StackTraceElementDeserializer"));
        setField(term8497, term8497.getClass(), "_metadata", term8597);
        setField(term8497, term8497.getClass(), "_propertyFormat", term8701);
        setIntField(term8497, term8497.getClass(), "_propertyIndex", 0);
        setField(term8497, term8497.getClass(), "_propName", term8793);
        setField(term8497, term8497.getClass(), "_type", null);
        setField(term8497, term8497.getClass(), "_wrapperName", null);
        setField(term8497, term8497.getClass(), "_contextAnnotations", null);
        setField(term8497, term8497.getClass(), "_valueTypeDeserializer", null);
        setField(term8497, term8497.getClass(), "_managedReferenceName", null);
        setField(term8497, term8497.getClass(), "_valueDeserializer", term8939);
        setField(term8497, term8497.getClass(), "_viewMatcher", null);
        term9057 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term9163 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term9057, term9057.getClass(), "_metadata", null);
        setField(term9057, term9057.getClass(), "_propertyFormat", null);
        setField(term9057, term9057.getClass(), "_propName", null);
        setField(term9057, term9057.getClass(), "_type", term9163);
        setField(term9057, term9057.getClass(), "_wrapperName", null);
        setField(term9057, term9057.getClass(), "_contextAnnotations", null);
        setField(term9057, term9057.getClass(), "_valueTypeDeserializer", null);
        setField(term9057, term9057.getClass(), "_managedReferenceName", null);
        setIntField(term9057, term9057.getClass(), "_propertyIndex", 0);
        setField(term9057, term9057.getClass(), "_viewMatcher", null);
        term9325 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        term9977 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term9978 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term9979 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(term9977, term9977.getClass(), "_annotated", null);
        setField(term9977, term9977.getClass(), "_setter", null);
        setBooleanField(term9977, term9977.getClass(), "_skipNulls", false);
        setField(term9977, term9977.getClass(), "_propName", null);
        setField(term9978, term9978.getClass(), "_elementType", null);
        setField(term9978, term9978.getClass(), "_superClass", null);
        setField(term9978, term9978.getClass(), "_superInterfaces", null);
        setField(term9978, term9978.getClass(), "_bindings", null);
        setField(term9978, term9978.getClass(), "_canonicalName", null);
        setField(term9978, term9978.getClass(), "_class", null);
        setIntField(term9978, term9978.getClass(), "_hash", 0);
        setField(term9978, term9978.getClass(), "_valueHandler", null);
        setField(term9978, term9978.getClass(), "_typeHandler", null);
        setBooleanField(term9978, term9978.getClass(), "_asStatic", false);
        setField(term9977, term9977.getClass(), "_type", term9978);
        setField(term9977, term9977.getClass(), "_wrapperName", null);
        setField(term9977, term9977.getClass(), "_contextAnnotations", null);
        setField(term9979, term9979.getClass(), "_customFormat", null);
        setField(term9979, term9979.getClass(), "_formatString", null);
        setField(term9979, term9979.getClass(), "_valueClass", null);
        setField(term9977, term9977.getClass(), "_valueDeserializer", term9979);
        setField(term9977, term9977.getClass(), "_valueTypeDeserializer", null);
        setField(term9977, term9977.getClass(), "_nullProvider", null);
        setField(term9977, term9977.getClass(), "_managedReferenceName", null);
        setField(term9977, term9977.getClass(), "_objectIdInfo", null);
        setField(term9977, term9977.getClass(), "_viewMatcher", null);
        setIntField(term9977, term9977.getClass(), "_propertyIndex", 0);
        setField(term9977, term9977.getClass(), "_metadata", null);
        setField(term9977, term9977.getClass(), "_propertyFormat", null);
        setField(term9977, term9977.getClass(), "_aliases", null);
        term9980 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty"));
        Object term9981 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term9980, term9980.getClass(), "_annotated", null);
        setField(term9980, term9980.getClass(), "_setter", null);
        setBooleanField(term9980, term9980.getClass(), "_skipNulls", false);
        setField(term9980, term9980.getClass(), "_propName", null);
        setField(term9981, term9981.getClass(), "_elementType", null);
        setField(term9981, term9981.getClass(), "_superClass", null);
        setField(term9981, term9981.getClass(), "_superInterfaces", null);
        setField(term9981, term9981.getClass(), "_bindings", null);
        setField(term9981, term9981.getClass(), "_canonicalName", null);
        setField(term9981, term9981.getClass(), "_class", null);
        setIntField(term9981, term9981.getClass(), "_hash", 0);
        setField(term9981, term9981.getClass(), "_valueHandler", null);
        setField(term9981, term9981.getClass(), "_typeHandler", null);
        setBooleanField(term9981, term9981.getClass(), "_asStatic", false);
        setField(term9980, term9980.getClass(), "_type", term9981);
        setField(term9980, term9980.getClass(), "_wrapperName", null);
        setField(term9980, term9980.getClass(), "_contextAnnotations", null);
        setField(term9980, term9980.getClass(), "_valueDeserializer", null);
        setField(term9980, term9980.getClass(), "_valueTypeDeserializer", null);
        setField(term9980, term9980.getClass(), "_nullProvider", null);
        setField(term9980, term9980.getClass(), "_managedReferenceName", null);
        setField(term9980, term9980.getClass(), "_objectIdInfo", null);
        setField(term9980, term9980.getClass(), "_viewMatcher", null);
        setIntField(term9980, term9980.getClass(), "_propertyIndex", 0);
        setField(term9980, term9980.getClass(), "_metadata", null);
        setField(term9980, term9980.getClass(), "_propertyFormat", null);
        setField(term9980, term9980.getClass(), "_aliases", null);
        term9982 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer"));
        setField(term9982, term9982.getClass(), "_customFormat", null);
        setField(term9982, term9982.getClass(), "_formatString", null);
        setField(term9982, term9982.getClass(), "_valueClass", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.deser.impl.MethodProperty");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.deser.NullValueProvider");
        Object[] args = new Object[3];
        args[0] = term9057;
        args[1] = term9325;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9977));
        assertTrue(recursiveEquals(term9057, term9980));
        assertTrue(recursiveEquals(term9325, term9982));
    }

};


