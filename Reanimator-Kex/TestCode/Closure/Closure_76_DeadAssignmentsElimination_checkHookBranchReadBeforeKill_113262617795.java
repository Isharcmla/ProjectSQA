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

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617795 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20313;
     Object term20399;
     Object term20485;
     Object term34627;
     Object term34628;
     Object term34629;
     Object enum5;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617795() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20313 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term20399 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term20399, term20399.getClass(), "type", 0);
        setField(term20399, term20399.getClass(), "first", null);
        term20485 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term34627 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term34627, term34627.getClass(), "compiler", null);
        setField(term34627, term34627.getClass(), "liveness", null);
        term34628 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term34628, term34628.getClass(), "functionName", null);
        setBooleanField(term34628, term34628.getClass(), "itsNeedsActivation", false);
        setIntField(term34628, term34628.getClass(), "itsFunctionType", 0);
        setBooleanField(term34628, term34628.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term34628, term34628.getClass(), "encodedSourceStart", 0);
        setIntField(term34628, term34628.getClass(), "encodedSourceEnd", 0);
        setField(term34628, term34628.getClass(), "sourceName", null);
        setIntField(term34628, term34628.getClass(), "baseLineno", 0);
        setIntField(term34628, term34628.getClass(), "endLineno", 0);
        setField(term34628, term34628.getClass(), "functions", null);
        setField(term34628, term34628.getClass(), "regexps", null);
        setField(term34628, term34628.getClass(), "itsVariables", null);
        setField(term34628, term34628.getClass(), "itsConst", null);
        setField(term34628, term34628.getClass(), "itsVariableNames", null);
        setIntField(term34628, term34628.getClass(), "varStart", 0);
        setField(term34628, term34628.getClass(), "compilerData", null);
        setIntField(term34628, term34628.getClass(), "type", 0);
        setField(term34628, term34628.getClass(), "next", null);
        setField(term34628, term34628.getClass(), "first", null);
        setField(term34628, term34628.getClass(), "last", null);
        setField(term34628, term34628.getClass(), "propListHead", null);
        setIntField(term34628, term34628.getClass(), "sourcePosition", 0);
        setField(term34628, term34628.getClass(), "jsType", null);
        setField(term34628, term34628.getClass(), "parent", null);
        term34629 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term34629, term34629.getClass(), "functionName", null);
        setBooleanField(term34629, term34629.getClass(), "itsNeedsActivation", false);
        setIntField(term34629, term34629.getClass(), "itsFunctionType", 0);
        setBooleanField(term34629, term34629.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term34629, term34629.getClass(), "encodedSourceStart", 0);
        setIntField(term34629, term34629.getClass(), "encodedSourceEnd", 0);
        setField(term34629, term34629.getClass(), "sourceName", null);
        setIntField(term34629, term34629.getClass(), "baseLineno", 0);
        setIntField(term34629, term34629.getClass(), "endLineno", 0);
        setField(term34629, term34629.getClass(), "functions", null);
        setField(term34629, term34629.getClass(), "regexps", null);
        setField(term34629, term34629.getClass(), "itsVariables", null);
        setField(term34629, term34629.getClass(), "itsConst", null);
        setField(term34629, term34629.getClass(), "itsVariableNames", null);
        setIntField(term34629, term34629.getClass(), "varStart", 0);
        setField(term34629, term34629.getClass(), "compilerData", null);
        setIntField(term34629, term34629.getClass(), "type", 0);
        setField(term34629, term34629.getClass(), "next", null);
        setField(term34629, term34629.getClass(), "first", null);
        setField(term34629, term34629.getClass(), "last", null);
        setField(term34629, term34629.getClass(), "propListHead", null);
        setIntField(term34629, term34629.getClass(), "sourcePosition", 0);
        setField(term34629, term34629.getClass(), "jsType", null);
        setField(term34629, term34629.getClass(), "parent", null);
        Class<? extends Object> term34631 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term34630 = ((Class) term34631).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term34630).setAccessible(true);
        enum5 = ((Field) term34630).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term20399;
        args[1] = term20485;
        args[2] = null;
        Object retValue = callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term20313, args);
        assertTrue(recursiveEquals(term20313, term34627));
        assertTrue(recursiveEquals(term20399, term34628));
        assertTrue(recursiveEquals(term20485, null));
        assertTrue(recursiveEquals(retValue, enum5));
    }

};


