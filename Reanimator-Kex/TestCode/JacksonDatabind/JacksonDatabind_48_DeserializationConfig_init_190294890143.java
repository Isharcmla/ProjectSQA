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

public class DeserializationConfig_init_190294890143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25932;
     Object term28233;
     Object term28238;

    public DeserializationConfig_init_190294890143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25832 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term25832, term25832.getClass(), "_base", null);
        setIntField(term25832, term25832.getClass(), "_mapperFeatures", 0);
        setField(term25832, term25832.getClass(), "_mixIns", null);
        setField(term25832, term25832.getClass(), "_subtypeResolver", null);
        setField(term25832, term25832.getClass(), "_rootNames", null);
        setField(term25832, term25832.getClass(), "_rootName", null);
        setField(term25832, term25832.getClass(), "_view", null);
        setField(term25832, term25832.getClass(), "_attributes", null);
        term25932 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term28233 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term28234 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term28235 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term28236 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term28237 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term28233, term28233.getClass(), "_problemHandlers", null);
        setBooleanField(term28234, term28234.getClass(), "_cfgBigDecimalExact", false);
        setField(term28233, term28233.getClass(), "_nodeFactory", term28234);
        setIntField(term28233, term28233.getClass(), "_deserFeatures", 15214880);
        setIntField(term28233, term28233.getClass(), "_parserFeatures", 0);
        setIntField(term28233, term28233.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term28233, term28233.getClass(), "_formatReadFeatures", 0);
        setIntField(term28233, term28233.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term28233, term28233.getClass(), "_mixIns", null);
        setField(term28233, term28233.getClass(), "_subtypeResolver", null);
        setField(term28233, term28233.getClass(), "_rootName", null);
        setField(term28233, term28233.getClass(), "_view", null);
        setField(term28236, term28236.getClass(), "keySet", null);
        setField(term28236, term28236.getClass(), "values", null);
        setField(term28235, term28235.getClass(), "_shared", term28236);
        setField(term28235, term28235.getClass(), "_nonShared", null);
        setField(term28233, term28233.getClass(), "_attributes", term28235);
        setField(term28233, term28233.getClass(), "_rootNames", null);
        setIntField(term28233, term28233.getClass(), "_mapperFeatures", 1068991);
        setField(term28237, term28237.getClass(), "_classIntrospector", null);
        setField(term28237, term28237.getClass(), "_annotationIntrospector", null);
        setField(term28237, term28237.getClass(), "_visibilityChecker", null);
        setField(term28237, term28237.getClass(), "_propertyNamingStrategy", null);
        setField(term28237, term28237.getClass(), "_typeFactory", null);
        setField(term28237, term28237.getClass(), "_typeResolverBuilder", null);
        setField(term28237, term28237.getClass(), "_dateFormat", null);
        setField(term28237, term28237.getClass(), "_handlerInstantiator", null);
        setField(term28237, term28237.getClass(), "_locale", null);
        setField(term28237, term28237.getClass(), "_timeZone", null);
        setField(term28237, term28237.getClass(), "_defaultBase64", null);
        setField(term28233, term28233.getClass(), "_base", term28237);
        term28238 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term28238, term28238.getClass(), "_classIntrospector", null);
        setField(term28238, term28238.getClass(), "_annotationIntrospector", null);
        setField(term28238, term28238.getClass(), "_visibilityChecker", null);
        setField(term28238, term28238.getClass(), "_propertyNamingStrategy", null);
        setField(term28238, term28238.getClass(), "_typeFactory", null);
        setField(term28238, term28238.getClass(), "_typeResolverBuilder", null);
        setField(term28238, term28238.getClass(), "_dateFormat", null);
        setField(term28238, term28238.getClass(), "_handlerInstantiator", null);
        setField(term28238, term28238.getClass(), "_locale", null);
        setField(term28238, term28238.getClass(), "_timeZone", null);
        setField(term28238, term28238.getClass(), "_defaultBase64", null);
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
        args[0] = term25932;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term28233));
        assertTrue(recursiveEquals(term25932, term28238));
    }

};


