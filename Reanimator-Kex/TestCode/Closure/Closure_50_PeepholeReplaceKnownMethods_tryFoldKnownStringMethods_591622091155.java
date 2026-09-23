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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40817;
     Object term40903;
     Object term41353;
     Object term41354;
     Object term41322;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40817 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term40903 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term40995 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term40903, term40903.getClass(), "type", 37);
        setField(term40903, term40903.getClass(), "first", term40995);
        term41353 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term41353, term41353.getClass(), "currentTraversal", null);
        term41354 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term41355 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term41354, term41354.getClass(), "functionName", null);
        setBooleanField(term41354, term41354.getClass(), "itsNeedsActivation", false);
        setIntField(term41354, term41354.getClass(), "itsFunctionType", 0);
        setBooleanField(term41354, term41354.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term41354, term41354.getClass(), "encodedSourceStart", 0);
        setIntField(term41354, term41354.getClass(), "encodedSourceEnd", 0);
        setField(term41354, term41354.getClass(), "sourceName", null);
        setIntField(term41354, term41354.getClass(), "baseLineno", 0);
        setIntField(term41354, term41354.getClass(), "endLineno", 0);
        setField(term41354, term41354.getClass(), "functions", null);
        setField(term41354, term41354.getClass(), "regexps", null);
        setField(term41354, term41354.getClass(), "itsVariables", null);
        setField(term41354, term41354.getClass(), "itsConst", null);
        setField(term41354, term41354.getClass(), "itsVariableNames", null);
        setIntField(term41354, term41354.getClass(), "varStart", 0);
        setField(term41354, term41354.getClass(), "compilerData", null);
        setIntField(term41354, term41354.getClass(), "type", 37);
        setField(term41354, term41354.getClass(), "next", null);
        setField(term41355, term41355.getClass(), "str", null);
        setIntField(term41355, term41355.getClass(), "type", 0);
        setField(term41355, term41355.getClass(), "next", null);
        setField(term41355, term41355.getClass(), "first", null);
        setField(term41355, term41355.getClass(), "last", null);
        setField(term41355, term41355.getClass(), "propListHead", null);
        setIntField(term41355, term41355.getClass(), "sourcePosition", 0);
        setField(term41355, term41355.getClass(), "jsType", null);
        setField(term41355, term41355.getClass(), "parent", null);
        setField(term41354, term41354.getClass(), "first", term41355);
        setField(term41354, term41354.getClass(), "last", null);
        setField(term41354, term41354.getClass(), "propListHead", null);
        setIntField(term41354, term41354.getClass(), "sourcePosition", 0);
        setField(term41354, term41354.getClass(), "jsType", null);
        setField(term41354, term41354.getClass(), "parent", null);
        term41322 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term41332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term41322, term41322.getClass(), "functionName", null);
        setBooleanField(term41322, term41322.getClass(), "itsNeedsActivation", false);
        setIntField(term41322, term41322.getClass(), "itsFunctionType", 0);
        setBooleanField(term41322, term41322.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term41322, term41322.getClass(), "encodedSourceStart", 0);
        setIntField(term41322, term41322.getClass(), "encodedSourceEnd", 0);
        setField(term41322, term41322.getClass(), "sourceName", null);
        setIntField(term41322, term41322.getClass(), "baseLineno", 0);
        setIntField(term41322, term41322.getClass(), "endLineno", 0);
        setField(term41322, term41322.getClass(), "functions", null);
        setField(term41322, term41322.getClass(), "regexps", null);
        setField(term41322, term41322.getClass(), "itsVariables", null);
        setField(term41322, term41322.getClass(), "itsConst", null);
        setField(term41322, term41322.getClass(), "itsVariableNames", null);
        setIntField(term41322, term41322.getClass(), "varStart", 0);
        setField(term41322, term41322.getClass(), "compilerData", null);
        setIntField(term41322, term41322.getClass(), "type", 37);
        setField(term41322, term41322.getClass(), "next", null);
        setField(term41332, term41332.getClass(), "str", null);
        setIntField(term41332, term41332.getClass(), "type", 0);
        setField(term41332, term41332.getClass(), "next", null);
        setField(term41332, term41332.getClass(), "first", null);
        setField(term41332, term41332.getClass(), "last", null);
        setField(term41332, term41332.getClass(), "propListHead", null);
        setIntField(term41332, term41332.getClass(), "sourcePosition", 0);
        setField(term41332, term41332.getClass(), "jsType", null);
        setField(term41332, term41332.getClass(), "parent", null);
        setField(term41322, term41322.getClass(), "first", term41332);
        setField(term41322, term41322.getClass(), "last", null);
        setField(term41322, term41322.getClass(), "propListHead", null);
        setIntField(term41322, term41322.getClass(), "sourcePosition", 0);
        setField(term41322, term41322.getClass(), "jsType", null);
        setField(term41322, term41322.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term40903;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term40817, args);
        assertTrue(recursiveEquals(term40817, term41353));
        assertTrue(recursiveEquals(term40903, term41354));
        assertTrue(recursiveEquals(retValue, term41322));
    }

};


