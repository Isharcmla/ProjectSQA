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

public class ObjectReader_init_2022192560463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256181;
     Object term256635;
     Object term256799;
     Object term256881;
     Object term255281;
     Object term256989;

    public ObjectReader_init_2022192560463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256181 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term256236 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term256310 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term256351 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term256403 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term256470 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term256489 = newInstance(Class.forName("java.lang.Object"));
        Object term255289 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term256543 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term256181, term256181.getClass(), "_config", term256236);
        setField(term256181, term256181.getClass(), "_context", term256310);
        setField(term256181, term256181.getClass(), "_rootDeserializers", null);
        setField(term256181, term256181.getClass(), "_parserFactory", term256351);
        setField(term256181, term256181.getClass(), "_valueType", term256403);
        setField(term256181, term256181.getClass(), "_rootDeserializer", term256470);
        setField(term256181, term256181.getClass(), "_valueToUpdate", term256489);
        setField(term256181, term256181.getClass(), "_schema", term255289);
        setField(term256181, term256181.getClass(), "_injectableValues", term256543);
        term256635 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term256799 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer"));
        term256881 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term255281 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term256989 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term256181;
        args[1] = null;
        args[2] = term256635;
        args[3] = term256799;
        args[4] = term256881;
        args[5] = term255281;
        args[6] = term256989;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


