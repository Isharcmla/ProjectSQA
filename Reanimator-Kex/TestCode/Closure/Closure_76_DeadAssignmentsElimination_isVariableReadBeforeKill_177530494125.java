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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4059;
     Object term4145;
     Object term4608;
     Object term4609;
     Object enum0;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4059 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term4145 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term4608 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term4608, term4608.getClass(), "compiler", null);
        setField(term4608, term4608.getClass(), "liveness", null);
        term4609 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term4609, term4609.getClass(), "functionName", null);
        setBooleanField(term4609, term4609.getClass(), "itsNeedsActivation", false);
        setIntField(term4609, term4609.getClass(), "itsFunctionType", 0);
        setBooleanField(term4609, term4609.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term4609, term4609.getClass(), "encodedSourceStart", 0);
        setIntField(term4609, term4609.getClass(), "encodedSourceEnd", 0);
        setField(term4609, term4609.getClass(), "sourceName", null);
        setIntField(term4609, term4609.getClass(), "baseLineno", 0);
        setIntField(term4609, term4609.getClass(), "endLineno", 0);
        setField(term4609, term4609.getClass(), "functions", null);
        setField(term4609, term4609.getClass(), "regexps", null);
        setField(term4609, term4609.getClass(), "itsVariables", null);
        setField(term4609, term4609.getClass(), "itsConst", null);
        setField(term4609, term4609.getClass(), "itsVariableNames", null);
        setIntField(term4609, term4609.getClass(), "varStart", 0);
        setField(term4609, term4609.getClass(), "compilerData", null);
        setIntField(term4609, term4609.getClass(), "type", 0);
        setField(term4609, term4609.getClass(), "next", null);
        setField(term4609, term4609.getClass(), "first", null);
        setField(term4609, term4609.getClass(), "last", null);
        setField(term4609, term4609.getClass(), "propListHead", null);
        setIntField(term4609, term4609.getClass(), "sourcePosition", 0);
        setField(term4609, term4609.getClass(), "jsType", null);
        setField(term4609, term4609.getClass(), "parent", null);
        Class<? extends Object> term4641 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term4640 = ((Class) term4641).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term4640).setAccessible(true);
        enum0 = ((Field) term4640).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4145;
        args[1] = null;
        Object retValue = callMethod(klass, "isVariableReadBeforeKill", argTypes, term4059, args);
        assertTrue(recursiveEquals(term4059, term4608));
        assertTrue(recursiveEquals(term4145, term4609));
        assertTrue(recursiveEquals(retValue, enum0));
    }

};


