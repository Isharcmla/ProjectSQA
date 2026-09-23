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

public class SerializationConfig_init_928469441213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149240;
     Object term149255;
     Object term149256;

    public SerializationConfig_init_928469441213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149240 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        term149255 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term149255, term149255.getClass(), "_filterProvider", null);
        setField(term149255, term149255.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term149255, term149255.getClass(), "_serFeatures", 0);
        setIntField(term149255, term149255.getClass(), "_generatorFeatures", 0);
        setIntField(term149255, term149255.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term149255, term149255.getClass(), "_formatWriteFeatures", 0);
        setIntField(term149255, term149255.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term149255, term149255.getClass(), "_serializationInclusion", null);
        setField(term149255, term149255.getClass(), "_mixIns", null);
        setField(term149255, term149255.getClass(), "_subtypeResolver", null);
        setField(term149255, term149255.getClass(), "_rootName", null);
        setField(term149255, term149255.getClass(), "_view", null);
        setField(term149255, term149255.getClass(), "_attributes", null);
        setField(term149255, term149255.getClass(), "_rootNames", null);
        setIntField(term149255, term149255.getClass(), "_mapperFeatures", 0);
        setField(term149255, term149255.getClass(), "_base", null);
        term149256 = newInstance(Class.forName("com.fasterxml.jackson.databind.SerializationConfig"));
        setField(term149256, term149256.getClass(), "_filterProvider", null);
        setField(term149256, term149256.getClass(), "_defaultPrettyPrinter", null);
        setIntField(term149256, term149256.getClass(), "_serFeatures", 0);
        setIntField(term149256, term149256.getClass(), "_generatorFeatures", 0);
        setIntField(term149256, term149256.getClass(), "_generatorFeaturesToChange", 0);
        setIntField(term149256, term149256.getClass(), "_formatWriteFeatures", 0);
        setIntField(term149256, term149256.getClass(), "_formatWriteFeaturesToChange", 0);
        setField(term149256, term149256.getClass(), "_serializationInclusion", null);
        setField(term149256, term149256.getClass(), "_mixIns", null);
        setField(term149256, term149256.getClass(), "_subtypeResolver", null);
        setField(term149256, term149256.getClass(), "_rootName", null);
        setField(term149256, term149256.getClass(), "_view", null);
        setField(term149256, term149256.getClass(), "_attributes", null);
        setField(term149256, term149256.getClass(), "_rootNames", null);
        setIntField(term149256, term149256.getClass(), "_mapperFeatures", 0);
        setField(term149256, term149256.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.SerializationConfig");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term149240;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term149255));
        assertTrue(recursiveEquals(term149240, term149256));
    }

};


