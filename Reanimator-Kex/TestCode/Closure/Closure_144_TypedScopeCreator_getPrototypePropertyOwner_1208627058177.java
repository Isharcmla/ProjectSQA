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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172791;
     Object term173258;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172791 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172877 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term172969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term172791, term172791.getClass(), "type", 33);
        setIntField(term172877, term172877.getClass(), "type", 33);
        setField(term172969, term172969.getClass(), "str", "prototype");
        setField(term172877, term172877.getClass(), "last", term172969);
        setField(term172877, term172877.getClass(), "first", term173099);
        setField(term172791, term172791.getClass(), "first", term172877);
        term173258 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term173259 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term173260 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term173261 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term173258, term173258.getClass(), "functionName", null);
        setBooleanField(term173258, term173258.getClass(), "itsNeedsActivation", false);
        setIntField(term173258, term173258.getClass(), "itsFunctionType", 0);
        setBooleanField(term173258, term173258.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term173258, term173258.getClass(), "encodedSourceStart", 0);
        setIntField(term173258, term173258.getClass(), "encodedSourceEnd", 0);
        setField(term173258, term173258.getClass(), "sourceName", null);
        setIntField(term173258, term173258.getClass(), "baseLineno", 0);
        setIntField(term173258, term173258.getClass(), "endLineno", 0);
        setField(term173258, term173258.getClass(), "functions", null);
        setField(term173258, term173258.getClass(), "regexps", null);
        setField(term173258, term173258.getClass(), "itsVariables", null);
        setField(term173258, term173258.getClass(), "itsConst", null);
        setField(term173258, term173258.getClass(), "itsVariableNames", null);
        setIntField(term173258, term173258.getClass(), "varStart", 0);
        setField(term173258, term173258.getClass(), "compilerData", null);
        setIntField(term173258, term173258.getClass(), "type", 33);
        setField(term173258, term173258.getClass(), "next", null);
        setField(term173259, term173259.getClass(), "functionName", null);
        setBooleanField(term173259, term173259.getClass(), "itsNeedsActivation", false);
        setIntField(term173259, term173259.getClass(), "itsFunctionType", 0);
        setBooleanField(term173259, term173259.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term173259, term173259.getClass(), "encodedSourceStart", 0);
        setIntField(term173259, term173259.getClass(), "encodedSourceEnd", 0);
        setField(term173259, term173259.getClass(), "sourceName", null);
        setIntField(term173259, term173259.getClass(), "baseLineno", 0);
        setIntField(term173259, term173259.getClass(), "endLineno", 0);
        setField(term173259, term173259.getClass(), "functions", null);
        setField(term173259, term173259.getClass(), "regexps", null);
        setField(term173259, term173259.getClass(), "itsVariables", null);
        setField(term173259, term173259.getClass(), "itsConst", null);
        setField(term173259, term173259.getClass(), "itsVariableNames", null);
        setIntField(term173259, term173259.getClass(), "varStart", 0);
        setField(term173259, term173259.getClass(), "compilerData", null);
        setIntField(term173259, term173259.getClass(), "type", 33);
        setField(term173259, term173259.getClass(), "next", null);
        setDoubleField(term173260, term173260.getClass(), "number", 0.0);
        setIntField(term173260, term173260.getClass(), "type", 0);
        setField(term173260, term173260.getClass(), "next", null);
        setField(term173260, term173260.getClass(), "first", null);
        setField(term173260, term173260.getClass(), "last", null);
        setField(term173260, term173260.getClass(), "propListHead", null);
        setIntField(term173260, term173260.getClass(), "sourcePosition", 0);
        setField(term173260, term173260.getClass(), "jsType", null);
        setField(term173260, term173260.getClass(), "parent", null);
        setField(term173259, term173259.getClass(), "first", term173260);
        setField(term173261, term173261.getClass(), "str", "prototype");
        setIntField(term173261, term173261.getClass(), "type", 0);
        setField(term173261, term173261.getClass(), "next", null);
        setField(term173261, term173261.getClass(), "first", null);
        setField(term173261, term173261.getClass(), "last", null);
        setField(term173261, term173261.getClass(), "propListHead", null);
        setIntField(term173261, term173261.getClass(), "sourcePosition", 0);
        setField(term173261, term173261.getClass(), "jsType", null);
        setField(term173261, term173261.getClass(), "parent", null);
        setField(term173259, term173259.getClass(), "last", term173261);
        setField(term173259, term173259.getClass(), "propListHead", null);
        setIntField(term173259, term173259.getClass(), "sourcePosition", 0);
        setField(term173259, term173259.getClass(), "jsType", null);
        setField(term173259, term173259.getClass(), "parent", null);
        setField(term173258, term173258.getClass(), "first", term173259);
        setField(term173258, term173258.getClass(), "last", null);
        setField(term173258, term173258.getClass(), "propListHead", null);
        setIntField(term173258, term173258.getClass(), "sourcePosition", 0);
        setField(term173258, term173258.getClass(), "jsType", null);
        setField(term173258, term173258.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term172791;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term172791, term173258));
        assertTrue(recursiveEquals(retValue, null));
    }

};


