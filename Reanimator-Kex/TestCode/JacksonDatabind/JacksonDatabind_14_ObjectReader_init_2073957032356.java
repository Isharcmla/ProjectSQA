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

public class ObjectReader_init_2073957032356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158330;
     Object term158522;
     Object term158637;
     Object term156769;

    public ObjectReader_init_2073957032356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term157756 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term157904 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term157986 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term158092 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term158238 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term157756, term157756.getClass(), "_config", null);
        setField(term157756, term157756.getClass(), "_context", term157904);
        setField(term157756, term157756.getClass(), "_rootDeserializers", null);
        setField(term157756, term157756.getClass(), "_parserFactory", term157986);
        setField(term157756, term157756.getClass(), "_rootNames", term158092);
        setField(term157756, term157756.getClass(), "_valueType", null);
        setField(term157756, term157756.getClass(), "_valueToUpdate", "");
        setField(term157756, term157756.getClass(), "_schema", null);
        setField(term157756, term157756.getClass(), "_injectableValues", term158238);
        setBooleanField(term157756, term157756.getClass(), "_unwrapRoot", false);
        term158330 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term158412 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term158330, term158330.getClass(), "_deserializationContext", null);
        setField(term158330, term158330.getClass(), "_rootDeserializers", term158412);
        setField(term158330, term158330.getClass(), "_jsonFactory", null);
        setField(term158330, term158330.getClass(), "_rootNames", null);
        term158522 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term158522, term158522.getClass(), "_rootName", "");
        setIntField(term158522, term158522.getClass(), "_deserFeatures", -1);
        term158637 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term156769 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term158330;
        args[1] = term158522;
        args[2] = term158637;
        args[3] = null;
        args[4] = term156769;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


