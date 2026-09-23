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

public class FlowSensitiveInlineVariables_process_55946046561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13757;
     Object term13849;
     Object term16481;
     Object term16482;

    public FlowSensitiveInlineVariables_process_55946046561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13757 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term13757, term13757.getClass(), "compiler", null);
        term13849 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term13849, term13849.getClass(), "type", -133);
        setField(term13849, term13849.getClass(), "parent", null);
        term16481 = newInstance(Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        setField(term16481, term16481.getClass(), "compiler", null);
        setField(term16481, term16481.getClass(), "cfg", null);
        setField(term16481, term16481.getClass(), "candidates", null);
        setField(term16481, term16481.getClass(), "reachingDef", null);
        setField(term16481, term16481.getClass(), "reachingUses", null);
        term16482 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term16482, term16482.getClass(), "number", 0.0);
        setIntField(term16482, term16482.getClass(), "type", -133);
        setField(term16482, term16482.getClass(), "next", null);
        setField(term16482, term16482.getClass(), "first", null);
        setField(term16482, term16482.getClass(), "last", null);
        setField(term16482, term16482.getClass(), "propListHead", null);
        setIntField(term16482, term16482.getClass(), "sourcePosition", 0);
        setField(term16482, term16482.getClass(), "jsType", null);
        setField(term16482, term16482.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term13849;
        callMethod(klass, "process", argTypes, term13757, args);
        assertTrue(recursiveEquals(term13757, term16481));
        assertTrue(recursiveEquals(term13849, null));
    }

};


