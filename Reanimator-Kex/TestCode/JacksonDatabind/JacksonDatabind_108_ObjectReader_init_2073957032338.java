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

public class ObjectReader_init_2073957032338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115026;
     Object term115366;
     Object term115466;
     Object term113161;
     Object term115612;

    public ObjectReader_init_2073957032338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term114370 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term114518 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term114600 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term114682 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term114788 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term114826 = newInstance(Class.forName("java.lang.Object"));
        Object term114934 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term114370, term114370.getClass(), "_config", null);
        setField(term114370, term114370.getClass(), "_context", term114518);
        setField(term114370, term114370.getClass(), "_rootDeserializers", term114600);
        setField(term114370, term114370.getClass(), "_parserFactory", term114682);
        setField(term114370, term114370.getClass(), "_valueType", term114788);
        setField(term114370, term114370.getClass(), "_valueToUpdate", term114826);
        setField(term114370, term114370.getClass(), "_schema", term114826);
        setField(term114370, term114370.getClass(), "_injectableValues", term114934);
        setBooleanField(term114370, term114370.getClass(), "_unwrapRoot", false);
        term115026 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term115174 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term115256 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term115026, term115026.getClass(), "_deserializationContext", term115174);
        setField(term115026, term115026.getClass(), "_rootDeserializers", term115256);
        setField(term115026, term115026.getClass(), "_jsonFactory", null);
        term115366 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term115366, term115366.getClass(), "_rootName", null);
        setIntField(term115366, term115366.getClass(), "_deserFeatures", -1);
        term115466 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
        term113161 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term115612 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term115026;
        args[1] = term115366;
        args[2] = term115466;
        args[3] = "ACCEPT_FLOAT_AS_INT";
        args[4] = term113161;
        args[5] = term115612;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


