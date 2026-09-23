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

public class ControlFlowAnalysis_handleThrow_21183022283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36311;
     Object term36381;
     Object term36984;
     Object term36985;

    public ControlFlowAnalysis_handleThrow_21183022283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36311 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term36381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36381, term36381.getClass(), "type", 70);
        setField(term36381, term36381.getClass(), "first", null);
        term36984 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        setField(term36984, term36984.getClass(), "compiler", null);
        setField(term36984, term36984.getClass(), "cfg", null);
        setField(term36984, term36984.getClass(), "astPosition", null);
        setField(term36984, term36984.getClass(), "nodePriorities", null);
        setField(term36984, term36984.getClass(), "priorityComparator", null);
        setIntField(term36984, term36984.getClass(), "astPositionCounter", 0);
        setIntField(term36984, term36984.getClass(), "priorityCounter", 0);
        setBooleanField(term36984, term36984.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term36984, term36984.getClass(), "edgeAnnotations", false);
        setField(term36984, term36984.getClass(), "root", null);
        setField(term36984, term36984.getClass(), "exceptionHandler", null);
        setField(term36984, term36984.getClass(), "finallyMap", null);
        term36985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36985, term36985.getClass(), "type", 70);
        setField(term36985, term36985.getClass(), "next", null);
        setField(term36985, term36985.getClass(), "first", null);
        setField(term36985, term36985.getClass(), "last", null);
        setField(term36985, term36985.getClass(), "propListHead", null);
        setIntField(term36985, term36985.getClass(), "sourcePosition", 0);
        setField(term36985, term36985.getClass(), "jsType", null);
        setField(term36985, term36985.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term36381;
        callMethod(klass, "handleThrow", argTypes, term36311, args);
        assertTrue(recursiveEquals(term36311, term36984));
        assertTrue(recursiveEquals(term36381, term36985));
    }

};


