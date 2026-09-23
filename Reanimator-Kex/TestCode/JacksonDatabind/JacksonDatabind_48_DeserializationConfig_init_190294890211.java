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

public class DeserializationConfig_init_190294890211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151340;

    public DeserializationConfig_init_190294890211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term149040 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term149040, term149040.getClass(), "_base", null);
        setIntField(term149040, term149040.getClass(), "_mapperFeatures", 0);
        setField(term149040, term149040.getClass(), "_mixIns", null);
        setField(term149040, term149040.getClass(), "_subtypeResolver", null);
        setField(term149040, term149040.getClass(), "_rootNames", null);
        setField(term149040, term149040.getClass(), "_rootName", null);
        setField(term149040, term149040.getClass(), "_view", null);
        setField(term149040, term149040.getClass(), "_attributes", null);
        term151340 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term151341 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term151342 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term151343 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term151340, term151340.getClass(), "_problemHandlers", null);
        setBooleanField(term151341, term151341.getClass(), "_cfgBigDecimalExact", false);
        setField(term151340, term151340.getClass(), "_nodeFactory", term151341);
        setIntField(term151340, term151340.getClass(), "_deserFeatures", 15214880);
        setIntField(term151340, term151340.getClass(), "_parserFeatures", 0);
        setIntField(term151340, term151340.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term151340, term151340.getClass(), "_formatReadFeatures", 0);
        setIntField(term151340, term151340.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term151340, term151340.getClass(), "_mixIns", null);
        setField(term151340, term151340.getClass(), "_subtypeResolver", null);
        setField(term151340, term151340.getClass(), "_rootName", null);
        setField(term151340, term151340.getClass(), "_view", null);
        setField(term151343, term151343.getClass(), "keySet", null);
        setField(term151343, term151343.getClass(), "values", null);
        setField(term151342, term151342.getClass(), "_shared", term151343);
        setField(term151342, term151342.getClass(), "_nonShared", null);
        setField(term151340, term151340.getClass(), "_attributes", term151342);
        setField(term151340, term151340.getClass(), "_rootNames", null);
        setIntField(term151340, term151340.getClass(), "_mapperFeatures", 1068991);
        setField(term151340, term151340.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term151340));
    }

};


