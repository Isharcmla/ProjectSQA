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

public class JavaUtilCollectionsDeserializers_converter_180689703502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521497;
     Object term522233;

    public JavaUtilCollectionsDeserializers_converter_180689703502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term521533 = Class.forName((String) "java.util.jar.JarVerifier$2");
        Class<? extends Object> term521673 = Class.forName((String) "com.fasterxml.jackson.databind.util.ClassUtil");
        Class<? extends Object> term521829 = Class.forName((String) "java.nio.FloatBuffer");
        Class<? extends Object> term521985 = Class.forName((String) "java.util.function.Predicate");
        term521497 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term521637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term521793 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term521949 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term522105 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term522197 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term521497, term521497.getClass(), "_class", term521533);
        setField(term521637, term521637.getClass(), "_class", term521673);
        setField(term521793, term521793.getClass(), "_class", term521829);
        setField(term521949, term521949.getClass(), "_class", term521985);
        setField(term522105, term522105.getClass(), "_class", null);
        setField(term522105, term522105.getClass(), "_superClass", term522197);
        setField(term521949, term521949.getClass(), "_superClass", term522105);
        setField(term521793, term521793.getClass(), "_superClass", term521949);
        setField(term521637, term521637.getClass(), "_superClass", term521793);
        setField(term521497, term521497.getClass(), "_superClass", term521637);
        term522233 = Class.forName((String) "com.fasterxml.jackson.databind.util.ArrayBuilders$FloatBuilder");
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
        args[1] = term521497;
        args[2] = term522233;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


