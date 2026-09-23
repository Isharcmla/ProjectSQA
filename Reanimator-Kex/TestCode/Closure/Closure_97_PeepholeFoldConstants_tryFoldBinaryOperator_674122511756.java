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
import java.lang.Object;

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209324;
     Object term209410;
     Object term217715;
     Object term217716;
     Object term217652;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term209410 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term209480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term209410, term209410.getClass(), "first", term209410);
        setField(term209410, term209410.getClass(), "next", term209480);
        setIntField(term209410, term209410.getClass(), "type", 21);
        term217715 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term217715, term217715.getClass(), "currentTraversal", null);
        term217716 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term217716, term217716.getClass(), "functionName", null);
        setBooleanField(term217716, term217716.getClass(), "itsNeedsActivation", false);
        setIntField(term217716, term217716.getClass(), "itsFunctionType", 0);
        setBooleanField(term217716, term217716.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217716, term217716.getClass(), "encodedSourceStart", 0);
        setIntField(term217716, term217716.getClass(), "encodedSourceEnd", 0);
        setField(term217716, term217716.getClass(), "sourceName", null);
        setIntField(term217716, term217716.getClass(), "baseLineno", 0);
        setIntField(term217716, term217716.getClass(), "endLineno", 0);
        setField(term217716, term217716.getClass(), "functions", null);
        setField(term217716, term217716.getClass(), "regexps", null);
        setField(term217716, term217716.getClass(), "itsVariables", null);
        setField(term217716, term217716.getClass(), "itsConst", null);
        setField(term217716, term217716.getClass(), "itsVariableNames", null);
        setIntField(term217716, term217716.getClass(), "varStart", 0);
        setField(term217716, term217716.getClass(), "compilerData", null);
        setIntField(term217716, term217716.getClass(), "type", 21);
        setIntField(term217717, term217717.getClass(), "type", 0);
        setField(term217717, term217717.getClass(), "next", null);
        setField(term217717, term217717.getClass(), "first", null);
        setField(term217717, term217717.getClass(), "last", null);
        setField(term217717, term217717.getClass(), "propListHead", null);
        setIntField(term217717, term217717.getClass(), "sourcePosition", 0);
        setField(term217717, term217717.getClass(), "jsType", null);
        setField(term217717, term217717.getClass(), "parent", null);
        setField(term217716, term217716.getClass(), "next", term217717);
        setField(term217716, term217716.getClass(), "first", term217716);
        setField(term217716, term217716.getClass(), "last", null);
        setField(term217716, term217716.getClass(), "propListHead", null);
        setIntField(term217716, term217716.getClass(), "sourcePosition", 0);
        setField(term217716, term217716.getClass(), "jsType", null);
        setField(term217716, term217716.getClass(), "parent", null);
        term217652 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term217662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term217652, term217652.getClass(), "functionName", null);
        setBooleanField(term217652, term217652.getClass(), "itsNeedsActivation", false);
        setIntField(term217652, term217652.getClass(), "itsFunctionType", 0);
        setBooleanField(term217652, term217652.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term217652, term217652.getClass(), "encodedSourceStart", 0);
        setIntField(term217652, term217652.getClass(), "encodedSourceEnd", 0);
        setField(term217652, term217652.getClass(), "sourceName", null);
        setIntField(term217652, term217652.getClass(), "baseLineno", 0);
        setIntField(term217652, term217652.getClass(), "endLineno", 0);
        setField(term217652, term217652.getClass(), "functions", null);
        setField(term217652, term217652.getClass(), "regexps", null);
        setField(term217652, term217652.getClass(), "itsVariables", null);
        setField(term217652, term217652.getClass(), "itsConst", null);
        setField(term217652, term217652.getClass(), "itsVariableNames", null);
        setIntField(term217652, term217652.getClass(), "varStart", 0);
        setField(term217652, term217652.getClass(), "compilerData", null);
        setIntField(term217652, term217652.getClass(), "type", 21);
        setIntField(term217662, term217662.getClass(), "type", 0);
        setField(term217662, term217662.getClass(), "next", null);
        setField(term217662, term217662.getClass(), "first", null);
        setField(term217662, term217662.getClass(), "last", null);
        setField(term217662, term217662.getClass(), "propListHead", null);
        setIntField(term217662, term217662.getClass(), "sourcePosition", 0);
        setField(term217662, term217662.getClass(), "jsType", null);
        setField(term217662, term217662.getClass(), "parent", null);
        setField(term217652, term217652.getClass(), "next", term217662);
        setField(term217652, term217652.getClass(), "first", term217652);
        setField(term217652, term217652.getClass(), "last", null);
        setField(term217652, term217652.getClass(), "propListHead", null);
        setIntField(term217652, term217652.getClass(), "sourcePosition", 0);
        setField(term217652, term217652.getClass(), "jsType", null);
        setField(term217652, term217652.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term209410;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term209324, args);
        assertTrue(recursiveEquals(term209324, term217715));
        assertTrue(recursiveEquals(term209410, term217716));
        assertTrue(recursiveEquals(retValue, term217652));
    }

};


