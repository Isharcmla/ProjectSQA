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

public class JavaUtilCollectionsDeserializers_converter_180689703235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180489;
     Object term181249;

    public JavaUtilCollectionsDeserializers_converter_180689703235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180525 = Class.forName((String) "java.util.stream.Node$Builder$OfLong");
        Class<? extends Object> term180675 = Class.forName((String) "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator");
        Class<? extends Object> term180817 = Class.forName((String) "java.util.TreeMap$EntrySet");
        Class<? extends Object> term180973 = Class.forName((String) "java.nio.HeapFloatBufferR");
        term180489 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term180639 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term180781 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term180937 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term181093 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term181213 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        setField(term180489, term180489.getClass(), "_class", term180525);
        setField(term180639, term180639.getClass(), "_class", term180675);
        setField(term180781, term180781.getClass(), "_class", term180817);
        setField(term180937, term180937.getClass(), "_class", term180973);
        setField(term181093, term181093.getClass(), "_class", null);
        setField(term181093, term181093.getClass(), "_superClass", term181213);
        setField(term180937, term180937.getClass(), "_superClass", term181093);
        setField(term180781, term180781.getClass(), "_superClass", term180937);
        setField(term180639, term180639.getClass(), "_superClass", term180781);
        setField(term180489, term180489.getClass(), "_superClass", term180639);
        term181249 = Class.forName((String) "java.util.Scanner$FindSpliterator");
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
        args[1] = term180489;
        args[2] = term181249;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


