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

public class JavaUtilCollectionsDeserializers_converter_180689703101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50392;
     Object term50538;
     Object term51120;
     Object term51127;
     Object term51028;

    public JavaUtilCollectionsDeserializers_converter_180689703101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50538 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$MemberIterator");
        term50392 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term50484 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term50392, term50392.getClass(), "_class", null);
        setField(term50484, term50484.getClass(), "_class", term50538);
        setField(term50392, term50392.getClass(), "_superClass", term50484);
        term51120 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        Class<? extends Object> term51129 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        term51127 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term51128 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term51127, term51127.getClass(), "_keyType", null);
        setField(term51127, term51127.getClass(), "_valueType", null);
        setField(term51128, term51128.getClass(), "_keyType", null);
        setField(term51128, term51128.getClass(), "_valueType", null);
        setField(term51128, term51128.getClass(), "_superClass", null);
        setField(term51128, term51128.getClass(), "_superInterfaces", null);
        setField(term51128, term51128.getClass(), "_bindings", null);
        setField(term51128, term51128.getClass(), "_canonicalName", null);
        setField(term51128, term51128.getClass(), "_class", term51129);
        setIntField(term51128, term51128.getClass(), "_hash", 0);
        setField(term51128, term51128.getClass(), "_valueHandler", null);
        setField(term51128, term51128.getClass(), "_typeHandler", null);
        setBooleanField(term51128, term51128.getClass(), "_asStatic", false);
        setField(term51127, term51127.getClass(), "_superClass", term51128);
        setField(term51127, term51127.getClass(), "_superInterfaces", null);
        setField(term51127, term51127.getClass(), "_bindings", null);
        setField(term51127, term51127.getClass(), "_canonicalName", null);
        setField(term51127, term51127.getClass(), "_class", null);
        setIntField(term51127, term51127.getClass(), "_hash", 0);
        setField(term51127, term51127.getClass(), "_valueHandler", null);
        setField(term51127, term51127.getClass(), "_typeHandler", null);
        setBooleanField(term51127, term51127.getClass(), "_asStatic", false);
        Class<? extends Object> term50812 = Class.forName((String) "com.fasterxml.jackson.core.io.DataOutputAsStream");
        term51028 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        Object term51023 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term51023, term51023.getClass(), "_keyType", null);
        setField(term51023, term51023.getClass(), "_valueType", null);
        setField(term51023, term51023.getClass(), "_superClass", null);
        setField(term51023, term51023.getClass(), "_superInterfaces", null);
        setField(term51023, term51023.getClass(), "_bindings", null);
        setField(term51023, term51023.getClass(), "_canonicalName", null);
        setField(term51023, term51023.getClass(), "_class", term50812);
        setIntField(term51023, term51023.getClass(), "_hash", 0);
        setField(term51023, term51023.getClass(), "_valueHandler", null);
        setField(term51023, term51023.getClass(), "_typeHandler", null);
        setBooleanField(term51023, term51023.getClass(), "_asStatic", false);
        setField(term51028, term51028.getClass(), "_inputType", term51023);
        setIntField(term51028, term51028.getClass(), "_kind", 0);
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
        args[1] = term50392;
        args[2] = term50538;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term50392, term51127));
        assertTrue(recursiveEquals(term50538, 0));
        assertTrue(recursiveEquals(retValue, term51028));
    }

};


