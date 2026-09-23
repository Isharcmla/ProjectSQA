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

public class DeserializationConfig_init_190294890195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117800;
     Object term117932;
     Object term118038;
     Object term120472;
     Object term120479;
     Object term120480;
     Object term120481;

    public DeserializationConfig_init_190294890195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term117700 = Class.forName((String) "com.fasterxml.jackson.core.JsonGenerator$Feature");
        Object term117558 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term117664 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term117558, term117558.getClass(), "_base", null);
        setIntField(term117558, term117558.getClass(), "_mapperFeatures", 0);
        setField(term117558, term117558.getClass(), "_mixIns", null);
        setField(term117558, term117558.getClass(), "_subtypeResolver", null);
        setField(term117558, term117558.getClass(), "_rootNames", term117664);
        setField(term117558, term117558.getClass(), "_rootName", null);
        setField(term117558, term117558.getClass(), "_view", term117700);
        setField(term117558, term117558.getClass(), "_attributes", null);
        term117800 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term117932 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        term118038 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term120472 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term120473 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term120474 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term120475 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term120476 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term120477 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term120478 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term120472, term120472.getClass(), "_problemHandlers", null);
        setBooleanField(term120473, term120473.getClass(), "_cfgBigDecimalExact", false);
        setField(term120472, term120472.getClass(), "_nodeFactory", term120473);
        setIntField(term120472, term120472.getClass(), "_deserFeatures", 15214880);
        setIntField(term120472, term120472.getClass(), "_parserFeatures", 0);
        setIntField(term120472, term120472.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term120472, term120472.getClass(), "_formatReadFeatures", 0);
        setIntField(term120472, term120472.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term120472, term120472.getClass(), "_mixIns", null);
        setField(term120474, term120474.getClass(), "_registeredSubtypes", null);
        setField(term120472, term120472.getClass(), "_subtypeResolver", term120474);
        setField(term120472, term120472.getClass(), "_rootName", null);
        setField(term120472, term120472.getClass(), "_view", null);
        setField(term120476, term120476.getClass(), "keySet", null);
        setField(term120476, term120476.getClass(), "values", null);
        setField(term120475, term120475.getClass(), "_shared", term120476);
        setField(term120475, term120475.getClass(), "_nonShared", null);
        setField(term120472, term120472.getClass(), "_attributes", term120475);
        setField(term120477, term120477.getClass(), "_rootNames", null);
        setField(term120472, term120472.getClass(), "_rootNames", term120477);
        setIntField(term120472, term120472.getClass(), "_mapperFeatures", 1068991);
        setField(term120478, term120478.getClass(), "_classIntrospector", null);
        setField(term120478, term120478.getClass(), "_annotationIntrospector", null);
        setField(term120478, term120478.getClass(), "_visibilityChecker", null);
        setField(term120478, term120478.getClass(), "_propertyNamingStrategy", null);
        setField(term120478, term120478.getClass(), "_typeFactory", null);
        setField(term120478, term120478.getClass(), "_typeResolverBuilder", null);
        setField(term120478, term120478.getClass(), "_dateFormat", null);
        setField(term120478, term120478.getClass(), "_handlerInstantiator", null);
        setField(term120478, term120478.getClass(), "_locale", null);
        setField(term120478, term120478.getClass(), "_timeZone", null);
        setField(term120478, term120478.getClass(), "_defaultBase64", null);
        setField(term120472, term120472.getClass(), "_base", term120478);
        term120479 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term120479, term120479.getClass(), "_classIntrospector", null);
        setField(term120479, term120479.getClass(), "_annotationIntrospector", null);
        setField(term120479, term120479.getClass(), "_visibilityChecker", null);
        setField(term120479, term120479.getClass(), "_propertyNamingStrategy", null);
        setField(term120479, term120479.getClass(), "_typeFactory", null);
        setField(term120479, term120479.getClass(), "_typeResolverBuilder", null);
        setField(term120479, term120479.getClass(), "_dateFormat", null);
        setField(term120479, term120479.getClass(), "_handlerInstantiator", null);
        setField(term120479, term120479.getClass(), "_locale", null);
        setField(term120479, term120479.getClass(), "_timeZone", null);
        setField(term120479, term120479.getClass(), "_defaultBase64", null);
        term120480 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term120480, term120480.getClass(), "_registeredSubtypes", null);
        term120481 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term120481, term120481.getClass(), "_rootNames", null);
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
        args[0] = term117800;
        args[1] = term117932;
        args[2] = null;
        args[3] = term118038;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term120472));
        assertTrue(recursiveEquals(term117800, term120479));
        assertTrue(recursiveEquals(term117932, term120480));
        assertTrue(recursiveEquals(term118038, term120481));
    }

};


