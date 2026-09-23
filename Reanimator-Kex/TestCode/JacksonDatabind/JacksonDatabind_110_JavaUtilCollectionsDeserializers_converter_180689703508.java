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

public class JavaUtilCollectionsDeserializers_converter_180689703508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529380;
     Object term529900;

    public JavaUtilCollectionsDeserializers_converter_180689703508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term529416 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.StdValueInstantiator");
        Class<? extends Object> term529544 = Class.forName((String) "java.lang.invoke.DirectMethodHandle$Special");
        Class<? extends Object> term529676 = Class.forName((String) "java.util.ArrayPrefixHelpers$DoubleCumulateTask");
        term529380 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term529508 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term529640 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term529768 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term529864 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term529380, term529380.getClass(), "_class", term529416);
        setField(term529508, term529508.getClass(), "_class", term529544);
        setField(term529640, term529640.getClass(), "_class", term529676);
        setField(term529768, term529768.getClass(), "_class", null);
        setField(term529768, term529768.getClass(), "_superClass", term529864);
        setField(term529640, term529640.getClass(), "_superClass", term529768);
        setField(term529508, term529508.getClass(), "_superClass", term529640);
        setField(term529380, term529380.getClass(), "_superClass", term529508);
        term529900 = Class.forName((String) "java.util.Spliterators");
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
        args[1] = term529380;
        args[2] = term529900;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


