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

public class PeepholeFoldConstants_tryFoldComparison_8484431792280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627290;
     Object term627382;
     Object term627474;
     Object term627560;
     Object term627602;
     Object term627603;
     Object term627604;
     Object term627605;
     Object term627576;

    public PeepholeFoldConstants_tryFoldComparison_8484431792280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627290 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term627382 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term627382, term627382.getClass(), "type", 16);
        term627474 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term627474, term627474.getClass(), "type", 16);
        term627560 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term627602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term627602, term627602.getClass(), "currentTraversal", null);
        term627603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term627603, term627603.getClass(), "str", null);
        setIntField(term627603, term627603.getClass(), "type", 16);
        setField(term627603, term627603.getClass(), "next", null);
        setField(term627603, term627603.getClass(), "first", null);
        setField(term627603, term627603.getClass(), "last", null);
        setField(term627603, term627603.getClass(), "propListHead", null);
        setIntField(term627603, term627603.getClass(), "sourcePosition", 0);
        setField(term627603, term627603.getClass(), "jsType", null);
        setField(term627603, term627603.getClass(), "parent", null);
        term627604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term627604, term627604.getClass(), "str", null);
        setIntField(term627604, term627604.getClass(), "type", 16);
        setField(term627604, term627604.getClass(), "next", null);
        setField(term627604, term627604.getClass(), "first", null);
        setField(term627604, term627604.getClass(), "last", null);
        setField(term627604, term627604.getClass(), "propListHead", null);
        setIntField(term627604, term627604.getClass(), "sourcePosition", 0);
        setField(term627604, term627604.getClass(), "jsType", null);
        setField(term627604, term627604.getClass(), "parent", null);
        term627605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term627605, term627605.getClass(), "functionName", null);
        setBooleanField(term627605, term627605.getClass(), "itsNeedsActivation", false);
        setIntField(term627605, term627605.getClass(), "itsFunctionType", 0);
        setBooleanField(term627605, term627605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term627605, term627605.getClass(), "encodedSourceStart", 0);
        setIntField(term627605, term627605.getClass(), "encodedSourceEnd", 0);
        setField(term627605, term627605.getClass(), "sourceName", null);
        setIntField(term627605, term627605.getClass(), "baseLineno", 0);
        setIntField(term627605, term627605.getClass(), "endLineno", 0);
        setField(term627605, term627605.getClass(), "functions", null);
        setField(term627605, term627605.getClass(), "regexps", null);
        setField(term627605, term627605.getClass(), "itsVariables", null);
        setField(term627605, term627605.getClass(), "itsConst", null);
        setField(term627605, term627605.getClass(), "itsVariableNames", null);
        setIntField(term627605, term627605.getClass(), "varStart", 0);
        setField(term627605, term627605.getClass(), "compilerData", null);
        setIntField(term627605, term627605.getClass(), "type", 0);
        setField(term627605, term627605.getClass(), "next", null);
        setField(term627605, term627605.getClass(), "first", null);
        setField(term627605, term627605.getClass(), "last", null);
        setField(term627605, term627605.getClass(), "propListHead", null);
        setIntField(term627605, term627605.getClass(), "sourcePosition", 0);
        setField(term627605, term627605.getClass(), "jsType", null);
        setField(term627605, term627605.getClass(), "parent", null);
        term627576 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term627576, term627576.getClass(), "str", null);
        setIntField(term627576, term627576.getClass(), "type", 16);
        setField(term627576, term627576.getClass(), "next", null);
        setField(term627576, term627576.getClass(), "first", null);
        setField(term627576, term627576.getClass(), "last", null);
        setField(term627576, term627576.getClass(), "propListHead", null);
        setIntField(term627576, term627576.getClass(), "sourcePosition", 0);
        setField(term627576, term627576.getClass(), "jsType", null);
        setField(term627576, term627576.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term627382;
        args[1] = term627474;
        args[2] = term627560;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term627290, args);
        assertTrue(recursiveEquals(term627290, term627602));
        assertTrue(recursiveEquals(term627382, term627603));
        assertTrue(recursiveEquals(term627474, term627604));
        assertTrue(recursiveEquals(term627560, term627605));
        assertTrue(recursiveEquals(retValue, term627576));
    }

};


