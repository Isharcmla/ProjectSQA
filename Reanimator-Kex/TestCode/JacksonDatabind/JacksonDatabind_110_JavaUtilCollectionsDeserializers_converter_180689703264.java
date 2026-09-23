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

public class JavaUtilCollectionsDeserializers_converter_180689703264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218291;
     Object term218671;

    public JavaUtilCollectionsDeserializers_converter_180689703264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term218327 = Class.forName((String) "java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock");
        term218291 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term218423 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term218515 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term218635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term218291, term218291.getClass(), "_class", term218327);
        setField(term218423, term218423.getClass(), "_class", null);
        setField(term218515, term218515.getClass(), "_class", null);
        setField(term218515, term218515.getClass(), "_superClass", term218635);
        setField(term218423, term218423.getClass(), "_superClass", term218515);
        setField(term218291, term218291.getClass(), "_superClass", term218423);
        term218671 = Class.forName((String) "java.util.stream.IntStream$Builder");
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
        args[1] = term218291;
        args[2] = term218671;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


