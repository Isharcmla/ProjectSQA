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

public class DeserializationConfig_init_190294890193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113697;
     Object term113803;
     Object term116194;
     Object term116200;
     Object term116201;

    public DeserializationConfig_init_190294890193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term113449 = Class.forName((String) "java.lang.invoke.VarHandleByteArrayAsDoubles$ByteBufferHandle");
        Object term113313 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term113413 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term113569 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term113313, term113313.getClass(), "_base", term113413);
        setIntField(term113313, term113313.getClass(), "_mapperFeatures", 0);
        setField(term113313, term113313.getClass(), "_mixIns", null);
        setField(term113313, term113313.getClass(), "_subtypeResolver", null);
        setField(term113313, term113313.getClass(), "_rootNames", null);
        setField(term113313, term113313.getClass(), "_rootName", null);
        setField(term113313, term113313.getClass(), "_view", term113449);
        setField(term113313, term113313.getClass(), "_attributes", term113569);
        term113697 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term113803 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term116194 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term116195 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term116196 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term116197 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term116198 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term116199 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term116194, term116194.getClass(), "_problemHandlers", null);
        setBooleanField(term116195, term116195.getClass(), "_cfgBigDecimalExact", false);
        setField(term116194, term116194.getClass(), "_nodeFactory", term116195);
        setIntField(term116194, term116194.getClass(), "_deserFeatures", 15214880);
        setIntField(term116194, term116194.getClass(), "_parserFeatures", 0);
        setIntField(term116194, term116194.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term116194, term116194.getClass(), "_formatReadFeatures", 0);
        setIntField(term116194, term116194.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term116196, term116196.getClass(), "_overrides", null);
        setField(term116196, term116196.getClass(), "_localMixIns", null);
        setField(term116194, term116194.getClass(), "_mixIns", term116196);
        setField(term116194, term116194.getClass(), "_subtypeResolver", null);
        setField(term116194, term116194.getClass(), "_rootName", null);
        setField(term116194, term116194.getClass(), "_view", null);
        setField(term116198, term116198.getClass(), "keySet", null);
        setField(term116198, term116198.getClass(), "values", null);
        setField(term116197, term116197.getClass(), "_shared", term116198);
        setField(term116197, term116197.getClass(), "_nonShared", null);
        setField(term116194, term116194.getClass(), "_attributes", term116197);
        setField(term116199, term116199.getClass(), "_rootNames", null);
        setField(term116194, term116194.getClass(), "_rootNames", term116199);
        setIntField(term116194, term116194.getClass(), "_mapperFeatures", 1068991);
        setField(term116194, term116194.getClass(), "_base", null);
        term116200 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term116200, term116200.getClass(), "_overrides", null);
        setField(term116200, term116200.getClass(), "_localMixIns", null);
        term116201 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term116201, term116201.getClass(), "_rootNames", null);
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
        args[2] = term113697;
        args[3] = term113803;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term116194));
        assertTrue(recursiveEquals(term113697, term116200));
        assertTrue(recursiveEquals(term113803, term116201));
    }

};


