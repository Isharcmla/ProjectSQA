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

public class JavaUtilCollectionsDeserializers_converter_180689703306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264047;
     Object term264605;

    public JavaUtilCollectionsDeserializers_converter_180689703306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term264083 = Class.forName((String) "com.fasterxml.jackson.databind.introspect.AnnotationCollector$EmptyCollector");
        Class<? extends Object> term264211 = Class.forName((String) "java.util.PriorityQueue$Itr");
        Class<? extends Object> term264361 = Class.forName((String) "java.util.concurrent.CompletableFuture$Signaller");
        term264047 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term264175 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term264325 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term264465 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term264569 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        setField(term264047, term264047.getClass(), "_class", term264083);
        setField(term264175, term264175.getClass(), "_class", term264211);
        setField(term264325, term264325.getClass(), "_class", term264361);
        setField(term264465, term264465.getClass(), "_class", null);
        setField(term264465, term264465.getClass(), "_superClass", term264569);
        setField(term264325, term264325.getClass(), "_superClass", term264465);
        setField(term264175, term264175.getClass(), "_superClass", term264325);
        setField(term264047, term264047.getClass(), "_superClass", term264175);
        term264605 = Class.forName((String) "java.util.function.ObjIntConsumer");
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
        args[1] = term264047;
        args[2] = term264605;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


