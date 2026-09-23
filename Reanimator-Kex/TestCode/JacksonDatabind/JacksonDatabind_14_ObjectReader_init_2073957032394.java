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

public class ObjectReader_init_2073957032394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201618;
     Object term201958;
     Object term202064;

    public ObjectReader_init_2073957032394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term201268 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term201378 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term201526 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term201268, term201268.getClass(), "_config", term201378);
        setField(term201268, term201268.getClass(), "_context", term201526);
        setField(term201268, term201268.getClass(), "_rootDeserializers", null);
        setField(term201268, term201268.getClass(), "_parserFactory", null);
        setField(term201268, term201268.getClass(), "_rootNames", null);
        setField(term201268, term201268.getClass(), "_valueType", null);
        setField(term201268, term201268.getClass(), "_valueToUpdate", null);
        setField(term201268, term201268.getClass(), "_schema", null);
        setField(term201268, term201268.getClass(), "_injectableValues", null);
        setBooleanField(term201268, term201268.getClass(), "_unwrapRoot", false);
        term201618 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term201766 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term201848 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term201618, term201618.getClass(), "_deserializationContext", term201766);
        setField(term201618, term201618.getClass(), "_rootDeserializers", term201848);
        setField(term201618, term201618.getClass(), "_jsonFactory", null);
        setField(term201618, term201618.getClass(), "_rootNames", null);
        term201958 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term201958, term201958.getClass(), "_rootName", null);
        setIntField(term201958, term201958.getClass(), "_deserFeatures", -1);
        term202064 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term201618;
        args[1] = term201958;
        args[2] = term202064;
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


