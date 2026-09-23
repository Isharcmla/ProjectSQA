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

public class DeserializationConfig_init_190294890163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63802;
     Object term66103;
     Object term66108;

    public DeserializationConfig_init_190294890163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term63498 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term63604 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        Object term63696 = newInstance(Class.forName("com.fasterxml.jackson.databind.PropertyName"));
        setField(term63498, term63498.getClass(), "_base", null);
        setIntField(term63498, term63498.getClass(), "_mapperFeatures", 0);
        setField(term63498, term63498.getClass(), "_mixIns", null);
        setField(term63498, term63498.getClass(), "_subtypeResolver", null);
        setField(term63498, term63498.getClass(), "_rootNames", term63604);
        setField(term63498, term63498.getClass(), "_rootName", term63696);
        setField(term63498, term63498.getClass(), "_view", null);
        setField(term63498, term63498.getClass(), "_attributes", null);
        term63802 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        term66103 = newInstance(Class.forName("com.fasterxml.jackson.databind.DeserializationConfig"));
        Object term66104 = newInstance(Class.forName("com.fasterxml.jackson.databind.node.JsonNodeFactory"));
        Object term66105 = newInstance(Class.forName("com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl"));
        Object term66106 = newInstance(Class.forName("java.util.Collections$EmptyMap"));
        Object term66107 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term66103, term66103.getClass(), "_problemHandlers", null);
        setBooleanField(term66104, term66104.getClass(), "_cfgBigDecimalExact", false);
        setField(term66103, term66103.getClass(), "_nodeFactory", term66104);
        setIntField(term66103, term66103.getClass(), "_deserFeatures", 15214880);
        setIntField(term66103, term66103.getClass(), "_parserFeatures", 0);
        setIntField(term66103, term66103.getClass(), "_parserFeaturesToChange", 0);
        setIntField(term66103, term66103.getClass(), "_formatReadFeatures", 0);
        setIntField(term66103, term66103.getClass(), "_formatReadFeaturesToChange", 0);
        setField(term66103, term66103.getClass(), "_mixIns", null);
        setField(term66103, term66103.getClass(), "_subtypeResolver", null);
        setField(term66103, term66103.getClass(), "_rootName", null);
        setField(term66103, term66103.getClass(), "_view", null);
        setField(term66106, term66106.getClass(), "keySet", null);
        setField(term66106, term66106.getClass(), "values", null);
        setField(term66105, term66105.getClass(), "_shared", term66106);
        setField(term66105, term66105.getClass(), "_nonShared", null);
        setField(term66103, term66103.getClass(), "_attributes", term66105);
        setField(term66107, term66107.getClass(), "_rootNames", null);
        setField(term66103, term66103.getClass(), "_rootNames", term66107);
        setIntField(term66103, term66103.getClass(), "_mapperFeatures", 1068991);
        setField(term66103, term66103.getClass(), "_base", null);
        term66108 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.RootNameLookup"));
        setField(term66108, term66108.getClass(), "_rootNames", null);
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
        args[3] = term63802;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term66103));
        assertTrue(recursiveEquals(term63802, term66108));
    }

};


