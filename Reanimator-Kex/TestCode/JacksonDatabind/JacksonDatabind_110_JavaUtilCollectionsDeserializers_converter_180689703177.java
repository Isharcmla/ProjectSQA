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

public class JavaUtilCollectionsDeserializers_converter_180689703177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122434;
     Object term122870;

    public JavaUtilCollectionsDeserializers_converter_180689703177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term122470 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer");
        Class<? extends Object> term122598 = Class.forName((String) "java.io.StringReader");
        term122870 = Class.forName((String) "org.vorpal.research.kex.intrinsics.UnknownTypeInstantiation");
        term122434 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term122562 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term122712 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term122816 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term122434, term122434.getClass(), "_class", term122470);
        setField(term122562, term122562.getClass(), "_class", term122598);
        setField(term122712, term122712.getClass(), "_class", null);
        setField(term122816, term122816.getClass(), "_class", term122870);
        setField(term122712, term122712.getClass(), "_superClass", term122816);
        setField(term122562, term122562.getClass(), "_superClass", term122712);
        setField(term122434, term122434.getClass(), "_superClass", term122562);
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
        args[1] = term122434;
        args[2] = term122870;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


