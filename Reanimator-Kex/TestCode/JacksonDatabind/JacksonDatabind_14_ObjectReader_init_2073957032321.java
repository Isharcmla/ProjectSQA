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

public class ObjectReader_init_2073957032321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123873;
     Object term124348;
     Object term122861;
     Object term124494;

    public ObjectReader_init_2073957032321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term123007 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term123117 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term123265 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term123347 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term123453 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term123567 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term124238 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term122872 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term123781 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term123007, term123007.getClass(), "_config", term123117);
        setField(term123007, term123007.getClass(), "_context", term123265);
        setField(term123007, term123007.getClass(), "_rootDeserializers", null);
        setField(term123007, term123007.getClass(), "_parserFactory", term123347);
        setField(term123007, term123007.getClass(), "_rootNames", term123453);
        setField(term123007, term123007.getClass(), "_valueType", term123567);
        setField(term123007, term123007.getClass(), "_valueToUpdate", term124238);
        setField(term123007, term123007.getClass(), "_schema", term122872);
        setField(term123007, term123007.getClass(), "_injectableValues", term123781);
        setBooleanField(term123007, term123007.getClass(), "_unwrapRoot", false);
        term123873 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term124021 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term124103 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term124185 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term123873, term123873.getClass(), "_deserializationContext", term124021);
        setField(term123873, term123873.getClass(), "_rootDeserializers", term124103);
        setField(term123873, term123873.getClass(), "_jsonFactory", term124185);
        setField(term123873, term123873.getClass(), "_rootNames", term124238);
        term124348 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term124348, term124348.getClass(), "_rootName", "");
        term122861 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term124494 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term123873;
        args[1] = term124348;
        args[2] = null;
        args[3] = null;
        args[4] = term122861;
        args[5] = term124494;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


