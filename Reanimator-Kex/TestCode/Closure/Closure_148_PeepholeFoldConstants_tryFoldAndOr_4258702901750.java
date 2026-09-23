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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454272;
     Object term454358;
     Object term454536;
     Object term454628;
     Object term454713;
     Object term454714;
     Object term454716;
     Object term454717;
     Object term454640;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454272 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term454358 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term454444 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term454358, term454358.getClass(), "parent", term454444);
        setIntField(term454358, term454358.getClass(), "type", 0);
        term454536 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term454536, term454536.getClass(), "type", 0);
        term454628 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term454628, term454628.getClass(), "type", 63);
        term454713 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term454713, term454713.getClass(), "currentTraversal", null);
        term454714 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term454715 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term454714, term454714.getClass(), "functionName", null);
        setBooleanField(term454714, term454714.getClass(), "itsNeedsActivation", false);
        setIntField(term454714, term454714.getClass(), "itsFunctionType", 0);
        setBooleanField(term454714, term454714.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term454714, term454714.getClass(), "encodedSourceStart", 0);
        setIntField(term454714, term454714.getClass(), "encodedSourceEnd", 0);
        setField(term454714, term454714.getClass(), "sourceName", null);
        setIntField(term454714, term454714.getClass(), "baseLineno", 0);
        setIntField(term454714, term454714.getClass(), "endLineno", 0);
        setField(term454714, term454714.getClass(), "functions", null);
        setField(term454714, term454714.getClass(), "regexps", null);
        setField(term454714, term454714.getClass(), "itsVariables", null);
        setField(term454714, term454714.getClass(), "itsConst", null);
        setField(term454714, term454714.getClass(), "itsVariableNames", null);
        setIntField(term454714, term454714.getClass(), "varStart", 0);
        setField(term454714, term454714.getClass(), "compilerData", null);
        setIntField(term454714, term454714.getClass(), "type", 0);
        setField(term454714, term454714.getClass(), "next", null);
        setField(term454714, term454714.getClass(), "first", null);
        setField(term454714, term454714.getClass(), "last", null);
        setField(term454714, term454714.getClass(), "propListHead", null);
        setIntField(term454714, term454714.getClass(), "sourcePosition", 0);
        setField(term454714, term454714.getClass(), "jsType", null);
        setField(term454715, term454715.getClass(), "functionName", null);
        setBooleanField(term454715, term454715.getClass(), "itsNeedsActivation", false);
        setIntField(term454715, term454715.getClass(), "itsFunctionType", 0);
        setBooleanField(term454715, term454715.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term454715, term454715.getClass(), "encodedSourceStart", 0);
        setIntField(term454715, term454715.getClass(), "encodedSourceEnd", 0);
        setField(term454715, term454715.getClass(), "sourceName", null);
        setIntField(term454715, term454715.getClass(), "baseLineno", 0);
        setIntField(term454715, term454715.getClass(), "endLineno", 0);
        setField(term454715, term454715.getClass(), "functions", null);
        setField(term454715, term454715.getClass(), "regexps", null);
        setField(term454715, term454715.getClass(), "itsVariables", null);
        setField(term454715, term454715.getClass(), "itsConst", null);
        setField(term454715, term454715.getClass(), "itsVariableNames", null);
        setIntField(term454715, term454715.getClass(), "varStart", 0);
        setField(term454715, term454715.getClass(), "compilerData", null);
        setIntField(term454715, term454715.getClass(), "type", 0);
        setField(term454715, term454715.getClass(), "next", null);
        setField(term454715, term454715.getClass(), "first", null);
        setField(term454715, term454715.getClass(), "last", null);
        setField(term454715, term454715.getClass(), "propListHead", null);
        setIntField(term454715, term454715.getClass(), "sourcePosition", 0);
        setField(term454715, term454715.getClass(), "jsType", null);
        setField(term454715, term454715.getClass(), "parent", null);
        setField(term454714, term454714.getClass(), "parent", term454715);
        term454716 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term454716, term454716.getClass(), "number", 0.0);
        setIntField(term454716, term454716.getClass(), "type", 0);
        setField(term454716, term454716.getClass(), "next", null);
        setField(term454716, term454716.getClass(), "first", null);
        setField(term454716, term454716.getClass(), "last", null);
        setField(term454716, term454716.getClass(), "propListHead", null);
        setIntField(term454716, term454716.getClass(), "sourcePosition", 0);
        setField(term454716, term454716.getClass(), "jsType", null);
        setField(term454716, term454716.getClass(), "parent", null);
        term454717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term454717, term454717.getClass(), "number", 0.0);
        setIntField(term454717, term454717.getClass(), "type", 63);
        setField(term454717, term454717.getClass(), "next", null);
        setField(term454717, term454717.getClass(), "first", null);
        setField(term454717, term454717.getClass(), "last", null);
        setField(term454717, term454717.getClass(), "propListHead", null);
        setIntField(term454717, term454717.getClass(), "sourcePosition", 0);
        setField(term454717, term454717.getClass(), "jsType", null);
        setField(term454717, term454717.getClass(), "parent", null);
        term454640 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term454651 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term454640, term454640.getClass(), "functionName", null);
        setBooleanField(term454640, term454640.getClass(), "itsNeedsActivation", false);
        setIntField(term454640, term454640.getClass(), "itsFunctionType", 0);
        setBooleanField(term454640, term454640.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term454640, term454640.getClass(), "encodedSourceStart", 0);
        setIntField(term454640, term454640.getClass(), "encodedSourceEnd", 0);
        setField(term454640, term454640.getClass(), "sourceName", null);
        setIntField(term454640, term454640.getClass(), "baseLineno", 0);
        setIntField(term454640, term454640.getClass(), "endLineno", 0);
        setField(term454640, term454640.getClass(), "functions", null);
        setField(term454640, term454640.getClass(), "regexps", null);
        setField(term454640, term454640.getClass(), "itsVariables", null);
        setField(term454640, term454640.getClass(), "itsConst", null);
        setField(term454640, term454640.getClass(), "itsVariableNames", null);
        setIntField(term454640, term454640.getClass(), "varStart", 0);
        setField(term454640, term454640.getClass(), "compilerData", null);
        setIntField(term454640, term454640.getClass(), "type", 0);
        setField(term454640, term454640.getClass(), "next", null);
        setField(term454640, term454640.getClass(), "first", null);
        setField(term454640, term454640.getClass(), "last", null);
        setField(term454640, term454640.getClass(), "propListHead", null);
        setIntField(term454640, term454640.getClass(), "sourcePosition", 0);
        setField(term454640, term454640.getClass(), "jsType", null);
        setField(term454651, term454651.getClass(), "functionName", null);
        setBooleanField(term454651, term454651.getClass(), "itsNeedsActivation", false);
        setIntField(term454651, term454651.getClass(), "itsFunctionType", 0);
        setBooleanField(term454651, term454651.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term454651, term454651.getClass(), "encodedSourceStart", 0);
        setIntField(term454651, term454651.getClass(), "encodedSourceEnd", 0);
        setField(term454651, term454651.getClass(), "sourceName", null);
        setIntField(term454651, term454651.getClass(), "baseLineno", 0);
        setIntField(term454651, term454651.getClass(), "endLineno", 0);
        setField(term454651, term454651.getClass(), "functions", null);
        setField(term454651, term454651.getClass(), "regexps", null);
        setField(term454651, term454651.getClass(), "itsVariables", null);
        setField(term454651, term454651.getClass(), "itsConst", null);
        setField(term454651, term454651.getClass(), "itsVariableNames", null);
        setIntField(term454651, term454651.getClass(), "varStart", 0);
        setField(term454651, term454651.getClass(), "compilerData", null);
        setIntField(term454651, term454651.getClass(), "type", 0);
        setField(term454651, term454651.getClass(), "next", null);
        setField(term454651, term454651.getClass(), "first", null);
        setField(term454651, term454651.getClass(), "last", null);
        setField(term454651, term454651.getClass(), "propListHead", null);
        setIntField(term454651, term454651.getClass(), "sourcePosition", 0);
        setField(term454651, term454651.getClass(), "jsType", null);
        setField(term454651, term454651.getClass(), "parent", null);
        setField(term454640, term454640.getClass(), "parent", term454651);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term454358;
        args[1] = term454536;
        args[2] = term454628;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term454272, args);
        assertTrue(recursiveEquals(term454272, term454713));
        assertTrue(recursiveEquals(term454358, term454714));
        assertTrue(recursiveEquals(term454536, term454716));
        assertTrue(recursiveEquals(term454628, term454717));
        assertTrue(recursiveEquals(retValue, term454640));
    }

};


