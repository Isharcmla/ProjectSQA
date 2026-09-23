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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564180;
     Object term564266;
     Object term564358;
     Object term564444;
     Object term565013;
     Object term565014;
     Object term565015;
     Object term565016;
     Object term564958;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term564180 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term564266 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term564266, term564266.getClass(), "parent", null);
        setIntField(term564266, term564266.getClass(), "type", 0);
        term564358 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term564358, term564358.getClass(), "type", 0);
        term564444 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term565013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term565013, term565013.getClass(), "currentTraversal", null);
        term565014 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term565014, term565014.getClass(), "functionName", null);
        setBooleanField(term565014, term565014.getClass(), "itsNeedsActivation", false);
        setIntField(term565014, term565014.getClass(), "itsFunctionType", 0);
        setBooleanField(term565014, term565014.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565014, term565014.getClass(), "encodedSourceStart", 0);
        setIntField(term565014, term565014.getClass(), "encodedSourceEnd", 0);
        setField(term565014, term565014.getClass(), "sourceName", null);
        setIntField(term565014, term565014.getClass(), "baseLineno", 0);
        setIntField(term565014, term565014.getClass(), "endLineno", 0);
        setField(term565014, term565014.getClass(), "functions", null);
        setField(term565014, term565014.getClass(), "regexps", null);
        setField(term565014, term565014.getClass(), "itsVariables", null);
        setField(term565014, term565014.getClass(), "itsConst", null);
        setField(term565014, term565014.getClass(), "itsVariableNames", null);
        setIntField(term565014, term565014.getClass(), "varStart", 0);
        setField(term565014, term565014.getClass(), "compilerData", null);
        setIntField(term565014, term565014.getClass(), "type", 0);
        setField(term565014, term565014.getClass(), "next", null);
        setField(term565014, term565014.getClass(), "first", null);
        setField(term565014, term565014.getClass(), "last", null);
        setField(term565014, term565014.getClass(), "propListHead", null);
        setIntField(term565014, term565014.getClass(), "sourcePosition", 0);
        setField(term565014, term565014.getClass(), "jsType", null);
        setField(term565014, term565014.getClass(), "parent", null);
        term565015 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term565015, term565015.getClass(), "number", 0.0);
        setIntField(term565015, term565015.getClass(), "type", 0);
        setField(term565015, term565015.getClass(), "next", null);
        setField(term565015, term565015.getClass(), "first", null);
        setField(term565015, term565015.getClass(), "last", null);
        setField(term565015, term565015.getClass(), "propListHead", null);
        setIntField(term565015, term565015.getClass(), "sourcePosition", 0);
        setField(term565015, term565015.getClass(), "jsType", null);
        setField(term565015, term565015.getClass(), "parent", null);
        term565016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term565016, term565016.getClass(), "functionName", null);
        setBooleanField(term565016, term565016.getClass(), "itsNeedsActivation", false);
        setIntField(term565016, term565016.getClass(), "itsFunctionType", 0);
        setBooleanField(term565016, term565016.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term565016, term565016.getClass(), "encodedSourceStart", 0);
        setIntField(term565016, term565016.getClass(), "encodedSourceEnd", 0);
        setField(term565016, term565016.getClass(), "sourceName", null);
        setIntField(term565016, term565016.getClass(), "baseLineno", 0);
        setIntField(term565016, term565016.getClass(), "endLineno", 0);
        setField(term565016, term565016.getClass(), "functions", null);
        setField(term565016, term565016.getClass(), "regexps", null);
        setField(term565016, term565016.getClass(), "itsVariables", null);
        setField(term565016, term565016.getClass(), "itsConst", null);
        setField(term565016, term565016.getClass(), "itsVariableNames", null);
        setIntField(term565016, term565016.getClass(), "varStart", 0);
        setField(term565016, term565016.getClass(), "compilerData", null);
        setIntField(term565016, term565016.getClass(), "type", 0);
        setField(term565016, term565016.getClass(), "next", null);
        setField(term565016, term565016.getClass(), "first", null);
        setField(term565016, term565016.getClass(), "last", null);
        setField(term565016, term565016.getClass(), "propListHead", null);
        setIntField(term565016, term565016.getClass(), "sourcePosition", 0);
        setField(term565016, term565016.getClass(), "jsType", null);
        setField(term565016, term565016.getClass(), "parent", null);
        term564958 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term564958, term564958.getClass(), "functionName", null);
        setBooleanField(term564958, term564958.getClass(), "itsNeedsActivation", false);
        setIntField(term564958, term564958.getClass(), "itsFunctionType", 0);
        setBooleanField(term564958, term564958.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term564958, term564958.getClass(), "encodedSourceStart", 0);
        setIntField(term564958, term564958.getClass(), "encodedSourceEnd", 0);
        setField(term564958, term564958.getClass(), "sourceName", null);
        setIntField(term564958, term564958.getClass(), "baseLineno", 0);
        setIntField(term564958, term564958.getClass(), "endLineno", 0);
        setField(term564958, term564958.getClass(), "functions", null);
        setField(term564958, term564958.getClass(), "regexps", null);
        setField(term564958, term564958.getClass(), "itsVariables", null);
        setField(term564958, term564958.getClass(), "itsConst", null);
        setField(term564958, term564958.getClass(), "itsVariableNames", null);
        setIntField(term564958, term564958.getClass(), "varStart", 0);
        setField(term564958, term564958.getClass(), "compilerData", null);
        setIntField(term564958, term564958.getClass(), "type", 0);
        setField(term564958, term564958.getClass(), "next", null);
        setField(term564958, term564958.getClass(), "first", null);
        setField(term564958, term564958.getClass(), "last", null);
        setField(term564958, term564958.getClass(), "propListHead", null);
        setIntField(term564958, term564958.getClass(), "sourcePosition", 0);
        setField(term564958, term564958.getClass(), "jsType", null);
        setField(term564958, term564958.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term564266;
        args[1] = term564358;
        args[2] = term564444;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term564180, args);
        assertTrue(recursiveEquals(term564180, term565013));
        assertTrue(recursiveEquals(term564266, term565014));
        assertTrue(recursiveEquals(term564358, term565015));
        assertTrue(recursiveEquals(term564444, term565016));
        assertTrue(recursiveEquals(retValue, term564958));
    }

};


