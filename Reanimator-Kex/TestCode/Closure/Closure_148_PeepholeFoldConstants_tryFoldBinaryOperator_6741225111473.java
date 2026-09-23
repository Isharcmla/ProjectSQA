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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365716;
     Object term365806;
     Object term366509;
     Object term366510;
     Object term366445;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365716 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term365806 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term365896 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term365986 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(term365896, term365896.getClass(), "next", term365986);
        setIntField(term365896, term365896.getClass(), "type", 39);
        setField(term365806, term365806.getClass(), "first", term365896);
        setIntField(term365806, term365806.getClass(), "type", 24);
        term366509 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term366509, term366509.getClass(), "currentTraversal", null);
        term366510 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term366511 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term366512 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term366510, term366510.getClass(), "encodedSourceStart", 0);
        setIntField(term366510, term366510.getClass(), "encodedSourceEnd", 0);
        setField(term366510, term366510.getClass(), "sourceName", null);
        setIntField(term366510, term366510.getClass(), "baseLineno", 0);
        setIntField(term366510, term366510.getClass(), "endLineno", 0);
        setField(term366510, term366510.getClass(), "functions", null);
        setField(term366510, term366510.getClass(), "regexps", null);
        setField(term366510, term366510.getClass(), "itsVariables", null);
        setField(term366510, term366510.getClass(), "itsConst", null);
        setField(term366510, term366510.getClass(), "itsVariableNames", null);
        setIntField(term366510, term366510.getClass(), "varStart", 0);
        setField(term366510, term366510.getClass(), "compilerData", null);
        setIntField(term366510, term366510.getClass(), "type", 24);
        setField(term366510, term366510.getClass(), "next", null);
        setIntField(term366511, term366511.getClass(), "encodedSourceStart", 0);
        setIntField(term366511, term366511.getClass(), "encodedSourceEnd", 0);
        setField(term366511, term366511.getClass(), "sourceName", null);
        setIntField(term366511, term366511.getClass(), "baseLineno", 0);
        setIntField(term366511, term366511.getClass(), "endLineno", 0);
        setField(term366511, term366511.getClass(), "functions", null);
        setField(term366511, term366511.getClass(), "regexps", null);
        setField(term366511, term366511.getClass(), "itsVariables", null);
        setField(term366511, term366511.getClass(), "itsConst", null);
        setField(term366511, term366511.getClass(), "itsVariableNames", null);
        setIntField(term366511, term366511.getClass(), "varStart", 0);
        setField(term366511, term366511.getClass(), "compilerData", null);
        setIntField(term366511, term366511.getClass(), "type", 39);
        setIntField(term366512, term366512.getClass(), "encodedSourceStart", 0);
        setIntField(term366512, term366512.getClass(), "encodedSourceEnd", 0);
        setField(term366512, term366512.getClass(), "sourceName", null);
        setIntField(term366512, term366512.getClass(), "baseLineno", 0);
        setIntField(term366512, term366512.getClass(), "endLineno", 0);
        setField(term366512, term366512.getClass(), "functions", null);
        setField(term366512, term366512.getClass(), "regexps", null);
        setField(term366512, term366512.getClass(), "itsVariables", null);
        setField(term366512, term366512.getClass(), "itsConst", null);
        setField(term366512, term366512.getClass(), "itsVariableNames", null);
        setIntField(term366512, term366512.getClass(), "varStart", 0);
        setField(term366512, term366512.getClass(), "compilerData", null);
        setIntField(term366512, term366512.getClass(), "type", 0);
        setField(term366512, term366512.getClass(), "next", null);
        setField(term366512, term366512.getClass(), "first", null);
        setField(term366512, term366512.getClass(), "last", null);
        setField(term366512, term366512.getClass(), "propListHead", null);
        setIntField(term366512, term366512.getClass(), "sourcePosition", 0);
        setField(term366512, term366512.getClass(), "jsType", null);
        setField(term366512, term366512.getClass(), "parent", null);
        setField(term366511, term366511.getClass(), "next", term366512);
        setField(term366511, term366511.getClass(), "first", null);
        setField(term366511, term366511.getClass(), "last", null);
        setField(term366511, term366511.getClass(), "propListHead", null);
        setIntField(term366511, term366511.getClass(), "sourcePosition", 0);
        setField(term366511, term366511.getClass(), "jsType", null);
        setField(term366511, term366511.getClass(), "parent", null);
        setField(term366510, term366510.getClass(), "first", term366511);
        setField(term366510, term366510.getClass(), "last", null);
        setField(term366510, term366510.getClass(), "propListHead", null);
        setIntField(term366510, term366510.getClass(), "sourcePosition", 0);
        setField(term366510, term366510.getClass(), "jsType", null);
        setField(term366510, term366510.getClass(), "parent", null);
        term366445 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term366452 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term366459 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term366445, term366445.getClass(), "encodedSourceStart", 0);
        setIntField(term366445, term366445.getClass(), "encodedSourceEnd", 0);
        setField(term366445, term366445.getClass(), "sourceName", null);
        setIntField(term366445, term366445.getClass(), "baseLineno", 0);
        setIntField(term366445, term366445.getClass(), "endLineno", 0);
        setField(term366445, term366445.getClass(), "functions", null);
        setField(term366445, term366445.getClass(), "regexps", null);
        setField(term366445, term366445.getClass(), "itsVariables", null);
        setField(term366445, term366445.getClass(), "itsConst", null);
        setField(term366445, term366445.getClass(), "itsVariableNames", null);
        setIntField(term366445, term366445.getClass(), "varStart", 0);
        setField(term366445, term366445.getClass(), "compilerData", null);
        setIntField(term366445, term366445.getClass(), "type", 24);
        setField(term366445, term366445.getClass(), "next", null);
        setIntField(term366452, term366452.getClass(), "encodedSourceStart", 0);
        setIntField(term366452, term366452.getClass(), "encodedSourceEnd", 0);
        setField(term366452, term366452.getClass(), "sourceName", null);
        setIntField(term366452, term366452.getClass(), "baseLineno", 0);
        setIntField(term366452, term366452.getClass(), "endLineno", 0);
        setField(term366452, term366452.getClass(), "functions", null);
        setField(term366452, term366452.getClass(), "regexps", null);
        setField(term366452, term366452.getClass(), "itsVariables", null);
        setField(term366452, term366452.getClass(), "itsConst", null);
        setField(term366452, term366452.getClass(), "itsVariableNames", null);
        setIntField(term366452, term366452.getClass(), "varStart", 0);
        setField(term366452, term366452.getClass(), "compilerData", null);
        setIntField(term366452, term366452.getClass(), "type", 39);
        setIntField(term366459, term366459.getClass(), "encodedSourceStart", 0);
        setIntField(term366459, term366459.getClass(), "encodedSourceEnd", 0);
        setField(term366459, term366459.getClass(), "sourceName", null);
        setIntField(term366459, term366459.getClass(), "baseLineno", 0);
        setIntField(term366459, term366459.getClass(), "endLineno", 0);
        setField(term366459, term366459.getClass(), "functions", null);
        setField(term366459, term366459.getClass(), "regexps", null);
        setField(term366459, term366459.getClass(), "itsVariables", null);
        setField(term366459, term366459.getClass(), "itsConst", null);
        setField(term366459, term366459.getClass(), "itsVariableNames", null);
        setIntField(term366459, term366459.getClass(), "varStart", 0);
        setField(term366459, term366459.getClass(), "compilerData", null);
        setIntField(term366459, term366459.getClass(), "type", 0);
        setField(term366459, term366459.getClass(), "next", null);
        setField(term366459, term366459.getClass(), "first", null);
        setField(term366459, term366459.getClass(), "last", null);
        setField(term366459, term366459.getClass(), "propListHead", null);
        setIntField(term366459, term366459.getClass(), "sourcePosition", 0);
        setField(term366459, term366459.getClass(), "jsType", null);
        setField(term366459, term366459.getClass(), "parent", null);
        setField(term366452, term366452.getClass(), "next", term366459);
        setField(term366452, term366452.getClass(), "first", null);
        setField(term366452, term366452.getClass(), "last", null);
        setField(term366452, term366452.getClass(), "propListHead", null);
        setIntField(term366452, term366452.getClass(), "sourcePosition", 0);
        setField(term366452, term366452.getClass(), "jsType", null);
        setField(term366452, term366452.getClass(), "parent", null);
        setField(term366445, term366445.getClass(), "first", term366452);
        setField(term366445, term366445.getClass(), "last", null);
        setField(term366445, term366445.getClass(), "propListHead", null);
        setIntField(term366445, term366445.getClass(), "sourcePosition", 0);
        setField(term366445, term366445.getClass(), "jsType", null);
        setField(term366445, term366445.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term365806;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term365716, args);
        assertTrue(recursiveEquals(term365716, term366509));
        assertTrue(recursiveEquals(term365806, term366510));
        assertTrue(recursiveEquals(retValue, term366445));
    }

};


