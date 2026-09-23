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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468128;
     Object term468214;
     Object term468398;
     Object term468490;
     Object term468648;
     Object term468649;
     Object term468651;
     Object term468652;
     Object term468570;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468128 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term468214 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term468306 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term468306, term468306.getClass(), "type", 108);
        setField(term468214, term468214.getClass(), "parent", term468306);
        setIntField(term468214, term468214.getClass(), "type", 0);
        term468398 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term468398, term468398.getClass(), "type", 114);
        term468490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term468490, term468490.getClass(), "type", 44);
        term468648 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term468648, term468648.getClass(), "currentTraversal", null);
        term468649 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term468650 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term468649, term468649.getClass(), "functionName", null);
        setBooleanField(term468649, term468649.getClass(), "itsNeedsActivation", false);
        setIntField(term468649, term468649.getClass(), "itsFunctionType", 0);
        setBooleanField(term468649, term468649.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term468649, term468649.getClass(), "encodedSourceStart", 0);
        setIntField(term468649, term468649.getClass(), "encodedSourceEnd", 0);
        setField(term468649, term468649.getClass(), "sourceName", null);
        setIntField(term468649, term468649.getClass(), "baseLineno", 0);
        setIntField(term468649, term468649.getClass(), "endLineno", 0);
        setField(term468649, term468649.getClass(), "functions", null);
        setField(term468649, term468649.getClass(), "regexps", null);
        setField(term468649, term468649.getClass(), "itsVariables", null);
        setField(term468649, term468649.getClass(), "itsConst", null);
        setField(term468649, term468649.getClass(), "itsVariableNames", null);
        setIntField(term468649, term468649.getClass(), "varStart", 0);
        setField(term468649, term468649.getClass(), "compilerData", null);
        setIntField(term468649, term468649.getClass(), "type", 0);
        setField(term468649, term468649.getClass(), "next", null);
        setField(term468649, term468649.getClass(), "first", null);
        setField(term468649, term468649.getClass(), "last", null);
        setField(term468649, term468649.getClass(), "propListHead", null);
        setIntField(term468649, term468649.getClass(), "sourcePosition", 0);
        setField(term468649, term468649.getClass(), "jsType", null);
        setDoubleField(term468650, term468650.getClass(), "number", 0.0);
        setIntField(term468650, term468650.getClass(), "type", 108);
        setField(term468650, term468650.getClass(), "next", null);
        setField(term468650, term468650.getClass(), "first", null);
        setField(term468650, term468650.getClass(), "last", null);
        setField(term468650, term468650.getClass(), "propListHead", null);
        setIntField(term468650, term468650.getClass(), "sourcePosition", 0);
        setField(term468650, term468650.getClass(), "jsType", null);
        setField(term468650, term468650.getClass(), "parent", null);
        setField(term468649, term468649.getClass(), "parent", term468650);
        term468651 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term468651, term468651.getClass(), "number", 0.0);
        setIntField(term468651, term468651.getClass(), "type", 114);
        setField(term468651, term468651.getClass(), "next", null);
        setField(term468651, term468651.getClass(), "first", null);
        setField(term468651, term468651.getClass(), "last", null);
        setField(term468651, term468651.getClass(), "propListHead", null);
        setIntField(term468651, term468651.getClass(), "sourcePosition", 0);
        setField(term468651, term468651.getClass(), "jsType", null);
        setField(term468651, term468651.getClass(), "parent", null);
        term468652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term468652, term468652.getClass(), "str", null);
        setIntField(term468652, term468652.getClass(), "type", 44);
        setField(term468652, term468652.getClass(), "next", null);
        setField(term468652, term468652.getClass(), "first", null);
        setField(term468652, term468652.getClass(), "last", null);
        setField(term468652, term468652.getClass(), "propListHead", null);
        setIntField(term468652, term468652.getClass(), "sourcePosition", 0);
        setField(term468652, term468652.getClass(), "jsType", null);
        setField(term468652, term468652.getClass(), "parent", null);
        term468570 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term468581 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term468570, term468570.getClass(), "functionName", null);
        setBooleanField(term468570, term468570.getClass(), "itsNeedsActivation", false);
        setIntField(term468570, term468570.getClass(), "itsFunctionType", 0);
        setBooleanField(term468570, term468570.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term468570, term468570.getClass(), "encodedSourceStart", 0);
        setIntField(term468570, term468570.getClass(), "encodedSourceEnd", 0);
        setField(term468570, term468570.getClass(), "sourceName", null);
        setIntField(term468570, term468570.getClass(), "baseLineno", 0);
        setIntField(term468570, term468570.getClass(), "endLineno", 0);
        setField(term468570, term468570.getClass(), "functions", null);
        setField(term468570, term468570.getClass(), "regexps", null);
        setField(term468570, term468570.getClass(), "itsVariables", null);
        setField(term468570, term468570.getClass(), "itsConst", null);
        setField(term468570, term468570.getClass(), "itsVariableNames", null);
        setIntField(term468570, term468570.getClass(), "varStart", 0);
        setField(term468570, term468570.getClass(), "compilerData", null);
        setIntField(term468570, term468570.getClass(), "type", 0);
        setField(term468570, term468570.getClass(), "next", null);
        setField(term468570, term468570.getClass(), "first", null);
        setField(term468570, term468570.getClass(), "last", null);
        setField(term468570, term468570.getClass(), "propListHead", null);
        setIntField(term468570, term468570.getClass(), "sourcePosition", 0);
        setField(term468570, term468570.getClass(), "jsType", null);
        setDoubleField(term468581, term468581.getClass(), "number", 0.0);
        setIntField(term468581, term468581.getClass(), "type", 108);
        setField(term468581, term468581.getClass(), "next", null);
        setField(term468581, term468581.getClass(), "first", null);
        setField(term468581, term468581.getClass(), "last", null);
        setField(term468581, term468581.getClass(), "propListHead", null);
        setIntField(term468581, term468581.getClass(), "sourcePosition", 0);
        setField(term468581, term468581.getClass(), "jsType", null);
        setField(term468581, term468581.getClass(), "parent", null);
        setField(term468570, term468570.getClass(), "parent", term468581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term468214;
        args[1] = term468398;
        args[2] = term468490;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term468128, args);
        assertTrue(recursiveEquals(term468128, term468648));
        assertTrue(recursiveEquals(term468214, term468649));
        assertTrue(recursiveEquals(term468398, term468651));
        assertTrue(recursiveEquals(term468490, term468652));
        assertTrue(recursiveEquals(retValue, term468570));
    }

};


