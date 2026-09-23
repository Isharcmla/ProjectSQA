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

public class DeserializationConfig_init_190294890175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84858;

    public DeserializationConfig_init_190294890175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term82558 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term82558, term82558.getClass(), "_base", null);
        setIntField(term82558, term82558.getClass(), "_mapperFeatures", 0);
        setField(term82558, term82558.getClass(), "_mixIns", null);
        setField(term82558, term82558.getClass(), "_subtypeResolver", null);
        setField(term82558, term82558.getClass(), "_rootNames", null);
        setField(term82558, term82558.getClass(), "_rootName", null);
        setField(term82558, term82558.getClass(), "_view", null);
        setField(term82558, term82558.getClass(), "_attributes", null);
        term84858 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term84859 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term84860 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term84861 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term84858, term84858.getClass(), "_problemHandlers", null);
        setBooleanField(term84859, term84859.getClass(), "_cfgBigDecimalExact", false);
        setField(term84858, term84858.getClass(), "_nodeFactory", term84859);
        setIntField(term84858, term84858.getClass(), "_deserFeatures", 15214880);
        setIntField(term84858, term84858.getClass(), "_parserFeatures", 0);
        setIntField(term84858, term84858.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term84858, term84858.getClass(), "_formatReadFeatures", 0);
        setIntField(term84858, term84858.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term84858, term84858.getClass(), "_mixIns", null);
        setField(term84858, term84858.getClass(), "_subtypeResolver", null);
        setField(term84858, term84858.getClass(), "_rootName", null);
        setField(term84858, term84858.getClass(), "_view", null);
        setField(term84861, term84861.getClass(), "keySet", null);
        setField(term84861, term84861.getClass(), "values", null);
        setField(term84860, term84860.getClass(), "_shared", term84861);
        setField(term84860, term84860.getClass(), "_nonShared", null);
        setField(term84858, term84858.getClass(), "_attributes", term84860);
        setField(term84858, term84858.getClass(), "_rootNames", null);
        setIntField(term84858, term84858.getClass(), "_mapperFeatures", 1068991);
        setField(term84858, term84858.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term84858));
    }

};


