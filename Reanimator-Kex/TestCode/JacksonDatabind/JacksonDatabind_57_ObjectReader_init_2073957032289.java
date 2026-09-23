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

public class ObjectReader_init_2073957032289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63643;
     Object term63835;
     Object term64031;
     Object term64113;
     Object term62950;

    public ObjectReader_init_2073957032289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63081 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term63191 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term63339 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term63421 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term63513 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term63551 = newInstance(Class.forName("java.lang.Object"));
        setField(term63081, term63081.getClass(), "_config", term63191);
        setField(term63081, term63081.getClass(), "_context", term63339);
        setField(term63081, term63081.getClass(), "_rootDeserializers", term63421);
        setField(term63081, term63081.getClass(), "_parserFactory", null);
        setField(term63081, term63081.getClass(), "_valueType", term63513);
        setField(term63081, term63081.getClass(), "_valueToUpdate", term63551);
        setField(term63081, term63081.getClass(), "_schema", null);
        setField(term63081, term63081.getClass(), "_injectableValues", null);
        term63643 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term63725 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term63643, term63643.getClass(), "_deserializationContext", null);
        setField(term63643, term63643.getClass(), "_rootDeserializers", null);
        setField(term63643, term63643.getClass(), "_jsonFactory", term63725);
        term63835 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term63927 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term63835, term63835.getClass(), "_rootName", term63927);
        term64031 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term64113 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term62950 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term63643;
        args[1] = term63835;
        args[2] = term64031;
        args[3] = term64113;
        args[4] = term62950;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


