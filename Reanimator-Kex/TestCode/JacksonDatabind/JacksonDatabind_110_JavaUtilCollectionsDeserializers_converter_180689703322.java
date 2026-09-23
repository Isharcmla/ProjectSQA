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

public class JavaUtilCollectionsDeserializers_converter_180689703322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283934;
     Object term284432;

    public JavaUtilCollectionsDeserializers_converter_180689703322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term283970 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.StringArraySerializer");
        Class<? extends Object> term284098 = Class.forName((String) "java.lang.invoke.MethodHandles$Lookup");
        term283934 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term284062 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term284194 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term284290 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term284396 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term283934, term283934.getClass(), "_class", term283970);
        setField(term284062, term284062.getClass(), "_class", term284098);
        setField(term284194, term284194.getClass(), "_class", null);
        setField(term284290, term284290.getClass(), "_class", term283970);
        setField(term284290, term284290.getClass(), "_superClass", term284396);
        setField(term284194, term284194.getClass(), "_superClass", term284290);
        setField(term284062, term284062.getClass(), "_superClass", term284194);
        setField(term283934, term283934.getClass(), "_superClass", term284062);
        term284432 = Class.forName((String) "java.io.SerializablePermission");
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
        args[1] = term283934;
        args[2] = term284432;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


