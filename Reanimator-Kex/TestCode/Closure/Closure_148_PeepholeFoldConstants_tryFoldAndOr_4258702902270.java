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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624205;
     Object term624291;
     Object term624475;
     Object term624567;
     Object term624650;
     Object term624651;
     Object term624653;
     Object term624654;
     Object term624572;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624205 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term624291 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term624383 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term624383, term624383.getClass(), "type", 108);
        setField(term624291, term624291.getClass(), "parent", term624383);
        setIntField(term624291, term624291.getClass(), "type", 0);
        term624475 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term624475, term624475.getClass(), "type", 128);
        term624567 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term624567, term624567.getClass(), "type", 44);
        term624650 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term624650, term624650.getClass(), "currentTraversal", null);
        term624651 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term624652 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term624651, term624651.getClass(), "functionName", null);
        setBooleanField(term624651, term624651.getClass(), "itsNeedsActivation", false);
        setIntField(term624651, term624651.getClass(), "itsFunctionType", 0);
        setBooleanField(term624651, term624651.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term624651, term624651.getClass(), "encodedSourceStart", 0);
        setIntField(term624651, term624651.getClass(), "encodedSourceEnd", 0);
        setField(term624651, term624651.getClass(), "sourceName", null);
        setIntField(term624651, term624651.getClass(), "baseLineno", 0);
        setIntField(term624651, term624651.getClass(), "endLineno", 0);
        setField(term624651, term624651.getClass(), "functions", null);
        setField(term624651, term624651.getClass(), "regexps", null);
        setField(term624651, term624651.getClass(), "itsVariables", null);
        setField(term624651, term624651.getClass(), "itsConst", null);
        setField(term624651, term624651.getClass(), "itsVariableNames", null);
        setIntField(term624651, term624651.getClass(), "varStart", 0);
        setField(term624651, term624651.getClass(), "compilerData", null);
        setIntField(term624651, term624651.getClass(), "type", 0);
        setField(term624651, term624651.getClass(), "next", null);
        setField(term624651, term624651.getClass(), "first", null);
        setField(term624651, term624651.getClass(), "last", null);
        setField(term624651, term624651.getClass(), "propListHead", null);
        setIntField(term624651, term624651.getClass(), "sourcePosition", 0);
        setField(term624651, term624651.getClass(), "jsType", null);
        setDoubleField(term624652, term624652.getClass(), "number", 0.0);
        setIntField(term624652, term624652.getClass(), "type", 108);
        setField(term624652, term624652.getClass(), "next", null);
        setField(term624652, term624652.getClass(), "first", null);
        setField(term624652, term624652.getClass(), "last", null);
        setField(term624652, term624652.getClass(), "propListHead", null);
        setIntField(term624652, term624652.getClass(), "sourcePosition", 0);
        setField(term624652, term624652.getClass(), "jsType", null);
        setField(term624652, term624652.getClass(), "parent", null);
        setField(term624651, term624651.getClass(), "parent", term624652);
        term624653 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term624653, term624653.getClass(), "number", 0.0);
        setIntField(term624653, term624653.getClass(), "type", 128);
        setField(term624653, term624653.getClass(), "next", null);
        setField(term624653, term624653.getClass(), "first", null);
        setField(term624653, term624653.getClass(), "last", null);
        setField(term624653, term624653.getClass(), "propListHead", null);
        setIntField(term624653, term624653.getClass(), "sourcePosition", 0);
        setField(term624653, term624653.getClass(), "jsType", null);
        setField(term624653, term624653.getClass(), "parent", null);
        term624654 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term624654, term624654.getClass(), "str", null);
        setIntField(term624654, term624654.getClass(), "type", 44);
        setField(term624654, term624654.getClass(), "next", null);
        setField(term624654, term624654.getClass(), "first", null);
        setField(term624654, term624654.getClass(), "last", null);
        setField(term624654, term624654.getClass(), "propListHead", null);
        setIntField(term624654, term624654.getClass(), "sourcePosition", 0);
        setField(term624654, term624654.getClass(), "jsType", null);
        setField(term624654, term624654.getClass(), "parent", null);
        term624572 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term624583 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term624572, term624572.getClass(), "functionName", null);
        setBooleanField(term624572, term624572.getClass(), "itsNeedsActivation", false);
        setIntField(term624572, term624572.getClass(), "itsFunctionType", 0);
        setBooleanField(term624572, term624572.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term624572, term624572.getClass(), "encodedSourceStart", 0);
        setIntField(term624572, term624572.getClass(), "encodedSourceEnd", 0);
        setField(term624572, term624572.getClass(), "sourceName", null);
        setIntField(term624572, term624572.getClass(), "baseLineno", 0);
        setIntField(term624572, term624572.getClass(), "endLineno", 0);
        setField(term624572, term624572.getClass(), "functions", null);
        setField(term624572, term624572.getClass(), "regexps", null);
        setField(term624572, term624572.getClass(), "itsVariables", null);
        setField(term624572, term624572.getClass(), "itsConst", null);
        setField(term624572, term624572.getClass(), "itsVariableNames", null);
        setIntField(term624572, term624572.getClass(), "varStart", 0);
        setField(term624572, term624572.getClass(), "compilerData", null);
        setIntField(term624572, term624572.getClass(), "type", 0);
        setField(term624572, term624572.getClass(), "next", null);
        setField(term624572, term624572.getClass(), "first", null);
        setField(term624572, term624572.getClass(), "last", null);
        setField(term624572, term624572.getClass(), "propListHead", null);
        setIntField(term624572, term624572.getClass(), "sourcePosition", 0);
        setField(term624572, term624572.getClass(), "jsType", null);
        setDoubleField(term624583, term624583.getClass(), "number", 0.0);
        setIntField(term624583, term624583.getClass(), "type", 108);
        setField(term624583, term624583.getClass(), "next", null);
        setField(term624583, term624583.getClass(), "first", null);
        setField(term624583, term624583.getClass(), "last", null);
        setField(term624583, term624583.getClass(), "propListHead", null);
        setIntField(term624583, term624583.getClass(), "sourcePosition", 0);
        setField(term624583, term624583.getClass(), "jsType", null);
        setField(term624583, term624583.getClass(), "parent", null);
        setField(term624572, term624572.getClass(), "parent", term624583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term624291;
        args[1] = term624475;
        args[2] = term624567;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term624205, args);
        assertTrue(recursiveEquals(term624205, term624650));
        assertTrue(recursiveEquals(term624291, term624651));
        assertTrue(recursiveEquals(term624475, term624653));
        assertTrue(recursiveEquals(term624567, term624654));
        assertTrue(recursiveEquals(retValue, term624572));
    }

};


