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

public class NodeUtil_mayHaveSideEffects_1029731851174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534;
     Object term7790;

    public NodeUtil_mayHaveSideEffects_1029731851174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term534, term534.getClass(), "type", -165587447);
        setIntField(term536, term536.getClass(), "type", -749861210);
        setIntField(term538, term538.getClass(), "type", 0);
        setField(term538, term538.getClass(), "next", null);
        setField(term538, term538.getClass(), "first", null);
        setField(term538, term538.getClass(), "last", null);
        setField(term538, term538.getClass(), "propListHead", null);
        setIntField(term538, term538.getClass(), "sourcePosition", 0);
        setField(term538, term538.getClass(), "jsType", null);
        setField(term538, term538.getClass(), "parent", null);
        setField(term536, term536.getClass(), "next", term538);
        setIntField(term541, term541.getClass(), "type", 0);
        setField(term541, term541.getClass(), "next", null);
        setField(term541, term541.getClass(), "first", null);
        setField(term541, term541.getClass(), "last", null);
        setField(term541, term541.getClass(), "propListHead", null);
        setIntField(term541, term541.getClass(), "sourcePosition", 0);
        setField(term541, term541.getClass(), "jsType", null);
        setField(term541, term541.getClass(), "parent", null);
        setField(term536, term536.getClass(), "first", term541);
        setIntField(term544, term544.getClass(), "type", 0);
        setField(term544, term544.getClass(), "next", null);
        setField(term544, term544.getClass(), "first", null);
        setField(term544, term544.getClass(), "last", null);
        setField(term544, term544.getClass(), "propListHead", null);
        setIntField(term544, term544.getClass(), "sourcePosition", 0);
        setField(term544, term544.getClass(), "jsType", null);
        setField(term544, term544.getClass(), "parent", null);
        setField(term536, term536.getClass(), "last", term544);
        setField(term547, term547.getClass(), "next", null);
        setIntField(term547, term547.getClass(), "type", 0);
        setIntField(term547, term547.getClass(), "intValue", 0);
        setField(term547, term547.getClass(), "objectValue", null);
        setField(term536, term536.getClass(), "propListHead", term547);
        setIntField(term536, term536.getClass(), "sourcePosition", -916584829);
        setField(term536, term536.getClass(), "jsType", null);
        setField(term536, term536.getClass(), "parent", null);
        setField(term534, term534.getClass(), "next", term536);
        setIntField(term551, term551.getClass(), "type", 0);
        setField(term551, term551.getClass(), "next", null);
        setField(term551, term551.getClass(), "first", null);
        setField(term551, term551.getClass(), "last", null);
        setField(term551, term551.getClass(), "propListHead", null);
        setIntField(term551, term551.getClass(), "sourcePosition", 0);
        setField(term551, term551.getClass(), "jsType", null);
        setField(term551, term551.getClass(), "parent", null);
        setField(term534, term534.getClass(), "first", term551);
        setIntField(term554, term554.getClass(), "type", 0);
        setField(term554, term554.getClass(), "next", null);
        setField(term554, term554.getClass(), "first", null);
        setField(term554, term554.getClass(), "last", null);
        setField(term554, term554.getClass(), "propListHead", null);
        setIntField(term554, term554.getClass(), "sourcePosition", 0);
        setField(term554, term554.getClass(), "jsType", null);
        setField(term554, term554.getClass(), "parent", null);
        setField(term534, term534.getClass(), "last", term554);
        setField(term557, term557.getClass(), "next", null);
        setIntField(term557, term557.getClass(), "type", 0);
        setIntField(term557, term557.getClass(), "intValue", 0);
        setField(term557, term557.getClass(), "objectValue", null);
        setField(term534, term534.getClass(), "propListHead", term557);
        setIntField(term534, term534.getClass(), "sourcePosition", -2131181468);
        setField(term534, term534.getClass(), "jsType", null);
        setField(term534, term534.getClass(), "parent", null);
        term7790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7795 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7798 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7790, term7790.getClass(), "type", -165587447);
        setIntField(term7791, term7791.getClass(), "type", -749861210);
        setIntField(term7792, term7792.getClass(), "type", 0);
        setField(term7792, term7792.getClass(), "next", null);
        setField(term7792, term7792.getClass(), "first", null);
        setField(term7792, term7792.getClass(), "last", null);
        setField(term7792, term7792.getClass(), "propListHead", null);
        setIntField(term7792, term7792.getClass(), "sourcePosition", 0);
        setField(term7792, term7792.getClass(), "jsType", null);
        setField(term7792, term7792.getClass(), "parent", null);
        setField(term7791, term7791.getClass(), "next", term7792);
        setIntField(term7793, term7793.getClass(), "type", 0);
        setField(term7793, term7793.getClass(), "next", null);
        setField(term7793, term7793.getClass(), "first", null);
        setField(term7793, term7793.getClass(), "last", null);
        setField(term7793, term7793.getClass(), "propListHead", null);
        setIntField(term7793, term7793.getClass(), "sourcePosition", 0);
        setField(term7793, term7793.getClass(), "jsType", null);
        setField(term7793, term7793.getClass(), "parent", null);
        setField(term7791, term7791.getClass(), "first", term7793);
        setIntField(term7794, term7794.getClass(), "type", 0);
        setField(term7794, term7794.getClass(), "next", null);
        setField(term7794, term7794.getClass(), "first", null);
        setField(term7794, term7794.getClass(), "last", null);
        setField(term7794, term7794.getClass(), "propListHead", null);
        setIntField(term7794, term7794.getClass(), "sourcePosition", 0);
        setField(term7794, term7794.getClass(), "jsType", null);
        setField(term7794, term7794.getClass(), "parent", null);
        setField(term7791, term7791.getClass(), "last", term7794);
        setField(term7795, term7795.getClass(), "next", null);
        setIntField(term7795, term7795.getClass(), "type", 0);
        setIntField(term7795, term7795.getClass(), "intValue", 0);
        setField(term7795, term7795.getClass(), "objectValue", null);
        setField(term7791, term7791.getClass(), "propListHead", term7795);
        setIntField(term7791, term7791.getClass(), "sourcePosition", -916584829);
        setField(term7791, term7791.getClass(), "jsType", null);
        setField(term7791, term7791.getClass(), "parent", null);
        setField(term7790, term7790.getClass(), "next", term7791);
        setIntField(term7796, term7796.getClass(), "type", 0);
        setField(term7796, term7796.getClass(), "next", null);
        setField(term7796, term7796.getClass(), "first", null);
        setField(term7796, term7796.getClass(), "last", null);
        setField(term7796, term7796.getClass(), "propListHead", null);
        setIntField(term7796, term7796.getClass(), "sourcePosition", 0);
        setField(term7796, term7796.getClass(), "jsType", null);
        setField(term7796, term7796.getClass(), "parent", null);
        setField(term7790, term7790.getClass(), "first", term7796);
        setIntField(term7797, term7797.getClass(), "type", 0);
        setField(term7797, term7797.getClass(), "next", null);
        setField(term7797, term7797.getClass(), "first", null);
        setField(term7797, term7797.getClass(), "last", null);
        setField(term7797, term7797.getClass(), "propListHead", null);
        setIntField(term7797, term7797.getClass(), "sourcePosition", 0);
        setField(term7797, term7797.getClass(), "jsType", null);
        setField(term7797, term7797.getClass(), "parent", null);
        setField(term7790, term7790.getClass(), "last", term7797);
        setField(term7798, term7798.getClass(), "next", null);
        setIntField(term7798, term7798.getClass(), "type", 0);
        setIntField(term7798, term7798.getClass(), "intValue", 0);
        setField(term7798, term7798.getClass(), "objectValue", null);
        setField(term7790, term7790.getClass(), "propListHead", term7798);
        setIntField(term7790, term7790.getClass(), "sourcePosition", -2131181468);
        setField(term7790, term7790.getClass(), "jsType", null);
        setField(term7790, term7790.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term534;
        args[1] = null;
        callMethod(klass, "mayHaveSideEffects", argTypes, null, args);
        assertTrue(recursiveEquals(term534, term7790));
    }

};


