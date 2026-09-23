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
import java.lang.String;

public class DeserializationConfig_init_190294890145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31860;

    public DeserializationConfig_init_190294890145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29459 = Class.forName((String) "java.util.LinkedHashMap");
        Object term29423 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term29423, term29423.getClass(), "_base", null);
        setIntField(term29423, term29423.getClass(), "_mapperFeatures", 0);
        setField(term29423, term29423.getClass(), "_mixIns", null);
        setField(term29423, term29423.getClass(), "_subtypeResolver", null);
        setField(term29423, term29423.getClass(), "_rootNames", null);
        setField(term29423, term29423.getClass(), "_rootName", null);
        setField(term29423, term29423.getClass(), "_view", term29459);
        setField(term29423, term29423.getClass(), "_attributes", null);
        term31860 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term31861 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term31862 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term31863 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term31860, term31860.getClass(), "_problemHandlers", null);
        setBooleanField(term31861, term31861.getClass(), "_cfgBigDecimalExact", false);
        setField(term31860, term31860.getClass(), "_nodeFactory", term31861);
        setIntField(term31860, term31860.getClass(), "_deserFeatures", 15214880);
        setIntField(term31860, term31860.getClass(), "_parserFeatures", 0);
        setIntField(term31860, term31860.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term31860, term31860.getClass(), "_formatReadFeatures", 0);
        setIntField(term31860, term31860.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term31860, term31860.getClass(), "_mixIns", null);
        setField(term31860, term31860.getClass(), "_subtypeResolver", null);
        setField(term31860, term31860.getClass(), "_rootName", null);
        setField(term31860, term31860.getClass(), "_view", null);
        setField(term31863, term31863.getClass(), "keySet", null);
        setField(term31863, term31863.getClass(), "values", null);
        setField(term31862, term31862.getClass(), "_shared", term31863);
        setField(term31862, term31862.getClass(), "_nonShared", null);
        setField(term31860, term31860.getClass(), "_attributes", term31862);
        setField(term31860, term31860.getClass(), "_rootNames", null);
        setIntField(term31860, term31860.getClass(), "_mapperFeatures", 1068991);
        setField(term31860, term31860.getClass(), "_base", null);
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
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term31860));
    }

};


