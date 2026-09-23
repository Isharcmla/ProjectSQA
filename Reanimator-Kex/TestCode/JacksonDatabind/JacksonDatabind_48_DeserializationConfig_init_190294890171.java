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

public class DeserializationConfig_init_190294890171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75166;
     Object term75294;
     Object term77596;
     Object term77602;
     Object term77603;

    public DeserializationConfig_init_190294890171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term74966 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term75066 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term74966, term74966.getClass(), "_base", term75066);
        setIntField(term74966, term74966.getClass(), "_mapperFeatures", 0);
        setField(term74966, term74966.getClass(), "_mixIns", null);
        setField(term74966, term74966.getClass(), "_subtypeResolver", null);
        setField(term74966, term74966.getClass(), "_rootNames", null);
        setField(term74966, term74966.getClass(), "_rootName", null);
        setField(term74966, term74966.getClass(), "_view", null);
        setField(term74966, term74966.getClass(), "_attributes", null);
        term75166 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term75294 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term77596 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term77597 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term77598 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term77599 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term77600 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term77601 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term77596, term77596.getClass(), "_problemHandlers", null);
        setBooleanField(term77597, term77597.getClass(), "_cfgBigDecimalExact", false);
        setField(term77596, term77596.getClass(), "_nodeFactory", term77597);
        setIntField(term77596, term77596.getClass(), "_deserFeatures", 15214880);
        setIntField(term77596, term77596.getClass(), "_parserFeatures", 0);
        setIntField(term77596, term77596.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term77596, term77596.getClass(), "_formatReadFeatures", 0);
        setIntField(term77596, term77596.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term77598, term77598.getClass(), "_overrides", null);
        setField(term77598, term77598.getClass(), "_localMixIns", null);
        setField(term77596, term77596.getClass(), "_mixIns", term77598);
        setField(term77596, term77596.getClass(), "_subtypeResolver", null);
        setField(term77596, term77596.getClass(), "_rootName", null);
        setField(term77596, term77596.getClass(), "_view", null);
        setField(term77600, term77600.getClass(), "keySet", null);
        setField(term77600, term77600.getClass(), "values", null);
        setField(term77599, term77599.getClass(), "_shared", term77600);
        setField(term77599, term77599.getClass(), "_nonShared", null);
        setField(term77596, term77596.getClass(), "_attributes", term77599);
        setField(term77596, term77596.getClass(), "_rootNames", null);
        setIntField(term77596, term77596.getClass(), "_mapperFeatures", 1068991);
        setField(term77601, term77601.getClass(), "_classIntrospector", null);
        setField(term77601, term77601.getClass(), "_annotationIntrospector", null);
        setField(term77601, term77601.getClass(), "_visibilityChecker", null);
        setField(term77601, term77601.getClass(), "_propertyNamingStrategy", null);
        setField(term77601, term77601.getClass(), "_typeFactory", null);
        setField(term77601, term77601.getClass(), "_typeResolverBuilder", null);
        setField(term77601, term77601.getClass(), "_dateFormat", null);
        setField(term77601, term77601.getClass(), "_handlerInstantiator", null);
        setField(term77601, term77601.getClass(), "_locale", null);
        setField(term77601, term77601.getClass(), "_timeZone", null);
        setField(term77601, term77601.getClass(), "_defaultBase64", null);
        setField(term77596, term77596.getClass(), "_base", term77601);
        term77602 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term77602, term77602.getClass(), "_classIntrospector", null);
        setField(term77602, term77602.getClass(), "_annotationIntrospector", null);
        setField(term77602, term77602.getClass(), "_visibilityChecker", null);
        setField(term77602, term77602.getClass(), "_propertyNamingStrategy", null);
        setField(term77602, term77602.getClass(), "_typeFactory", null);
        setField(term77602, term77602.getClass(), "_typeResolverBuilder", null);
        setField(term77602, term77602.getClass(), "_dateFormat", null);
        setField(term77602, term77602.getClass(), "_handlerInstantiator", null);
        setField(term77602, term77602.getClass(), "_locale", null);
        setField(term77602, term77602.getClass(), "_timeZone", null);
        setField(term77602, term77602.getClass(), "_defaultBase64", null);
        term77603 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term77603, term77603.getClass(), "_overrides", null);
        setField(term77603, term77603.getClass(), "_localMixIns", null);
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
        args[0] = term75166;
        args[1] = null;
        args[2] = term75294;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term77596));
        assertTrue(recursiveEquals(term75166, term77602));
        assertTrue(recursiveEquals(term75294, term77603));
    }

};


