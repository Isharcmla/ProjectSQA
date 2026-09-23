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

public class DeserializationConfig_init_190294890191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109634;
     Object term112015;
     Object term112020;

    public DeserializationConfig_init_190294890191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term109506 = Class.forName((String) "java.lang.reflect.GenericDeclaration");
        Object term109470 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        setField(term109470, term109470.getClass(), "_base", null);
        setIntField(term109470, term109470.getClass(), "_mapperFeatures", 0);
        setField(term109470, term109470.getClass(), "_mixIns", null);
        setField(term109470, term109470.getClass(), "_subtypeResolver", null);
        setField(term109470, term109470.getClass(), "_rootNames", null);
        setField(term109470, term109470.getClass(), "_rootName", null);
        setField(term109470, term109470.getClass(), "_view", term109506);
        setField(term109470, term109470.getClass(), "_attributes", null);
        term109634 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        term112015 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term112016 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term112017 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        Object term112018 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term112019 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        setField(term112015, term112015.getClass(), "_problemHandlers", null);
        setBooleanField(term112016, term112016.getClass(), "_cfgBigDecimalExact", false);
        setField(term112015, term112015.getClass(), "_nodeFactory", term112016);
        setIntField(term112015, term112015.getClass(), "_deserFeatures", 15214880);
        setIntField(term112015, term112015.getClass(), "_parserFeatures", 0);
        setIntField(term112015, term112015.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term112015, term112015.getClass(), "_formatReadFeatures", 0);
        setIntField(term112015, term112015.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term112017, term112017.getClass(), "_overrides", null);
        setField(term112017, term112017.getClass(), "_localMixIns", null);
        setField(term112015, term112015.getClass(), "_mixIns", term112017);
        setField(term112015, term112015.getClass(), "_subtypeResolver", null);
        setField(term112015, term112015.getClass(), "_rootName", null);
        setField(term112015, term112015.getClass(), "_view", null);
        setField(term112019, term112019.getClass(), "keySet", null);
        setField(term112019, term112019.getClass(), "values", null);
        setField(term112018, term112018.getClass(), "_shared", term112019);
        setField(term112018, term112018.getClass(), "_nonShared", null);
        setField(term112015, term112015.getClass(), "_attributes", term112018);
        setField(term112015, term112015.getClass(), "_rootNames", null);
        setIntField(term112015, term112015.getClass(), "_mapperFeatures", 1068991);
        setField(term112015, term112015.getClass(), "_base", null);
        term112020 = newInstance(Class.forName("com.fasterxml.jackson.databind.introspect.SimpleMixInResolver"));
        setField(term112020, term112020.getClass(), "_overrides", null);
        setField(term112020, term112020.getClass(), "_localMixIns", null);
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
        args[2] = term109634;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term112015));
        assertTrue(recursiveEquals(term109634, term112020));
    }

};


