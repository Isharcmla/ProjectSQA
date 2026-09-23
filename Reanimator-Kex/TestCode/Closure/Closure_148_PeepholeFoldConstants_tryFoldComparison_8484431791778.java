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

public class PeepholeFoldConstants_tryFoldComparison_8484431791778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462442;
     Object term462534;
     Object term462626;
     Object term462712;
     Object term462811;
     Object term462812;
     Object term462813;
     Object term462814;
     Object term462780;

    public PeepholeFoldConstants_tryFoldComparison_8484431791778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462442 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term462534 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term462534, term462534.getClass(), "type", 14);
        term462626 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term462626, term462626.getClass(), "type", 42);
        term462712 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term462712, term462712.getClass(), "type", 42);
        term462811 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term462811, term462811.getClass(), "currentTraversal", null);
        term462812 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term462812, term462812.getClass(), "number", 0.0);
        setIntField(term462812, term462812.getClass(), "type", 42);
        setField(term462812, term462812.getClass(), "next", null);
        setField(term462812, term462812.getClass(), "first", null);
        setField(term462812, term462812.getClass(), "last", null);
        setField(term462812, term462812.getClass(), "propListHead", null);
        setIntField(term462812, term462812.getClass(), "sourcePosition", 0);
        setField(term462812, term462812.getClass(), "jsType", null);
        setField(term462812, term462812.getClass(), "parent", null);
        term462813 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term462813, term462813.getClass(), "number", 0.0);
        setIntField(term462813, term462813.getClass(), "type", 14);
        setField(term462813, term462813.getClass(), "next", null);
        setField(term462813, term462813.getClass(), "first", null);
        setField(term462813, term462813.getClass(), "last", null);
        setField(term462813, term462813.getClass(), "propListHead", null);
        setIntField(term462813, term462813.getClass(), "sourcePosition", 0);
        setField(term462813, term462813.getClass(), "jsType", null);
        setField(term462813, term462813.getClass(), "parent", null);
        term462814 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term462814, term462814.getClass(), "functionName", null);
        setBooleanField(term462814, term462814.getClass(), "itsNeedsActivation", false);
        setIntField(term462814, term462814.getClass(), "itsFunctionType", 0);
        setBooleanField(term462814, term462814.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term462814, term462814.getClass(), "encodedSourceStart", 0);
        setIntField(term462814, term462814.getClass(), "encodedSourceEnd", 0);
        setField(term462814, term462814.getClass(), "sourceName", null);
        setIntField(term462814, term462814.getClass(), "baseLineno", 0);
        setIntField(term462814, term462814.getClass(), "endLineno", 0);
        setField(term462814, term462814.getClass(), "functions", null);
        setField(term462814, term462814.getClass(), "regexps", null);
        setField(term462814, term462814.getClass(), "itsVariables", null);
        setField(term462814, term462814.getClass(), "itsConst", null);
        setField(term462814, term462814.getClass(), "itsVariableNames", null);
        setIntField(term462814, term462814.getClass(), "varStart", 0);
        setField(term462814, term462814.getClass(), "compilerData", null);
        setIntField(term462814, term462814.getClass(), "type", 42);
        setField(term462814, term462814.getClass(), "next", null);
        setField(term462814, term462814.getClass(), "first", null);
        setField(term462814, term462814.getClass(), "last", null);
        setField(term462814, term462814.getClass(), "propListHead", null);
        setIntField(term462814, term462814.getClass(), "sourcePosition", 0);
        setField(term462814, term462814.getClass(), "jsType", null);
        setField(term462814, term462814.getClass(), "parent", null);
        term462780 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term462780, term462780.getClass(), "number", 0.0);
        setIntField(term462780, term462780.getClass(), "type", 14);
        setField(term462780, term462780.getClass(), "next", null);
        setField(term462780, term462780.getClass(), "first", null);
        setField(term462780, term462780.getClass(), "last", null);
        setField(term462780, term462780.getClass(), "propListHead", null);
        setIntField(term462780, term462780.getClass(), "sourcePosition", 0);
        setField(term462780, term462780.getClass(), "jsType", null);
        setField(term462780, term462780.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term462534;
        args[1] = term462626;
        args[2] = term462712;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term462442, args);
        assertTrue(recursiveEquals(term462442, term462811));
        assertTrue(recursiveEquals(term462534, term462812));
        assertTrue(recursiveEquals(term462626, term462813));
        assertTrue(recursiveEquals(term462712, term462814));
        assertTrue(recursiveEquals(retValue, term462780));
    }

};


