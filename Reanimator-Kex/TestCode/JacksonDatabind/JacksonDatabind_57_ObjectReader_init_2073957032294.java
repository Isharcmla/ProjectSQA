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

public class ObjectReader_init_2073957032294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68218;
     Object term68476;
     Object term68706;
     Object term67469;

    public ObjectReader_init_2073957032294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67600 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term67710 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term67792 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term67874 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term67980 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term68018 = newInstance(Class.forName("java.lang.Object"));
        term67469 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term68126 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term67600, term67600.getClass(), "_config", term67710);
        setField(term67600, term67600.getClass(), "_context", null);
        setField(term67600, term67600.getClass(), "_rootDeserializers", term67792);
        setField(term67600, term67600.getClass(), "_parserFactory", term67874);
        setField(term67600, term67600.getClass(), "_valueType", term67980);
        setField(term67600, term67600.getClass(), "_valueToUpdate", term68018);
        setField(term67600, term67600.getClass(), "_schema", term67469);
        setField(term67600, term67600.getClass(), "_injectableValues", term68126);
        term68218 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term68366 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term68218, term68218.getClass(), "_deserializationContext", term68366);
        setField(term68218, term68218.getClass(), "_rootDeserializers", null);
        setField(term68218, term68218.getClass(), "_jsonFactory", null);
        term68476 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term68568 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term68568, term68568.getClass(), "_namespace", "");
        setField(term68476, term68476.getClass(), "_rootName", term68568);
        term68706 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapLikeType"));
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
        args[0] = term68218;
        args[1] = term68476;
        args[2] = term68706;
        args[3] = null;
        args[4] = term67469;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


