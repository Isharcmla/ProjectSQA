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

public class DeserializationConfig_init_19029489071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3156;

    public DeserializationConfig_init_19029489071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3156 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term3157 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term3158 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term3159 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term3156, term3156.getClass(), "_problemHandlers", null);
        setBooleanField(term3157, term3157.getClass(), "_cfgBigDecimalExact", false);
        setField(term3156, term3156.getClass(), "_nodeFactory", term3157);
        setIntField(term3156, term3156.getClass(), "_deserFeatures", 15214880);
        setIntField(term3156, term3156.getClass(), "_parserFeatures", 0);
        setIntField(term3156, term3156.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term3156, term3156.getClass(), "_formatReadFeatures", 0);
        setIntField(term3156, term3156.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term3156, term3156.getClass(), "_mixIns", null);
        setField(term3156, term3156.getClass(), "_subtypeResolver", null);
        setField(term3156, term3156.getClass(), "_rootName", null);
        setField(term3156, term3156.getClass(), "_view", null);
        setField(term3159, term3159.getClass(), "keySet", null);
        setField(term3159, term3159.getClass(), "values", null);
        setField(term3158, term3158.getClass(), "_shared", term3159);
        setField(term3158, term3158.getClass(), "_nonShared", null);
        setField(term3156, term3156.getClass(), "_attributes", term3158);
        setField(term3156, term3156.getClass(), "_rootNames", null);
        setIntField(term3156, term3156.getClass(), "_mapperFeatures", 1068991);
        setField(term3156, term3156.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term3156));
    }

};


