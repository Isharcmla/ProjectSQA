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

public class NodeUtil_visitPostOrder_1046356874291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;

    public NodeUtil_visitPostOrder_1046356874291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3220, term3220.getClass(), "type", -616562794);
        setIntField(term3222, term3222.getClass(), "type", -767031634);
        setIntField(term3224, term3224.getClass(), "type", 0);
        setField(term3224, term3224.getClass(), "next", null);
        setField(term3224, term3224.getClass(), "first", null);
        setField(term3224, term3224.getClass(), "last", null);
        setField(term3224, term3224.getClass(), "propListHead", null);
        setIntField(term3224, term3224.getClass(), "sourcePosition", 0);
        setField(term3224, term3224.getClass(), "jsType", null);
        setField(term3224, term3224.getClass(), "parent", null);
        setField(term3222, term3222.getClass(), "next", term3224);
        setIntField(term3227, term3227.getClass(), "type", 0);
        setField(term3227, term3227.getClass(), "next", null);
        setField(term3227, term3227.getClass(), "first", null);
        setField(term3227, term3227.getClass(), "last", null);
        setField(term3227, term3227.getClass(), "propListHead", null);
        setIntField(term3227, term3227.getClass(), "sourcePosition", 0);
        setField(term3227, term3227.getClass(), "jsType", null);
        setField(term3227, term3227.getClass(), "parent", null);
        setField(term3222, term3222.getClass(), "first", term3227);
        setIntField(term3230, term3230.getClass(), "type", 0);
        setField(term3230, term3230.getClass(), "next", null);
        setField(term3230, term3230.getClass(), "first", null);
        setField(term3230, term3230.getClass(), "last", null);
        setField(term3230, term3230.getClass(), "propListHead", null);
        setIntField(term3230, term3230.getClass(), "sourcePosition", 0);
        setField(term3230, term3230.getClass(), "jsType", null);
        setField(term3230, term3230.getClass(), "parent", null);
        setField(term3222, term3222.getClass(), "last", term3230);
        setField(term3222, term3222.getClass(), "propListHead", null);
        setIntField(term3222, term3222.getClass(), "sourcePosition", 0);
        setField(term3222, term3222.getClass(), "jsType", null);
        setField(term3222, term3222.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "next", term3222);
        setIntField(term3234, term3234.getClass(), "type", 0);
        setField(term3234, term3234.getClass(), "next", null);
        setField(term3234, term3234.getClass(), "first", null);
        setField(term3234, term3234.getClass(), "last", null);
        setField(term3234, term3234.getClass(), "propListHead", null);
        setIntField(term3234, term3234.getClass(), "sourcePosition", 0);
        setField(term3234, term3234.getClass(), "jsType", null);
        setField(term3234, term3234.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "first", term3234);
        setIntField(term3237, term3237.getClass(), "type", 0);
        setField(term3237, term3237.getClass(), "next", null);
        setField(term3237, term3237.getClass(), "first", null);
        setField(term3237, term3237.getClass(), "last", null);
        setField(term3237, term3237.getClass(), "propListHead", null);
        setIntField(term3237, term3237.getClass(), "sourcePosition", 0);
        setField(term3237, term3237.getClass(), "jsType", null);
        setField(term3237, term3237.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "last", term3237);
        setField(term3220, term3220.getClass(), "propListHead", null);
        setIntField(term3220, term3220.getClass(), "sourcePosition", 0);
        setField(term3220, term3220.getClass(), "jsType", null);
        setField(term3220, term3220.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3220;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPostOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


