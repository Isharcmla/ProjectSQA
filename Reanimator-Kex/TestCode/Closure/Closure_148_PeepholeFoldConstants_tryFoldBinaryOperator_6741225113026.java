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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225113026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term890201;
     Object term890293;
     Object term891647;
     Object term891648;
     Object term891569;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225113026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term890201 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term890293 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term890383 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term890475 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term890545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term890475, term890475.getClass(), "type", 63);
        setField(term890383, term890383.getClass(), "next", term890475);
        setIntField(term890383, term890383.getClass(), "type", 0);
        setField(term890293, term890293.getClass(), "first", term890383);
        setIntField(term890293, term890293.getClass(), "type", 101);
        setField(term890293, term890293.getClass(), "parent", term890545);
        term891647 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term891647, term891647.getClass(), "currentTraversal", null);
        term891648 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891649 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term891650 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term891648, term891648.getClass(), "str", null);
        setIntField(term891648, term891648.getClass(), "type", 101);
        setField(term891648, term891648.getClass(), "next", null);
        setIntField(term891649, term891649.getClass(), "encodedSourceStart", 0);
        setIntField(term891649, term891649.getClass(), "encodedSourceEnd", 0);
        setField(term891649, term891649.getClass(), "sourceName", null);
        setIntField(term891649, term891649.getClass(), "baseLineno", 0);
        setIntField(term891649, term891649.getClass(), "endLineno", 0);
        setField(term891649, term891649.getClass(), "functions", null);
        setField(term891649, term891649.getClass(), "regexps", null);
        setField(term891649, term891649.getClass(), "itsVariables", null);
        setField(term891649, term891649.getClass(), "itsConst", null);
        setField(term891649, term891649.getClass(), "itsVariableNames", null);
        setIntField(term891649, term891649.getClass(), "varStart", 0);
        setField(term891649, term891649.getClass(), "compilerData", null);
        setIntField(term891649, term891649.getClass(), "type", 0);
        setField(term891650, term891650.getClass(), "str", null);
        setIntField(term891650, term891650.getClass(), "type", 63);
        setField(term891650, term891650.getClass(), "next", null);
        setField(term891650, term891650.getClass(), "first", null);
        setField(term891650, term891650.getClass(), "last", null);
        setField(term891650, term891650.getClass(), "propListHead", null);
        setIntField(term891650, term891650.getClass(), "sourcePosition", 0);
        setField(term891650, term891650.getClass(), "jsType", null);
        setField(term891650, term891650.getClass(), "parent", null);
        setField(term891649, term891649.getClass(), "next", term891650);
        setField(term891649, term891649.getClass(), "first", null);
        setField(term891649, term891649.getClass(), "last", null);
        setField(term891649, term891649.getClass(), "propListHead", null);
        setIntField(term891649, term891649.getClass(), "sourcePosition", 0);
        setField(term891649, term891649.getClass(), "jsType", null);
        setField(term891649, term891649.getClass(), "parent", null);
        setField(term891648, term891648.getClass(), "first", term891649);
        setField(term891648, term891648.getClass(), "last", null);
        setField(term891648, term891648.getClass(), "propListHead", null);
        setIntField(term891648, term891648.getClass(), "sourcePosition", 0);
        setField(term891648, term891648.getClass(), "jsType", null);
        setIntField(term891651, term891651.getClass(), "type", 0);
        setField(term891651, term891651.getClass(), "next", null);
        setField(term891651, term891651.getClass(), "first", null);
        setField(term891651, term891651.getClass(), "last", null);
        setField(term891651, term891651.getClass(), "propListHead", null);
        setIntField(term891651, term891651.getClass(), "sourcePosition", 0);
        setField(term891651, term891651.getClass(), "jsType", null);
        setField(term891651, term891651.getClass(), "parent", null);
        setField(term891648, term891648.getClass(), "parent", term891651);
        term891569 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891571 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term891578 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term891583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term891569, term891569.getClass(), "str", null);
        setIntField(term891569, term891569.getClass(), "type", 101);
        setField(term891569, term891569.getClass(), "next", null);
        setIntField(term891571, term891571.getClass(), "encodedSourceStart", 0);
        setIntField(term891571, term891571.getClass(), "encodedSourceEnd", 0);
        setField(term891571, term891571.getClass(), "sourceName", null);
        setIntField(term891571, term891571.getClass(), "baseLineno", 0);
        setIntField(term891571, term891571.getClass(), "endLineno", 0);
        setField(term891571, term891571.getClass(), "functions", null);
        setField(term891571, term891571.getClass(), "regexps", null);
        setField(term891571, term891571.getClass(), "itsVariables", null);
        setField(term891571, term891571.getClass(), "itsConst", null);
        setField(term891571, term891571.getClass(), "itsVariableNames", null);
        setIntField(term891571, term891571.getClass(), "varStart", 0);
        setField(term891571, term891571.getClass(), "compilerData", null);
        setIntField(term891571, term891571.getClass(), "type", 0);
        setField(term891578, term891578.getClass(), "str", null);
        setIntField(term891578, term891578.getClass(), "type", 63);
        setField(term891578, term891578.getClass(), "next", null);
        setField(term891578, term891578.getClass(), "first", null);
        setField(term891578, term891578.getClass(), "last", null);
        setField(term891578, term891578.getClass(), "propListHead", null);
        setIntField(term891578, term891578.getClass(), "sourcePosition", 0);
        setField(term891578, term891578.getClass(), "jsType", null);
        setField(term891578, term891578.getClass(), "parent", null);
        setField(term891571, term891571.getClass(), "next", term891578);
        setField(term891571, term891571.getClass(), "first", null);
        setField(term891571, term891571.getClass(), "last", null);
        setField(term891571, term891571.getClass(), "propListHead", null);
        setIntField(term891571, term891571.getClass(), "sourcePosition", 0);
        setField(term891571, term891571.getClass(), "jsType", null);
        setField(term891571, term891571.getClass(), "parent", null);
        setField(term891569, term891569.getClass(), "first", term891571);
        setField(term891569, term891569.getClass(), "last", null);
        setField(term891569, term891569.getClass(), "propListHead", null);
        setIntField(term891569, term891569.getClass(), "sourcePosition", 0);
        setField(term891569, term891569.getClass(), "jsType", null);
        setIntField(term891583, term891583.getClass(), "type", 0);
        setField(term891583, term891583.getClass(), "next", null);
        setField(term891583, term891583.getClass(), "first", null);
        setField(term891583, term891583.getClass(), "last", null);
        setField(term891583, term891583.getClass(), "propListHead", null);
        setIntField(term891583, term891583.getClass(), "sourcePosition", 0);
        setField(term891583, term891583.getClass(), "jsType", null);
        setField(term891583, term891583.getClass(), "parent", null);
        setField(term891569, term891569.getClass(), "parent", term891583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term890293;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term890201, args);
        assertTrue(recursiveEquals(term890201, term891647));
        assertTrue(recursiveEquals(term890293, term891648));
        assertTrue(recursiveEquals(retValue, term891569));
    }

};


