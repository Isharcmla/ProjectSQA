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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23264;
     Object term23350;
     Object term23738;
     Object term23739;
     Object term23653;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23264 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term23350 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term23436 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term23350, term23350.getClass(), "first", term23436);
        term23738 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term23738, term23738.getClass(), "currentTraversal", null);
        term23739 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term23740 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term23739, term23739.getClass(), "functionName", null);
        setBooleanField(term23739, term23739.getClass(), "itsNeedsActivation", false);
        setIntField(term23739, term23739.getClass(), "itsFunctionType", 0);
        setBooleanField(term23739, term23739.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term23739, term23739.getClass(), "encodedSourceStart", 0);
        setIntField(term23739, term23739.getClass(), "encodedSourceEnd", 0);
        setField(term23739, term23739.getClass(), "sourceName", null);
        setIntField(term23739, term23739.getClass(), "baseLineno", 0);
        setIntField(term23739, term23739.getClass(), "endLineno", 0);
        setField(term23739, term23739.getClass(), "functions", null);
        setField(term23739, term23739.getClass(), "regexps", null);
        setField(term23739, term23739.getClass(), "itsVariables", null);
        setField(term23739, term23739.getClass(), "itsConst", null);
        setField(term23739, term23739.getClass(), "itsVariableNames", null);
        setIntField(term23739, term23739.getClass(), "varStart", 0);
        setField(term23739, term23739.getClass(), "compilerData", null);
        setIntField(term23739, term23739.getClass(), "type", 0);
        setField(term23739, term23739.getClass(), "next", null);
        setField(term23740, term23740.getClass(), "functionName", null);
        setBooleanField(term23740, term23740.getClass(), "itsNeedsActivation", false);
        setIntField(term23740, term23740.getClass(), "itsFunctionType", 0);
        setBooleanField(term23740, term23740.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term23740, term23740.getClass(), "encodedSourceStart", 0);
        setIntField(term23740, term23740.getClass(), "encodedSourceEnd", 0);
        setField(term23740, term23740.getClass(), "sourceName", null);
        setIntField(term23740, term23740.getClass(), "baseLineno", 0);
        setIntField(term23740, term23740.getClass(), "endLineno", 0);
        setField(term23740, term23740.getClass(), "functions", null);
        setField(term23740, term23740.getClass(), "regexps", null);
        setField(term23740, term23740.getClass(), "itsVariables", null);
        setField(term23740, term23740.getClass(), "itsConst", null);
        setField(term23740, term23740.getClass(), "itsVariableNames", null);
        setIntField(term23740, term23740.getClass(), "varStart", 0);
        setField(term23740, term23740.getClass(), "compilerData", null);
        setIntField(term23740, term23740.getClass(), "type", 0);
        setField(term23740, term23740.getClass(), "next", null);
        setField(term23740, term23740.getClass(), "first", null);
        setField(term23740, term23740.getClass(), "last", null);
        setField(term23740, term23740.getClass(), "propListHead", null);
        setIntField(term23740, term23740.getClass(), "sourcePosition", 0);
        setField(term23740, term23740.getClass(), "jsType", null);
        setField(term23740, term23740.getClass(), "parent", null);
        setField(term23739, term23739.getClass(), "first", term23740);
        setField(term23739, term23739.getClass(), "last", null);
        setField(term23739, term23739.getClass(), "propListHead", null);
        setIntField(term23739, term23739.getClass(), "sourcePosition", 0);
        setField(term23739, term23739.getClass(), "jsType", null);
        setField(term23739, term23739.getClass(), "parent", null);
        term23653 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term23663 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term23653, term23653.getClass(), "functionName", null);
        setBooleanField(term23653, term23653.getClass(), "itsNeedsActivation", false);
        setIntField(term23653, term23653.getClass(), "itsFunctionType", 0);
        setBooleanField(term23653, term23653.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term23653, term23653.getClass(), "encodedSourceStart", 0);
        setIntField(term23653, term23653.getClass(), "encodedSourceEnd", 0);
        setField(term23653, term23653.getClass(), "sourceName", null);
        setIntField(term23653, term23653.getClass(), "baseLineno", 0);
        setIntField(term23653, term23653.getClass(), "endLineno", 0);
        setField(term23653, term23653.getClass(), "functions", null);
        setField(term23653, term23653.getClass(), "regexps", null);
        setField(term23653, term23653.getClass(), "itsVariables", null);
        setField(term23653, term23653.getClass(), "itsConst", null);
        setField(term23653, term23653.getClass(), "itsVariableNames", null);
        setIntField(term23653, term23653.getClass(), "varStart", 0);
        setField(term23653, term23653.getClass(), "compilerData", null);
        setIntField(term23653, term23653.getClass(), "type", 0);
        setField(term23653, term23653.getClass(), "next", null);
        setField(term23663, term23663.getClass(), "functionName", null);
        setBooleanField(term23663, term23663.getClass(), "itsNeedsActivation", false);
        setIntField(term23663, term23663.getClass(), "itsFunctionType", 0);
        setBooleanField(term23663, term23663.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term23663, term23663.getClass(), "encodedSourceStart", 0);
        setIntField(term23663, term23663.getClass(), "encodedSourceEnd", 0);
        setField(term23663, term23663.getClass(), "sourceName", null);
        setIntField(term23663, term23663.getClass(), "baseLineno", 0);
        setIntField(term23663, term23663.getClass(), "endLineno", 0);
        setField(term23663, term23663.getClass(), "functions", null);
        setField(term23663, term23663.getClass(), "regexps", null);
        setField(term23663, term23663.getClass(), "itsVariables", null);
        setField(term23663, term23663.getClass(), "itsConst", null);
        setField(term23663, term23663.getClass(), "itsVariableNames", null);
        setIntField(term23663, term23663.getClass(), "varStart", 0);
        setField(term23663, term23663.getClass(), "compilerData", null);
        setIntField(term23663, term23663.getClass(), "type", 0);
        setField(term23663, term23663.getClass(), "next", null);
        setField(term23663, term23663.getClass(), "first", null);
        setField(term23663, term23663.getClass(), "last", null);
        setField(term23663, term23663.getClass(), "propListHead", null);
        setIntField(term23663, term23663.getClass(), "sourcePosition", 0);
        setField(term23663, term23663.getClass(), "jsType", null);
        setField(term23663, term23663.getClass(), "parent", null);
        setField(term23653, term23653.getClass(), "first", term23663);
        setField(term23653, term23653.getClass(), "last", null);
        setField(term23653, term23653.getClass(), "propListHead", null);
        setIntField(term23653, term23653.getClass(), "sourcePosition", 0);
        setField(term23653, term23653.getClass(), "jsType", null);
        setField(term23653, term23653.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term23350;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term23264, args);
        assertTrue(recursiveEquals(term23264, term23738));
        assertTrue(recursiveEquals(term23350, term23739));
        assertTrue(recursiveEquals(retValue, term23653));
    }

};


