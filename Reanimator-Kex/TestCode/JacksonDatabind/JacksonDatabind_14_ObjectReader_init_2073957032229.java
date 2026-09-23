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

public class ObjectReader_init_2073957032229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32404;
     Object term32879;
     Object term33027;

    public ObjectReader_init_2073957032229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31684 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term31794 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term31942 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term32024 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term32106 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term32769 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term32312 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        setField(term31684, term31684.getClass(), "_config", term31794);
        setField(term31684, term31684.getClass(), "_context", term31942);
        setField(term31684, term31684.getClass(), "_rootDeserializers", term32024);
        setField(term31684, term31684.getClass(), "_parserFactory", term32106);
        setField(term31684, term31684.getClass(), "_rootNames", term32769);
        setField(term31684, term31684.getClass(), "_valueType", term32312);
        setField(term31684, term31684.getClass(), "_valueToUpdate", term32769);
        term32404 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term32552 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term32634 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term32716 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term32404, term32404.getClass(), "_deserializationContext", term32552);
        setField(term32404, term32404.getClass(), "_rootDeserializers", term32634);
        setField(term32404, term32404.getClass(), "_jsonFactory", term32716);
        setField(term32404, term32404.getClass(), "_rootNames", term32769);
        term32879 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term33027 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[5] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        Object[] args = new Object[6];
        args[0] = term32404;
        args[1] = term32879;
        args[2] = null;
        args[3] = term33027;
        args[4] = null;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


