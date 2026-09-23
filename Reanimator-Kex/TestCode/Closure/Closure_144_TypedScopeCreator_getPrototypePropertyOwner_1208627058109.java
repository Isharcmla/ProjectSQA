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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53241;
     Object term53371;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53241 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53331 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term53241, term53241.getClass(), "type", 33);
        setIntField(term53331, term53331.getClass(), "type", -34);
        setField(term53241, term53241.getClass(), "first", term53331);
        term53371 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term53372 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term53371, term53371.getClass(), "functionName", null);
        setBooleanField(term53371, term53371.getClass(), "itsNeedsActivation", false);
        setIntField(term53371, term53371.getClass(), "itsFunctionType", 0);
        setBooleanField(term53371, term53371.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term53371, term53371.getClass(), "encodedSourceStart", 0);
        setIntField(term53371, term53371.getClass(), "encodedSourceEnd", 0);
        setField(term53371, term53371.getClass(), "sourceName", null);
        setIntField(term53371, term53371.getClass(), "baseLineno", 0);
        setIntField(term53371, term53371.getClass(), "endLineno", 0);
        setField(term53371, term53371.getClass(), "functions", null);
        setField(term53371, term53371.getClass(), "regexps", null);
        setField(term53371, term53371.getClass(), "itsVariables", null);
        setField(term53371, term53371.getClass(), "itsConst", null);
        setField(term53371, term53371.getClass(), "itsVariableNames", null);
        setIntField(term53371, term53371.getClass(), "varStart", 0);
        setField(term53371, term53371.getClass(), "compilerData", null);
        setIntField(term53371, term53371.getClass(), "type", 33);
        setField(term53371, term53371.getClass(), "next", null);
        setIntField(term53372, term53372.getClass(), "encodedSourceStart", 0);
        setIntField(term53372, term53372.getClass(), "encodedSourceEnd", 0);
        setField(term53372, term53372.getClass(), "sourceName", null);
        setIntField(term53372, term53372.getClass(), "baseLineno", 0);
        setIntField(term53372, term53372.getClass(), "endLineno", 0);
        setField(term53372, term53372.getClass(), "functions", null);
        setField(term53372, term53372.getClass(), "regexps", null);
        setField(term53372, term53372.getClass(), "itsVariables", null);
        setField(term53372, term53372.getClass(), "itsConst", null);
        setField(term53372, term53372.getClass(), "itsVariableNames", null);
        setIntField(term53372, term53372.getClass(), "varStart", 0);
        setField(term53372, term53372.getClass(), "compilerData", null);
        setIntField(term53372, term53372.getClass(), "type", -34);
        setField(term53372, term53372.getClass(), "next", null);
        setField(term53372, term53372.getClass(), "first", null);
        setField(term53372, term53372.getClass(), "last", null);
        setField(term53372, term53372.getClass(), "propListHead", null);
        setIntField(term53372, term53372.getClass(), "sourcePosition", 0);
        setField(term53372, term53372.getClass(), "jsType", null);
        setField(term53372, term53372.getClass(), "parent", null);
        setField(term53371, term53371.getClass(), "first", term53372);
        setField(term53371, term53371.getClass(), "last", null);
        setField(term53371, term53371.getClass(), "propListHead", null);
        setIntField(term53371, term53371.getClass(), "sourcePosition", 0);
        setField(term53371, term53371.getClass(), "jsType", null);
        setField(term53371, term53371.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term53241;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term53241, term53371));
        assertTrue(recursiveEquals(retValue, null));
    }

};


