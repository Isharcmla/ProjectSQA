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

public class ObjectReader_init_2073957032346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124315;
     Object term124425;
     Object term124653;

    public ObjectReader_init_2073957032346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term124113 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term124223 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term124113, term124113.getClass(), "_config", term124223);
        setField(term124113, term124113.getClass(), "_context", null);
        setField(term124113, term124113.getClass(), "_rootDeserializers", null);
        setField(term124113, term124113.getClass(), "_parserFactory", null);
        setField(term124113, term124113.getClass(), "_valueType", null);
        setField(term124113, term124113.getClass(), "_valueToUpdate", null);
        setField(term124113, term124113.getClass(), "_schema", null);
        setField(term124113, term124113.getClass(), "_injectableValues", null);
        setBooleanField(term124113, term124113.getClass(), "_unwrapRoot", false);
        term124315 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term124315, term124315.getClass(), "_deserializationContext", null);
        setField(term124315, term124315.getClass(), "_rootDeserializers", null);
        setField(term124315, term124315.getClass(), "_jsonFactory", null);
        term124425 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term124517 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term124517, term124517.getClass(), "_namespace", null);
        setField(term124517, term124517.getClass(), "_simpleName", "");
        setField(term124425, term124425.getClass(), "_rootName", term124517);
        setIntField(term124425, term124425.getClass(), "_deserFeatures", -1);
        term124653 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term124315;
        args[1] = term124425;
        args[2] = term124653;
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


