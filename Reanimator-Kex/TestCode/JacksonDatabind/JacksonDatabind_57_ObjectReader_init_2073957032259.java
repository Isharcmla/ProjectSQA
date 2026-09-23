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
import org.mockito.Mockito;

public class ObjectReader_init_2073957032259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39764;
     Object term40104;
     Object term40288;
     Object term40396;

    public ObjectReader_init_2073957032259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39006 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term39116 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term39264 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term39346 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term39428 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term39526 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term39564 = newInstance(Class.forName("java.lang.Object"));
        Object term38885 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term39672 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term39006, term39006.getClass(), "_config", term39116);
        setField(term39006, term39006.getClass(), "_context", term39264);
        setField(term39006, term39006.getClass(), "_rootDeserializers", term39346);
        setField(term39006, term39006.getClass(), "_parserFactory", term39428);
        setField(term39006, term39006.getClass(), "_valueType", term39526);
        setField(term39006, term39006.getClass(), "_valueToUpdate", term39564);
        setField(term39006, term39006.getClass(), "_schema", term38885);
        setField(term39006, term39006.getClass(), "_injectableValues", term39672);
        term39764 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term39912 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term39994 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term39764, term39764.getClass(), "_deserializationContext", term39912);
        setField(term39764, term39764.getClass(), "_rootDeserializers", term39994);
        setField(term39764, term39764.getClass(), "_jsonFactory", null);
        term40104 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term40196 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term40104, term40104.getClass(), "_rootName", term40196);
        term40288 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term40396 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term39764;
        args[1] = term40104;
        args[2] = term40288;
        args[3] = null;
        args[4] = null;
        args[5] = term40396;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


