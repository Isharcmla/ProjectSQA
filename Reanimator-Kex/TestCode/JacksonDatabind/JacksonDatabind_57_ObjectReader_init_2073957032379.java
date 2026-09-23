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

public class ObjectReader_init_2073957032379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152068;
     Object term152326;
     Object term152418;

    public ObjectReader_init_2073957032379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151866 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term151976 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term151866, term151866.getClass(), "_config", term151976);
        setField(term151866, term151866.getClass(), "_context", null);
        setField(term151866, term151866.getClass(), "_rootDeserializers", null);
        setField(term151866, term151866.getClass(), "_parserFactory", null);
        setField(term151866, term151866.getClass(), "_valueType", null);
        setField(term151866, term151866.getClass(), "_valueToUpdate", null);
        setField(term151866, term151866.getClass(), "_schema", null);
        setField(term151866, term151866.getClass(), "_injectableValues", null);
        setBooleanField(term151866, term151866.getClass(), "_unwrapRoot", false);
        term152068 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term152216 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term152068, term152068.getClass(), "_deserializationContext", term152216);
        setField(term152068, term152068.getClass(), "_rootDeserializers", null);
        setField(term152068, term152068.getClass(), "_jsonFactory", null);
        term152326 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term152326, term152326.getClass(), "_rootName", null);
        setIntField(term152326, term152326.getClass(), "_deserFeatures", -1);
        term152418 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term152068;
        args[1] = term152326;
        args[2] = term152418;
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


