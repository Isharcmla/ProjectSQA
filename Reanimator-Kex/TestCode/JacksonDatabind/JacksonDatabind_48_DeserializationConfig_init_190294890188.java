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

public class DeserializationConfig_init_190294890188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105669;
     Object term108142;
     Object term108147;

    public DeserializationConfig_init_190294890188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105441 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term105569 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term105441, term105441.getClass(), "_base", null);
        setIntField(term105441, term105441.getClass(), "_mapperFeatures", 0);
        setField(term105441, term105441.getClass(), "_mixIns", term105569);
        setField(term105441, term105441.getClass(), "_subtypeResolver", null);
        setField(term105441, term105441.getClass(), "_rootNames", null);
        setField(term105441, term105441.getClass(), "_rootName", null);
        setField(term105441, term105441.getClass(), "_view", null);
        setField(term105441, term105441.getClass(), "_attributes", null);
        term105669 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        term108142 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term108143 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term108144 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term108145 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term108146 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term108142, term108142.getClass(), "_problemHandlers", null);
        setBooleanField(term108143, term108143.getClass(), "_cfgBigDecimalExact", false);
        setField(term108142, term108142.getClass(), "_nodeFactory", term108143);
        setIntField(term108142, term108142.getClass(), "_deserFeatures", 15214880);
        setIntField(term108142, term108142.getClass(), "_parserFeatures", 0);
        setIntField(term108142, term108142.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term108142, term108142.getClass(), "_formatReadFeatures", 0);
        setIntField(term108142, term108142.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term108142, term108142.getClass(), "_mixIns", null);
        setField(term108142, term108142.getClass(), "_subtypeResolver", null);
        setField(term108142, term108142.getClass(), "_rootName", null);
        setField(term108142, term108142.getClass(), "_view", null);
        setField(term108145, term108145.getClass(), "keySet", null);
        setField(term108145, term108145.getClass(), "values", null);
        setField(term108144, term108144.getClass(), "_shared", term108145);
        setField(term108144, term108144.getClass(), "_nonShared", null);
        setField(term108142, term108142.getClass(), "_attributes", term108144);
        setField(term108142, term108142.getClass(), "_rootNames", null);
        setIntField(term108142, term108142.getClass(), "_mapperFeatures", 1068991);
        setField(term108146, term108146.getClass(), "_classIntrospector", null);
        setField(term108146, term108146.getClass(), "_annotationIntrospector", null);
        setField(term108146, term108146.getClass(), "_visibilityChecker", null);
        setField(term108146, term108146.getClass(), "_propertyNamingStrategy", null);
        setField(term108146, term108146.getClass(), "_typeFactory", null);
        setField(term108146, term108146.getClass(), "_typeResolverBuilder", null);
        setField(term108146, term108146.getClass(), "_dateFormat", null);
        setField(term108146, term108146.getClass(), "_handlerInstantiator", null);
        setField(term108146, term108146.getClass(), "_locale", null);
        setField(term108146, term108146.getClass(), "_timeZone", null);
        setField(term108146, term108146.getClass(), "_defaultBase64", null);
        setField(term108142, term108142.getClass(), "_base", term108146);
        term108147 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term108147, term108147.getClass(), "_classIntrospector", null);
        setField(term108147, term108147.getClass(), "_annotationIntrospector", null);
        setField(term108147, term108147.getClass(), "_visibilityChecker", null);
        setField(term108147, term108147.getClass(), "_propertyNamingStrategy", null);
        setField(term108147, term108147.getClass(), "_typeFactory", null);
        setField(term108147, term108147.getClass(), "_typeResolverBuilder", null);
        setField(term108147, term108147.getClass(), "_dateFormat", null);
        setField(term108147, term108147.getClass(), "_handlerInstantiator", null);
        setField(term108147, term108147.getClass(), "_locale", null);
        setField(term108147, term108147.getClass(), "_timeZone", null);
        setField(term108147, term108147.getClass(), "_defaultBase64", null);
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
        args[0] = term105669;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term108142));
        assertTrue(recursiveEquals(term105669, term108147));
    }

};


