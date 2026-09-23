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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeTraversal_traverse_84659115980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5105;

    public NodeTraversal_traverse_84659115980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5105, term5105.getClass(), "type", -426764678);
        setIntField(term5107, term5107.getClass(), "type", -1222614956);
        setIntField(term5109, term5109.getClass(), "type", -1870495012);
        setIntField(term5111, term5111.getClass(), "type", -1310015129);
        setIntField(term5113, term5113.getClass(), "type", -2104981311);
        setField(term5113, term5113.getClass(), "next", null);
        setField(term5113, term5113.getClass(), "first", null);
        setField(term5113, term5113.getClass(), "last", null);
        setField(term5113, term5113.getClass(), "propListHead", null);
        setIntField(term5113, term5113.getClass(), "sourcePosition", 0);
        setField(term5113, term5113.getClass(), "jsType", null);
        setField(term5113, term5113.getClass(), "parent", null);
        setField(term5111, term5111.getClass(), "next", term5113);
        setIntField(term5116, term5116.getClass(), "type", -571169753);
        setField(term5116, term5116.getClass(), "next", null);
        setField(term5116, term5116.getClass(), "first", null);
        setField(term5116, term5116.getClass(), "last", term5113);
        setField(term5116, term5116.getClass(), "propListHead", null);
        setIntField(term5116, term5116.getClass(), "sourcePosition", 0);
        setField(term5116, term5116.getClass(), "jsType", null);
        setField(term5116, term5116.getClass(), "parent", null);
        setField(term5111, term5111.getClass(), "first", term5116);
        setField(term5111, term5111.getClass(), "last", term5109);
        setField(term5111, term5111.getClass(), "propListHead", null);
        setIntField(term5111, term5111.getClass(), "sourcePosition", 0);
        setField(term5111, term5111.getClass(), "jsType", null);
        setField(term5111, term5111.getClass(), "parent", null);
        setField(term5109, term5109.getClass(), "next", term5111);
        setField(term5109, term5109.getClass(), "first", term5113);
        setIntField(term5120, term5120.getClass(), "type", -165587447);
        setIntField(term5122, term5122.getClass(), "type", -1347358701);
        setField(term5122, term5122.getClass(), "next", null);
        setField(term5122, term5122.getClass(), "first", term5116);
        setField(term5122, term5122.getClass(), "last", term5111);
        setField(term5122, term5122.getClass(), "propListHead", null);
        setIntField(term5122, term5122.getClass(), "sourcePosition", 0);
        setField(term5122, term5122.getClass(), "jsType", null);
        setField(term5122, term5122.getClass(), "parent", null);
        setField(term5120, term5120.getClass(), "next", term5122);
        setField(term5120, term5120.getClass(), "first", term5107);
        setField(term5120, term5120.getClass(), "last", term5107);
        setField(term5120, term5120.getClass(), "propListHead", null);
        setIntField(term5120, term5120.getClass(), "sourcePosition", 0);
        setField(term5120, term5120.getClass(), "jsType", null);
        setField(term5120, term5120.getClass(), "parent", null);
        setField(term5109, term5109.getClass(), "last", term5120);
        setField(term5109, term5109.getClass(), "propListHead", null);
        setIntField(term5109, term5109.getClass(), "sourcePosition", 0);
        setField(term5109, term5109.getClass(), "jsType", null);
        setField(term5109, term5109.getClass(), "parent", null);
        setField(term5107, term5107.getClass(), "next", term5109);
        setIntField(term5127, term5127.getClass(), "type", 806595993);
        setField(term5127, term5127.getClass(), "next", term5120);
        setField(term5127, term5127.getClass(), "first", term5122);
        setField(term5127, term5127.getClass(), "last", term5105);
        setField(term5127, term5127.getClass(), "propListHead", null);
        setIntField(term5127, term5127.getClass(), "sourcePosition", 0);
        setField(term5127, term5127.getClass(), "jsType", null);
        setField(term5127, term5127.getClass(), "parent", null);
        setField(term5107, term5107.getClass(), "first", term5127);
        setField(term5107, term5107.getClass(), "last", term5127);
        setField(term5107, term5107.getClass(), "propListHead", null);
        setIntField(term5107, term5107.getClass(), "sourcePosition", 0);
        setField(term5107, term5107.getClass(), "jsType", null);
        setField(term5107, term5107.getClass(), "parent", null);
        setField(term5105, term5105.getClass(), "next", term5107);
        setField(term5105, term5105.getClass(), "first", term5111);
        setField(term5105, term5105.getClass(), "last", term5113);
        setField(term5105, term5105.getClass(), "propListHead", null);
        setIntField(term5105, term5105.getClass(), "sourcePosition", 0);
        setField(term5105, term5105.getClass(), "jsType", null);
        setField(term5105, term5105.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term5105;
        args[2] = null;
        try {
            callMethod(klass, "traverse", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


