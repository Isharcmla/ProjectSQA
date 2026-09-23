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

public class ObjectReader_init_2073957032388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162603;
     Object term162861;
     Object term163095;
     Object term163177;
     Object term161370;

    public ObjectReader_init_2073957032388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term162025 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term162135 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term162283 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term162365 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term162403 = newInstance(Class.forName("java.lang.Object"));
        Object term162511 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term162025, term162025.getClass(), "_config", term162135);
        setField(term162025, term162025.getClass(), "_context", term162283);
        setField(term162025, term162025.getClass(), "_rootDeserializers", term162365);
        setField(term162025, term162025.getClass(), "_parserFactory", null);
        setField(term162025, term162025.getClass(), "_valueType", null);
        setField(term162025, term162025.getClass(), "_valueToUpdate", term162403);
        setField(term162025, term162025.getClass(), "_schema", null);
        setField(term162025, term162025.getClass(), "_injectableValues", term162511);
        term162603 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term162751 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term162603, term162603.getClass(), "_deserializationContext", term162751);
        setField(term162603, term162603.getClass(), "_rootDeserializers", null);
        setField(term162603, term162603.getClass(), "_jsonFactory", null);
        term162861 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term162953 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term162953, term162953.getClass(), "_namespace", null);
        setField(term162953, term162953.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term162861, term162861.getClass(), "_rootName", term162953);
        term163095 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term163177 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        term161370 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term162603;
        args[1] = term162861;
        args[2] = term163095;
        args[3] = term163177;
        args[4] = term161370;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


