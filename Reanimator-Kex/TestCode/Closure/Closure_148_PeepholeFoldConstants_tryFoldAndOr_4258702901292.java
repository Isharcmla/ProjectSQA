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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310183;
     Object term310275;
     Object term310367;
     Object term310453;
     Object term310602;
     Object term310603;
     Object term310604;
     Object term310605;
     Object term310556;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310183 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term310275 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term310275, term310275.getClass(), "parent", null);
        setIntField(term310275, term310275.getClass(), "type", 0);
        term310367 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term310367, term310367.getClass(), "type", 0);
        term310453 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term310602 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term310602, term310602.getClass(), "currentTraversal", null);
        term310603 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term310603, term310603.getClass(), "str", null);
        setIntField(term310603, term310603.getClass(), "type", 0);
        setField(term310603, term310603.getClass(), "next", null);
        setField(term310603, term310603.getClass(), "first", null);
        setField(term310603, term310603.getClass(), "last", null);
        setField(term310603, term310603.getClass(), "propListHead", null);
        setIntField(term310603, term310603.getClass(), "sourcePosition", 0);
        setField(term310603, term310603.getClass(), "jsType", null);
        setField(term310603, term310603.getClass(), "parent", null);
        term310604 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term310604, term310604.getClass(), "str", null);
        setIntField(term310604, term310604.getClass(), "type", 0);
        setField(term310604, term310604.getClass(), "next", null);
        setField(term310604, term310604.getClass(), "first", null);
        setField(term310604, term310604.getClass(), "last", null);
        setField(term310604, term310604.getClass(), "propListHead", null);
        setIntField(term310604, term310604.getClass(), "sourcePosition", 0);
        setField(term310604, term310604.getClass(), "jsType", null);
        setField(term310604, term310604.getClass(), "parent", null);
        term310605 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term310605, term310605.getClass(), "functionName", null);
        setBooleanField(term310605, term310605.getClass(), "itsNeedsActivation", false);
        setIntField(term310605, term310605.getClass(), "itsFunctionType", 0);
        setBooleanField(term310605, term310605.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term310605, term310605.getClass(), "encodedSourceStart", 0);
        setIntField(term310605, term310605.getClass(), "encodedSourceEnd", 0);
        setField(term310605, term310605.getClass(), "sourceName", null);
        setIntField(term310605, term310605.getClass(), "baseLineno", 0);
        setIntField(term310605, term310605.getClass(), "endLineno", 0);
        setField(term310605, term310605.getClass(), "functions", null);
        setField(term310605, term310605.getClass(), "regexps", null);
        setField(term310605, term310605.getClass(), "itsVariables", null);
        setField(term310605, term310605.getClass(), "itsConst", null);
        setField(term310605, term310605.getClass(), "itsVariableNames", null);
        setIntField(term310605, term310605.getClass(), "varStart", 0);
        setField(term310605, term310605.getClass(), "compilerData", null);
        setIntField(term310605, term310605.getClass(), "type", 0);
        setField(term310605, term310605.getClass(), "next", null);
        setField(term310605, term310605.getClass(), "first", null);
        setField(term310605, term310605.getClass(), "last", null);
        setField(term310605, term310605.getClass(), "propListHead", null);
        setIntField(term310605, term310605.getClass(), "sourcePosition", 0);
        setField(term310605, term310605.getClass(), "jsType", null);
        setField(term310605, term310605.getClass(), "parent", null);
        term310556 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term310556, term310556.getClass(), "str", null);
        setIntField(term310556, term310556.getClass(), "type", 0);
        setField(term310556, term310556.getClass(), "next", null);
        setField(term310556, term310556.getClass(), "first", null);
        setField(term310556, term310556.getClass(), "last", null);
        setField(term310556, term310556.getClass(), "propListHead", null);
        setIntField(term310556, term310556.getClass(), "sourcePosition", 0);
        setField(term310556, term310556.getClass(), "jsType", null);
        setField(term310556, term310556.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term310275;
        args[1] = term310367;
        args[2] = term310453;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term310183, args);
        assertTrue(recursiveEquals(term310183, term310602));
        assertTrue(recursiveEquals(term310275, term310603));
        assertTrue(recursiveEquals(term310367, term310604));
        assertTrue(recursiveEquals(term310453, term310605));
        assertTrue(recursiveEquals(retValue, term310556));
    }

};


