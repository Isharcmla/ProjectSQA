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

public class ObjectReader_init_2073957032278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77486;
     Object term77932;
     Object term78030;
     Object term78168;

    public ObjectReader_init_2073957032278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77164 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term77312 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term77394 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term77164, term77164.getClass(), "_config", null);
        setField(term77164, term77164.getClass(), "_context", term77312);
        setField(term77164, term77164.getClass(), "_rootDeserializers", term77394);
        setField(term77164, term77164.getClass(), "_parserFactory", null);
        setField(term77164, term77164.getClass(), "_rootNames", null);
        setField(term77164, term77164.getClass(), "_valueType", null);
        setField(term77164, term77164.getClass(), "_valueToUpdate", null);
        setField(term77164, term77164.getClass(), "_schema", null);
        setField(term77164, term77164.getClass(), "_injectableValues", null);
        setBooleanField(term77164, term77164.getClass(), "_unwrapRoot", false);
        term77486 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term77634 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term77716 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term77822 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term77486, term77486.getClass(), "_deserializationContext", term77634);
        setField(term77486, term77486.getClass(), "_rootDeserializers", term77716);
        setField(term77486, term77486.getClass(), "_jsonFactory", null);
        setField(term77486, term77486.getClass(), "_rootNames", term77822);
        term77932 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term77932, term77932.getClass(), "_rootName", null);
        setIntField(term77932, term77932.getClass(), "_deserFeatures", -1);
        term78030 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term78168 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer"));
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
        args[0] = term77486;
        args[1] = term77932;
        args[2] = term78030;
        args[3] = term78168;
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


