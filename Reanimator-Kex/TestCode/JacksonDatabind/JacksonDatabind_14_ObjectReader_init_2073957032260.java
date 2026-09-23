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

public class ObjectReader_init_2073957032260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57221;
     Object term57466;
     Object term57564;
     Object term57710;

    public ObjectReader_init_2073957032260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56659 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term57262 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term57303 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term57356 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term57021 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term56392 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term57129 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term56659, term56659.getClass(), "_config", null);
        setField(term56659, term56659.getClass(), "_context", null);
        setField(term56659, term56659.getClass(), "_rootDeserializers", term57262);
        setField(term56659, term56659.getClass(), "_parserFactory", term57303);
        setField(term56659, term56659.getClass(), "_rootNames", term57356);
        setField(term56659, term56659.getClass(), "_valueType", term57021);
        setField(term56659, term56659.getClass(), "_valueToUpdate", null);
        setField(term56659, term56659.getClass(), "_schema", term56392);
        setField(term56659, term56659.getClass(), "_injectableValues", term57129);
        setBooleanField(term56659, term56659.getClass(), "_unwrapRoot", false);
        term57221 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term57221, term57221.getClass(), "_deserializationContext", null);
        setField(term57221, term57221.getClass(), "_rootDeserializers", term57262);
        setField(term57221, term57221.getClass(), "_jsonFactory", term57303);
        setField(term57221, term57221.getClass(), "_rootNames", term57356);
        term57466 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term57466, term57466.getClass(), "_rootName", null);
        setIntField(term57466, term57466.getClass(), "_deserFeatures", -1);
        term57564 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term57710 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term57221;
        args[1] = term57466;
        args[2] = term57564;
        args[3] = "";
        args[4] = null;
        args[5] = term57710;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


