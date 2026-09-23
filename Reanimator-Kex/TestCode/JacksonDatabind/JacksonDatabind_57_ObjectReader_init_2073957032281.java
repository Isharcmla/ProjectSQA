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

public class ObjectReader_init_2073957032281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56567;
     Object term56825;
     Object term57021;
     Object term57131;
     Object term57239;

    public ObjectReader_init_2073957032281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56137 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term56247 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term56329 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term56367 = newInstance(Class.forName("java.lang.Object"));
        Object term56475 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term56137, term56137.getClass(), "_config", term56247);
        setField(term56137, term56137.getClass(), "_context", null);
        setField(term56137, term56137.getClass(), "_rootDeserializers", term56329);
        setField(term56137, term56137.getClass(), "_parserFactory", null);
        setField(term56137, term56137.getClass(), "_valueType", null);
        setField(term56137, term56137.getClass(), "_valueToUpdate", term56367);
        setField(term56137, term56137.getClass(), "_schema", null);
        setField(term56137, term56137.getClass(), "_injectableValues", term56475);
        term56567 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term56715 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term56567, term56567.getClass(), "_deserializationContext", term56715);
        setField(term56567, term56567.getClass(), "_rootDeserializers", null);
        setField(term56567, term56567.getClass(), "_jsonFactory", null);
        term56825 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term56917 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term56825, term56825.getClass(), "_rootName", term56917);
        term57021 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term57131 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term57239 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term56567;
        args[1] = term56825;
        args[2] = term57021;
        args[3] = term57131;
        args[4] = null;
        args[5] = term57239;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


