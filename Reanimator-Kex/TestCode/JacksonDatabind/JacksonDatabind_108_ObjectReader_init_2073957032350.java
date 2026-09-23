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

public class ObjectReader_init_2073957032350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132319;
     Object term132659;
     Object term132903;
     Object term133013;

    public ObjectReader_init_2073957032350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term131867 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term132015 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term132097 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term132189 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term132227 = newInstance(Class.forName("java.lang.Object"));
        Object term131554 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term131867, term131867.getClass(), "_config", null);
        setField(term131867, term131867.getClass(), "_context", term132015);
        setField(term131867, term131867.getClass(), "_rootDeserializers", term132097);
        setField(term131867, term131867.getClass(), "_parserFactory", null);
        setField(term131867, term131867.getClass(), "_valueType", term132189);
        setField(term131867, term131867.getClass(), "_valueToUpdate", term132227);
        setField(term131867, term131867.getClass(), "_schema", term131554);
        setField(term131867, term131867.getClass(), "_injectableValues", null);
        setBooleanField(term131867, term131867.getClass(), "_unwrapRoot", false);
        term132319 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term132467 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term132549 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term132319, term132319.getClass(), "_deserializationContext", term132467);
        setField(term132319, term132319.getClass(), "_rootDeserializers", term132549);
        setField(term132319, term132319.getClass(), "_jsonFactory", null);
        term132659 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term132751 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term132751, term132751.getClass(), "_namespace", "");
        setField(term132659, term132659.getClass(), "_rootName", term132751);
        setIntField(term132659, term132659.getClass(), "_deserFeatures", -1);
        term132903 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        term133013 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
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
        args[0] = term132319;
        args[1] = term132659;
        args[2] = term132903;
        args[3] = term133013;
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


