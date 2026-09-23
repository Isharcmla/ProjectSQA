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

public class ObjectReader_init_2073957032312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114076;
     Object term114278;
     Object term114376;
     Object term114458;

    public ObjectReader_init_2073957032312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term113798 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term113946 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term113984 = newInstance(Class.forName("java.lang.Object"));
        setField(term113798, term113798.getClass(), "_config", null);
        setField(term113798, term113798.getClass(), "_context", term113946);
        setField(term113798, term113798.getClass(), "_rootDeserializers", null);
        setField(term113798, term113798.getClass(), "_parserFactory", null);
        setField(term113798, term113798.getClass(), "_rootNames", null);
        setField(term113798, term113798.getClass(), "_valueType", null);
        setField(term113798, term113798.getClass(), "_valueToUpdate", term113984);
        setField(term113798, term113798.getClass(), "_schema", null);
        setField(term113798, term113798.getClass(), "_injectableValues", null);
        setBooleanField(term113798, term113798.getClass(), "_unwrapRoot", false);
        term114076 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term114168 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term114076, term114076.getClass(), "_deserializationContext", null);
        setField(term114076, term114076.getClass(), "_rootDeserializers", term114168);
        setField(term114076, term114076.getClass(), "_jsonFactory", null);
        setField(term114076, term114076.getClass(), "_rootNames", null);
        term114278 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term114278, term114278.getClass(), "_rootName", null);
        setIntField(term114278, term114278.getClass(), "_deserFeatures", -1);
        term114376 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term114458 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
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
        args[0] = term114076;
        args[1] = term114278;
        args[2] = term114376;
        args[3] = term114458;
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


