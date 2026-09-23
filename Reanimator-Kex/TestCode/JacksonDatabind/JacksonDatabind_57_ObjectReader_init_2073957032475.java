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

public class ObjectReader_init_2073957032475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270770;
     Object term271120;
     Object term271354;

    public ObjectReader_init_2073957032475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term270678 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term270678, term270678.getClass(), "_config", null);
        setField(term270678, term270678.getClass(), "_context", null);
        setField(term270678, term270678.getClass(), "_rootDeserializers", null);
        setField(term270678, term270678.getClass(), "_parserFactory", null);
        setField(term270678, term270678.getClass(), "_valueType", null);
        setField(term270678, term270678.getClass(), "_valueToUpdate", null);
        setField(term270678, term270678.getClass(), "_schema", null);
        setField(term270678, term270678.getClass(), "_injectableValues", null);
        setBooleanField(term270678, term270678.getClass(), "_unwrapRoot", false);
        term270770 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term270918 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term271010 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term270770, term270770.getClass(), "_deserializationContext", term270918);
        setField(term270770, term270770.getClass(), "_rootDeserializers", term271010);
        setField(term270770, term270770.getClass(), "_jsonFactory", null);
        term271120 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term271212 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term271212, term271212.getClass(), "_namespace", null);
        setField(term271212, term271212.getClass(), "_simpleName", "");
        setField(term271120, term271120.getClass(), "_rootName", term271212);
        setIntField(term271120, term271120.getClass(), "_deserFeatures", -1);
        term271354 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term270770;
        args[1] = term271120;
        args[2] = term271354;
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


