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
import java.lang.String;
import java.lang.Object;

public class JavaUtilCollectionsDeserializers_converter_180689703135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82053;
     Object term82449;

    public JavaUtilCollectionsDeserializers_converter_180689703135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82089 = Class.forName((String) "java.util.concurrent.locks.Condition");
        Class<? extends Object> term82229 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$EnsureInitialized");
        term82053 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term82193 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term82321 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term82413 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term82053, term82053.getClass(), "_class", term82089);
        setField(term82193, term82193.getClass(), "_class", term82229);
        setField(term82321, term82321.getClass(), "_class", null);
        setField(term82321, term82321.getClass(), "_superClass", term82413);
        setField(term82193, term82193.getClass(), "_superClass", term82321);
        setField(term82053, term82053.getClass(), "_superClass", term82193);
        term82449 = Class.forName((String) "java.util.stream.Nodes$InternalNodeSpliterator$OfInt");
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
        args[1] = term82053;
        args[2] = term82449;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


