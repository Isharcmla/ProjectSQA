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

public class ObjectReader_init_2073957032261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59162;
     Object term59354;
     Object term59490;
     Object term59528;
     Object term58246;
     Object term59636;

    public ObjectReader_init_2073957032261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term58382 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term58492 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term58640 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term58722 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term58828 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term58924 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ArrayType"));
        Object term58962 = newInstance(Class.forName("java.lang.Object"));
        Object term58255 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term59070 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term58382, term58382.getClass(), "_config", term58492);
        setField(term58382, term58382.getClass(), "_context", term58640);
        setField(term58382, term58382.getClass(), "_rootDeserializers", null);
        setField(term58382, term58382.getClass(), "_parserFactory", term58722);
        setField(term58382, term58382.getClass(), "_rootNames", term58828);
        setField(term58382, term58382.getClass(), "_valueType", term58924);
        setField(term58382, term58382.getClass(), "_valueToUpdate", term58962);
        setField(term58382, term58382.getClass(), "_schema", term58255);
        setField(term58382, term58382.getClass(), "_injectableValues", term59070);
        term59162 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectMapper"));
        Object term59244 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term59162, term59162.getClass(), "_deserializationContext", null);
        setField(term59162, term59162.getClass(), "_rootDeserializers", null);
        setField(term59162, term59162.getClass(), "_jsonFactory", term59244);
        setField(term59162, term59162.getClass(), "_rootNames", null);
        term59354 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term59354, term59354.getClass(), "_rootName", "");
        term59490 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.SimpleType"));
        term59528 = newInstance(Class.forName("java.lang.Object"));
        term58246 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term59636 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term59162;
        args[1] = term59354;
        args[2] = term59490;
        args[3] = term59528;
        args[4] = term58246;
        args[5] = term59636;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


