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

public class DeserializationConfig_init_190294890203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133967;
     Object term134073;
     Object term136375;
     Object term136381;
     Object term136382;

    public DeserializationConfig_init_190294890203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term133513 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term133641 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term133747 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term133867 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        setField(term133513, term133513.getClass(), "_base", null);
        setIntField(term133513, term133513.getClass(), "_mapperFeatures", 0);
        setField(term133513, term133513.getClass(), "_mixIns", term133641);
        setField(term133513, term133513.getClass(), "_subtypeResolver", null);
        setField(term133513, term133513.getClass(), "_rootNames", term133747);
        setField(term133513, term133513.getClass(), "_rootName", null);
        setField(term133513, term133513.getClass(), "_view", null);
        setField(term133513, term133513.getClass(), "_attributes", term133867);
        term133967 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term134073 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term136375 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term136376 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term136377 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term136378 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term136379 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term136380 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term136375, term136375.getClass(), "_problemHandlers", null);
        setBooleanField(term136376, term136376.getClass(), "_cfgBigDecimalExact", false);
        setField(term136375, term136375.getClass(), "_nodeFactory", term136376);
        setIntField(term136375, term136375.getClass(), "_deserFeatures", 15214880);
        setIntField(term136375, term136375.getClass(), "_parserFeatures", 0);
        setIntField(term136375, term136375.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term136375, term136375.getClass(), "_formatReadFeatures", 0);
        setIntField(term136375, term136375.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term136375, term136375.getClass(), "_mixIns", null);
        setField(term136375, term136375.getClass(), "_subtypeResolver", null);
        setField(term136375, term136375.getClass(), "_rootName", null);
        setField(term136375, term136375.getClass(), "_view", null);
        setField(term136378, term136378.getClass(), "keySet", null);
        setField(term136378, term136378.getClass(), "values", null);
        setField(term136377, term136377.getClass(), "_shared", term136378);
        setField(term136377, term136377.getClass(), "_nonShared", null);
        setField(term136375, term136375.getClass(), "_attributes", term136377);
        setField(term136379, term136379.getClass(), "_rootNames", null);
        setField(term136375, term136375.getClass(), "_rootNames", term136379);
        setIntField(term136375, term136375.getClass(), "_mapperFeatures", 1068991);
        setField(term136380, term136380.getClass(), "_classIntrospector", null);
        setField(term136380, term136380.getClass(), "_annotationIntrospector", null);
        setField(term136380, term136380.getClass(), "_visibilityChecker", null);
        setField(term136380, term136380.getClass(), "_propertyNamingStrategy", null);
        setField(term136380, term136380.getClass(), "_typeFactory", null);
        setField(term136380, term136380.getClass(), "_typeResolverBuilder", null);
        setField(term136380, term136380.getClass(), "_dateFormat", null);
        setField(term136380, term136380.getClass(), "_handlerInstantiator", null);
        setField(term136380, term136380.getClass(), "_locale", null);
        setField(term136380, term136380.getClass(), "_timeZone", null);
        setField(term136380, term136380.getClass(), "_defaultBase64", null);
        setField(term136375, term136375.getClass(), "_base", term136380);
        term136381 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term136381, term136381.getClass(), "_classIntrospector", null);
        setField(term136381, term136381.getClass(), "_annotationIntrospector", null);
        setField(term136381, term136381.getClass(), "_visibilityChecker", null);
        setField(term136381, term136381.getClass(), "_propertyNamingStrategy", null);
        setField(term136381, term136381.getClass(), "_typeFactory", null);
        setField(term136381, term136381.getClass(), "_typeResolverBuilder", null);
        setField(term136381, term136381.getClass(), "_dateFormat", null);
        setField(term136381, term136381.getClass(), "_handlerInstantiator", null);
        setField(term136381, term136381.getClass(), "_locale", null);
        setField(term136381, term136381.getClass(), "_timeZone", null);
        setField(term136381, term136381.getClass(), "_defaultBase64", null);
        term136382 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term136382, term136382.getClass(), "_rootNames", null);
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
        args[0] = term133967;
        args[1] = null;
        args[2] = null;
        args[3] = term134073;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term136375));
        assertTrue(recursiveEquals(term133967, term136381));
        assertTrue(recursiveEquals(term134073, term136382));
    }

};


