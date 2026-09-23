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

public class TypedScopeCreator_getPrototypePropertyOwner_120862705859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28938;
     Object term28952;

    public TypedScopeCreator_getPrototypePropertyOwner_120862705859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28938 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term28938, term28938.getClass(), "type", -34);
        term28952 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term28952, term28952.getClass(), "functionName", null);
        setBooleanField(term28952, term28952.getClass(), "itsNeedsActivation", false);
        setIntField(term28952, term28952.getClass(), "itsFunctionType", 0);
        setBooleanField(term28952, term28952.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term28952, term28952.getClass(), "encodedSourceStart", 0);
        setIntField(term28952, term28952.getClass(), "encodedSourceEnd", 0);
        setField(term28952, term28952.getClass(), "sourceName", null);
        setIntField(term28952, term28952.getClass(), "baseLineno", 0);
        setIntField(term28952, term28952.getClass(), "endLineno", 0);
        setField(term28952, term28952.getClass(), "functions", null);
        setField(term28952, term28952.getClass(), "regexps", null);
        setField(term28952, term28952.getClass(), "itsVariables", null);
        setField(term28952, term28952.getClass(), "itsConst", null);
        setField(term28952, term28952.getClass(), "itsVariableNames", null);
        setIntField(term28952, term28952.getClass(), "varStart", 0);
        setField(term28952, term28952.getClass(), "compilerData", null);
        setIntField(term28952, term28952.getClass(), "type", -34);
        setField(term28952, term28952.getClass(), "next", null);
        setField(term28952, term28952.getClass(), "first", null);
        setField(term28952, term28952.getClass(), "last", null);
        setField(term28952, term28952.getClass(), "propListHead", null);
        setIntField(term28952, term28952.getClass(), "sourcePosition", 0);
        setField(term28952, term28952.getClass(), "jsType", null);
        setField(term28952, term28952.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term28938;
        Object retValue = callMethod(klass, "getPrototypePropertyOwner", argTypes, null, args);
        assertTrue(recursiveEquals(term28938, term28952));
        assertTrue(recursiveEquals(retValue, null));
    }

};


