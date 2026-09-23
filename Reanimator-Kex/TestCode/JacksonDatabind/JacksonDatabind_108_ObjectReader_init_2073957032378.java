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

public class ObjectReader_init_2073957032378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173980;
     Object term174182;
     Object term174404;

    public ObjectReader_init_2073957032378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term173404 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term173514 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term173662 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term173744 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term173850 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        setField(term173404, term173404.getClass(), "_config", term173514);
        setField(term173404, term173404.getClass(), "_context", term173662);
        setField(term173404, term173404.getClass(), "_rootDeserializers", term173744);
        setField(term173404, term173404.getClass(), "_parserFactory", null);
        setField(term173404, term173404.getClass(), "_valueType", term173850);
        setField(term173404, term173404.getClass(), "_valueToUpdate", "READ_ENUMS_USING_TO_STRING");
        setField(term173404, term173404.getClass(), "_schema", null);
        setField(term173404, term173404.getClass(), "_injectableValues", null);
        setBooleanField(term173404, term173404.getClass(), "_unwrapRoot", false);
        term173980 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term174072 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term173980, term173980.getClass(), "_deserializationContext", null);
        setField(term173980, term173980.getClass(), "_rootDeserializers", term174072);
        setField(term173980, term173980.getClass(), "_jsonFactory", null);
        term174182 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term174274 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term174274, term174274.getClass(), "_namespace", null);
        setField(term174274, term174274.getClass(), "_simpleName", "  ");
        setField(term174182, term174182.getClass(), "_rootName", term174274);
        setIntField(term174182, term174182.getClass(), "_deserFeatures", -1);
        term174404 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term173980;
        args[1] = term174182;
        args[2] = term174404;
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


