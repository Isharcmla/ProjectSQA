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

public class DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17430;
     Object term17522;
     Object term17608;
     Object term17947;
     Object term17948;
     Object term17949;
     Object enum4;

    public DeadAssignmentsElimination_checkHookBranchReadBeforeKill_113262617777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17430 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        term17522 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term17522, term17522.getClass(), "type", 0);
        setField(term17522, term17522.getClass(), "first", null);
        term17608 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term17947 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        setField(term17947, term17947.getClass(), "compiler", null);
        setField(term17947, term17947.getClass(), "liveness", null);
        term17948 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term17948, term17948.getClass(), "number", 0.0);
        setIntField(term17948, term17948.getClass(), "type", 0);
        setField(term17948, term17948.getClass(), "next", null);
        setField(term17948, term17948.getClass(), "first", null);
        setField(term17948, term17948.getClass(), "last", null);
        setField(term17948, term17948.getClass(), "propListHead", null);
        setIntField(term17948, term17948.getClass(), "sourcePosition", 0);
        setField(term17948, term17948.getClass(), "jsType", null);
        setField(term17948, term17948.getClass(), "parent", null);
        term17949 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term17949, term17949.getClass(), "functionName", null);
        setBooleanField(term17949, term17949.getClass(), "itsNeedsActivation", false);
        setIntField(term17949, term17949.getClass(), "itsFunctionType", 0);
        setBooleanField(term17949, term17949.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17949, term17949.getClass(), "encodedSourceStart", 0);
        setIntField(term17949, term17949.getClass(), "encodedSourceEnd", 0);
        setField(term17949, term17949.getClass(), "sourceName", null);
        setIntField(term17949, term17949.getClass(), "baseLineno", 0);
        setIntField(term17949, term17949.getClass(), "endLineno", 0);
        setField(term17949, term17949.getClass(), "functions", null);
        setField(term17949, term17949.getClass(), "regexps", null);
        setField(term17949, term17949.getClass(), "itsVariables", null);
        setField(term17949, term17949.getClass(), "itsConst", null);
        setField(term17949, term17949.getClass(), "itsVariableNames", null);
        setIntField(term17949, term17949.getClass(), "varStart", 0);
        setField(term17949, term17949.getClass(), "compilerData", null);
        setIntField(term17949, term17949.getClass(), "type", 0);
        setField(term17949, term17949.getClass(), "next", null);
        setField(term17949, term17949.getClass(), "first", null);
        setField(term17949, term17949.getClass(), "last", null);
        setField(term17949, term17949.getClass(), "propListHead", null);
        setIntField(term17949, term17949.getClass(), "sourcePosition", 0);
        setField(term17949, term17949.getClass(), "jsType", null);
        setField(term17949, term17949.getClass(), "parent", null);
        Class<? extends Object> term17951 = Class.forName((String) "com.google.javascript.jscomp.DeadAssignmentsElimination$VariableLiveness");
        Field term17950 = ((Class) term17951).getDeclaredField((String) "MAYBE_LIVE");
        ((Field) term17950).setAccessible(true);
        enum4 = ((Field) term17950).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term17522;
        args[1] = term17608;
        args[2] = null;
        Object retValue = callMethod(klass, "checkHookBranchReadBeforeKill", argTypes, term17430, args);
        assertTrue(recursiveEquals(term17430, term17947));
        assertTrue(recursiveEquals(term17522, term17948));
        assertTrue(recursiveEquals(term17608, null));
        assertTrue(recursiveEquals(retValue, enum4));
    }

};


