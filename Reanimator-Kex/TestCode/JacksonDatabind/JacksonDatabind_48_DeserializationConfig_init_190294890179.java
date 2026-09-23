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

public class DeserializationConfig_init_190294890179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92541;

    public DeserializationConfig_init_190294890179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term90241 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term90241, term90241.getClass(), "_base", null);
        setIntField(term90241, term90241.getClass(), "_mapperFeatures", 0);
        setField(term90241, term90241.getClass(), "_mixIns", null);
        setField(term90241, term90241.getClass(), "_subtypeResolver", null);
        setField(term90241, term90241.getClass(), "_rootNames", null);
        setField(term90241, term90241.getClass(), "_rootName", null);
        setField(term90241, term90241.getClass(), "_view", null);
        setField(term90241, term90241.getClass(), "_attributes", null);
        term92541 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term92542 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term92543 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term92544 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term92541, term92541.getClass(), "_problemHandlers", null);
        setBooleanField(term92542, term92542.getClass(), "_cfgBigDecimalExact", false);
        setField(term92541, term92541.getClass(), "_nodeFactory", term92542);
        setIntField(term92541, term92541.getClass(), "_deserFeatures", 15214880);
        setIntField(term92541, term92541.getClass(), "_parserFeatures", 0);
        setIntField(term92541, term92541.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term92541, term92541.getClass(), "_formatReadFeatures", 0);
        setIntField(term92541, term92541.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term92541, term92541.getClass(), "_mixIns", null);
        setField(term92541, term92541.getClass(), "_subtypeResolver", null);
        setField(term92541, term92541.getClass(), "_rootName", null);
        setField(term92541, term92541.getClass(), "_view", null);
        setField(term92544, term92544.getClass(), "keySet", null);
        setField(term92544, term92544.getClass(), "values", null);
        setField(term92543, term92543.getClass(), "_shared", term92544);
        setField(term92543, term92543.getClass(), "_nonShared", null);
        setField(term92541, term92541.getClass(), "_attributes", term92543);
        setField(term92541, term92541.getClass(), "_rootNames", null);
        setIntField(term92541, term92541.getClass(), "_mapperFeatures", 1068991);
        setField(term92541, term92541.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term92541));
    }

};


