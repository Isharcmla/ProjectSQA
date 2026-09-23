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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import org.mockito.Mockito;

public class ObjectReader_init_2073957032327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98539;
     Object term98879;
     Object term97408;

    public ObjectReader_init_2073957032327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98059 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term98207 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term98289 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term98409 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ResolvedRecursiveType"));
        Object term98447 = newInstance(Class.forName("java.lang.Object"));
        Object term97415 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term98059, term98059.getClass(), "_config", null);
        setField(term98059, term98059.getClass(), "_context", term98207);
        setField(term98059, term98059.getClass(), "_rootDeserializers", term98289);
        setField(term98059, term98059.getClass(), "_parserFactory", null);
        setField(term98059, term98059.getClass(), "_valueType", term98409);
        setField(term98059, term98059.getClass(), "_valueToUpdate", term98447);
        setField(term98059, term98059.getClass(), "_schema", term97415);
        setField(term98059, term98059.getClass(), "_injectableValues", null);
        term98539 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term98687 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term98769 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term98539, term98539.getClass(), "_deserializationContext", term98687);
        setField(term98539, term98539.getClass(), "_rootDeserializers", term98769);
        setField(term98539, term98539.getClass(), "_jsonFactory", null);
        term98879 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term98971 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term98971, term98971.getClass(), "_namespace", null);
        setField(term98971, term98971.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term98879, term98879.getClass(), "_rootName", term98971);
        term97408 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term98539;
        args[1] = term98879;
        args[2] = null;
        args[3] = null;
        args[4] = term97408;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


