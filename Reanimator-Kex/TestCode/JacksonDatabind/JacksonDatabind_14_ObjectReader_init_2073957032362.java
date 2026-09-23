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

public class ObjectReader_init_2073957032362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164082;
     Object term164422;
     Object term164514;

    public ObjectReader_init_2073957032362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term163732 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term163842 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term163990 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term163732, term163732.getClass(), "_config", term163842);
        setField(term163732, term163732.getClass(), "_context", term163990);
        setField(term163732, term163732.getClass(), "_rootDeserializers", null);
        setField(term163732, term163732.getClass(), "_parserFactory", null);
        setField(term163732, term163732.getClass(), "_rootNames", null);
        setField(term163732, term163732.getClass(), "_valueType", null);
        setField(term163732, term163732.getClass(), "_valueToUpdate", null);
        setField(term163732, term163732.getClass(), "_schema", null);
        setField(term163732, term163732.getClass(), "_injectableValues", null);
        setBooleanField(term163732, term163732.getClass(), "_unwrapRoot", false);
        term164082 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term164230 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term164312 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term164082, term164082.getClass(), "_deserializationContext", term164230);
        setField(term164082, term164082.getClass(), "_rootDeserializers", term164312);
        setField(term164082, term164082.getClass(), "_jsonFactory", null);
        setField(term164082, term164082.getClass(), "_rootNames", null);
        term164422 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term164422, term164422.getClass(), "_rootName", null);
        setIntField(term164422, term164422.getClass(), "_deserFeatures", -1);
        term164514 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term164082;
        args[1] = term164422;
        args[2] = term164514;
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


