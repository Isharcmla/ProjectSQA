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

public class ObjectReader_init_2073957032263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43092;
     Object term43333;

    public ObjectReader_init_2073957032263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term42584 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term42694 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term42776 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term42858 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term42962 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term43000 = newInstance(Class.forName("java.lang.Object"));
        setField(term42584, term42584.getClass(), "_config", term42694);
        setField(term42584, term42584.getClass(), "_context", null);
        setField(term42584, term42584.getClass(), "_rootDeserializers", term42776);
        setField(term42584, term42584.getClass(), "_parserFactory", term42858);
        setField(term42584, term42584.getClass(), "_valueType", term42962);
        setField(term42584, term42584.getClass(), "_valueToUpdate", term43000);
        term43092 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term43174 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term43092, term43092.getClass(), "_deserializationContext", null);
        setField(term43092, term43092.getClass(), "_rootDeserializers", term43174);
        setField(term43092, term43092.getClass(), "_jsonFactory", null);
        term43333 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term43092;
        args[1] = null;
        args[2] = term43333;
        args[3] = term43333;
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


