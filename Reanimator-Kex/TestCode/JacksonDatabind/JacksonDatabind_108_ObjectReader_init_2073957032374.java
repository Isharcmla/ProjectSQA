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

public class ObjectReader_init_2073957032374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165949;
     Object term166151;
     Object term166373;
     Object term166481;

    public ObjectReader_init_2073957032374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term165601 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term165749 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term165857 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term165601, term165601.getClass(), "_config", null);
        setField(term165601, term165601.getClass(), "_context", term165749);
        setField(term165601, term165601.getClass(), "_rootDeserializers", null);
        setField(term165601, term165601.getClass(), "_parserFactory", null);
        setField(term165601, term165601.getClass(), "_valueType", null);
        setField(term165601, term165601.getClass(), "_valueToUpdate", term165601);
        setField(term165601, term165601.getClass(), "_schema", null);
        setField(term165601, term165601.getClass(), "_injectableValues", term165857);
        setBooleanField(term165601, term165601.getClass(), "_unwrapRoot", false);
        term165949 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term166041 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term165949, term165949.getClass(), "_deserializationContext", null);
        setField(term165949, term165949.getClass(), "_rootDeserializers", term166041);
        setField(term165949, term165949.getClass(), "_jsonFactory", null);
        term166151 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term166243 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term166243, term166243.getClass(), "_namespace", null);
        setField(term166243, term166243.getClass(), "_simpleName", "");
        setField(term166151, term166151.getClass(), "_rootName", term166243);
        setIntField(term166151, term166151.getClass(), "_deserFeatures", -1);
        term166373 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term166481 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term165949;
        args[1] = term166151;
        args[2] = term166373;
        args[3] = term166481;
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


