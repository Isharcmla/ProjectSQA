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

public class ObjectReader_init_2073957032372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175489;
     Object term175747;
     Object term175883;
     Object term175989;

    public ObjectReader_init_2073957032372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term175105 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term175253 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term175359 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term175397 = newInstance(Class.forName("java.lang.Object"));
        setField(term175105, term175105.getClass(), "_config", null);
        setField(term175105, term175105.getClass(), "_context", term175253);
        setField(term175105, term175105.getClass(), "_rootDeserializers", null);
        setField(term175105, term175105.getClass(), "_parserFactory", null);
        setField(term175105, term175105.getClass(), "_rootNames", term175359);
        setField(term175105, term175105.getClass(), "_valueType", null);
        setField(term175105, term175105.getClass(), "_valueToUpdate", term175397);
        setField(term175105, term175105.getClass(), "_schema", null);
        setField(term175105, term175105.getClass(), "_injectableValues", null);
        setBooleanField(term175105, term175105.getClass(), "_unwrapRoot", false);
        term175489 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term175637 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term175489, term175489.getClass(), "_deserializationContext", term175637);
        setField(term175489, term175489.getClass(), "_rootDeserializers", null);
        setField(term175489, term175489.getClass(), "_jsonFactory", null);
        setField(term175489, term175489.getClass(), "_rootNames", null);
        term175747 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term175747, term175747.getClass(), "_rootName", "EAGER_DESERIALIZ");
        setIntField(term175747, term175747.getClass(), "_deserFeatures", -1);
        term175883 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term175989 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
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
        args[0] = term175489;
        args[1] = term175747;
        args[2] = term175883;
        args[3] = term175989;
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


