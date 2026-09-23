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
import static com.fasterxml.jackson.databind.EqualityUtils.*;

public class SerializationConfig_init_1807844496177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91079;
     Object term91094;
     Object term91095;

    public SerializationConfig_init_1807844496177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91079 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term91094 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term91094, term91094.getClass(), "_filterProvider", null);
        setField(term91094, term91094.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term91094, term91094.getClass(), "_serFeatures", 0);
        setIntField(term91094, term91094.getClass(), "_generatorFeatures", 0);
        setIntField(term91094, term91094.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term91094, term91094.getClass(), "_formatWriteFeatures", 0);
        setIntField(term91094, term91094.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term91094, term91094.getClass(), "_serializationInclusion", null);
        setField(term91094, term91094.getClass(), "_mixIns", null);
        setField(term91094, term91094.getClass(), "_subtypeResolver", null);
        setField(term91094, term91094.getClass(), "_rootName", null);
        setField(term91094, term91094.getClass(), "_view", null);
        setField(term91094, term91094.getClass(), "_attributes", null);
        setField(term91094, term91094.getClass(), "_rootNames", null);
        setIntField(term91094, term91094.getClass(), "_mapperFeatures", 0);
        setField(term91094, term91094.getClass(), "_base", null);
        term91095 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term91095, term91095.getClass(), "_filterProvider", null);
        setField(term91095, term91095.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term91095, term91095.getClass(), "_serFeatures", 0);
        setIntField(term91095, term91095.getClass(), "_generatorFeatures", 0);
        setIntField(term91095, term91095.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term91095, term91095.getClass(), "_formatWriteFeatures", 0);
        setIntField(term91095, term91095.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term91095, term91095.getClass(), "_serializationInclusion", null);
        setField(term91095, term91095.getClass(), "_mixIns", null);
        setField(term91095, term91095.getClass(), "_subtypeResolver", null);
        setField(term91095, term91095.getClass(), "_rootName", null);
        setField(term91095, term91095.getClass(), "_view", null);
        setField(term91095, term91095.getClass(), "_attributes", null);
        setField(term91095, term91095.getClass(), "_rootNames", null);
        setIntField(term91095, term91095.getClass(), "_mapperFeatures", 0);
        setField(term91095, term91095.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.ser.FilterProvider");
        Object[] args = new Object[2];
        args[0] = term91079;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term91094));
        assertTrue(recursiveEquals(term91079, term91095));
    }

};


