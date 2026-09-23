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

public class PeepholeFoldConstants_tryFoldAndOr_425870290452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104559;
     Object term104645;
     Object term104731;
     Object term104823;
     Object term105077;
     Object term105078;
     Object term105079;
     Object term105080;
     Object term105023;

    public PeepholeFoldConstants_tryFoldAndOr_425870290452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term104645 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term104645, term104645.getClass(), "parent", null);
        setIntField(term104645, term104645.getClass(), "type", 0);
        term104731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term104731, term104731.getClass(), "type", 0);
        term104823 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term105077 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term105077, term105077.getClass(), "currentTraversal", null);
        term105078 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term105078, term105078.getClass(), "functionName", null);
        setBooleanField(term105078, term105078.getClass(), "itsNeedsActivation", false);
        setIntField(term105078, term105078.getClass(), "itsFunctionType", 0);
        setBooleanField(term105078, term105078.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term105078, term105078.getClass(), "encodedSourceStart", 0);
        setIntField(term105078, term105078.getClass(), "encodedSourceEnd", 0);
        setField(term105078, term105078.getClass(), "sourceName", null);
        setIntField(term105078, term105078.getClass(), "baseLineno", 0);
        setIntField(term105078, term105078.getClass(), "endLineno", 0);
        setField(term105078, term105078.getClass(), "functions", null);
        setField(term105078, term105078.getClass(), "regexps", null);
        setField(term105078, term105078.getClass(), "itsVariables", null);
        setField(term105078, term105078.getClass(), "itsConst", null);
        setField(term105078, term105078.getClass(), "itsVariableNames", null);
        setIntField(term105078, term105078.getClass(), "varStart", 0);
        setField(term105078, term105078.getClass(), "compilerData", null);
        setIntField(term105078, term105078.getClass(), "type", 0);
        setField(term105078, term105078.getClass(), "next", null);
        setField(term105078, term105078.getClass(), "first", null);
        setField(term105078, term105078.getClass(), "last", null);
        setField(term105078, term105078.getClass(), "propListHead", null);
        setIntField(term105078, term105078.getClass(), "sourcePosition", 0);
        setField(term105078, term105078.getClass(), "jsType", null);
        setField(term105078, term105078.getClass(), "parent", null);
        term105079 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term105079, term105079.getClass(), "functionName", null);
        setBooleanField(term105079, term105079.getClass(), "itsNeedsActivation", false);
        setIntField(term105079, term105079.getClass(), "itsFunctionType", 0);
        setBooleanField(term105079, term105079.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term105079, term105079.getClass(), "encodedSourceStart", 0);
        setIntField(term105079, term105079.getClass(), "encodedSourceEnd", 0);
        setField(term105079, term105079.getClass(), "sourceName", null);
        setIntField(term105079, term105079.getClass(), "baseLineno", 0);
        setIntField(term105079, term105079.getClass(), "endLineno", 0);
        setField(term105079, term105079.getClass(), "functions", null);
        setField(term105079, term105079.getClass(), "regexps", null);
        setField(term105079, term105079.getClass(), "itsVariables", null);
        setField(term105079, term105079.getClass(), "itsConst", null);
        setField(term105079, term105079.getClass(), "itsVariableNames", null);
        setIntField(term105079, term105079.getClass(), "varStart", 0);
        setField(term105079, term105079.getClass(), "compilerData", null);
        setIntField(term105079, term105079.getClass(), "type", 0);
        setField(term105079, term105079.getClass(), "next", null);
        setField(term105079, term105079.getClass(), "first", null);
        setField(term105079, term105079.getClass(), "last", null);
        setField(term105079, term105079.getClass(), "propListHead", null);
        setIntField(term105079, term105079.getClass(), "sourcePosition", 0);
        setField(term105079, term105079.getClass(), "jsType", null);
        setField(term105079, term105079.getClass(), "parent", null);
        term105080 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term105080, term105080.getClass(), "str", null);
        setIntField(term105080, term105080.getClass(), "type", 0);
        setField(term105080, term105080.getClass(), "next", null);
        setField(term105080, term105080.getClass(), "first", null);
        setField(term105080, term105080.getClass(), "last", null);
        setField(term105080, term105080.getClass(), "propListHead", null);
        setIntField(term105080, term105080.getClass(), "sourcePosition", 0);
        setField(term105080, term105080.getClass(), "jsType", null);
        setField(term105080, term105080.getClass(), "parent", null);
        term105023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term105023, term105023.getClass(), "functionName", null);
        setBooleanField(term105023, term105023.getClass(), "itsNeedsActivation", false);
        setIntField(term105023, term105023.getClass(), "itsFunctionType", 0);
        setBooleanField(term105023, term105023.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term105023, term105023.getClass(), "encodedSourceStart", 0);
        setIntField(term105023, term105023.getClass(), "encodedSourceEnd", 0);
        setField(term105023, term105023.getClass(), "sourceName", null);
        setIntField(term105023, term105023.getClass(), "baseLineno", 0);
        setIntField(term105023, term105023.getClass(), "endLineno", 0);
        setField(term105023, term105023.getClass(), "functions", null);
        setField(term105023, term105023.getClass(), "regexps", null);
        setField(term105023, term105023.getClass(), "itsVariables", null);
        setField(term105023, term105023.getClass(), "itsConst", null);
        setField(term105023, term105023.getClass(), "itsVariableNames", null);
        setIntField(term105023, term105023.getClass(), "varStart", 0);
        setField(term105023, term105023.getClass(), "compilerData", null);
        setIntField(term105023, term105023.getClass(), "type", 0);
        setField(term105023, term105023.getClass(), "next", null);
        setField(term105023, term105023.getClass(), "first", null);
        setField(term105023, term105023.getClass(), "last", null);
        setField(term105023, term105023.getClass(), "propListHead", null);
        setIntField(term105023, term105023.getClass(), "sourcePosition", 0);
        setField(term105023, term105023.getClass(), "jsType", null);
        setField(term105023, term105023.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term104645;
        args[1] = term104731;
        args[2] = term104823;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term104559, args);
        assertTrue(recursiveEquals(term104559, term105077));
        assertTrue(recursiveEquals(term104645, term105078));
        assertTrue(recursiveEquals(term104731, term105079));
        assertTrue(recursiveEquals(term104823, term105080));
        assertTrue(recursiveEquals(retValue, term105023));
    }

};


