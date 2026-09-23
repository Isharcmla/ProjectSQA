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

public class ObjectReader_init_2073957032483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280829;
     Object term281021;
     Object term281257;
     Object term281349;
     Object term281457;

    public ObjectReader_init_2073957032483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term280277 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term280387 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term280535 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term280617 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term280699 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term280737 = newInstance(Class.forName("java.lang.Object"));
        Object term279910 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term280277, term280277.getClass(), "_config", term280387);
        setField(term280277, term280277.getClass(), "_context", term280535);
        setField(term280277, term280277.getClass(), "_rootDeserializers", term280617);
        setField(term280277, term280277.getClass(), "_parserFactory", term280699);
        setField(term280277, term280277.getClass(), "_valueType", null);
        setField(term280277, term280277.getClass(), "_valueToUpdate", term280737);
        setField(term280277, term280277.getClass(), "_schema", term279910);
        setField(term280277, term280277.getClass(), "_injectableValues", null);
        setBooleanField(term280277, term280277.getClass(), "_unwrapRoot", false);
        term280829 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term280911 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term280829, term280829.getClass(), "_deserializationContext", null);
        setField(term280829, term280829.getClass(), "_rootDeserializers", term280911);
        setField(term280829, term280829.getClass(), "_jsonFactory", null);
        term281021 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term281113 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term281113, term281113.getClass(), "_namespace", null);
        setField(term281113, term281113.getClass(), "_simpleName", "");
        setField(term281021, term281021.getClass(), "_rootName", term281113);
        setIntField(term281021, term281021.getClass(), "_deserFeatures", -1);
        term281257 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term281349 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term281457 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term280829;
        args[1] = term281021;
        args[2] = term281257;
        args[3] = term281349;
        args[4] = null;
        args[5] = term281457;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


