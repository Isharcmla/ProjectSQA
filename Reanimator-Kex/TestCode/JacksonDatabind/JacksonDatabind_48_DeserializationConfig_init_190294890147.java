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

public class DeserializationConfig_init_190294890147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33236;
     Object term35537;
     Object term35542;

    public DeserializationConfig_init_190294890147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term33136 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term33136, term33136.getClass(), "_base", null);
        setIntField(term33136, term33136.getClass(), "_mapperFeatures", 0);
        setField(term33136, term33136.getClass(), "_mixIns", null);
        setField(term33136, term33136.getClass(), "_subtypeResolver", null);
        setField(term33136, term33136.getClass(), "_rootNames", null);
        setField(term33136, term33136.getClass(), "_rootName", null);
        setField(term33136, term33136.getClass(), "_view", null);
        setField(term33136, term33136.getClass(), "_attributes", null);
        term33236 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term35537 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term35538 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term35539 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term35540 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term35541 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term35537, term35537.getClass(), "_problemHandlers", null);
        setBooleanField(term35538, term35538.getClass(), "_cfgBigDecimalExact", false);
        setField(term35537, term35537.getClass(), "_nodeFactory", term35538);
        setIntField(term35537, term35537.getClass(), "_deserFeatures", 15214880);
        setIntField(term35537, term35537.getClass(), "_parserFeatures", 0);
        setIntField(term35537, term35537.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term35537, term35537.getClass(), "_formatReadFeatures", 0);
        setIntField(term35537, term35537.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term35537, term35537.getClass(), "_mixIns", null);
        setField(term35537, term35537.getClass(), "_subtypeResolver", null);
        setField(term35537, term35537.getClass(), "_rootName", null);
        setField(term35537, term35537.getClass(), "_view", null);
        setField(term35540, term35540.getClass(), "keySet", null);
        setField(term35540, term35540.getClass(), "values", null);
        setField(term35539, term35539.getClass(), "_shared", term35540);
        setField(term35539, term35539.getClass(), "_nonShared", null);
        setField(term35537, term35537.getClass(), "_attributes", term35539);
        setField(term35537, term35537.getClass(), "_rootNames", null);
        setIntField(term35537, term35537.getClass(), "_mapperFeatures", 1068991);
        setField(term35541, term35541.getClass(), "_classIntrospector", null);
        setField(term35541, term35541.getClass(), "_annotationIntrospector", null);
        setField(term35541, term35541.getClass(), "_visibilityChecker", null);
        setField(term35541, term35541.getClass(), "_propertyNamingStrategy", null);
        setField(term35541, term35541.getClass(), "_typeFactory", null);
        setField(term35541, term35541.getClass(), "_typeResolverBuilder", null);
        setField(term35541, term35541.getClass(), "_dateFormat", null);
        setField(term35541, term35541.getClass(), "_handlerInstantiator", null);
        setField(term35541, term35541.getClass(), "_locale", null);
        setField(term35541, term35541.getClass(), "_timeZone", null);
        setField(term35541, term35541.getClass(), "_defaultBase64", null);
        setField(term35537, term35537.getClass(), "_base", term35541);
        term35542 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term35542, term35542.getClass(), "_classIntrospector", null);
        setField(term35542, term35542.getClass(), "_annotationIntrospector", null);
        setField(term35542, term35542.getClass(), "_visibilityChecker", null);
        setField(term35542, term35542.getClass(), "_propertyNamingStrategy", null);
        setField(term35542, term35542.getClass(), "_typeFactory", null);
        setField(term35542, term35542.getClass(), "_typeResolverBuilder", null);
        setField(term35542, term35542.getClass(), "_dateFormat", null);
        setField(term35542, term35542.getClass(), "_handlerInstantiator", null);
        setField(term35542, term35542.getClass(), "_locale", null);
        setField(term35542, term35542.getClass(), "_timeZone", null);
        setField(term35542, term35542.getClass(), "_defaultBase64", null);
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
        args[0] = term33236;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term35537));
        assertTrue(recursiveEquals(term33236, term35542));
    }

};


