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

public class ObjectReader_init_2073957032271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70492;
     Object term70914;
     Object term71048;
     Object term68900;
     Object term71156;

    public ObjectReader_init_2073957032271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term69832 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term69942 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term70090 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term70172 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term70254 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term70292 = newInstance(Class.forName("java.lang.Object"));
        Object term69560 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term70400 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term69832, term69832.getClass(), "_config", term69942);
        setField(term69832, term69832.getClass(), "_context", term70090);
        setField(term69832, term69832.getClass(), "_rootDeserializers", term70172);
        setField(term69832, term69832.getClass(), "_parserFactory", term70254);
        setField(term69832, term69832.getClass(), "_rootNames", null);
        setField(term69832, term69832.getClass(), "_valueType", null);
        setField(term69832, term69832.getClass(), "_valueToUpdate", term70292);
        setField(term69832, term69832.getClass(), "_schema", term69560);
        setField(term69832, term69832.getClass(), "_injectableValues", term70400);
        setBooleanField(term69832, term69832.getClass(), "_unwrapRoot", false);
        term70492 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term70640 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term70722 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term70804 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term70492, term70492.getClass(), "_deserializationContext", term70640);
        setField(term70492, term70492.getClass(), "_rootDeserializers", term70722);
        setField(term70492, term70492.getClass(), "_jsonFactory", term70804);
        setField(term70492, term70492.getClass(), "_rootNames", null);
        term70914 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term70914, term70914.getClass(), "_rootName", "");
        setIntField(term70914, term70914.getClass(), "_deserFeatures", -1);
        term71048 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        term68900 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term71156 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term70492;
        args[1] = term70914;
        args[2] = term71048;
        args[3] = null;
        args[4] = term68900;
        args[5] = term71156;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


