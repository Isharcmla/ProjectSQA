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

public class JavaUtilCollectionsDeserializers_converter_18068970367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27685;
     Object term27825;
     Object term28286;
     Object term28331;
     Object term28283;

    public JavaUtilCollectionsDeserializers_converter_18068970367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27685 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term27789 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term27685, term27685.getClass(), "_class", null);
        setField(term27685, term27685.getClass(), "_superClass", term27789);
        term27825 = Class.forName((String) "java.util.function.IntFunction");
        term28286 = Class.forName((String) "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer");
        term28331 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term28332 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term28331, term28331.getClass(), "_keyType", null);
        setField(term28331, term28331.getClass(), "_valueType", null);
        setField(term28332, term28332.getClass(), "_referencedType", null);
        setField(term28332, term28332.getClass(), "_anchorType", null);
        setField(term28332, term28332.getClass(), "_superClass", null);
        setField(term28332, term28332.getClass(), "_superInterfaces", null);
        setField(term28332, term28332.getClass(), "_bindings", null);
        setField(term28332, term28332.getClass(), "_canonicalName", null);
        setField(term28332, term28332.getClass(), "_class", null);
        setIntField(term28332, term28332.getClass(), "_hash", 0);
        setField(term28332, term28332.getClass(), "_valueHandler", null);
        setField(term28332, term28332.getClass(), "_typeHandler", null);
        setBooleanField(term28332, term28332.getClass(), "_asStatic", false);
        setField(term28331, term28331.getClass(), "_superClass", term28332);
        setField(term28331, term28331.getClass(), "_superInterfaces", null);
        setField(term28331, term28331.getClass(), "_bindings", null);
        setField(term28331, term28331.getClass(), "_canonicalName", null);
        setField(term28331, term28331.getClass(), "_class", null);
        setIntField(term28331, term28331.getClass(), "_hash", 0);
        setField(term28331, term28331.getClass(), "_valueHandler", null);
        setField(term28331, term28331.getClass(), "_typeHandler", null);
        setBooleanField(term28331, term28331.getClass(), "_asStatic", false);
        term28283 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers$JavaUtilCollectionsConverter"));
        setField(term28283, term28283.getClass(), "_inputType", null);
        setIntField(term28283, term28283.getClass(), "_kind", 0);
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
        args[1] = term27685;
        args[2] = term27825;
        Object retValue = callMethod(klass, "converter", argTypes, null, args);
        assertTrue(recursiveEquals(term27685, term28331));
        assertTrue(recursiveEquals(term27825, 0));
        assertTrue(recursiveEquals(retValue, term28283));
    }

};


