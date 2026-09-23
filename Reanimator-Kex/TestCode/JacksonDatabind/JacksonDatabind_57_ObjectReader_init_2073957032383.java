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

public class ObjectReader_init_2073957032383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156864;
     Object term157122;
     Object term157356;

    public ObjectReader_init_2073957032383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term156772 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setField(term156772, term156772.getClass(), "_config", null);
        setField(term156772, term156772.getClass(), "_context", null);
        setField(term156772, term156772.getClass(), "_rootDeserializers", null);
        setField(term156772, term156772.getClass(), "_parserFactory", null);
        setField(term156772, term156772.getClass(), "_valueType", null);
        setField(term156772, term156772.getClass(), "_valueToUpdate", null);
        setField(term156772, term156772.getClass(), "_schema", null);
        setField(term156772, term156772.getClass(), "_injectableValues", null);
        setBooleanField(term156772, term156772.getClass(), "_unwrapRoot", false);
        term156864 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term157012 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term156864, term156864.getClass(), "_deserializationContext", term157012);
        setField(term156864, term156864.getClass(), "_rootDeserializers", null);
        setField(term156864, term156864.getClass(), "_jsonFactory", null);
        term157122 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term157214 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term157214, term157214.getClass(), "_namespace", "");
        setField(term157122, term157122.getClass(), "_rootName", term157214);
        setIntField(term157122, term157122.getClass(), "_deserFeatures", -1);
        term157356 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term156864;
        args[1] = term157122;
        args[2] = term157356;
        args[3] = "";
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


