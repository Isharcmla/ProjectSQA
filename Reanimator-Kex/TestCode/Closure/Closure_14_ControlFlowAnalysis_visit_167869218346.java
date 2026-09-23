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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ControlFlowAnalysis_visit_167869218346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622;

    public ControlFlowAnalysis_visit_167869218346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        setField(term622, term622.getClass(), "compiler", null);
        setField(term622, term622.getClass(), "cfg", null);
        setField(term622, term622.getClass(), "astPosition", null);
        setField(term622, term622.getClass(), "nodePriorities", null);
        setField(term622, term622.getClass(), "priorityComparator", null);
        setIntField(term622, term622.getClass(), "astPositionCounter", 0);
        setIntField(term622, term622.getClass(), "priorityCounter", 0);
        setBooleanField(term622, term622.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term622, term622.getClass(), "edgeAnnotations", false);
        setField(term622, term622.getClass(), "root", null);
        setField(term622, term622.getClass(), "exceptionHandler", null);
        setField(term622, term622.getClass(), "finallyMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term622, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


