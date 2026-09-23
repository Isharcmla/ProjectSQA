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

public class PeepholeFoldConstants_tryReduceVoid_942546715195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31519;
     Object term31679;
     Object term32286;
     Object term32288;
     Object term32259;

    public PeepholeFoldConstants_tryReduceVoid_942546715195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31519 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term31609 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term31609, term31609.getClass(), "compiler", null);
        setField(term31519, term31519.getClass(), "currentTraversal", term31609);
        term31679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term31749, term31749.getClass(), "type", 129);
        setField(term31679, term31679.getClass(), "first", term31749);
        setIntField(term31679, term31679.getClass(), "type", 129);
        term32286 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term32287 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term32287, term32287.getClass(), "compiler", null);
        setField(term32287, term32287.getClass(), "callback", null);
        setField(term32287, term32287.getClass(), "curNode", null);
        setField(term32287, term32287.getClass(), "scopes", null);
        setField(term32287, term32287.getClass(), "scopeRoots", null);
        setField(term32287, term32287.getClass(), "cfgs", null);
        setField(term32287, term32287.getClass(), "sourceName", null);
        setField(term32287, term32287.getClass(), "scopeCreator", null);
        setField(term32287, term32287.getClass(), "scopeCallback", null);
        setField(term32286, term32286.getClass(), "currentTraversal", term32287);
        term32288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32289 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32288, term32288.getClass(), "type", 129);
        setField(term32288, term32288.getClass(), "next", null);
        setIntField(term32289, term32289.getClass(), "type", 129);
        setField(term32289, term32289.getClass(), "next", null);
        setField(term32289, term32289.getClass(), "first", null);
        setField(term32289, term32289.getClass(), "last", null);
        setField(term32289, term32289.getClass(), "propListHead", null);
        setIntField(term32289, term32289.getClass(), "sourcePosition", 0);
        setField(term32289, term32289.getClass(), "jsType", null);
        setField(term32289, term32289.getClass(), "parent", null);
        setField(term32288, term32288.getClass(), "first", term32289);
        setField(term32288, term32288.getClass(), "last", null);
        setField(term32288, term32288.getClass(), "propListHead", null);
        setIntField(term32288, term32288.getClass(), "sourcePosition", 0);
        setField(term32288, term32288.getClass(), "jsType", null);
        setField(term32288, term32288.getClass(), "parent", null);
        term32259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term32259, term32259.getClass(), "type", 129);
        setField(term32259, term32259.getClass(), "next", null);
        setIntField(term32261, term32261.getClass(), "type", 129);
        setField(term32261, term32261.getClass(), "next", null);
        setField(term32261, term32261.getClass(), "first", null);
        setField(term32261, term32261.getClass(), "last", null);
        setField(term32261, term32261.getClass(), "propListHead", null);
        setIntField(term32261, term32261.getClass(), "sourcePosition", 0);
        setField(term32261, term32261.getClass(), "jsType", null);
        setField(term32261, term32261.getClass(), "parent", null);
        setField(term32259, term32259.getClass(), "first", term32261);
        setField(term32259, term32259.getClass(), "last", null);
        setField(term32259, term32259.getClass(), "propListHead", null);
        setIntField(term32259, term32259.getClass(), "sourcePosition", 0);
        setField(term32259, term32259.getClass(), "jsType", null);
        setField(term32259, term32259.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term31679;
        Object retValue = callMethod(klass, "tryReduceVoid", argTypes, term31519, args);
        assertTrue(recursiveEquals(term31519, term32286));
        assertTrue(recursiveEquals(term31679, term32288));
        assertTrue(recursiveEquals(retValue, term32259));
    }

};


