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

public class PeepholeFoldConstants_optimizeSubtree_16065069931331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term321856;
     Object term321942;
     Object term323048;
     Object term323049;
     Object term322946;

    public PeepholeFoldConstants_optimizeSubtree_16065069931331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term321856 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term321942 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322028 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322120 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term321942, term321942.getClass(), "type", 33);
        setField(term322028, term322028.getClass(), "next", term322120);
        setField(term321942, term321942.getClass(), "first", term322028);
        term323048 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term323048, term323048.getClass(), "currentTraversal", null);
        term323049 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term323050 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term323051 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term323049, term323049.getClass(), "functionName", null);
        setBooleanField(term323049, term323049.getClass(), "itsNeedsActivation", false);
        setIntField(term323049, term323049.getClass(), "itsFunctionType", 0);
        setBooleanField(term323049, term323049.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term323049, term323049.getClass(), "encodedSourceStart", 0);
        setIntField(term323049, term323049.getClass(), "encodedSourceEnd", 0);
        setField(term323049, term323049.getClass(), "sourceName", null);
        setIntField(term323049, term323049.getClass(), "baseLineno", 0);
        setIntField(term323049, term323049.getClass(), "endLineno", 0);
        setField(term323049, term323049.getClass(), "functions", null);
        setField(term323049, term323049.getClass(), "regexps", null);
        setField(term323049, term323049.getClass(), "itsVariables", null);
        setField(term323049, term323049.getClass(), "itsConst", null);
        setField(term323049, term323049.getClass(), "itsVariableNames", null);
        setIntField(term323049, term323049.getClass(), "varStart", 0);
        setField(term323049, term323049.getClass(), "compilerData", null);
        setIntField(term323049, term323049.getClass(), "type", 33);
        setField(term323049, term323049.getClass(), "next", null);
        setField(term323050, term323050.getClass(), "functionName", null);
        setBooleanField(term323050, term323050.getClass(), "itsNeedsActivation", false);
        setIntField(term323050, term323050.getClass(), "itsFunctionType", 0);
        setBooleanField(term323050, term323050.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term323050, term323050.getClass(), "encodedSourceStart", 0);
        setIntField(term323050, term323050.getClass(), "encodedSourceEnd", 0);
        setField(term323050, term323050.getClass(), "sourceName", null);
        setIntField(term323050, term323050.getClass(), "baseLineno", 0);
        setIntField(term323050, term323050.getClass(), "endLineno", 0);
        setField(term323050, term323050.getClass(), "functions", null);
        setField(term323050, term323050.getClass(), "regexps", null);
        setField(term323050, term323050.getClass(), "itsVariables", null);
        setField(term323050, term323050.getClass(), "itsConst", null);
        setField(term323050, term323050.getClass(), "itsVariableNames", null);
        setIntField(term323050, term323050.getClass(), "varStart", 0);
        setField(term323050, term323050.getClass(), "compilerData", null);
        setIntField(term323050, term323050.getClass(), "type", 0);
        setField(term323051, term323051.getClass(), "str", null);
        setIntField(term323051, term323051.getClass(), "type", 0);
        setField(term323051, term323051.getClass(), "next", null);
        setField(term323051, term323051.getClass(), "first", null);
        setField(term323051, term323051.getClass(), "last", null);
        setField(term323051, term323051.getClass(), "propListHead", null);
        setIntField(term323051, term323051.getClass(), "sourcePosition", 0);
        setField(term323051, term323051.getClass(), "jsType", null);
        setField(term323051, term323051.getClass(), "parent", null);
        setField(term323050, term323050.getClass(), "next", term323051);
        setField(term323050, term323050.getClass(), "first", null);
        setField(term323050, term323050.getClass(), "last", null);
        setField(term323050, term323050.getClass(), "propListHead", null);
        setIntField(term323050, term323050.getClass(), "sourcePosition", 0);
        setField(term323050, term323050.getClass(), "jsType", null);
        setField(term323050, term323050.getClass(), "parent", null);
        setField(term323049, term323049.getClass(), "first", term323050);
        setField(term323049, term323049.getClass(), "last", null);
        setField(term323049, term323049.getClass(), "propListHead", null);
        setIntField(term323049, term323049.getClass(), "sourcePosition", 0);
        setField(term323049, term323049.getClass(), "jsType", null);
        setField(term323049, term323049.getClass(), "parent", null);
        term322946 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term322966 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term322946, term322946.getClass(), "functionName", null);
        setBooleanField(term322946, term322946.getClass(), "itsNeedsActivation", false);
        setIntField(term322946, term322946.getClass(), "itsFunctionType", 0);
        setBooleanField(term322946, term322946.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term322946, term322946.getClass(), "encodedSourceStart", 0);
        setIntField(term322946, term322946.getClass(), "encodedSourceEnd", 0);
        setField(term322946, term322946.getClass(), "sourceName", null);
        setIntField(term322946, term322946.getClass(), "baseLineno", 0);
        setIntField(term322946, term322946.getClass(), "endLineno", 0);
        setField(term322946, term322946.getClass(), "functions", null);
        setField(term322946, term322946.getClass(), "regexps", null);
        setField(term322946, term322946.getClass(), "itsVariables", null);
        setField(term322946, term322946.getClass(), "itsConst", null);
        setField(term322946, term322946.getClass(), "itsVariableNames", null);
        setIntField(term322946, term322946.getClass(), "varStart", 0);
        setField(term322946, term322946.getClass(), "compilerData", null);
        setIntField(term322946, term322946.getClass(), "type", 33);
        setField(term322946, term322946.getClass(), "next", null);
        setField(term322956, term322956.getClass(), "functionName", null);
        setBooleanField(term322956, term322956.getClass(), "itsNeedsActivation", false);
        setIntField(term322956, term322956.getClass(), "itsFunctionType", 0);
        setBooleanField(term322956, term322956.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term322956, term322956.getClass(), "encodedSourceStart", 0);
        setIntField(term322956, term322956.getClass(), "encodedSourceEnd", 0);
        setField(term322956, term322956.getClass(), "sourceName", null);
        setIntField(term322956, term322956.getClass(), "baseLineno", 0);
        setIntField(term322956, term322956.getClass(), "endLineno", 0);
        setField(term322956, term322956.getClass(), "functions", null);
        setField(term322956, term322956.getClass(), "regexps", null);
        setField(term322956, term322956.getClass(), "itsVariables", null);
        setField(term322956, term322956.getClass(), "itsConst", null);
        setField(term322956, term322956.getClass(), "itsVariableNames", null);
        setIntField(term322956, term322956.getClass(), "varStart", 0);
        setField(term322956, term322956.getClass(), "compilerData", null);
        setIntField(term322956, term322956.getClass(), "type", 0);
        setField(term322966, term322966.getClass(), "str", null);
        setIntField(term322966, term322966.getClass(), "type", 0);
        setField(term322966, term322966.getClass(), "next", null);
        setField(term322966, term322966.getClass(), "first", null);
        setField(term322966, term322966.getClass(), "last", null);
        setField(term322966, term322966.getClass(), "propListHead", null);
        setIntField(term322966, term322966.getClass(), "sourcePosition", 0);
        setField(term322966, term322966.getClass(), "jsType", null);
        setField(term322966, term322966.getClass(), "parent", null);
        setField(term322956, term322956.getClass(), "next", term322966);
        setField(term322956, term322956.getClass(), "first", null);
        setField(term322956, term322956.getClass(), "last", null);
        setField(term322956, term322956.getClass(), "propListHead", null);
        setIntField(term322956, term322956.getClass(), "sourcePosition", 0);
        setField(term322956, term322956.getClass(), "jsType", null);
        setField(term322956, term322956.getClass(), "parent", null);
        setField(term322946, term322946.getClass(), "first", term322956);
        setField(term322946, term322946.getClass(), "last", null);
        setField(term322946, term322946.getClass(), "propListHead", null);
        setIntField(term322946, term322946.getClass(), "sourcePosition", 0);
        setField(term322946, term322946.getClass(), "jsType", null);
        setField(term322946, term322946.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term321942;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term321856, args);
        assertTrue(recursiveEquals(term321856, term323048));
        assertTrue(recursiveEquals(term321942, term323049));
        assertTrue(recursiveEquals(retValue, term322946));
    }

};


