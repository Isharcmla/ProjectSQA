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

public class ObjectReader_init_2073957032405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186624;
     Object term186974;
     Object term187210;

    public ObjectReader_init_2073957032405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term186422 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term186532 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term186422, term186422.getClass(), "_config", term186532);
        setField(term186422, term186422.getClass(), "_context", null);
        setField(term186422, term186422.getClass(), "_rootDeserializers", null);
        setField(term186422, term186422.getClass(), "_parserFactory", null);
        setField(term186422, term186422.getClass(), "_valueType", null);
        setField(term186422, term186422.getClass(), "_valueToUpdate", null);
        setField(term186422, term186422.getClass(), "_schema", null);
        setField(term186422, term186422.getClass(), "_injectableValues", null);
        setBooleanField(term186422, term186422.getClass(), "_unwrapRoot", false);
        term186624 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term186772 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term186864 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term186624, term186624.getClass(), "_deserializationContext", term186772);
        setField(term186624, term186624.getClass(), "_rootDeserializers", term186864);
        setField(term186624, term186624.getClass(), "_jsonFactory", null);
        term186974 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term187066 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term187066, term187066.getClass(), "_namespace", null);
        setField(term187066, term187066.getClass(), "_simpleName", "");
        setField(term186974, term186974.getClass(), "_rootName", term187066);
        setIntField(term186974, term186974.getClass(), "_deserFeatures", -1);
        term187210 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term186624;
        args[1] = term186974;
        args[2] = term187210;
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


