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

public class NodeUtil_mayHaveSideEffects_1029731851177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434;
     Object term6841;

    public NodeUtil_mayHaveSideEffects_1029731851177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term438 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term441 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term444 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term448 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term451 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term434, term434.getClass(), "type", -1885090354);
        setIntField(term436, term436.getClass(), "type", -1239406390);
        setIntField(term438, term438.getClass(), "type", 0);
        setField(term438, term438.getClass(), "next", null);
        setField(term438, term438.getClass(), "first", null);
        setField(term438, term438.getClass(), "last", null);
        setField(term438, term438.getClass(), "propListHead", null);
        setIntField(term438, term438.getClass(), "sourcePosition", 0);
        setField(term438, term438.getClass(), "jsType", null);
        setField(term438, term438.getClass(), "parent", null);
        setField(term436, term436.getClass(), "next", term438);
        setIntField(term441, term441.getClass(), "type", 0);
        setField(term441, term441.getClass(), "next", null);
        setField(term441, term441.getClass(), "first", null);
        setField(term441, term441.getClass(), "last", null);
        setField(term441, term441.getClass(), "propListHead", null);
        setIntField(term441, term441.getClass(), "sourcePosition", 0);
        setField(term441, term441.getClass(), "jsType", null);
        setField(term441, term441.getClass(), "parent", null);
        setField(term436, term436.getClass(), "first", term441);
        setIntField(term444, term444.getClass(), "type", 0);
        setField(term444, term444.getClass(), "next", null);
        setField(term444, term444.getClass(), "first", null);
        setField(term444, term444.getClass(), "last", null);
        setField(term444, term444.getClass(), "propListHead", null);
        setIntField(term444, term444.getClass(), "sourcePosition", 0);
        setField(term444, term444.getClass(), "jsType", null);
        setField(term444, term444.getClass(), "parent", null);
        setField(term436, term436.getClass(), "last", term444);
        setField(term436, term436.getClass(), "propListHead", null);
        setIntField(term436, term436.getClass(), "sourcePosition", 0);
        setField(term436, term436.getClass(), "jsType", null);
        setField(term436, term436.getClass(), "parent", null);
        setField(term434, term434.getClass(), "next", term436);
        setIntField(term448, term448.getClass(), "type", 0);
        setField(term448, term448.getClass(), "next", null);
        setField(term448, term448.getClass(), "first", null);
        setField(term448, term448.getClass(), "last", null);
        setField(term448, term448.getClass(), "propListHead", null);
        setIntField(term448, term448.getClass(), "sourcePosition", 0);
        setField(term448, term448.getClass(), "jsType", null);
        setField(term448, term448.getClass(), "parent", null);
        setField(term434, term434.getClass(), "first", term448);
        setIntField(term451, term451.getClass(), "type", 0);
        setField(term451, term451.getClass(), "next", null);
        setField(term451, term451.getClass(), "first", null);
        setField(term451, term451.getClass(), "last", null);
        setField(term451, term451.getClass(), "propListHead", null);
        setIntField(term451, term451.getClass(), "sourcePosition", 0);
        setField(term451, term451.getClass(), "jsType", null);
        setField(term451, term451.getClass(), "parent", null);
        setField(term434, term434.getClass(), "last", term451);
        setField(term434, term434.getClass(), "propListHead", null);
        setIntField(term434, term434.getClass(), "sourcePosition", 0);
        setField(term434, term434.getClass(), "jsType", null);
        setField(term434, term434.getClass(), "parent", null);
        term6841 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6844 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6841, term6841.getClass(), "type", -1885090354);
        setIntField(term6842, term6842.getClass(), "type", -1239406390);
        setIntField(term6843, term6843.getClass(), "type", 0);
        setField(term6843, term6843.getClass(), "next", null);
        setField(term6843, term6843.getClass(), "first", null);
        setField(term6843, term6843.getClass(), "last", null);
        setField(term6843, term6843.getClass(), "propListHead", null);
        setIntField(term6843, term6843.getClass(), "sourcePosition", 0);
        setField(term6843, term6843.getClass(), "jsType", null);
        setField(term6843, term6843.getClass(), "parent", null);
        setField(term6842, term6842.getClass(), "next", term6843);
        setIntField(term6844, term6844.getClass(), "type", 0);
        setField(term6844, term6844.getClass(), "next", null);
        setField(term6844, term6844.getClass(), "first", null);
        setField(term6844, term6844.getClass(), "last", null);
        setField(term6844, term6844.getClass(), "propListHead", null);
        setIntField(term6844, term6844.getClass(), "sourcePosition", 0);
        setField(term6844, term6844.getClass(), "jsType", null);
        setField(term6844, term6844.getClass(), "parent", null);
        setField(term6842, term6842.getClass(), "first", term6844);
        setIntField(term6845, term6845.getClass(), "type", 0);
        setField(term6845, term6845.getClass(), "next", null);
        setField(term6845, term6845.getClass(), "first", null);
        setField(term6845, term6845.getClass(), "last", null);
        setField(term6845, term6845.getClass(), "propListHead", null);
        setIntField(term6845, term6845.getClass(), "sourcePosition", 0);
        setField(term6845, term6845.getClass(), "jsType", null);
        setField(term6845, term6845.getClass(), "parent", null);
        setField(term6842, term6842.getClass(), "last", term6845);
        setField(term6842, term6842.getClass(), "propListHead", null);
        setIntField(term6842, term6842.getClass(), "sourcePosition", 0);
        setField(term6842, term6842.getClass(), "jsType", null);
        setField(term6842, term6842.getClass(), "parent", null);
        setField(term6841, term6841.getClass(), "next", term6842);
        setIntField(term6846, term6846.getClass(), "type", 0);
        setField(term6846, term6846.getClass(), "next", null);
        setField(term6846, term6846.getClass(), "first", null);
        setField(term6846, term6846.getClass(), "last", null);
        setField(term6846, term6846.getClass(), "propListHead", null);
        setIntField(term6846, term6846.getClass(), "sourcePosition", 0);
        setField(term6846, term6846.getClass(), "jsType", null);
        setField(term6846, term6846.getClass(), "parent", null);
        setField(term6841, term6841.getClass(), "first", term6846);
        setIntField(term6847, term6847.getClass(), "type", 0);
        setField(term6847, term6847.getClass(), "next", null);
        setField(term6847, term6847.getClass(), "first", null);
        setField(term6847, term6847.getClass(), "last", null);
        setField(term6847, term6847.getClass(), "propListHead", null);
        setIntField(term6847, term6847.getClass(), "sourcePosition", 0);
        setField(term6847, term6847.getClass(), "jsType", null);
        setField(term6847, term6847.getClass(), "parent", null);
        setField(term6841, term6841.getClass(), "last", term6847);
        setField(term6841, term6841.getClass(), "propListHead", null);
        setIntField(term6841, term6841.getClass(), "sourcePosition", 0);
        setField(term6841, term6841.getClass(), "jsType", null);
        setField(term6841, term6841.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term434;
        args[1] = null;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term434, term6841));
    }

};


