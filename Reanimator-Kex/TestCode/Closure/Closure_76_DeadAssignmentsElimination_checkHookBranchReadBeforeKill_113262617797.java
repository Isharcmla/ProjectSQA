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
import java.lang.String;
import java.lang.Object;

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20903;
     Object term20995;
     Object term21085;
     Object term35376;
     Object term35377;
     Object term35378;
     Object enum6;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20903 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term20995 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term20995, term20995.getClass(), "type", 0);
        setField(term20995, term20995.getClass(), "first", null);
        term21085 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term35376 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term35376, term35376.getClass(), "compiler", null);
        setField(term35376, term35376.getClass(), "liveness", null);
        term35377 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35377, term35377.getClass(), "number", 0.0);
        setIntField(term35377, term35377.getClass(), "type", 0);
        setField(term35377, term35377.getClass(), "next", null);
        setField(term35377, term35377.getClass(), "first", null);
        setField(term35377, term35377.getClass(), "last", null);
        setField(term35377, term35377.getClass(), "propListHead", null);
        setIntField(term35377, term35377.getClass(), "sourcePosition", 0);
        setField(term35377, term35377.getClass(), "jsType", null);
        setField(term35377, term35377.getClass(), "parent", null);
        term35378 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term35378, term35378.getClass(), "encodedSourceStart", 0);
        setIntField(term35378, term35378.getClass(), "encodedSourceEnd", 0);
        setField(term35378, term35378.getClass(), "sourceName", null);
        setIntField(term35378, term35378.getClass(), "baseLineno", 0);
        setIntField(term35378, term35378.getClass(), "endLineno", 0);
        setField(term35378, term35378.getClass(), "functions", null);
        setField(term35378, term35378.getClass(), "regexps", null);
        setField(term35378, term35378.getClass(), "itsVariables", null);
        setField(term35378, term35378.getClass(), "itsConst", null);
        setField(term35378, term35378.getClass(), "itsVariableNames", null);
        setIntField(term35378, term35378.getClass(), "varStart", 0);
        setField(term35378, term35378.getClass(), "compilerData", null);
        setIntField(term35378, term35378.getClass(), "type", 0);
        setField(term35378, term35378.getClass(), "next", null);
        setField(term35378, term35378.getClass(), "first", null);
        setField(term35378, term35378.getClass(), "last", null);
        setField(term35378, term35378.getClass(), "propListHead", null);
        setIntField(term35378, term35378.getClass(), "sourcePosition", 0);
        setField(term35378, term35378.getClass(), "jsType", null);
        setField(term35378, term35378.getClass(), "parent", null);
        Class<? extends Object> term35380 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term35379 = ((Class) term35380).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term35379).setAccessible(true);
        enum6 = ((Field) term35379).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term20995;
        args[1] = term21085;
        args[2] = null;
        Object retValue = callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term20903, args);
        assertTrue(recursiveEquals(term20903, term35376));
        assertTrue(recursiveEquals(term20995, term35377));
        assertTrue(recursiveEquals(term21085, null));
        assertTrue(recursiveEquals(retValue, enum6));
    }

};


