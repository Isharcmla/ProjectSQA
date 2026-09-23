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
import java.lang.Object;

public class NodeUtil_getFunctionName_522147513175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public NodeUtil_getFunctionName_522147513175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term226 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term228 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term211, term211.getClass(), "type", 97029295);
        setIntField(term213, term213.getClass(), "type", -1371869594);
        setIntField(term215, term215.getClass(), "type", -2095575670);
        setIntField(term217, term217.getClass(), "type", 1225272962);
        setIntField(term219, term219.getClass(), "type", 1324040357);
        setField(term219, term219.getClass(), "next", null);
        setField(term219, term219.getClass(), "first", null);
        setField(term219, term219.getClass(), "last", null);
        setField(term219, term219.getClass(), "propListHead", null);
        setIntField(term219, term219.getClass(), "sourcePosition", 0);
        setField(term219, term219.getClass(), "jsType", null);
        setField(term219, term219.getClass(), "parent", null);
        setField(term217, term217.getClass(), "next", term219);
        setIntField(term222, term222.getClass(), "type", -1588772968);
        setField(term222, term222.getClass(), "next", null);
        setField(term222, term222.getClass(), "first", null);
        setField(term222, term222.getClass(), "last", term219);
        setField(term222, term222.getClass(), "propListHead", null);
        setIntField(term222, term222.getClass(), "sourcePosition", 0);
        setField(term222, term222.getClass(), "jsType", null);
        setField(term222, term222.getClass(), "parent", null);
        setField(term217, term217.getClass(), "first", term222);
        setField(term217, term217.getClass(), "last", term215);
        setField(term217, term217.getClass(), "propListHead", null);
        setIntField(term217, term217.getClass(), "sourcePosition", 0);
        setField(term217, term217.getClass(), "jsType", null);
        setField(term217, term217.getClass(), "parent", null);
        setField(term215, term215.getClass(), "next", term217);
        setField(term215, term215.getClass(), "first", term219);
        setIntField(term226, term226.getClass(), "type", -112921587);
        setIntField(term228, term228.getClass(), "type", 933028652);
        setField(term228, term228.getClass(), "next", null);
        setField(term228, term228.getClass(), "first", term222);
        setField(term228, term228.getClass(), "last", term217);
        setField(term228, term228.getClass(), "propListHead", null);
        setIntField(term228, term228.getClass(), "sourcePosition", 0);
        setField(term228, term228.getClass(), "jsType", null);
        setField(term228, term228.getClass(), "parent", null);
        setField(term226, term226.getClass(), "next", term228);
        setField(term226, term226.getClass(), "first", term213);
        setField(term226, term226.getClass(), "last", term213);
        setField(term226, term226.getClass(), "propListHead", null);
        setIntField(term226, term226.getClass(), "sourcePosition", 0);
        setField(term226, term226.getClass(), "jsType", null);
        setField(term226, term226.getClass(), "parent", null);
        setField(term215, term215.getClass(), "last", term226);
        setField(term215, term215.getClass(), "propListHead", null);
        setIntField(term215, term215.getClass(), "sourcePosition", 0);
        setField(term215, term215.getClass(), "jsType", null);
        setField(term215, term215.getClass(), "parent", null);
        setField(term213, term213.getClass(), "next", term215);
        setIntField(term233, term233.getClass(), "type", 287287233);
        setField(term233, term233.getClass(), "next", term226);
        setField(term233, term233.getClass(), "first", term228);
        setField(term233, term233.getClass(), "last", term211);
        setField(term233, term233.getClass(), "propListHead", null);
        setIntField(term233, term233.getClass(), "sourcePosition", 0);
        setField(term233, term233.getClass(), "jsType", null);
        setField(term233, term233.getClass(), "parent", null);
        setField(term213, term213.getClass(), "first", term233);
        setField(term213, term213.getClass(), "last", term233);
        setField(term213, term213.getClass(), "propListHead", null);
        setIntField(term213, term213.getClass(), "sourcePosition", 0);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        setField(term211, term211.getClass(), "next", term213);
        setField(term211, term211.getClass(), "first", term217);
        setField(term211, term211.getClass(), "last", term219);
        setField(term211, term211.getClass(), "propListHead", null);
        setIntField(term211, term211.getClass(), "sourcePosition", 0);
        setField(term211, term211.getClass(), "jsType", null);
        setField(term211, term211.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term211;
        try {
            callMethod(klass, "getFunctionName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


