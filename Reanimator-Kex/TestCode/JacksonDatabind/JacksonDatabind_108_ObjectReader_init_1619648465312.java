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

public class ObjectReader_init_1619648465312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81882;
     Object term82371;

    public ObjectReader_init_1619648465312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term81216 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term81326 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term81474 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term81556 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term82071 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term81752 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionLikeType"));
        Object term81790 = newInstance(Class.forName("java.lang.Object"));
        setField(term81216, term81216.getClass(), "_config", term81326);
        setField(term81216, term81216.getClass(), "_context", term81474);
        setField(term81216, term81216.getClass(), "_rootDeserializers", term81556);
        setField(term81216, term81216.getClass(), "_parserFactory", term82071);
        setField(term81216, term81216.getClass(), "_valueType", term81752);
        setField(term81216, term81216.getClass(), "_rootDeserializer", null);
        setField(term81216, term81216.getClass(), "_valueToUpdate", term81790);
        setField(term81216, term81216.getClass(), "_schema", null);
        setField(term81216, term81216.getClass(), "_injectableValues", null);
        term81882 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term82030 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term82153 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term81090 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term82261 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term81882, term81882.getClass(), "_context", term82030);
        setField(term81882, term81882.getClass(), "_rootDeserializers", null);
        setField(term81882, term81882.getClass(), "_parserFactory", term82071);
        setField(term81882, term81882.getClass(), "_valueType", null);
        setField(term81882, term81882.getClass(), "_rootDeserializer", null);
        setField(term81882, term81882.getClass(), "_valueToUpdate", term82153);
        setField(term81882, term81882.getClass(), "_schema", term81090);
        setField(term81882, term81882.getClass(), "_injectableValues", term82261);
        term82371 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term82463 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term82463, term82463.getClass(), "_namespace", null);
        setField(term82463, term82463.getClass(), "_simpleName", "");
        setField(term82371, term82371.getClass(), "_rootName", term82463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term81882;
        args[1] = term82371;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


