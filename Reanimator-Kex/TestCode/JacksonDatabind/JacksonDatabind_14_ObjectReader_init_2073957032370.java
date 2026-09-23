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
import org.mockito.Mockito;

public class ObjectReader_init_2073957032370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173188;
     Object term173433;
     Object term173525;
     Object term173671;

    public ObjectReader_init_2073957032370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term172620 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term173229 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term173270 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term173323 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term172988 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term172353 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term173096 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term172620, term172620.getClass(), "_config", null);
        setField(term172620, term172620.getClass(), "_context", null);
        setField(term172620, term172620.getClass(), "_rootDeserializers", term173229);
        setField(term172620, term172620.getClass(), "_parserFactory", term173270);
        setField(term172620, term172620.getClass(), "_rootNames", term173323);
        setField(term172620, term172620.getClass(), "_valueType", term172988);
        setField(term172620, term172620.getClass(), "_valueToUpdate", null);
        setField(term172620, term172620.getClass(), "_schema", term172353);
        setField(term172620, term172620.getClass(), "_injectableValues", term173096);
        setBooleanField(term172620, term172620.getClass(), "_unwrapRoot", false);
        term173188 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term173188, term173188.getClass(), "_deserializationContext", null);
        setField(term173188, term173188.getClass(), "_rootDeserializers", term173229);
        setField(term173188, term173188.getClass(), "_jsonFactory", term173270);
        setField(term173188, term173188.getClass(), "_rootNames", term173323);
        term173433 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term173433, term173433.getClass(), "_rootName", null);
        setIntField(term173433, term173433.getClass(), "_deserFeatures", -1);
        term173525 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term173671 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term173188;
        args[1] = term173433;
        args[2] = term173525;
        args[3] = "";
        args[4] = null;
        args[5] = term173671;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


