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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168818;
     Object term169480;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168818 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168904 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term168996 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term169124 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term168818, term168818.getClass(), "type", 33);
        setIntField(term168904, term168904.getClass(), "type", 33);
        setField(term168996, term168996.getClass(), "str", "prototype");
        setField(term168904, term168904.getClass(), "last", term168996);
        setField(term168904, term168904.getClass(), "first", term169124);
        setField(term168818, term168818.getClass(), "first", term168904);
        term169480 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169481 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term169482 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term169483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term169480, term169480.getClass(), "functionName", null);
        setBooleanField(term169480, term169480.getClass(), "itsNeedsActivation", false);
        setIntField(term169480, term169480.getClass(), "itsFunctionType", 0);
        setBooleanField(term169480, term169480.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169480, term169480.getClass(), "encodedSourceStart", 0);
        setIntField(term169480, term169480.getClass(), "encodedSourceEnd", 0);
        setField(term169480, term169480.getClass(), "sourceName", null);
        setIntField(term169480, term169480.getClass(), "baseLineno", 0);
        setIntField(term169480, term169480.getClass(), "endLineno", 0);
        setField(term169480, term169480.getClass(), "functions", null);
        setField(term169480, term169480.getClass(), "regexps", null);
        setField(term169480, term169480.getClass(), "itsVariables", null);
        setField(term169480, term169480.getClass(), "itsConst", null);
        setField(term169480, term169480.getClass(), "itsVariableNames", null);
        setIntField(term169480, term169480.getClass(), "varStart", 0);
        setField(term169480, term169480.getClass(), "compilerData", null);
        setIntField(term169480, term169480.getClass(), "type", 33);
        setField(term169480, term169480.getClass(), "next", null);
        setField(term169481, term169481.getClass(), "functionName", null);
        setBooleanField(term169481, term169481.getClass(), "itsNeedsActivation", false);
        setIntField(term169481, term169481.getClass(), "itsFunctionType", 0);
        setBooleanField(term169481, term169481.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term169481, term169481.getClass(), "encodedSourceStart", 0);
        setIntField(term169481, term169481.getClass(), "encodedSourceEnd", 0);
        setField(term169481, term169481.getClass(), "sourceName", null);
        setIntField(term169481, term169481.getClass(), "baseLineno", 0);
        setIntField(term169481, term169481.getClass(), "endLineno", 0);
        setField(term169481, term169481.getClass(), "functions", null);
        setField(term169481, term169481.getClass(), "regexps", null);
        setField(term169481, term169481.getClass(), "itsVariables", null);
        setField(term169481, term169481.getClass(), "itsConst", null);
        setField(term169481, term169481.getClass(), "itsVariableNames", null);
        setIntField(term169481, term169481.getClass(), "varStart", 0);
        setField(term169481, term169481.getClass(), "compilerData", null);
        setIntField(term169481, term169481.getClass(), "type", 33);
        setField(term169481, term169481.getClass(), "next", null);
        setIntField(term169482, term169482.getClass(), "encodedSourceStart", 0);
        setIntField(term169482, term169482.getClass(), "encodedSourceEnd", 0);
        setField(term169482, term169482.getClass(), "sourceName", null);
        setIntField(term169482, term169482.getClass(), "baseLineno", 0);
        setIntField(term169482, term169482.getClass(), "endLineno", 0);
        setField(term169482, term169482.getClass(), "functions", null);
        setField(term169482, term169482.getClass(), "regexps", null);
        setField(term169482, term169482.getClass(), "itsVariables", null);
        setField(term169482, term169482.getClass(), "itsConst", null);
        setField(term169482, term169482.getClass(), "itsVariableNames", null);
        setIntField(term169482, term169482.getClass(), "varStart", 0);
        setField(term169482, term169482.getClass(), "compilerData", null);
        setIntField(term169482, term169482.getClass(), "type", 0);
        setField(term169482, term169482.getClass(), "next", null);
        setField(term169482, term169482.getClass(), "first", null);
        setField(term169482, term169482.getClass(), "last", null);
        setField(term169482, term169482.getClass(), "propListHead", null);
        setIntField(term169482, term169482.getClass(), "sourcePosition", 0);
        setField(term169482, term169482.getClass(), "jsType", null);
        setField(term169482, term169482.getClass(), "parent", null);
        setField(term169481, term169481.getClass(), "first", term169482);
        setField(term169483, term169483.getClass(), "str", "prototype");
        setIntField(term169483, term169483.getClass(), "type", 0);
        setField(term169483, term169483.getClass(), "next", null);
        setField(term169483, term169483.getClass(), "first", null);
        setField(term169483, term169483.getClass(), "last", null);
        setField(term169483, term169483.getClass(), "propListHead", null);
        setIntField(term169483, term169483.getClass(), "sourcePosition", 0);
        setField(term169483, term169483.getClass(), "jsType", null);
        setField(term169483, term169483.getClass(), "parent", null);
        setField(term169481, term169481.getClass(), "last", term169483);
        setField(term169481, term169481.getClass(), "propListHead", null);
        setIntField(term169481, term169481.getClass(), "sourcePosition", 0);
        setField(term169481, term169481.getClass(), "jsType", null);
        setField(term169481, term169481.getClass(), "parent", null);
        setField(term169480, term169480.getClass(), "first", term169481);
        setField(term169480, term169480.getClass(), "last", null);
        setField(term169480, term169480.getClass(), "propListHead", null);
        setIntField(term169480, term169480.getClass(), "sourcePosition", 0);
        setField(term169480, term169480.getClass(), "jsType", null);
        setField(term169480, term169480.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term168818;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term168818, term169480));
        assertTrue(recursiveEquals(retValue, null));
    }

};


