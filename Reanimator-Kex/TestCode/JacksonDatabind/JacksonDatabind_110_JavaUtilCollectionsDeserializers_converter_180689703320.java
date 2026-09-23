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

public class JavaUtilCollectionsDeserializers_converter_180689703320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281436;
     Object term281856;

    public JavaUtilCollectionsDeserializers_converter_180689703320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term281472 = Class.forName((String) "java.util.concurrent.ConcurrentSkipListMap$KeySpliterator");
        Class<? extends Object> term281600 = Class.forName((String) "com.fasterxml.jackson.annotation.ObjectIdGenerators$UUIDGenerator");
        term281436 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term281564 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term281714 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term281820 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term281436, term281436.getClass(), "_class", term281472);
        setField(term281564, term281564.getClass(), "_class", term281600);
        setField(term281714, term281714.getClass(), "_class", null);
        setField(term281714, term281714.getClass(), "_superClass", term281820);
        setField(term281564, term281564.getClass(), "_superClass", term281714);
        setField(term281436, term281436.getClass(), "_superClass", term281564);
        term281856 = Class.forName((String) "java.util.stream.LongPipeline$Head");
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
        args[1] = term281436;
        args[2] = term281856;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


