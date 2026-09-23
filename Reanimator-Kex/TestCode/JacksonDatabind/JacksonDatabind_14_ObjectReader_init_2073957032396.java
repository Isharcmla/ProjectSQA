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

public class ObjectReader_init_2073957032396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204275;
     Object term204625;
     Object term204777;

    public ObjectReader_init_2073957032396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term203885 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term203995 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term204077 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term204183 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term203885, term203885.getClass(), "_config", term203995);
        setField(term203885, term203885.getClass(), "_context", null);
        setField(term203885, term203885.getClass(), "_rootDeserializers", term204077);
        setField(term203885, term203885.getClass(), "_parserFactory", null);
        setField(term203885, term203885.getClass(), "_rootNames", term204183);
        setField(term203885, term203885.getClass(), "_valueType", null);
        setField(term203885, term203885.getClass(), "_valueToUpdate", null);
        setField(term203885, term203885.getClass(), "_schema", null);
        setField(term203885, term203885.getClass(), "_injectableValues", null);
        setBooleanField(term203885, term203885.getClass(), "_unwrapRoot", false);
        term204275 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term204423 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term204515 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term204275, term204275.getClass(), "_deserializationContext", term204423);
        setField(term204275, term204275.getClass(), "_rootDeserializers", term204515);
        setField(term204275, term204275.getClass(), "_jsonFactory", null);
        setField(term204275, term204275.getClass(), "_rootNames", null);
        term204625 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term204625, term204625.getClass(), "_rootName", "");
        setIntField(term204625, term204625.getClass(), "_deserFeatures", -1);
        term204777 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
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
        args[0] = term204275;
        args[1] = term204625;
        args[2] = term204777;
        args[3] = null;
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


