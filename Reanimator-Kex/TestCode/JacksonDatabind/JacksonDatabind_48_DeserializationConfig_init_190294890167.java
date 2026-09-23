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

public class DeserializationConfig_init_190294890167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73469;

    public DeserializationConfig_init_190294890167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term71169 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term71169, term71169.getClass(), "_base", null);
        setIntField(term71169, term71169.getClass(), "_mapperFeatures", 0);
        setField(term71169, term71169.getClass(), "_mixIns", null);
        setField(term71169, term71169.getClass(), "_subtypeResolver", null);
        setField(term71169, term71169.getClass(), "_rootNames", null);
        setField(term71169, term71169.getClass(), "_rootName", null);
        setField(term71169, term71169.getClass(), "_view", null);
        setField(term71169, term71169.getClass(), "_attributes", null);
        term73469 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term73470 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term73471 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term73472 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term73469, term73469.getClass(), "_problemHandlers", null);
        setBooleanField(term73470, term73470.getClass(), "_cfgBigDecimalExact", false);
        setField(term73469, term73469.getClass(), "_nodeFactory", term73470);
        setIntField(term73469, term73469.getClass(), "_deserFeatures", 15214880);
        setIntField(term73469, term73469.getClass(), "_parserFeatures", 0);
        setIntField(term73469, term73469.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term73469, term73469.getClass(), "_formatReadFeatures", 0);
        setIntField(term73469, term73469.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term73469, term73469.getClass(), "_mixIns", null);
        setField(term73469, term73469.getClass(), "_subtypeResolver", null);
        setField(term73469, term73469.getClass(), "_rootName", null);
        setField(term73469, term73469.getClass(), "_view", null);
        setField(term73472, term73472.getClass(), "keySet", null);
        setField(term73472, term73472.getClass(), "values", null);
        setField(term73471, term73471.getClass(), "_shared", term73472);
        setField(term73471, term73471.getClass(), "_nonShared", null);
        setField(term73469, term73469.getClass(), "_attributes", term73471);
        setField(term73469, term73469.getClass(), "_rootNames", null);
        setIntField(term73469, term73469.getClass(), "_mapperFeatures", 1068991);
        setField(term73469, term73469.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term73469));
    }

};


