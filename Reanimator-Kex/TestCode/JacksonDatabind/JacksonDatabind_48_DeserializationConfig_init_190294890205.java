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

public class DeserializationConfig_init_190294890205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137722;
     Object term140023;
     Object term140028;

    public DeserializationConfig_init_190294890205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term137616 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term137616, term137616.getClass(), "_base", null);
        setIntField(term137616, term137616.getClass(), "_mapperFeatures", 0);
        setField(term137616, term137616.getClass(), "_mixIns", null);
        setField(term137616, term137616.getClass(), "_subtypeResolver", null);
        setField(term137616, term137616.getClass(), "_rootNames", null);
        setField(term137616, term137616.getClass(), "_rootName", null);
        setField(term137616, term137616.getClass(), "_view", null);
        setField(term137616, term137616.getClass(), "_attributes", null);
        term137722 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term140023 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term140024 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term140025 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term140026 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term140027 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term140023, term140023.getClass(), "_problemHandlers", null);
        setBooleanField(term140024, term140024.getClass(), "_cfgBigDecimalExact", false);
        setField(term140023, term140023.getClass(), "_nodeFactory", term140024);
        setIntField(term140023, term140023.getClass(), "_deserFeatures", 15214880);
        setIntField(term140023, term140023.getClass(), "_parserFeatures", 0);
        setIntField(term140023, term140023.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term140023, term140023.getClass(), "_formatReadFeatures", 0);
        setIntField(term140023, term140023.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term140023, term140023.getClass(), "_mixIns", null);
        setField(term140023, term140023.getClass(), "_subtypeResolver", null);
        setField(term140023, term140023.getClass(), "_rootName", null);
        setField(term140023, term140023.getClass(), "_view", null);
        setField(term140026, term140026.getClass(), "keySet", null);
        setField(term140026, term140026.getClass(), "values", null);
        setField(term140025, term140025.getClass(), "_shared", term140026);
        setField(term140025, term140025.getClass(), "_nonShared", null);
        setField(term140023, term140023.getClass(), "_attributes", term140025);
        setField(term140027, term140027.getClass(), "_rootNames", null);
        setField(term140023, term140023.getClass(), "_rootNames", term140027);
        setIntField(term140023, term140023.getClass(), "_mapperFeatures", 1068991);
        setField(term140023, term140023.getClass(), "_base", null);
        term140028 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term140028, term140028.getClass(), "_rootNames", null);
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
        args[3] = term137722;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term140023));
        assertTrue(recursiveEquals(term137722, term140028));
    }

};


