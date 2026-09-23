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

public class JavaUtilCollectionsDeserializers_converter_180689703364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338526;
     Object term338972;

    public JavaUtilCollectionsDeserializers_converter_180689703364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term338562 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonMerge");
        Class<? extends Object> term338702 = Class.forName((String) "java.util.Formatter$FormatSpecifier");
        term338526 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term338666 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term338822 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term338936 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term338526, term338526.getClass(), "_class", term338562);
        setField(term338666, term338666.getClass(), "_class", term338702);
        setField(term338822, term338822.getClass(), "_class", null);
        setField(term338822, term338822.getClass(), "_superClass", term338936);
        setField(term338666, term338666.getClass(), "_superClass", term338822);
        setField(term338526, term338526.getClass(), "_superClass", term338666);
        term338972 = Class.forName((String) "java.util.concurrent.atomic.Striped64$1");
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
        args[1] = term338526;
        args[2] = term338972;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


