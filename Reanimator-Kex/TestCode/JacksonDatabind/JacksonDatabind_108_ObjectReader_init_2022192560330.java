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

public class ObjectReader_init_2022192560330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102901;
     Object term103282;
     Object term103504;
     Object term103670;
     Object term103778;
     Object term101476;
     Object term103886;

    public ObjectReader_init_2022192560330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102135 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term102245 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term102393 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term102475 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term102619 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        Object term103172 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term102809 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term102135, term102135.getClass(), "_config", term102245);
        setField(term102135, term102135.getClass(), "_context", term102393);
        setField(term102135, term102135.getClass(), "_rootDeserializers", term102475);
        setField(term102135, term102135.getClass(), "_parserFactory", null);
        setField(term102135, term102135.getClass(), "_valueType", null);
        setField(term102135, term102135.getClass(), "_rootDeserializer", term102619);
        setField(term102135, term102135.getClass(), "_valueToUpdate", term103172);
        setField(term102135, term102135.getClass(), "_schema", null);
        setField(term102135, term102135.getClass(), "_injectableValues", term102809);
        term102901 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term103049 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term103131 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term102901, term102901.getClass(), "_context", term103049);
        setField(term102901, term102901.getClass(), "_rootDeserializers", term103131);
        setField(term102901, term102901.getClass(), "_parserFactory", term103172);
        term103282 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term103374 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term103374, term103374.getClass(), "_namespace", null);
        setField(term103374, term103374.getClass(), "_simpleName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term103282, term103282.getClass(), "_rootName", term103374);
        term103504 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term103670 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer"));
        term103778 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        term101476 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term103886 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.ObjectReader");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonDeserializer");
        argTypes[4] = Class.forName("java.lang.Object");
        argTypes[5] = Class.forName("com.fasterxml.jackson.core.FormatSchema");
        argTypes[6] = Class.forName("com.fasterxml.jackson.databind.InjectableValues");
        argTypes[7] = Class.forName("com.fasterxml.jackson.databind.deser.DataFormatReaders");
        Object[] args = new Object[8];
        args[0] = term102901;
        args[1] = term103282;
        args[2] = term103504;
        args[3] = term103670;
        args[4] = term103778;
        args[5] = term101476;
        args[6] = term103886;
        args[7] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


