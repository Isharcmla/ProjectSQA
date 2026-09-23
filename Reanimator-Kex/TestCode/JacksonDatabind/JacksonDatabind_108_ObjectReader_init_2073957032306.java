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

public class ObjectReader_init_2073957032306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74353;
     Object term74537;
     Object term74715;
     Object term74807;
     Object term73464;
     Object term74915;

    public ObjectReader_init_2073957032306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term73597 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term73707 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term74427 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term73937 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term74019 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        term74715 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term74153 = newInstance(Class.forName("java.lang.Object"));
        Object term73471 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term74261 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term73597, term73597.getClass(), "_config", term73707);
        setField(term73597, term73597.getClass(), "_context", term74427);
        setField(term73597, term73597.getClass(), "_rootDeserializers", term73937);
        setField(term73597, term73597.getClass(), "_parserFactory", term74019);
        setField(term73597, term73597.getClass(), "_valueType", term74715);
        setField(term73597, term73597.getClass(), "_valueToUpdate", term74153);
        setField(term73597, term73597.getClass(), "_schema", term73471);
        setField(term73597, term73597.getClass(), "_injectableValues", term74261);
        term74353 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        setField(term74353, term74353.getClass(), "_deserializationContext", term74427);
        setField(term74353, term74353.getClass(), "_rootDeserializers", null);
        setField(term74353, term74353.getClass(), "_jsonFactory", null);
        term74537 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term74629 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term74629, term74629.getClass(), "_namespace", null);
        setField(term74629, term74629.getClass(), "_simpleName", "");
        setField(term74537, term74537.getClass(), "_rootName", term74629);
        term74807 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        term73464 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term74915 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term74353;
        args[1] = term74537;
        args[2] = term74715;
        args[3] = term74807;
        args[4] = term73464;
        args[5] = term74915;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


