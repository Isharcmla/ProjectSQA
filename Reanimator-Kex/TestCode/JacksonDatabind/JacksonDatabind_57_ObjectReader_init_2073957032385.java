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

public class ObjectReader_init_2073957032385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159103;
     Object term159443;
     Object term159673;

    public ObjectReader_init_2073957032385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term158901 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term159011 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term158901, term158901.getClass(), "_config", term159011);
        setField(term158901, term158901.getClass(), "_context", null);
        setField(term158901, term158901.getClass(), "_rootDeserializers", null);
        setField(term158901, term158901.getClass(), "_parserFactory", null);
        setField(term158901, term158901.getClass(), "_valueType", null);
        setField(term158901, term158901.getClass(), "_valueToUpdate", null);
        setField(term158901, term158901.getClass(), "_schema", null);
        setField(term158901, term158901.getClass(), "_injectableValues", null);
        setBooleanField(term158901, term158901.getClass(), "_unwrapRoot", false);
        term159103 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term159251 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term159333 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term159103, term159103.getClass(), "_deserializationContext", term159251);
        setField(term159103, term159103.getClass(), "_rootDeserializers", term159333);
        setField(term159103, term159103.getClass(), "_jsonFactory", null);
        term159443 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term159535 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term159535, term159535.getClass(), "_namespace", "READ_DATE_TIMESTAMPS_AS_NANOSECONDS");
        setField(term159443, term159443.getClass(), "_rootName", term159535);
        setIntField(term159443, term159443.getClass(), "_deserFeatures", -1);
        term159673 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term159103;
        args[1] = term159443;
        args[2] = term159673;
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


