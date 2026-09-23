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

public class PeepholeFoldConstants_tryFoldComparison_848443179700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155328;
     Object term155420;
     Object term155512;
     Object term155598;
     Object term155838;
     Object term155839;
     Object term155840;
     Object term155841;
     Object term155811;

    public PeepholeFoldConstants_tryFoldComparison_848443179700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155328 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term155420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term155420, term155420.getClass(), "type", 16);
        term155512 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term155512, term155512.getClass(), "type", 16);
        term155598 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term155838 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term155838, term155838.getClass(), "currentTraversal", null);
        term155839 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term155839, term155839.getClass(), "number", 0.0);
        setIntField(term155839, term155839.getClass(), "type", 16);
        setField(term155839, term155839.getClass(), "next", null);
        setField(term155839, term155839.getClass(), "first", null);
        setField(term155839, term155839.getClass(), "last", null);
        setField(term155839, term155839.getClass(), "propListHead", null);
        setIntField(term155839, term155839.getClass(), "sourcePosition", 0);
        setField(term155839, term155839.getClass(), "jsType", null);
        setField(term155839, term155839.getClass(), "parent", null);
        term155840 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term155840, term155840.getClass(), "number", 0.0);
        setIntField(term155840, term155840.getClass(), "type", 16);
        setField(term155840, term155840.getClass(), "next", null);
        setField(term155840, term155840.getClass(), "first", null);
        setField(term155840, term155840.getClass(), "last", null);
        setField(term155840, term155840.getClass(), "propListHead", null);
        setIntField(term155840, term155840.getClass(), "sourcePosition", 0);
        setField(term155840, term155840.getClass(), "jsType", null);
        setField(term155840, term155840.getClass(), "parent", null);
        term155841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term155841, term155841.getClass(), "functionName", null);
        setBooleanField(term155841, term155841.getClass(), "itsNeedsActivation", false);
        setIntField(term155841, term155841.getClass(), "itsFunctionType", 0);
        setBooleanField(term155841, term155841.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term155841, term155841.getClass(), "encodedSourceStart", 0);
        setIntField(term155841, term155841.getClass(), "encodedSourceEnd", 0);
        setField(term155841, term155841.getClass(), "sourceName", null);
        setIntField(term155841, term155841.getClass(), "baseLineno", 0);
        setIntField(term155841, term155841.getClass(), "endLineno", 0);
        setField(term155841, term155841.getClass(), "functions", null);
        setField(term155841, term155841.getClass(), "regexps", null);
        setField(term155841, term155841.getClass(), "itsVariables", null);
        setField(term155841, term155841.getClass(), "itsConst", null);
        setField(term155841, term155841.getClass(), "itsVariableNames", null);
        setIntField(term155841, term155841.getClass(), "varStart", 0);
        setField(term155841, term155841.getClass(), "compilerData", null);
        setIntField(term155841, term155841.getClass(), "type", 0);
        setField(term155841, term155841.getClass(), "next", null);
        setField(term155841, term155841.getClass(), "first", null);
        setField(term155841, term155841.getClass(), "last", null);
        setField(term155841, term155841.getClass(), "propListHead", null);
        setIntField(term155841, term155841.getClass(), "sourcePosition", 0);
        setField(term155841, term155841.getClass(), "jsType", null);
        setField(term155841, term155841.getClass(), "parent", null);
        term155811 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term155811, term155811.getClass(), "number", 0.0);
        setIntField(term155811, term155811.getClass(), "type", 16);
        setField(term155811, term155811.getClass(), "next", null);
        setField(term155811, term155811.getClass(), "first", null);
        setField(term155811, term155811.getClass(), "last", null);
        setField(term155811, term155811.getClass(), "propListHead", null);
        setIntField(term155811, term155811.getClass(), "sourcePosition", 0);
        setField(term155811, term155811.getClass(), "jsType", null);
        setField(term155811, term155811.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term155420;
        args[1] = term155512;
        args[2] = term155598;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term155328, args);
        assertTrue(recursiveEquals(term155328, term155838));
        assertTrue(recursiveEquals(term155420, term155839));
        assertTrue(recursiveEquals(term155512, term155840));
        assertTrue(recursiveEquals(term155598, term155841));
        assertTrue(recursiveEquals(retValue, term155811));
    }

};


