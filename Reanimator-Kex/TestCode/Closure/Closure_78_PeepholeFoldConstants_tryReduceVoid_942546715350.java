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

public class PeepholeFoldConstants_tryReduceVoid_942546715350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80851;
     Object term81031;
     Object term93096;
     Object term93098;
     Object term92711;

    public PeepholeFoldConstants_tryReduceVoid_942546715350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80851 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term80941 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term80941, term80941.getClass(), "compiler", null);
        setField(term80851, term80851.getClass(), "currentTraversal", term80941);
        term81031 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term81121 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term81121, term81121.getClass(), "type", 2039351317);
        setField(term81031, term81031.getClass(), "first", term81121);
        setIntField(term81031, term81031.getClass(), "type", 89);
        term93096 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term93097 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term93097, term93097.getClass(), "compiler", null);
        setField(term93097, term93097.getClass(), "callback", null);
        setField(term93097, term93097.getClass(), "curNode", null);
        setField(term93097, term93097.getClass(), "scopes", null);
        setField(term93097, term93097.getClass(), "scopeRoots", null);
        setField(term93097, term93097.getClass(), "cfgs", null);
        setField(term93097, term93097.getClass(), "sourceName", null);
        setField(term93097, term93097.getClass(), "scopeCreator", null);
        setField(term93097, term93097.getClass(), "scopeCallback", null);
        setField(term93096, term93096.getClass(), "currentTraversal", term93097);
        term93098 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term93099 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term93098, term93098.getClass(), "encodedSourceStart", 0);
        setIntField(term93098, term93098.getClass(), "encodedSourceEnd", 0);
        setField(term93098, term93098.getClass(), "sourceName", null);
        setIntField(term93098, term93098.getClass(), "baseLineno", 0);
        setIntField(term93098, term93098.getClass(), "endLineno", 0);
        setField(term93098, term93098.getClass(), "functions", null);
        setField(term93098, term93098.getClass(), "regexps", null);
        setField(term93098, term93098.getClass(), "itsVariables", null);
        setField(term93098, term93098.getClass(), "itsConst", null);
        setField(term93098, term93098.getClass(), "itsVariableNames", null);
        setIntField(term93098, term93098.getClass(), "varStart", 0);
        setField(term93098, term93098.getClass(), "compilerData", null);
        setIntField(term93098, term93098.getClass(), "type", 89);
        setField(term93098, term93098.getClass(), "next", null);
        setIntField(term93099, term93099.getClass(), "encodedSourceStart", 0);
        setIntField(term93099, term93099.getClass(), "encodedSourceEnd", 0);
        setField(term93099, term93099.getClass(), "sourceName", null);
        setIntField(term93099, term93099.getClass(), "baseLineno", 0);
        setIntField(term93099, term93099.getClass(), "endLineno", 0);
        setField(term93099, term93099.getClass(), "functions", null);
        setField(term93099, term93099.getClass(), "regexps", null);
        setField(term93099, term93099.getClass(), "itsVariables", null);
        setField(term93099, term93099.getClass(), "itsConst", null);
        setField(term93099, term93099.getClass(), "itsVariableNames", null);
        setIntField(term93099, term93099.getClass(), "varStart", 0);
        setField(term93099, term93099.getClass(), "compilerData", null);
        setIntField(term93099, term93099.getClass(), "type", 2039351317);
        setField(term93099, term93099.getClass(), "next", null);
        setField(term93099, term93099.getClass(), "first", null);
        setField(term93099, term93099.getClass(), "last", null);
        setField(term93099, term93099.getClass(), "propListHead", null);
        setIntField(term93099, term93099.getClass(), "sourcePosition", 0);
        setField(term93099, term93099.getClass(), "jsType", null);
        setField(term93099, term93099.getClass(), "parent", null);
        setField(term93098, term93098.getClass(), "first", term93099);
        setField(term93098, term93098.getClass(), "last", null);
        setField(term93098, term93098.getClass(), "propListHead", null);
        setIntField(term93098, term93098.getClass(), "sourcePosition", 0);
        setField(term93098, term93098.getClass(), "jsType", null);
        setField(term93098, term93098.getClass(), "parent", null);
        term92711 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term92718 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term92711, term92711.getClass(), "encodedSourceStart", 0);
        setIntField(term92711, term92711.getClass(), "encodedSourceEnd", 0);
        setField(term92711, term92711.getClass(), "sourceName", null);
        setIntField(term92711, term92711.getClass(), "baseLineno", 0);
        setIntField(term92711, term92711.getClass(), "endLineno", 0);
        setField(term92711, term92711.getClass(), "functions", null);
        setField(term92711, term92711.getClass(), "regexps", null);
        setField(term92711, term92711.getClass(), "itsVariables", null);
        setField(term92711, term92711.getClass(), "itsConst", null);
        setField(term92711, term92711.getClass(), "itsVariableNames", null);
        setIntField(term92711, term92711.getClass(), "varStart", 0);
        setField(term92711, term92711.getClass(), "compilerData", null);
        setIntField(term92711, term92711.getClass(), "type", 89);
        setField(term92711, term92711.getClass(), "next", null);
        setIntField(term92718, term92718.getClass(), "encodedSourceStart", 0);
        setIntField(term92718, term92718.getClass(), "encodedSourceEnd", 0);
        setField(term92718, term92718.getClass(), "sourceName", null);
        setIntField(term92718, term92718.getClass(), "baseLineno", 0);
        setIntField(term92718, term92718.getClass(), "endLineno", 0);
        setField(term92718, term92718.getClass(), "functions", null);
        setField(term92718, term92718.getClass(), "regexps", null);
        setField(term92718, term92718.getClass(), "itsVariables", null);
        setField(term92718, term92718.getClass(), "itsConst", null);
        setField(term92718, term92718.getClass(), "itsVariableNames", null);
        setIntField(term92718, term92718.getClass(), "varStart", 0);
        setField(term92718, term92718.getClass(), "compilerData", null);
        setIntField(term92718, term92718.getClass(), "type", 2039351317);
        setField(term92718, term92718.getClass(), "next", null);
        setField(term92718, term92718.getClass(), "first", null);
        setField(term92718, term92718.getClass(), "last", null);
        setField(term92718, term92718.getClass(), "propListHead", null);
        setIntField(term92718, term92718.getClass(), "sourcePosition", 0);
        setField(term92718, term92718.getClass(), "jsType", null);
        setField(term92718, term92718.getClass(), "parent", null);
        setField(term92711, term92711.getClass(), "first", term92718);
        setField(term92711, term92711.getClass(), "last", null);
        setField(term92711, term92711.getClass(), "propListHead", null);
        setIntField(term92711, term92711.getClass(), "sourcePosition", 0);
        setField(term92711, term92711.getClass(), "jsType", null);
        setField(term92711, term92711.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term81031;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term80851, args);
        assertTrue(recursiveEquals(term80851, term93096));
        assertTrue(recursiveEquals(term81031, term93098));
        assertTrue(recursiveEquals(retValue, term92711));
    }

};


