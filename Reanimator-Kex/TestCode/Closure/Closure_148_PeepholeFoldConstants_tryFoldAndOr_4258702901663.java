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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426644;
     Object term426773;
     Object term427261;
     Object term427262;
     Object term427263;
     Object term427225;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426644 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term426773 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term426773, term426773.getClass(), "parent", null);
        setIntField(term426773, term426773.getClass(), "type", 44);
        term427261 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term427261, term427261.getClass(), "currentTraversal", null);
        term427262 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term427262, term427262.getClass(), "functionName", null);
        setBooleanField(term427262, term427262.getClass(), "itsNeedsActivation", false);
        setIntField(term427262, term427262.getClass(), "itsFunctionType", 0);
        setBooleanField(term427262, term427262.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427262, term427262.getClass(), "encodedSourceStart", 0);
        setIntField(term427262, term427262.getClass(), "encodedSourceEnd", 0);
        setField(term427262, term427262.getClass(), "sourceName", null);
        setIntField(term427262, term427262.getClass(), "baseLineno", 0);
        setIntField(term427262, term427262.getClass(), "endLineno", 0);
        setField(term427262, term427262.getClass(), "functions", null);
        setField(term427262, term427262.getClass(), "regexps", null);
        setField(term427262, term427262.getClass(), "itsVariables", null);
        setField(term427262, term427262.getClass(), "itsConst", null);
        setField(term427262, term427262.getClass(), "itsVariableNames", null);
        setIntField(term427262, term427262.getClass(), "varStart", 0);
        setField(term427262, term427262.getClass(), "compilerData", null);
        setIntField(term427262, term427262.getClass(), "type", 44);
        setField(term427262, term427262.getClass(), "next", null);
        setField(term427262, term427262.getClass(), "first", null);
        setField(term427262, term427262.getClass(), "last", null);
        setField(term427262, term427262.getClass(), "propListHead", null);
        setIntField(term427262, term427262.getClass(), "sourcePosition", 0);
        setField(term427262, term427262.getClass(), "jsType", null);
        setField(term427262, term427262.getClass(), "parent", null);
        term427263 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term427263, term427263.getClass(), "functionName", null);
        setBooleanField(term427263, term427263.getClass(), "itsNeedsActivation", false);
        setIntField(term427263, term427263.getClass(), "itsFunctionType", 0);
        setBooleanField(term427263, term427263.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427263, term427263.getClass(), "encodedSourceStart", 0);
        setIntField(term427263, term427263.getClass(), "encodedSourceEnd", 0);
        setField(term427263, term427263.getClass(), "sourceName", null);
        setIntField(term427263, term427263.getClass(), "baseLineno", 0);
        setIntField(term427263, term427263.getClass(), "endLineno", 0);
        setField(term427263, term427263.getClass(), "functions", null);
        setField(term427263, term427263.getClass(), "regexps", null);
        setField(term427263, term427263.getClass(), "itsVariables", null);
        setField(term427263, term427263.getClass(), "itsConst", null);
        setField(term427263, term427263.getClass(), "itsVariableNames", null);
        setIntField(term427263, term427263.getClass(), "varStart", 0);
        setField(term427263, term427263.getClass(), "compilerData", null);
        setIntField(term427263, term427263.getClass(), "type", 44);
        setField(term427263, term427263.getClass(), "next", null);
        setField(term427263, term427263.getClass(), "first", null);
        setField(term427263, term427263.getClass(), "last", null);
        setField(term427263, term427263.getClass(), "propListHead", null);
        setIntField(term427263, term427263.getClass(), "sourcePosition", 0);
        setField(term427263, term427263.getClass(), "jsType", null);
        setField(term427263, term427263.getClass(), "parent", null);
        term427225 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term427225, term427225.getClass(), "functionName", null);
        setBooleanField(term427225, term427225.getClass(), "itsNeedsActivation", false);
        setIntField(term427225, term427225.getClass(), "itsFunctionType", 0);
        setBooleanField(term427225, term427225.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term427225, term427225.getClass(), "encodedSourceStart", 0);
        setIntField(term427225, term427225.getClass(), "encodedSourceEnd", 0);
        setField(term427225, term427225.getClass(), "sourceName", null);
        setIntField(term427225, term427225.getClass(), "baseLineno", 0);
        setIntField(term427225, term427225.getClass(), "endLineno", 0);
        setField(term427225, term427225.getClass(), "functions", null);
        setField(term427225, term427225.getClass(), "regexps", null);
        setField(term427225, term427225.getClass(), "itsVariables", null);
        setField(term427225, term427225.getClass(), "itsConst", null);
        setField(term427225, term427225.getClass(), "itsVariableNames", null);
        setIntField(term427225, term427225.getClass(), "varStart", 0);
        setField(term427225, term427225.getClass(), "compilerData", null);
        setIntField(term427225, term427225.getClass(), "type", 44);
        setField(term427225, term427225.getClass(), "next", null);
        setField(term427225, term427225.getClass(), "first", null);
        setField(term427225, term427225.getClass(), "last", null);
        setField(term427225, term427225.getClass(), "propListHead", null);
        setIntField(term427225, term427225.getClass(), "sourcePosition", 0);
        setField(term427225, term427225.getClass(), "jsType", null);
        setField(term427225, term427225.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term426773;
        args[1] = term426773;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term426644, args);
        assertTrue(recursiveEquals(term426644, term427261));
        assertTrue(recursiveEquals(term426773, term427262));
        assertTrue(recursiveEquals(term426773, term427263));
        assertTrue(recursiveEquals(retValue, term427225));
    }

};


