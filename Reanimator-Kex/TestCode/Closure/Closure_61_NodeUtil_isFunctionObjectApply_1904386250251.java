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

public class NodeUtil_isFunctionObjectApply_1904386250251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2045;
     Object term14761;

    public NodeUtil_isFunctionObjectApply_1904386250251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2049 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2045, term2045.getClass(), "type", 434914590);
        setIntField(term2047, term2047.getClass(), "type", 1124282188);
        setIntField(term2049, term2049.getClass(), "type", 0);
        setField(term2049, term2049.getClass(), "next", null);
        setField(term2049, term2049.getClass(), "first", null);
        setField(term2049, term2049.getClass(), "last", null);
        setField(term2049, term2049.getClass(), "propListHead", null);
        setIntField(term2049, term2049.getClass(), "sourcePosition", 0);
        setField(term2049, term2049.getClass(), "jsType", null);
        setField(term2049, term2049.getClass(), "parent", null);
        setField(term2047, term2047.getClass(), "next", term2049);
        setIntField(term2052, term2052.getClass(), "type", 0);
        setField(term2052, term2052.getClass(), "next", null);
        setField(term2052, term2052.getClass(), "first", null);
        setField(term2052, term2052.getClass(), "last", null);
        setField(term2052, term2052.getClass(), "propListHead", null);
        setIntField(term2052, term2052.getClass(), "sourcePosition", 0);
        setField(term2052, term2052.getClass(), "jsType", null);
        setField(term2052, term2052.getClass(), "parent", null);
        setField(term2047, term2047.getClass(), "first", term2052);
        setIntField(term2055, term2055.getClass(), "type", 0);
        setField(term2055, term2055.getClass(), "next", null);
        setField(term2055, term2055.getClass(), "first", null);
        setField(term2055, term2055.getClass(), "last", null);
        setField(term2055, term2055.getClass(), "propListHead", null);
        setIntField(term2055, term2055.getClass(), "sourcePosition", 0);
        setField(term2055, term2055.getClass(), "jsType", null);
        setField(term2055, term2055.getClass(), "parent", null);
        setField(term2047, term2047.getClass(), "last", term2055);
        setField(term2047, term2047.getClass(), "propListHead", null);
        setIntField(term2047, term2047.getClass(), "sourcePosition", 0);
        setField(term2047, term2047.getClass(), "jsType", null);
        setField(term2047, term2047.getClass(), "parent", null);
        setField(term2045, term2045.getClass(), "next", term2047);
        setIntField(term2059, term2059.getClass(), "type", 0);
        setField(term2059, term2059.getClass(), "next", null);
        setField(term2059, term2059.getClass(), "first", null);
        setField(term2059, term2059.getClass(), "last", null);
        setField(term2059, term2059.getClass(), "propListHead", null);
        setIntField(term2059, term2059.getClass(), "sourcePosition", 0);
        setField(term2059, term2059.getClass(), "jsType", null);
        setField(term2059, term2059.getClass(), "parent", null);
        setField(term2045, term2045.getClass(), "first", term2059);
        setIntField(term2062, term2062.getClass(), "type", 0);
        setField(term2062, term2062.getClass(), "next", null);
        setField(term2062, term2062.getClass(), "first", null);
        setField(term2062, term2062.getClass(), "last", null);
        setField(term2062, term2062.getClass(), "propListHead", null);
        setIntField(term2062, term2062.getClass(), "sourcePosition", 0);
        setField(term2062, term2062.getClass(), "jsType", null);
        setField(term2062, term2062.getClass(), "parent", null);
        setField(term2045, term2045.getClass(), "last", term2062);
        setField(term2045, term2045.getClass(), "propListHead", null);
        setIntField(term2045, term2045.getClass(), "sourcePosition", 0);
        setField(term2045, term2045.getClass(), "jsType", null);
        setField(term2045, term2045.getClass(), "parent", null);
        term14761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14761, term14761.getClass(), "type", 434914590);
        setIntField(term14762, term14762.getClass(), "type", 1124282188);
        setIntField(term14763, term14763.getClass(), "type", 0);
        setField(term14763, term14763.getClass(), "next", null);
        setField(term14763, term14763.getClass(), "first", null);
        setField(term14763, term14763.getClass(), "last", null);
        setField(term14763, term14763.getClass(), "propListHead", null);
        setIntField(term14763, term14763.getClass(), "sourcePosition", 0);
        setField(term14763, term14763.getClass(), "jsType", null);
        setField(term14763, term14763.getClass(), "parent", null);
        setField(term14762, term14762.getClass(), "next", term14763);
        setIntField(term14764, term14764.getClass(), "type", 0);
        setField(term14764, term14764.getClass(), "next", null);
        setField(term14764, term14764.getClass(), "first", null);
        setField(term14764, term14764.getClass(), "last", null);
        setField(term14764, term14764.getClass(), "propListHead", null);
        setIntField(term14764, term14764.getClass(), "sourcePosition", 0);
        setField(term14764, term14764.getClass(), "jsType", null);
        setField(term14764, term14764.getClass(), "parent", null);
        setField(term14762, term14762.getClass(), "first", term14764);
        setIntField(term14765, term14765.getClass(), "type", 0);
        setField(term14765, term14765.getClass(), "next", null);
        setField(term14765, term14765.getClass(), "first", null);
        setField(term14765, term14765.getClass(), "last", null);
        setField(term14765, term14765.getClass(), "propListHead", null);
        setIntField(term14765, term14765.getClass(), "sourcePosition", 0);
        setField(term14765, term14765.getClass(), "jsType", null);
        setField(term14765, term14765.getClass(), "parent", null);
        setField(term14762, term14762.getClass(), "last", term14765);
        setField(term14762, term14762.getClass(), "propListHead", null);
        setIntField(term14762, term14762.getClass(), "sourcePosition", 0);
        setField(term14762, term14762.getClass(), "jsType", null);
        setField(term14762, term14762.getClass(), "parent", null);
        setField(term14761, term14761.getClass(), "next", term14762);
        setIntField(term14766, term14766.getClass(), "type", 0);
        setField(term14766, term14766.getClass(), "next", null);
        setField(term14766, term14766.getClass(), "first", null);
        setField(term14766, term14766.getClass(), "last", null);
        setField(term14766, term14766.getClass(), "propListHead", null);
        setIntField(term14766, term14766.getClass(), "sourcePosition", 0);
        setField(term14766, term14766.getClass(), "jsType", null);
        setField(term14766, term14766.getClass(), "parent", null);
        setField(term14761, term14761.getClass(), "first", term14766);
        setIntField(term14767, term14767.getClass(), "type", 0);
        setField(term14767, term14767.getClass(), "next", null);
        setField(term14767, term14767.getClass(), "first", null);
        setField(term14767, term14767.getClass(), "last", null);
        setField(term14767, term14767.getClass(), "propListHead", null);
        setIntField(term14767, term14767.getClass(), "sourcePosition", 0);
        setField(term14767, term14767.getClass(), "jsType", null);
        setField(term14767, term14767.getClass(), "parent", null);
        setField(term14761, term14761.getClass(), "last", term14767);
        setField(term14761, term14761.getClass(), "propListHead", null);
        setIntField(term14761, term14761.getClass(), "sourcePosition", 0);
        setField(term14761, term14761.getClass(), "jsType", null);
        setField(term14761, term14761.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2045;
        callMethod(klass, "isFunctionObjectApply", argTypes, null, args);
        assertTrue(recursiveEquals(term2045, term14761));
    }

};


