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

public class TypedScopeCreator_getPrototypePropertyOwner_1208627058139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69881;
     Object term70085;

    public TypedScopeCreator_getPrototypePropertyOwner_1208627058139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69881 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term69973 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term69881, term69881.getClass(), "type", 33);
        setField(term69881, term69881.getClass(), "first", term69881);
        setField(term69973, term69973.getClass(), "str", "");
        setField(term69881, term69881.getClass(), "last", term69973);
        term70085 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term70086 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term70085, term70085.getClass(), "functionName", null);
        setBooleanField(term70085, term70085.getClass(), "itsNeedsActivation", false);
        setIntField(term70085, term70085.getClass(), "itsFunctionType", 0);
        setBooleanField(term70085, term70085.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term70085, term70085.getClass(), "encodedSourceStart", 0);
        setIntField(term70085, term70085.getClass(), "encodedSourceEnd", 0);
        setField(term70085, term70085.getClass(), "sourceName", null);
        setIntField(term70085, term70085.getClass(), "baseLineno", 0);
        setIntField(term70085, term70085.getClass(), "endLineno", 0);
        setField(term70085, term70085.getClass(), "functions", null);
        setField(term70085, term70085.getClass(), "regexps", null);
        setField(term70085, term70085.getClass(), "itsVariables", null);
        setField(term70085, term70085.getClass(), "itsConst", null);
        setField(term70085, term70085.getClass(), "itsVariableNames", null);
        setIntField(term70085, term70085.getClass(), "varStart", 0);
        setField(term70085, term70085.getClass(), "compilerData", null);
        setIntField(term70085, term70085.getClass(), "type", 33);
        setField(term70085, term70085.getClass(), "next", null);
        setField(term70085, term70085.getClass(), "first", term70085);
        setField(term70086, term70086.getClass(), "str", "");
        setIntField(term70086, term70086.getClass(), "type", 0);
        setField(term70086, term70086.getClass(), "next", null);
        setField(term70086, term70086.getClass(), "first", null);
        setField(term70086, term70086.getClass(), "last", null);
        setField(term70086, term70086.getClass(), "propListHead", null);
        setIntField(term70086, term70086.getClass(), "sourcePosition", 0);
        setField(term70086, term70086.getClass(), "jsType", null);
        setField(term70086, term70086.getClass(), "parent", null);
        setField(term70085, term70085.getClass(), "last", term70086);
        setField(term70085, term70085.getClass(), "propListHead", null);
        setIntField(term70085, term70085.getClass(), "sourcePosition", 0);
        setField(term70085, term70085.getClass(), "jsType", null);
        setField(term70085, term70085.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term69881;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term69881, term70085));
        assertTrue(recursiveEquals(retValue, null));
    }

};


