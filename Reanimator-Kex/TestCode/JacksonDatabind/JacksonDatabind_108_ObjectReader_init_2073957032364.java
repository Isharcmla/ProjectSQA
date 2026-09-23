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

public class ObjectReader_init_2073957032364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151535;
     Object term151885;
     Object term152121;

    public ObjectReader_init_2073957032364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151147 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term151257 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term151405 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term151443 = newInstance(Class.forName("java.lang.Object"));
        setField(term151147, term151147.getClass(), "_config", term151257);
        setField(term151147, term151147.getClass(), "_context", term151405);
        setField(term151147, term151147.getClass(), "_rootDeserializers", null);
        setField(term151147, term151147.getClass(), "_parserFactory", null);
        setField(term151147, term151147.getClass(), "_valueType", null);
        setField(term151147, term151147.getClass(), "_valueToUpdate", term151443);
        setField(term151147, term151147.getClass(), "_schema", null);
        setField(term151147, term151147.getClass(), "_injectableValues", null);
        setBooleanField(term151147, term151147.getClass(), "_unwrapRoot", false);
        term151535 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term151683 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term151775 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term151535, term151535.getClass(), "_deserializationContext", term151683);
        setField(term151535, term151535.getClass(), "_rootDeserializers", term151775);
        setField(term151535, term151535.getClass(), "_jsonFactory", null);
        term151885 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term151977 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term151977, term151977.getClass(), "_namespace", "FAIL_ON_MISSING_CREATOR_PROPERTIES");
        setField(term151885, term151885.getClass(), "_rootName", term151977);
        setIntField(term151885, term151885.getClass(), "_deserFeatures", -1);
        term152121 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term151535;
        args[1] = term151885;
        args[2] = term152121;
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


