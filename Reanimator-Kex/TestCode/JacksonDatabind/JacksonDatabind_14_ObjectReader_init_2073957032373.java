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

public class ObjectReader_init_2073957032373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178037;
     Object term178459;
     Object term178603;
     Object term178695;
     Object term176538;

    public ObjectReader_init_2073957032373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term177475 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term177623 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term177705 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term177811 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term177907 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term177945 = newInstance(Class.forName("java.lang.Object"));
        Object term177197 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        setField(term177475, term177475.getClass(), "_config", null);
        setField(term177475, term177475.getClass(), "_context", term177623);
        setField(term177475, term177475.getClass(), "_rootDeserializers", term177705);
        setField(term177475, term177475.getClass(), "_parserFactory", null);
        setField(term177475, term177475.getClass(), "_rootNames", term177811);
        setField(term177475, term177475.getClass(), "_valueType", term177907);
        setField(term177475, term177475.getClass(), "_valueToUpdate", term177945);
        setField(term177475, term177475.getClass(), "_schema", term177197);
        setField(term177475, term177475.getClass(), "_injectableValues", null);
        setBooleanField(term177475, term177475.getClass(), "_unwrapRoot", false);
        term178037 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term178185 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term178267 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term178349 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term178037, term178037.getClass(), "_deserializationContext", term178185);
        setField(term178037, term178037.getClass(), "_rootDeserializers", term178267);
        setField(term178037, term178037.getClass(), "_jsonFactory", term178349);
        setField(term178037, term178037.getClass(), "_rootNames", null);
        term178459 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term178459, term178459.getClass(), "_rootName", "");
        setIntField(term178459, term178459.getClass(), "_deserFeatures", -1);
        term178603 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term178695 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        term176538 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
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
        args[0] = term178037;
        args[1] = term178459;
        args[2] = term178603;
        args[3] = term178695;
        args[4] = term176538;
        args[5] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


