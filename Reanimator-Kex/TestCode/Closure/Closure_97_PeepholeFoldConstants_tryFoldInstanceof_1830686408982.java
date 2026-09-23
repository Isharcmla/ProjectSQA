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

public class PeepholeFoldConstants_tryFoldInstanceof_1830686408982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310979;
     Object term311071;
     Object term311157;
     Object term311267;
     Object term311268;
     Object term311269;
     Object term311243;

    public PeepholeFoldConstants_tryFoldInstanceof_1830686408982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310979 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term311071 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term311071, term311071.getClass(), "type", 52);
        term311157 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term311267 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term311267, term311267.getClass(), "currentTraversal", null);
        term311268 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311268, term311268.getClass(), "number", 0.0);
        setIntField(term311268, term311268.getClass(), "type", 52);
        setField(term311268, term311268.getClass(), "next", null);
        setField(term311268, term311268.getClass(), "first", null);
        setField(term311268, term311268.getClass(), "last", null);
        setField(term311268, term311268.getClass(), "propListHead", null);
        setIntField(term311268, term311268.getClass(), "sourcePosition", 0);
        setField(term311268, term311268.getClass(), "jsType", null);
        setField(term311268, term311268.getClass(), "parent", null);
        term311269 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term311269, term311269.getClass(), "functionName", null);
        setBooleanField(term311269, term311269.getClass(), "itsNeedsActivation", false);
        setIntField(term311269, term311269.getClass(), "itsFunctionType", 0);
        setBooleanField(term311269, term311269.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term311269, term311269.getClass(), "encodedSourceStart", 0);
        setIntField(term311269, term311269.getClass(), "encodedSourceEnd", 0);
        setField(term311269, term311269.getClass(), "sourceName", null);
        setIntField(term311269, term311269.getClass(), "baseLineno", 0);
        setIntField(term311269, term311269.getClass(), "endLineno", 0);
        setField(term311269, term311269.getClass(), "functions", null);
        setField(term311269, term311269.getClass(), "regexps", null);
        setField(term311269, term311269.getClass(), "itsVariables", null);
        setField(term311269, term311269.getClass(), "itsConst", null);
        setField(term311269, term311269.getClass(), "itsVariableNames", null);
        setIntField(term311269, term311269.getClass(), "varStart", 0);
        setField(term311269, term311269.getClass(), "compilerData", null);
        setIntField(term311269, term311269.getClass(), "type", 0);
        setField(term311269, term311269.getClass(), "next", null);
        setField(term311269, term311269.getClass(), "first", null);
        setField(term311269, term311269.getClass(), "last", null);
        setField(term311269, term311269.getClass(), "propListHead", null);
        setIntField(term311269, term311269.getClass(), "sourcePosition", 0);
        setField(term311269, term311269.getClass(), "jsType", null);
        setField(term311269, term311269.getClass(), "parent", null);
        term311243 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term311243, term311243.getClass(), "number", 0.0);
        setIntField(term311243, term311243.getClass(), "type", 52);
        setField(term311243, term311243.getClass(), "next", null);
        setField(term311243, term311243.getClass(), "first", null);
        setField(term311243, term311243.getClass(), "last", null);
        setField(term311243, term311243.getClass(), "propListHead", null);
        setIntField(term311243, term311243.getClass(), "sourcePosition", 0);
        setField(term311243, term311243.getClass(), "jsType", null);
        setField(term311243, term311243.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term311071;
        args[1] = term311157;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldInstanceof", argTypes, term310979, args);
        assertTrue(recursiveEquals(term310979, term311267));
        assertTrue(recursiveEquals(term311071, term311268));
        assertTrue(recursiveEquals(term311157, term311269));
        assertTrue(recursiveEquals(retValue, term311243));
    }

};


