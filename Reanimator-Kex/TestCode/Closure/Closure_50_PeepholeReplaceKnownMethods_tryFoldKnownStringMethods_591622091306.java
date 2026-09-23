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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2450330;
     Object term2450416;
     Object term2615445;
     Object term2615446;
     Object term2615397;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2450330 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2450416 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2450508 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2450578 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2450416, term2450416.getClass(), "type", 37);
        setIntField(term2450508, term2450508.getClass(), "type", 35);
        setField(term2450508, term2450508.getClass(), "first", term2450578);
        setField(term2450416, term2450416.getClass(), "first", term2450508);
        term2615445 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2615445, term2615445.getClass(), "currentTraversal", null);
        term2615446 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2615447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2615448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2615446, term2615446.getClass(), "functionName", null);
        setBooleanField(term2615446, term2615446.getClass(), "itsNeedsActivation", false);
        setIntField(term2615446, term2615446.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615446, term2615446.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615446, term2615446.getClass(), "encodedSourceStart", 0);
        setIntField(term2615446, term2615446.getClass(), "encodedSourceEnd", 0);
        setField(term2615446, term2615446.getClass(), "sourceName", null);
        setIntField(term2615446, term2615446.getClass(), "baseLineno", 0);
        setIntField(term2615446, term2615446.getClass(), "endLineno", 0);
        setField(term2615446, term2615446.getClass(), "functions", null);
        setField(term2615446, term2615446.getClass(), "regexps", null);
        setField(term2615446, term2615446.getClass(), "itsVariables", null);
        setField(term2615446, term2615446.getClass(), "itsConst", null);
        setField(term2615446, term2615446.getClass(), "itsVariableNames", null);
        setIntField(term2615446, term2615446.getClass(), "varStart", 0);
        setField(term2615446, term2615446.getClass(), "compilerData", null);
        setIntField(term2615446, term2615446.getClass(), "type", 37);
        setField(term2615446, term2615446.getClass(), "next", null);
        setDoubleField(term2615447, term2615447.getClass(), "number", 0.0);
        setIntField(term2615447, term2615447.getClass(), "type", 35);
        setField(term2615447, term2615447.getClass(), "next", null);
        setIntField(term2615448, term2615448.getClass(), "type", 0);
        setField(term2615448, term2615448.getClass(), "next", null);
        setField(term2615448, term2615448.getClass(), "first", null);
        setField(term2615448, term2615448.getClass(), "last", null);
        setField(term2615448, term2615448.getClass(), "propListHead", null);
        setIntField(term2615448, term2615448.getClass(), "sourcePosition", 0);
        setField(term2615448, term2615448.getClass(), "jsType", null);
        setField(term2615448, term2615448.getClass(), "parent", null);
        setField(term2615447, term2615447.getClass(), "first", term2615448);
        setField(term2615447, term2615447.getClass(), "last", null);
        setField(term2615447, term2615447.getClass(), "propListHead", null);
        setIntField(term2615447, term2615447.getClass(), "sourcePosition", 0);
        setField(term2615447, term2615447.getClass(), "jsType", null);
        setField(term2615447, term2615447.getClass(), "parent", null);
        setField(term2615446, term2615446.getClass(), "first", term2615447);
        setField(term2615446, term2615446.getClass(), "last", null);
        setField(term2615446, term2615446.getClass(), "propListHead", null);
        setIntField(term2615446, term2615446.getClass(), "sourcePosition", 0);
        setField(term2615446, term2615446.getClass(), "jsType", null);
        setField(term2615446, term2615446.getClass(), "parent", null);
        term2615397 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2615407 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2615410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2615397, term2615397.getClass(), "functionName", null);
        setBooleanField(term2615397, term2615397.getClass(), "itsNeedsActivation", false);
        setIntField(term2615397, term2615397.getClass(), "itsFunctionType", 0);
        setBooleanField(term2615397, term2615397.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2615397, term2615397.getClass(), "encodedSourceStart", 0);
        setIntField(term2615397, term2615397.getClass(), "encodedSourceEnd", 0);
        setField(term2615397, term2615397.getClass(), "sourceName", null);
        setIntField(term2615397, term2615397.getClass(), "baseLineno", 0);
        setIntField(term2615397, term2615397.getClass(), "endLineno", 0);
        setField(term2615397, term2615397.getClass(), "functions", null);
        setField(term2615397, term2615397.getClass(), "regexps", null);
        setField(term2615397, term2615397.getClass(), "itsVariables", null);
        setField(term2615397, term2615397.getClass(), "itsConst", null);
        setField(term2615397, term2615397.getClass(), "itsVariableNames", null);
        setIntField(term2615397, term2615397.getClass(), "varStart", 0);
        setField(term2615397, term2615397.getClass(), "compilerData", null);
        setIntField(term2615397, term2615397.getClass(), "type", 37);
        setField(term2615397, term2615397.getClass(), "next", null);
        setDoubleField(term2615407, term2615407.getClass(), "number", 0.0);
        setIntField(term2615407, term2615407.getClass(), "type", 35);
        setField(term2615407, term2615407.getClass(), "next", null);
        setIntField(term2615410, term2615410.getClass(), "type", 0);
        setField(term2615410, term2615410.getClass(), "next", null);
        setField(term2615410, term2615410.getClass(), "first", null);
        setField(term2615410, term2615410.getClass(), "last", null);
        setField(term2615410, term2615410.getClass(), "propListHead", null);
        setIntField(term2615410, term2615410.getClass(), "sourcePosition", 0);
        setField(term2615410, term2615410.getClass(), "jsType", null);
        setField(term2615410, term2615410.getClass(), "parent", null);
        setField(term2615407, term2615407.getClass(), "first", term2615410);
        setField(term2615407, term2615407.getClass(), "last", null);
        setField(term2615407, term2615407.getClass(), "propListHead", null);
        setIntField(term2615407, term2615407.getClass(), "sourcePosition", 0);
        setField(term2615407, term2615407.getClass(), "jsType", null);
        setField(term2615407, term2615407.getClass(), "parent", null);
        setField(term2615397, term2615397.getClass(), "first", term2615407);
        setField(term2615397, term2615397.getClass(), "last", null);
        setField(term2615397, term2615397.getClass(), "propListHead", null);
        setIntField(term2615397, term2615397.getClass(), "sourcePosition", 0);
        setField(term2615397, term2615397.getClass(), "jsType", null);
        setField(term2615397, term2615397.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2450416;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2450330, args);
        assertTrue(recursiveEquals(term2450330, term2615445));
        assertTrue(recursiveEquals(term2450416, term2615446));
        assertTrue(recursiveEquals(retValue, term2615397));
    }

};


