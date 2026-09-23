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
import java.lang.Object;

public class ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17200;
     Object term17286;
     Object term17652;
     Object term17653;

    public ClosureReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20400980749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17200 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        term17286 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17372 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term17286, term17286.getClass(), "type", 37);
        setField(term17458, term17458.getClass(), "next", null);
        setField(term17372, term17372.getClass(), "next", term17458);
        setIntField(term17372, term17372.getClass(), "type", 33);
        setField(term17286, term17286.getClass(), "first", term17372);
        setField(term17286, term17286.getClass(), "last", term17550);
        term17652 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter"));
        setField(term17652, term17652.getClass(), "restrictToArrayVisitor", null);
        setField(term17652, term17652.getClass(), "restrictToNotArrayVisitor", null);
        setField(term17652, term17652.getClass(), "restrictToObjectVisitor", null);
        setField(term17652, term17652.getClass(), "restrictToNotObjectVisitor", null);
        setField(term17652, term17652.getClass(), "restricters", null);
        setField(term17652, term17652.getClass(), "convention", null);
        setField(term17652, term17652.getClass(), "typeRegistry", null);
        setField(term17652, term17652.getClass(), "firstLink", null);
        setField(term17652, term17652.getClass(), "nextLink", null);
        setField(term17652, term17652.getClass(), "restrictUndefinedVisitor", null);
        setField(term17652, term17652.getClass(), "restrictNullVisitor", null);
        term17653 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term17656 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term17653, term17653.getClass(), "functionName", null);
        setBooleanField(term17653, term17653.getClass(), "itsNeedsActivation", false);
        setIntField(term17653, term17653.getClass(), "itsFunctionType", 0);
        setBooleanField(term17653, term17653.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17653, term17653.getClass(), "encodedSourceStart", 0);
        setIntField(term17653, term17653.getClass(), "encodedSourceEnd", 0);
        setField(term17653, term17653.getClass(), "sourceName", null);
        setIntField(term17653, term17653.getClass(), "baseLineno", 0);
        setIntField(term17653, term17653.getClass(), "endLineno", 0);
        setField(term17653, term17653.getClass(), "functions", null);
        setField(term17653, term17653.getClass(), "regexps", null);
        setField(term17653, term17653.getClass(), "itsVariables", null);
        setField(term17653, term17653.getClass(), "itsConst", null);
        setField(term17653, term17653.getClass(), "itsVariableNames", null);
        setIntField(term17653, term17653.getClass(), "varStart", 0);
        setField(term17653, term17653.getClass(), "compilerData", null);
        setIntField(term17653, term17653.getClass(), "type", 37);
        setField(term17653, term17653.getClass(), "next", null);
        setField(term17654, term17654.getClass(), "functionName", null);
        setBooleanField(term17654, term17654.getClass(), "itsNeedsActivation", false);
        setIntField(term17654, term17654.getClass(), "itsFunctionType", 0);
        setBooleanField(term17654, term17654.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17654, term17654.getClass(), "encodedSourceStart", 0);
        setIntField(term17654, term17654.getClass(), "encodedSourceEnd", 0);
        setField(term17654, term17654.getClass(), "sourceName", null);
        setIntField(term17654, term17654.getClass(), "baseLineno", 0);
        setIntField(term17654, term17654.getClass(), "endLineno", 0);
        setField(term17654, term17654.getClass(), "functions", null);
        setField(term17654, term17654.getClass(), "regexps", null);
        setField(term17654, term17654.getClass(), "itsVariables", null);
        setField(term17654, term17654.getClass(), "itsConst", null);
        setField(term17654, term17654.getClass(), "itsVariableNames", null);
        setIntField(term17654, term17654.getClass(), "varStart", 0);
        setField(term17654, term17654.getClass(), "compilerData", null);
        setIntField(term17654, term17654.getClass(), "type", 33);
        setField(term17655, term17655.getClass(), "functionName", null);
        setBooleanField(term17655, term17655.getClass(), "itsNeedsActivation", false);
        setIntField(term17655, term17655.getClass(), "itsFunctionType", 0);
        setBooleanField(term17655, term17655.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term17655, term17655.getClass(), "encodedSourceStart", 0);
        setIntField(term17655, term17655.getClass(), "encodedSourceEnd", 0);
        setField(term17655, term17655.getClass(), "sourceName", null);
        setIntField(term17655, term17655.getClass(), "baseLineno", 0);
        setIntField(term17655, term17655.getClass(), "endLineno", 0);
        setField(term17655, term17655.getClass(), "functions", null);
        setField(term17655, term17655.getClass(), "regexps", null);
        setField(term17655, term17655.getClass(), "itsVariables", null);
        setField(term17655, term17655.getClass(), "itsConst", null);
        setField(term17655, term17655.getClass(), "itsVariableNames", null);
        setIntField(term17655, term17655.getClass(), "varStart", 0);
        setField(term17655, term17655.getClass(), "compilerData", null);
        setIntField(term17655, term17655.getClass(), "type", 0);
        setField(term17655, term17655.getClass(), "next", null);
        setField(term17655, term17655.getClass(), "first", null);
        setField(term17655, term17655.getClass(), "last", null);
        setField(term17655, term17655.getClass(), "propListHead", null);
        setIntField(term17655, term17655.getClass(), "sourcePosition", 0);
        setField(term17655, term17655.getClass(), "jsType", null);
        setField(term17655, term17655.getClass(), "parent", null);
        setField(term17654, term17654.getClass(), "next", term17655);
        setField(term17654, term17654.getClass(), "first", null);
        setField(term17654, term17654.getClass(), "last", null);
        setField(term17654, term17654.getClass(), "propListHead", null);
        setIntField(term17654, term17654.getClass(), "sourcePosition", 0);
        setField(term17654, term17654.getClass(), "jsType", null);
        setField(term17654, term17654.getClass(), "parent", null);
        setField(term17653, term17653.getClass(), "first", term17654);
        setField(term17656, term17656.getClass(), "str", null);
        setIntField(term17656, term17656.getClass(), "type", 0);
        setField(term17656, term17656.getClass(), "next", null);
        setField(term17656, term17656.getClass(), "first", null);
        setField(term17656, term17656.getClass(), "last", null);
        setField(term17656, term17656.getClass(), "propListHead", null);
        setIntField(term17656, term17656.getClass(), "sourcePosition", 0);
        setField(term17656, term17656.getClass(), "jsType", null);
        setField(term17656, term17656.getClass(), "parent", null);
        setField(term17653, term17653.getClass(), "last", term17656);
        setField(term17653, term17653.getClass(), "propListHead", null);
        setIntField(term17653, term17653.getClass(), "sourcePosition", 0);
        setField(term17653, term17653.getClass(), "jsType", null);
        setField(term17653, term17653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term17286;
        args[1] = null;
        args[2] = false;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term17200, args);
        assertTrue(recursiveEquals(term17200, term17652));
        assertTrue(recursiveEquals(term17286, term17653));
        assertTrue(recursiveEquals(retValue, null));
    }

};


