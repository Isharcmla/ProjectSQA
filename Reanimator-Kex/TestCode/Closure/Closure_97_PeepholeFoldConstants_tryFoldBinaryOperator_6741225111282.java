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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428456;
     Object term428542;
     Object term429015;
     Object term429016;
     Object term428963;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428456 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term428542 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term428612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term428542, term428542.getClass(), "first", term428542);
        setField(term428542, term428542.getClass(), "next", term428612);
        setIntField(term428542, term428542.getClass(), "type", 16);
        term429015 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term429015, term429015.getClass(), "currentTraversal", null);
        term429016 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term429017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term429016, term429016.getClass(), "functionName", null);
        setBooleanField(term429016, term429016.getClass(), "itsNeedsActivation", false);
        setIntField(term429016, term429016.getClass(), "itsFunctionType", 0);
        setBooleanField(term429016, term429016.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term429016, term429016.getClass(), "encodedSourceStart", 0);
        setIntField(term429016, term429016.getClass(), "encodedSourceEnd", 0);
        setField(term429016, term429016.getClass(), "sourceName", null);
        setIntField(term429016, term429016.getClass(), "baseLineno", 0);
        setIntField(term429016, term429016.getClass(), "endLineno", 0);
        setField(term429016, term429016.getClass(), "functions", null);
        setField(term429016, term429016.getClass(), "regexps", null);
        setField(term429016, term429016.getClass(), "itsVariables", null);
        setField(term429016, term429016.getClass(), "itsConst", null);
        setField(term429016, term429016.getClass(), "itsVariableNames", null);
        setIntField(term429016, term429016.getClass(), "varStart", 0);
        setField(term429016, term429016.getClass(), "compilerData", null);
        setIntField(term429016, term429016.getClass(), "type", 16);
        setIntField(term429017, term429017.getClass(), "type", 0);
        setField(term429017, term429017.getClass(), "next", null);
        setField(term429017, term429017.getClass(), "first", null);
        setField(term429017, term429017.getClass(), "last", null);
        setField(term429017, term429017.getClass(), "propListHead", null);
        setIntField(term429017, term429017.getClass(), "sourcePosition", 0);
        setField(term429017, term429017.getClass(), "jsType", null);
        setField(term429017, term429017.getClass(), "parent", null);
        setField(term429016, term429016.getClass(), "next", term429017);
        setField(term429016, term429016.getClass(), "first", term429016);
        setField(term429016, term429016.getClass(), "last", null);
        setField(term429016, term429016.getClass(), "propListHead", null);
        setIntField(term429016, term429016.getClass(), "sourcePosition", 0);
        setField(term429016, term429016.getClass(), "jsType", null);
        setField(term429016, term429016.getClass(), "parent", null);
        term428963 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term428973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term428963, term428963.getClass(), "functionName", null);
        setBooleanField(term428963, term428963.getClass(), "itsNeedsActivation", false);
        setIntField(term428963, term428963.getClass(), "itsFunctionType", 0);
        setBooleanField(term428963, term428963.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term428963, term428963.getClass(), "encodedSourceStart", 0);
        setIntField(term428963, term428963.getClass(), "encodedSourceEnd", 0);
        setField(term428963, term428963.getClass(), "sourceName", null);
        setIntField(term428963, term428963.getClass(), "baseLineno", 0);
        setIntField(term428963, term428963.getClass(), "endLineno", 0);
        setField(term428963, term428963.getClass(), "functions", null);
        setField(term428963, term428963.getClass(), "regexps", null);
        setField(term428963, term428963.getClass(), "itsVariables", null);
        setField(term428963, term428963.getClass(), "itsConst", null);
        setField(term428963, term428963.getClass(), "itsVariableNames", null);
        setIntField(term428963, term428963.getClass(), "varStart", 0);
        setField(term428963, term428963.getClass(), "compilerData", null);
        setIntField(term428963, term428963.getClass(), "type", 16);
        setIntField(term428973, term428973.getClass(), "type", 0);
        setField(term428973, term428973.getClass(), "next", null);
        setField(term428973, term428973.getClass(), "first", null);
        setField(term428973, term428973.getClass(), "last", null);
        setField(term428973, term428973.getClass(), "propListHead", null);
        setIntField(term428973, term428973.getClass(), "sourcePosition", 0);
        setField(term428973, term428973.getClass(), "jsType", null);
        setField(term428973, term428973.getClass(), "parent", null);
        setField(term428963, term428963.getClass(), "next", term428973);
        setField(term428963, term428963.getClass(), "first", term428963);
        setField(term428963, term428963.getClass(), "last", null);
        setField(term428963, term428963.getClass(), "propListHead", null);
        setIntField(term428963, term428963.getClass(), "sourcePosition", 0);
        setField(term428963, term428963.getClass(), "jsType", null);
        setField(term428963, term428963.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term428542;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term428456, args);
        assertTrue(recursiveEquals(term428456, term429015));
        assertTrue(recursiveEquals(term428542, term429016));
        assertTrue(recursiveEquals(retValue, term428963));
    }

};


