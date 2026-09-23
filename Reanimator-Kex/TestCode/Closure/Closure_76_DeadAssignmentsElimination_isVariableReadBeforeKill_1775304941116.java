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
import java.lang.Object;

public class DeadAssignmentsElimination_isVariableReadBeforeKill_1775304941116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262106;
     Object term262192;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_1775304941116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262106 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term262192 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262278 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262434 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262520 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262590 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262676 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262762 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262848 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term262934 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term262192, term262192.getClass(), "type", 101);
        setIntField(term262348, term262348.getClass(), "type", 101);
        setIntField(term262520, term262520.getClass(), "type", 101);
        setIntField(term262676, term262676.getClass(), "type", 101);
        setField(term262762, term262762.getClass(), "next", term262520);
        setField(term262676, term262676.getClass(), "first", term262762);
        setField(term262676, term262676.getClass(), "last", term262848);
        setField(term262590, term262590.getClass(), "next", term262676);
        setField(term262520, term262520.getClass(), "first", term262590);
        setField(term262520, term262520.getClass(), "last", term262848);
        setField(term262434, term262434.getClass(), "next", term262520);
        setField(term262348, term262348.getClass(), "first", term262434);
        setField(term262348, term262348.getClass(), "last", term262848);
        setField(term262278, term262278.getClass(), "next", term262348);
        setField(term262192, term262192.getClass(), "first", term262278);
        setField(term262192, term262192.getClass(), "last", term262934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term262192;
        args[1] = null;
        callMethod(klass, "isVariableReadBeforeKill", argTypes, term262106, args);
    }

};


