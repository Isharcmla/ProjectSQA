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

public class ObjectReader_init_2022192560481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277901;
     Object term278317;
     Object term278437;
     Object term278543;
     Object term278651;

    public ObjectReader_init_2022192560481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term277159 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term277269 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term277417 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term277499 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term277581 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term277681 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        Object term277809 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer"));
        Object term277036 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term277159, term277159.getClass(), "_config", term277269);
        setField(term277159, term277159.getClass(), "_context", term277417);
        setField(term277159, term277159.getClass(), "_rootDeserializers", term277499);
        setField(term277159, term277159.getClass(), "_parserFactory", term277581);
        setField(term277159, term277159.getClass(), "_valueType", term277681);
        setField(term277159, term277159.getClass(), "_rootDeserializer", term277809);
        setField(term277159, term277159.getClass(), "_valueToUpdate", term277269);
        setField(term277159, term277159.getClass(), "_schema", term277036);
        setField(term277159, term277159.getClass(), "_injectableValues", null);
        term277901 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term278049 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term278131 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term278213 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term277901, term277901.getClass(), "_context", term278049);
        setField(term277901, term277901.getClass(), "_rootDeserializers", term278131);
        setField(term277901, term277901.getClass(), "_parserFactory", term278213);
        term278317 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term278437 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.EnumDeserializer"));
        term278543 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term278651 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term277901;
        args[1] = null;
        args[2] = term278317;
        args[3] = term278437;
        args[4] = term278543;
        args[5] = null;
        args[6] = term278651;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


