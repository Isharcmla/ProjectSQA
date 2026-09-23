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
import org.mockito.Mockito;

public class ObjectReader_init_2073957032460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251879;
     Object term252081;
     Object term252315;
     Object term250544;

    public ObjectReader_init_2073957032460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term251639 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term251749 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term251639, term251639.getClass(), "_config", term251749);
        setField(term251639, term251639.getClass(), "_context", null);
        setField(term251639, term251639.getClass(), "_rootDeserializers", null);
        setField(term251639, term251639.getClass(), "_parserFactory", null);
        setField(term251639, term251639.getClass(), "_valueType", null);
        setField(term251639, term251639.getClass(), "_valueToUpdate", "ACCEPT_SINGLE_VALUE_AS_ARRAY");
        setField(term251639, term251639.getClass(), "_schema", null);
        setField(term251639, term251639.getClass(), "_injectableValues", null);
        setBooleanField(term251639, term251639.getClass(), "_unwrapRoot", false);
        term251879 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term251971 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term251879, term251879.getClass(), "_deserializationContext", null);
        setField(term251879, term251879.getClass(), "_rootDeserializers", term251971);
        setField(term251879, term251879.getClass(), "_jsonFactory", null);
        term252081 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term252173 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term252173, term252173.getClass(), "_namespace", null);
        setField(term252173, term252173.getClass(), "_simpleName", "");
        setField(term252081, term252081.getClass(), "_rootName", term252173);
        setIntField(term252081, term252081.getClass(), "_deserFeatures", -1);
        term252315 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        term250544 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term251879;
        args[1] = term252081;
        args[2] = term252315;
        args[3] = null;
        args[4] = term250544;
        args[5] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


