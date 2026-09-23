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

public class ObjectReader_init_2073957032322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95810;
     Object term96109;
     Object term96343;
     Object term96381;
     Object term95107;
     Object term96489;

    public ObjectReader_init_2073957032322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term95246 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term95394 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term95999 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term95572 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term95610 = newInstance(Class.forName("java.lang.Object"));
        Object term95114 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term95718 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term95246, term95246.getClass(), "_config", null);
        setField(term95246, term95246.getClass(), "_context", term95394);
        setField(term95246, term95246.getClass(), "_rootDeserializers", null);
        setField(term95246, term95246.getClass(), "_parserFactory", term95999);
        setField(term95246, term95246.getClass(), "_valueType", term95572);
        setField(term95246, term95246.getClass(), "_valueToUpdate", term95610);
        setField(term95246, term95246.getClass(), "_schema", term95114);
        setField(term95246, term95246.getClass(), "_injectableValues", term95718);
        term95810 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term95958 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term95810, term95810.getClass(), "_deserializationContext", term95958);
        setField(term95810, term95810.getClass(), "_rootDeserializers", null);
        setField(term95810, term95810.getClass(), "_jsonFactory", term95999);
        term96109 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term96201 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term96201, term96201.getClass(), "_namespace", "");
        setField(term96109, term96109.getClass(), "_rootName", term96201);
        term96343 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term96381 = newInstance(Class.forName("java.lang.Object"));
        term95107 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term96489 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term95810;
        args[1] = term96109;
        args[2] = term96343;
        args[3] = term96381;
        args[4] = term95107;
        args[5] = term96489;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


