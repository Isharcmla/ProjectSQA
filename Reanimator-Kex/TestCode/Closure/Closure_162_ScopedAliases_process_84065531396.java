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

public class ScopedAliases_process_84065531396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50543;
     Object term50613;
     Object term51072;
     Object term51073;

    public ScopedAliases_process_84065531396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50543 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term50543, term50543.getClass(), "compiler", null);
        term50613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50699 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term50613, term50613.getClass(), "type", 0);
        setField(term50613, term50613.getClass(), "parent", null);
        setField(term50613, term50613.getClass(), "first", term50699);
        term51072 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term51072, term51072.getClass(), "compiler", null);
        setField(term51072, term51072.getClass(), "preprocessorSymbolTable", null);
        setField(term51072, term51072.getClass(), "transformationHandler", null);
        term51073 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51074 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term51073, term51073.getClass(), "type", 0);
        setField(term51073, term51073.getClass(), "next", null);
        setField(term51074, term51074.getClass(), "functionName", null);
        setBooleanField(term51074, term51074.getClass(), "itsNeedsActivation", false);
        setIntField(term51074, term51074.getClass(), "itsFunctionType", 0);
        setBooleanField(term51074, term51074.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term51074, term51074.getClass(), "encodedSourceStart", 0);
        setIntField(term51074, term51074.getClass(), "encodedSourceEnd", 0);
        setField(term51074, term51074.getClass(), "sourceName", null);
        setIntField(term51074, term51074.getClass(), "baseLineno", 0);
        setIntField(term51074, term51074.getClass(), "endLineno", 0);
        setField(term51074, term51074.getClass(), "functions", null);
        setField(term51074, term51074.getClass(), "regexps", null);
        setField(term51074, term51074.getClass(), "itsVariables", null);
        setField(term51074, term51074.getClass(), "itsConst", null);
        setField(term51074, term51074.getClass(), "itsVariableNames", null);
        setIntField(term51074, term51074.getClass(), "varStart", 0);
        setField(term51074, term51074.getClass(), "compilerData", null);
        setIntField(term51074, term51074.getClass(), "type", 0);
        setField(term51074, term51074.getClass(), "next", null);
        setField(term51074, term51074.getClass(), "first", null);
        setField(term51074, term51074.getClass(), "last", null);
        setField(term51074, term51074.getClass(), "propListHead", null);
        setIntField(term51074, term51074.getClass(), "sourcePosition", 0);
        setField(term51074, term51074.getClass(), "jsType", null);
        setField(term51074, term51074.getClass(), "parent", null);
        setField(term51073, term51073.getClass(), "first", term51074);
        setField(term51073, term51073.getClass(), "last", null);
        setField(term51073, term51073.getClass(), "propListHead", null);
        setIntField(term51073, term51073.getClass(), "sourcePosition", 0);
        setField(term51073, term51073.getClass(), "jsType", null);
        setField(term51073, term51073.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term50613;
        callMethod(klass, "process", argTypes, term50543, args);
        assertTrue(recursiveEquals(term50543, term51072));
        assertTrue(recursiveEquals(term50613, null));
    }

};


