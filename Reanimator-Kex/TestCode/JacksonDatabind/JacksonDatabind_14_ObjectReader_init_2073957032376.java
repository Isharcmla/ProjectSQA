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
     Object term180579;
     Object term180781;
     Object term180925;
     Object term181017;
     Object term181125;

    public ObjectReader_init_2073957032376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term180229 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term180339 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term180487 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term180229, term180229.getClass(), "_config", term180339);
        setField(term180229, term180229.getClass(), "_context", term180487);
        setField(term180229, term180229.getClass(), "_rootDeserializers", null);
        setField(term180229, term180229.getClass(), "_parserFactory", null);
        setField(term180229, term180229.getClass(), "_rootNames", null);
        setField(term180229, term180229.getClass(), "_valueType", null);
        setField(term180229, term180229.getClass(), "_valueToUpdate", null);
        setField(term180229, term180229.getClass(), "_schema", null);
        setField(term180229, term180229.getClass(), "_injectableValues", null);
        setBooleanField(term180229, term180229.getClass(), "_unwrapRoot", false);
        term180579 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term180671 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term180579, term180579.getClass(), "_deserializationContext", null);
        setField(term180579, term180579.getClass(), "_rootDeserializers", term180671);
        setField(term180579, term180579.getClass(), "_jsonFactory", null);
        setField(term180579, term180579.getClass(), "_rootNames", null);
        term180781 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term180781, term180781.getClass(), "_rootName", "");
        setIntField(term180781, term180781.getClass(), "_deserFeatures", -1);
        term180925 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term181017 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        term181125 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term180579;
        args[1] = term180781;
        args[2] = term180925;
        args[3] = term181017;
        args[4] = null;
        args[5] = term181125;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


