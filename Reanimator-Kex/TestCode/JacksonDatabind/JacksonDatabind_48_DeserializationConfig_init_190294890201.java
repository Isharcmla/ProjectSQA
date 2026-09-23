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

public class DeserializationConfig_init_190294890201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129936;
     Object term132237;
     Object term132242;

    public DeserializationConfig_init_190294890201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term129808 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term129808, term129808.getClass(), "_base", null);
        setIntField(term129808, term129808.getClass(), "_mapperFeatures", 0);
        setField(term129808, term129808.getClass(), "_mixIns", null);
        setField(term129808, term129808.getClass(), "_subtypeResolver", null);
        setField(term129808, term129808.getClass(), "_rootNames", null);
        setField(term129808, term129808.getClass(), "_rootName", null);
        setField(term129808, term129808.getClass(), "_view", null);
        setField(term129808, term129808.getClass(), "_attributes", null);
        term129936 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term132237 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term132238 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term132239 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term132240 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term132241 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term132237, term132237.getClass(), "_problemHandlers", null);
        setBooleanField(term132238, term132238.getClass(), "_cfgBigDecimalExact", false);
        setField(term132237, term132237.getClass(), "_nodeFactory", term132238);
        setIntField(term132237, term132237.getClass(), "_deserFeatures", 15214880);
        setIntField(term132237, term132237.getClass(), "_parserFeatures", 0);
        setIntField(term132237, term132237.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term132237, term132237.getClass(), "_formatReadFeatures", 0);
        setIntField(term132237, term132237.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term132239, term132239.getClass(), "_overrides", null);
        setField(term132239, term132239.getClass(), "_localMixIns", null);
        setField(term132237, term132237.getClass(), "_mixIns", term132239);
        setField(term132237, term132237.getClass(), "_subtypeResolver", null);
        setField(term132237, term132237.getClass(), "_rootName", null);
        setField(term132237, term132237.getClass(), "_view", null);
        setField(term132241, term132241.getClass(), "keySet", null);
        setField(term132241, term132241.getClass(), "values", null);
        setField(term132240, term132240.getClass(), "_shared", term132241);
        setField(term132240, term132240.getClass(), "_nonShared", null);
        setField(term132237, term132237.getClass(), "_attributes", term132240);
        setField(term132237, term132237.getClass(), "_rootNames", null);
        setIntField(term132237, term132237.getClass(), "_mapperFeatures", 1068991);
        setField(term132237, term132237.getClass(), "_base", null);
        term132242 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term132242, term132242.getClass(), "_overrides", null);
        setField(term132242, term132242.getClass(), "_localMixIns", null);
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
        args[2] = term129936;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term132237));
        assertTrue(recursiveEquals(term129936, term132242));
    }

};


