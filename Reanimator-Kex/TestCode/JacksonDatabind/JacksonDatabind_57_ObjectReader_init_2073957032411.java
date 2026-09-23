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
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ObjectReader_init_2073957032411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192679;
     Object term192937;
     Object term193035;

    public ObjectReader_init_2073957032411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term192477 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term192587 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term192477, term192477.getClass(), "_config", term192587);
        setField(term192477, term192477.getClass(), "_context", null);
        setField(term192477, term192477.getClass(), "_rootDeserializers", null);
        setField(term192477, term192477.getClass(), "_parserFactory", null);
        setField(term192477, term192477.getClass(), "_valueType", null);
        setField(term192477, term192477.getClass(), "_valueToUpdate", null);
        setField(term192477, term192477.getClass(), "_schema", null);
        setField(term192477, term192477.getClass(), "_injectableValues", null);
        term192679 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term192827 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term192679, term192679.getClass(), "_deserializationContext", term192827);
        setField(term192679, term192679.getClass(), "_rootDeserializers", null);
        setField(term192679, term192679.getClass(), "_jsonFactory", null);
        term192937 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term192937, term192937.getClass(), "_rootName", null);
        setIntField(term192937, term192937.getClass(), "_deserFeatures", -1);
        term193035 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term192679;
        args[1] = term192937;
        args[2] = term193035;
        args[3] = "";
        args[4] = null;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


