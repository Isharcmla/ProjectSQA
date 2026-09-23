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
import java.util.HashMap;

public class DeadAssignmentsElimination_tryRemoveDeadAssignments_33198157931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6105;
     Object term6201;
     Object term6552;
     Object term6553;

    public DeadAssignmentsElimination_tryRemoveDeadAssignments_33198157931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6105 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        HashMap term6249 = new HashMap();
        term6201 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term6201, term6201.getClass(), "nodes", term6249);
        term6552 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term6552, term6552.getClass(), "compiler", null);
        setField(term6552, term6552.getClass(), "liveness", null);
        HashMap term6554 = new HashMap();
        term6553 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term6553, term6553.getClass(), "implicitReturn", null);
        setField(term6553, term6553.getClass(), "entry", null);
        setField(term6553, term6553.getClass(), "nodes", term6554);
        setBooleanField(term6553, term6553.getClass(), "useNodeAnnotations", false);
        setBooleanField(term6553, term6553.getClass(), "useEdgeAnnotations", false);
        setField(term6553, term6553.getClass(), "nodeAnnotationStack", null);
        setField(term6553, term6553.getClass(), "edgeAnnotationStack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term6201;
        callMethod(klass, "tryRemoveDeadAssignments", argTypes, term6105, args);
        assertTrue(recursiveEquals(term6105, term6552));
        assertTrue(recursiveEquals(term6201, null));
    }

};


