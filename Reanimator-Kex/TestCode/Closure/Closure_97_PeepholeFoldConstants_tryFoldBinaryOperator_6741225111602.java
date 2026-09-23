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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620682;
     Object term620774;
     Object term650238;
     Object term650239;
     Object term650173;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620682 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term620774 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term620864 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term620934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term620864, term620864.getClass(), "next", term620934);
        setIntField(term620864, term620864.getClass(), "type", 0);
        setField(term620774, term620774.getClass(), "first", term620864);
        setIntField(term620774, term620774.getClass(), "type", 100);
        setField(term620774, term620774.getClass(), "parent", null);
        term650238 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term650238, term650238.getClass(), "currentTraversal", null);
        term650239 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650240 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term650241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650239, term650239.getClass(), "number", 0.0);
        setIntField(term650239, term650239.getClass(), "type", 100);
        setField(term650239, term650239.getClass(), "next", null);
        setIntField(term650240, term650240.getClass(), "encodedSourceStart", 0);
        setIntField(term650240, term650240.getClass(), "encodedSourceEnd", 0);
        setField(term650240, term650240.getClass(), "sourceName", null);
        setIntField(term650240, term650240.getClass(), "baseLineno", 0);
        setIntField(term650240, term650240.getClass(), "endLineno", 0);
        setField(term650240, term650240.getClass(), "functions", null);
        setField(term650240, term650240.getClass(), "regexps", null);
        setField(term650240, term650240.getClass(), "itsVariables", null);
        setField(term650240, term650240.getClass(), "itsConst", null);
        setField(term650240, term650240.getClass(), "itsVariableNames", null);
        setIntField(term650240, term650240.getClass(), "varStart", 0);
        setField(term650240, term650240.getClass(), "compilerData", null);
        setIntField(term650240, term650240.getClass(), "type", 0);
        setIntField(term650241, term650241.getClass(), "type", 0);
        setField(term650241, term650241.getClass(), "next", null);
        setField(term650241, term650241.getClass(), "first", null);
        setField(term650241, term650241.getClass(), "last", null);
        setField(term650241, term650241.getClass(), "propListHead", null);
        setIntField(term650241, term650241.getClass(), "sourcePosition", 0);
        setField(term650241, term650241.getClass(), "jsType", null);
        setField(term650241, term650241.getClass(), "parent", null);
        setField(term650240, term650240.getClass(), "next", term650241);
        setField(term650240, term650240.getClass(), "first", null);
        setField(term650240, term650240.getClass(), "last", null);
        setField(term650240, term650240.getClass(), "propListHead", null);
        setIntField(term650240, term650240.getClass(), "sourcePosition", 0);
        setField(term650240, term650240.getClass(), "jsType", null);
        setField(term650240, term650240.getClass(), "parent", null);
        setField(term650239, term650239.getClass(), "first", term650240);
        setField(term650239, term650239.getClass(), "last", null);
        setField(term650239, term650239.getClass(), "propListHead", null);
        setIntField(term650239, term650239.getClass(), "sourcePosition", 0);
        setField(term650239, term650239.getClass(), "jsType", null);
        setField(term650239, term650239.getClass(), "parent", null);
        term650173 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term650176 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term650183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setDoubleField(term650173, term650173.getClass(), "number", 0.0);
        setIntField(term650173, term650173.getClass(), "type", 100);
        setField(term650173, term650173.getClass(), "next", null);
        setIntField(term650176, term650176.getClass(), "encodedSourceStart", 0);
        setIntField(term650176, term650176.getClass(), "encodedSourceEnd", 0);
        setField(term650176, term650176.getClass(), "sourceName", null);
        setIntField(term650176, term650176.getClass(), "baseLineno", 0);
        setIntField(term650176, term650176.getClass(), "endLineno", 0);
        setField(term650176, term650176.getClass(), "functions", null);
        setField(term650176, term650176.getClass(), "regexps", null);
        setField(term650176, term650176.getClass(), "itsVariables", null);
        setField(term650176, term650176.getClass(), "itsConst", null);
        setField(term650176, term650176.getClass(), "itsVariableNames", null);
        setIntField(term650176, term650176.getClass(), "varStart", 0);
        setField(term650176, term650176.getClass(), "compilerData", null);
        setIntField(term650176, term650176.getClass(), "type", 0);
        setIntField(term650183, term650183.getClass(), "type", 0);
        setField(term650183, term650183.getClass(), "next", null);
        setField(term650183, term650183.getClass(), "first", null);
        setField(term650183, term650183.getClass(), "last", null);
        setField(term650183, term650183.getClass(), "propListHead", null);
        setIntField(term650183, term650183.getClass(), "sourcePosition", 0);
        setField(term650183, term650183.getClass(), "jsType", null);
        setField(term650183, term650183.getClass(), "parent", null);
        setField(term650176, term650176.getClass(), "next", term650183);
        setField(term650176, term650176.getClass(), "first", null);
        setField(term650176, term650176.getClass(), "last", null);
        setField(term650176, term650176.getClass(), "propListHead", null);
        setIntField(term650176, term650176.getClass(), "sourcePosition", 0);
        setField(term650176, term650176.getClass(), "jsType", null);
        setField(term650176, term650176.getClass(), "parent", null);
        setField(term650173, term650173.getClass(), "first", term650176);
        setField(term650173, term650173.getClass(), "last", null);
        setField(term650173, term650173.getClass(), "propListHead", null);
        setIntField(term650173, term650173.getClass(), "sourcePosition", 0);
        setField(term650173, term650173.getClass(), "jsType", null);
        setField(term650173, term650173.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term620774;
        Object retValue = callMethod(klass, "tryFoldBinaryOperator", argTypes, term620682, args);
        assertTrue(recursiveEquals(term620682, term650238));
        assertTrue(recursiveEquals(term620774, term650239));
        assertTrue(recursiveEquals(retValue, term650173));
    }

};


