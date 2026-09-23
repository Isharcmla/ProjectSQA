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
import java.lang.Object;
import java.lang.String;

public class JavaUtilCollectionsDeserializers_converter_180689703528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term553999;
     Object term554731;

    public JavaUtilCollectionsDeserializers_converter_180689703528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term554149 = Class.forName((String) "java.util.regex.Pattern$Caret");
        Class<? extends Object> term554291 = Class.forName((String) "java.nio.ByteBufferAsFloatBufferRB");
        Class<? extends Object> term554447 = Class.forName((String) "com.fasterxml.jackson.annotation.JsonSetter$Value");
        Class<? extends Object> term554603 = Class.forName((String) "java.util.HashMap$ValueSpliterator");
        term553999 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term554113 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
        Object term554255 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term554411 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term554567 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term554695 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term553999, term553999.getClass(), "_class", null);
        setField(term554113, term554113.getClass(), "_class", term554149);
        setField(term554255, term554255.getClass(), "_class", term554291);
        setField(term554411, term554411.getClass(), "_class", term554447);
        setField(term554567, term554567.getClass(), "_class", term554603);
        setField(term554567, term554567.getClass(), "_superClass", term554695);
        setField(term554411, term554411.getClass(), "_superClass", term554567);
        setField(term554255, term554255.getClass(), "_superClass", term554411);
        setField(term554113, term554113.getClass(), "_superClass", term554255);
        setField(term553999, term553999.getClass(), "_superClass", term554113);
        term554731 = Class.forName((String) "java.util.NavigableSet");
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
        args[1] = term553999;
        args[2] = term554731;
        try {
            callMethod(klass, "converter", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


