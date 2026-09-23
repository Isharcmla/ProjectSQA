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

public class PeepholeFoldConstants_tryFoldAndOr_425870290157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28155;
     Object term28247;
     Object term28339;
     Object term28425;
     Object term28903;
     Object term28904;
     Object term28905;
     Object term28906;
     Object term28855;

    public PeepholeFoldConstants_tryFoldAndOr_425870290157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28155 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term28247 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term28247, term28247.getClass(), "parent", null);
        setIntField(term28247, term28247.getClass(), "type", 0);
        term28339 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term28339, term28339.getClass(), "type", 0);
        term28425 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term28903 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term28903, term28903.getClass(), "currentTraversal", null);
        term28904 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28904, term28904.getClass(), "number", 0.0);
        setIntField(term28904, term28904.getClass(), "type", 0);
        setField(term28904, term28904.getClass(), "next", null);
        setField(term28904, term28904.getClass(), "first", null);
        setField(term28904, term28904.getClass(), "last", null);
        setField(term28904, term28904.getClass(), "propListHead", null);
        setIntField(term28904, term28904.getClass(), "sourcePosition", 0);
        setField(term28904, term28904.getClass(), "jsType", null);
        setField(term28904, term28904.getClass(), "parent", null);
        term28905 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28905, term28905.getClass(), "number", 0.0);
        setIntField(term28905, term28905.getClass(), "type", 0);
        setField(term28905, term28905.getClass(), "next", null);
        setField(term28905, term28905.getClass(), "first", null);
        setField(term28905, term28905.getClass(), "last", null);
        setField(term28905, term28905.getClass(), "propListHead", null);
        setIntField(term28905, term28905.getClass(), "sourcePosition", 0);
        setField(term28905, term28905.getClass(), "jsType", null);
        setField(term28905, term28905.getClass(), "parent", null);
        term28906 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term28906, term28906.getClass(), "functionName", null);
        setBooleanField(term28906, term28906.getClass(), "itsNeedsActivation", false);
        setIntField(term28906, term28906.getClass(), "itsFunctionType", 0);
        setBooleanField(term28906, term28906.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28906, term28906.getClass(), "encodedSourceStart", 0);
        setIntField(term28906, term28906.getClass(), "encodedSourceEnd", 0);
        setField(term28906, term28906.getClass(), "sourceName", null);
        setIntField(term28906, term28906.getClass(), "baseLineno", 0);
        setIntField(term28906, term28906.getClass(), "endLineno", 0);
        setField(term28906, term28906.getClass(), "functions", null);
        setField(term28906, term28906.getClass(), "regexps", null);
        setField(term28906, term28906.getClass(), "itsVariables", null);
        setField(term28906, term28906.getClass(), "itsConst", null);
        setField(term28906, term28906.getClass(), "itsVariableNames", null);
        setIntField(term28906, term28906.getClass(), "varStart", 0);
        setField(term28906, term28906.getClass(), "compilerData", null);
        setIntField(term28906, term28906.getClass(), "type", 0);
        setField(term28906, term28906.getClass(), "next", null);
        setField(term28906, term28906.getClass(), "first", null);
        setField(term28906, term28906.getClass(), "last", null);
        setField(term28906, term28906.getClass(), "propListHead", null);
        setIntField(term28906, term28906.getClass(), "sourcePosition", 0);
        setField(term28906, term28906.getClass(), "jsType", null);
        setField(term28906, term28906.getClass(), "parent", null);
        term28855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term28855, term28855.getClass(), "number", 0.0);
        setIntField(term28855, term28855.getClass(), "type", 0);
        setField(term28855, term28855.getClass(), "next", null);
        setField(term28855, term28855.getClass(), "first", null);
        setField(term28855, term28855.getClass(), "last", null);
        setField(term28855, term28855.getClass(), "propListHead", null);
        setIntField(term28855, term28855.getClass(), "sourcePosition", 0);
        setField(term28855, term28855.getClass(), "jsType", null);
        setField(term28855, term28855.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term28247;
        args[1] = term28339;
        args[2] = term28425;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term28155, args);
        assertTrue(recursiveEquals(term28155, term28903));
        assertTrue(recursiveEquals(term28247, term28904));
        assertTrue(recursiveEquals(term28339, term28905));
        assertTrue(recursiveEquals(term28425, term28906));
        assertTrue(recursiveEquals(retValue, term28855));
    }

};


