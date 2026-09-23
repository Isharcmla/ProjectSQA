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

public class JavaUtilCollectionsDeserializers_converter_180689703432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423758;
     Object term423886;
     Object term424304;
     Object term424349;
     Object term424301;

    public JavaUtilCollectionsDeserializers_converter_180689703432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423758 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term423850 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term423758, term423758.getClass(), "_class", null);
        setField(term423758, term423758.getClass(), "_superClass", term423850);
        term423886 = Class.forName((String) "java.util.stream.LongPipeline$4$1");
        term424304 = Class.forName((String) "com.fasterxml.jackson.databind.node.ContainerNode");
        term424349 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term424350 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term424349, term424349.getClass(), "_componentType", null);
        setField(term424349, term424349.getClass(), "_emptyArray", null);
        setField(term424350, term424350.getClass(), "_keyType", null);
        setField(term424350, term424350.getClass(), "_valueType", null);
        setField(term424350, term424350.getClass(), "_superClass", null);
        setField(term424350, term424350.getClass(), "_superInterfaces", null);
        setField(term424350, term424350.getClass(), "_bindings", null);
        setField(term424350, term424350.getClass(), "_canonicalName", null);
        setField(term424350, term424350.getClass(), "_class", null);
        setIntField(term424350, term424350.getClass(), "_hash", 0);
        setField(term424350, term424350.getClass(), "_valueHandler", null);
        setField(term424350, term424350.getClass(), "_typeHandler", null);
        setBooleanField(term424350, term424350.getClass(), "_asStatic", false);
        setField(term424349, term424349.getClass(), "_superClass", term424350);
        setField(term424349, term424349.getClass(), "_superInterfaces", null);
        setField(term424349, term424349.getClass(), "_bindings", null);
        setField(term424349, term424349.getClass(), "_canonicalName", null);
        setField(term424349, term424349.getClass(), "_class", null);
        setIntField(term424349, term424349.getClass(), "_hash", 0);
        setField(term424349, term424349.getClass(), "_valueHandler", null);
        setField(term424349, term424349.getClass(), "_typeHandler", null);
        setBooleanField(term424349, term424349.getClass(), "_asStatic", false);
        term424301 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term424301, term424301.getClass(), "_inputType", null);
        setIntField(term424301, term424301.getClass(), "_kind", 0);
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
        args[1] = term423758;
        args[2] = term423886;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term423758, term424349));
        assertTrue(recursiveEquals(term423886, 0));
        assertTrue(recursiveEquals(retValue, term424301));
    }

};


