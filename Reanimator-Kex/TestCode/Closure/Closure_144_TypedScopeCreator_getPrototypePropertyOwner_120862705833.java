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

public class TypedScopeCreator_getPrototypePropertyOwner_120862705833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16646;
     Object term17955;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16646 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term17955 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term17955, term17955.getClass(), "encodedSourceStart", 0);
        setIntField(term17955, term17955.getClass(), "encodedSourceEnd", 0);
        setField(term17955, term17955.getClass(), "sourceName", null);
        setIntField(term17955, term17955.getClass(), "baseLineno", 0);
        setIntField(term17955, term17955.getClass(), "endLineno", 0);
        setField(term17955, term17955.getClass(), "functions", null);
        setField(term17955, term17955.getClass(), "regexps", null);
        setField(term17955, term17955.getClass(), "itsVariables", null);
        setField(term17955, term17955.getClass(), "itsConst", null);
        setField(term17955, term17955.getClass(), "itsVariableNames", null);
        setIntField(term17955, term17955.getClass(), "varStart", 0);
        setField(term17955, term17955.getClass(), "compilerData", null);
        setIntField(term17955, term17955.getClass(), "type", 0);
        setField(term17955, term17955.getClass(), "next", null);
        setField(term17955, term17955.getClass(), "first", null);
        setField(term17955, term17955.getClass(), "last", null);
        setField(term17955, term17955.getClass(), "propListHead", null);
        setIntField(term17955, term17955.getClass(), "sourcePosition", 0);
        setField(term17955, term17955.getClass(), "jsType", null);
        setField(term17955, term17955.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16646;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term16646, term17955));
        assertTrue(recursiveEquals(retValue, null));
    }

};


