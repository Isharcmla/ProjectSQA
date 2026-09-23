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

public class JavaUtilCollectionsDeserializers_converter_180689703534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563565;
     Object term564315;

    public JavaUtilCollectionsDeserializers_converter_180689703534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term563601 = Class.forName((String) "java.nio.file.WatchEvent");
        Class<? extends Object> term563751 = Class.forName((String) "java.nio.ByteBufferAsCharBufferL");
        Class<? extends Object> term563893 = Class.forName((String) "java.util.concurrent.ConcurrentHashMap$Node");
        Class<? extends Object> term564049 = Class.forName((String) "java.util.concurrent.CompletableFuture$DelayedExecutor");
        term564315 = Class.forName((String) "java.io.File$TempDirectory");
        term563565 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term563715 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term563857 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term564013 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term564169 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term564261 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term563565, term563565.getClass(), "_class", term563601);
        setField(term563715, term563715.getClass(), "_class", term563751);
        setField(term563857, term563857.getClass(), "_class", term563893);
        setField(term564013, term564013.getClass(), "_class", term564049);
        setField(term564169, term564169.getClass(), "_class", null);
        setField(term564261, term564261.getClass(), "_class", term564315);
        setField(term564169, term564169.getClass(), "_superClass", term564261);
        setField(term564013, term564013.getClass(), "_superClass", term564169);
        setField(term563857, term563857.getClass(), "_superClass", term564013);
        setField(term563715, term563715.getClass(), "_superClass", term563857);
        setField(term563565, term563565.getClass(), "_superClass", term563715);
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
        args[1] = term563565;
        args[2] = term564315;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


