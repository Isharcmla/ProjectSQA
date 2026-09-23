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

public class DeserializationConfig_init_190294890213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152880;
     Object term153008;
     Object term155310;
     Object term155316;
     Object term155317;

    public DeserializationConfig_init_190294890213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term152652 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term152780 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term152652, term152652.getClass(), "_base", null);
        setIntField(term152652, term152652.getClass(), "_mapperFeatures", 0);
        setField(term152652, term152652.getClass(), "_mixIns", term152780);
        setField(term152652, term152652.getClass(), "_subtypeResolver", null);
        setField(term152652, term152652.getClass(), "_rootNames", null);
        setField(term152652, term152652.getClass(), "_rootName", null);
        setField(term152652, term152652.getClass(), "_view", null);
        setField(term152652, term152652.getClass(), "_attributes", null);
        term152880 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term153008 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term155310 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term155311 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term155312 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term155313 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term155314 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term155315 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term155310, term155310.getClass(), "_problemHandlers", null);
        setBooleanField(term155311, term155311.getClass(), "_cfgBigDecimalExact", false);
        setField(term155310, term155310.getClass(), "_nodeFactory", term155311);
        setIntField(term155310, term155310.getClass(), "_deserFeatures", 15214880);
        setIntField(term155310, term155310.getClass(), "_parserFeatures", 0);
        setIntField(term155310, term155310.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term155310, term155310.getClass(), "_formatReadFeatures", 0);
        setIntField(term155310, term155310.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term155312, term155312.getClass(), "_overrides", null);
        setField(term155312, term155312.getClass(), "_localMixIns", null);
        setField(term155310, term155310.getClass(), "_mixIns", term155312);
        setField(term155310, term155310.getClass(), "_subtypeResolver", null);
        setField(term155310, term155310.getClass(), "_rootName", null);
        setField(term155310, term155310.getClass(), "_view", null);
        setField(term155314, term155314.getClass(), "keySet", null);
        setField(term155314, term155314.getClass(), "values", null);
        setField(term155313, term155313.getClass(), "_shared", term155314);
        setField(term155313, term155313.getClass(), "_nonShared", null);
        setField(term155310, term155310.getClass(), "_attributes", term155313);
        setField(term155310, term155310.getClass(), "_rootNames", null);
        setIntField(term155310, term155310.getClass(), "_mapperFeatures", 1068991);
        setField(term155315, term155315.getClass(), "_classIntrospector", null);
        setField(term155315, term155315.getClass(), "_annotationIntrospector", null);
        setField(term155315, term155315.getClass(), "_visibilityChecker", null);
        setField(term155315, term155315.getClass(), "_propertyNamingStrategy", null);
        setField(term155315, term155315.getClass(), "_typeFactory", null);
        setField(term155315, term155315.getClass(), "_typeResolverBuilder", null);
        setField(term155315, term155315.getClass(), "_dateFormat", null);
        setField(term155315, term155315.getClass(), "_handlerInstantiator", null);
        setField(term155315, term155315.getClass(), "_locale", null);
        setField(term155315, term155315.getClass(), "_timeZone", null);
        setField(term155315, term155315.getClass(), "_defaultBase64", null);
        setField(term155310, term155310.getClass(), "_base", term155315);
        term155316 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term155316, term155316.getClass(), "_classIntrospector", null);
        setField(term155316, term155316.getClass(), "_annotationIntrospector", null);
        setField(term155316, term155316.getClass(), "_visibilityChecker", null);
        setField(term155316, term155316.getClass(), "_propertyNamingStrategy", null);
        setField(term155316, term155316.getClass(), "_typeFactory", null);
        setField(term155316, term155316.getClass(), "_typeResolverBuilder", null);
        setField(term155316, term155316.getClass(), "_dateFormat", null);
        setField(term155316, term155316.getClass(), "_handlerInstantiator", null);
        setField(term155316, term155316.getClass(), "_locale", null);
        setField(term155316, term155316.getClass(), "_timeZone", null);
        setField(term155316, term155316.getClass(), "_defaultBase64", null);
        term155317 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term155317, term155317.getClass(), "_overrides", null);
        setField(term155317, term155317.getClass(), "_localMixIns", null);
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
        args[0] = term152880;
        args[1] = null;
        args[2] = term153008;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term155310));
        assertTrue(recursiveEquals(term152880, term155316));
        assertTrue(recursiveEquals(term153008, term155317));
    }

};


