package com.fasterxml.jackson.databind;

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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class MappingIterator_readAll_1504926291166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118246;

    public MappingIterator_readAll_1504926291166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term119670 = Class.forName((String) "com.fasterxml.jackson.core.JsonToken");
        Field term119669 = ((Class) term119670).getDeclaredField((String) "VALUE_STRING");
        ((Field) term119669).setAccessible(true);
        Object enum74 = ((Field) term119669).get((Object) null);
        term118246 = newInstance(Class.forName("com.fasterxml.jackson.databind.MappingIterator"));
        Object term118366 = newInstance(Class.forName("com.fasterxml.jackson.core.filter.FilteringParserDelegate"));
        Object term118616 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term118764 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term118366, term118366.getClass(), "_currToken", enum74);
        setField(term118246, term118246.getClass(), "_parser", term118366);
        setBooleanField(term118246, term118246.getClass(), "_hasNextChecked", false);
        setField(term118246, term118246.getClass(), "_updatedValue", null);
        setField(term118246, term118246.getClass(), "_deserializer", term118616);
        setIntField(term118764, term118764.getClass(), "_featureFlags", 0);
        setField(term118246, term118246.getClass(), "_context", term118764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.MappingIterator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readAll", argTypes, term118246, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


