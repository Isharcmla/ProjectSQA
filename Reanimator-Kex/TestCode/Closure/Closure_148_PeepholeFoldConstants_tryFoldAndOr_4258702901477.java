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

public class PeepholeFoldConstants_tryFoldAndOr_4258702901477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term367027;
     Object term367156;
     Object term367653;
     Object term367654;
     Object term367655;
     Object term367617;

    public PeepholeFoldConstants_tryFoldAndOr_4258702901477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term367027 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term367156 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term367156, term367156.getClass(), "parent", null);
        setIntField(term367156, term367156.getClass(), "type", 63);
        term367653 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term367653, term367653.getClass(), "currentTraversal", null);
        term367654 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term367654, term367654.getClass(), "functionName", null);
        setBooleanField(term367654, term367654.getClass(), "itsNeedsActivation", false);
        setIntField(term367654, term367654.getClass(), "itsFunctionType", 0);
        setBooleanField(term367654, term367654.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367654, term367654.getClass(), "encodedSourceStart", 0);
        setIntField(term367654, term367654.getClass(), "encodedSourceEnd", 0);
        setField(term367654, term367654.getClass(), "sourceName", null);
        setIntField(term367654, term367654.getClass(), "baseLineno", 0);
        setIntField(term367654, term367654.getClass(), "endLineno", 0);
        setField(term367654, term367654.getClass(), "functions", null);
        setField(term367654, term367654.getClass(), "regexps", null);
        setField(term367654, term367654.getClass(), "itsVariables", null);
        setField(term367654, term367654.getClass(), "itsConst", null);
        setField(term367654, term367654.getClass(), "itsVariableNames", null);
        setIntField(term367654, term367654.getClass(), "varStart", 0);
        setField(term367654, term367654.getClass(), "compilerData", null);
        setIntField(term367654, term367654.getClass(), "type", 63);
        setField(term367654, term367654.getClass(), "next", null);
        setField(term367654, term367654.getClass(), "first", null);
        setField(term367654, term367654.getClass(), "last", null);
        setField(term367654, term367654.getClass(), "propListHead", null);
        setIntField(term367654, term367654.getClass(), "sourcePosition", 0);
        setField(term367654, term367654.getClass(), "jsType", null);
        setField(term367654, term367654.getClass(), "parent", null);
        term367655 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term367655, term367655.getClass(), "functionName", null);
        setBooleanField(term367655, term367655.getClass(), "itsNeedsActivation", false);
        setIntField(term367655, term367655.getClass(), "itsFunctionType", 0);
        setBooleanField(term367655, term367655.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367655, term367655.getClass(), "encodedSourceStart", 0);
        setIntField(term367655, term367655.getClass(), "encodedSourceEnd", 0);
        setField(term367655, term367655.getClass(), "sourceName", null);
        setIntField(term367655, term367655.getClass(), "baseLineno", 0);
        setIntField(term367655, term367655.getClass(), "endLineno", 0);
        setField(term367655, term367655.getClass(), "functions", null);
        setField(term367655, term367655.getClass(), "regexps", null);
        setField(term367655, term367655.getClass(), "itsVariables", null);
        setField(term367655, term367655.getClass(), "itsConst", null);
        setField(term367655, term367655.getClass(), "itsVariableNames", null);
        setIntField(term367655, term367655.getClass(), "varStart", 0);
        setField(term367655, term367655.getClass(), "compilerData", null);
        setIntField(term367655, term367655.getClass(), "type", 63);
        setField(term367655, term367655.getClass(), "next", null);
        setField(term367655, term367655.getClass(), "first", null);
        setField(term367655, term367655.getClass(), "last", null);
        setField(term367655, term367655.getClass(), "propListHead", null);
        setIntField(term367655, term367655.getClass(), "sourcePosition", 0);
        setField(term367655, term367655.getClass(), "jsType", null);
        setField(term367655, term367655.getClass(), "parent", null);
        term367617 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term367617, term367617.getClass(), "functionName", null);
        setBooleanField(term367617, term367617.getClass(), "itsNeedsActivation", false);
        setIntField(term367617, term367617.getClass(), "itsFunctionType", 0);
        setBooleanField(term367617, term367617.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term367617, term367617.getClass(), "encodedSourceStart", 0);
        setIntField(term367617, term367617.getClass(), "encodedSourceEnd", 0);
        setField(term367617, term367617.getClass(), "sourceName", null);
        setIntField(term367617, term367617.getClass(), "baseLineno", 0);
        setIntField(term367617, term367617.getClass(), "endLineno", 0);
        setField(term367617, term367617.getClass(), "functions", null);
        setField(term367617, term367617.getClass(), "regexps", null);
        setField(term367617, term367617.getClass(), "itsVariables", null);
        setField(term367617, term367617.getClass(), "itsConst", null);
        setField(term367617, term367617.getClass(), "itsVariableNames", null);
        setIntField(term367617, term367617.getClass(), "varStart", 0);
        setField(term367617, term367617.getClass(), "compilerData", null);
        setIntField(term367617, term367617.getClass(), "type", 63);
        setField(term367617, term367617.getClass(), "next", null);
        setField(term367617, term367617.getClass(), "first", null);
        setField(term367617, term367617.getClass(), "last", null);
        setField(term367617, term367617.getClass(), "propListHead", null);
        setIntField(term367617, term367617.getClass(), "sourcePosition", 0);
        setField(term367617, term367617.getClass(), "jsType", null);
        setField(term367617, term367617.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term367156;
        args[1] = term367156;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term367027, args);
        assertTrue(recursiveEquals(term367027, term367653));
        assertTrue(recursiveEquals(term367156, term367654));
        assertTrue(recursiveEquals(term367156, term367655));
        assertTrue(recursiveEquals(retValue, term367617));
    }

};


