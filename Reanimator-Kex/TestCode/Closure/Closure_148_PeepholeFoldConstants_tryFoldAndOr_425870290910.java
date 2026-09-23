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

public class PeepholeFoldConstants_tryFoldAndOr_425870290910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211400;
     Object term211492;
     Object term211578;
     Object term211664;
     Object term211720;
     Object term211721;
     Object term211722;
     Object term211723;
     Object term211665;

    public PeepholeFoldConstants_tryFoldAndOr_425870290910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211400 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term211492 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term211492, term211492.getClass(), "parent", null);
        setIntField(term211492, term211492.getClass(), "type", 0);
        term211578 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term211578, term211578.getClass(), "type", 0);
        term211664 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term211720 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term211720, term211720.getClass(), "currentTraversal", null);
        term211721 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term211721, term211721.getClass(), "number", 0.0);
        setIntField(term211721, term211721.getClass(), "type", 0);
        setField(term211721, term211721.getClass(), "next", null);
        setField(term211721, term211721.getClass(), "first", null);
        setField(term211721, term211721.getClass(), "last", null);
        setField(term211721, term211721.getClass(), "propListHead", null);
        setIntField(term211721, term211721.getClass(), "sourcePosition", 0);
        setField(term211721, term211721.getClass(), "jsType", null);
        setField(term211721, term211721.getClass(), "parent", null);
        term211722 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211722, term211722.getClass(), "functionName", null);
        setBooleanField(term211722, term211722.getClass(), "itsNeedsActivation", false);
        setIntField(term211722, term211722.getClass(), "itsFunctionType", 0);
        setBooleanField(term211722, term211722.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211722, term211722.getClass(), "encodedSourceStart", 0);
        setIntField(term211722, term211722.getClass(), "encodedSourceEnd", 0);
        setField(term211722, term211722.getClass(), "sourceName", null);
        setIntField(term211722, term211722.getClass(), "baseLineno", 0);
        setIntField(term211722, term211722.getClass(), "endLineno", 0);
        setField(term211722, term211722.getClass(), "functions", null);
        setField(term211722, term211722.getClass(), "regexps", null);
        setField(term211722, term211722.getClass(), "itsVariables", null);
        setField(term211722, term211722.getClass(), "itsConst", null);
        setField(term211722, term211722.getClass(), "itsVariableNames", null);
        setIntField(term211722, term211722.getClass(), "varStart", 0);
        setField(term211722, term211722.getClass(), "compilerData", null);
        setIntField(term211722, term211722.getClass(), "type", 0);
        setField(term211722, term211722.getClass(), "next", null);
        setField(term211722, term211722.getClass(), "first", null);
        setField(term211722, term211722.getClass(), "last", null);
        setField(term211722, term211722.getClass(), "propListHead", null);
        setIntField(term211722, term211722.getClass(), "sourcePosition", 0);
        setField(term211722, term211722.getClass(), "jsType", null);
        setField(term211722, term211722.getClass(), "parent", null);
        term211723 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term211723, term211723.getClass(), "functionName", null);
        setBooleanField(term211723, term211723.getClass(), "itsNeedsActivation", false);
        setIntField(term211723, term211723.getClass(), "itsFunctionType", 0);
        setBooleanField(term211723, term211723.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term211723, term211723.getClass(), "encodedSourceStart", 0);
        setIntField(term211723, term211723.getClass(), "encodedSourceEnd", 0);
        setField(term211723, term211723.getClass(), "sourceName", null);
        setIntField(term211723, term211723.getClass(), "baseLineno", 0);
        setIntField(term211723, term211723.getClass(), "endLineno", 0);
        setField(term211723, term211723.getClass(), "functions", null);
        setField(term211723, term211723.getClass(), "regexps", null);
        setField(term211723, term211723.getClass(), "itsVariables", null);
        setField(term211723, term211723.getClass(), "itsConst", null);
        setField(term211723, term211723.getClass(), "itsVariableNames", null);
        setIntField(term211723, term211723.getClass(), "varStart", 0);
        setField(term211723, term211723.getClass(), "compilerData", null);
        setIntField(term211723, term211723.getClass(), "type", 0);
        setField(term211723, term211723.getClass(), "next", null);
        setField(term211723, term211723.getClass(), "first", null);
        setField(term211723, term211723.getClass(), "last", null);
        setField(term211723, term211723.getClass(), "propListHead", null);
        setIntField(term211723, term211723.getClass(), "sourcePosition", 0);
        setField(term211723, term211723.getClass(), "jsType", null);
        setField(term211723, term211723.getClass(), "parent", null);
        term211665 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term211665, term211665.getClass(), "number", 0.0);
        setIntField(term211665, term211665.getClass(), "type", 0);
        setField(term211665, term211665.getClass(), "next", null);
        setField(term211665, term211665.getClass(), "first", null);
        setField(term211665, term211665.getClass(), "last", null);
        setField(term211665, term211665.getClass(), "propListHead", null);
        setIntField(term211665, term211665.getClass(), "sourcePosition", 0);
        setField(term211665, term211665.getClass(), "jsType", null);
        setField(term211665, term211665.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term211492;
        args[1] = term211578;
        args[2] = term211664;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term211400, args);
        assertTrue(recursiveEquals(term211400, term211720));
        assertTrue(recursiveEquals(term211492, term211721));
        assertTrue(recursiveEquals(term211578, term211722));
        assertTrue(recursiveEquals(term211664, term211723));
        assertTrue(recursiveEquals(retValue, term211665));
    }

};


