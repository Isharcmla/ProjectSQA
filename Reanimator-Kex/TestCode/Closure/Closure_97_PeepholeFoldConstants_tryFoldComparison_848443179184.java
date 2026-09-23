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

public class PeepholeFoldConstants_tryFoldComparison_848443179184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35557;
     Object term35649;
     Object term35741;
     Object term35827;
     Object term35865;
     Object term35866;
     Object term35867;
     Object term35868;
     Object term35838;

    public PeepholeFoldConstants_tryFoldComparison_848443179184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35557 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term35649 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35649, term35649.getClass(), "type", 16);
        term35741 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term35741, term35741.getClass(), "type", 16);
        term35827 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term35865 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term35865, term35865.getClass(), "currentTraversal", null);
        term35866 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35866, term35866.getClass(), "number", 0.0);
        setIntField(term35866, term35866.getClass(), "type", 16);
        setField(term35866, term35866.getClass(), "next", null);
        setField(term35866, term35866.getClass(), "first", null);
        setField(term35866, term35866.getClass(), "last", null);
        setField(term35866, term35866.getClass(), "propListHead", null);
        setIntField(term35866, term35866.getClass(), "sourcePosition", 0);
        setField(term35866, term35866.getClass(), "jsType", null);
        setField(term35866, term35866.getClass(), "parent", null);
        term35867 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35867, term35867.getClass(), "number", 0.0);
        setIntField(term35867, term35867.getClass(), "type", 16);
        setField(term35867, term35867.getClass(), "next", null);
        setField(term35867, term35867.getClass(), "first", null);
        setField(term35867, term35867.getClass(), "last", null);
        setField(term35867, term35867.getClass(), "propListHead", null);
        setIntField(term35867, term35867.getClass(), "sourcePosition", 0);
        setField(term35867, term35867.getClass(), "jsType", null);
        setField(term35867, term35867.getClass(), "parent", null);
        term35868 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term35868, term35868.getClass(), "functionName", null);
        setBooleanField(term35868, term35868.getClass(), "itsNeedsActivation", false);
        setIntField(term35868, term35868.getClass(), "itsFunctionType", 0);
        setBooleanField(term35868, term35868.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term35868, term35868.getClass(), "encodedSourceStart", 0);
        setIntField(term35868, term35868.getClass(), "encodedSourceEnd", 0);
        setField(term35868, term35868.getClass(), "sourceName", null);
        setIntField(term35868, term35868.getClass(), "baseLineno", 0);
        setIntField(term35868, term35868.getClass(), "endLineno", 0);
        setField(term35868, term35868.getClass(), "functions", null);
        setField(term35868, term35868.getClass(), "regexps", null);
        setField(term35868, term35868.getClass(), "itsVariables", null);
        setField(term35868, term35868.getClass(), "itsConst", null);
        setField(term35868, term35868.getClass(), "itsVariableNames", null);
        setIntField(term35868, term35868.getClass(), "varStart", 0);
        setField(term35868, term35868.getClass(), "compilerData", null);
        setIntField(term35868, term35868.getClass(), "type", 0);
        setField(term35868, term35868.getClass(), "next", null);
        setField(term35868, term35868.getClass(), "first", null);
        setField(term35868, term35868.getClass(), "last", null);
        setField(term35868, term35868.getClass(), "propListHead", null);
        setIntField(term35868, term35868.getClass(), "sourcePosition", 0);
        setField(term35868, term35868.getClass(), "jsType", null);
        setField(term35868, term35868.getClass(), "parent", null);
        term35838 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term35838, term35838.getClass(), "number", 0.0);
        setIntField(term35838, term35838.getClass(), "type", 16);
        setField(term35838, term35838.getClass(), "next", null);
        setField(term35838, term35838.getClass(), "first", null);
        setField(term35838, term35838.getClass(), "last", null);
        setField(term35838, term35838.getClass(), "propListHead", null);
        setIntField(term35838, term35838.getClass(), "sourcePosition", 0);
        setField(term35838, term35838.getClass(), "jsType", null);
        setField(term35838, term35838.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term35649;
        args[1] = term35741;
        args[2] = term35827;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term35557, args);
        assertTrue(recursiveEquals(term35557, term35865));
        assertTrue(recursiveEquals(term35649, term35866));
        assertTrue(recursiveEquals(term35741, term35867));
        assertTrue(recursiveEquals(term35827, term35868));
        assertTrue(recursiveEquals(retValue, term35838));
    }

};


