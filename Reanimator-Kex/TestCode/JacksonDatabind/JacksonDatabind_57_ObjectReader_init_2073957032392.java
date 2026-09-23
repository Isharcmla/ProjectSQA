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

public class ObjectReader_init_2073957032392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168208;
     Object term168466;
     Object term168702;
     Object term168784;
     Object term166975;

    public ObjectReader_init_2073957032392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term167630 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term167740 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term167888 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term167970 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term168008 = newInstance(Class.forName("java.lang.Object"));
        Object term168116 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term167630, term167630.getClass(), "_config", term167740);
        setField(term167630, term167630.getClass(), "_context", term167888);
        setField(term167630, term167630.getClass(), "_rootDeserializers", term167970);
        setField(term167630, term167630.getClass(), "_parserFactory", null);
        setField(term167630, term167630.getClass(), "_valueType", null);
        setField(term167630, term167630.getClass(), "_valueToUpdate", term168008);
        setField(term167630, term167630.getClass(), "_schema", null);
        setField(term167630, term167630.getClass(), "_injectableValues", term168116);
        term168208 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term168356 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term168208, term168208.getClass(), "_deserializationContext", term168356);
        setField(term168208, term168208.getClass(), "_rootDeserializers", null);
        setField(term168208, term168208.getClass(), "_jsonFactory", null);
        term168466 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term168558 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term168558, term168558.getClass(), "_namespace", null);
        setField(term168558, term168558.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term168466, term168466.getClass(), "_rootName", term168558);
        term168702 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term168784 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term166975 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term168208;
        args[1] = term168466;
        args[2] = term168702;
        args[3] = term168784;
        args[4] = term166975;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


