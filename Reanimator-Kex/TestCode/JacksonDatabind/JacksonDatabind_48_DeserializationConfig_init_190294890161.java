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

public class DeserializationConfig_init_190294890161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62217;

    public DeserializationConfig_init_190294890161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term59917 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term59917, term59917.getClass(), "_base", null);
        setIntField(term59917, term59917.getClass(), "_mapperFeatures", 0);
        setField(term59917, term59917.getClass(), "_mixIns", null);
        setField(term59917, term59917.getClass(), "_subtypeResolver", null);
        setField(term59917, term59917.getClass(), "_rootNames", null);
        setField(term59917, term59917.getClass(), "_rootName", null);
        setField(term59917, term59917.getClass(), "_view", null);
        setField(term59917, term59917.getClass(), "_attributes", null);
        term62217 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term62218 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term62219 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term62220 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term62217, term62217.getClass(), "_problemHandlers", null);
        setBooleanField(term62218, term62218.getClass(), "_cfgBigDecimalExact", false);
        setField(term62217, term62217.getClass(), "_nodeFactory", term62218);
        setIntField(term62217, term62217.getClass(), "_deserFeatures", 15214880);
        setIntField(term62217, term62217.getClass(), "_parserFeatures", 0);
        setIntField(term62217, term62217.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term62217, term62217.getClass(), "_formatReadFeatures", 0);
        setIntField(term62217, term62217.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term62217, term62217.getClass(), "_mixIns", null);
        setField(term62217, term62217.getClass(), "_subtypeResolver", null);
        setField(term62217, term62217.getClass(), "_rootName", null);
        setField(term62217, term62217.getClass(), "_view", null);
        setField(term62220, term62220.getClass(), "keySet", null);
        setField(term62220, term62220.getClass(), "values", null);
        setField(term62219, term62219.getClass(), "_shared", term62220);
        setField(term62219, term62219.getClass(), "_nonShared", null);
        setField(term62217, term62217.getClass(), "_attributes", term62219);
        setField(term62217, term62217.getClass(), "_rootNames", null);
        setIntField(term62217, term62217.getClass(), "_mapperFeatures", 1068991);
        setField(term62217, term62217.getClass(), "_base", null);
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
        args[1] = null;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62217));
    }

};


