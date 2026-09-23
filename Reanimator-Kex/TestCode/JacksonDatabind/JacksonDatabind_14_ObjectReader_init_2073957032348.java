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

public class ObjectReader_init_2073957032348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150676;
     Object term150984;
     Object term151084;

    public ObjectReader_init_2073957032348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term151875 = Class.forName((String) "com.fasterxml.jackson.databind.DeserializationFeature");
        Field term151874 = ((Class) term151875).getDeclaredField((String) "USE_BIG_DECIMAL_FOR_FLOATS");
        ((Field) term151874).setAccessible(true);
        Object enum9 = ((Field) term151874).get((Object) null);
        Object term150244 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term150326 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term150584 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term150244, term150244.getClass(), "_config", null);
        setField(term150244, term150244.getClass(), "_context", null);
        setField(term150244, term150244.getClass(), "_rootDeserializers", term150326);
        setField(term150244, term150244.getClass(), "_parserFactory", null);
        setField(term150244, term150244.getClass(), "_rootNames", null);
        setField(term150244, term150244.getClass(), "_valueType", null);
        setField(term150244, term150244.getClass(), "_valueToUpdate", enum9);
        setField(term150244, term150244.getClass(), "_schema", null);
        setField(term150244, term150244.getClass(), "_injectableValues", term150584);
        setBooleanField(term150244, term150244.getClass(), "_unwrapRoot", false);
        term150676 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term150768 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        Object term150874 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term150676, term150676.getClass(), "_deserializationContext", null);
        setField(term150676, term150676.getClass(), "_rootDeserializers", term150768);
        setField(term150676, term150676.getClass(), "_jsonFactory", null);
        setField(term150676, term150676.getClass(), "_rootNames", term150874);
        term150984 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term150984, term150984.getClass(), "_rootName", null);
        setIntField(term150984, term150984.getClass(), "_deserFeatures", -1);
        term151084 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term150676;
        args[1] = term150984;
        args[2] = term151084;
        args[3] = null;
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


