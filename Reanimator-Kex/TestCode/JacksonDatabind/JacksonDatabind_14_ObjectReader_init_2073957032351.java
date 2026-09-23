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

public class ObjectReader_init_2073957032351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154223;
     Object term154415;
     Object term154545;
     Object term154583;
     Object term153305;
     Object term154691;

    public ObjectReader_init_2073957032351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term153441 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term153551 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term153699 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term153781 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term153887 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term153985 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        Object term154023 = newInstance(Class.forName("java.lang.Object"));
        Object term153314 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term154131 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term153441, term153441.getClass(), "_config", term153551);
        setField(term153441, term153441.getClass(), "_context", term153699);
        setField(term153441, term153441.getClass(), "_rootDeserializers", null);
        setField(term153441, term153441.getClass(), "_parserFactory", term153781);
        setField(term153441, term153441.getClass(), "_rootNames", term153887);
        setField(term153441, term153441.getClass(), "_valueType", term153985);
        setField(term153441, term153441.getClass(), "_valueToUpdate", term154023);
        setField(term153441, term153441.getClass(), "_schema", term153314);
        setField(term153441, term153441.getClass(), "_injectableValues", term154131);
        term154223 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term154305 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term154223, term154223.getClass(), "_deserializationContext", null);
        setField(term154223, term154223.getClass(), "_rootDeserializers", null);
        setField(term154223, term154223.getClass(), "_jsonFactory", term154305);
        setField(term154223, term154223.getClass(), "_rootNames", null);
        term154415 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term154415, term154415.getClass(), "_rootName", "");
        term154545 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term154583 = newInstance(Class.forName("java.lang.Object"));
        term153305 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term154691 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term154223;
        args[1] = term154415;
        args[2] = term154545;
        args[3] = term154583;
        args[4] = term153305;
        args[5] = term154691;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


