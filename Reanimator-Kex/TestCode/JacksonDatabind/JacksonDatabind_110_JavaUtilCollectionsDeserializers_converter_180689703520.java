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

public class JavaUtilCollectionsDeserializers_converter_180689703520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543234;
     Object term543886;

    public JavaUtilCollectionsDeserializers_converter_180689703520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term543270 = Class.forName((String) "java.lang.invoke.MethodHandleImpl$BindCaller$1");
        Class<? extends Object> term543410 = Class.forName((String) "java.util.regex.Pattern$BmpCharPropertyGreedy");
        term543886 = Class.forName((String) "java.lang.ClassLoader$ParallelLoaders");
        term543234 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term543374 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term543516 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term543622 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term543726 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term543832 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term543234, term543234.getClass(), "_class", term543270);
        setField(term543374, term543374.getClass(), "_class", term543410);
        setField(term543516, term543516.getClass(), "_class", null);
        setField(term543622, term543622.getClass(), "_class", null);
        setField(term543726, term543726.getClass(), "_class", null);
        setField(term543832, term543832.getClass(), "_class", term543886);
        setField(term543726, term543726.getClass(), "_superClass", term543832);
        setField(term543622, term543622.getClass(), "_superClass", term543726);
        setField(term543516, term543516.getClass(), "_superClass", term543622);
        setField(term543374, term543374.getClass(), "_superClass", term543516);
        setField(term543234, term543234.getClass(), "_superClass", term543374);
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
        args[1] = term543234;
        args[2] = term543886;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


