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
     Object term148470;
     Object term148820;
     Object term149042;

    public ObjectReader_init_2073957032362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term148268 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term148378 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term148268, term148268.getClass(), "_config", term148378);
        setField(term148268, term148268.getClass(), "_context", null);
        setField(term148268, term148268.getClass(), "_rootDeserializers", null);
        setField(term148268, term148268.getClass(), "_parserFactory", null);
        setField(term148268, term148268.getClass(), "_valueType", null);
        setField(term148268, term148268.getClass(), "_valueToUpdate", null);
        setField(term148268, term148268.getClass(), "_schema", null);
        setField(term148268, term148268.getClass(), "_injectableValues", null);
        setBooleanField(term148268, term148268.getClass(), "_unwrapRoot", false);
        term148470 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term148618 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term148710 = newInstance(Class.forName("com.fasterxml.jackson.core.util.InternCache"));
        setField(term148470, term148470.getClass(), "_deserializationContext", term148618);
        setField(term148470, term148470.getClass(), "_rootDeserializers", term148710);
        setField(term148470, term148470.getClass(), "_jsonFactory", null);
        term148820 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term148912 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term148912, term148912.getClass(), "_namespace", null);
        setField(term148912, term148912.getClass(), "_simpleName", "");
        setField(term148820, term148820.getClass(), "_rootName", term148912);
        setIntField(term148820, term148820.getClass(), "_deserFeatures", -1);
        term149042 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
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
        args[0] = term148470;
        args[1] = term148820;
        args[2] = term149042;
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


