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

public class ObjectReader_init_2073957032314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116298;
     Object term116490;
     Object term116588;
     Object term116680;
     Object term114910;
     Object term116788;

    public ObjectReader_init_2073957032314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term115828 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term115938 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term116086 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term116168 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term115566 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term115828, term115828.getClass(), "_config", term115938);
        setField(term115828, term115828.getClass(), "_context", term116086);
        setField(term115828, term115828.getClass(), "_rootDeserializers", null);
        setField(term115828, term115828.getClass(), "_parserFactory", term116168);
        setField(term115828, term115828.getClass(), "_rootNames", null);
        setField(term115828, term115828.getClass(), "_valueType", null);
        setField(term115828, term115828.getClass(), "_valueToUpdate", "ACCEPT_EMPTY_STRING_AS_NULL_OBJECT");
        setField(term115828, term115828.getClass(), "_schema", term115566);
        setField(term115828, term115828.getClass(), "_injectableValues", null);
        term116298 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term116380 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term116298, term116298.getClass(), "_deserializationContext", null);
        setField(term116298, term116298.getClass(), "_rootDeserializers", null);
        setField(term116298, term116298.getClass(), "_jsonFactory", term116380);
        setField(term116298, term116298.getClass(), "_rootNames", null);
        term116490 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term116490, term116490.getClass(), "_rootName", null);
        setIntField(term116490, term116490.getClass(), "_deserFeatures", -1);
        term116588 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term116680 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term114910 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term116788 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term116298;
        args[1] = term116490;
        args[2] = term116588;
        args[3] = term116680;
        args[4] = term114910;
        args[5] = term116788;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


