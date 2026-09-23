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

public class MustBeReachingVariableDef_computeMustDef_179693505636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6496;
     Object term6566;
     Object term7196;
     Object term7197;

    public MustBeReachingVariableDef_computeMustDef_179693505636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6496 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term6566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6566, term6566.getClass(), "type", 1265463001);
        setIntField(term6636, term6636.getClass(), "type", -2027534003);
        setIntField(term6706, term6706.getClass(), "type", 104);
        setField(term6636, term6636.getClass(), "first", term6706);
        setField(term6566, term6566.getClass(), "first", term6636);
        term7196 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        setField(term7196, term7196.getClass(), "jsScope", null);
        setField(term7196, term7196.getClass(), "compiler", null);
        setField(term7196, term7196.getClass(), "escaped", null);
        setField(term7196, term7196.getClass(), "cfg", null);
        setField(term7196, term7196.getClass(), "joinOp", null);
        setField(term7196, term7196.getClass(), "orderedWorkSet", null);
        term7197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7197, term7197.getClass(), "type", 1265463001);
        setField(term7197, term7197.getClass(), "next", null);
        setIntField(term7198, term7198.getClass(), "type", -2027534003);
        setField(term7198, term7198.getClass(), "next", null);
        setIntField(term7199, term7199.getClass(), "type", 104);
        setField(term7199, term7199.getClass(), "next", null);
        setField(term7199, term7199.getClass(), "first", null);
        setField(term7199, term7199.getClass(), "last", null);
        setField(term7199, term7199.getClass(), "propListHead", null);
        setIntField(term7199, term7199.getClass(), "sourcePosition", 0);
        setField(term7199, term7199.getClass(), "jsType", null);
        setField(term7199, term7199.getClass(), "parent", null);
        setField(term7198, term7198.getClass(), "first", term7199);
        setField(term7198, term7198.getClass(), "last", null);
        setField(term7198, term7198.getClass(), "propListHead", null);
        setIntField(term7198, term7198.getClass(), "sourcePosition", 0);
        setField(term7198, term7198.getClass(), "jsType", null);
        setField(term7198, term7198.getClass(), "parent", null);
        setField(term7197, term7197.getClass(), "first", term7198);
        setField(term7197, term7197.getClass(), "last", null);
        setField(term7197, term7197.getClass(), "propListHead", null);
        setIntField(term7197, term7197.getClass(), "sourcePosition", 0);
        setField(term7197, term7197.getClass(), "jsType", null);
        setField(term7197, term7197.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term6566;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        callMethod(klass, "computeMustDef", argTypes, term6496, args);
        assertTrue(recursiveEquals(term6496, term7196));
        assertTrue(recursiveEquals(term6566, term7197));
    }

};


