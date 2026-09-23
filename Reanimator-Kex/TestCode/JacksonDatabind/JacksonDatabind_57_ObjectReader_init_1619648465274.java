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

public class ObjectReader_init_1619648465274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52138;
     Object term52627;

    public ObjectReader_init_1619648465274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term51494 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term51604 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51752 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term51834 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term52327 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term52008 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        Object term52046 = newInstance(Class.forName("java.lang.Object"));
        setField(term51494, term51494.getClass(), "_config", term51604);
        setField(term51494, term51494.getClass(), "_context", term51752);
        setField(term51494, term51494.getClass(), "_rootDeserializers", term51834);
        setField(term51494, term51494.getClass(), "_parserFactory", term52327);
        setField(term51494, term51494.getClass(), "_valueType", term52008);
        setField(term51494, term51494.getClass(), "_rootDeserializer", null);
        setField(term51494, term51494.getClass(), "_valueToUpdate", term52046);
        setField(term51494, term51494.getClass(), "_schema", null);
        setField(term51494, term51494.getClass(), "_injectableValues", null);
        term52138 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term52286 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term52409 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term51368 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term52517 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term52138, term52138.getClass(), "_context", term52286);
        setField(term52138, term52138.getClass(), "_rootDeserializers", null);
        setField(term52138, term52138.getClass(), "_parserFactory", term52327);
        setField(term52138, term52138.getClass(), "_valueType", null);
        setField(term52138, term52138.getClass(), "_rootDeserializer", null);
        setField(term52138, term52138.getClass(), "_valueToUpdate", term52409);
        setField(term52138, term52138.getClass(), "_schema", term51368);
        setField(term52138, term52138.getClass(), "_injectableValues", term52517);
        term52627 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term52719 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term52719, term52719.getClass(), "_namespace", null);
        setField(term52719, term52719.getClass(), "_simpleName", "");
        setField(term52627, term52627.getClass(), "_rootName", term52719);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Object[] args = new Object[2];
        args[0] = term52138;
        args[1] = term52627;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


