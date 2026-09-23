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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_getCatchBlock_1684668872283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3684;

    public NodeUtil_getCatchBlock_1684668872283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3684, term3684.getClass(), "type", -1231122778);
        setIntField(term3686, term3686.getClass(), "type", 1923558221);
        setIntField(term3688, term3688.getClass(), "type", 1762934060);
        setIntField(term3690, term3690.getClass(), "type", -859828739);
        setIntField(term3692, term3692.getClass(), "type", 1986855642);
        setField(term3692, term3692.getClass(), "next", null);
        setField(term3692, term3692.getClass(), "first", null);
        setField(term3692, term3692.getClass(), "last", null);
        setField(term3692, term3692.getClass(), "propListHead", null);
        setIntField(term3692, term3692.getClass(), "sourcePosition", 0);
        setField(term3692, term3692.getClass(), "jsType", null);
        setField(term3692, term3692.getClass(), "parent", null);
        setField(term3690, term3690.getClass(), "next", term3692);
        setIntField(term3695, term3695.getClass(), "type", 1280322790);
        setField(term3695, term3695.getClass(), "next", null);
        setField(term3695, term3695.getClass(), "first", null);
        setField(term3695, term3695.getClass(), "last", term3692);
        setField(term3695, term3695.getClass(), "propListHead", null);
        setIntField(term3695, term3695.getClass(), "sourcePosition", 0);
        setField(term3695, term3695.getClass(), "jsType", null);
        setField(term3695, term3695.getClass(), "parent", null);
        setField(term3690, term3690.getClass(), "first", term3695);
        setField(term3690, term3690.getClass(), "last", term3688);
        setField(term3690, term3690.getClass(), "propListHead", null);
        setIntField(term3690, term3690.getClass(), "sourcePosition", 0);
        setField(term3690, term3690.getClass(), "jsType", null);
        setField(term3690, term3690.getClass(), "parent", null);
        setField(term3688, term3688.getClass(), "next", term3690);
        setField(term3688, term3688.getClass(), "first", term3692);
        setIntField(term3699, term3699.getClass(), "type", -1592307668);
        setIntField(term3701, term3701.getClass(), "type", -203832871);
        setField(term3701, term3701.getClass(), "next", null);
        setField(term3701, term3701.getClass(), "first", term3695);
        setField(term3701, term3701.getClass(), "last", term3690);
        setField(term3701, term3701.getClass(), "propListHead", null);
        setIntField(term3701, term3701.getClass(), "sourcePosition", 0);
        setField(term3701, term3701.getClass(), "jsType", null);
        setField(term3701, term3701.getClass(), "parent", null);
        setField(term3699, term3699.getClass(), "next", term3701);
        setField(term3699, term3699.getClass(), "first", term3686);
        setField(term3699, term3699.getClass(), "last", term3686);
        setField(term3699, term3699.getClass(), "propListHead", null);
        setIntField(term3699, term3699.getClass(), "sourcePosition", 0);
        setField(term3699, term3699.getClass(), "jsType", null);
        setField(term3699, term3699.getClass(), "parent", null);
        setField(term3688, term3688.getClass(), "last", term3699);
        setField(term3688, term3688.getClass(), "propListHead", null);
        setIntField(term3688, term3688.getClass(), "sourcePosition", 0);
        setField(term3688, term3688.getClass(), "jsType", null);
        setField(term3688, term3688.getClass(), "parent", null);
        setField(term3686, term3686.getClass(), "next", term3688);
        setIntField(term3706, term3706.getClass(), "type", 1151963130);
        setField(term3706, term3706.getClass(), "next", term3699);
        setField(term3706, term3706.getClass(), "first", term3701);
        setField(term3706, term3706.getClass(), "last", term3684);
        setField(term3706, term3706.getClass(), "propListHead", null);
        setIntField(term3706, term3706.getClass(), "sourcePosition", 0);
        setField(term3706, term3706.getClass(), "jsType", null);
        setField(term3706, term3706.getClass(), "parent", null);
        setField(term3686, term3686.getClass(), "first", term3706);
        setField(term3686, term3686.getClass(), "last", term3706);
        setField(term3686, term3686.getClass(), "propListHead", null);
        setIntField(term3686, term3686.getClass(), "sourcePosition", 0);
        setField(term3686, term3686.getClass(), "jsType", null);
        setField(term3686, term3686.getClass(), "parent", null);
        setField(term3684, term3684.getClass(), "next", term3686);
        setField(term3684, term3684.getClass(), "first", term3690);
        setField(term3684, term3684.getClass(), "last", term3692);
        setField(term3684, term3684.getClass(), "propListHead", null);
        setIntField(term3684, term3684.getClass(), "sourcePosition", 0);
        setField(term3684, term3684.getClass(), "jsType", null);
        setField(term3684, term3684.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3684;
        try {
            callMethod(klass, "getCatchBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


