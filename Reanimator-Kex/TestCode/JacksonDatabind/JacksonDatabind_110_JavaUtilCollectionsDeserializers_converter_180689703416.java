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

public class JavaUtilCollectionsDeserializers_converter_180689703416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term404411;
     Object term404801;

    public JavaUtilCollectionsDeserializers_converter_180689703416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term404447 = Class.forName((String) "java.util.stream.StreamSpliterators$SliceSpliterator$OfInt");
        term404801 = Class.forName((String) "com.fasterxml.jackson.core.io.UTF8Writer");
        term404411 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term404539 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term404643 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term404747 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term404411, term404411.getClass(), "_class", term404447);
        setField(term404539, term404539.getClass(), "_class", null);
        setField(term404643, term404643.getClass(), "_class", null);
        setField(term404747, term404747.getClass(), "_class", term404801);
        setField(term404643, term404643.getClass(), "_superClass", term404747);
        setField(term404539, term404539.getClass(), "_superClass", term404643);
        setField(term404411, term404411.getClass(), "_superClass", term404539);
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
        args[1] = term404411;
        args[2] = term404801;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


