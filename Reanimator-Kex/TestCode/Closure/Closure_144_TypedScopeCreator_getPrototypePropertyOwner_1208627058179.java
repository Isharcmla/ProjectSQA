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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173481;
     Object term174082;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173481 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term173567 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term173659 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term173783 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term173875 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term173481, term173481.getClass(), "type", 33);
        setIntField(term173567, term173567.getClass(), "type", 33);
        setField(term173659, term173659.getClass(), "str", "prototype");
        setField(term173567, term173567.getClass(), "last", term173659);
        setIntField(term173783, term173783.getClass(), "type", 33);
        setField(term173783, term173783.getClass(), "first", term173875);
        setField(term173567, term173567.getClass(), "first", term173783);
        setField(term173481, term173481.getClass(), "first", term173567);
        term174082 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term174083 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term174084 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term174085 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term174086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term174082, term174082.getClass(), "functionName", null);
        setBooleanField(term174082, term174082.getClass(), "itsNeedsActivation", false);
        setIntField(term174082, term174082.getClass(), "itsFunctionType", 0);
        setBooleanField(term174082, term174082.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term174082, term174082.getClass(), "encodedSourceStart", 0);
        setIntField(term174082, term174082.getClass(), "encodedSourceEnd", 0);
        setField(term174082, term174082.getClass(), "sourceName", null);
        setIntField(term174082, term174082.getClass(), "baseLineno", 0);
        setIntField(term174082, term174082.getClass(), "endLineno", 0);
        setField(term174082, term174082.getClass(), "functions", null);
        setField(term174082, term174082.getClass(), "regexps", null);
        setField(term174082, term174082.getClass(), "itsVariables", null);
        setField(term174082, term174082.getClass(), "itsConst", null);
        setField(term174082, term174082.getClass(), "itsVariableNames", null);
        setIntField(term174082, term174082.getClass(), "varStart", 0);
        setField(term174082, term174082.getClass(), "compilerData", null);
        setIntField(term174082, term174082.getClass(), "type", 33);
        setField(term174082, term174082.getClass(), "next", null);
        setField(term174083, term174083.getClass(), "functionName", null);
        setBooleanField(term174083, term174083.getClass(), "itsNeedsActivation", false);
        setIntField(term174083, term174083.getClass(), "itsFunctionType", 0);
        setBooleanField(term174083, term174083.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term174083, term174083.getClass(), "encodedSourceStart", 0);
        setIntField(term174083, term174083.getClass(), "encodedSourceEnd", 0);
        setField(term174083, term174083.getClass(), "sourceName", null);
        setIntField(term174083, term174083.getClass(), "baseLineno", 0);
        setIntField(term174083, term174083.getClass(), "endLineno", 0);
        setField(term174083, term174083.getClass(), "functions", null);
        setField(term174083, term174083.getClass(), "regexps", null);
        setField(term174083, term174083.getClass(), "itsVariables", null);
        setField(term174083, term174083.getClass(), "itsConst", null);
        setField(term174083, term174083.getClass(), "itsVariableNames", null);
        setIntField(term174083, term174083.getClass(), "varStart", 0);
        setField(term174083, term174083.getClass(), "compilerData", null);
        setIntField(term174083, term174083.getClass(), "type", 33);
        setField(term174083, term174083.getClass(), "next", null);
        setField(term174084, term174084.getClass(), "functionName", null);
        setBooleanField(term174084, term174084.getClass(), "itsNeedsActivation", false);
        setIntField(term174084, term174084.getClass(), "itsFunctionType", 0);
        setBooleanField(term174084, term174084.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term174084, term174084.getClass(), "encodedSourceStart", 0);
        setIntField(term174084, term174084.getClass(), "encodedSourceEnd", 0);
        setField(term174084, term174084.getClass(), "sourceName", null);
        setIntField(term174084, term174084.getClass(), "baseLineno", 0);
        setIntField(term174084, term174084.getClass(), "endLineno", 0);
        setField(term174084, term174084.getClass(), "functions", null);
        setField(term174084, term174084.getClass(), "regexps", null);
        setField(term174084, term174084.getClass(), "itsVariables", null);
        setField(term174084, term174084.getClass(), "itsConst", null);
        setField(term174084, term174084.getClass(), "itsVariableNames", null);
        setIntField(term174084, term174084.getClass(), "varStart", 0);
        setField(term174084, term174084.getClass(), "compilerData", null);
        setIntField(term174084, term174084.getClass(), "type", 33);
        setField(term174084, term174084.getClass(), "next", null);
        setField(term174085, term174085.getClass(), "str", null);
        setIntField(term174085, term174085.getClass(), "type", 0);
        setField(term174085, term174085.getClass(), "next", null);
        setField(term174085, term174085.getClass(), "first", null);
        setField(term174085, term174085.getClass(), "last", null);
        setField(term174085, term174085.getClass(), "propListHead", null);
        setIntField(term174085, term174085.getClass(), "sourcePosition", 0);
        setField(term174085, term174085.getClass(), "jsType", null);
        setField(term174085, term174085.getClass(), "parent", null);
        setField(term174084, term174084.getClass(), "first", term174085);
        setField(term174084, term174084.getClass(), "last", null);
        setField(term174084, term174084.getClass(), "propListHead", null);
        setIntField(term174084, term174084.getClass(), "sourcePosition", 0);
        setField(term174084, term174084.getClass(), "jsType", null);
        setField(term174084, term174084.getClass(), "parent", null);
        setField(term174083, term174083.getClass(), "first", term174084);
        setField(term174086, term174086.getClass(), "str", "prototype");
        setIntField(term174086, term174086.getClass(), "type", 0);
        setField(term174086, term174086.getClass(), "next", null);
        setField(term174086, term174086.getClass(), "first", null);
        setField(term174086, term174086.getClass(), "last", null);
        setField(term174086, term174086.getClass(), "propListHead", null);
        setIntField(term174086, term174086.getClass(), "sourcePosition", 0);
        setField(term174086, term174086.getClass(), "jsType", null);
        setField(term174086, term174086.getClass(), "parent", null);
        setField(term174083, term174083.getClass(), "last", term174086);
        setField(term174083, term174083.getClass(), "propListHead", null);
        setIntField(term174083, term174083.getClass(), "sourcePosition", 0);
        setField(term174083, term174083.getClass(), "jsType", null);
        setField(term174083, term174083.getClass(), "parent", null);
        setField(term174082, term174082.getClass(), "first", term174083);
        setField(term174082, term174082.getClass(), "last", null);
        setField(term174082, term174082.getClass(), "propListHead", null);
        setIntField(term174082, term174082.getClass(), "sourcePosition", 0);
        setField(term174082, term174082.getClass(), "jsType", null);
        setField(term174082, term174082.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term173481;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term173481, term174082));
        assertTrue(recursiveEquals(retValue, null));
    }

};


