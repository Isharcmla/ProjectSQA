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
     Object term66829;
     Object term67021;
     Object term67257;
     Object term66079;
     Object term67311;

    public ObjectReader_init_2073957032292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66213 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term66323 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term66405 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term66487 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term66591 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term66629 = newInstance(Class.forName("java.lang.Object"));
        Object term66087 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term67311 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term66213, term66213.getClass(), "_config", term66323);
        setField(term66213, term66213.getClass(), "_context", null);
        setField(term66213, term66213.getClass(), "_rootDeserializers", term66405);
        setField(term66213, term66213.getClass(), "_parserFactory", term66487);
        setField(term66213, term66213.getClass(), "_valueType", term66591);
        setField(term66213, term66213.getClass(), "_valueToUpdate", term66629);
        setField(term66213, term66213.getClass(), "_schema", term66087);
        setField(term66213, term66213.getClass(), "_injectableValues", term67311);
        term66829 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term66911 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term66829, term66829.getClass(), "_deserializationContext", null);
        setField(term66829, term66829.getClass(), "_rootDeserializers", null);
        setField(term66829, term66829.getClass(), "_jsonFactory", term66911);
        term67021 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term67113 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term67113, term67113.getClass(), "_namespace", null);
        setField(term67113, term67113.getClass(), "_simpleName", "");
        setField(term67021, term67021.getClass(), "_rootName", term67113);
        term67257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term66079 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term66829;
        args[1] = term67021;
        args[2] = term67257;
        args[3] = null;
        args[4] = term66079;
        args[5] = term67311;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


