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

public class ObjectReader_init_2022192560238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40018;
     Object term40394;
     Object term40476;

    public ObjectReader_init_2022192560238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term39466 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term39614 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl"));
        Object term39696 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term39802 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term39926 = newInstance(Class.forName("com.fasterxml.jackson.databind.deser.std.StringDeserializer"));
        setField(term39466, term39466.getClass(), "_config", null);
        setField(term39466, term39466.getClass(), "_context", term39614);
        setField(term39466, term39466.getClass(), "_rootDeserializers", term39696);
        setField(term39466, term39466.getClass(), "_parserFactory", null);
        setField(term39466, term39466.getClass(), "_rootNames", term39802);
        setField(term39466, term39466.getClass(), "_valueType", null);
        setField(term39466, term39466.getClass(), "_rootDeserializer", term39926);
        setField(term39466, term39466.getClass(), "_valueToUpdate", null);
        term40018 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        Object term40100 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term40182 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonFactory"));
        Object term40288 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term40018, term40018.getClass(), "_context", null);
        setField(term40018, term40018.getClass(), "_rootDeserializers", term40100);
        setField(term40018, term40018.getClass(), "_parserFactory", term40182);
        setField(term40018, term40018.getClass(), "_rootNames", term40288);
        term40394 = newInstance(Class.forName("com.fasterxml.jackson.databind.type.CollectionType"));
        term40476 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
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
        args[0] = term40018;
        args[1] = null;
        args[2] = term40394;
        args[3] = null;
        args[4] = term40476;
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


