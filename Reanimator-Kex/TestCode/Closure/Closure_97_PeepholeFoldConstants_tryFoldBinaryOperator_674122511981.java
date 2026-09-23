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

public class PeepholeFoldConstants_tryFoldBinaryOperator_674122511981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310580;
     Object term310670;
     Object term311238;
     Object term311239;
     Object term311174;

    public PeepholeFoldConstants_tryFoldBinaryOperator_674122511981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310580 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term310670 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term310760 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term310850 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term310760, term310760.getClass(), "next", term310850);
        setIntField(term310760, term310760.getClass(), "type", 39);
        setField(term310670, term310670.getClass(), "first", term310760);
        setIntField(term310670, term310670.getClass(), "type", 24);
        term311238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term311238, term311238.getClass(), "currentTraversal", null);
        term311239 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term311240 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term311241 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term311239, term311239.getClass(), "encodedSourceStart", 0);
        setIntField(term311239, term311239.getClass(), "encodedSourceEnd", 0);
        setField(term311239, term311239.getClass(), "sourceName", null);
        setIntField(term311239, term311239.getClass(), "baseLineno", 0);
        setIntField(term311239, term311239.getClass(), "endLineno", 0);
        setField(term311239, term311239.getClass(), "functions", null);
        setField(term311239, term311239.getClass(), "regexps", null);
        setField(term311239, term311239.getClass(), "itsVariables", null);
        setField(term311239, term311239.getClass(), "itsConst", null);
        setField(term311239, term311239.getClass(), "itsVariableNames", null);
        setIntField(term311239, term311239.getClass(), "varStart", 0);
        setField(term311239, term311239.getClass(), "compilerData", null);
        setIntField(term311239, term311239.getClass(), "type", 24);
        setField(term311239, term311239.getClass(), "next", null);
        setIntField(term311240, term311240.getClass(), "encodedSourceStart", 0);
        setIntField(term311240, term311240.getClass(), "encodedSourceEnd", 0);
        setField(term311240, term311240.getClass(), "sourceName", null);
        setIntField(term311240, term311240.getClass(), "baseLineno", 0);
        setIntField(term311240, term311240.getClass(), "endLineno", 0);
        setField(term311240, term311240.getClass(), "functions", null);
        setField(term311240, term311240.getClass(), "regexps", null);
        setField(term311240, term311240.getClass(), "itsVariables", null);
        setField(term311240, term311240.getClass(), "itsConst", null);
        setField(term311240, term311240.getClass(), "itsVariableNames", null);
        setIntField(term311240, term311240.getClass(), "varStart", 0);
        setField(term311240, term311240.getClass(), "compilerData", null);
        setIntField(term311240, term311240.getClass(), "type", 39);
        setIntField(term311241, term311241.getClass(), "encodedSourceStart", 0);
        setIntField(term311241, term311241.getClass(), "encodedSourceEnd", 0);
        setField(term311241, term311241.getClass(), "sourceName", null);
        setIntField(term311241, term311241.getClass(), "baseLineno", 0);
        setIntField(term311241, term311241.getClass(), "endLineno", 0);
        setField(term311241, term311241.getClass(), "functions", null);
        setField(term311241, term311241.getClass(), "regexps", null);
        setField(term311241, term311241.getClass(), "itsVariables", null);
        setField(term311241, term311241.getClass(), "itsConst", null);
        setField(term311241, term311241.getClass(), "itsVariableNames", null);
        setIntField(term311241, term311241.getClass(), "varStart", 0);
        setField(term311241, term311241.getClass(), "compilerData", null);
        setIntField(term311241, term311241.getClass(), "type", 0);
        setField(term311241, term311241.getClass(), "next", null);
        setField(term311241, term311241.getClass(), "first", null);
        setField(term311241, term311241.getClass(), "last", null);
        setField(term311241, term311241.getClass(), "propListHead", null);
        setIntField(term311241, term311241.getClass(), "sourcePosition", 0);
        setField(term311241, term311241.getClass(), "jsType", null);
        setField(term311241, term311241.getClass(), "parent", null);
        setField(term311240, term311240.getClass(), "next", term311241);
        setField(term311240, term311240.getClass(), "first", null);
        setField(term311240, term311240.getClass(), "last", null);
        setField(term311240, term311240.getClass(), "propListHead", null);
        setIntField(term311240, term311240.getClass(), "sourcePosition", 0);
        setField(term311240, term311240.getClass(), "jsType", null);
        setField(term311240, term311240.getClass(), "parent", null);
        setField(term311239, term311239.getClass(), "first", term311240);
        setField(term311239, term311239.getClass(), "last", null);
        setField(term311239, term311239.getClass(), "propListHead", null);
        setIntField(term311239, term311239.getClass(), "sourcePosition", 0);
        setField(term311239, term311239.getClass(), "jsType", null);
        setField(term311239, term311239.getClass(), "parent", null);
        term311174 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term311181 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term311188 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term311174, term311174.getClass(), "encodedSourceStart", 0);
        setIntField(term311174, term311174.getClass(), "encodedSourceEnd", 0);
        setField(term311174, term311174.getClass(), "sourceName", null);
        setIntField(term311174, term311174.getClass(), "baseLineno", 0);
        setIntField(term311174, term311174.getClass(), "endLineno", 0);
        setField(term311174, term311174.getClass(), "functions", null);
        setField(term311174, term311174.getClass(), "regexps", null);
        setField(term311174, term311174.getClass(), "itsVariables", null);
        setField(term311174, term311174.getClass(), "itsConst", null);
        setField(term311174, term311174.getClass(), "itsVariableNames", null);
        setIntField(term311174, term311174.getClass(), "varStart", 0);
        setField(term311174, term311174.getClass(), "compilerData", null);
        setIntField(term311174, term311174.getClass(), "type", 24);
        setField(term311174, term311174.getClass(), "next", null);
        setIntField(term311181, term311181.getClass(), "encodedSourceStart", 0);
        setIntField(term311181, term311181.getClass(), "encodedSourceEnd", 0);
        setField(term311181, term311181.getClass(), "sourceName", null);
        setIntField(term311181, term311181.getClass(), "baseLineno", 0);
        setIntField(term311181, term311181.getClass(), "endLineno", 0);
        setField(term311181, term311181.getClass(), "functions", null);
        setField(term311181, term311181.getClass(), "regexps", null);
        setField(term311181, term311181.getClass(), "itsVariables", null);
        setField(term311181, term311181.getClass(), "itsConst", null);
        setField(term311181, term311181.getClass(), "itsVariableNames", null);
        setIntField(term311181, term311181.getClass(), "varStart", 0);
        setField(term311181, term311181.getClass(), "compilerData", null);
        setIntField(term311181, term311181.getClass(), "type", 39);
        setIntField(term311188, term311188.getClass(), "encodedSourceStart", 0);
        setIntField(term311188, term311188.getClass(), "encodedSourceEnd", 0);
        setField(term311188, term311188.getClass(), "sourceName", null);
        setIntField(term311188, term311188.getClass(), "baseLineno", 0);
        setIntField(term311188, term311188.getClass(), "endLineno", 0);
        setField(term311188, term311188.getClass(), "functions", null);
        setField(term311188, term311188.getClass(), "regexps", null);
        setField(term311188, term311188.getClass(), "itsVariables", null);
        setField(term311188, term311188.getClass(), "itsConst", null);
        setField(term311188, term311188.getClass(), "itsVariableNames", null);
        setIntField(term311188, term311188.getClass(), "varStart", 0);
        setField(term311188, term311188.getClass(), "compilerData", null);
        setIntField(term311188, term311188.getClass(), "type", 0);
        setField(term311188, term311188.getClass(), "next", null);
        setField(term311188, term311188.getClass(), "first", null);
        setField(term311188, term311188.getClass(), "last", null);
        setField(term311188, term311188.getClass(), "propListHead", null);
        setIntField(term311188, term311188.getClass(), "sourcePosition", 0);
        setField(term311188, term311188.getClass(), "jsType", null);
        setField(term311188, term311188.getClass(), "parent", null);
        setField(term311181, term311181.getClass(), "next", term311188);
        setField(term311181, term311181.getClass(), "first", null);
        setField(term311181, term311181.getClass(), "last", null);
        setField(term311181, term311181.getClass(), "propListHead", null);
        setIntField(term311181, term311181.getClass(), "sourcePosition", 0);
        setField(term311181, term311181.getClass(), "jsType", null);
        setField(term311181, term311181.getClass(), "parent", null);
        setField(term311174, term311174.getClass(), "first", term311181);
        setField(term311174, term311174.getClass(), "last", null);
        setField(term311174, term311174.getClass(), "propListHead", null);
        setIntField(term311174, term311174.getClass(), "sourcePosition", 0);
        setField(term311174, term311174.getClass(), "jsType", null);
        setField(term311174, term311174.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term310670;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term310580, args);
        assertTrue(recursiveEquals(term310580, term311238));
        assertTrue(recursiveEquals(term310670, term311239));
        assertTrue(recursiveEquals(retValue, term311174));
    }

};


