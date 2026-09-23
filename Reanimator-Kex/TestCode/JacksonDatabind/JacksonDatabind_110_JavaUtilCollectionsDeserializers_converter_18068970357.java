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

public class JavaUtilCollectionsDeserializers_converter_18068970357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22060;
     Object term22188;
     Object term22614;
     Object term22659;
     Object term22611;

    public JavaUtilCollectionsDeserializers_converter_18068970357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22060 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term22152 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term22060, term22060.getClass(), "_class", null);
        setField(term22060, term22060.getClass(), "_superClass", term22152);
        term22188 = Class.forName((String) "java.lang.invoke.InfoFromMemberName");
        term22614 = Class.forName((String) "com.fasterxml.jackson.core.util.DefaultPrettyPrinter");
        term22659 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term22660 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term22659, term22659.getClass(), "_keyType", null);
        setField(term22659, term22659.getClass(), "_valueType", null);
        setField(term22660, term22660.getClass(), "_keyType", null);
        setField(term22660, term22660.getClass(), "_valueType", null);
        setField(term22660, term22660.getClass(), "_superClass", null);
        setField(term22660, term22660.getClass(), "_superInterfaces", null);
        setField(term22660, term22660.getClass(), "_bindings", null);
        setField(term22660, term22660.getClass(), "_canonicalName", null);
        setField(term22660, term22660.getClass(), "_class", null);
        setIntField(term22660, term22660.getClass(), "_hash", 0);
        setField(term22660, term22660.getClass(), "_valueHandler", null);
        setField(term22660, term22660.getClass(), "_typeHandler", null);
        setBooleanField(term22660, term22660.getClass(), "_asStatic", false);
        setField(term22659, term22659.getClass(), "_superClass", term22660);
        setField(term22659, term22659.getClass(), "_superInterfaces", null);
        setField(term22659, term22659.getClass(), "_bindings", null);
        setField(term22659, term22659.getClass(), "_canonicalName", null);
        setField(term22659, term22659.getClass(), "_class", null);
        setIntField(term22659, term22659.getClass(), "_hash", 0);
        setField(term22659, term22659.getClass(), "_valueHandler", null);
        setField(term22659, term22659.getClass(), "_typeHandler", null);
        setBooleanField(term22659, term22659.getClass(), "_asStatic", false);
        term22611 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term22611, term22611.getClass(), "_inputType", null);
        setIntField(term22611, term22611.getClass(), "_kind", 0);
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
        args[1] = term22060;
        args[2] = term22188;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term22060, term22659));
        assertTrue(recursiveEquals(term22188, 0));
        assertTrue(recursiveEquals(retValue, term22611));
    }

};


