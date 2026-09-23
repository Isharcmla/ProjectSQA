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

public class ObjectReader_init_2022192560328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129302;
     Object term129664;
     Object term129746;

    public ObjectReader_init_2022192560328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term128754 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term128902 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term128984 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term129090 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term129210 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.AbstractDeserializer"));
        setField(term128754, term128754.getClass(), "_config", null);
        setField(term128754, term128754.getClass(), "_context", term128902);
        setField(term128754, term128754.getClass(), "_rootDeserializers", term128984);
        setField(term128754, term128754.getClass(), "_parserFactory", null);
        setField(term128754, term128754.getClass(), "_rootNames", term129090);
        setField(term128754, term128754.getClass(), "_valueType", null);
        setField(term128754, term128754.getClass(), "_rootDeserializer", term129210);
        setField(term128754, term128754.getClass(), "_valueToUpdate", null);
        term129302 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term129384 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term129466 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term129572 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term129302, term129302.getClass(), "_context", null);
        setField(term129302, term129302.getClass(), "_rootDeserializers", term129384);
        setField(term129302, term129302.getClass(), "_parserFactory", term129466);
        setField(term129302, term129302.getClass(), "_rootNames", term129572);
        term129664 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.MapType"));
        term129746 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
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
        args[0] = term129302;
        args[1] = null;
        args[2] = term129664;
        args[3] = null;
        args[4] = term129746;
        args[5] = null;
        args[6] = null;
        args[7] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


