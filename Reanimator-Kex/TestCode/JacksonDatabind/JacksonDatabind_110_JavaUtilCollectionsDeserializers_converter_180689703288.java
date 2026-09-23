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

public class JavaUtilCollectionsDeserializers_converter_180689703288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245370;
     Object term245898;

    public JavaUtilCollectionsDeserializers_converter_180689703288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term245406 = Class.forName((String) "java.io.ByteArrayInputStream");
        Class<? extends Object> term245534 = Class.forName((String) "java.nio.HeapCharBuffer");
        Class<? extends Object> term245666 = Class.forName((String) "java.util.Dictionary");
        term245370 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term245498 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term245630 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term245762 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term245862 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term245370, term245370.getClass(), "_class", term245406);
        setField(term245498, term245498.getClass(), "_class", term245534);
        setField(term245630, term245630.getClass(), "_class", term245666);
        setField(term245762, term245762.getClass(), "_class", null);
        setField(term245762, term245762.getClass(), "_superClass", term245862);
        setField(term245630, term245630.getClass(), "_superClass", term245762);
        setField(term245498, term245498.getClass(), "_superClass", term245630);
        setField(term245370, term245370.getClass(), "_superClass", term245498);
        term245898 = Class.forName((String) "java.lang.LiveStackFrame");
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
        args[1] = term245370;
        args[2] = term245898;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


