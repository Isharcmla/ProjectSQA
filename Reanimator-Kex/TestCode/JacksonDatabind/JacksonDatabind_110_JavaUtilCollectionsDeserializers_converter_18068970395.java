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
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_18068970395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45897;
     Object term46121;
     Object term46604;
     Object term46649;
     Object term46601;

    public JavaUtilCollectionsDeserializers_converter_18068970395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45897 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term45993 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term46085 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term45897, term45897.getClass(), "_class", null);
        setField(term45993, term45993.getClass(), "_class", null);
        setField(term45993, term45993.getClass(), "_superClass", term46085);
        setField(term45897, term45897.getClass(), "_superClass", term45993);
        term46121 = Class.forName((String) "com.fasterxml.jackson.databind.util.RawValue");
        term46604 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$ShortBuilder");
        term46649 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term46650 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term46651 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term46649, term46649.getClass(), "_keyType", null);
        setField(term46649, term46649.getClass(), "_valueType", null);
        setField(term46650, term46650.getClass(), "_componentType", null);
        setField(term46650, term46650.getClass(), "_emptyArray", null);
        setField(term46651, term46651.getClass(), "_keyType", null);
        setField(term46651, term46651.getClass(), "_valueType", null);
        setField(term46651, term46651.getClass(), "_superClass", null);
        setField(term46651, term46651.getClass(), "_superInterfaces", null);
        setField(term46651, term46651.getClass(), "_bindings", null);
        setField(term46651, term46651.getClass(), "_canonicalName", null);
        setField(term46651, term46651.getClass(), "_class", null);
        setIntField(term46651, term46651.getClass(), "_hash", 0);
        setField(term46651, term46651.getClass(), "_valueHandler", null);
        setField(term46651, term46651.getClass(), "_typeHandler", null);
        setBooleanField(term46651, term46651.getClass(), "_asStatic", false);
        setField(term46650, term46650.getClass(), "_superClass", term46651);
        setField(term46650, term46650.getClass(), "_superInterfaces", null);
        setField(term46650, term46650.getClass(), "_bindings", null);
        setField(term46650, term46650.getClass(), "_canonicalName", null);
        setField(term46650, term46650.getClass(), "_class", null);
        setIntField(term46650, term46650.getClass(), "_hash", 0);
        setField(term46650, term46650.getClass(), "_valueHandler", null);
        setField(term46650, term46650.getClass(), "_typeHandler", null);
        setBooleanField(term46650, term46650.getClass(), "_asStatic", false);
        setField(term46649, term46649.getClass(), "_superClass", term46650);
        setField(term46649, term46649.getClass(), "_superInterfaces", null);
        setField(term46649, term46649.getClass(), "_bindings", null);
        setField(term46649, term46649.getClass(), "_canonicalName", null);
        setField(term46649, term46649.getClass(), "_class", null);
        setIntField(term46649, term46649.getClass(), "_hash", 0);
        setField(term46649, term46649.getClass(), "_valueHandler", null);
        setField(term46649, term46649.getClass(), "_typeHandler", null);
        setBooleanField(term46649, term46649.getClass(), "_asStatic", false);
        term46601 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term46601, term46601.getClass(), "_inputType", null);
        setIntField(term46601, term46601.getClass(), "_kind", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[2] = Class.forName("java.lang.Class");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = term45897;
        args[2] = term46121;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term45897, term46649));
        assertTrue(recursiveEquals(term46121, 0));
        assertTrue(recursiveEquals(retValue, term46601));
    }

};


