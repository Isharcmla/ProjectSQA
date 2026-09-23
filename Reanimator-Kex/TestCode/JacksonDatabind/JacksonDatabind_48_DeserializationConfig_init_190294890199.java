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

public class DeserializationConfig_init_190294890199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125932;
     Object term128340;
     Object term128345;

    public DeserializationConfig_init_190294890199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term125826 = Class.forName((String) "java.lang.invoke.VarHandleBooleans");
        Object term125562 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term125662 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term125790 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term125562, term125562.getClass(), "_base", term125662);
        setIntField(term125562, term125562.getClass(), "_mapperFeatures", 0);
        setField(term125562, term125562.getClass(), "_mixIns", term125790);
        setField(term125562, term125562.getClass(), "_subtypeResolver", null);
        setField(term125562, term125562.getClass(), "_rootNames", null);
        setField(term125562, term125562.getClass(), "_rootName", null);
        setField(term125562, term125562.getClass(), "_view", term125826);
        setField(term125562, term125562.getClass(), "_attributes", null);
        term125932 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term128340 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term128341 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term128342 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term128343 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term128344 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term128340, term128340.getClass(), "_problemHandlers", null);
        setBooleanField(term128341, term128341.getClass(), "_cfgBigDecimalExact", false);
        setField(term128340, term128340.getClass(), "_nodeFactory", term128341);
        setIntField(term128340, term128340.getClass(), "_deserFeatures", 15214880);
        setIntField(term128340, term128340.getClass(), "_parserFeatures", 0);
        setIntField(term128340, term128340.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term128340, term128340.getClass(), "_formatReadFeatures", 0);
        setIntField(term128340, term128340.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term128340, term128340.getClass(), "_mixIns", null);
        setField(term128340, term128340.getClass(), "_subtypeResolver", null);
        setField(term128340, term128340.getClass(), "_rootName", null);
        setField(term128340, term128340.getClass(), "_view", null);
        setField(term128343, term128343.getClass(), "keySet", null);
        setField(term128343, term128343.getClass(), "values", null);
        setField(term128342, term128342.getClass(), "_shared", term128343);
        setField(term128342, term128342.getClass(), "_nonShared", null);
        setField(term128340, term128340.getClass(), "_attributes", term128342);
        setField(term128344, term128344.getClass(), "_rootNames", null);
        setField(term128340, term128340.getClass(), "_rootNames", term128344);
        setIntField(term128340, term128340.getClass(), "_mapperFeatures", 1068991);
        setField(term128340, term128340.getClass(), "_base", null);
        term128345 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term128345, term128345.getClass(), "_rootNames", null);
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
        args[3] = term125932;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term128340));
        assertTrue(recursiveEquals(term125932, term128345));
    }

};


