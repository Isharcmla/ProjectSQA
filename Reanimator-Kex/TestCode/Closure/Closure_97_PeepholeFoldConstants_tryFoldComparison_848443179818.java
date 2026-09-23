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

public class PeepholeFoldConstants_tryFoldComparison_848443179818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234638;
     Object term234730;
     Object term234822;
     Object term234908;
     Object term235292;
     Object term235293;
     Object term235294;
     Object term235295;
     Object term235261;

    public PeepholeFoldConstants_tryFoldComparison_848443179818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234638 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term234730 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term234730, term234730.getClass(), "type", 16);
        term234822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term234822, term234822.getClass(), "type", 42);
        term234908 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term234908, term234908.getClass(), "type", 16);
        term235292 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term235292, term235292.getClass(), "currentTraversal", null);
        term235293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235293, term235293.getClass(), "str", null);
        setIntField(term235293, term235293.getClass(), "type", 42);
        setField(term235293, term235293.getClass(), "next", null);
        setField(term235293, term235293.getClass(), "first", null);
        setField(term235293, term235293.getClass(), "last", null);
        setField(term235293, term235293.getClass(), "propListHead", null);
        setIntField(term235293, term235293.getClass(), "sourcePosition", 0);
        setField(term235293, term235293.getClass(), "jsType", null);
        setField(term235293, term235293.getClass(), "parent", null);
        term235294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235294, term235294.getClass(), "str", null);
        setIntField(term235294, term235294.getClass(), "type", 16);
        setField(term235294, term235294.getClass(), "next", null);
        setField(term235294, term235294.getClass(), "first", null);
        setField(term235294, term235294.getClass(), "last", null);
        setField(term235294, term235294.getClass(), "propListHead", null);
        setIntField(term235294, term235294.getClass(), "sourcePosition", 0);
        setField(term235294, term235294.getClass(), "jsType", null);
        setField(term235294, term235294.getClass(), "parent", null);
        term235295 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term235295, term235295.getClass(), "functionName", null);
        setBooleanField(term235295, term235295.getClass(), "itsNeedsActivation", false);
        setIntField(term235295, term235295.getClass(), "itsFunctionType", 0);
        setBooleanField(term235295, term235295.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term235295, term235295.getClass(), "encodedSourceStart", 0);
        setIntField(term235295, term235295.getClass(), "encodedSourceEnd", 0);
        setField(term235295, term235295.getClass(), "sourceName", null);
        setIntField(term235295, term235295.getClass(), "baseLineno", 0);
        setIntField(term235295, term235295.getClass(), "endLineno", 0);
        setField(term235295, term235295.getClass(), "functions", null);
        setField(term235295, term235295.getClass(), "regexps", null);
        setField(term235295, term235295.getClass(), "itsVariables", null);
        setField(term235295, term235295.getClass(), "itsConst", null);
        setField(term235295, term235295.getClass(), "itsVariableNames", null);
        setIntField(term235295, term235295.getClass(), "varStart", 0);
        setField(term235295, term235295.getClass(), "compilerData", null);
        setIntField(term235295, term235295.getClass(), "type", 16);
        setField(term235295, term235295.getClass(), "next", null);
        setField(term235295, term235295.getClass(), "first", null);
        setField(term235295, term235295.getClass(), "last", null);
        setField(term235295, term235295.getClass(), "propListHead", null);
        setIntField(term235295, term235295.getClass(), "sourcePosition", 0);
        setField(term235295, term235295.getClass(), "jsType", null);
        setField(term235295, term235295.getClass(), "parent", null);
        term235261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term235261, term235261.getClass(), "str", null);
        setIntField(term235261, term235261.getClass(), "type", 16);
        setField(term235261, term235261.getClass(), "next", null);
        setField(term235261, term235261.getClass(), "first", null);
        setField(term235261, term235261.getClass(), "last", null);
        setField(term235261, term235261.getClass(), "propListHead", null);
        setIntField(term235261, term235261.getClass(), "sourcePosition", 0);
        setField(term235261, term235261.getClass(), "jsType", null);
        setField(term235261, term235261.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term234730;
        args[1] = term234822;
        args[2] = term234908;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term234638, args);
        assertTrue(recursiveEquals(term234638, term235292));
        assertTrue(recursiveEquals(term234730, term235293));
        assertTrue(recursiveEquals(term234822, term235294));
        assertTrue(recursiveEquals(term234908, term235295));
        assertTrue(recursiveEquals(retValue, term235261));
    }

};


