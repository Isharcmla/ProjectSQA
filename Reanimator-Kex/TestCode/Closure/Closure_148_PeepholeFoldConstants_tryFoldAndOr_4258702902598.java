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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term738289;
     Object term738375;
     Object term738553;
     Object term738645;
     Object term738757;
     Object term738758;
     Object term738760;
     Object term738761;
     Object term738663;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term738289 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term738375 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738461 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term738461, term738461.getClass(), "type", 113);
        setField(term738375, term738375.getClass(), "parent", term738461);
        setIntField(term738375, term738375.getClass(), "type", 0);
        term738553 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term738553, term738553.getClass(), "type", 112);
        term738645 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term738645, term738645.getClass(), "type", 63);
        term738757 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term738757, term738757.getClass(), "currentTraversal", null);
        term738758 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738759 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term738758, term738758.getClass(), "functionName", null);
        setBooleanField(term738758, term738758.getClass(), "itsNeedsActivation", false);
        setIntField(term738758, term738758.getClass(), "itsFunctionType", 0);
        setBooleanField(term738758, term738758.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738758, term738758.getClass(), "encodedSourceStart", 0);
        setIntField(term738758, term738758.getClass(), "encodedSourceEnd", 0);
        setField(term738758, term738758.getClass(), "sourceName", null);
        setIntField(term738758, term738758.getClass(), "baseLineno", 0);
        setIntField(term738758, term738758.getClass(), "endLineno", 0);
        setField(term738758, term738758.getClass(), "functions", null);
        setField(term738758, term738758.getClass(), "regexps", null);
        setField(term738758, term738758.getClass(), "itsVariables", null);
        setField(term738758, term738758.getClass(), "itsConst", null);
        setField(term738758, term738758.getClass(), "itsVariableNames", null);
        setIntField(term738758, term738758.getClass(), "varStart", 0);
        setField(term738758, term738758.getClass(), "compilerData", null);
        setIntField(term738758, term738758.getClass(), "type", 0);
        setField(term738758, term738758.getClass(), "next", null);
        setField(term738758, term738758.getClass(), "first", null);
        setField(term738758, term738758.getClass(), "last", null);
        setField(term738758, term738758.getClass(), "propListHead", null);
        setIntField(term738758, term738758.getClass(), "sourcePosition", 0);
        setField(term738758, term738758.getClass(), "jsType", null);
        setField(term738759, term738759.getClass(), "functionName", null);
        setBooleanField(term738759, term738759.getClass(), "itsNeedsActivation", false);
        setIntField(term738759, term738759.getClass(), "itsFunctionType", 0);
        setBooleanField(term738759, term738759.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738759, term738759.getClass(), "encodedSourceStart", 0);
        setIntField(term738759, term738759.getClass(), "encodedSourceEnd", 0);
        setField(term738759, term738759.getClass(), "sourceName", null);
        setIntField(term738759, term738759.getClass(), "baseLineno", 0);
        setIntField(term738759, term738759.getClass(), "endLineno", 0);
        setField(term738759, term738759.getClass(), "functions", null);
        setField(term738759, term738759.getClass(), "regexps", null);
        setField(term738759, term738759.getClass(), "itsVariables", null);
        setField(term738759, term738759.getClass(), "itsConst", null);
        setField(term738759, term738759.getClass(), "itsVariableNames", null);
        setIntField(term738759, term738759.getClass(), "varStart", 0);
        setField(term738759, term738759.getClass(), "compilerData", null);
        setIntField(term738759, term738759.getClass(), "type", 113);
        setField(term738759, term738759.getClass(), "next", null);
        setField(term738759, term738759.getClass(), "first", null);
        setField(term738759, term738759.getClass(), "last", null);
        setField(term738759, term738759.getClass(), "propListHead", null);
        setIntField(term738759, term738759.getClass(), "sourcePosition", 0);
        setField(term738759, term738759.getClass(), "jsType", null);
        setField(term738759, term738759.getClass(), "parent", null);
        setField(term738758, term738758.getClass(), "parent", term738759);
        term738760 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term738760, term738760.getClass(), "number", 0.0);
        setIntField(term738760, term738760.getClass(), "type", 112);
        setField(term738760, term738760.getClass(), "next", null);
        setField(term738760, term738760.getClass(), "first", null);
        setField(term738760, term738760.getClass(), "last", null);
        setField(term738760, term738760.getClass(), "propListHead", null);
        setIntField(term738760, term738760.getClass(), "sourcePosition", 0);
        setField(term738760, term738760.getClass(), "jsType", null);
        setField(term738760, term738760.getClass(), "parent", null);
        term738761 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term738761, term738761.getClass(), "number", 0.0);
        setIntField(term738761, term738761.getClass(), "type", 63);
        setField(term738761, term738761.getClass(), "next", null);
        setField(term738761, term738761.getClass(), "first", null);
        setField(term738761, term738761.getClass(), "last", null);
        setField(term738761, term738761.getClass(), "propListHead", null);
        setIntField(term738761, term738761.getClass(), "sourcePosition", 0);
        setField(term738761, term738761.getClass(), "jsType", null);
        setField(term738761, term738761.getClass(), "parent", null);
        term738663 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term738674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term738663, term738663.getClass(), "functionName", null);
        setBooleanField(term738663, term738663.getClass(), "itsNeedsActivation", false);
        setIntField(term738663, term738663.getClass(), "itsFunctionType", 0);
        setBooleanField(term738663, term738663.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738663, term738663.getClass(), "encodedSourceStart", 0);
        setIntField(term738663, term738663.getClass(), "encodedSourceEnd", 0);
        setField(term738663, term738663.getClass(), "sourceName", null);
        setIntField(term738663, term738663.getClass(), "baseLineno", 0);
        setIntField(term738663, term738663.getClass(), "endLineno", 0);
        setField(term738663, term738663.getClass(), "functions", null);
        setField(term738663, term738663.getClass(), "regexps", null);
        setField(term738663, term738663.getClass(), "itsVariables", null);
        setField(term738663, term738663.getClass(), "itsConst", null);
        setField(term738663, term738663.getClass(), "itsVariableNames", null);
        setIntField(term738663, term738663.getClass(), "varStart", 0);
        setField(term738663, term738663.getClass(), "compilerData", null);
        setIntField(term738663, term738663.getClass(), "type", 0);
        setField(term738663, term738663.getClass(), "next", null);
        setField(term738663, term738663.getClass(), "first", null);
        setField(term738663, term738663.getClass(), "last", null);
        setField(term738663, term738663.getClass(), "propListHead", null);
        setIntField(term738663, term738663.getClass(), "sourcePosition", 0);
        setField(term738663, term738663.getClass(), "jsType", null);
        setField(term738674, term738674.getClass(), "functionName", null);
        setBooleanField(term738674, term738674.getClass(), "itsNeedsActivation", false);
        setIntField(term738674, term738674.getClass(), "itsFunctionType", 0);
        setBooleanField(term738674, term738674.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term738674, term738674.getClass(), "encodedSourceStart", 0);
        setIntField(term738674, term738674.getClass(), "encodedSourceEnd", 0);
        setField(term738674, term738674.getClass(), "sourceName", null);
        setIntField(term738674, term738674.getClass(), "baseLineno", 0);
        setIntField(term738674, term738674.getClass(), "endLineno", 0);
        setField(term738674, term738674.getClass(), "functions", null);
        setField(term738674, term738674.getClass(), "regexps", null);
        setField(term738674, term738674.getClass(), "itsVariables", null);
        setField(term738674, term738674.getClass(), "itsConst", null);
        setField(term738674, term738674.getClass(), "itsVariableNames", null);
        setIntField(term738674, term738674.getClass(), "varStart", 0);
        setField(term738674, term738674.getClass(), "compilerData", null);
        setIntField(term738674, term738674.getClass(), "type", 113);
        setField(term738674, term738674.getClass(), "next", null);
        setField(term738674, term738674.getClass(), "first", null);
        setField(term738674, term738674.getClass(), "last", null);
        setField(term738674, term738674.getClass(), "propListHead", null);
        setIntField(term738674, term738674.getClass(), "sourcePosition", 0);
        setField(term738674, term738674.getClass(), "jsType", null);
        setField(term738674, term738674.getClass(), "parent", null);
        setField(term738663, term738663.getClass(), "parent", term738674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term738375;
        args[1] = term738553;
        args[2] = term738645;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term738289, args);
        assertTrue(recursiveEquals(term738289, term738757));
        assertTrue(recursiveEquals(term738375, term738758));
        assertTrue(recursiveEquals(term738553, term738760));
        assertTrue(recursiveEquals(term738645, term738761));
        assertTrue(recursiveEquals(retValue, term738663));
    }

};


