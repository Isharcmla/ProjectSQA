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

public class ObjectReader_init_2073957032376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168812;
     Object term169014;
     Object term169250;

    public ObjectReader_init_2073957032376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term168610 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term168720 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term168610, term168610.getClass(), "_config", term168720);
        setField(term168610, term168610.getClass(), "_context", null);
        setField(term168610, term168610.getClass(), "_rootDeserializers", null);
        setField(term168610, term168610.getClass(), "_parserFactory", null);
        setField(term168610, term168610.getClass(), "_valueType", null);
        setField(term168610, term168610.getClass(), "_valueToUpdate", null);
        setField(term168610, term168610.getClass(), "_schema", null);
        setField(term168610, term168610.getClass(), "_injectableValues", null);
        setBooleanField(term168610, term168610.getClass(), "_unwrapRoot", false);
        term168812 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term168904 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term168812, term168812.getClass(), "_deserializationContext", null);
        setField(term168812, term168812.getClass(), "_rootDeserializers", term168904);
        setField(term168812, term168812.getClass(), "_jsonFactory", null);
        term169014 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term169106 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term169106, term169106.getClass(), "_namespace", null);
        setField(term169106, term169106.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term169014, term169014.getClass(), "_rootName", term169106);
        setIntField(term169014, term169014.getClass(), "_deserFeatures", -1);
        term169250 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
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
        args[0] = term168812;
        args[1] = term169014;
        args[2] = term169250;
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


