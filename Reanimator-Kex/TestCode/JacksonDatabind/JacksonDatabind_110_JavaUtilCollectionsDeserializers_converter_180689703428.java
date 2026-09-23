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

public class JavaUtilCollectionsDeserializers_converter_180689703428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419477;
     Object term420001;

    public JavaUtilCollectionsDeserializers_converter_180689703428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term419513 = Class.forName((String) "java.util.jar.JarInputStream");
        Class<? extends Object> term419641 = Class.forName((String) "java.io.DefaultFileSystem");
        Class<? extends Object> term419773 = Class.forName((String) "java.util.stream.ReduceOps$CountingSink$OfInt");
        term419477 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term419605 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term419737 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term419869 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term419965 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        setField(term419477, term419477.getClass(), "_class", term419513);
        setField(term419605, term419605.getClass(), "_class", term419641);
        setField(term419737, term419737.getClass(), "_class", term419773);
        setField(term419869, term419869.getClass(), "_class", null);
        setField(term419869, term419869.getClass(), "_superClass", term419965);
        setField(term419737, term419737.getClass(), "_superClass", term419869);
        setField(term419605, term419605.getClass(), "_superClass", term419737);
        setField(term419477, term419477.getClass(), "_superClass", term419605);
        term420001 = Class.forName((String) "com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty");
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
        args[1] = term419477;
        args[2] = term420001;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


