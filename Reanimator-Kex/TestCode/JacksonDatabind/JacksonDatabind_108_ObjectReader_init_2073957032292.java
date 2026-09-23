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

public class ObjectReader_init_2073957032292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61813;
     Object term62005;
     Object term62239;
     Object term62285;
     Object term61022;
     Object term62676;

    public ObjectReader_init_2073957032292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62285 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term62340 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term62414 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term62455 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term62496 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term62549 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term62568 = newInstance(Class.forName("java.lang.Object"));
        Object term61031 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term62285, term62285.getClass(), "_config", term62340);
        setField(term62285, term62285.getClass(), "_context", term62414);
        setField(term62285, term62285.getClass(), "_rootDeserializers", term62455);
        setField(term62285, term62285.getClass(), "_parserFactory", term62496);
        setField(term62285, term62285.getClass(), "_valueType", term62549);
        setField(term62285, term62285.getClass(), "_valueToUpdate", term62568);
        setField(term62285, term62285.getClass(), "_schema", term61031);
        setField(term62285, term62285.getClass(), "_injectableValues", null);
        term61813 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term61895 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term61813, term61813.getClass(), "_deserializationContext", null);
        setField(term61813, term61813.getClass(), "_rootDeserializers", null);
        setField(term61813, term61813.getClass(), "_jsonFactory", term61895);
        term62005 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term62097 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term62097, term62097.getClass(), "_namespace", "");
        setField(term62005, term62005.getClass(), "_rootName", term62097);
        term62239 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term61022 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term62676 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term61813;
        args[1] = term62005;
        args[2] = term62239;
        args[3] = term62285;
        args[4] = term61022;
        args[5] = term62676;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


