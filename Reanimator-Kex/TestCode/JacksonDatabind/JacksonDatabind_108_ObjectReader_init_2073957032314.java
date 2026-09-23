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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_2073957032314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83470;
     Object term83810;
     Object term82676;

    public ObjectReader_init_2073957032314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82814 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term82924 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term83072 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term83154 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term83236 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term83340 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term83378 = newInstance(Class.forName("java.lang.Object"));
        Object term82685 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term82814, term82814.getClass(), "_config", term82924);
        setField(term82814, term82814.getClass(), "_context", term83072);
        setField(term82814, term82814.getClass(), "_rootDeserializers", term83154);
        setField(term82814, term82814.getClass(), "_parserFactory", term83236);
        setField(term82814, term82814.getClass(), "_valueType", term83340);
        setField(term82814, term82814.getClass(), "_valueToUpdate", term83378);
        setField(term82814, term82814.getClass(), "_schema", term82685);
        setField(term82814, term82814.getClass(), "_injectableValues", null);
        setBooleanField(term82814, term82814.getClass(), "_unwrapRoot", false);
        term83470 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term83618 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term83700 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term83470, term83470.getClass(), "_deserializationContext", term83618);
        setField(term83470, term83470.getClass(), "_rootDeserializers", null);
        setField(term83470, term83470.getClass(), "_jsonFactory", term83700);
        term83810 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term83902 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term83902, term83902.getClass(), "_namespace", "");
        setField(term83810, term83810.getClass(), "_rootName", term83902);
        term82676 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term83470;
        args[1] = term83810;
        args[2] = null;
        args[3] = null;
        args[4] = term82676;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


