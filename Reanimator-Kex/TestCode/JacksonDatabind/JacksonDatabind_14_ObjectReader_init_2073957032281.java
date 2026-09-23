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

public class ObjectReader_init_2073957032281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81435;
     Object term81910;
     Object term82048;
     Object term80539;
     Object term82156;

    public ObjectReader_init_2073957032281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term80683 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term80793 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term80941 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term81023 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term81129 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term81800 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term80549 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term81343 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term80683, term80683.getClass(), "_config", term80793);
        setField(term80683, term80683.getClass(), "_context", term80941);
        setField(term80683, term80683.getClass(), "_rootDeserializers", null);
        setField(term80683, term80683.getClass(), "_parserFactory", term81023);
        setField(term80683, term80683.getClass(), "_rootNames", term81129);
        setField(term80683, term80683.getClass(), "_valueType", null);
        setField(term80683, term80683.getClass(), "_valueToUpdate", term81800);
        setField(term80683, term80683.getClass(), "_schema", term80549);
        setField(term80683, term80683.getClass(), "_injectableValues", term81343);
        term81435 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term81583 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term81665 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term81747 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term81435, term81435.getClass(), "_deserializationContext", term81583);
        setField(term81435, term81435.getClass(), "_rootDeserializers", term81665);
        setField(term81435, term81435.getClass(), "_jsonFactory", term81747);
        setField(term81435, term81435.getClass(), "_rootNames", term81800);
        term81910 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term81910, term81910.getClass(), "_rootName", " ");
        term82048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term80539 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term82156 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term81435;
        args[1] = term81910;
        args[2] = term82048;
        args[3] = null;
        args[4] = term80539;
        args[5] = term82156;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


