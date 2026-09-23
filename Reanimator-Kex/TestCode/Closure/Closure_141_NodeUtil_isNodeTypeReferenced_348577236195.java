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
import java.lang.Integer;

public class NodeUtil_isNodeTypeReferenced_348577236195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2720;
     Object term2747;
     Object term14209;

    public NodeUtil_isNodeTypeReferenced_348577236195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2733 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2743 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2720, term2720.getClass(), "type", 1835568392);
        setIntField(term2722, term2722.getClass(), "type", -299497261);
        setIntField(term2724, term2724.getClass(), "type", 0);
        setField(term2724, term2724.getClass(), "next", null);
        setField(term2724, term2724.getClass(), "first", null);
        setField(term2724, term2724.getClass(), "last", null);
        setField(term2724, term2724.getClass(), "propListHead", null);
        setIntField(term2724, term2724.getClass(), "sourcePosition", 0);
        setField(term2724, term2724.getClass(), "jsType", null);
        setField(term2724, term2724.getClass(), "parent", null);
        setField(term2722, term2722.getClass(), "next", term2724);
        setIntField(term2727, term2727.getClass(), "type", 0);
        setField(term2727, term2727.getClass(), "next", null);
        setField(term2727, term2727.getClass(), "first", null);
        setField(term2727, term2727.getClass(), "last", null);
        setField(term2727, term2727.getClass(), "propListHead", null);
        setIntField(term2727, term2727.getClass(), "sourcePosition", 0);
        setField(term2727, term2727.getClass(), "jsType", null);
        setField(term2727, term2727.getClass(), "parent", null);
        setField(term2722, term2722.getClass(), "first", term2727);
        setIntField(term2730, term2730.getClass(), "type", 0);
        setField(term2730, term2730.getClass(), "next", null);
        setField(term2730, term2730.getClass(), "first", null);
        setField(term2730, term2730.getClass(), "last", null);
        setField(term2730, term2730.getClass(), "propListHead", null);
        setIntField(term2730, term2730.getClass(), "sourcePosition", 0);
        setField(term2730, term2730.getClass(), "jsType", null);
        setField(term2730, term2730.getClass(), "parent", null);
        setField(term2722, term2722.getClass(), "last", term2730);
        setField(term2733, term2733.getClass(), "next", null);
        setIntField(term2733, term2733.getClass(), "type", 0);
        setIntField(term2733, term2733.getClass(), "intValue", 0);
        setField(term2733, term2733.getClass(), "objectValue", null);
        setField(term2722, term2722.getClass(), "propListHead", term2733);
        setIntField(term2722, term2722.getClass(), "sourcePosition", 185751892);
        setField(term2722, term2722.getClass(), "jsType", null);
        setField(term2722, term2722.getClass(), "parent", null);
        setField(term2720, term2720.getClass(), "next", term2722);
        setIntField(term2737, term2737.getClass(), "type", 0);
        setField(term2737, term2737.getClass(), "next", null);
        setField(term2737, term2737.getClass(), "first", null);
        setField(term2737, term2737.getClass(), "last", null);
        setField(term2737, term2737.getClass(), "propListHead", null);
        setIntField(term2737, term2737.getClass(), "sourcePosition", 0);
        setField(term2737, term2737.getClass(), "jsType", null);
        setField(term2737, term2737.getClass(), "parent", null);
        setField(term2720, term2720.getClass(), "first", term2737);
        setIntField(term2740, term2740.getClass(), "type", 0);
        setField(term2740, term2740.getClass(), "next", null);
        setField(term2740, term2740.getClass(), "first", null);
        setField(term2740, term2740.getClass(), "last", null);
        setField(term2740, term2740.getClass(), "propListHead", null);
        setIntField(term2740, term2740.getClass(), "sourcePosition", 0);
        setField(term2740, term2740.getClass(), "jsType", null);
        setField(term2740, term2740.getClass(), "parent", null);
        setField(term2720, term2720.getClass(), "last", term2740);
        setField(term2743, term2743.getClass(), "next", null);
        setIntField(term2743, term2743.getClass(), "type", 0);
        setIntField(term2743, term2743.getClass(), "intValue", 0);
        setField(term2743, term2743.getClass(), "objectValue", null);
        setField(term2720, term2720.getClass(), "propListHead", term2743);
        setIntField(term2720, term2720.getClass(), "sourcePosition", 1068256001);
        setField(term2720, term2720.getClass(), "jsType", null);
        setField(term2720, term2720.getClass(), "parent", null);
        term2747 = new Integer(1139078354);
        term14209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14214 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14217 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14209, term14209.getClass(), "type", 1835568392);
        setIntField(term14210, term14210.getClass(), "type", -299497261);
        setIntField(term14211, term14211.getClass(), "type", 0);
        setField(term14211, term14211.getClass(), "next", null);
        setField(term14211, term14211.getClass(), "first", null);
        setField(term14211, term14211.getClass(), "last", null);
        setField(term14211, term14211.getClass(), "propListHead", null);
        setIntField(term14211, term14211.getClass(), "sourcePosition", 0);
        setField(term14211, term14211.getClass(), "jsType", null);
        setField(term14211, term14211.getClass(), "parent", null);
        setField(term14210, term14210.getClass(), "next", term14211);
        setIntField(term14212, term14212.getClass(), "type", 0);
        setField(term14212, term14212.getClass(), "next", null);
        setField(term14212, term14212.getClass(), "first", null);
        setField(term14212, term14212.getClass(), "last", null);
        setField(term14212, term14212.getClass(), "propListHead", null);
        setIntField(term14212, term14212.getClass(), "sourcePosition", 0);
        setField(term14212, term14212.getClass(), "jsType", null);
        setField(term14212, term14212.getClass(), "parent", null);
        setField(term14210, term14210.getClass(), "first", term14212);
        setIntField(term14213, term14213.getClass(), "type", 0);
        setField(term14213, term14213.getClass(), "next", null);
        setField(term14213, term14213.getClass(), "first", null);
        setField(term14213, term14213.getClass(), "last", null);
        setField(term14213, term14213.getClass(), "propListHead", null);
        setIntField(term14213, term14213.getClass(), "sourcePosition", 0);
        setField(term14213, term14213.getClass(), "jsType", null);
        setField(term14213, term14213.getClass(), "parent", null);
        setField(term14210, term14210.getClass(), "last", term14213);
        setField(term14214, term14214.getClass(), "next", null);
        setIntField(term14214, term14214.getClass(), "type", 0);
        setIntField(term14214, term14214.getClass(), "intValue", 0);
        setField(term14214, term14214.getClass(), "objectValue", null);
        setField(term14210, term14210.getClass(), "propListHead", term14214);
        setIntField(term14210, term14210.getClass(), "sourcePosition", 185751892);
        setField(term14210, term14210.getClass(), "jsType", null);
        setField(term14210, term14210.getClass(), "parent", null);
        setField(term14209, term14209.getClass(), "next", term14210);
        setIntField(term14215, term14215.getClass(), "type", 0);
        setField(term14215, term14215.getClass(), "next", null);
        setField(term14215, term14215.getClass(), "first", null);
        setField(term14215, term14215.getClass(), "last", null);
        setField(term14215, term14215.getClass(), "propListHead", null);
        setIntField(term14215, term14215.getClass(), "sourcePosition", 0);
        setField(term14215, term14215.getClass(), "jsType", null);
        setField(term14215, term14215.getClass(), "parent", null);
        setField(term14209, term14209.getClass(), "first", term14215);
        setIntField(term14216, term14216.getClass(), "type", 0);
        setField(term14216, term14216.getClass(), "next", null);
        setField(term14216, term14216.getClass(), "first", null);
        setField(term14216, term14216.getClass(), "last", null);
        setField(term14216, term14216.getClass(), "propListHead", null);
        setIntField(term14216, term14216.getClass(), "sourcePosition", 0);
        setField(term14216, term14216.getClass(), "jsType", null);
        setField(term14216, term14216.getClass(), "parent", null);
        setField(term14209, term14209.getClass(), "last", term14216);
        setField(term14217, term14217.getClass(), "next", null);
        setIntField(term14217, term14217.getClass(), "type", 0);
        setIntField(term14217, term14217.getClass(), "intValue", 0);
        setField(term14217, term14217.getClass(), "objectValue", null);
        setField(term14209, term14209.getClass(), "propListHead", term14217);
        setIntField(term14209, term14209.getClass(), "sourcePosition", 1068256001);
        setField(term14209, term14209.getClass(), "jsType", null);
        setField(term14209, term14209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2720;
        args[1] = term2747;
        callMethod(klass, "isNodeTypeReferenced", argTypes, null, args);
        assertTrue(recursiveEquals(term2720, 1139078354));
        assertTrue(recursiveEquals(term2747, term14209));
    }

};


