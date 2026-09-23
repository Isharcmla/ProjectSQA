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

public class ObjectReader_init_2073957032268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65430;
     Object term65770;
     Object term65868;

    public ObjectReader_init_2073957032268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term65080 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term65190 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term65338 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term65080, term65080.getClass(), "_config", term65190);
        setField(term65080, term65080.getClass(), "_context", term65338);
        setField(term65080, term65080.getClass(), "_rootDeserializers", null);
        setField(term65080, term65080.getClass(), "_parserFactory", null);
        setField(term65080, term65080.getClass(), "_rootNames", null);
        setField(term65080, term65080.getClass(), "_valueType", null);
        setField(term65080, term65080.getClass(), "_valueToUpdate", null);
        setField(term65080, term65080.getClass(), "_schema", null);
        setField(term65080, term65080.getClass(), "_injectableValues", null);
        setBooleanField(term65080, term65080.getClass(), "_unwrapRoot", false);
        term65430 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term65578 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term65660 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term65430, term65430.getClass(), "_deserializationContext", term65578);
        setField(term65430, term65430.getClass(), "_rootDeserializers", term65660);
        setField(term65430, term65430.getClass(), "_jsonFactory", null);
        setField(term65430, term65430.getClass(), "_rootNames", null);
        term65770 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term65770, term65770.getClass(), "_rootName", null);
        setIntField(term65770, term65770.getClass(), "_deserFeatures", -1);
        term65868 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term65430;
        args[1] = term65770;
        args[2] = term65868;
        args[3] = "";
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


