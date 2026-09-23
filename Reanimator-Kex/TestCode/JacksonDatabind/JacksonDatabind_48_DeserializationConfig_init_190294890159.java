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

public class DeserializationConfig_init_190294890159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56309;
     Object term56437;
     Object term58739;
     Object term58745;
     Object term58746;

    public DeserializationConfig_init_190294890159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56077 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term56177 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings"));
        setField(term56077, term56077.getClass(), "_base", term56177);
        setIntField(term56077, term56077.getClass(), "_mapperFeatures", 0);
        setField(term56077, term56077.getClass(), "_mixIns", null);
        setField(term56077, term56077.getClass(), "_subtypeResolver", null);
        setField(term56077, term56077.getClass(), "_rootNames", null);
        setField(term56077, term56077.getClass(), "_rootName", null);
        setField(term56077, term56077.getClass(), "_view", null);
        setField(term56077, term56077.getClass(), "_attributes", null);
        term56309 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        term56437 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term58739 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term58740 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term58741 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term58742 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term58743 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term58744 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term58739, term58739.getClass(), "_problemHandlers", null);
        setBooleanField(term58740, term58740.getClass(), "_cfgBigDecimalExact", false);
        setField(term58739, term58739.getClass(), "_nodeFactory", term58740);
        setIntField(term58739, term58739.getClass(), "_deserFeatures", 15214880);
        setIntField(term58739, term58739.getClass(), "_parserFeatures", 0);
        setIntField(term58739, term58739.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term58739, term58739.getClass(), "_formatReadFeatures", 0);
        setIntField(term58739, term58739.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term58741, term58741.getClass(), "_overrides", null);
        setField(term58741, term58741.getClass(), "_localMixIns", null);
        setField(term58739, term58739.getClass(), "_mixIns", term58741);
        setField(term58742, term58742.getClass(), "_registeredSubtypes", null);
        setField(term58739, term58739.getClass(), "_subtypeResolver", term58742);
        setField(term58739, term58739.getClass(), "_rootName", null);
        setField(term58739, term58739.getClass(), "_view", null);
        setField(term58744, term58744.getClass(), "keySet", null);
        setField(term58744, term58744.getClass(), "values", null);
        setField(term58743, term58743.getClass(), "_shared", term58744);
        setField(term58743, term58743.getClass(), "_nonShared", null);
        setField(term58739, term58739.getClass(), "_attributes", term58743);
        setField(term58739, term58739.getClass(), "_rootNames", null);
        setIntField(term58739, term58739.getClass(), "_mapperFeatures", 1068991);
        setField(term58739, term58739.getClass(), "_base", null);
        term58745 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term58745, term58745.getClass(), "_registeredSubtypes", null);
        term58746 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term58746, term58746.getClass(), "_overrides", null);
        setField(term58746, term58746.getClass(), "_localMixIns", null);
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
        args[1] = term56309;
        args[2] = term56437;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term58739));
        assertTrue(recursiveEquals(term56309, term58745));
        assertTrue(recursiveEquals(term56437, term58746));
    }

};


