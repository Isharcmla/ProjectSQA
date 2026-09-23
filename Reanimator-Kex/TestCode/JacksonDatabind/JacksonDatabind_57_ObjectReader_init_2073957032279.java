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

public class ObjectReader_init_2073957032279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54855;
     Object term55113;
     Object term55217;
     Object term55263;

    public ObjectReader_init_2073957032279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55263 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term55318 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term55263, term55263.getClass(), "_config", term55318);
        setField(term55263, term55263.getClass(), "_context", null);
        setField(term55263, term55263.getClass(), "_rootDeserializers", null);
        setField(term55263, term55263.getClass(), "_parserFactory", null);
        setField(term55263, term55263.getClass(), "_valueType", null);
        setField(term55263, term55263.getClass(), "_valueToUpdate", null);
        setField(term55263, term55263.getClass(), "_schema", null);
        setField(term55263, term55263.getClass(), "_injectableValues", null);
        setBooleanField(term55263, term55263.getClass(), "_unwrapRoot", false);
        term54855 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term55003 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term54855, term54855.getClass(), "_deserializationContext", term55003);
        setField(term54855, term54855.getClass(), "_rootDeserializers", null);
        setField(term54855, term54855.getClass(), "_jsonFactory", null);
        term55113 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term55113, term55113.getClass(), "_rootName", null);
        setIntField(term55113, term55113.getClass(), "_deserFeatures", -1);
        term55217 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term54855;
        args[1] = term55113;
        args[2] = term55217;
        args[3] = term55263;
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


