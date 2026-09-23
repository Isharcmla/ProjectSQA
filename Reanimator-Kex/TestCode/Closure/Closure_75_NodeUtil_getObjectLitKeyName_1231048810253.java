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

public class NodeUtil_getObjectLitKeyName_1231048810253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2778;

    public NodeUtil_getObjectLitKeyName_1231048810253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2791 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2795 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2801 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2778, term2778.getClass(), "type", -2085566906);
        setIntField(term2780, term2780.getClass(), "type", 114915275);
        setIntField(term2782, term2782.getClass(), "type", 0);
        setField(term2782, term2782.getClass(), "next", null);
        setField(term2782, term2782.getClass(), "first", null);
        setField(term2782, term2782.getClass(), "last", null);
        setField(term2782, term2782.getClass(), "propListHead", null);
        setIntField(term2782, term2782.getClass(), "sourcePosition", 0);
        setField(term2782, term2782.getClass(), "jsType", null);
        setField(term2782, term2782.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "next", term2782);
        setIntField(term2785, term2785.getClass(), "type", 0);
        setField(term2785, term2785.getClass(), "next", null);
        setField(term2785, term2785.getClass(), "first", null);
        setField(term2785, term2785.getClass(), "last", null);
        setField(term2785, term2785.getClass(), "propListHead", null);
        setIntField(term2785, term2785.getClass(), "sourcePosition", 0);
        setField(term2785, term2785.getClass(), "jsType", null);
        setField(term2785, term2785.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "first", term2785);
        setIntField(term2788, term2788.getClass(), "type", 0);
        setField(term2788, term2788.getClass(), "next", null);
        setField(term2788, term2788.getClass(), "first", null);
        setField(term2788, term2788.getClass(), "last", null);
        setField(term2788, term2788.getClass(), "propListHead", null);
        setIntField(term2788, term2788.getClass(), "sourcePosition", 0);
        setField(term2788, term2788.getClass(), "jsType", null);
        setField(term2788, term2788.getClass(), "parent", null);
        setField(term2780, term2780.getClass(), "last", term2788);
        setField(term2791, term2791.getClass(), "next", null);
        setIntField(term2791, term2791.getClass(), "type", 0);
        setIntField(term2791, term2791.getClass(), "intValue", 0);
        setField(term2791, term2791.getClass(), "objectValue", null);
        setField(term2780, term2780.getClass(), "propListHead", term2791);
        setIntField(term2780, term2780.getClass(), "sourcePosition", -1231122778);
        setField(term2780, term2780.getClass(), "jsType", null);
        setField(term2780, term2780.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "next", term2780);
        setIntField(term2795, term2795.getClass(), "type", 0);
        setField(term2795, term2795.getClass(), "next", null);
        setField(term2795, term2795.getClass(), "first", null);
        setField(term2795, term2795.getClass(), "last", null);
        setField(term2795, term2795.getClass(), "propListHead", null);
        setIntField(term2795, term2795.getClass(), "sourcePosition", 0);
        setField(term2795, term2795.getClass(), "jsType", null);
        setField(term2795, term2795.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "first", term2795);
        setIntField(term2798, term2798.getClass(), "type", 0);
        setField(term2798, term2798.getClass(), "next", null);
        setField(term2798, term2798.getClass(), "first", null);
        setField(term2798, term2798.getClass(), "last", null);
        setField(term2798, term2798.getClass(), "propListHead", null);
        setIntField(term2798, term2798.getClass(), "sourcePosition", 0);
        setField(term2798, term2798.getClass(), "jsType", null);
        setField(term2798, term2798.getClass(), "parent", null);
        setField(term2778, term2778.getClass(), "last", term2798);
        setField(term2801, term2801.getClass(), "next", null);
        setIntField(term2801, term2801.getClass(), "type", 0);
        setIntField(term2801, term2801.getClass(), "intValue", 0);
        setField(term2801, term2801.getClass(), "objectValue", null);
        setField(term2778, term2778.getClass(), "propListHead", term2801);
        setIntField(term2778, term2778.getClass(), "sourcePosition", 1923558221);
        setField(term2778, term2778.getClass(), "jsType", null);
        setField(term2778, term2778.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2778;
        try {
            callMethod(klass, "getObjectLitKeyName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


