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

public class DeadAssignmentsElimination_tryRemoveAssignment_990702071103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22878;
     Object term22948;
     Object term37247;
     Object term37248;

    public DeadAssignmentsElimination_tryRemoveAssignment_990702071103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22878 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term22948 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term22948, term22948.getClass(), "parent", null);
        setIntField(term22948, term22948.getClass(), "type", 2095798786);
        setField(term22948, term22948.getClass(), "first", null);
        term37247 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term37247, term37247.getClass(), "compiler", null);
        setField(term37247, term37247.getClass(), "liveness", null);
        term37248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term37248, term37248.getClass(), "type", 2095798786);
        setField(term37248, term37248.getClass(), "next", null);
        setField(term37248, term37248.getClass(), "first", null);
        setField(term37248, term37248.getClass(), "last", null);
        setField(term37248, term37248.getClass(), "propListHead", null);
        setIntField(term37248, term37248.getClass(), "sourcePosition", 0);
        setField(term37248, term37248.getClass(), "jsType", null);
        setField(term37248, term37248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.DataFlowAnalysis$FlowState");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term22948;
        args[2] = null;
        callMethod(klass, "tryRemoveAssignment", argTypes, term22878, args);
        assertTrue(recursiveEquals(term22878, term37247));
        assertTrue(recursiveEquals(term22948, null));
    }

};


