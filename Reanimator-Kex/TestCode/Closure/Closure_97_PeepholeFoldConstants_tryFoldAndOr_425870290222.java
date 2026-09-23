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

public class PeepholeFoldConstants_tryFoldAndOr_425870290222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43848;
     Object term43934;
     Object term44020;
     Object term44112;
     Object term44192;
     Object term44193;
     Object term44194;
     Object term44195;
     Object term44137;

    public PeepholeFoldConstants_tryFoldAndOr_425870290222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43848 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term43934 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term43934, term43934.getClass(), "parent", null);
        setIntField(term43934, term43934.getClass(), "type", 0);
        term44020 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term44020, term44020.getClass(), "type", 0);
        term44112 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        term44192 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term44192, term44192.getClass(), "currentTraversal", null);
        term44193 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44193, term44193.getClass(), "functionName", null);
        setBooleanField(term44193, term44193.getClass(), "itsNeedsActivation", false);
        setIntField(term44193, term44193.getClass(), "itsFunctionType", 0);
        setBooleanField(term44193, term44193.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44193, term44193.getClass(), "encodedSourceStart", 0);
        setIntField(term44193, term44193.getClass(), "encodedSourceEnd", 0);
        setField(term44193, term44193.getClass(), "sourceName", null);
        setIntField(term44193, term44193.getClass(), "baseLineno", 0);
        setIntField(term44193, term44193.getClass(), "endLineno", 0);
        setField(term44193, term44193.getClass(), "functions", null);
        setField(term44193, term44193.getClass(), "regexps", null);
        setField(term44193, term44193.getClass(), "itsVariables", null);
        setField(term44193, term44193.getClass(), "itsConst", null);
        setField(term44193, term44193.getClass(), "itsVariableNames", null);
        setIntField(term44193, term44193.getClass(), "varStart", 0);
        setField(term44193, term44193.getClass(), "compilerData", null);
        setIntField(term44193, term44193.getClass(), "type", 0);
        setField(term44193, term44193.getClass(), "next", null);
        setField(term44193, term44193.getClass(), "first", null);
        setField(term44193, term44193.getClass(), "last", null);
        setField(term44193, term44193.getClass(), "propListHead", null);
        setIntField(term44193, term44193.getClass(), "sourcePosition", 0);
        setField(term44193, term44193.getClass(), "jsType", null);
        setField(term44193, term44193.getClass(), "parent", null);
        term44194 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44194, term44194.getClass(), "functionName", null);
        setBooleanField(term44194, term44194.getClass(), "itsNeedsActivation", false);
        setIntField(term44194, term44194.getClass(), "itsFunctionType", 0);
        setBooleanField(term44194, term44194.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44194, term44194.getClass(), "encodedSourceStart", 0);
        setIntField(term44194, term44194.getClass(), "encodedSourceEnd", 0);
        setField(term44194, term44194.getClass(), "sourceName", null);
        setIntField(term44194, term44194.getClass(), "baseLineno", 0);
        setIntField(term44194, term44194.getClass(), "endLineno", 0);
        setField(term44194, term44194.getClass(), "functions", null);
        setField(term44194, term44194.getClass(), "regexps", null);
        setField(term44194, term44194.getClass(), "itsVariables", null);
        setField(term44194, term44194.getClass(), "itsConst", null);
        setField(term44194, term44194.getClass(), "itsVariableNames", null);
        setIntField(term44194, term44194.getClass(), "varStart", 0);
        setField(term44194, term44194.getClass(), "compilerData", null);
        setIntField(term44194, term44194.getClass(), "type", 0);
        setField(term44194, term44194.getClass(), "next", null);
        setField(term44194, term44194.getClass(), "first", null);
        setField(term44194, term44194.getClass(), "last", null);
        setField(term44194, term44194.getClass(), "propListHead", null);
        setIntField(term44194, term44194.getClass(), "sourcePosition", 0);
        setField(term44194, term44194.getClass(), "jsType", null);
        setField(term44194, term44194.getClass(), "parent", null);
        term44195 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term44195, term44195.getClass(), "number", 0.0);
        setIntField(term44195, term44195.getClass(), "type", 0);
        setField(term44195, term44195.getClass(), "next", null);
        setField(term44195, term44195.getClass(), "first", null);
        setField(term44195, term44195.getClass(), "last", null);
        setField(term44195, term44195.getClass(), "propListHead", null);
        setIntField(term44195, term44195.getClass(), "sourcePosition", 0);
        setField(term44195, term44195.getClass(), "jsType", null);
        setField(term44195, term44195.getClass(), "parent", null);
        term44137 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term44137, term44137.getClass(), "functionName", null);
        setBooleanField(term44137, term44137.getClass(), "itsNeedsActivation", false);
        setIntField(term44137, term44137.getClass(), "itsFunctionType", 0);
        setBooleanField(term44137, term44137.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term44137, term44137.getClass(), "encodedSourceStart", 0);
        setIntField(term44137, term44137.getClass(), "encodedSourceEnd", 0);
        setField(term44137, term44137.getClass(), "sourceName", null);
        setIntField(term44137, term44137.getClass(), "baseLineno", 0);
        setIntField(term44137, term44137.getClass(), "endLineno", 0);
        setField(term44137, term44137.getClass(), "functions", null);
        setField(term44137, term44137.getClass(), "regexps", null);
        setField(term44137, term44137.getClass(), "itsVariables", null);
        setField(term44137, term44137.getClass(), "itsConst", null);
        setField(term44137, term44137.getClass(), "itsVariableNames", null);
        setIntField(term44137, term44137.getClass(), "varStart", 0);
        setField(term44137, term44137.getClass(), "compilerData", null);
        setIntField(term44137, term44137.getClass(), "type", 0);
        setField(term44137, term44137.getClass(), "next", null);
        setField(term44137, term44137.getClass(), "first", null);
        setField(term44137, term44137.getClass(), "last", null);
        setField(term44137, term44137.getClass(), "propListHead", null);
        setIntField(term44137, term44137.getClass(), "sourcePosition", 0);
        setField(term44137, term44137.getClass(), "jsType", null);
        setField(term44137, term44137.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term43934;
        args[1] = term44020;
        args[2] = term44112;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term43848, args);
        assertTrue(recursiveEquals(term43848, term44192));
        assertTrue(recursiveEquals(term43934, term44193));
        assertTrue(recursiveEquals(term44020, term44194));
        assertTrue(recursiveEquals(term44112, term44195));
        assertTrue(recursiveEquals(retValue, term44137));
    }

};


