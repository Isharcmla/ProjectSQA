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

public class DeserializationConfig_init_190294890149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39259;

    public DeserializationConfig_init_190294890149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36840 = Class.forName((String) "java.nio.file.FileTreeWalker$EventType");
        Object term36804 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term36804, term36804.getClass(), "_base", null);
        setIntField(term36804, term36804.getClass(), "_mapperFeatures", 0);
        setField(term36804, term36804.getClass(), "_mixIns", null);
        setField(term36804, term36804.getClass(), "_subtypeResolver", null);
        setField(term36804, term36804.getClass(), "_rootNames", null);
        setField(term36804, term36804.getClass(), "_rootName", null);
        setField(term36804, term36804.getClass(), "_view", term36840);
        setField(term36804, term36804.getClass(), "_attributes", null);
        term39259 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term39260 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term39261 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term39262 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term39259, term39259.getClass(), "_problemHandlers", null);
        setBooleanField(term39260, term39260.getClass(), "_cfgBigDecimalExact", false);
        setField(term39259, term39259.getClass(), "_nodeFactory", term39260);
        setIntField(term39259, term39259.getClass(), "_deserFeatures", 15214880);
        setIntField(term39259, term39259.getClass(), "_parserFeatures", 0);
        setIntField(term39259, term39259.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term39259, term39259.getClass(), "_formatReadFeatures", 0);
        setIntField(term39259, term39259.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term39259, term39259.getClass(), "_mixIns", null);
        setField(term39259, term39259.getClass(), "_subtypeResolver", null);
        setField(term39259, term39259.getClass(), "_rootName", null);
        setField(term39259, term39259.getClass(), "_view", null);
        setField(term39262, term39262.getClass(), "keySet", null);
        setField(term39262, term39262.getClass(), "values", null);
        setField(term39261, term39261.getClass(), "_shared", term39262);
        setField(term39261, term39261.getClass(), "_nonShared", null);
        setField(term39259, term39259.getClass(), "_attributes", term39261);
        setField(term39259, term39259.getClass(), "_rootNames", null);
        setIntField(term39259, term39259.getClass(), "_mapperFeatures", 1068991);
        setField(term39259, term39259.getClass(), "_base", null);
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
        assertTrue(recursiveEquals(instance, term39259));
    }

};


