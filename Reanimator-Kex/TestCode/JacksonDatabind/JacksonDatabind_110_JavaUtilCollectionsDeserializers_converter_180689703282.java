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
import java.lang.reflect.InaccessibleObjectException;
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239707;
     Object term240031;

    public JavaUtilCollectionsDeserializers_converter_180689703282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239707 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term239799 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term239891 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term239995 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term239707, term239707.getClass(), "_class", null);
        setField(term239799, term239799.getClass(), "_class", null);
        setField(term239891, term239891.getClass(), "_class", null);
        setField(term239891, term239891.getClass(), "_superClass", term239995);
        setField(term239799, term239799.getClass(), "_superClass", term239891);
        setField(term239707, term239707.getClass(), "_superClass", term239799);
        term240031 = Class.forName((String) "com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder$Node");
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
        args[1] = term239707;
        args[2] = term240031;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


