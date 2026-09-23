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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3519253;
     Object term3519345;
     Object term3521818;
     Object term3521819;
     Object term3521451;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3519253 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3519345 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519437 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519529 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519621 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3519745 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3519437, term3519437.getClass(), "type", 35);
        setIntField(term3519621, term3519621.getClass(), "type", 40);
        setField(term3519621, term3519621.getClass(), "str", "charCodeAt");
        setField(term3519529, term3519529.getClass(), "next", term3519621);
        setIntField(term3519529, term3519529.getClass(), "type", 40);
        setField(term3519437, term3519437.getClass(), "first", term3519529);
        setIntField(term3519745, term3519745.getClass(), "type", 41);
        setField(term3519437, term3519437.getClass(), "next", term3519745);
        setField(term3519345, term3519345.getClass(), "first", term3519437);
        setIntField(term3519345, term3519345.getClass(), "type", 37);
        term3521818 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3521818, term3521818.getClass(), "currentTraversal", null);
        term3521819 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3521820 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3521821 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3521822 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3521823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3521819, term3521819.getClass(), "str", null);
        setIntField(term3521819, term3521819.getClass(), "type", 37);
        setField(term3521819, term3521819.getClass(), "next", null);
        setField(term3521820, term3521820.getClass(), "str", null);
        setIntField(term3521820, term3521820.getClass(), "type", 35);
        setField(term3521821, term3521821.getClass(), "functionName", null);
        setBooleanField(term3521821, term3521821.getClass(), "itsNeedsActivation", false);
        setIntField(term3521821, term3521821.getClass(), "itsFunctionType", 0);
        setBooleanField(term3521821, term3521821.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3521821, term3521821.getClass(), "encodedSourceStart", 0);
        setIntField(term3521821, term3521821.getClass(), "encodedSourceEnd", 0);
        setField(term3521821, term3521821.getClass(), "sourceName", null);
        setIntField(term3521821, term3521821.getClass(), "baseLineno", 0);
        setIntField(term3521821, term3521821.getClass(), "endLineno", 0);
        setField(term3521821, term3521821.getClass(), "functions", null);
        setField(term3521821, term3521821.getClass(), "regexps", null);
        setField(term3521821, term3521821.getClass(), "itsVariables", null);
        setField(term3521821, term3521821.getClass(), "itsConst", null);
        setField(term3521821, term3521821.getClass(), "itsVariableNames", null);
        setIntField(term3521821, term3521821.getClass(), "varStart", 0);
        setField(term3521821, term3521821.getClass(), "compilerData", null);
        setIntField(term3521821, term3521821.getClass(), "type", 41);
        setField(term3521821, term3521821.getClass(), "next", null);
        setField(term3521821, term3521821.getClass(), "first", null);
        setField(term3521821, term3521821.getClass(), "last", null);
        setField(term3521821, term3521821.getClass(), "propListHead", null);
        setIntField(term3521821, term3521821.getClass(), "sourcePosition", 0);
        setField(term3521821, term3521821.getClass(), "jsType", null);
        setField(term3521821, term3521821.getClass(), "parent", null);
        setField(term3521820, term3521820.getClass(), "next", term3521821);
        setField(term3521822, term3521822.getClass(), "str", null);
        setIntField(term3521822, term3521822.getClass(), "type", 40);
        setField(term3521823, term3521823.getClass(), "str", "");
        setIntField(term3521823, term3521823.getClass(), "type", 40);
        setField(term3521823, term3521823.getClass(), "next", null);
        setField(term3521823, term3521823.getClass(), "first", null);
        setField(term3521823, term3521823.getClass(), "last", null);
        setField(term3521823, term3521823.getClass(), "propListHead", null);
        setIntField(term3521823, term3521823.getClass(), "sourcePosition", 0);
        setField(term3521823, term3521823.getClass(), "jsType", null);
        setField(term3521823, term3521823.getClass(), "parent", null);
        setField(term3521822, term3521822.getClass(), "next", term3521823);
        setField(term3521822, term3521822.getClass(), "first", null);
        setField(term3521822, term3521822.getClass(), "last", null);
        setField(term3521822, term3521822.getClass(), "propListHead", null);
        setIntField(term3521822, term3521822.getClass(), "sourcePosition", 0);
        setField(term3521822, term3521822.getClass(), "jsType", null);
        setField(term3521822, term3521822.getClass(), "parent", null);
        setField(term3521820, term3521820.getClass(), "first", term3521822);
        setField(term3521820, term3521820.getClass(), "last", null);
        setField(term3521820, term3521820.getClass(), "propListHead", null);
        setIntField(term3521820, term3521820.getClass(), "sourcePosition", 0);
        setField(term3521820, term3521820.getClass(), "jsType", null);
        setField(term3521820, term3521820.getClass(), "parent", null);
        setField(term3521819, term3521819.getClass(), "first", term3521820);
        setField(term3521819, term3521819.getClass(), "last", null);
        setField(term3521819, term3521819.getClass(), "propListHead", null);
        setIntField(term3521819, term3521819.getClass(), "sourcePosition", 0);
        setField(term3521819, term3521819.getClass(), "jsType", null);
        setField(term3521819, term3521819.getClass(), "parent", null);
        term3521451 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3521453 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3521455 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3521466 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3521468 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3521451, term3521451.getClass(), "str", null);
        setIntField(term3521451, term3521451.getClass(), "type", 37);
        setField(term3521451, term3521451.getClass(), "next", null);
        setField(term3521453, term3521453.getClass(), "str", null);
        setIntField(term3521453, term3521453.getClass(), "type", 35);
        setField(term3521455, term3521455.getClass(), "functionName", null);
        setBooleanField(term3521455, term3521455.getClass(), "itsNeedsActivation", false);
        setIntField(term3521455, term3521455.getClass(), "itsFunctionType", 0);
        setBooleanField(term3521455, term3521455.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3521455, term3521455.getClass(), "encodedSourceStart", 0);
        setIntField(term3521455, term3521455.getClass(), "encodedSourceEnd", 0);
        setField(term3521455, term3521455.getClass(), "sourceName", null);
        setIntField(term3521455, term3521455.getClass(), "baseLineno", 0);
        setIntField(term3521455, term3521455.getClass(), "endLineno", 0);
        setField(term3521455, term3521455.getClass(), "functions", null);
        setField(term3521455, term3521455.getClass(), "regexps", null);
        setField(term3521455, term3521455.getClass(), "itsVariables", null);
        setField(term3521455, term3521455.getClass(), "itsConst", null);
        setField(term3521455, term3521455.getClass(), "itsVariableNames", null);
        setIntField(term3521455, term3521455.getClass(), "varStart", 0);
        setField(term3521455, term3521455.getClass(), "compilerData", null);
        setIntField(term3521455, term3521455.getClass(), "type", 41);
        setField(term3521455, term3521455.getClass(), "next", null);
        setField(term3521455, term3521455.getClass(), "first", null);
        setField(term3521455, term3521455.getClass(), "last", null);
        setField(term3521455, term3521455.getClass(), "propListHead", null);
        setIntField(term3521455, term3521455.getClass(), "sourcePosition", 0);
        setField(term3521455, term3521455.getClass(), "jsType", null);
        setField(term3521455, term3521455.getClass(), "parent", null);
        setField(term3521453, term3521453.getClass(), "next", term3521455);
        setField(term3521466, term3521466.getClass(), "str", null);
        setIntField(term3521466, term3521466.getClass(), "type", 40);
        setField(term3521468, term3521468.getClass(), "str", "");
        setIntField(term3521468, term3521468.getClass(), "type", 40);
        setField(term3521468, term3521468.getClass(), "next", null);
        setField(term3521468, term3521468.getClass(), "first", null);
        setField(term3521468, term3521468.getClass(), "last", null);
        setField(term3521468, term3521468.getClass(), "propListHead", null);
        setIntField(term3521468, term3521468.getClass(), "sourcePosition", 0);
        setField(term3521468, term3521468.getClass(), "jsType", null);
        setField(term3521468, term3521468.getClass(), "parent", null);
        setField(term3521466, term3521466.getClass(), "next", term3521468);
        setField(term3521466, term3521466.getClass(), "first", null);
        setField(term3521466, term3521466.getClass(), "last", null);
        setField(term3521466, term3521466.getClass(), "propListHead", null);
        setIntField(term3521466, term3521466.getClass(), "sourcePosition", 0);
        setField(term3521466, term3521466.getClass(), "jsType", null);
        setField(term3521466, term3521466.getClass(), "parent", null);
        setField(term3521453, term3521453.getClass(), "first", term3521466);
        setField(term3521453, term3521453.getClass(), "last", null);
        setField(term3521453, term3521453.getClass(), "propListHead", null);
        setIntField(term3521453, term3521453.getClass(), "sourcePosition", 0);
        setField(term3521453, term3521453.getClass(), "jsType", null);
        setField(term3521453, term3521453.getClass(), "parent", null);
        setField(term3521451, term3521451.getClass(), "first", term3521453);
        setField(term3521451, term3521451.getClass(), "last", null);
        setField(term3521451, term3521451.getClass(), "propListHead", null);
        setIntField(term3521451, term3521451.getClass(), "sourcePosition", 0);
        setField(term3521451, term3521451.getClass(), "jsType", null);
        setField(term3521451, term3521451.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3519345;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term3519253, args);
        assertTrue(recursiveEquals(term3519253, term3521818));
        assertTrue(recursiveEquals(term3519345, term3521819));
        assertTrue(recursiveEquals(retValue, term3521451));
    }

};


