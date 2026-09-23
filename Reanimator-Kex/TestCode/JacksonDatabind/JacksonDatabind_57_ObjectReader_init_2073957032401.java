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

public class ObjectReader_init_2073957032401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179023;
     Object term179363;
     Object term179613;

    public ObjectReader_init_2073957032401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term178821 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term178931 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term178821, term178821.getClass(), "_config", term178931);
        setField(term178821, term178821.getClass(), "_context", null);
        setField(term178821, term178821.getClass(), "_rootDeserializers", null);
        setField(term178821, term178821.getClass(), "_parserFactory", null);
        setField(term178821, term178821.getClass(), "_valueType", null);
        setField(term178821, term178821.getClass(), "_valueToUpdate", null);
        setField(term178821, term178821.getClass(), "_schema", null);
        setField(term178821, term178821.getClass(), "_injectableValues", null);
        setBooleanField(term178821, term178821.getClass(), "_unwrapRoot", false);
        term179023 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term179171 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term179253 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term179023, term179023.getClass(), "_deserializationContext", term179171);
        setField(term179023, term179023.getClass(), "_rootDeserializers", term179253);
        setField(term179023, term179023.getClass(), "_jsonFactory", null);
        term179363 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term179455 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term179455, term179455.getClass(), "_namespace", null);
        setField(term179455, term179455.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term179363, term179363.getClass(), "_rootName", term179455);
        setIntField(term179363, term179363.getClass(), "_deserFeatures", -1);
        term179613 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
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
        args[0] = term179023;
        args[1] = term179363;
        args[2] = term179613;
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


