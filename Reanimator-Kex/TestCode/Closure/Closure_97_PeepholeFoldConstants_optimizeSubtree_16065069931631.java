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

public class PeepholeFoldConstants_optimizeSubtree_16065069931631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654168;
     Object term654258;
     Object term654961;
     Object term654962;
     Object term654853;

    public PeepholeFoldConstants_optimizeSubtree_16065069931631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654168 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term654258 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term654348 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term654438 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term654258, term654258.getClass(), "type", 35);
        setField(term654348, term654348.getClass(), "next", term654438);
        setIntField(term654348, term654348.getClass(), "type", 63);
        setField(term654258, term654258.getClass(), "first", term654348);
        term654961 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term654961, term654961.getClass(), "currentTraversal", null);
        term654962 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term654963 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term654964 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term654962, term654962.getClass(), "encodedSourceStart", 0);
        setIntField(term654962, term654962.getClass(), "encodedSourceEnd", 0);
        setField(term654962, term654962.getClass(), "sourceName", null);
        setIntField(term654962, term654962.getClass(), "baseLineno", 0);
        setIntField(term654962, term654962.getClass(), "endLineno", 0);
        setField(term654962, term654962.getClass(), "functions", null);
        setField(term654962, term654962.getClass(), "regexps", null);
        setField(term654962, term654962.getClass(), "itsVariables", null);
        setField(term654962, term654962.getClass(), "itsConst", null);
        setField(term654962, term654962.getClass(), "itsVariableNames", null);
        setIntField(term654962, term654962.getClass(), "varStart", 0);
        setField(term654962, term654962.getClass(), "compilerData", null);
        setIntField(term654962, term654962.getClass(), "type", 35);
        setField(term654962, term654962.getClass(), "next", null);
        setIntField(term654963, term654963.getClass(), "encodedSourceStart", 0);
        setIntField(term654963, term654963.getClass(), "encodedSourceEnd", 0);
        setField(term654963, term654963.getClass(), "sourceName", null);
        setIntField(term654963, term654963.getClass(), "baseLineno", 0);
        setIntField(term654963, term654963.getClass(), "endLineno", 0);
        setField(term654963, term654963.getClass(), "functions", null);
        setField(term654963, term654963.getClass(), "regexps", null);
        setField(term654963, term654963.getClass(), "itsVariables", null);
        setField(term654963, term654963.getClass(), "itsConst", null);
        setField(term654963, term654963.getClass(), "itsVariableNames", null);
        setIntField(term654963, term654963.getClass(), "varStart", 0);
        setField(term654963, term654963.getClass(), "compilerData", null);
        setIntField(term654963, term654963.getClass(), "type", 63);
        setIntField(term654964, term654964.getClass(), "encodedSourceStart", 0);
        setIntField(term654964, term654964.getClass(), "encodedSourceEnd", 0);
        setField(term654964, term654964.getClass(), "sourceName", null);
        setIntField(term654964, term654964.getClass(), "baseLineno", 0);
        setIntField(term654964, term654964.getClass(), "endLineno", 0);
        setField(term654964, term654964.getClass(), "functions", null);
        setField(term654964, term654964.getClass(), "regexps", null);
        setField(term654964, term654964.getClass(), "itsVariables", null);
        setField(term654964, term654964.getClass(), "itsConst", null);
        setField(term654964, term654964.getClass(), "itsVariableNames", null);
        setIntField(term654964, term654964.getClass(), "varStart", 0);
        setField(term654964, term654964.getClass(), "compilerData", null);
        setIntField(term654964, term654964.getClass(), "type", 0);
        setField(term654964, term654964.getClass(), "next", null);
        setField(term654964, term654964.getClass(), "first", null);
        setField(term654964, term654964.getClass(), "last", null);
        setField(term654964, term654964.getClass(), "propListHead", null);
        setIntField(term654964, term654964.getClass(), "sourcePosition", 0);
        setField(term654964, term654964.getClass(), "jsType", null);
        setField(term654964, term654964.getClass(), "parent", null);
        setField(term654963, term654963.getClass(), "next", term654964);
        setField(term654963, term654963.getClass(), "first", null);
        setField(term654963, term654963.getClass(), "last", null);
        setField(term654963, term654963.getClass(), "propListHead", null);
        setIntField(term654963, term654963.getClass(), "sourcePosition", 0);
        setField(term654963, term654963.getClass(), "jsType", null);
        setField(term654963, term654963.getClass(), "parent", null);
        setField(term654962, term654962.getClass(), "first", term654963);
        setField(term654962, term654962.getClass(), "last", null);
        setField(term654962, term654962.getClass(), "propListHead", null);
        setIntField(term654962, term654962.getClass(), "sourcePosition", 0);
        setField(term654962, term654962.getClass(), "jsType", null);
        setField(term654962, term654962.getClass(), "parent", null);
        term654853 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term654860 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term654867 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term654853, term654853.getClass(), "encodedSourceStart", 0);
        setIntField(term654853, term654853.getClass(), "encodedSourceEnd", 0);
        setField(term654853, term654853.getClass(), "sourceName", null);
        setIntField(term654853, term654853.getClass(), "baseLineno", 0);
        setIntField(term654853, term654853.getClass(), "endLineno", 0);
        setField(term654853, term654853.getClass(), "functions", null);
        setField(term654853, term654853.getClass(), "regexps", null);
        setField(term654853, term654853.getClass(), "itsVariables", null);
        setField(term654853, term654853.getClass(), "itsConst", null);
        setField(term654853, term654853.getClass(), "itsVariableNames", null);
        setIntField(term654853, term654853.getClass(), "varStart", 0);
        setField(term654853, term654853.getClass(), "compilerData", null);
        setIntField(term654853, term654853.getClass(), "type", 35);
        setField(term654853, term654853.getClass(), "next", null);
        setIntField(term654860, term654860.getClass(), "encodedSourceStart", 0);
        setIntField(term654860, term654860.getClass(), "encodedSourceEnd", 0);
        setField(term654860, term654860.getClass(), "sourceName", null);
        setIntField(term654860, term654860.getClass(), "baseLineno", 0);
        setIntField(term654860, term654860.getClass(), "endLineno", 0);
        setField(term654860, term654860.getClass(), "functions", null);
        setField(term654860, term654860.getClass(), "regexps", null);
        setField(term654860, term654860.getClass(), "itsVariables", null);
        setField(term654860, term654860.getClass(), "itsConst", null);
        setField(term654860, term654860.getClass(), "itsVariableNames", null);
        setIntField(term654860, term654860.getClass(), "varStart", 0);
        setField(term654860, term654860.getClass(), "compilerData", null);
        setIntField(term654860, term654860.getClass(), "type", 63);
        setIntField(term654867, term654867.getClass(), "encodedSourceStart", 0);
        setIntField(term654867, term654867.getClass(), "encodedSourceEnd", 0);
        setField(term654867, term654867.getClass(), "sourceName", null);
        setIntField(term654867, term654867.getClass(), "baseLineno", 0);
        setIntField(term654867, term654867.getClass(), "endLineno", 0);
        setField(term654867, term654867.getClass(), "functions", null);
        setField(term654867, term654867.getClass(), "regexps", null);
        setField(term654867, term654867.getClass(), "itsVariables", null);
        setField(term654867, term654867.getClass(), "itsConst", null);
        setField(term654867, term654867.getClass(), "itsVariableNames", null);
        setIntField(term654867, term654867.getClass(), "varStart", 0);
        setField(term654867, term654867.getClass(), "compilerData", null);
        setIntField(term654867, term654867.getClass(), "type", 0);
        setField(term654867, term654867.getClass(), "next", null);
        setField(term654867, term654867.getClass(), "first", null);
        setField(term654867, term654867.getClass(), "last", null);
        setField(term654867, term654867.getClass(), "propListHead", null);
        setIntField(term654867, term654867.getClass(), "sourcePosition", 0);
        setField(term654867, term654867.getClass(), "jsType", null);
        setField(term654867, term654867.getClass(), "parent", null);
        setField(term654860, term654860.getClass(), "next", term654867);
        setField(term654860, term654860.getClass(), "first", null);
        setField(term654860, term654860.getClass(), "last", null);
        setField(term654860, term654860.getClass(), "propListHead", null);
        setIntField(term654860, term654860.getClass(), "sourcePosition", 0);
        setField(term654860, term654860.getClass(), "jsType", null);
        setField(term654860, term654860.getClass(), "parent", null);
        setField(term654853, term654853.getClass(), "first", term654860);
        setField(term654853, term654853.getClass(), "last", null);
        setField(term654853, term654853.getClass(), "propListHead", null);
        setIntField(term654853, term654853.getClass(), "sourcePosition", 0);
        setField(term654853, term654853.getClass(), "jsType", null);
        setField(term654853, term654853.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term654258;
        Object retValue = callMethod(klass, "optimizeSubtree", argTypes, term654168, args);
        assertTrue(recursiveEquals(term654168, term654961));
        assertTrue(recursiveEquals(term654258, term654962));
        assertTrue(recursiveEquals(retValue, term654853));
    }

};


