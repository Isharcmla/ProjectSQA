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

public class ObjectReader_init_2073957032487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287257;
     Object term287607;
     Object term287713;
     Object term287821;

    public ObjectReader_init_2073957032487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term287055 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term287165 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term287055, term287055.getClass(), "_config", term287165);
        setField(term287055, term287055.getClass(), "_context", null);
        setField(term287055, term287055.getClass(), "_rootDeserializers", null);
        setField(term287055, term287055.getClass(), "_parserFactory", null);
        setField(term287055, term287055.getClass(), "_valueType", null);
        setField(term287055, term287055.getClass(), "_valueToUpdate", null);
        setField(term287055, term287055.getClass(), "_schema", null);
        setField(term287055, term287055.getClass(), "_injectableValues", null);
        setBooleanField(term287055, term287055.getClass(), "_unwrapRoot", false);
        term287257 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term287405 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term287497 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term287257, term287257.getClass(), "_deserializationContext", term287405);
        setField(term287257, term287257.getClass(), "_rootDeserializers", term287497);
        setField(term287257, term287257.getClass(), "_jsonFactory", null);
        term287607 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term287607, term287607.getClass(), "_rootName", null);
        setIntField(term287607, term287607.getClass(), "_deserFeatures", -1);
        term287713 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term287821 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term287257;
        args[1] = term287607;
        args[2] = term287713;
        args[3] = null;
        args[4] = null;
        args[5] = term287821;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


