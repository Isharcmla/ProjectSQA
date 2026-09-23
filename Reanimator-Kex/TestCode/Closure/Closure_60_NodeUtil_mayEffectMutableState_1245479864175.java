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

public class NodeUtil_mayEffectMutableState_1245479864175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;
     Object term6762;

    public NodeUtil_mayEffectMutableState_1245479864175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term394 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term392, term392.getClass(), "type", 1598895173);
        setIntField(term394, term394.getClass(), "type", 1953277050);
        setIntField(term396, term396.getClass(), "type", 0);
        setField(term396, term396.getClass(), "next", null);
        setField(term396, term396.getClass(), "first", null);
        setField(term396, term396.getClass(), "last", null);
        setField(term396, term396.getClass(), "propListHead", null);
        setIntField(term396, term396.getClass(), "sourcePosition", 0);
        setField(term396, term396.getClass(), "jsType", null);
        setField(term396, term396.getClass(), "parent", null);
        setField(term394, term394.getClass(), "next", term396);
        setIntField(term399, term399.getClass(), "type", 0);
        setField(term399, term399.getClass(), "next", null);
        setField(term399, term399.getClass(), "first", null);
        setField(term399, term399.getClass(), "last", null);
        setField(term399, term399.getClass(), "propListHead", null);
        setIntField(term399, term399.getClass(), "sourcePosition", 0);
        setField(term399, term399.getClass(), "jsType", null);
        setField(term399, term399.getClass(), "parent", null);
        setField(term394, term394.getClass(), "first", term399);
        setIntField(term402, term402.getClass(), "type", 0);
        setField(term402, term402.getClass(), "next", null);
        setField(term402, term402.getClass(), "first", null);
        setField(term402, term402.getClass(), "last", null);
        setField(term402, term402.getClass(), "propListHead", null);
        setIntField(term402, term402.getClass(), "sourcePosition", 0);
        setField(term402, term402.getClass(), "jsType", null);
        setField(term402, term402.getClass(), "parent", null);
        setField(term394, term394.getClass(), "last", term402);
        setField(term394, term394.getClass(), "propListHead", null);
        setIntField(term394, term394.getClass(), "sourcePosition", 0);
        setField(term394, term394.getClass(), "jsType", null);
        setField(term394, term394.getClass(), "parent", null);
        setField(term392, term392.getClass(), "next", term394);
        setIntField(term406, term406.getClass(), "type", 0);
        setField(term406, term406.getClass(), "next", null);
        setField(term406, term406.getClass(), "first", null);
        setField(term406, term406.getClass(), "last", null);
        setField(term406, term406.getClass(), "propListHead", null);
        setIntField(term406, term406.getClass(), "sourcePosition", 0);
        setField(term406, term406.getClass(), "jsType", null);
        setField(term406, term406.getClass(), "parent", null);
        setField(term392, term392.getClass(), "first", term406);
        setIntField(term409, term409.getClass(), "type", 0);
        setField(term409, term409.getClass(), "next", null);
        setField(term409, term409.getClass(), "first", null);
        setField(term409, term409.getClass(), "last", null);
        setField(term409, term409.getClass(), "propListHead", null);
        setIntField(term409, term409.getClass(), "sourcePosition", 0);
        setField(term409, term409.getClass(), "jsType", null);
        setField(term409, term409.getClass(), "parent", null);
        setField(term392, term392.getClass(), "last", term409);
        setField(term392, term392.getClass(), "propListHead", null);
        setIntField(term392, term392.getClass(), "sourcePosition", 0);
        setField(term392, term392.getClass(), "jsType", null);
        setField(term392, term392.getClass(), "parent", null);
        term6762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6762, term6762.getClass(), "type", 1598895173);
        setIntField(term6763, term6763.getClass(), "type", 1953277050);
        setIntField(term6764, term6764.getClass(), "type", 0);
        setField(term6764, term6764.getClass(), "next", null);
        setField(term6764, term6764.getClass(), "first", null);
        setField(term6764, term6764.getClass(), "last", null);
        setField(term6764, term6764.getClass(), "propListHead", null);
        setIntField(term6764, term6764.getClass(), "sourcePosition", 0);
        setField(term6764, term6764.getClass(), "jsType", null);
        setField(term6764, term6764.getClass(), "parent", null);
        setField(term6763, term6763.getClass(), "next", term6764);
        setIntField(term6765, term6765.getClass(), "type", 0);
        setField(term6765, term6765.getClass(), "next", null);
        setField(term6765, term6765.getClass(), "first", null);
        setField(term6765, term6765.getClass(), "last", null);
        setField(term6765, term6765.getClass(), "propListHead", null);
        setIntField(term6765, term6765.getClass(), "sourcePosition", 0);
        setField(term6765, term6765.getClass(), "jsType", null);
        setField(term6765, term6765.getClass(), "parent", null);
        setField(term6763, term6763.getClass(), "first", term6765);
        setIntField(term6766, term6766.getClass(), "type", 0);
        setField(term6766, term6766.getClass(), "next", null);
        setField(term6766, term6766.getClass(), "first", null);
        setField(term6766, term6766.getClass(), "last", null);
        setField(term6766, term6766.getClass(), "propListHead", null);
        setIntField(term6766, term6766.getClass(), "sourcePosition", 0);
        setField(term6766, term6766.getClass(), "jsType", null);
        setField(term6766, term6766.getClass(), "parent", null);
        setField(term6763, term6763.getClass(), "last", term6766);
        setField(term6763, term6763.getClass(), "propListHead", null);
        setIntField(term6763, term6763.getClass(), "sourcePosition", 0);
        setField(term6763, term6763.getClass(), "jsType", null);
        setField(term6763, term6763.getClass(), "parent", null);
        setField(term6762, term6762.getClass(), "next", term6763);
        setIntField(term6767, term6767.getClass(), "type", 0);
        setField(term6767, term6767.getClass(), "next", null);
        setField(term6767, term6767.getClass(), "first", null);
        setField(term6767, term6767.getClass(), "last", null);
        setField(term6767, term6767.getClass(), "propListHead", null);
        setIntField(term6767, term6767.getClass(), "sourcePosition", 0);
        setField(term6767, term6767.getClass(), "jsType", null);
        setField(term6767, term6767.getClass(), "parent", null);
        setField(term6762, term6762.getClass(), "first", term6767);
        setIntField(term6768, term6768.getClass(), "type", 0);
        setField(term6768, term6768.getClass(), "next", null);
        setField(term6768, term6768.getClass(), "first", null);
        setField(term6768, term6768.getClass(), "last", null);
        setField(term6768, term6768.getClass(), "propListHead", null);
        setIntField(term6768, term6768.getClass(), "sourcePosition", 0);
        setField(term6768, term6768.getClass(), "jsType", null);
        setField(term6768, term6768.getClass(), "parent", null);
        setField(term6762, term6762.getClass(), "last", term6768);
        setField(term6762, term6762.getClass(), "propListHead", null);
        setIntField(term6762, term6762.getClass(), "sourcePosition", 0);
        setField(term6762, term6762.getClass(), "jsType", null);
        setField(term6762, term6762.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term392;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term392, term6762));
    }

};


