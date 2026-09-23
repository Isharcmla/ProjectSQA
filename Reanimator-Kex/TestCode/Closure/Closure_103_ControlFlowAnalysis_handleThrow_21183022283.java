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
     Object term27506;
     Object term27576;
     Object term27587;
     Object term27588;

    public ControlFlowAnalysis_handleThrow_21183022283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27506 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        term27576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27576, term27576.getClass(), "type", 105);
        term27587 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        setField(term27587, term27587.getClass(), "compiler", null);
        setField(term27587, term27587.getClass(), "cfg", null);
        setField(term27587, term27587.getClass(), "astPosition", null);
        setField(term27587, term27587.getClass(), "nodePriorities", null);
        setField(term27587, term27587.getClass(), "priorityComparator", null);
        setIntField(term27587, term27587.getClass(), "astPositionCounter", 0);
        setIntField(term27587, term27587.getClass(), "priorityCounter", 0);
        setBooleanField(term27587, term27587.getClass(), "shouldTraverseFunctions", false);
        setField(term27587, term27587.getClass(), "root", null);
        setField(term27587, term27587.getClass(), "exceptionHandler", null);
        setField(term27587, term27587.getClass(), "finallyMap", null);
        term27588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term27588, term27588.getClass(), "type", 105);
        setField(term27588, term27588.getClass(), "next", null);
        setField(term27588, term27588.getClass(), "first", null);
        setField(term27588, term27588.getClass(), "last", null);
        setField(term27588, term27588.getClass(), "propListHead", null);
        setIntField(term27588, term27588.getClass(), "sourcePosition", 0);
        setField(term27588, term27588.getClass(), "jsType", null);
        setField(term27588, term27588.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term27576;
        callMethod(klass, "handleThrow", argTypes, term27506, args);
        assertTrue(recursiveEquals(term27506, term27587));
        assertTrue(recursiveEquals(term27576, term27588));
    }

};


