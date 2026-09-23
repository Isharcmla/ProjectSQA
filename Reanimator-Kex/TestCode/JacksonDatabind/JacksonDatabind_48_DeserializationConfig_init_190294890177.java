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

public class DeserializationConfig_init_190294890177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86363;
     Object term88825;
     Object term88830;

    public DeserializationConfig_init_190294890177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86235 = Class.forName((String) "java.util.jar.Attributes");
        Object term86199 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term86199, term86199.getClass(), "_base", null);
        setIntField(term86199, term86199.getClass(), "_mapperFeatures", 0);
        setField(term86199, term86199.getClass(), "_mixIns", null);
        setField(term86199, term86199.getClass(), "_subtypeResolver", null);
        setField(term86199, term86199.getClass(), "_rootNames", null);
        setField(term86199, term86199.getClass(), "_rootName", null);
        setField(term86199, term86199.getClass(), "_view", term86235);
        setField(term86199, term86199.getClass(), "_attributes", null);
        term86363 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term88825 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term88826 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term88827 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term88828 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term88829 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term88825, term88825.getClass(), "_problemHandlers", null);
        setBooleanField(term88826, term88826.getClass(), "_cfgBigDecimalExact", false);
        setField(term88825, term88825.getClass(), "_nodeFactory", term88826);
        setIntField(term88825, term88825.getClass(), "_deserFeatures", 15214880);
        setIntField(term88825, term88825.getClass(), "_parserFeatures", 0);
        setIntField(term88825, term88825.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term88825, term88825.getClass(), "_formatReadFeatures", 0);
        setIntField(term88825, term88825.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term88827, term88827.getClass(), "_overrides", null);
        setField(term88827, term88827.getClass(), "_localMixIns", null);
        setField(term88825, term88825.getClass(), "_mixIns", term88827);
        setField(term88825, term88825.getClass(), "_subtypeResolver", null);
        setField(term88825, term88825.getClass(), "_rootName", null);
        setField(term88825, term88825.getClass(), "_view", null);
        setField(term88829, term88829.getClass(), "keySet", null);
        setField(term88829, term88829.getClass(), "values", null);
        setField(term88828, term88828.getClass(), "_shared", term88829);
        setField(term88828, term88828.getClass(), "_nonShared", null);
        setField(term88825, term88825.getClass(), "_attributes", term88828);
        setField(term88825, term88825.getClass(), "_rootNames", null);
        setIntField(term88825, term88825.getClass(), "_mapperFeatures", 1068991);
        setField(term88825, term88825.getClass(), "_base", null);
        term88830 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term88830, term88830.getClass(), "_overrides", null);
        setField(term88830, term88830.getClass(), "_localMixIns", null);
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
        args[2] = term86363;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term88825));
        assertTrue(recursiveEquals(term86363, term88830));
    }

};


