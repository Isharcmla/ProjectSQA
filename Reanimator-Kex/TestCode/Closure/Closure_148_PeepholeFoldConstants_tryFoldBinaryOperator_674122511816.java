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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185270;
     Object term185362;
     Object term185623;
     Object term185624;
     Object term185555;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185270 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term185362 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185454 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185540 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term185540, term185540.getClass(), "type", 42);
        setField(term185454, term185454.getClass(), "next", term185540);
        setIntField(term185454, term185454.getClass(), "type", 42);
        setField(term185362, term185362.getClass(), "first", term185454);
        setIntField(term185362, term185362.getClass(), "type", 16);
        term185623 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term185623, term185623.getClass(), "currentTraversal", null);
        term185624 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185625 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term185624, term185624.getClass(), "str", null);
        setIntField(term185624, term185624.getClass(), "type", 16);
        setField(term185624, term185624.getClass(), "next", null);
        setField(term185625, term185625.getClass(), "str", null);
        setIntField(term185625, term185625.getClass(), "type", 42);
        setField(term185626, term185626.getClass(), "functionName", null);
        setBooleanField(term185626, term185626.getClass(), "itsNeedsActivation", false);
        setIntField(term185626, term185626.getClass(), "itsFunctionType", 0);
        setBooleanField(term185626, term185626.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term185626, term185626.getClass(), "encodedSourceStart", 0);
        setIntField(term185626, term185626.getClass(), "encodedSourceEnd", 0);
        setField(term185626, term185626.getClass(), "sourceName", null);
        setIntField(term185626, term185626.getClass(), "baseLineno", 0);
        setIntField(term185626, term185626.getClass(), "endLineno", 0);
        setField(term185626, term185626.getClass(), "functions", null);
        setField(term185626, term185626.getClass(), "regexps", null);
        setField(term185626, term185626.getClass(), "itsVariables", null);
        setField(term185626, term185626.getClass(), "itsConst", null);
        setField(term185626, term185626.getClass(), "itsVariableNames", null);
        setIntField(term185626, term185626.getClass(), "varStart", 0);
        setField(term185626, term185626.getClass(), "compilerData", null);
        setIntField(term185626, term185626.getClass(), "type", 42);
        setField(term185626, term185626.getClass(), "next", null);
        setField(term185626, term185626.getClass(), "first", null);
        setField(term185626, term185626.getClass(), "last", null);
        setField(term185626, term185626.getClass(), "propListHead", null);
        setIntField(term185626, term185626.getClass(), "sourcePosition", 0);
        setField(term185626, term185626.getClass(), "jsType", null);
        setField(term185626, term185626.getClass(), "parent", null);
        setField(term185625, term185625.getClass(), "next", term185626);
        setField(term185625, term185625.getClass(), "first", null);
        setField(term185625, term185625.getClass(), "last", null);
        setField(term185625, term185625.getClass(), "propListHead", null);
        setIntField(term185625, term185625.getClass(), "sourcePosition", 0);
        setField(term185625, term185625.getClass(), "jsType", null);
        setField(term185625, term185625.getClass(), "parent", null);
        setField(term185624, term185624.getClass(), "first", term185625);
        setField(term185624, term185624.getClass(), "last", null);
        setField(term185624, term185624.getClass(), "propListHead", null);
        setIntField(term185624, term185624.getClass(), "sourcePosition", 0);
        setField(term185624, term185624.getClass(), "jsType", null);
        setField(term185624, term185624.getClass(), "parent", null);
        term185555 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185557 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term185559 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term185555, term185555.getClass(), "str", null);
        setIntField(term185555, term185555.getClass(), "type", 16);
        setField(term185555, term185555.getClass(), "next", null);
        setField(term185557, term185557.getClass(), "str", null);
        setIntField(term185557, term185557.getClass(), "type", 42);
        setField(term185559, term185559.getClass(), "functionName", null);
        setBooleanField(term185559, term185559.getClass(), "itsNeedsActivation", false);
        setIntField(term185559, term185559.getClass(), "itsFunctionType", 0);
        setBooleanField(term185559, term185559.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term185559, term185559.getClass(), "encodedSourceStart", 0);
        setIntField(term185559, term185559.getClass(), "encodedSourceEnd", 0);
        setField(term185559, term185559.getClass(), "sourceName", null);
        setIntField(term185559, term185559.getClass(), "baseLineno", 0);
        setIntField(term185559, term185559.getClass(), "endLineno", 0);
        setField(term185559, term185559.getClass(), "functions", null);
        setField(term185559, term185559.getClass(), "regexps", null);
        setField(term185559, term185559.getClass(), "itsVariables", null);
        setField(term185559, term185559.getClass(), "itsConst", null);
        setField(term185559, term185559.getClass(), "itsVariableNames", null);
        setIntField(term185559, term185559.getClass(), "varStart", 0);
        setField(term185559, term185559.getClass(), "compilerData", null);
        setIntField(term185559, term185559.getClass(), "type", 42);
        setField(term185559, term185559.getClass(), "next", null);
        setField(term185559, term185559.getClass(), "first", null);
        setField(term185559, term185559.getClass(), "last", null);
        setField(term185559, term185559.getClass(), "propListHead", null);
        setIntField(term185559, term185559.getClass(), "sourcePosition", 0);
        setField(term185559, term185559.getClass(), "jsType", null);
        setField(term185559, term185559.getClass(), "parent", null);
        setField(term185557, term185557.getClass(), "next", term185559);
        setField(term185557, term185557.getClass(), "first", null);
        setField(term185557, term185557.getClass(), "last", null);
        setField(term185557, term185557.getClass(), "propListHead", null);
        setIntField(term185557, term185557.getClass(), "sourcePosition", 0);
        setField(term185557, term185557.getClass(), "jsType", null);
        setField(term185557, term185557.getClass(), "parent", null);
        setField(term185555, term185555.getClass(), "first", term185557);
        setField(term185555, term185555.getClass(), "last", null);
        setField(term185555, term185555.getClass(), "propListHead", null);
        setIntField(term185555, term185555.getClass(), "sourcePosition", 0);
        setField(term185555, term185555.getClass(), "jsType", null);
        setField(term185555, term185555.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term185362;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term185270, args);
        assertTrue(recursiveEquals(term185270, term185623));
        assertTrue(recursiveEquals(term185362, term185624));
        assertTrue(recursiveEquals(retValue, term185555));
    }

};


