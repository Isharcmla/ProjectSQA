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

public class ObjectReader_init_2073957032380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177282;
     Object term177632;
     Object term177876;

    public ObjectReader_init_2073957032380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term176850 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term176960 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term177108 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term177190 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term176850, term176850.getClass(), "_config", term176960);
        setField(term176850, term176850.getClass(), "_context", term177108);
        setField(term176850, term176850.getClass(), "_rootDeserializers", term177190);
        setField(term176850, term176850.getClass(), "_parserFactory", null);
        setField(term176850, term176850.getClass(), "_valueType", null);
        setField(term176850, term176850.getClass(), "_valueToUpdate", null);
        setField(term176850, term176850.getClass(), "_schema", null);
        setField(term176850, term176850.getClass(), "_injectableValues", null);
        setBooleanField(term176850, term176850.getClass(), "_unwrapRoot", false);
        term177282 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term177430 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term177522 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term177282, term177282.getClass(), "_deserializationContext", term177430);
        setField(term177282, term177282.getClass(), "_rootDeserializers", term177522);
        setField(term177282, term177282.getClass(), "_jsonFactory", null);
        term177632 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term177724 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term177724, term177724.getClass(), "_namespace", null);
        setField(term177724, term177724.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term177632, term177632.getClass(), "_rootName", term177724);
        setIntField(term177632, term177632.getClass(), "_deserFeatures", -1);
        term177876 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.PlaceholderForType"));
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
        args[0] = term177282;
        args[1] = term177632;
        args[2] = term177876;
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


