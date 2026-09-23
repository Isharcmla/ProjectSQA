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

public class PeepholeFoldConstants_tryFoldAdd_17496499311241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295583;
     Object term295669;
     Object term295755;
     Object term295841;
     Object term296316;
     Object term296317;
     Object term296318;
     Object term296319;
     Object term296258;

    public PeepholeFoldConstants_tryFoldAdd_17496499311241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295583 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term295669 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term295669, term295669.getClass(), "type", 21);
        term295755 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term295755, term295755.getClass(), "type", 21);
        term295841 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term296316 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term296316, term296316.getClass(), "currentTraversal", null);
        term296317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296317, term296317.getClass(), "functionName", null);
        setBooleanField(term296317, term296317.getClass(), "itsNeedsActivation", false);
        setIntField(term296317, term296317.getClass(), "itsFunctionType", 0);
        setBooleanField(term296317, term296317.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296317, term296317.getClass(), "encodedSourceStart", 0);
        setIntField(term296317, term296317.getClass(), "encodedSourceEnd", 0);
        setField(term296317, term296317.getClass(), "sourceName", null);
        setIntField(term296317, term296317.getClass(), "baseLineno", 0);
        setIntField(term296317, term296317.getClass(), "endLineno", 0);
        setField(term296317, term296317.getClass(), "functions", null);
        setField(term296317, term296317.getClass(), "regexps", null);
        setField(term296317, term296317.getClass(), "itsVariables", null);
        setField(term296317, term296317.getClass(), "itsConst", null);
        setField(term296317, term296317.getClass(), "itsVariableNames", null);
        setIntField(term296317, term296317.getClass(), "varStart", 0);
        setField(term296317, term296317.getClass(), "compilerData", null);
        setIntField(term296317, term296317.getClass(), "type", 21);
        setField(term296317, term296317.getClass(), "next", null);
        setField(term296317, term296317.getClass(), "first", null);
        setField(term296317, term296317.getClass(), "last", null);
        setField(term296317, term296317.getClass(), "propListHead", null);
        setIntField(term296317, term296317.getClass(), "sourcePosition", 0);
        setField(term296317, term296317.getClass(), "jsType", null);
        setField(term296317, term296317.getClass(), "parent", null);
        term296318 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296318, term296318.getClass(), "functionName", null);
        setBooleanField(term296318, term296318.getClass(), "itsNeedsActivation", false);
        setIntField(term296318, term296318.getClass(), "itsFunctionType", 0);
        setBooleanField(term296318, term296318.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296318, term296318.getClass(), "encodedSourceStart", 0);
        setIntField(term296318, term296318.getClass(), "encodedSourceEnd", 0);
        setField(term296318, term296318.getClass(), "sourceName", null);
        setIntField(term296318, term296318.getClass(), "baseLineno", 0);
        setIntField(term296318, term296318.getClass(), "endLineno", 0);
        setField(term296318, term296318.getClass(), "functions", null);
        setField(term296318, term296318.getClass(), "regexps", null);
        setField(term296318, term296318.getClass(), "itsVariables", null);
        setField(term296318, term296318.getClass(), "itsConst", null);
        setField(term296318, term296318.getClass(), "itsVariableNames", null);
        setIntField(term296318, term296318.getClass(), "varStart", 0);
        setField(term296318, term296318.getClass(), "compilerData", null);
        setIntField(term296318, term296318.getClass(), "type", 21);
        setField(term296318, term296318.getClass(), "next", null);
        setField(term296318, term296318.getClass(), "first", null);
        setField(term296318, term296318.getClass(), "last", null);
        setField(term296318, term296318.getClass(), "propListHead", null);
        setIntField(term296318, term296318.getClass(), "sourcePosition", 0);
        setField(term296318, term296318.getClass(), "jsType", null);
        setField(term296318, term296318.getClass(), "parent", null);
        term296319 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296319, term296319.getClass(), "functionName", null);
        setBooleanField(term296319, term296319.getClass(), "itsNeedsActivation", false);
        setIntField(term296319, term296319.getClass(), "itsFunctionType", 0);
        setBooleanField(term296319, term296319.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296319, term296319.getClass(), "encodedSourceStart", 0);
        setIntField(term296319, term296319.getClass(), "encodedSourceEnd", 0);
        setField(term296319, term296319.getClass(), "sourceName", null);
        setIntField(term296319, term296319.getClass(), "baseLineno", 0);
        setIntField(term296319, term296319.getClass(), "endLineno", 0);
        setField(term296319, term296319.getClass(), "functions", null);
        setField(term296319, term296319.getClass(), "regexps", null);
        setField(term296319, term296319.getClass(), "itsVariables", null);
        setField(term296319, term296319.getClass(), "itsConst", null);
        setField(term296319, term296319.getClass(), "itsVariableNames", null);
        setIntField(term296319, term296319.getClass(), "varStart", 0);
        setField(term296319, term296319.getClass(), "compilerData", null);
        setIntField(term296319, term296319.getClass(), "type", 0);
        setField(term296319, term296319.getClass(), "next", null);
        setField(term296319, term296319.getClass(), "first", null);
        setField(term296319, term296319.getClass(), "last", null);
        setField(term296319, term296319.getClass(), "propListHead", null);
        setIntField(term296319, term296319.getClass(), "sourcePosition", 0);
        setField(term296319, term296319.getClass(), "jsType", null);
        setField(term296319, term296319.getClass(), "parent", null);
        term296258 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296258, term296258.getClass(), "functionName", null);
        setBooleanField(term296258, term296258.getClass(), "itsNeedsActivation", false);
        setIntField(term296258, term296258.getClass(), "itsFunctionType", 0);
        setBooleanField(term296258, term296258.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296258, term296258.getClass(), "encodedSourceStart", 0);
        setIntField(term296258, term296258.getClass(), "encodedSourceEnd", 0);
        setField(term296258, term296258.getClass(), "sourceName", null);
        setIntField(term296258, term296258.getClass(), "baseLineno", 0);
        setIntField(term296258, term296258.getClass(), "endLineno", 0);
        setField(term296258, term296258.getClass(), "functions", null);
        setField(term296258, term296258.getClass(), "regexps", null);
        setField(term296258, term296258.getClass(), "itsVariables", null);
        setField(term296258, term296258.getClass(), "itsConst", null);
        setField(term296258, term296258.getClass(), "itsVariableNames", null);
        setIntField(term296258, term296258.getClass(), "varStart", 0);
        setField(term296258, term296258.getClass(), "compilerData", null);
        setIntField(term296258, term296258.getClass(), "type", 21);
        setField(term296258, term296258.getClass(), "next", null);
        setField(term296258, term296258.getClass(), "first", null);
        setField(term296258, term296258.getClass(), "last", null);
        setField(term296258, term296258.getClass(), "propListHead", null);
        setIntField(term296258, term296258.getClass(), "sourcePosition", 0);
        setField(term296258, term296258.getClass(), "jsType", null);
        setField(term296258, term296258.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term295669;
        args[1] = term295755;
        args[2] = term295841;
        Object retValue = callMethod(klass, "tryFoldAdd", argTypes, term295583, args);
        assertTrue(recursiveEquals(term295583, term296316));
        assertTrue(recursiveEquals(term295669, term296317));
        assertTrue(recursiveEquals(term295755, term296318));
        assertTrue(recursiveEquals(term295841, term296319));
        assertTrue(recursiveEquals(retValue, term296258));
    }

};


