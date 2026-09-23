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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2655245;
     Object term2655331;
     Object term2655859;
     Object term2655860;
     Object term2655787;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2655245 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2655331 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2655423 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655515 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2655331, term2655331.getClass(), "type", 37);
        setIntField(term2655423, term2655423.getClass(), "type", 35);
        setField(term2655515, term2655515.getClass(), "next", term2655515);
        setIntField(term2655515, term2655515.getClass(), "type", 40);
        setField(term2655515, term2655515.getClass(), "str", null);
        setField(term2655423, term2655423.getClass(), "first", term2655515);
        setField(term2655423, term2655423.getClass(), "next", term2655585);
        setField(term2655331, term2655331.getClass(), "first", term2655423);
        term2655859 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term2655859, term2655859.getClass(), "currentTraversal", null);
        term2655860 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2655861 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655862 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2655863 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2655860, term2655860.getClass(), "functionName", null);
        setBooleanField(term2655860, term2655860.getClass(), "itsNeedsActivation", false);
        setIntField(term2655860, term2655860.getClass(), "itsFunctionType", 0);
        setBooleanField(term2655860, term2655860.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2655860, term2655860.getClass(), "encodedSourceStart", 0);
        setIntField(term2655860, term2655860.getClass(), "encodedSourceEnd", 0);
        setField(term2655860, term2655860.getClass(), "sourceName", null);
        setIntField(term2655860, term2655860.getClass(), "baseLineno", 0);
        setIntField(term2655860, term2655860.getClass(), "endLineno", 0);
        setField(term2655860, term2655860.getClass(), "functions", null);
        setField(term2655860, term2655860.getClass(), "regexps", null);
        setField(term2655860, term2655860.getClass(), "itsVariables", null);
        setField(term2655860, term2655860.getClass(), "itsConst", null);
        setField(term2655860, term2655860.getClass(), "itsVariableNames", null);
        setIntField(term2655860, term2655860.getClass(), "varStart", 0);
        setField(term2655860, term2655860.getClass(), "compilerData", null);
        setIntField(term2655860, term2655860.getClass(), "type", 37);
        setField(term2655860, term2655860.getClass(), "next", null);
        setField(term2655861, term2655861.getClass(), "str", null);
        setIntField(term2655861, term2655861.getClass(), "type", 35);
        setIntField(term2655862, term2655862.getClass(), "type", 0);
        setField(term2655862, term2655862.getClass(), "next", null);
        setField(term2655862, term2655862.getClass(), "first", null);
        setField(term2655862, term2655862.getClass(), "last", null);
        setField(term2655862, term2655862.getClass(), "propListHead", null);
        setIntField(term2655862, term2655862.getClass(), "sourcePosition", 0);
        setField(term2655862, term2655862.getClass(), "jsType", null);
        setField(term2655862, term2655862.getClass(), "parent", null);
        setField(term2655861, term2655861.getClass(), "next", term2655862);
        setField(term2655863, term2655863.getClass(), "str", null);
        setIntField(term2655863, term2655863.getClass(), "type", 40);
        setField(term2655863, term2655863.getClass(), "next", term2655863);
        setField(term2655863, term2655863.getClass(), "first", null);
        setField(term2655863, term2655863.getClass(), "last", null);
        setField(term2655863, term2655863.getClass(), "propListHead", null);
        setIntField(term2655863, term2655863.getClass(), "sourcePosition", 0);
        setField(term2655863, term2655863.getClass(), "jsType", null);
        setField(term2655863, term2655863.getClass(), "parent", null);
        setField(term2655861, term2655861.getClass(), "first", term2655863);
        setField(term2655861, term2655861.getClass(), "last", null);
        setField(term2655861, term2655861.getClass(), "propListHead", null);
        setIntField(term2655861, term2655861.getClass(), "sourcePosition", 0);
        setField(term2655861, term2655861.getClass(), "jsType", null);
        setField(term2655861, term2655861.getClass(), "parent", null);
        setField(term2655860, term2655860.getClass(), "first", term2655861);
        setField(term2655860, term2655860.getClass(), "last", null);
        setField(term2655860, term2655860.getClass(), "propListHead", null);
        setIntField(term2655860, term2655860.getClass(), "sourcePosition", 0);
        setField(term2655860, term2655860.getClass(), "jsType", null);
        setField(term2655860, term2655860.getClass(), "parent", null);
        term2655787 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2655797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2655799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2655802 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term2655787, term2655787.getClass(), "functionName", null);
        setBooleanField(term2655787, term2655787.getClass(), "itsNeedsActivation", false);
        setIntField(term2655787, term2655787.getClass(), "itsFunctionType", 0);
        setBooleanField(term2655787, term2655787.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term2655787, term2655787.getClass(), "encodedSourceStart", 0);
        setIntField(term2655787, term2655787.getClass(), "encodedSourceEnd", 0);
        setField(term2655787, term2655787.getClass(), "sourceName", null);
        setIntField(term2655787, term2655787.getClass(), "baseLineno", 0);
        setIntField(term2655787, term2655787.getClass(), "endLineno", 0);
        setField(term2655787, term2655787.getClass(), "functions", null);
        setField(term2655787, term2655787.getClass(), "regexps", null);
        setField(term2655787, term2655787.getClass(), "itsVariables", null);
        setField(term2655787, term2655787.getClass(), "itsConst", null);
        setField(term2655787, term2655787.getClass(), "itsVariableNames", null);
        setIntField(term2655787, term2655787.getClass(), "varStart", 0);
        setField(term2655787, term2655787.getClass(), "compilerData", null);
        setIntField(term2655787, term2655787.getClass(), "type", 37);
        setField(term2655787, term2655787.getClass(), "next", null);
        setField(term2655797, term2655797.getClass(), "str", null);
        setIntField(term2655797, term2655797.getClass(), "type", 35);
        setIntField(term2655799, term2655799.getClass(), "type", 0);
        setField(term2655799, term2655799.getClass(), "next", null);
        setField(term2655799, term2655799.getClass(), "first", null);
        setField(term2655799, term2655799.getClass(), "last", null);
        setField(term2655799, term2655799.getClass(), "propListHead", null);
        setIntField(term2655799, term2655799.getClass(), "sourcePosition", 0);
        setField(term2655799, term2655799.getClass(), "jsType", null);
        setField(term2655799, term2655799.getClass(), "parent", null);
        setField(term2655797, term2655797.getClass(), "next", term2655799);
        setField(term2655802, term2655802.getClass(), "str", null);
        setIntField(term2655802, term2655802.getClass(), "type", 40);
        setField(term2655802, term2655802.getClass(), "next", term2655802);
        setField(term2655802, term2655802.getClass(), "first", null);
        setField(term2655802, term2655802.getClass(), "last", null);
        setField(term2655802, term2655802.getClass(), "propListHead", null);
        setIntField(term2655802, term2655802.getClass(), "sourcePosition", 0);
        setField(term2655802, term2655802.getClass(), "jsType", null);
        setField(term2655802, term2655802.getClass(), "parent", null);
        setField(term2655797, term2655797.getClass(), "first", term2655802);
        setField(term2655797, term2655797.getClass(), "last", null);
        setField(term2655797, term2655797.getClass(), "propListHead", null);
        setIntField(term2655797, term2655797.getClass(), "sourcePosition", 0);
        setField(term2655797, term2655797.getClass(), "jsType", null);
        setField(term2655797, term2655797.getClass(), "parent", null);
        setField(term2655787, term2655787.getClass(), "first", term2655797);
        setField(term2655787, term2655787.getClass(), "last", null);
        setField(term2655787, term2655787.getClass(), "propListHead", null);
        setIntField(term2655787, term2655787.getClass(), "sourcePosition", 0);
        setField(term2655787, term2655787.getClass(), "jsType", null);
        setField(term2655787, term2655787.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2655331;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2655245, args);
        assertTrue(recursiveEquals(term2655245, term2655859));
        assertTrue(recursiveEquals(term2655331, term2655860));
        assertTrue(recursiveEquals(retValue, term2655787));
    }

};


