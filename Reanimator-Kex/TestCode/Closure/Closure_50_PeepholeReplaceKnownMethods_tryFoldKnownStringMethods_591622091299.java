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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1973734;
     Object term1973826;
     Object term2449656;
     Object term2449657;
     Object term2449594;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1973734 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1973826 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1973912 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term1973982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1973826, term1973826.getClass(), "type", 37);
        setIntField(term1973912, term1973912.getClass(), "type", 35);
        setField(term1973912, term1973912.getClass(), "first", term1973982);
        setField(term1973826, term1973826.getClass(), "first", term1973912);
        term2449656 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2449656, term2449656.getClass(), "currentTraversal", null);
        term2449657 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2449658 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2449659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2449657, term2449657.getClass(), "number", 0.0);
        setIntField(term2449657, term2449657.getClass(), "type", 37);
        setField(term2449657, term2449657.getClass(), "next", null);
        setField(term2449658, term2449658.getClass(), "functionName", null);
        setBooleanField(term2449658, term2449658.getClass(), "itsNeedsActivation", false);
        setIntField(term2449658, term2449658.getClass(), "itsFunctionType", 0);
        setBooleanField(term2449658, term2449658.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2449658, term2449658.getClass(), "encodedSourceStart", 0);
        setIntField(term2449658, term2449658.getClass(), "encodedSourceEnd", 0);
        setField(term2449658, term2449658.getClass(), "sourceName", null);
        setIntField(term2449658, term2449658.getClass(), "baseLineno", 0);
        setIntField(term2449658, term2449658.getClass(), "endLineno", 0);
        setField(term2449658, term2449658.getClass(), "functions", null);
        setField(term2449658, term2449658.getClass(), "regexps", null);
        setField(term2449658, term2449658.getClass(), "itsVariables", null);
        setField(term2449658, term2449658.getClass(), "itsConst", null);
        setField(term2449658, term2449658.getClass(), "itsVariableNames", null);
        setIntField(term2449658, term2449658.getClass(), "varStart", 0);
        setField(term2449658, term2449658.getClass(), "compilerData", null);
        setIntField(term2449658, term2449658.getClass(), "type", 35);
        setField(term2449658, term2449658.getClass(), "next", null);
        setIntField(term2449659, term2449659.getClass(), "type", 0);
        setField(term2449659, term2449659.getClass(), "next", null);
        setField(term2449659, term2449659.getClass(), "first", null);
        setField(term2449659, term2449659.getClass(), "last", null);
        setField(term2449659, term2449659.getClass(), "propListHead", null);
        setIntField(term2449659, term2449659.getClass(), "sourcePosition", 0);
        setField(term2449659, term2449659.getClass(), "jsType", null);
        setField(term2449659, term2449659.getClass(), "parent", null);
        setField(term2449658, term2449658.getClass(), "first", term2449659);
        setField(term2449658, term2449658.getClass(), "last", null);
        setField(term2449658, term2449658.getClass(), "propListHead", null);
        setIntField(term2449658, term2449658.getClass(), "sourcePosition", 0);
        setField(term2449658, term2449658.getClass(), "jsType", null);
        setField(term2449658, term2449658.getClass(), "parent", null);
        setField(term2449657, term2449657.getClass(), "first", term2449658);
        setField(term2449657, term2449657.getClass(), "last", null);
        setField(term2449657, term2449657.getClass(), "propListHead", null);
        setIntField(term2449657, term2449657.getClass(), "sourcePosition", 0);
        setField(term2449657, term2449657.getClass(), "jsType", null);
        setField(term2449657, term2449657.getClass(), "parent", null);
        term2449594 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term2449597 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2449607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term2449594, term2449594.getClass(), "number", 0.0);
        setIntField(term2449594, term2449594.getClass(), "type", 37);
        setField(term2449594, term2449594.getClass(), "next", null);
        setField(term2449597, term2449597.getClass(), "functionName", null);
        setBooleanField(term2449597, term2449597.getClass(), "itsNeedsActivation", false);
        setIntField(term2449597, term2449597.getClass(), "itsFunctionType", 0);
        setBooleanField(term2449597, term2449597.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2449597, term2449597.getClass(), "encodedSourceStart", 0);
        setIntField(term2449597, term2449597.getClass(), "encodedSourceEnd", 0);
        setField(term2449597, term2449597.getClass(), "sourceName", null);
        setIntField(term2449597, term2449597.getClass(), "baseLineno", 0);
        setIntField(term2449597, term2449597.getClass(), "endLineno", 0);
        setField(term2449597, term2449597.getClass(), "functions", null);
        setField(term2449597, term2449597.getClass(), "regexps", null);
        setField(term2449597, term2449597.getClass(), "itsVariables", null);
        setField(term2449597, term2449597.getClass(), "itsConst", null);
        setField(term2449597, term2449597.getClass(), "itsVariableNames", null);
        setIntField(term2449597, term2449597.getClass(), "varStart", 0);
        setField(term2449597, term2449597.getClass(), "compilerData", null);
        setIntField(term2449597, term2449597.getClass(), "type", 35);
        setField(term2449597, term2449597.getClass(), "next", null);
        setIntField(term2449607, term2449607.getClass(), "type", 0);
        setField(term2449607, term2449607.getClass(), "next", null);
        setField(term2449607, term2449607.getClass(), "first", null);
        setField(term2449607, term2449607.getClass(), "last", null);
        setField(term2449607, term2449607.getClass(), "propListHead", null);
        setIntField(term2449607, term2449607.getClass(), "sourcePosition", 0);
        setField(term2449607, term2449607.getClass(), "jsType", null);
        setField(term2449607, term2449607.getClass(), "parent", null);
        setField(term2449597, term2449597.getClass(), "first", term2449607);
        setField(term2449597, term2449597.getClass(), "last", null);
        setField(term2449597, term2449597.getClass(), "propListHead", null);
        setIntField(term2449597, term2449597.getClass(), "sourcePosition", 0);
        setField(term2449597, term2449597.getClass(), "jsType", null);
        setField(term2449597, term2449597.getClass(), "parent", null);
        setField(term2449594, term2449594.getClass(), "first", term2449597);
        setField(term2449594, term2449594.getClass(), "last", null);
        setField(term2449594, term2449594.getClass(), "propListHead", null);
        setIntField(term2449594, term2449594.getClass(), "sourcePosition", 0);
        setField(term2449594, term2449594.getClass(), "jsType", null);
        setField(term2449594, term2449594.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1973826;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1973734, args);
        assertTrue(recursiveEquals(term1973734, term2449656));
        assertTrue(recursiveEquals(term1973826, term2449657));
        assertTrue(recursiveEquals(retValue, term2449594));
    }

};


