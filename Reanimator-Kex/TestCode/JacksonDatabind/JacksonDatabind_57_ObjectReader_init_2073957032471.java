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

public class ObjectReader_init_2073957032471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266035;
     Object term266375;
     Object term266609;

    public ObjectReader_init_2073957032471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term265833 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term265943 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term265833, term265833.getClass(), "_config", term265943);
        setField(term265833, term265833.getClass(), "_context", null);
        setField(term265833, term265833.getClass(), "_rootDeserializers", null);
        setField(term265833, term265833.getClass(), "_parserFactory", null);
        setField(term265833, term265833.getClass(), "_valueType", null);
        setField(term265833, term265833.getClass(), "_valueToUpdate", null);
        setField(term265833, term265833.getClass(), "_schema", null);
        setField(term265833, term265833.getClass(), "_injectableValues", null);
        setBooleanField(term265833, term265833.getClass(), "_unwrapRoot", false);
        term266035 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term266183 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term266265 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term266035, term266035.getClass(), "_deserializationContext", term266183);
        setField(term266035, term266035.getClass(), "_rootDeserializers", term266265);
        setField(term266035, term266035.getClass(), "_jsonFactory", null);
        term266375 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term266467 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term266467, term266467.getClass(), "_namespace", "");
        setField(term266375, term266375.getClass(), "_rootName", term266467);
        setIntField(term266375, term266375.getClass(), "_deserFeatures", -1);
        term266609 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
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
        args[0] = term266035;
        args[1] = term266375;
        args[2] = term266609;
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


