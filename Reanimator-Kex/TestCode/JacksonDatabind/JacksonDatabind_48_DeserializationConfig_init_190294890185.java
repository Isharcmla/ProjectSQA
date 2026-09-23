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

public class DeserializationConfig_init_190294890185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104239;

    public DeserializationConfig_init_190294890185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101613 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term101713 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term101819 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term101939 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term101613, term101613.getClass(), "_base", term101713);
        setIntField(term101613, term101613.getClass(), "_mapperFeatures", 0);
        setField(term101613, term101613.getClass(), "_mixIns", null);
        setField(term101613, term101613.getClass(), "_subtypeResolver", null);
        setField(term101613, term101613.getClass(), "_rootNames", term101819);
        setField(term101613, term101613.getClass(), "_rootName", null);
        setField(term101613, term101613.getClass(), "_view", null);
        setField(term101613, term101613.getClass(), "_attributes", term101939);
        term104239 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term104240 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term104241 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term104242 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term104239, term104239.getClass(), "_problemHandlers", null);
        setBooleanField(term104240, term104240.getClass(), "_cfgBigDecimalExact", false);
        setField(term104239, term104239.getClass(), "_nodeFactory", term104240);
        setIntField(term104239, term104239.getClass(), "_deserFeatures", 15214880);
        setIntField(term104239, term104239.getClass(), "_parserFeatures", 0);
        setIntField(term104239, term104239.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term104239, term104239.getClass(), "_formatReadFeatures", 0);
        setIntField(term104239, term104239.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term104239, term104239.getClass(), "_mixIns", null);
        setField(term104239, term104239.getClass(), "_subtypeResolver", null);
        setField(term104239, term104239.getClass(), "_rootName", null);
        setField(term104239, term104239.getClass(), "_view", null);
        setField(term104242, term104242.getClass(), "keySet", null);
        setField(term104242, term104242.getClass(), "values", null);
        setField(term104241, term104241.getClass(), "_shared", term104242);
        setField(term104241, term104241.getClass(), "_nonShared", null);
        setField(term104239, term104239.getClass(), "_attributes", term104241);
        setField(term104239, term104239.getClass(), "_rootNames", null);
        setIntField(term104239, term104239.getClass(), "_mapperFeatures", 1068991);
        setField(term104239, term104239.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term104239));
    }

};


