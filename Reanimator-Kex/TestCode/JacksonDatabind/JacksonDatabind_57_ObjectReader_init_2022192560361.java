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

public class ObjectReader_init_2022192560361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130097;
     Object term130382;
     Object term130520;
     Object term130654;
     Object term130746;
     Object term128968;
     Object term130854;

    public ObjectReader_init_2022192560361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129107 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term130382 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term130428 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term129457 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term129539 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term129621 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term129725 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.ReferenceType"));
        Object term129859 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        Object term129897 = newInstance(Class.forName("java.lang.Object"));
        Object term128978 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        Object term130005 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
        setField(term130382, term130382.getClass(), "_rootName", term130428);
        setField(term129107, term129107.getClass(), "_config", term130382);
        setField(term129107, term129107.getClass(), "_context", term129457);
        setField(term129107, term129107.getClass(), "_rootDeserializers", term129539);
        setField(term129107, term129107.getClass(), "_parserFactory", term129621);
        setField(term129107, term129107.getClass(), "_valueType", term129725);
        setField(term129107, term129107.getClass(), "_rootDeserializer", term129859);
        setField(term129107, term129107.getClass(), "_valueToUpdate", term129897);
        setField(term129107, term129107.getClass(), "_schema", term128978);
        setField(term129107, term129107.getClass(), "_injectableValues", term130005);
        term130097 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term130245 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term130327 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        setField(term130097, term130097.getClass(), "_context", term130245);
        setField(term130097, term130097.getClass(), "_rootDeserializers", null);
        setField(term130097, term130097.getClass(), "_parserFactory", term130327);
        term130520 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term130654 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer"));
        term130746 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term128968 = Mockito.mock(Class.forName("com.fasterxml.jackson.core.FormatSchema"));
        term130854 = newInstance(Class.forName("com.fasterxml.jackson.databind.InjectableValues$Std"));
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
        args[0] = term130097;
        args[1] = term130382;
        args[2] = term130520;
        args[3] = term130654;
        args[4] = term130746;
        args[5] = term128968;
        args[6] = term130854;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


