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

public class DeserializationConfig_init_190294890217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162919;

    public DeserializationConfig_init_190294890217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term160619 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term160619, term160619.getClass(), "_base", null);
        setIntField(term160619, term160619.getClass(), "_mapperFeatures", 0);
        setField(term160619, term160619.getClass(), "_mixIns", null);
        setField(term160619, term160619.getClass(), "_subtypeResolver", null);
        setField(term160619, term160619.getClass(), "_rootNames", null);
        setField(term160619, term160619.getClass(), "_rootName", null);
        setField(term160619, term160619.getClass(), "_view", null);
        setField(term160619, term160619.getClass(), "_attributes", null);
        term162919 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term162920 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term162921 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term162922 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term162919, term162919.getClass(), "_problemHandlers", null);
        setBooleanField(term162920, term162920.getClass(), "_cfgBigDecimalExact", false);
        setField(term162919, term162919.getClass(), "_nodeFactory", term162920);
        setIntField(term162919, term162919.getClass(), "_deserFeatures", 15214880);
        setIntField(term162919, term162919.getClass(), "_parserFeatures", 0);
        setIntField(term162919, term162919.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term162919, term162919.getClass(), "_formatReadFeatures", 0);
        setIntField(term162919, term162919.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term162919, term162919.getClass(), "_mixIns", null);
        setField(term162919, term162919.getClass(), "_subtypeResolver", null);
        setField(term162919, term162919.getClass(), "_rootName", null);
        setField(term162919, term162919.getClass(), "_view", null);
        setField(term162922, term162922.getClass(), "keySet", null);
        setField(term162922, term162922.getClass(), "values", null);
        setField(term162921, term162921.getClass(), "_shared", term162922);
        setField(term162921, term162921.getClass(), "_nonShared", null);
        setField(term162919, term162919.getClass(), "_attributes", term162921);
        setField(term162919, term162919.getClass(), "_rootNames", null);
        setIntField(term162919, term162919.getClass(), "_mapperFeatures", 1068991);
        setField(term162919, term162919.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term162919));
    }

};


