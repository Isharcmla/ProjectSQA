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

public class JavaUtilCollectionsDeserializers_converter_180689703378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357548;
     Object term358086;

    public JavaUtilCollectionsDeserializers_converter_180689703378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term357584 = Class.forName((String) "com.fasterxml.jackson.databind.node.ShortNode");
        Class<? extends Object> term357712 = Class.forName((String) "java.util.Locale");
        Class<? extends Object> term357844 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonEnumDefaultValue");
        term358086 = Class.forName((String) "java.io.ObjectStreamClass$WeakClassKey");
        term357548 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term357676 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term357808 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term357940 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term358032 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term357548, term357548.getClass(), "_class", term357584);
        setField(term357676, term357676.getClass(), "_class", term357712);
        setField(term357808, term357808.getClass(), "_class", term357844);
        setField(term357940, term357940.getClass(), "_class", null);
        setField(term358032, term358032.getClass(), "_class", term358086);
        setField(term357940, term357940.getClass(), "_superClass", term358032);
        setField(term357808, term357808.getClass(), "_superClass", term357940);
        setField(term357676, term357676.getClass(), "_superClass", term357808);
        setField(term357548, term357548.getClass(), "_superClass", term357676);
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
        args[1] = term357548;
        args[2] = term358086;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


