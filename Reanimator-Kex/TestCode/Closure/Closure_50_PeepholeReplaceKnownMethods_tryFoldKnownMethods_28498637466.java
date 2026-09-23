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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12783;
     Object term12869;
     Object term19428;
     Object term19429;
     Object term19391;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_28498637466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12783 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term12869 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term19428 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term19428, term19428.getClass(), "currentTraversal", null);
        term19429 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term19429, term19429.getClass(), "functionName", null);
        setBooleanField(term19429, term19429.getClass(), "itsNeedsActivation", false);
        setIntField(term19429, term19429.getClass(), "itsFunctionType", 0);
        setBooleanField(term19429, term19429.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term19429, term19429.getClass(), "encodedSourceStart", 0);
        setIntField(term19429, term19429.getClass(), "encodedSourceEnd", 0);
        setField(term19429, term19429.getClass(), "sourceName", null);
        setIntField(term19429, term19429.getClass(), "baseLineno", 0);
        setIntField(term19429, term19429.getClass(), "endLineno", 0);
        setField(term19429, term19429.getClass(), "functions", null);
        setField(term19429, term19429.getClass(), "regexps", null);
        setField(term19429, term19429.getClass(), "itsVariables", null);
        setField(term19429, term19429.getClass(), "itsConst", null);
        setField(term19429, term19429.getClass(), "itsVariableNames", null);
        setIntField(term19429, term19429.getClass(), "varStart", 0);
        setField(term19429, term19429.getClass(), "compilerData", null);
        setIntField(term19429, term19429.getClass(), "type", 0);
        setField(term19429, term19429.getClass(), "next", null);
        setField(term19429, term19429.getClass(), "first", null);
        setField(term19429, term19429.getClass(), "last", null);
        setField(term19429, term19429.getClass(), "propListHead", null);
        setIntField(term19429, term19429.getClass(), "sourcePosition", 0);
        setField(term19429, term19429.getClass(), "jsType", null);
        setField(term19429, term19429.getClass(), "parent", null);
        term19391 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term19391, term19391.getClass(), "functionName", null);
        setBooleanField(term19391, term19391.getClass(), "itsNeedsActivation", false);
        setIntField(term19391, term19391.getClass(), "itsFunctionType", 0);
        setBooleanField(term19391, term19391.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term19391, term19391.getClass(), "encodedSourceStart", 0);
        setIntField(term19391, term19391.getClass(), "encodedSourceEnd", 0);
        setField(term19391, term19391.getClass(), "sourceName", null);
        setIntField(term19391, term19391.getClass(), "baseLineno", 0);
        setIntField(term19391, term19391.getClass(), "endLineno", 0);
        setField(term19391, term19391.getClass(), "functions", null);
        setField(term19391, term19391.getClass(), "regexps", null);
        setField(term19391, term19391.getClass(), "itsVariables", null);
        setField(term19391, term19391.getClass(), "itsConst", null);
        setField(term19391, term19391.getClass(), "itsVariableNames", null);
        setIntField(term19391, term19391.getClass(), "varStart", 0);
        setField(term19391, term19391.getClass(), "compilerData", null);
        setIntField(term19391, term19391.getClass(), "type", 0);
        setField(term19391, term19391.getClass(), "next", null);
        setField(term19391, term19391.getClass(), "first", null);
        setField(term19391, term19391.getClass(), "last", null);
        setField(term19391, term19391.getClass(), "propListHead", null);
        setIntField(term19391, term19391.getClass(), "sourcePosition", 0);
        setField(term19391, term19391.getClass(), "jsType", null);
        setField(term19391, term19391.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12869;
        Object retValue = callMethod(klass, "tryFoldKnownMethods", argTypes, term12783, args);
        assertTrue(recursiveEquals(term12783, term19428));
        assertTrue(recursiveEquals(term12869, term19429));
        assertTrue(recursiveEquals(retValue, term19391));
    }

};


