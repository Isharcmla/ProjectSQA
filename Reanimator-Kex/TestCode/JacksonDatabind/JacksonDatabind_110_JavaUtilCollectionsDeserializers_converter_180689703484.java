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

public class JavaUtilCollectionsDeserializers_converter_180689703484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496720;
     Object term497144;

    public JavaUtilCollectionsDeserializers_converter_180689703484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term496756 = Class.forName((String) "java.util.stream.FindOps$FindSink$OfDouble");
        Class<? extends Object> term496884 = Class.forName((String) "java.nio.channels.InterruptedByTimeoutException");
        term497144 = Class.forName((String) "java.nio.channels.NonWritableChannelException");
        term496720 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term496848 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term496976 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term497090 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        setField(term496720, term496720.getClass(), "_class", term496756);
        setField(term496848, term496848.getClass(), "_class", term496884);
        setField(term496976, term496976.getClass(), "_class", term496884);
        setField(term497090, term497090.getClass(), "_class", term497144);
        setField(term496976, term496976.getClass(), "_superClass", term497090);
        setField(term496848, term496848.getClass(), "_superClass", term496976);
        setField(term496720, term496720.getClass(), "_superClass", term496848);
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
        args[1] = term496720;
        args[2] = term497144;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


