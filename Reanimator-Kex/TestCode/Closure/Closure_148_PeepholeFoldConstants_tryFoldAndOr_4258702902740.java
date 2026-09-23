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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term788263;
     Object term788355;
     Object term788533;
     Object term788625;
     Object term788716;
     Object term788717;
     Object term788719;
     Object term788720;
     Object term788636;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term788263 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term788355 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term788447 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term788447, term788447.getClass(), "type", 113);
        setField(term788355, term788355.getClass(), "parent", term788447);
        setIntField(term788355, term788355.getClass(), "type", 0);
        term788533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term788533, term788533.getClass(), "type", 68);
        term788625 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term788625, term788625.getClass(), "type", 47);
        term788716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term788716, term788716.getClass(), "currentTraversal", null);
        term788717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term788718 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term788717, term788717.getClass(), "number", 0.0);
        setIntField(term788717, term788717.getClass(), "type", 0);
        setField(term788717, term788717.getClass(), "next", null);
        setField(term788717, term788717.getClass(), "first", null);
        setField(term788717, term788717.getClass(), "last", null);
        setField(term788717, term788717.getClass(), "propListHead", null);
        setIntField(term788717, term788717.getClass(), "sourcePosition", 0);
        setField(term788717, term788717.getClass(), "jsType", null);
        setDoubleField(term788718, term788718.getClass(), "number", 0.0);
        setIntField(term788718, term788718.getClass(), "type", 113);
        setField(term788718, term788718.getClass(), "next", null);
        setField(term788718, term788718.getClass(), "first", null);
        setField(term788718, term788718.getClass(), "last", null);
        setField(term788718, term788718.getClass(), "propListHead", null);
        setIntField(term788718, term788718.getClass(), "sourcePosition", 0);
        setField(term788718, term788718.getClass(), "jsType", null);
        setField(term788718, term788718.getClass(), "parent", null);
        setField(term788717, term788717.getClass(), "parent", term788718);
        term788719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term788719, term788719.getClass(), "functionName", null);
        setBooleanField(term788719, term788719.getClass(), "itsNeedsActivation", false);
        setIntField(term788719, term788719.getClass(), "itsFunctionType", 0);
        setBooleanField(term788719, term788719.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term788719, term788719.getClass(), "encodedSourceStart", 0);
        setIntField(term788719, term788719.getClass(), "encodedSourceEnd", 0);
        setField(term788719, term788719.getClass(), "sourceName", null);
        setIntField(term788719, term788719.getClass(), "baseLineno", 0);
        setIntField(term788719, term788719.getClass(), "endLineno", 0);
        setField(term788719, term788719.getClass(), "functions", null);
        setField(term788719, term788719.getClass(), "regexps", null);
        setField(term788719, term788719.getClass(), "itsVariables", null);
        setField(term788719, term788719.getClass(), "itsConst", null);
        setField(term788719, term788719.getClass(), "itsVariableNames", null);
        setIntField(term788719, term788719.getClass(), "varStart", 0);
        setField(term788719, term788719.getClass(), "compilerData", null);
        setIntField(term788719, term788719.getClass(), "type", 68);
        setField(term788719, term788719.getClass(), "next", null);
        setField(term788719, term788719.getClass(), "first", null);
        setField(term788719, term788719.getClass(), "last", null);
        setField(term788719, term788719.getClass(), "propListHead", null);
        setIntField(term788719, term788719.getClass(), "sourcePosition", 0);
        setField(term788719, term788719.getClass(), "jsType", null);
        setField(term788719, term788719.getClass(), "parent", null);
        term788720 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term788720, term788720.getClass(), "number", 0.0);
        setIntField(term788720, term788720.getClass(), "type", 47);
        setField(term788720, term788720.getClass(), "next", null);
        setField(term788720, term788720.getClass(), "first", null);
        setField(term788720, term788720.getClass(), "last", null);
        setField(term788720, term788720.getClass(), "propListHead", null);
        setIntField(term788720, term788720.getClass(), "sourcePosition", 0);
        setField(term788720, term788720.getClass(), "jsType", null);
        setField(term788720, term788720.getClass(), "parent", null);
        term788636 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term788640 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term788636, term788636.getClass(), "number", 0.0);
        setIntField(term788636, term788636.getClass(), "type", 0);
        setField(term788636, term788636.getClass(), "next", null);
        setField(term788636, term788636.getClass(), "first", null);
        setField(term788636, term788636.getClass(), "last", null);
        setField(term788636, term788636.getClass(), "propListHead", null);
        setIntField(term788636, term788636.getClass(), "sourcePosition", 0);
        setField(term788636, term788636.getClass(), "jsType", null);
        setDoubleField(term788640, term788640.getClass(), "number", 0.0);
        setIntField(term788640, term788640.getClass(), "type", 113);
        setField(term788640, term788640.getClass(), "next", null);
        setField(term788640, term788640.getClass(), "first", null);
        setField(term788640, term788640.getClass(), "last", null);
        setField(term788640, term788640.getClass(), "propListHead", null);
        setIntField(term788640, term788640.getClass(), "sourcePosition", 0);
        setField(term788640, term788640.getClass(), "jsType", null);
        setField(term788640, term788640.getClass(), "parent", null);
        setField(term788636, term788636.getClass(), "parent", term788640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term788355;
        args[1] = term788533;
        args[2] = term788625;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term788263, args);
        assertTrue(recursiveEquals(term788263, term788716));
        assertTrue(recursiveEquals(term788355, term788717));
        assertTrue(recursiveEquals(term788533, term788719));
        assertTrue(recursiveEquals(term788625, term788720));
        assertTrue(recursiveEquals(retValue, term788636));
    }

};


