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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3219716;
     Object term3219802;
     Object term3220718;
     Object term3220719;
     Object term3220660;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3219716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3219802 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3219894 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3219986 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3219802, term3219802.getClass(), "type", 37);
        setIntField(term3219894, term3219894.getClass(), "type", 33);
        setField(term3219986, term3219986.getClass(), "next", term3220056);
        setIntField(term3219986, term3219986.getClass(), "type", 0);
        setField(term3219894, term3219894.getClass(), "first", term3219986);
        setField(term3219802, term3219802.getClass(), "first", term3219894);
        term3220718 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3220718, term3220718.getClass(), "currentTraversal", null);
        term3220719 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3220720 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220721 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3220719, term3220719.getClass(), "functionName", null);
        setBooleanField(term3220719, term3220719.getClass(), "itsNeedsActivation", false);
        setIntField(term3220719, term3220719.getClass(), "itsFunctionType", 0);
        setBooleanField(term3220719, term3220719.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3220719, term3220719.getClass(), "encodedSourceStart", 0);
        setIntField(term3220719, term3220719.getClass(), "encodedSourceEnd", 0);
        setField(term3220719, term3220719.getClass(), "sourceName", null);
        setIntField(term3220719, term3220719.getClass(), "baseLineno", 0);
        setIntField(term3220719, term3220719.getClass(), "endLineno", 0);
        setField(term3220719, term3220719.getClass(), "functions", null);
        setField(term3220719, term3220719.getClass(), "regexps", null);
        setField(term3220719, term3220719.getClass(), "itsVariables", null);
        setField(term3220719, term3220719.getClass(), "itsConst", null);
        setField(term3220719, term3220719.getClass(), "itsVariableNames", null);
        setIntField(term3220719, term3220719.getClass(), "varStart", 0);
        setField(term3220719, term3220719.getClass(), "compilerData", null);
        setIntField(term3220719, term3220719.getClass(), "type", 37);
        setField(term3220719, term3220719.getClass(), "next", null);
        setField(term3220720, term3220720.getClass(), "str", null);
        setIntField(term3220720, term3220720.getClass(), "type", 33);
        setField(term3220720, term3220720.getClass(), "next", null);
        setField(term3220721, term3220721.getClass(), "str", null);
        setIntField(term3220721, term3220721.getClass(), "type", 0);
        setIntField(term3220722, term3220722.getClass(), "type", 0);
        setField(term3220722, term3220722.getClass(), "next", null);
        setField(term3220722, term3220722.getClass(), "first", null);
        setField(term3220722, term3220722.getClass(), "last", null);
        setField(term3220722, term3220722.getClass(), "propListHead", null);
        setIntField(term3220722, term3220722.getClass(), "sourcePosition", 0);
        setField(term3220722, term3220722.getClass(), "jsType", null);
        setField(term3220722, term3220722.getClass(), "parent", null);
        setField(term3220721, term3220721.getClass(), "next", term3220722);
        setField(term3220721, term3220721.getClass(), "first", null);
        setField(term3220721, term3220721.getClass(), "last", null);
        setField(term3220721, term3220721.getClass(), "propListHead", null);
        setIntField(term3220721, term3220721.getClass(), "sourcePosition", 0);
        setField(term3220721, term3220721.getClass(), "jsType", null);
        setField(term3220721, term3220721.getClass(), "parent", null);
        setField(term3220720, term3220720.getClass(), "first", term3220721);
        setField(term3220720, term3220720.getClass(), "last", null);
        setField(term3220720, term3220720.getClass(), "propListHead", null);
        setIntField(term3220720, term3220720.getClass(), "sourcePosition", 0);
        setField(term3220720, term3220720.getClass(), "jsType", null);
        setField(term3220720, term3220720.getClass(), "parent", null);
        setField(term3220719, term3220719.getClass(), "first", term3220720);
        setField(term3220719, term3220719.getClass(), "last", null);
        setField(term3220719, term3220719.getClass(), "propListHead", null);
        setIntField(term3220719, term3220719.getClass(), "sourcePosition", 0);
        setField(term3220719, term3220719.getClass(), "jsType", null);
        setField(term3220719, term3220719.getClass(), "parent", null);
        term3220660 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3220670 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220672 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3220674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3220660, term3220660.getClass(), "functionName", null);
        setBooleanField(term3220660, term3220660.getClass(), "itsNeedsActivation", false);
        setIntField(term3220660, term3220660.getClass(), "itsFunctionType", 0);
        setBooleanField(term3220660, term3220660.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3220660, term3220660.getClass(), "encodedSourceStart", 0);
        setIntField(term3220660, term3220660.getClass(), "encodedSourceEnd", 0);
        setField(term3220660, term3220660.getClass(), "sourceName", null);
        setIntField(term3220660, term3220660.getClass(), "baseLineno", 0);
        setIntField(term3220660, term3220660.getClass(), "endLineno", 0);
        setField(term3220660, term3220660.getClass(), "functions", null);
        setField(term3220660, term3220660.getClass(), "regexps", null);
        setField(term3220660, term3220660.getClass(), "itsVariables", null);
        setField(term3220660, term3220660.getClass(), "itsConst", null);
        setField(term3220660, term3220660.getClass(), "itsVariableNames", null);
        setIntField(term3220660, term3220660.getClass(), "varStart", 0);
        setField(term3220660, term3220660.getClass(), "compilerData", null);
        setIntField(term3220660, term3220660.getClass(), "type", 37);
        setField(term3220660, term3220660.getClass(), "next", null);
        setField(term3220670, term3220670.getClass(), "str", null);
        setIntField(term3220670, term3220670.getClass(), "type", 33);
        setField(term3220670, term3220670.getClass(), "next", null);
        setField(term3220672, term3220672.getClass(), "str", null);
        setIntField(term3220672, term3220672.getClass(), "type", 0);
        setIntField(term3220674, term3220674.getClass(), "type", 0);
        setField(term3220674, term3220674.getClass(), "next", null);
        setField(term3220674, term3220674.getClass(), "first", null);
        setField(term3220674, term3220674.getClass(), "last", null);
        setField(term3220674, term3220674.getClass(), "propListHead", null);
        setIntField(term3220674, term3220674.getClass(), "sourcePosition", 0);
        setField(term3220674, term3220674.getClass(), "jsType", null);
        setField(term3220674, term3220674.getClass(), "parent", null);
        setField(term3220672, term3220672.getClass(), "next", term3220674);
        setField(term3220672, term3220672.getClass(), "first", null);
        setField(term3220672, term3220672.getClass(), "last", null);
        setField(term3220672, term3220672.getClass(), "propListHead", null);
        setIntField(term3220672, term3220672.getClass(), "sourcePosition", 0);
        setField(term3220672, term3220672.getClass(), "jsType", null);
        setField(term3220672, term3220672.getClass(), "parent", null);
        setField(term3220670, term3220670.getClass(), "first", term3220672);
        setField(term3220670, term3220670.getClass(), "last", null);
        setField(term3220670, term3220670.getClass(), "propListHead", null);
        setIntField(term3220670, term3220670.getClass(), "sourcePosition", 0);
        setField(term3220670, term3220670.getClass(), "jsType", null);
        setField(term3220670, term3220670.getClass(), "parent", null);
        setField(term3220660, term3220660.getClass(), "first", term3220670);
        setField(term3220660, term3220660.getClass(), "last", null);
        setField(term3220660, term3220660.getClass(), "propListHead", null);
        setIntField(term3220660, term3220660.getClass(), "sourcePosition", 0);
        setField(term3220660, term3220660.getClass(), "jsType", null);
        setField(term3220660, term3220660.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3219802;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3219716, args);
        assertTrue(recursiveEquals(term3219716, term3220718));
        assertTrue(recursiveEquals(term3219802, term3220719));
        assertTrue(recursiveEquals(retValue, term3220660));
    }

};


