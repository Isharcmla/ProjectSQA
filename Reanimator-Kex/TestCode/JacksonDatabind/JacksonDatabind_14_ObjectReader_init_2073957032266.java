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

public class ObjectReader_init_2073957032266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63249;
     Object term63523;
     Object term63621;

    public ObjectReader_init_2073957032266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term62757 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term62905 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term63011 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term63049 = newInstance(Class.forName("java.lang.Object"));
        Object term62488 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term63157 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term62757, term62757.getClass(), "_config", null);
        setField(term62757, term62757.getClass(), "_context", term62905);
        setField(term62757, term62757.getClass(), "_rootDeserializers", null);
        setField(term62757, term62757.getClass(), "_parserFactory", null);
        setField(term62757, term62757.getClass(), "_rootNames", term63011);
        setField(term62757, term62757.getClass(), "_valueType", null);
        setField(term62757, term62757.getClass(), "_valueToUpdate", term63049);
        setField(term62757, term62757.getClass(), "_schema", term62488);
        setField(term62757, term62757.getClass(), "_injectableValues", term63157);
        setBooleanField(term62757, term62757.getClass(), "_unwrapRoot", false);
        term63249 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term63331 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term63413 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term63249, term63249.getClass(), "_deserializationContext", null);
        setField(term63249, term63249.getClass(), "_rootDeserializers", term63331);
        setField(term63249, term63249.getClass(), "_jsonFactory", term63413);
        setField(term63249, term63249.getClass(), "_rootNames", null);
        term63523 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term63523, term63523.getClass(), "_rootName", null);
        setIntField(term63523, term63523.getClass(), "_deserFeatures", -1);
        term63621 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term63249;
        args[1] = term63523;
        args[2] = term63621;
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


