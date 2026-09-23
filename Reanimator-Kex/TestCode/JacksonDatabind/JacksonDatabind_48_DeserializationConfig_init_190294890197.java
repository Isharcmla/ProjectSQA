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

public class DeserializationConfig_init_190294890197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122143;
     Object term124444;
     Object term124449;

    public DeserializationConfig_init_190294890197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term121915 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term122015 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term121915, term121915.getClass(), "_base", term122015);
        setIntField(term121915, term121915.getClass(), "_mapperFeatures", 0);
        setField(term121915, term121915.getClass(), "_mixIns", null);
        setField(term121915, term121915.getClass(), "_subtypeResolver", null);
        setField(term121915, term121915.getClass(), "_rootNames", null);
        setField(term121915, term121915.getClass(), "_rootName", null);
        setField(term121915, term121915.getClass(), "_view", null);
        setField(term121915, term121915.getClass(), "_attributes", null);
        term122143 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term124444 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term124445 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term124446 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term124447 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term124448 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term124444, term124444.getClass(), "_problemHandlers", null);
        setBooleanField(term124445, term124445.getClass(), "_cfgBigDecimalExact", false);
        setField(term124444, term124444.getClass(), "_nodeFactory", term124445);
        setIntField(term124444, term124444.getClass(), "_deserFeatures", 15214880);
        setIntField(term124444, term124444.getClass(), "_parserFeatures", 0);
        setIntField(term124444, term124444.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term124444, term124444.getClass(), "_formatReadFeatures", 0);
        setIntField(term124444, term124444.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term124446, term124446.getClass(), "_overrides", null);
        setField(term124446, term124446.getClass(), "_localMixIns", null);
        setField(term124444, term124444.getClass(), "_mixIns", term124446);
        setField(term124444, term124444.getClass(), "_subtypeResolver", null);
        setField(term124444, term124444.getClass(), "_rootName", null);
        setField(term124444, term124444.getClass(), "_view", null);
        setField(term124448, term124448.getClass(), "keySet", null);
        setField(term124448, term124448.getClass(), "values", null);
        setField(term124447, term124447.getClass(), "_shared", term124448);
        setField(term124447, term124447.getClass(), "_nonShared", null);
        setField(term124444, term124444.getClass(), "_attributes", term124447);
        setField(term124444, term124444.getClass(), "_rootNames", null);
        setIntField(term124444, term124444.getClass(), "_mapperFeatures", 1068991);
        setField(term124444, term124444.getClass(), "_base", null);
        term124449 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term124449, term124449.getClass(), "_overrides", null);
        setField(term124449, term124449.getClass(), "_localMixIns", null);
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
        args[2] = term122143;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term124444));
        assertTrue(recursiveEquals(term122143, term124449));
    }

};


