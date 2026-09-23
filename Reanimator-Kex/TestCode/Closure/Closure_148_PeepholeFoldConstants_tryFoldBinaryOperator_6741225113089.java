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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term912726;
     Object term912818;
     Object term914028;
     Object term914029;
     Object term913945;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term912726 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term912818 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term912908 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term913000 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term913092 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term913000, term913000.getClass(), "type", 44);
        setField(term912908, term912908.getClass(), "next", term913000);
        setIntField(term912908, term912908.getClass(), "type", 0);
        setField(term912818, term912818.getClass(), "first", term912908);
        setIntField(term912818, term912818.getClass(), "type", 101);
        setField(term912818, term912818.getClass(), "parent", term913092);
        term914028 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term914028, term914028.getClass(), "currentTraversal", null);
        term914029 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term914030 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term914031 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term914032 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term914029, term914029.getClass(), "number", 0.0);
        setIntField(term914029, term914029.getClass(), "type", 101);
        setField(term914029, term914029.getClass(), "next", null);
        setIntField(term914030, term914030.getClass(), "encodedSourceStart", 0);
        setIntField(term914030, term914030.getClass(), "encodedSourceEnd", 0);
        setField(term914030, term914030.getClass(), "sourceName", null);
        setIntField(term914030, term914030.getClass(), "baseLineno", 0);
        setIntField(term914030, term914030.getClass(), "endLineno", 0);
        setField(term914030, term914030.getClass(), "functions", null);
        setField(term914030, term914030.getClass(), "regexps", null);
        setField(term914030, term914030.getClass(), "itsVariables", null);
        setField(term914030, term914030.getClass(), "itsConst", null);
        setField(term914030, term914030.getClass(), "itsVariableNames", null);
        setIntField(term914030, term914030.getClass(), "varStart", 0);
        setField(term914030, term914030.getClass(), "compilerData", null);
        setIntField(term914030, term914030.getClass(), "type", 0);
        setDoubleField(term914031, term914031.getClass(), "number", 0.0);
        setIntField(term914031, term914031.getClass(), "type", 44);
        setField(term914031, term914031.getClass(), "next", null);
        setField(term914031, term914031.getClass(), "first", null);
        setField(term914031, term914031.getClass(), "last", null);
        setField(term914031, term914031.getClass(), "propListHead", null);
        setIntField(term914031, term914031.getClass(), "sourcePosition", 0);
        setField(term914031, term914031.getClass(), "jsType", null);
        setField(term914031, term914031.getClass(), "parent", null);
        setField(term914030, term914030.getClass(), "next", term914031);
        setField(term914030, term914030.getClass(), "first", null);
        setField(term914030, term914030.getClass(), "last", null);
        setField(term914030, term914030.getClass(), "propListHead", null);
        setIntField(term914030, term914030.getClass(), "sourcePosition", 0);
        setField(term914030, term914030.getClass(), "jsType", null);
        setField(term914030, term914030.getClass(), "parent", null);
        setField(term914029, term914029.getClass(), "first", term914030);
        setField(term914029, term914029.getClass(), "last", null);
        setField(term914029, term914029.getClass(), "propListHead", null);
        setIntField(term914029, term914029.getClass(), "sourcePosition", 0);
        setField(term914029, term914029.getClass(), "jsType", null);
        setField(term914032, term914032.getClass(), "str", null);
        setIntField(term914032, term914032.getClass(), "type", 0);
        setField(term914032, term914032.getClass(), "next", null);
        setField(term914032, term914032.getClass(), "first", null);
        setField(term914032, term914032.getClass(), "last", null);
        setField(term914032, term914032.getClass(), "propListHead", null);
        setIntField(term914032, term914032.getClass(), "sourcePosition", 0);
        setField(term914032, term914032.getClass(), "jsType", null);
        setField(term914032, term914032.getClass(), "parent", null);
        setField(term914029, term914029.getClass(), "parent", term914032);
        term913945 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term913948 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term913955 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term913961 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setDoubleField(term913945, term913945.getClass(), "number", 0.0);
        setIntField(term913945, term913945.getClass(), "type", 101);
        setField(term913945, term913945.getClass(), "next", null);
        setIntField(term913948, term913948.getClass(), "encodedSourceStart", 0);
        setIntField(term913948, term913948.getClass(), "encodedSourceEnd", 0);
        setField(term913948, term913948.getClass(), "sourceName", null);
        setIntField(term913948, term913948.getClass(), "baseLineno", 0);
        setIntField(term913948, term913948.getClass(), "endLineno", 0);
        setField(term913948, term913948.getClass(), "functions", null);
        setField(term913948, term913948.getClass(), "regexps", null);
        setField(term913948, term913948.getClass(), "itsVariables", null);
        setField(term913948, term913948.getClass(), "itsConst", null);
        setField(term913948, term913948.getClass(), "itsVariableNames", null);
        setIntField(term913948, term913948.getClass(), "varStart", 0);
        setField(term913948, term913948.getClass(), "compilerData", null);
        setIntField(term913948, term913948.getClass(), "type", 0);
        setDoubleField(term913955, term913955.getClass(), "number", 0.0);
        setIntField(term913955, term913955.getClass(), "type", 44);
        setField(term913955, term913955.getClass(), "next", null);
        setField(term913955, term913955.getClass(), "first", null);
        setField(term913955, term913955.getClass(), "last", null);
        setField(term913955, term913955.getClass(), "propListHead", null);
        setIntField(term913955, term913955.getClass(), "sourcePosition", 0);
        setField(term913955, term913955.getClass(), "jsType", null);
        setField(term913955, term913955.getClass(), "parent", null);
        setField(term913948, term913948.getClass(), "next", term913955);
        setField(term913948, term913948.getClass(), "first", null);
        setField(term913948, term913948.getClass(), "last", null);
        setField(term913948, term913948.getClass(), "propListHead", null);
        setIntField(term913948, term913948.getClass(), "sourcePosition", 0);
        setField(term913948, term913948.getClass(), "jsType", null);
        setField(term913948, term913948.getClass(), "parent", null);
        setField(term913945, term913945.getClass(), "first", term913948);
        setField(term913945, term913945.getClass(), "last", null);
        setField(term913945, term913945.getClass(), "propListHead", null);
        setIntField(term913945, term913945.getClass(), "sourcePosition", 0);
        setField(term913945, term913945.getClass(), "jsType", null);
        setField(term913961, term913961.getClass(), "str", null);
        setIntField(term913961, term913961.getClass(), "type", 0);
        setField(term913961, term913961.getClass(), "next", null);
        setField(term913961, term913961.getClass(), "first", null);
        setField(term913961, term913961.getClass(), "last", null);
        setField(term913961, term913961.getClass(), "propListHead", null);
        setIntField(term913961, term913961.getClass(), "sourcePosition", 0);
        setField(term913961, term913961.getClass(), "jsType", null);
        setField(term913961, term913961.getClass(), "parent", null);
        setField(term913945, term913945.getClass(), "parent", term913961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term912818;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term912726, args);
        assertTrue(recursiveEquals(term912726, term914028));
        assertTrue(recursiveEquals(term912818, term914029));
        assertTrue(recursiveEquals(retValue, term913945));
    }

};


