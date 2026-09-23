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

public class ObjectReader_init_1619648465323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92330;

    public ObjectReader_init_1619648465323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91508 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term91618 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term91766 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term91848 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term91930 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term92092 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer"));
        Object term92130 = newInstance(Class.forName("java.lang.Object"));
        Object term91390 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term92238 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term91508, term91508.getClass(), "_config", term91618);
        setField(term91508, term91508.getClass(), "_context", term91766);
        setField(term91508, term91508.getClass(), "_rootDeserializers", term91848);
        setField(term91508, term91508.getClass(), "_parserFactory", term91930);
        setField(term91508, term91508.getClass(), "_valueType", null);
        setField(term91508, term91508.getClass(), "_rootDeserializer", term92092);
        setField(term91508, term91508.getClass(), "_valueToUpdate", term92130);
        setField(term91508, term91508.getClass(), "_schema", term91390);
        setField(term91508, term91508.getClass(), "_injectableValues", term92238);
        term92330 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term92478 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term92560 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term92642 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term92804 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer"));
        Object term92886 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term91389 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term92994 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term92330, term92330.getClass(), "_context", term92478);
        setField(term92330, term92330.getClass(), "_rootDeserializers", term92560);
        setField(term92330, term92330.getClass(), "_parserFactory", term92642);
        setField(term92330, term92330.getClass(), "_valueType", null);
        setField(term92330, term92330.getClass(), "_rootDeserializer", term92804);
        setField(term92330, term92330.getClass(), "_valueToUpdate", term92886);
        setField(term92330, term92330.getClass(), "_schema", term91389);
        setField(term92330, term92330.getClass(), "_injectableValues", term92994);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term92330;
        args[1] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


