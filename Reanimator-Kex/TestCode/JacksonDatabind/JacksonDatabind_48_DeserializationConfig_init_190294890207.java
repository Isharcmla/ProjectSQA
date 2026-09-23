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

public class DeserializationConfig_init_190294890207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141722;
     Object term141850;
     Object term144152;
     Object term144158;
     Object term144159;

    public DeserializationConfig_init_190294890207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term141182 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term141282 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        Object term141410 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term141502 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        Object term141622 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term141182, term141182.getClass(), "_base", term141282);
        setIntField(term141182, term141182.getClass(), "_mapperFeatures", 0);
        setField(term141182, term141182.getClass(), "_mixIns", term141410);
        setField(term141182, term141182.getClass(), "_subtypeResolver", null);
        setField(term141182, term141182.getClass(), "_rootNames", null);
        setField(term141182, term141182.getClass(), "_rootName", term141502);
        setField(term141182, term141182.getClass(), "_view", null);
        setField(term141182, term141182.getClass(), "_attributes", term141622);
        term141722 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term141850 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term144152 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term144153 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term144154 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term144155 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term144156 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term144157 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term144152, term144152.getClass(), "_problemHandlers", null);
        setBooleanField(term144153, term144153.getClass(), "_cfgBigDecimalExact", false);
        setField(term144152, term144152.getClass(), "_nodeFactory", term144153);
        setIntField(term144152, term144152.getClass(), "_deserFeatures", 15214880);
        setIntField(term144152, term144152.getClass(), "_parserFeatures", 0);
        setIntField(term144152, term144152.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term144152, term144152.getClass(), "_formatReadFeatures", 0);
        setIntField(term144152, term144152.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term144154, term144154.getClass(), "_overrides", null);
        setField(term144154, term144154.getClass(), "_localMixIns", null);
        setField(term144152, term144152.getClass(), "_mixIns", term144154);
        setField(term144152, term144152.getClass(), "_subtypeResolver", null);
        setField(term144152, term144152.getClass(), "_rootName", null);
        setField(term144152, term144152.getClass(), "_view", null);
        setField(term144156, term144156.getClass(), "keySet", null);
        setField(term144156, term144156.getClass(), "values", null);
        setField(term144155, term144155.getClass(), "_shared", term144156);
        setField(term144155, term144155.getClass(), "_nonShared", null);
        setField(term144152, term144152.getClass(), "_attributes", term144155);
        setField(term144152, term144152.getClass(), "_rootNames", null);
        setIntField(term144152, term144152.getClass(), "_mapperFeatures", 1068991);
        setField(term144157, term144157.getClass(), "_classIntrospector", null);
        setField(term144157, term144157.getClass(), "_annotationIntrospector", null);
        setField(term144157, term144157.getClass(), "_visibilityChecker", null);
        setField(term144157, term144157.getClass(), "_propertyNamingStrategy", null);
        setField(term144157, term144157.getClass(), "_typeFactory", null);
        setField(term144157, term144157.getClass(), "_typeResolverBuilder", null);
        setField(term144157, term144157.getClass(), "_dateFormat", null);
        setField(term144157, term144157.getClass(), "_handlerInstantiator", null);
        setField(term144157, term144157.getClass(), "_locale", null);
        setField(term144157, term144157.getClass(), "_timeZone", null);
        setField(term144157, term144157.getClass(), "_defaultBase64", null);
        setField(term144152, term144152.getClass(), "_base", term144157);
        term144158 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term144158, term144158.getClass(), "_classIntrospector", null);
        setField(term144158, term144158.getClass(), "_annotationIntrospector", null);
        setField(term144158, term144158.getClass(), "_visibilityChecker", null);
        setField(term144158, term144158.getClass(), "_propertyNamingStrategy", null);
        setField(term144158, term144158.getClass(), "_typeFactory", null);
        setField(term144158, term144158.getClass(), "_typeResolverBuilder", null);
        setField(term144158, term144158.getClass(), "_dateFormat", null);
        setField(term144158, term144158.getClass(), "_handlerInstantiator", null);
        setField(term144158, term144158.getClass(), "_locale", null);
        setField(term144158, term144158.getClass(), "_timeZone", null);
        setField(term144158, term144158.getClass(), "_defaultBase64", null);
        term144159 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term144159, term144159.getClass(), "_overrides", null);
        setField(term144159, term144159.getClass(), "_localMixIns", null);
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
        args[0] = term141722;
        args[1] = null;
        args[2] = term141850;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term144152));
        assertTrue(recursiveEquals(term141722, term144158));
        assertTrue(recursiveEquals(term141850, term144159));
    }

};


