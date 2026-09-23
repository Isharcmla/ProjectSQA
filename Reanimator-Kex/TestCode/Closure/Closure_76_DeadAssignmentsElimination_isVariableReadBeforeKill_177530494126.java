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

public class DeadAssignmentsElimination_isVariableReadBeforeKill_177530494126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4271;
     Object term4357;
     Object term5069;
     Object term5070;
     Object enum1;

    public DeadAssignmentsElimination_isVariableReadBeforeKill_177530494126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4271 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term4357 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term5069 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term5069, term5069.getClass(), "compiler", null);
        setField(term5069, term5069.getClass(), "liveness", null);
        term5070 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term5070, term5070.getClass(), "functionName", null);
        setBooleanField(term5070, term5070.getClass(), "itsNeedsActivation", false);
        setIntField(term5070, term5070.getClass(), "itsFunctionType", 0);
        setBooleanField(term5070, term5070.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term5070, term5070.getClass(), "encodedSourceStart", 0);
        setIntField(term5070, term5070.getClass(), "encodedSourceEnd", 0);
        setField(term5070, term5070.getClass(), "sourceName", null);
        setIntField(term5070, term5070.getClass(), "baseLineno", 0);
        setIntField(term5070, term5070.getClass(), "endLineno", 0);
        setField(term5070, term5070.getClass(), "functions", null);
        setField(term5070, term5070.getClass(), "regexps", null);
        setField(term5070, term5070.getClass(), "itsVariables", null);
        setField(term5070, term5070.getClass(), "itsConst", null);
        setField(term5070, term5070.getClass(), "itsVariableNames", null);
        setIntField(term5070, term5070.getClass(), "varStart", 0);
        setField(term5070, term5070.getClass(), "compilerData", null);
        setIntField(term5070, term5070.getClass(), "type", 0);
        setField(term5070, term5070.getClass(), "next", null);
        setField(term5070, term5070.getClass(), "first", null);
        setField(term5070, term5070.getClass(), "last", null);
        setField(term5070, term5070.getClass(), "propListHead", null);
        setIntField(term5070, term5070.getClass(), "sourcePosition", 0);
        setField(term5070, term5070.getClass(), "jsType", null);
        setField(term5070, term5070.getClass(), "parent", null);
        Class<? extends Object> term5072 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term5071 = ((Class) term5072).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term5071).setAccessible(true);
        enum1 = ((Field) term5071).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4357;
        args[1] = null;
        Object retValue = callMethod(klass, "isVariableReadBeforeKill", argTypes, term4271, args);
        assertTrue(recursiveEquals(term4271, term5069));
        assertTrue(recursiveEquals(term4357, term5070));
        assertTrue(recursiveEquals(retValue, enum1));
    }

};


