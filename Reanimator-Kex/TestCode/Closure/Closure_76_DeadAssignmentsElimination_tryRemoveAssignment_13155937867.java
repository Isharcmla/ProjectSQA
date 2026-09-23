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

public class DeadAssignmentsElimination_tryRemoveAssignment_13155937867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14928;
     Object term14998;
     Object term15276;
     Object term15277;

    public DeadAssignmentsElimination_tryRemoveAssignment_13155937867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14928 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term14998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14998, term14998.getClass(), "parent", null);
        setIntField(term14998, term14998.getClass(), "type", 628918458);
        setField(term14998, term14998.getClass(), "first", null);
        term15276 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term15276, term15276.getClass(), "compiler", null);
        setField(term15276, term15276.getClass(), "liveness", null);
        term15277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15277, term15277.getClass(), "type", 628918458);
        setField(term15277, term15277.getClass(), "next", null);
        setField(term15277, term15277.getClass(), "first", null);
        setField(term15277, term15277.getClass(), "last", null);
        setField(term15277, term15277.getClass(), "propListHead", null);
        setIntField(term15277, term15277.getClass(), "sourcePosition", 0);
        setField(term15277, term15277.getClass(), "jsType", null);
        setField(term15277, term15277.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.DataFlowAnalysis$FlowState");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term14998;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "tryRemoveAssignment", argTypes, term14928, args);
        assertTrue(recursiveEquals(term14928, term15276));
        assertTrue(recursiveEquals(term14998, null));
    }

};


