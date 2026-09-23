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

public class PeepholeFoldConstants_tryFoldAndOr_425870290352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70517;
     Object term70603;
     Object term70693;
     Object term70783;
     Object term82112;
     Object term82113;
     Object term82114;
     Object term82115;
     Object term82056;

    public PeepholeFoldConstants_tryFoldAndOr_425870290352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70517 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term70603 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term70603, term70603.getClass(), "parent", null);
        setIntField(term70603, term70603.getClass(), "type", 0);
        term70693 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term70693, term70693.getClass(), "type", 0);
        term70783 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term82112 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term82112, term82112.getClass(), "currentTraversal", null);
        term82113 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82113, term82113.getClass(), "functionName", null);
        setBooleanField(term82113, term82113.getClass(), "itsNeedsActivation", false);
        setIntField(term82113, term82113.getClass(), "itsFunctionType", 0);
        setBooleanField(term82113, term82113.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82113, term82113.getClass(), "encodedSourceStart", 0);
        setIntField(term82113, term82113.getClass(), "encodedSourceEnd", 0);
        setField(term82113, term82113.getClass(), "sourceName", null);
        setIntField(term82113, term82113.getClass(), "baseLineno", 0);
        setIntField(term82113, term82113.getClass(), "endLineno", 0);
        setField(term82113, term82113.getClass(), "functions", null);
        setField(term82113, term82113.getClass(), "regexps", null);
        setField(term82113, term82113.getClass(), "itsVariables", null);
        setField(term82113, term82113.getClass(), "itsConst", null);
        setField(term82113, term82113.getClass(), "itsVariableNames", null);
        setIntField(term82113, term82113.getClass(), "varStart", 0);
        setField(term82113, term82113.getClass(), "compilerData", null);
        setIntField(term82113, term82113.getClass(), "type", 0);
        setField(term82113, term82113.getClass(), "next", null);
        setField(term82113, term82113.getClass(), "first", null);
        setField(term82113, term82113.getClass(), "last", null);
        setField(term82113, term82113.getClass(), "propListHead", null);
        setIntField(term82113, term82113.getClass(), "sourcePosition", 0);
        setField(term82113, term82113.getClass(), "jsType", null);
        setField(term82113, term82113.getClass(), "parent", null);
        term82114 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term82114, term82114.getClass(), "encodedSourceStart", 0);
        setIntField(term82114, term82114.getClass(), "encodedSourceEnd", 0);
        setField(term82114, term82114.getClass(), "sourceName", null);
        setIntField(term82114, term82114.getClass(), "baseLineno", 0);
        setIntField(term82114, term82114.getClass(), "endLineno", 0);
        setField(term82114, term82114.getClass(), "functions", null);
        setField(term82114, term82114.getClass(), "regexps", null);
        setField(term82114, term82114.getClass(), "itsVariables", null);
        setField(term82114, term82114.getClass(), "itsConst", null);
        setField(term82114, term82114.getClass(), "itsVariableNames", null);
        setIntField(term82114, term82114.getClass(), "varStart", 0);
        setField(term82114, term82114.getClass(), "compilerData", null);
        setIntField(term82114, term82114.getClass(), "type", 0);
        setField(term82114, term82114.getClass(), "next", null);
        setField(term82114, term82114.getClass(), "first", null);
        setField(term82114, term82114.getClass(), "last", null);
        setField(term82114, term82114.getClass(), "propListHead", null);
        setIntField(term82114, term82114.getClass(), "sourcePosition", 0);
        setField(term82114, term82114.getClass(), "jsType", null);
        setField(term82114, term82114.getClass(), "parent", null);
        term82115 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term82115, term82115.getClass(), "encodedSourceStart", 0);
        setIntField(term82115, term82115.getClass(), "encodedSourceEnd", 0);
        setField(term82115, term82115.getClass(), "sourceName", null);
        setIntField(term82115, term82115.getClass(), "baseLineno", 0);
        setIntField(term82115, term82115.getClass(), "endLineno", 0);
        setField(term82115, term82115.getClass(), "functions", null);
        setField(term82115, term82115.getClass(), "regexps", null);
        setField(term82115, term82115.getClass(), "itsVariables", null);
        setField(term82115, term82115.getClass(), "itsConst", null);
        setField(term82115, term82115.getClass(), "itsVariableNames", null);
        setIntField(term82115, term82115.getClass(), "varStart", 0);
        setField(term82115, term82115.getClass(), "compilerData", null);
        setIntField(term82115, term82115.getClass(), "type", 0);
        setField(term82115, term82115.getClass(), "next", null);
        setField(term82115, term82115.getClass(), "first", null);
        setField(term82115, term82115.getClass(), "last", null);
        setField(term82115, term82115.getClass(), "propListHead", null);
        setIntField(term82115, term82115.getClass(), "sourcePosition", 0);
        setField(term82115, term82115.getClass(), "jsType", null);
        setField(term82115, term82115.getClass(), "parent", null);
        term82056 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term82056, term82056.getClass(), "functionName", null);
        setBooleanField(term82056, term82056.getClass(), "itsNeedsActivation", false);
        setIntField(term82056, term82056.getClass(), "itsFunctionType", 0);
        setBooleanField(term82056, term82056.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term82056, term82056.getClass(), "encodedSourceStart", 0);
        setIntField(term82056, term82056.getClass(), "encodedSourceEnd", 0);
        setField(term82056, term82056.getClass(), "sourceName", null);
        setIntField(term82056, term82056.getClass(), "baseLineno", 0);
        setIntField(term82056, term82056.getClass(), "endLineno", 0);
        setField(term82056, term82056.getClass(), "functions", null);
        setField(term82056, term82056.getClass(), "regexps", null);
        setField(term82056, term82056.getClass(), "itsVariables", null);
        setField(term82056, term82056.getClass(), "itsConst", null);
        setField(term82056, term82056.getClass(), "itsVariableNames", null);
        setIntField(term82056, term82056.getClass(), "varStart", 0);
        setField(term82056, term82056.getClass(), "compilerData", null);
        setIntField(term82056, term82056.getClass(), "type", 0);
        setField(term82056, term82056.getClass(), "next", null);
        setField(term82056, term82056.getClass(), "first", null);
        setField(term82056, term82056.getClass(), "last", null);
        setField(term82056, term82056.getClass(), "propListHead", null);
        setIntField(term82056, term82056.getClass(), "sourcePosition", 0);
        setField(term82056, term82056.getClass(), "jsType", null);
        setField(term82056, term82056.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term70603;
        args[1] = term70693;
        args[2] = term70783;
        Object retValue = callMethod(klass, "tryFoldAndOr", argTypes, term70517, args);
        assertTrue(recursiveEquals(term70517, term82112));
        assertTrue(recursiveEquals(term70603, term82113));
        assertTrue(recursiveEquals(term70693, term82114));
        assertTrue(recursiveEquals(term70783, term82115));
        assertTrue(recursiveEquals(retValue, term82056));
    }

};


