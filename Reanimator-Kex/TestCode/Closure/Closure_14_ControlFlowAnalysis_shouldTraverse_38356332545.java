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

public class ControlFlowAnalysis_shouldTraverse_38356332545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422;

    public ControlFlowAnalysis_shouldTraverse_38356332545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        setField(term422, term422.getClass(), "compiler", null);
        setField(term422, term422.getClass(), "cfg", null);
        setField(term422, term422.getClass(), "astPosition", null);
        setField(term422, term422.getClass(), "nodePriorities", null);
        setField(term422, term422.getClass(), "priorityComparator", null);
        setIntField(term422, term422.getClass(), "astPositionCounter", 0);
        setIntField(term422, term422.getClass(), "priorityCounter", 0);
        setBooleanField(term422, term422.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term422, term422.getClass(), "edgeAnnotations", false);
        setField(term422, term422.getClass(), "root", null);
        setField(term422, term422.getClass(), "exceptionHandler", null);
        setField(term422, term422.getClass(), "finallyMap", null);
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
            callMethod(klass, "shouldTraverse", argTypes, term422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


