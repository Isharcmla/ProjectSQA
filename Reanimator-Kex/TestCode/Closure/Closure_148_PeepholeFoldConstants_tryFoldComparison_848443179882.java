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

public class PeepholeFoldConstants_tryFoldComparison_848443179882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204383;
     Object term204475;
     Object term204567;
     Object term204653;
     Object term204693;
     Object term204694;
     Object term204695;
     Object term204696;
     Object term204664;

    public PeepholeFoldConstants_tryFoldComparison_848443179882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term204383 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term204475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204475, term204475.getClass(), "type", 16);
        term204567 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term204567, term204567.getClass(), "type", 42);
        term204653 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term204653, term204653.getClass(), "type", 42);
        term204693 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term204693, term204693.getClass(), "currentTraversal", null);
        term204694 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term204694, term204694.getClass(), "number", 0.0);
        setIntField(term204694, term204694.getClass(), "type", 42);
        setField(term204694, term204694.getClass(), "next", null);
        setField(term204694, term204694.getClass(), "first", null);
        setField(term204694, term204694.getClass(), "last", null);
        setField(term204694, term204694.getClass(), "propListHead", null);
        setIntField(term204694, term204694.getClass(), "sourcePosition", 0);
        setField(term204694, term204694.getClass(), "jsType", null);
        setField(term204694, term204694.getClass(), "parent", null);
        term204695 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term204695, term204695.getClass(), "number", 0.0);
        setIntField(term204695, term204695.getClass(), "type", 16);
        setField(term204695, term204695.getClass(), "next", null);
        setField(term204695, term204695.getClass(), "first", null);
        setField(term204695, term204695.getClass(), "last", null);
        setField(term204695, term204695.getClass(), "propListHead", null);
        setIntField(term204695, term204695.getClass(), "sourcePosition", 0);
        setField(term204695, term204695.getClass(), "jsType", null);
        setField(term204695, term204695.getClass(), "parent", null);
        term204696 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term204696, term204696.getClass(), "functionName", null);
        setBooleanField(term204696, term204696.getClass(), "itsNeedsActivation", false);
        setIntField(term204696, term204696.getClass(), "itsFunctionType", 0);
        setBooleanField(term204696, term204696.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term204696, term204696.getClass(), "encodedSourceStart", 0);
        setIntField(term204696, term204696.getClass(), "encodedSourceEnd", 0);
        setField(term204696, term204696.getClass(), "sourceName", null);
        setIntField(term204696, term204696.getClass(), "baseLineno", 0);
        setIntField(term204696, term204696.getClass(), "endLineno", 0);
        setField(term204696, term204696.getClass(), "functions", null);
        setField(term204696, term204696.getClass(), "regexps", null);
        setField(term204696, term204696.getClass(), "itsVariables", null);
        setField(term204696, term204696.getClass(), "itsConst", null);
        setField(term204696, term204696.getClass(), "itsVariableNames", null);
        setIntField(term204696, term204696.getClass(), "varStart", 0);
        setField(term204696, term204696.getClass(), "compilerData", null);
        setIntField(term204696, term204696.getClass(), "type", 42);
        setField(term204696, term204696.getClass(), "next", null);
        setField(term204696, term204696.getClass(), "first", null);
        setField(term204696, term204696.getClass(), "last", null);
        setField(term204696, term204696.getClass(), "propListHead", null);
        setIntField(term204696, term204696.getClass(), "sourcePosition", 0);
        setField(term204696, term204696.getClass(), "jsType", null);
        setField(term204696, term204696.getClass(), "parent", null);
        term204664 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term204664, term204664.getClass(), "number", 0.0);
        setIntField(term204664, term204664.getClass(), "type", 16);
        setField(term204664, term204664.getClass(), "next", null);
        setField(term204664, term204664.getClass(), "first", null);
        setField(term204664, term204664.getClass(), "last", null);
        setField(term204664, term204664.getClass(), "propListHead", null);
        setIntField(term204664, term204664.getClass(), "sourcePosition", 0);
        setField(term204664, term204664.getClass(), "jsType", null);
        setField(term204664, term204664.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term204475;
        args[1] = term204567;
        args[2] = term204653;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term204383, args);
        assertTrue(recursiveEquals(term204383, term204693));
        assertTrue(recursiveEquals(term204475, term204694));
        assertTrue(recursiveEquals(term204567, term204695));
        assertTrue(recursiveEquals(term204653, term204696));
        assertTrue(recursiveEquals(retValue, term204664));
    }

};


