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

public class DeserializationConfig_init_190294890151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40902;
     Object term43203;
     Object term43208;

    public DeserializationConfig_init_190294890151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term40674 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term40774 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term40674, term40674.getClass(), "_base", term40774);
        setIntField(term40674, term40674.getClass(), "_mapperFeatures", 0);
        setField(term40674, term40674.getClass(), "_mixIns", null);
        setField(term40674, term40674.getClass(), "_subtypeResolver", null);
        setField(term40674, term40674.getClass(), "_rootNames", null);
        setField(term40674, term40674.getClass(), "_rootName", null);
        setField(term40674, term40674.getClass(), "_view", null);
        setField(term40674, term40674.getClass(), "_attributes", null);
        term40902 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term43203 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term43204 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term43205 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term43206 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term43207 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term43203, term43203.getClass(), "_problemHandlers", null);
        setBooleanField(term43204, term43204.getClass(), "_cfgBigDecimalExact", false);
        setField(term43203, term43203.getClass(), "_nodeFactory", term43204);
        setIntField(term43203, term43203.getClass(), "_deserFeatures", 15214880);
        setIntField(term43203, term43203.getClass(), "_parserFeatures", 0);
        setIntField(term43203, term43203.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term43203, term43203.getClass(), "_formatReadFeatures", 0);
        setIntField(term43203, term43203.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term43205, term43205.getClass(), "_overrides", null);
        setField(term43205, term43205.getClass(), "_localMixIns", null);
        setField(term43203, term43203.getClass(), "_mixIns", term43205);
        setField(term43203, term43203.getClass(), "_subtypeResolver", null);
        setField(term43203, term43203.getClass(), "_rootName", null);
        setField(term43203, term43203.getClass(), "_view", null);
        setField(term43207, term43207.getClass(), "keySet", null);
        setField(term43207, term43207.getClass(), "values", null);
        setField(term43206, term43206.getClass(), "_shared", term43207);
        setField(term43206, term43206.getClass(), "_nonShared", null);
        setField(term43203, term43203.getClass(), "_attributes", term43206);
        setField(term43203, term43203.getClass(), "_rootNames", null);
        setIntField(term43203, term43203.getClass(), "_mapperFeatures", 1068991);
        setField(term43203, term43203.getClass(), "_base", null);
        term43208 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term43208, term43208.getClass(), "_overrides", null);
        setField(term43208, term43208.getClass(), "_localMixIns", null);
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
        args[2] = term40902;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term43203));
        assertTrue(recursiveEquals(term40902, term43208));
    }

};


