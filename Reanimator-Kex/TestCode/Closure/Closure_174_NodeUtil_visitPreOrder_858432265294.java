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

public class NodeUtil_visitPreOrder_858432265294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4260;

    public NodeUtil_visitPreOrder_858432265294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4260 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4262 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4271 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4275 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4260, term4260.getClass(), "type", -1231122778);
        setIntField(term4262, term4262.getClass(), "type", 1923558221);
        setIntField(term4264, term4264.getClass(), "type", 1762934060);
        setIntField(term4266, term4266.getClass(), "type", -859828739);
        setIntField(term4268, term4268.getClass(), "type", 1986855642);
        setField(term4268, term4268.getClass(), "next", null);
        setField(term4268, term4268.getClass(), "first", null);
        setField(term4268, term4268.getClass(), "last", null);
        setField(term4268, term4268.getClass(), "propListHead", null);
        setIntField(term4268, term4268.getClass(), "sourcePosition", 0);
        setField(term4268, term4268.getClass(), "jsType", null);
        setField(term4268, term4268.getClass(), "parent", null);
        setField(term4266, term4266.getClass(), "next", term4268);
        setIntField(term4271, term4271.getClass(), "type", 1280322790);
        setField(term4271, term4271.getClass(), "next", null);
        setField(term4271, term4271.getClass(), "first", null);
        setField(term4271, term4271.getClass(), "last", term4268);
        setField(term4271, term4271.getClass(), "propListHead", null);
        setIntField(term4271, term4271.getClass(), "sourcePosition", 0);
        setField(term4271, term4271.getClass(), "jsType", null);
        setField(term4271, term4271.getClass(), "parent", null);
        setField(term4266, term4266.getClass(), "first", term4271);
        setField(term4266, term4266.getClass(), "last", term4264);
        setField(term4266, term4266.getClass(), "propListHead", null);
        setIntField(term4266, term4266.getClass(), "sourcePosition", 0);
        setField(term4266, term4266.getClass(), "jsType", null);
        setField(term4266, term4266.getClass(), "parent", null);
        setField(term4264, term4264.getClass(), "next", term4266);
        setField(term4264, term4264.getClass(), "first", term4268);
        setIntField(term4275, term4275.getClass(), "type", -1592307668);
        setIntField(term4277, term4277.getClass(), "type", -203832871);
        setField(term4277, term4277.getClass(), "next", null);
        setField(term4277, term4277.getClass(), "first", term4271);
        setField(term4277, term4277.getClass(), "last", term4266);
        setField(term4277, term4277.getClass(), "propListHead", null);
        setIntField(term4277, term4277.getClass(), "sourcePosition", 0);
        setField(term4277, term4277.getClass(), "jsType", null);
        setField(term4277, term4277.getClass(), "parent", null);
        setField(term4275, term4275.getClass(), "next", term4277);
        setField(term4275, term4275.getClass(), "first", term4262);
        setField(term4275, term4275.getClass(), "last", term4262);
        setField(term4275, term4275.getClass(), "propListHead", null);
        setIntField(term4275, term4275.getClass(), "sourcePosition", 0);
        setField(term4275, term4275.getClass(), "jsType", null);
        setField(term4275, term4275.getClass(), "parent", null);
        setField(term4264, term4264.getClass(), "last", term4275);
        setField(term4264, term4264.getClass(), "propListHead", null);
        setIntField(term4264, term4264.getClass(), "sourcePosition", 0);
        setField(term4264, term4264.getClass(), "jsType", null);
        setField(term4264, term4264.getClass(), "parent", null);
        setField(term4262, term4262.getClass(), "next", term4264);
        setIntField(term4282, term4282.getClass(), "type", 1151963130);
        setField(term4282, term4282.getClass(), "next", term4275);
        setField(term4282, term4282.getClass(), "first", term4277);
        setField(term4282, term4282.getClass(), "last", term4260);
        setField(term4282, term4282.getClass(), "propListHead", null);
        setIntField(term4282, term4282.getClass(), "sourcePosition", 0);
        setField(term4282, term4282.getClass(), "jsType", null);
        setField(term4282, term4282.getClass(), "parent", null);
        setField(term4262, term4262.getClass(), "first", term4282);
        setField(term4262, term4262.getClass(), "last", term4282);
        setField(term4262, term4262.getClass(), "propListHead", null);
        setIntField(term4262, term4262.getClass(), "sourcePosition", 0);
        setField(term4262, term4262.getClass(), "jsType", null);
        setField(term4262, term4262.getClass(), "parent", null);
        setField(term4260, term4260.getClass(), "next", term4262);
        setField(term4260, term4260.getClass(), "first", term4266);
        setField(term4260, term4260.getClass(), "last", term4268);
        setField(term4260, term4260.getClass(), "propListHead", null);
        setIntField(term4260, term4260.getClass(), "sourcePosition", 0);
        setField(term4260, term4260.getClass(), "jsType", null);
        setField(term4260, term4260.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term4260;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPreOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


