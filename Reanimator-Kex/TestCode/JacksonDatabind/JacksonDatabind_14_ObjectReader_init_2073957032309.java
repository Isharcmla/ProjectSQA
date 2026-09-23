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

public class ObjectReader_init_2073957032309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111637;
     Object term112165;
     Object term110700;
     Object term112311;

    public ObjectReader_init_2073957032309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term110847 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term110957 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term111105 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term111187 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term111293 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term111399 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term111437 = newInstance(Class.forName("java.lang.Object"));
        Object term111545 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term110847, term110847.getClass(), "_config", term110957);
        setField(term110847, term110847.getClass(), "_context", term111105);
        setField(term110847, term110847.getClass(), "_rootDeserializers", null);
        setField(term110847, term110847.getClass(), "_parserFactory", term111187);
        setField(term110847, term110847.getClass(), "_rootNames", term111293);
        setField(term110847, term110847.getClass(), "_valueType", term111399);
        setField(term110847, term110847.getClass(), "_valueToUpdate", term111437);
        setField(term110847, term110847.getClass(), "_schema", null);
        setField(term110847, term110847.getClass(), "_injectableValues", term111545);
        setBooleanField(term110847, term110847.getClass(), "_unwrapRoot", false);
        term111637 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term111785 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term111867 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term111949 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term112055 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term111637, term111637.getClass(), "_deserializationContext", term111785);
        setField(term111637, term111637.getClass(), "_rootDeserializers", term111867);
        setField(term111637, term111637.getClass(), "_jsonFactory", term111949);
        setField(term111637, term111637.getClass(), "_rootNames", term112055);
        term112165 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term112165, term112165.getClass(), "_rootName", " ");
        term110700 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term112311 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term111637;
        args[1] = term112165;
        args[2] = null;
        args[3] = null;
        args[4] = term110700;
        args[5] = term112311;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


