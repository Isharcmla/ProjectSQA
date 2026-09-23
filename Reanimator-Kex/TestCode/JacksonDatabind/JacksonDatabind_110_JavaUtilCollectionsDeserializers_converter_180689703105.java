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

public class JavaUtilCollectionsDeserializers_converter_180689703105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53929;
     Object term54161;
     Object term54641;
     Object term54686;
     Object term54638;

    public JavaUtilCollectionsDeserializers_converter_180689703105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53929 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term54033 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term54125 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term53929, term53929.getClass(), "_class", null);
        setField(term54033, term54033.getClass(), "_class", null);
        setField(term54033, term54033.getClass(), "_superClass", term54125);
        setField(term53929, term53929.getClass(), "_superClass", term54033);
        term54161 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$Traverser");
        term54641 = Class.forName((String) "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier");
        term54686 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term54687 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term54688 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term54686, term54686.getClass(), "_keyType", null);
        setField(term54686, term54686.getClass(), "_valueType", null);
        setField(term54687, term54687.getClass(), "_referencedType", null);
        setField(term54687, term54687.getClass(), "_anchorType", null);
        setField(term54688, term54688.getClass(), "_keyType", null);
        setField(term54688, term54688.getClass(), "_valueType", null);
        setField(term54688, term54688.getClass(), "_superClass", null);
        setField(term54688, term54688.getClass(), "_superInterfaces", null);
        setField(term54688, term54688.getClass(), "_bindings", null);
        setField(term54688, term54688.getClass(), "_canonicalName", null);
        setField(term54688, term54688.getClass(), "_class", null);
        setIntField(term54688, term54688.getClass(), "_hash", 0);
        setField(term54688, term54688.getClass(), "_valueHandler", null);
        setField(term54688, term54688.getClass(), "_typeHandler", null);
        setBooleanField(term54688, term54688.getClass(), "_asStatic", false);
        setField(term54687, term54687.getClass(), "_superClass", term54688);
        setField(term54687, term54687.getClass(), "_superInterfaces", null);
        setField(term54687, term54687.getClass(), "_bindings", null);
        setField(term54687, term54687.getClass(), "_canonicalName", null);
        setField(term54687, term54687.getClass(), "_class", null);
        setIntField(term54687, term54687.getClass(), "_hash", 0);
        setField(term54687, term54687.getClass(), "_valueHandler", null);
        setField(term54687, term54687.getClass(), "_typeHandler", null);
        setBooleanField(term54687, term54687.getClass(), "_asStatic", false);
        setField(term54686, term54686.getClass(), "_superClass", term54687);
        setField(term54686, term54686.getClass(), "_superInterfaces", null);
        setField(term54686, term54686.getClass(), "_bindings", null);
        setField(term54686, term54686.getClass(), "_canonicalName", null);
        setField(term54686, term54686.getClass(), "_class", null);
        setIntField(term54686, term54686.getClass(), "_hash", 0);
        setField(term54686, term54686.getClass(), "_valueHandler", null);
        setField(term54686, term54686.getClass(), "_typeHandler", null);
        setBooleanField(term54686, term54686.getClass(), "_asStatic", false);
        term54638 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term54638, term54638.getClass(), "_inputType", null);
        setIntField(term54638, term54638.getClass(), "_kind", 0);
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
        args[1] = term53929;
        args[2] = term54161;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term53929, term54686));
        assertTrue(recursiveEquals(term54161, 0));
        assertTrue(recursiveEquals(retValue, term54638));
    }

};


