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

public class ObjectReader_init_2073957032319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91937;
     Object term92277;
     Object term92397;

    public ObjectReader_init_2073957032319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term91735 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term91845 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term91735, term91735.getClass(), "_config", term91845);
        setField(term91735, term91735.getClass(), "_context", null);
        setField(term91735, term91735.getClass(), "_rootDeserializers", null);
        setField(term91735, term91735.getClass(), "_parserFactory", null);
        setField(term91735, term91735.getClass(), "_valueType", null);
        setField(term91735, term91735.getClass(), "_valueToUpdate", null);
        setField(term91735, term91735.getClass(), "_schema", null);
        setField(term91735, term91735.getClass(), "_injectableValues", null);
        setBooleanField(term91735, term91735.getClass(), "_unwrapRoot", false);
        term91937 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term92085 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term92167 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term91937, term91937.getClass(), "_deserializationContext", term92085);
        setField(term91937, term91937.getClass(), "_rootDeserializers", term92167);
        setField(term91937, term91937.getClass(), "_jsonFactory", null);
        term92277 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term92277, term92277.getClass(), "_rootName", null);
        setIntField(term92277, term92277.getClass(), "_deserFeatures", -1);
        term92397 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
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
        args[0] = term91937;
        args[1] = term92277;
        args[2] = term92397;
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


