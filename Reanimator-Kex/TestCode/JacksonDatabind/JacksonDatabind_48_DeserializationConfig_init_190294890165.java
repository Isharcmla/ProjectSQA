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

public class DeserializationConfig_init_190294890165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67506;
     Object term67634;
     Object term69936;
     Object term69942;
     Object term69943;

    public DeserializationConfig_init_190294890165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term67374 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term67374, term67374.getClass(), "_base", null);
        setIntField(term67374, term67374.getClass(), "_mapperFeatures", 0);
        setField(term67374, term67374.getClass(), "_mixIns", null);
        setField(term67374, term67374.getClass(), "_subtypeResolver", null);
        setField(term67374, term67374.getClass(), "_rootNames", null);
        setField(term67374, term67374.getClass(), "_rootName", null);
        setField(term67374, term67374.getClass(), "_view", null);
        setField(term67374, term67374.getClass(), "_attributes", null);
        term67506 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        term67634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term69936 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term69937 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term69938 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term69939 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        Object term69940 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term69941 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term69936, term69936.getClass(), "_problemHandlers", null);
        setBooleanField(term69937, term69937.getClass(), "_cfgBigDecimalExact", false);
        setField(term69936, term69936.getClass(), "_nodeFactory", term69937);
        setIntField(term69936, term69936.getClass(), "_deserFeatures", 15214880);
        setIntField(term69936, term69936.getClass(), "_parserFeatures", 0);
        setIntField(term69936, term69936.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term69936, term69936.getClass(), "_formatReadFeatures", 0);
        setIntField(term69936, term69936.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term69938, term69938.getClass(), "_overrides", null);
        setField(term69938, term69938.getClass(), "_localMixIns", null);
        setField(term69936, term69936.getClass(), "_mixIns", term69938);
        setField(term69939, term69939.getClass(), "_registeredSubtypes", null);
        setField(term69936, term69936.getClass(), "_subtypeResolver", term69939);
        setField(term69936, term69936.getClass(), "_rootName", null);
        setField(term69936, term69936.getClass(), "_view", null);
        setField(term69941, term69941.getClass(), "keySet", null);
        setField(term69941, term69941.getClass(), "values", null);
        setField(term69940, term69940.getClass(), "_shared", term69941);
        setField(term69940, term69940.getClass(), "_nonShared", null);
        setField(term69936, term69936.getClass(), "_attributes", term69940);
        setField(term69936, term69936.getClass(), "_rootNames", null);
        setIntField(term69936, term69936.getClass(), "_mapperFeatures", 1068991);
        setField(term69936, term69936.getClass(), "_base", null);
        term69942 = newInstance(Class.forName("com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver"));
        setField(term69942, term69942.getClass(), "_registeredSubtypes", null);
        term69943 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term69943, term69943.getClass(), "_overrides", null);
        setField(term69943, term69943.getClass(), "_localMixIns", null);
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
        args[1] = term67506;
        args[2] = term67634;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term69936));
        assertTrue(recursiveEquals(term67506, term69942));
        assertTrue(recursiveEquals(term67634, term69943));
    }

};


