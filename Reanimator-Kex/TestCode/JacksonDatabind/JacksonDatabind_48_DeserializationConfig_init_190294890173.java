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

public class DeserializationConfig_init_190294890173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78908;
     Object term81209;
     Object term81214;

    public DeserializationConfig_init_190294890173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78808 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term78808, term78808.getClass(), "_base", null);
        setIntField(term78808, term78808.getClass(), "_mapperFeatures", 0);
        setField(term78808, term78808.getClass(), "_mixIns", null);
        setField(term78808, term78808.getClass(), "_subtypeResolver", null);
        setField(term78808, term78808.getClass(), "_rootNames", null);
        setField(term78808, term78808.getClass(), "_rootName", null);
        setField(term78808, term78808.getClass(), "_view", null);
        setField(term78808, term78808.getClass(), "_attributes", null);
        term78908 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term81209 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term81210 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term81211 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term81212 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term81213 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term81209, term81209.getClass(), "_problemHandlers", null);
        setBooleanField(term81210, term81210.getClass(), "_cfgBigDecimalExact", false);
        setField(term81209, term81209.getClass(), "_nodeFactory", term81210);
        setIntField(term81209, term81209.getClass(), "_deserFeatures", 15214880);
        setIntField(term81209, term81209.getClass(), "_parserFeatures", 0);
        setIntField(term81209, term81209.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term81209, term81209.getClass(), "_formatReadFeatures", 0);
        setIntField(term81209, term81209.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term81209, term81209.getClass(), "_mixIns", null);
        setField(term81209, term81209.getClass(), "_subtypeResolver", null);
        setField(term81209, term81209.getClass(), "_rootName", null);
        setField(term81209, term81209.getClass(), "_view", null);
        setField(term81212, term81212.getClass(), "keySet", null);
        setField(term81212, term81212.getClass(), "values", null);
        setField(term81211, term81211.getClass(), "_shared", term81212);
        setField(term81211, term81211.getClass(), "_nonShared", null);
        setField(term81209, term81209.getClass(), "_attributes", term81211);
        setField(term81209, term81209.getClass(), "_rootNames", null);
        setIntField(term81209, term81209.getClass(), "_mapperFeatures", 1068991);
        setField(term81213, term81213.getClass(), "_classIntrospector", null);
        setField(term81213, term81213.getClass(), "_annotationIntrospector", null);
        setField(term81213, term81213.getClass(), "_visibilityChecker", null);
        setField(term81213, term81213.getClass(), "_propertyNamingStrategy", null);
        setField(term81213, term81213.getClass(), "_typeFactory", null);
        setField(term81213, term81213.getClass(), "_typeResolverBuilder", null);
        setField(term81213, term81213.getClass(), "_dateFormat", null);
        setField(term81213, term81213.getClass(), "_handlerInstantiator", null);
        setField(term81213, term81213.getClass(), "_locale", null);
        setField(term81213, term81213.getClass(), "_timeZone", null);
        setField(term81213, term81213.getClass(), "_defaultBase64", null);
        setField(term81209, term81209.getClass(), "_base", term81213);
        term81214 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term81214, term81214.getClass(), "_classIntrospector", null);
        setField(term81214, term81214.getClass(), "_annotationIntrospector", null);
        setField(term81214, term81214.getClass(), "_visibilityChecker", null);
        setField(term81214, term81214.getClass(), "_propertyNamingStrategy", null);
        setField(term81214, term81214.getClass(), "_typeFactory", null);
        setField(term81214, term81214.getClass(), "_typeResolverBuilder", null);
        setField(term81214, term81214.getClass(), "_dateFormat", null);
        setField(term81214, term81214.getClass(), "_handlerInstantiator", null);
        setField(term81214, term81214.getClass(), "_locale", null);
        setField(term81214, term81214.getClass(), "_timeZone", null);
        setField(term81214, term81214.getClass(), "_defaultBase64", null);
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
        args[0] = term78908;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term81209));
        assertTrue(recursiveEquals(term78908, term81214));
    }

};


