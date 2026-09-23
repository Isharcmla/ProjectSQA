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

public class ObjectReader_init_2073957032332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103580;
     Object term103920;
     Object term104154;
     Object term104246;
     Object term102784;
     Object term104354;

    public ObjectReader_init_2073957032332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102926 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term103074 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term103156 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term103238 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term103342 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term103380 = newInstance(Class.forName("java.lang.Object"));
        Object term102793 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term103488 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term102926, term102926.getClass(), "_config", null);
        setField(term102926, term102926.getClass(), "_context", term103074);
        setField(term102926, term102926.getClass(), "_rootDeserializers", term103156);
        setField(term102926, term102926.getClass(), "_parserFactory", term103238);
        setField(term102926, term102926.getClass(), "_valueType", term103342);
        setField(term102926, term102926.getClass(), "_valueToUpdate", term103380);
        setField(term102926, term102926.getClass(), "_schema", term102793);
        setField(term102926, term102926.getClass(), "_injectableValues", term103488);
        term103580 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term103728 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term103810 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term103580, term103580.getClass(), "_deserializationContext", term103728);
        setField(term103580, term103580.getClass(), "_rootDeserializers", null);
        setField(term103580, term103580.getClass(), "_jsonFactory", term103810);
        term103920 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term104012 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term104012, term104012.getClass(), "_namespace", null);
        setField(term104012, term104012.getClass(), "_simpleName", "");
        setField(term103920, term103920.getClass(), "_rootName", term104012);
        term104154 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term104246 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term102784 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term104354 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term103580;
        args[1] = term103920;
        args[2] = term104154;
        args[3] = term104246;
        args[4] = term102784;
        args[5] = term104354;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


