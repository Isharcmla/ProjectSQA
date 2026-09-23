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

public class ObjectReader_init_2073957032342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143916;
     Object term144108;
     Object term144200;

    public ObjectReader_init_2073957032342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term143566 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term143676 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term143824 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term143566, term143566.getClass(), "_config", term143676);
        setField(term143566, term143566.getClass(), "_context", term143824);
        setField(term143566, term143566.getClass(), "_rootDeserializers", null);
        setField(term143566, term143566.getClass(), "_parserFactory", null);
        setField(term143566, term143566.getClass(), "_rootNames", null);
        setField(term143566, term143566.getClass(), "_valueType", null);
        setField(term143566, term143566.getClass(), "_valueToUpdate", null);
        setField(term143566, term143566.getClass(), "_schema", null);
        setField(term143566, term143566.getClass(), "_injectableValues", null);
        setBooleanField(term143566, term143566.getClass(), "_unwrapRoot", false);
        term143916 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term143998 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term143916, term143916.getClass(), "_deserializationContext", null);
        setField(term143916, term143916.getClass(), "_rootDeserializers", term143998);
        setField(term143916, term143916.getClass(), "_jsonFactory", null);
        setField(term143916, term143916.getClass(), "_rootNames", null);
        term144108 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term144108, term144108.getClass(), "_rootName", null);
        setIntField(term144108, term144108.getClass(), "_deserFeatures", -1);
        term144200 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term143916;
        args[1] = term144108;
        args[2] = term144200;
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


