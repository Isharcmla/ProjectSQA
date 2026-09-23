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
import java.lang.Object;

public class DeserializationConfig_init_190294890183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98048;
     Object term100349;
     Object term100354;

    public DeserializationConfig_init_190294890183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term97920 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term97920, term97920.getClass(), "_base", null);
        setIntField(term97920, term97920.getClass(), "_mapperFeatures", 0);
        setField(term97920, term97920.getClass(), "_mixIns", null);
        setField(term97920, term97920.getClass(), "_subtypeResolver", null);
        setField(term97920, term97920.getClass(), "_rootNames", null);
        setField(term97920, term97920.getClass(), "_rootName", null);
        setField(term97920, term97920.getClass(), "_view", null);
        setField(term97920, term97920.getClass(), "_attributes", null);
        term98048 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term100349 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term100350 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term100351 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term100352 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term100353 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term100349, term100349.getClass(), "_problemHandlers", null);
        setBooleanField(term100350, term100350.getClass(), "_cfgBigDecimalExact", false);
        setField(term100349, term100349.getClass(), "_nodeFactory", term100350);
        setIntField(term100349, term100349.getClass(), "_deserFeatures", 15214880);
        setIntField(term100349, term100349.getClass(), "_parserFeatures", 0);
        setIntField(term100349, term100349.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term100349, term100349.getClass(), "_formatReadFeatures", 0);
        setIntField(term100349, term100349.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term100351, term100351.getClass(), "_overrides", null);
        setField(term100351, term100351.getClass(), "_localMixIns", null);
        setField(term100349, term100349.getClass(), "_mixIns", term100351);
        setField(term100349, term100349.getClass(), "_subtypeResolver", null);
        setField(term100349, term100349.getClass(), "_rootName", null);
        setField(term100349, term100349.getClass(), "_view", null);
        setField(term100353, term100353.getClass(), "keySet", null);
        setField(term100353, term100353.getClass(), "values", null);
        setField(term100352, term100352.getClass(), "_shared", term100353);
        setField(term100352, term100352.getClass(), "_nonShared", null);
        setField(term100349, term100349.getClass(), "_attributes", term100352);
        setField(term100349, term100349.getClass(), "_rootNames", null);
        setIntField(term100349, term100349.getClass(), "_mapperFeatures", 1068991);
        setField(term100349, term100349.getClass(), "_base", null);
        term100354 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term100354, term100354.getClass(), "_overrides", null);
        setField(term100354, term100354.getClass(), "_localMixIns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.DeserializationConfig");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.jsontype.SubtypeResolver");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term98048;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term100349));
        assertTrue(recursiveEquals(term98048, term100354));
    }

};


