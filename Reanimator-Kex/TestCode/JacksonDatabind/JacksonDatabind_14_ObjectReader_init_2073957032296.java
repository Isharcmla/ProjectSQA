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

public class ObjectReader_init_2073957032296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94219;
     Object term94411;
     Object term94549;
     Object term94657;

    public ObjectReader_init_2073957032296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term93751 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term93899 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term93981 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term94019 = newInstance(Class.forName("java.lang.Object"));
        Object term94127 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term93751, term93751.getClass(), "_config", null);
        setField(term93751, term93751.getClass(), "_context", term93899);
        setField(term93751, term93751.getClass(), "_rootDeserializers", term93981);
        setField(term93751, term93751.getClass(), "_parserFactory", null);
        setField(term93751, term93751.getClass(), "_rootNames", null);
        setField(term93751, term93751.getClass(), "_valueType", null);
        setField(term93751, term93751.getClass(), "_valueToUpdate", term94019);
        setField(term93751, term93751.getClass(), "_schema", null);
        setField(term93751, term93751.getClass(), "_injectableValues", term94127);
        setBooleanField(term93751, term93751.getClass(), "_unwrapRoot", false);
        term94219 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term94301 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term94219, term94219.getClass(), "_deserializationContext", null);
        setField(term94219, term94219.getClass(), "_rootDeserializers", term94301);
        setField(term94219, term94219.getClass(), "_jsonFactory", null);
        setField(term94219, term94219.getClass(), "_rootNames", null);
        term94411 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term94411, term94411.getClass(), "_rootName", "");
        setIntField(term94411, term94411.getClass(), "_deserFeatures", -1);
        term94549 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term94657 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term94219;
        args[1] = term94411;
        args[2] = term94549;
        args[3] = null;
        args[4] = null;
        args[5] = term94657;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


