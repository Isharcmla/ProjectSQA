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

public class ObjectReader_init_2073957032388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195198;
     Object term195390;
     Object term195496;
     Object term195642;

    public ObjectReader_init_2073957032388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term194614 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term195239 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term195280 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term194884 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term194998 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term195106 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term194614, term194614.getClass(), "_config", null);
        setField(term194614, term194614.getClass(), "_context", null);
        setField(term194614, term194614.getClass(), "_rootDeserializers", term195239);
        setField(term194614, term194614.getClass(), "_parserFactory", term195280);
        setField(term194614, term194614.getClass(), "_rootNames", term194884);
        setField(term194614, term194614.getClass(), "_valueType", term194998);
        setField(term194614, term194614.getClass(), "_valueToUpdate", null);
        setField(term194614, term194614.getClass(), "_schema", null);
        setField(term194614, term194614.getClass(), "_injectableValues", term195106);
        setBooleanField(term194614, term194614.getClass(), "_unwrapRoot", false);
        term195198 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term195198, term195198.getClass(), "_deserializationContext", null);
        setField(term195198, term195198.getClass(), "_rootDeserializers", term195239);
        setField(term195198, term195198.getClass(), "_jsonFactory", term195280);
        setField(term195198, term195198.getClass(), "_rootNames", null);
        term195390 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term195390, term195390.getClass(), "_rootName", null);
        setIntField(term195390, term195390.getClass(), "_deserFeatures", -1);
        term195496 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term195642 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term195198;
        args[1] = term195390;
        args[2] = term195496;
        args[3] = "";
        args[4] = null;
        args[5] = term195642;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


