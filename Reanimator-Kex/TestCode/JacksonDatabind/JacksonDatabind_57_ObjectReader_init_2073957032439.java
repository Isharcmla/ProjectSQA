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

public class ObjectReader_init_2073957032439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222168;
     Object term222360;
     Object term222594;

    public ObjectReader_init_2073957032439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term221818 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term221928 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term222076 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        setField(term221818, term221818.getClass(), "_config", term221928);
        setField(term221818, term221818.getClass(), "_context", term222076);
        setField(term221818, term221818.getClass(), "_rootDeserializers", null);
        setField(term221818, term221818.getClass(), "_parserFactory", null);
        setField(term221818, term221818.getClass(), "_valueType", null);
        setField(term221818, term221818.getClass(), "_valueToUpdate", null);
        setField(term221818, term221818.getClass(), "_schema", null);
        setField(term221818, term221818.getClass(), "_injectableValues", null);
        setBooleanField(term221818, term221818.getClass(), "_unwrapRoot", false);
        term222168 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term222250 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term222168, term222168.getClass(), "_deserializationContext", null);
        setField(term222168, term222168.getClass(), "_rootDeserializers", term222250);
        setField(term222168, term222168.getClass(), "_jsonFactory", null);
        term222360 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term222452 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term222452, term222452.getClass(), "_namespace", null);
        setField(term222452, term222452.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                    ");
        setField(term222360, term222360.getClass(), "_rootName", term222452);
        setIntField(term222360, term222360.getClass(), "_deserFeatures", -1);
        term222594 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term222168;
        args[1] = term222360;
        args[2] = term222594;
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


