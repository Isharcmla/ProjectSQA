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

public class JavaUtilCollectionsDeserializers_converter_180689703125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72207;
     Object term72441;

    public JavaUtilCollectionsDeserializers_converter_180689703125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72207 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term72299 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term72405 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term72207, term72207.getClass(), "_class", null);
        setField(term72299, term72299.getClass(), "_class", null);
        setField(term72299, term72299.getClass(), "_superClass", term72405);
        setField(term72207, term72207.getClass(), "_superClass", term72299);
        term72441 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$MapReduceValuesToIntTask");
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
        args[1] = term72207;
        args[2] = term72441;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


