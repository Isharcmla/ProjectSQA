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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634632;
     Object term634724;
     Object term634816;
     Object term634902;
     Object term635503;
     Object term635504;
     Object term635505;
     Object term635506;
     Object term635456;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term634632 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term634724 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term634724, term634724.getClass(), "parent", null);
        setIntField(term634724, term634724.getClass(), "type", 0);
        term634816 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term634816, term634816.getClass(), "type", 0);
        term634902 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term635503 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term635503, term635503.getClass(), "currentTraversal", null);
        term635504 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term635504, term635504.getClass(), "str", null);
        setIntField(term635504, term635504.getClass(), "type", 0);
        setField(term635504, term635504.getClass(), "next", null);
        setField(term635504, term635504.getClass(), "first", null);
        setField(term635504, term635504.getClass(), "last", null);
        setField(term635504, term635504.getClass(), "propListHead", null);
        setIntField(term635504, term635504.getClass(), "sourcePosition", 0);
        setField(term635504, term635504.getClass(), "jsType", null);
        setField(term635504, term635504.getClass(), "parent", null);
        term635505 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term635505, term635505.getClass(), "number", 0.0);
        setIntField(term635505, term635505.getClass(), "type", 0);
        setField(term635505, term635505.getClass(), "next", null);
        setField(term635505, term635505.getClass(), "first", null);
        setField(term635505, term635505.getClass(), "last", null);
        setField(term635505, term635505.getClass(), "propListHead", null);
        setIntField(term635505, term635505.getClass(), "sourcePosition", 0);
        setField(term635505, term635505.getClass(), "jsType", null);
        setField(term635505, term635505.getClass(), "parent", null);
        term635506 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term635506, term635506.getClass(), "functionName", null);
        setBooleanField(term635506, term635506.getClass(), "itsNeedsActivation", false);
        setIntField(term635506, term635506.getClass(), "itsFunctionType", 0);
        setBooleanField(term635506, term635506.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term635506, term635506.getClass(), "encodedSourceStart", 0);
        setIntField(term635506, term635506.getClass(), "encodedSourceEnd", 0);
        setField(term635506, term635506.getClass(), "sourceName", null);
        setIntField(term635506, term635506.getClass(), "baseLineno", 0);
        setIntField(term635506, term635506.getClass(), "endLineno", 0);
        setField(term635506, term635506.getClass(), "functions", null);
        setField(term635506, term635506.getClass(), "regexps", null);
        setField(term635506, term635506.getClass(), "itsVariables", null);
        setField(term635506, term635506.getClass(), "itsConst", null);
        setField(term635506, term635506.getClass(), "itsVariableNames", null);
        setIntField(term635506, term635506.getClass(), "varStart", 0);
        setField(term635506, term635506.getClass(), "compilerData", null);
        setIntField(term635506, term635506.getClass(), "type", 0);
        setField(term635506, term635506.getClass(), "next", null);
        setField(term635506, term635506.getClass(), "first", null);
        setField(term635506, term635506.getClass(), "last", null);
        setField(term635506, term635506.getClass(), "propListHead", null);
        setIntField(term635506, term635506.getClass(), "sourcePosition", 0);
        setField(term635506, term635506.getClass(), "jsType", null);
        setField(term635506, term635506.getClass(), "parent", null);
        term635456 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term635456, term635456.getClass(), "str", null);
        setIntField(term635456, term635456.getClass(), "type", 0);
        setField(term635456, term635456.getClass(), "next", null);
        setField(term635456, term635456.getClass(), "first", null);
        setField(term635456, term635456.getClass(), "last", null);
        setField(term635456, term635456.getClass(), "propListHead", null);
        setIntField(term635456, term635456.getClass(), "sourcePosition", 0);
        setField(term635456, term635456.getClass(), "jsType", null);
        setField(term635456, term635456.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term634724;
        args[1] = term634816;
        args[2] = term634902;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term634632, args);
        assertTrue(recursiveEquals(term634632, term635503));
        assertTrue(recursiveEquals(term634724, term635504));
        assertTrue(recursiveEquals(term634816, term635505));
        assertTrue(recursiveEquals(term634902, term635506));
        assertTrue(recursiveEquals(retValue, term635456));
    }

};


