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

public class TypedScopeCreator_getPrototypePropertyOwner_120862705837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18501;
     Object term18643;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18501 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term18587 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term18501, term18501.getClass(), "type", 33);
        setField(term18501, term18501.getClass(), "first", term18587);
        term18643 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term18644 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term18643, term18643.getClass(), "functionName", null);
        setBooleanField(term18643, term18643.getClass(), "itsNeedsActivation", false);
        setIntField(term18643, term18643.getClass(), "itsFunctionType", 0);
        setBooleanField(term18643, term18643.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term18643, term18643.getClass(), "encodedSourceStart", 0);
        setIntField(term18643, term18643.getClass(), "encodedSourceEnd", 0);
        setField(term18643, term18643.getClass(), "sourceName", null);
        setIntField(term18643, term18643.getClass(), "baseLineno", 0);
        setIntField(term18643, term18643.getClass(), "endLineno", 0);
        setField(term18643, term18643.getClass(), "functions", null);
        setField(term18643, term18643.getClass(), "regexps", null);
        setField(term18643, term18643.getClass(), "itsVariables", null);
        setField(term18643, term18643.getClass(), "itsConst", null);
        setField(term18643, term18643.getClass(), "itsVariableNames", null);
        setIntField(term18643, term18643.getClass(), "varStart", 0);
        setField(term18643, term18643.getClass(), "compilerData", null);
        setIntField(term18643, term18643.getClass(), "type", 33);
        setField(term18643, term18643.getClass(), "next", null);
        setField(term18644, term18644.getClass(), "functionName", null);
        setBooleanField(term18644, term18644.getClass(), "itsNeedsActivation", false);
        setIntField(term18644, term18644.getClass(), "itsFunctionType", 0);
        setBooleanField(term18644, term18644.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term18644, term18644.getClass(), "encodedSourceStart", 0);
        setIntField(term18644, term18644.getClass(), "encodedSourceEnd", 0);
        setField(term18644, term18644.getClass(), "sourceName", null);
        setIntField(term18644, term18644.getClass(), "baseLineno", 0);
        setIntField(term18644, term18644.getClass(), "endLineno", 0);
        setField(term18644, term18644.getClass(), "functions", null);
        setField(term18644, term18644.getClass(), "regexps", null);
        setField(term18644, term18644.getClass(), "itsVariables", null);
        setField(term18644, term18644.getClass(), "itsConst", null);
        setField(term18644, term18644.getClass(), "itsVariableNames", null);
        setIntField(term18644, term18644.getClass(), "varStart", 0);
        setField(term18644, term18644.getClass(), "compilerData", null);
        setIntField(term18644, term18644.getClass(), "type", 0);
        setField(term18644, term18644.getClass(), "next", null);
        setField(term18644, term18644.getClass(), "first", null);
        setField(term18644, term18644.getClass(), "last", null);
        setField(term18644, term18644.getClass(), "propListHead", null);
        setIntField(term18644, term18644.getClass(), "sourcePosition", 0);
        setField(term18644, term18644.getClass(), "jsType", null);
        setField(term18644, term18644.getClass(), "parent", null);
        setField(term18643, term18643.getClass(), "first", term18644);
        setField(term18643, term18643.getClass(), "last", null);
        setField(term18643, term18643.getClass(), "propListHead", null);
        setIntField(term18643, term18643.getClass(), "sourcePosition", 0);
        setField(term18643, term18643.getClass(), "jsType", null);
        setField(term18643, term18643.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term18501;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term18501, term18643));
        assertTrue(recursiveEquals(retValue, null));
    }

};


