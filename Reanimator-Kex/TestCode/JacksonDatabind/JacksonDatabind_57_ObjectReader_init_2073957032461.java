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

public class ObjectReader_init_2073957032461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253705;
     Object term253963;
     Object term254191;

    public ObjectReader_init_2073957032461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term253373 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term253521 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term253613 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        setField(term253373, term253373.getClass(), "_config", null);
        setField(term253373, term253373.getClass(), "_context", term253521);
        setField(term253373, term253373.getClass(), "_rootDeserializers", null);
        setField(term253373, term253373.getClass(), "_parserFactory", null);
        setField(term253373, term253373.getClass(), "_valueType", term253613);
        setField(term253373, term253373.getClass(), "_valueToUpdate", null);
        setField(term253373, term253373.getClass(), "_schema", null);
        setField(term253373, term253373.getClass(), "_injectableValues", null);
        setBooleanField(term253373, term253373.getClass(), "_unwrapRoot", false);
        term253705 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term253853 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term253705, term253705.getClass(), "_deserializationContext", term253853);
        setField(term253705, term253705.getClass(), "_rootDeserializers", null);
        setField(term253705, term253705.getClass(), "_jsonFactory", null);
        term253963 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term254055 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term254055, term254055.getClass(), "_namespace", null);
        setField(term254055, term254055.getClass(), "_simpleName", "");
        setField(term253963, term253963.getClass(), "_rootName", term254055);
        setIntField(term253963, term253963.getClass(), "_deserFeatures", -1);
        term254191 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
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
        args[0] = term253705;
        args[1] = term253963;
        args[2] = term254191;
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


