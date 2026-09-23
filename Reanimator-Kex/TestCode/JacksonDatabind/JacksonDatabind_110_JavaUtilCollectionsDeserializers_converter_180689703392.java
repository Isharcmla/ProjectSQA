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

public class JavaUtilCollectionsDeserializers_converter_180689703392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376302;
     Object term377070;

    public JavaUtilCollectionsDeserializers_converter_180689703392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term376338 = Class.forName((String) "kex.java.util.LinkedHashMap$LinkedHashIterator");
        Class<? extends Object> term376478 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$1");
        Class<? extends Object> term376634 = Class.forName((String) "com.fasterxml.jackson.databind.deser.std.JdkDeserializers");
        Class<? extends Object> term376790 = Class.forName((String) "java.lang.reflect.ProxyGenerator$ConstantPool");
        term377070 = Class.forName((String) "com.fasterxml.jackson.core.Version");
        term376302 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term376442 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term376598 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term376754 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term376910 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term377016 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term376302, term376302.getClass(), "_class", term376338);
        setField(term376442, term376442.getClass(), "_class", term376478);
        setField(term376598, term376598.getClass(), "_class", term376634);
        setField(term376754, term376754.getClass(), "_class", term376790);
        setField(term376910, term376910.getClass(), "_class", null);
        setField(term377016, term377016.getClass(), "_class", term377070);
        setField(term376910, term376910.getClass(), "_superClass", term377016);
        setField(term376754, term376754.getClass(), "_superClass", term376910);
        setField(term376598, term376598.getClass(), "_superClass", term376754);
        setField(term376442, term376442.getClass(), "_superClass", term376598);
        setField(term376302, term376302.getClass(), "_superClass", term376442);
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
        args[1] = term376302;
        args[2] = term377070;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


