package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class LiveVariablesAnalysis_computeGenKill_1555347337120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338541;
     Object term338611;
     Object term372011;
     Object term372012;

    public LiveVariablesAnalysis_computeGenKill_1555347337120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term338541 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        term338611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term338681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term338751 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term338821 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term338891 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term338961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339031 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term340011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term338611, term338611.getClass(), "type", 114);
        setIntField(term338681, term338681.getClass(), "type", 114);
        setIntField(term338751, term338751.getClass(), "type", 114);
        setIntField(term338821, term338821.getClass(), "type", 114);
        setIntField(term338891, term338891.getClass(), "type", 114);
        setIntField(term338961, term338961.getClass(), "type", 114);
        setIntField(term339031, term339031.getClass(), "type", 114);
        setIntField(term339101, term339101.getClass(), "type", 114);
        setIntField(term339171, term339171.getClass(), "type", 114);
        setIntField(term339241, term339241.getClass(), "type", 114);
        setIntField(term339311, term339311.getClass(), "type", 114);
        setIntField(term339381, term339381.getClass(), "type", 114);
        setIntField(term339451, term339451.getClass(), "type", 114);
        setIntField(term339521, term339521.getClass(), "type", 114);
        setIntField(term339591, term339591.getClass(), "type", 114);
        setIntField(term339661, term339661.getClass(), "type", 114);
        setIntField(term339731, term339731.getClass(), "type", 114);
        setIntField(term339801, term339801.getClass(), "type", 114);
        setIntField(term339871, term339871.getClass(), "type", 114);
        setIntField(term339941, term339941.getClass(), "type", 114);
        setIntField(term340011, term340011.getClass(), "type", 118);
        setField(term339941, term339941.getClass(), "last", term340011);
        setField(term339871, term339871.getClass(), "last", term339941);
        setField(term339801, term339801.getClass(), "last", term339871);
        setField(term339731, term339731.getClass(), "last", term339801);
        setField(term339661, term339661.getClass(), "last", term339731);
        setField(term339591, term339591.getClass(), "last", term339661);
        setField(term339521, term339521.getClass(), "last", term339591);
        setField(term339451, term339451.getClass(), "last", term339521);
        setField(term339381, term339381.getClass(), "last", term339451);
        setField(term339311, term339311.getClass(), "last", term339381);
        setField(term339241, term339241.getClass(), "last", term339311);
        setField(term339171, term339171.getClass(), "last", term339241);
        setField(term339101, term339101.getClass(), "last", term339171);
        setField(term339031, term339031.getClass(), "last", term339101);
        setField(term338961, term338961.getClass(), "last", term339031);
        setField(term338891, term338891.getClass(), "last", term338961);
        setField(term338821, term338821.getClass(), "last", term338891);
        setField(term338751, term338751.getClass(), "last", term338821);
        setField(term338681, term338681.getClass(), "last", term338751);
        setField(term338611, term338611.getClass(), "last", term338681);
        term372011 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        setField(term372011, term372011.getClass(), "jsScope", null);
        setField(term372011, term372011.getClass(), "escaped", null);
        setField(term372011, term372011.getClass(), "cfg", null);
        setField(term372011, term372011.getClass(), "joinOp", null);
        setField(term372011, term372011.getClass(), "orderedWorkSet", null);
        term372012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term372016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term372012, term372012.getClass(), "type", 114);
        setField(term372012, term372012.getClass(), "next", null);
        setField(term372012, term372012.getClass(), "first", null);
        setIntField(term372013, term372013.getClass(), "type", 114);
        setField(term372013, term372013.getClass(), "next", null);
        setField(term372013, term372013.getClass(), "first", null);
        setIntField(term372014, term372014.getClass(), "type", 114);
        setField(term372014, term372014.getClass(), "next", null);
        setField(term372014, term372014.getClass(), "first", null);
        setIntField(term372015, term372015.getClass(), "type", 114);
        setField(term372015, term372015.getClass(), "next", null);
        setField(term372015, term372015.getClass(), "first", null);
        setIntField(term372016, term372016.getClass(), "type", 114);
        setField(term372016, term372016.getClass(), "next", null);
        setField(term372016, term372016.getClass(), "first", null);
        setField(term372016, term372016.getClass(), "last", null);
        setField(term372016, term372016.getClass(), "propListHead", null);
        setIntField(term372016, term372016.getClass(), "sourcePosition", 0);
        setField(term372016, term372016.getClass(), "jsType", null);
        setField(term372016, term372016.getClass(), "parent", null);
        setField(term372015, term372015.getClass(), "last", term372016);
        setField(term372015, term372015.getClass(), "propListHead", null);
        setIntField(term372015, term372015.getClass(), "sourcePosition", 0);
        setField(term372015, term372015.getClass(), "jsType", null);
        setField(term372015, term372015.getClass(), "parent", null);
        setField(term372014, term372014.getClass(), "last", term372015);
        setField(term372014, term372014.getClass(), "propListHead", null);
        setIntField(term372014, term372014.getClass(), "sourcePosition", 0);
        setField(term372014, term372014.getClass(), "jsType", null);
        setField(term372014, term372014.getClass(), "parent", null);
        setField(term372013, term372013.getClass(), "last", term372014);
        setField(term372013, term372013.getClass(), "propListHead", null);
        setIntField(term372013, term372013.getClass(), "sourcePosition", 0);
        setField(term372013, term372013.getClass(), "jsType", null);
        setField(term372013, term372013.getClass(), "parent", null);
        setField(term372012, term372012.getClass(), "last", term372013);
        setField(term372012, term372012.getClass(), "propListHead", null);
        setIntField(term372012, term372012.getClass(), "sourcePosition", 0);
        setField(term372012, term372012.getClass(), "jsType", null);
        setField(term372012, term372012.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.util.BitSet");
        argTypes[2] = Class.forName("java.util.BitSet");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term338611;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeGenKill", argTypes, term338541, args);
        assertTrue(recursiveEquals(term338541, term372011));
        assertTrue(recursiveEquals(term338611, term372012));
    }

};


