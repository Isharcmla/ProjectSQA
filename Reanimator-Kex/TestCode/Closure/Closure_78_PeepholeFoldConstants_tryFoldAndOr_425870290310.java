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

public class PeepholeFoldConstants_tryFoldAndOr_425870290310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47496;
     Object term47588;
     Object term47674;
     Object term62725;
     Object term62726;
     Object term62727;
     Object term62695;

    public PeepholeFoldConstants_tryFoldAndOr_425870290310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47496 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term47588 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term47588, term47588.getClass(), "parent", null);
        setIntField(term47588, term47588.getClass(), "type", 0);
        term47674 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term62725 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term62725, term62725.getClass(), "currentTraversal", null);
        term62726 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term62726, term62726.getClass(), "str", null);
        setIntField(term62726, term62726.getClass(), "type", 0);
        setField(term62726, term62726.getClass(), "next", null);
        setField(term62726, term62726.getClass(), "first", null);
        setField(term62726, term62726.getClass(), "last", null);
        setField(term62726, term62726.getClass(), "propListHead", null);
        setIntField(term62726, term62726.getClass(), "sourcePosition", 0);
        setField(term62726, term62726.getClass(), "jsType", null);
        setField(term62726, term62726.getClass(), "parent", null);
        term62727 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term62727, term62727.getClass(), "functionName", null);
        setBooleanField(term62727, term62727.getClass(), "itsNeedsActivation", false);
        setIntField(term62727, term62727.getClass(), "itsFunctionType", 0);
        setBooleanField(term62727, term62727.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term62727, term62727.getClass(), "encodedSourceStart", 0);
        setIntField(term62727, term62727.getClass(), "encodedSourceEnd", 0);
        setField(term62727, term62727.getClass(), "sourceName", null);
        setIntField(term62727, term62727.getClass(), "baseLineno", 0);
        setIntField(term62727, term62727.getClass(), "endLineno", 0);
        setField(term62727, term62727.getClass(), "functions", null);
        setField(term62727, term62727.getClass(), "regexps", null);
        setField(term62727, term62727.getClass(), "itsVariables", null);
        setField(term62727, term62727.getClass(), "itsConst", null);
        setField(term62727, term62727.getClass(), "itsVariableNames", null);
        setIntField(term62727, term62727.getClass(), "varStart", 0);
        setField(term62727, term62727.getClass(), "compilerData", null);
        setIntField(term62727, term62727.getClass(), "type", 0);
        setField(term62727, term62727.getClass(), "next", null);
        setField(term62727, term62727.getClass(), "first", null);
        setField(term62727, term62727.getClass(), "last", null);
        setField(term62727, term62727.getClass(), "propListHead", null);
        setIntField(term62727, term62727.getClass(), "sourcePosition", 0);
        setField(term62727, term62727.getClass(), "jsType", null);
        setField(term62727, term62727.getClass(), "parent", null);
        term62695 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term62695, term62695.getClass(), "str", null);
        setIntField(term62695, term62695.getClass(), "type", 0);
        setField(term62695, term62695.getClass(), "next", null);
        setField(term62695, term62695.getClass(), "first", null);
        setField(term62695, term62695.getClass(), "last", null);
        setField(term62695, term62695.getClass(), "propListHead", null);
        setIntField(term62695, term62695.getClass(), "sourcePosition", 0);
        setField(term62695, term62695.getClass(), "jsType", null);
        setField(term62695, term62695.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term47588;
        args[1] = term47674;
        args[2] = null;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term47496, args);
        assertTrue(recursiveEquals(term47496, term62725));
        assertTrue(recursiveEquals(term47588, term62726));
        assertTrue(recursiveEquals(term47674, term62727));
        assertTrue(recursiveEquals(retValue, term62695));
    }

};


