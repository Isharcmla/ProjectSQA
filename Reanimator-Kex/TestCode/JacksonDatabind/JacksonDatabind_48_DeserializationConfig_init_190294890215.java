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

public class DeserializationConfig_init_190294890215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159241;

    public DeserializationConfig_init_190294890215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term156756 = Class.forName((String) "java.util.Collections$CheckedNavigableMap");
        Object term156588 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term156720 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term156588, term156588.getClass(), "_base", null);
        setIntField(term156588, term156588.getClass(), "_mapperFeatures", 0);
        setField(term156588, term156588.getClass(), "_mixIns", null);
        setField(term156588, term156588.getClass(), "_subtypeResolver", term156720);
        setField(term156588, term156588.getClass(), "_rootNames", null);
        setField(term156588, term156588.getClass(), "_rootName", null);
        setField(term156588, term156588.getClass(), "_view", term156756);
        setField(term156588, term156588.getClass(), "_attributes", null);
        term159241 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term159242 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term159243 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term159244 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term159241, term159241.getClass(), "_problemHandlers", null);
        setBooleanField(term159242, term159242.getClass(), "_cfgBigDecimalExact", false);
        setField(term159241, term159241.getClass(), "_nodeFactory", term159242);
        setIntField(term159241, term159241.getClass(), "_deserFeatures", 15214880);
        setIntField(term159241, term159241.getClass(), "_parserFeatures", 0);
        setIntField(term159241, term159241.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term159241, term159241.getClass(), "_formatReadFeatures", 0);
        setIntField(term159241, term159241.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term159241, term159241.getClass(), "_mixIns", null);
        setField(term159241, term159241.getClass(), "_subtypeResolver", null);
        setField(term159241, term159241.getClass(), "_rootName", null);
        setField(term159241, term159241.getClass(), "_view", null);
        setField(term159244, term159244.getClass(), "keySet", null);
        setField(term159244, term159244.getClass(), "values", null);
        setField(term159243, term159243.getClass(), "_shared", term159244);
        setField(term159243, term159243.getClass(), "_nonShared", null);
        setField(term159241, term159241.getClass(), "_attributes", term159243);
        setField(term159241, term159241.getClass(), "_rootNames", null);
        setIntField(term159241, term159241.getClass(), "_mapperFeatures", 1068991);
        setField(term159241, term159241.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term159241));
    }

};


