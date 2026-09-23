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

public class FoldConstants_tryFoldBlock_1167048042191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48729;
     Object term48799;
     Object term49067;
     Object term49068;

    public FoldConstants_tryFoldBlock_1167048042191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48729 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term48799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term48939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term48869, term48869.getClass(), "next", term48799);
        setIntField(term48869, term48869.getClass(), "type", 129);
        setField(term48799, term48799.getClass(), "first", term48869);
        setField(term48799, term48799.getClass(), "next", term48939);
        setIntField(term48799, term48799.getClass(), "type", 91);
        term49067 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term49067, term49067.getClass(), "compiler", null);
        term49068 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49069 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49068, term49068.getClass(), "type", 91);
        setIntField(term49069, term49069.getClass(), "type", 0);
        setField(term49069, term49069.getClass(), "next", null);
        setField(term49069, term49069.getClass(), "first", null);
        setField(term49069, term49069.getClass(), "last", null);
        setField(term49069, term49069.getClass(), "propListHead", null);
        setIntField(term49069, term49069.getClass(), "sourcePosition", 0);
        setField(term49069, term49069.getClass(), "jsType", null);
        setField(term49069, term49069.getClass(), "parent", null);
        setField(term49068, term49068.getClass(), "next", term49069);
        setIntField(term49070, term49070.getClass(), "type", 129);
        setField(term49070, term49070.getClass(), "next", term49068);
        setField(term49070, term49070.getClass(), "first", null);
        setField(term49070, term49070.getClass(), "last", null);
        setField(term49070, term49070.getClass(), "propListHead", null);
        setIntField(term49070, term49070.getClass(), "sourcePosition", 0);
        setField(term49070, term49070.getClass(), "jsType", null);
        setField(term49070, term49070.getClass(), "parent", null);
        setField(term49068, term49068.getClass(), "first", term49070);
        setField(term49068, term49068.getClass(), "last", null);
        setField(term49068, term49068.getClass(), "propListHead", null);
        setIntField(term49068, term49068.getClass(), "sourcePosition", 0);
        setField(term49068, term49068.getClass(), "jsType", null);
        setField(term49068, term49068.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term48799;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term48729, args);
        assertTrue(recursiveEquals(term48729, term49067));
        assertTrue(recursiveEquals(term48799, null));
    }

};


