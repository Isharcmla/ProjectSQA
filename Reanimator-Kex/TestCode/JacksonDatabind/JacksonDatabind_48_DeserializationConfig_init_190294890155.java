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

public class DeserializationConfig_init_190294890155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48723;
     Object term51024;
     Object term51029;

    public DeserializationConfig_init_190294890155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48463 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term48595 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term48463, term48463.getClass(), "_base", null);
        setIntField(term48463, term48463.getClass(), "_mapperFeatures", 0);
        setField(term48463, term48463.getClass(), "_mixIns", null);
        setField(term48463, term48463.getClass(), "_subtypeResolver", term48595);
        setField(term48463, term48463.getClass(), "_rootNames", null);
        setField(term48463, term48463.getClass(), "_rootName", null);
        setField(term48463, term48463.getClass(), "_view", null);
        setField(term48463, term48463.getClass(), "_attributes", null);
        term48723 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term51024 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term51025 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term51026 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term51027 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term51028 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term51024, term51024.getClass(), "_problemHandlers", null);
        setBooleanField(term51025, term51025.getClass(), "_cfgBigDecimalExact", false);
        setField(term51024, term51024.getClass(), "_nodeFactory", term51025);
        setIntField(term51024, term51024.getClass(), "_deserFeatures", 15214880);
        setIntField(term51024, term51024.getClass(), "_parserFeatures", 0);
        setIntField(term51024, term51024.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term51024, term51024.getClass(), "_formatReadFeatures", 0);
        setIntField(term51024, term51024.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term51026, term51026.getClass(), "_overrides", null);
        setField(term51026, term51026.getClass(), "_localMixIns", null);
        setField(term51024, term51024.getClass(), "_mixIns", term51026);
        setField(term51024, term51024.getClass(), "_subtypeResolver", null);
        setField(term51024, term51024.getClass(), "_rootName", null);
        setField(term51024, term51024.getClass(), "_view", null);
        setField(term51028, term51028.getClass(), "keySet", null);
        setField(term51028, term51028.getClass(), "values", null);
        setField(term51027, term51027.getClass(), "_shared", term51028);
        setField(term51027, term51027.getClass(), "_nonShared", null);
        setField(term51024, term51024.getClass(), "_attributes", term51027);
        setField(term51024, term51024.getClass(), "_rootNames", null);
        setIntField(term51024, term51024.getClass(), "_mapperFeatures", 1068991);
        setField(term51024, term51024.getClass(), "_base", null);
        term51029 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term51029, term51029.getClass(), "_overrides", null);
        setField(term51029, term51029.getClass(), "_localMixIns", null);
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
        args[2] = term48723;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term51024));
        assertTrue(recursiveEquals(term48723, term51029));
    }

};


