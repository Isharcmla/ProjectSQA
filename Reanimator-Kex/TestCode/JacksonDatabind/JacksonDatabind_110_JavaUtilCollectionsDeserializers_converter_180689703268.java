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

public class JavaUtilCollectionsDeserializers_converter_180689703268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222284;
     Object term222812;

    public JavaUtilCollectionsDeserializers_converter_180689703268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term222320 = Class.forName((String) "java.util.Random$RandomIntsSpliterator");
        Class<? extends Object> term222448 = Class.forName((String) "com.fasterxml.jackson.databind.util.ViewMatcher$Single");
        Class<? extends Object> term222580 = Class.forName((String) "java.io.InvalidClassException");
        term222284 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term222412 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term222544 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term222676 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term222776 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term222284, term222284.getClass(), "_class", term222320);
        setField(term222412, term222412.getClass(), "_class", term222448);
        setField(term222544, term222544.getClass(), "_class", term222580);
        setField(term222676, term222676.getClass(), "_class", null);
        setField(term222676, term222676.getClass(), "_superClass", term222776);
        setField(term222544, term222544.getClass(), "_superClass", term222676);
        setField(term222412, term222412.getClass(), "_superClass", term222544);
        setField(term222284, term222284.getClass(), "_superClass", term222412);
        term222812 = Class.forName((String) "java.lang.invoke.Invokers$Lazy");
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
        args[1] = term222284;
        args[2] = term222812;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


