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

public class DeserializationConfig_init_780007208189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105841;
     Object term108212;
     Object term108213;

    public DeserializationConfig_init_780007208189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105841 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        term108212 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term108212, term108212.getClass(), "_problemHandlers", null);
        setField(term108212, term108212.getClass(), "_nodeFactory", null);
        setIntField(term108212, term108212.getClass(), "_deserFeatures", 0);
        setIntField(term108212, term108212.getClass(), "_parserFeatures", 0);
        setIntField(term108212, term108212.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term108212, term108212.getClass(), "_formatReadFeatures", 0);
        setIntField(term108212, term108212.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term108212, term108212.getClass(), "_mixIns", null);
        setField(term108212, term108212.getClass(), "_subtypeResolver", null);
        setField(term108212, term108212.getClass(), "_rootName", null);
        setField(term108212, term108212.getClass(), "_view", null);
        setField(term108212, term108212.getClass(), "_attributes", null);
        setField(term108212, term108212.getClass(), "_rootNames", null);
        setIntField(term108212, term108212.getClass(), "_mapperFeatures", 0);
        setField(term108212, term108212.getClass(), "_base", null);
        term108213 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term108213, term108213.getClass(), "_problemHandlers", null);
        setField(term108213, term108213.getClass(), "_nodeFactory", null);
        setIntField(term108213, term108213.getClass(), "_deserFeatures", 0);
        setIntField(term108213, term108213.getClass(), "_parserFeatures", 0);
        setIntField(term108213, term108213.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term108213, term108213.getClass(), "_formatReadFeatures", 0);
        setIntField(term108213, term108213.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term108213, term108213.getClass(), "_mixIns", null);
        setField(term108213, term108213.getClass(), "_subtypeResolver", null);
        setField(term108213, term108213.getClass(), "_rootName", null);
        setField(term108213, term108213.getClass(), "_view", null);
        setField(term108213, term108213.getClass(), "_attributes", null);
        setField(term108213, term108213.getClass(), "_rootNames", null);
        setIntField(term108213, term108213.getClass(), "_mapperFeatures", 0);
        setField(term108213, term108213.getClass(), "_base", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup");
        Object[] args = new Object[3];
        args[0] = term105841;
        args[1] = null;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term108212));
        assertTrue(recursiveEquals(term105841, term108213));
    }

};


