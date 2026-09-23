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

public class NodeUtil_has_1673681539278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3549;

    public NodeUtil_has_1673681539278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3566 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3549, term3549.getClass(), "type", 1761540885);
        setIntField(term3551, term3551.getClass(), "type", -168498989);
        setIntField(term3553, term3553.getClass(), "type", 388247095);
        setIntField(term3555, term3555.getClass(), "type", -1320402633);
        setIntField(term3557, term3557.getClass(), "type", 919602316);
        setField(term3557, term3557.getClass(), "next", null);
        setField(term3557, term3557.getClass(), "first", null);
        setField(term3557, term3557.getClass(), "last", null);
        setField(term3557, term3557.getClass(), "propListHead", null);
        setIntField(term3557, term3557.getClass(), "sourcePosition", 0);
        setField(term3557, term3557.getClass(), "jsType", null);
        setField(term3557, term3557.getClass(), "parent", null);
        setField(term3555, term3555.getClass(), "next", term3557);
        setIntField(term3560, term3560.getClass(), "type", 1833713431);
        setField(term3560, term3560.getClass(), "next", null);
        setField(term3560, term3560.getClass(), "first", null);
        setField(term3560, term3560.getClass(), "last", term3557);
        setField(term3560, term3560.getClass(), "propListHead", null);
        setIntField(term3560, term3560.getClass(), "sourcePosition", 0);
        setField(term3560, term3560.getClass(), "jsType", null);
        setField(term3560, term3560.getClass(), "parent", null);
        setField(term3555, term3555.getClass(), "first", term3560);
        setField(term3555, term3555.getClass(), "last", term3553);
        setField(term3555, term3555.getClass(), "propListHead", null);
        setIntField(term3555, term3555.getClass(), "sourcePosition", 0);
        setField(term3555, term3555.getClass(), "jsType", null);
        setField(term3555, term3555.getClass(), "parent", null);
        setField(term3553, term3553.getClass(), "next", term3555);
        setField(term3553, term3553.getClass(), "first", term3557);
        setIntField(term3564, term3564.getClass(), "type", -2003607923);
        setIntField(term3566, term3566.getClass(), "type", 1378805929);
        setField(term3566, term3566.getClass(), "next", null);
        setField(term3566, term3566.getClass(), "first", term3560);
        setField(term3566, term3566.getClass(), "last", term3555);
        setField(term3566, term3566.getClass(), "propListHead", null);
        setIntField(term3566, term3566.getClass(), "sourcePosition", 0);
        setField(term3566, term3566.getClass(), "jsType", null);
        setField(term3566, term3566.getClass(), "parent", null);
        setField(term3564, term3564.getClass(), "next", term3566);
        setField(term3564, term3564.getClass(), "first", term3551);
        setField(term3564, term3564.getClass(), "last", term3551);
        setField(term3564, term3564.getClass(), "propListHead", null);
        setIntField(term3564, term3564.getClass(), "sourcePosition", 0);
        setField(term3564, term3564.getClass(), "jsType", null);
        setField(term3564, term3564.getClass(), "parent", null);
        setField(term3553, term3553.getClass(), "last", term3564);
        setField(term3553, term3553.getClass(), "propListHead", null);
        setIntField(term3553, term3553.getClass(), "sourcePosition", 0);
        setField(term3553, term3553.getClass(), "jsType", null);
        setField(term3553, term3553.getClass(), "parent", null);
        setField(term3551, term3551.getClass(), "next", term3553);
        setIntField(term3571, term3571.getClass(), "type", 695052304);
        setField(term3571, term3571.getClass(), "next", term3564);
        setField(term3571, term3571.getClass(), "first", term3566);
        setField(term3571, term3571.getClass(), "last", term3549);
        setField(term3571, term3571.getClass(), "propListHead", null);
        setIntField(term3571, term3571.getClass(), "sourcePosition", 0);
        setField(term3571, term3571.getClass(), "jsType", null);
        setField(term3571, term3571.getClass(), "parent", null);
        setField(term3551, term3551.getClass(), "first", term3571);
        setField(term3551, term3551.getClass(), "last", term3571);
        setField(term3551, term3551.getClass(), "propListHead", null);
        setIntField(term3551, term3551.getClass(), "sourcePosition", 0);
        setField(term3551, term3551.getClass(), "jsType", null);
        setField(term3551, term3551.getClass(), "parent", null);
        setField(term3549, term3549.getClass(), "next", term3551);
        setField(term3549, term3549.getClass(), "first", term3555);
        setField(term3549, term3549.getClass(), "last", term3557);
        setField(term3549, term3549.getClass(), "propListHead", null);
        setIntField(term3549, term3549.getClass(), "sourcePosition", 0);
        setField(term3549, term3549.getClass(), "jsType", null);
        setField(term3549, term3549.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3549;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "has", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


