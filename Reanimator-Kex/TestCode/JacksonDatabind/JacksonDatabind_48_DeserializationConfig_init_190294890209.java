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

public class DeserializationConfig_init_190294890209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147722;

    public DeserializationConfig_init_190294890209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term145322 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term145422 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term145322, term145322.getClass(), "_base", term145422);
        setIntField(term145322, term145322.getClass(), "_mapperFeatures", 0);
        setField(term145322, term145322.getClass(), "_mixIns", null);
        setField(term145322, term145322.getClass(), "_subtypeResolver", null);
        setField(term145322, term145322.getClass(), "_rootNames", null);
        setField(term145322, term145322.getClass(), "_rootName", null);
        setField(term145322, term145322.getClass(), "_view", null);
        setField(term145322, term145322.getClass(), "_attributes", null);
        term147722 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term147723 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term147724 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term147725 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term147722, term147722.getClass(), "_problemHandlers", null);
        setBooleanField(term147723, term147723.getClass(), "_cfgBigDecimalExact", false);
        setField(term147722, term147722.getClass(), "_nodeFactory", term147723);
        setIntField(term147722, term147722.getClass(), "_deserFeatures", 15214880);
        setIntField(term147722, term147722.getClass(), "_parserFeatures", 0);
        setIntField(term147722, term147722.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term147722, term147722.getClass(), "_formatReadFeatures", 0);
        setIntField(term147722, term147722.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term147722, term147722.getClass(), "_mixIns", null);
        setField(term147722, term147722.getClass(), "_subtypeResolver", null);
        setField(term147722, term147722.getClass(), "_rootName", null);
        setField(term147722, term147722.getClass(), "_view", null);
        setField(term147725, term147725.getClass(), "keySet", null);
        setField(term147725, term147725.getClass(), "values", null);
        setField(term147724, term147724.getClass(), "_shared", term147725);
        setField(term147724, term147724.getClass(), "_nonShared", null);
        setField(term147722, term147722.getClass(), "_attributes", term147724);
        setField(term147722, term147722.getClass(), "_rootNames", null);
        setIntField(term147722, term147722.getClass(), "_mapperFeatures", 1068991);
        setField(term147722, term147722.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term147722));
    }

};


