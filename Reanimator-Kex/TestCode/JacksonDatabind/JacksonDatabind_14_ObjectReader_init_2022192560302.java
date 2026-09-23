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

public class ObjectReader_init_2022192560302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99718;
     Object term100160;
     Object term100304;
     Object term100448;

    public ObjectReader_init_2022192560302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99052 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term99134 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term99216 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term99322 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term99428 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        Object term99588 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers$IntDeser"));
        Object term99626 = newInstance(Class.forName("java.lang.Object"));
        setField(term99052, term99052.getClass(), "_config", null);
        setField(term99052, term99052.getClass(), "_context", null);
        setField(term99052, term99052.getClass(), "_rootDeserializers", term99134);
        setField(term99052, term99052.getClass(), "_parserFactory", term99216);
        setField(term99052, term99052.getClass(), "_rootNames", term99322);
        setField(term99052, term99052.getClass(), "_valueType", term99428);
        setField(term99052, term99052.getClass(), "_rootDeserializer", term99588);
        setField(term99052, term99052.getClass(), "_valueToUpdate", term99626);
        term99718 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term99866 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term99948 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term100054 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term99718, term99718.getClass(), "_context", term99866);
        setField(term99718, term99718.getClass(), "_rootDeserializers", null);
        setField(term99718, term99718.getClass(), "_parserFactory", term99948);
        setField(term99718, term99718.getClass(), "_rootNames", term100054);
        term100160 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term100304 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
        term100448 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer"));
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
        args[0] = term99718;
        args[1] = null;
        args[2] = term100160;
        args[3] = term100304;
        args[4] = term100448;
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


