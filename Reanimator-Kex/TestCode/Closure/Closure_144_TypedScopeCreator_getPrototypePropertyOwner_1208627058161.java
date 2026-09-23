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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166515;
     Object term166956;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166515 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166601 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166693 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term166801 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term166515, term166515.getClass(), "type", 33);
        setIntField(term166601, term166601.getClass(), "type", 33);
        setField(term166693, term166693.getClass(), "str", "prototype");
        setField(term166601, term166601.getClass(), "last", term166693);
        setField(term166601, term166601.getClass(), "first", term166801);
        setField(term166515, term166515.getClass(), "first", term166601);
        term166956 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166957 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term166958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term166959 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term166956, term166956.getClass(), "functionName", null);
        setBooleanField(term166956, term166956.getClass(), "itsNeedsActivation", false);
        setIntField(term166956, term166956.getClass(), "itsFunctionType", 0);
        setBooleanField(term166956, term166956.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term166956, term166956.getClass(), "encodedSourceStart", 0);
        setIntField(term166956, term166956.getClass(), "encodedSourceEnd", 0);
        setField(term166956, term166956.getClass(), "sourceName", null);
        setIntField(term166956, term166956.getClass(), "baseLineno", 0);
        setIntField(term166956, term166956.getClass(), "endLineno", 0);
        setField(term166956, term166956.getClass(), "functions", null);
        setField(term166956, term166956.getClass(), "regexps", null);
        setField(term166956, term166956.getClass(), "itsVariables", null);
        setField(term166956, term166956.getClass(), "itsConst", null);
        setField(term166956, term166956.getClass(), "itsVariableNames", null);
        setIntField(term166956, term166956.getClass(), "varStart", 0);
        setField(term166956, term166956.getClass(), "compilerData", null);
        setIntField(term166956, term166956.getClass(), "type", 33);
        setField(term166956, term166956.getClass(), "next", null);
        setField(term166957, term166957.getClass(), "functionName", null);
        setBooleanField(term166957, term166957.getClass(), "itsNeedsActivation", false);
        setIntField(term166957, term166957.getClass(), "itsFunctionType", 0);
        setBooleanField(term166957, term166957.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term166957, term166957.getClass(), "encodedSourceStart", 0);
        setIntField(term166957, term166957.getClass(), "encodedSourceEnd", 0);
        setField(term166957, term166957.getClass(), "sourceName", null);
        setIntField(term166957, term166957.getClass(), "baseLineno", 0);
        setIntField(term166957, term166957.getClass(), "endLineno", 0);
        setField(term166957, term166957.getClass(), "functions", null);
        setField(term166957, term166957.getClass(), "regexps", null);
        setField(term166957, term166957.getClass(), "itsVariables", null);
        setField(term166957, term166957.getClass(), "itsConst", null);
        setField(term166957, term166957.getClass(), "itsVariableNames", null);
        setIntField(term166957, term166957.getClass(), "varStart", 0);
        setField(term166957, term166957.getClass(), "compilerData", null);
        setIntField(term166957, term166957.getClass(), "type", 33);
        setField(term166957, term166957.getClass(), "next", null);
        setIntField(term166958, term166958.getClass(), "type", 0);
        setField(term166958, term166958.getClass(), "next", null);
        setField(term166958, term166958.getClass(), "first", null);
        setField(term166958, term166958.getClass(), "last", null);
        setField(term166958, term166958.getClass(), "propListHead", null);
        setIntField(term166958, term166958.getClass(), "sourcePosition", 0);
        setField(term166958, term166958.getClass(), "jsType", null);
        setField(term166958, term166958.getClass(), "parent", null);
        setField(term166957, term166957.getClass(), "first", term166958);
        setField(term166959, term166959.getClass(), "str", "prototype");
        setIntField(term166959, term166959.getClass(), "type", 0);
        setField(term166959, term166959.getClass(), "next", null);
        setField(term166959, term166959.getClass(), "first", null);
        setField(term166959, term166959.getClass(), "last", null);
        setField(term166959, term166959.getClass(), "propListHead", null);
        setIntField(term166959, term166959.getClass(), "sourcePosition", 0);
        setField(term166959, term166959.getClass(), "jsType", null);
        setField(term166959, term166959.getClass(), "parent", null);
        setField(term166957, term166957.getClass(), "last", term166959);
        setField(term166957, term166957.getClass(), "propListHead", null);
        setIntField(term166957, term166957.getClass(), "sourcePosition", 0);
        setField(term166957, term166957.getClass(), "jsType", null);
        setField(term166957, term166957.getClass(), "parent", null);
        setField(term166956, term166956.getClass(), "first", term166957);
        setField(term166956, term166956.getClass(), "last", null);
        setField(term166956, term166956.getClass(), "propListHead", null);
        setIntField(term166956, term166956.getClass(), "sourcePosition", 0);
        setField(term166956, term166956.getClass(), "jsType", null);
        setField(term166956, term166956.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term166515;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term166515, term166956));
        assertTrue(recursiveEquals(retValue, null));
    }

};


