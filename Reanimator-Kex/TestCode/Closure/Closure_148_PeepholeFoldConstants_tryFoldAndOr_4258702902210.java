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

public class PeepholeFoldConstants_tryFoldAndOr_4258702902210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605142;
     Object term605228;
     Object term605384;
     Object term605470;
     Object term605622;
     Object term605623;
     Object term605625;
     Object term605626;
     Object term605531;

    public PeepholeFoldConstants_tryFoldAndOr_4258702902210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605142 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term605228 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term605298 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term605298, term605298.getClass(), "type", 108);
        setField(term605228, term605228.getClass(), "parent", term605298);
        setIntField(term605228, term605228.getClass(), "type", 0);
        term605384 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term605384, term605384.getClass(), "type", 112);
        term605470 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term605470, term605470.getClass(), "type", 63);
        term605622 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term605622, term605622.getClass(), "currentTraversal", null);
        term605623 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term605624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term605623, term605623.getClass(), "functionName", null);
        setBooleanField(term605623, term605623.getClass(), "itsNeedsActivation", false);
        setIntField(term605623, term605623.getClass(), "itsFunctionType", 0);
        setBooleanField(term605623, term605623.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term605623, term605623.getClass(), "encodedSourceStart", 0);
        setIntField(term605623, term605623.getClass(), "encodedSourceEnd", 0);
        setField(term605623, term605623.getClass(), "sourceName", null);
        setIntField(term605623, term605623.getClass(), "baseLineno", 0);
        setIntField(term605623, term605623.getClass(), "endLineno", 0);
        setField(term605623, term605623.getClass(), "functions", null);
        setField(term605623, term605623.getClass(), "regexps", null);
        setField(term605623, term605623.getClass(), "itsVariables", null);
        setField(term605623, term605623.getClass(), "itsConst", null);
        setField(term605623, term605623.getClass(), "itsVariableNames", null);
        setIntField(term605623, term605623.getClass(), "varStart", 0);
        setField(term605623, term605623.getClass(), "compilerData", null);
        setIntField(term605623, term605623.getClass(), "type", 0);
        setField(term605623, term605623.getClass(), "next", null);
        setField(term605623, term605623.getClass(), "first", null);
        setField(term605623, term605623.getClass(), "last", null);
        setField(term605623, term605623.getClass(), "propListHead", null);
        setIntField(term605623, term605623.getClass(), "sourcePosition", 0);
        setField(term605623, term605623.getClass(), "jsType", null);
        setIntField(term605624, term605624.getClass(), "type", 108);
        setField(term605624, term605624.getClass(), "next", null);
        setField(term605624, term605624.getClass(), "first", null);
        setField(term605624, term605624.getClass(), "last", null);
        setField(term605624, term605624.getClass(), "propListHead", null);
        setIntField(term605624, term605624.getClass(), "sourcePosition", 0);
        setField(term605624, term605624.getClass(), "jsType", null);
        setField(term605624, term605624.getClass(), "parent", null);
        setField(term605623, term605623.getClass(), "parent", term605624);
        term605625 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term605625, term605625.getClass(), "functionName", null);
        setBooleanField(term605625, term605625.getClass(), "itsNeedsActivation", false);
        setIntField(term605625, term605625.getClass(), "itsFunctionType", 0);
        setBooleanField(term605625, term605625.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term605625, term605625.getClass(), "encodedSourceStart", 0);
        setIntField(term605625, term605625.getClass(), "encodedSourceEnd", 0);
        setField(term605625, term605625.getClass(), "sourceName", null);
        setIntField(term605625, term605625.getClass(), "baseLineno", 0);
        setIntField(term605625, term605625.getClass(), "endLineno", 0);
        setField(term605625, term605625.getClass(), "functions", null);
        setField(term605625, term605625.getClass(), "regexps", null);
        setField(term605625, term605625.getClass(), "itsVariables", null);
        setField(term605625, term605625.getClass(), "itsConst", null);
        setField(term605625, term605625.getClass(), "itsVariableNames", null);
        setIntField(term605625, term605625.getClass(), "varStart", 0);
        setField(term605625, term605625.getClass(), "compilerData", null);
        setIntField(term605625, term605625.getClass(), "type", 112);
        setField(term605625, term605625.getClass(), "next", null);
        setField(term605625, term605625.getClass(), "first", null);
        setField(term605625, term605625.getClass(), "last", null);
        setField(term605625, term605625.getClass(), "propListHead", null);
        setIntField(term605625, term605625.getClass(), "sourcePosition", 0);
        setField(term605625, term605625.getClass(), "jsType", null);
        setField(term605625, term605625.getClass(), "parent", null);
        term605626 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term605626, term605626.getClass(), "functionName", null);
        setBooleanField(term605626, term605626.getClass(), "itsNeedsActivation", false);
        setIntField(term605626, term605626.getClass(), "itsFunctionType", 0);
        setBooleanField(term605626, term605626.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term605626, term605626.getClass(), "encodedSourceStart", 0);
        setIntField(term605626, term605626.getClass(), "encodedSourceEnd", 0);
        setField(term605626, term605626.getClass(), "sourceName", null);
        setIntField(term605626, term605626.getClass(), "baseLineno", 0);
        setIntField(term605626, term605626.getClass(), "endLineno", 0);
        setField(term605626, term605626.getClass(), "functions", null);
        setField(term605626, term605626.getClass(), "regexps", null);
        setField(term605626, term605626.getClass(), "itsVariables", null);
        setField(term605626, term605626.getClass(), "itsConst", null);
        setField(term605626, term605626.getClass(), "itsVariableNames", null);
        setIntField(term605626, term605626.getClass(), "varStart", 0);
        setField(term605626, term605626.getClass(), "compilerData", null);
        setIntField(term605626, term605626.getClass(), "type", 63);
        setField(term605626, term605626.getClass(), "next", null);
        setField(term605626, term605626.getClass(), "first", null);
        setField(term605626, term605626.getClass(), "last", null);
        setField(term605626, term605626.getClass(), "propListHead", null);
        setIntField(term605626, term605626.getClass(), "sourcePosition", 0);
        setField(term605626, term605626.getClass(), "jsType", null);
        setField(term605626, term605626.getClass(), "parent", null);
        term605531 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term605542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term605531, term605531.getClass(), "functionName", null);
        setBooleanField(term605531, term605531.getClass(), "itsNeedsActivation", false);
        setIntField(term605531, term605531.getClass(), "itsFunctionType", 0);
        setBooleanField(term605531, term605531.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term605531, term605531.getClass(), "encodedSourceStart", 0);
        setIntField(term605531, term605531.getClass(), "encodedSourceEnd", 0);
        setField(term605531, term605531.getClass(), "sourceName", null);
        setIntField(term605531, term605531.getClass(), "baseLineno", 0);
        setIntField(term605531, term605531.getClass(), "endLineno", 0);
        setField(term605531, term605531.getClass(), "functions", null);
        setField(term605531, term605531.getClass(), "regexps", null);
        setField(term605531, term605531.getClass(), "itsVariables", null);
        setField(term605531, term605531.getClass(), "itsConst", null);
        setField(term605531, term605531.getClass(), "itsVariableNames", null);
        setIntField(term605531, term605531.getClass(), "varStart", 0);
        setField(term605531, term605531.getClass(), "compilerData", null);
        setIntField(term605531, term605531.getClass(), "type", 0);
        setField(term605531, term605531.getClass(), "next", null);
        setField(term605531, term605531.getClass(), "first", null);
        setField(term605531, term605531.getClass(), "last", null);
        setField(term605531, term605531.getClass(), "propListHead", null);
        setIntField(term605531, term605531.getClass(), "sourcePosition", 0);
        setField(term605531, term605531.getClass(), "jsType", null);
        setIntField(term605542, term605542.getClass(), "type", 108);
        setField(term605542, term605542.getClass(), "next", null);
        setField(term605542, term605542.getClass(), "first", null);
        setField(term605542, term605542.getClass(), "last", null);
        setField(term605542, term605542.getClass(), "propListHead", null);
        setIntField(term605542, term605542.getClass(), "sourcePosition", 0);
        setField(term605542, term605542.getClass(), "jsType", null);
        setField(term605542, term605542.getClass(), "parent", null);
        setField(term605531, term605531.getClass(), "parent", term605542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term605228;
        args[1] = term605384;
        args[2] = term605470;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term605142, args);
        assertTrue(recursiveEquals(term605142, term605622));
        assertTrue(recursiveEquals(term605228, term605623));
        assertTrue(recursiveEquals(term605384, term605625));
        assertTrue(recursiveEquals(term605470, term605626));
        assertTrue(recursiveEquals(retValue, term605531));
    }

};


