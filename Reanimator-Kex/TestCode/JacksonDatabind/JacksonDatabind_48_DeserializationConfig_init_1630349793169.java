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

public class DeserializationConfig_init_1630349793169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73794;
     Object term73809;
     Object term73810;

    public DeserializationConfig_init_1630349793169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73794 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term73809 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term73809, term73809.getClass(), "_problemHandlers", null);
        setField(term73809, term73809.getClass(), "_nodeFactory", null);
        setIntField(term73809, term73809.getClass(), "_deserFeatures", 0);
        setIntField(term73809, term73809.getClass(), "_parserFeatures", 0);
        setIntField(term73809, term73809.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term73809, term73809.getClass(), "_formatReadFeatures", 0);
        setIntField(term73809, term73809.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term73809, term73809.getClass(), "_mixIns", null);
        setField(term73809, term73809.getClass(), "_subtypeResolver", null);
        setField(term73809, term73809.getClass(), "_rootName", null);
        setField(term73809, term73809.getClass(), "_view", null);
        setField(term73809, term73809.getClass(), "_attributes", null);
        setField(term73809, term73809.getClass(), "_rootNames", null);
        setIntField(term73809, term73809.getClass(), "_mapperFeatures", 0);
        setField(term73809, term73809.getClass(), "_base", null);
        term73810 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term73810, term73810.getClass(), "_problemHandlers", null);
        setField(term73810, term73810.getClass(), "_nodeFactory", null);
        setIntField(term73810, term73810.getClass(), "_deserFeatures", 0);
        setIntField(term73810, term73810.getClass(), "_parserFeatures", 0);
        setIntField(term73810, term73810.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term73810, term73810.getClass(), "_formatReadFeatures", 0);
        setIntField(term73810, term73810.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term73810, term73810.getClass(), "_mixIns", null);
        setField(term73810, term73810.getClass(), "_subtypeResolver", null);
        setField(term73810, term73810.getClass(), "_rootName", null);
        setField(term73810, term73810.getClass(), "_view", null);
        setField(term73810, term73810.getClass(), "_attributes", null);
        setField(term73810, term73810.getClass(), "_rootNames", null);
        setIntField(term73810, term73810.getClass(), "_mapperFeatures", 0);
        setField(term73810, term73810.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("java.lang.Class");
        Object[] args = new Object[2];
        args[0] = term73794;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73809));
        assertTrue(recursiveEquals(term73794, term73810));
    }

};


