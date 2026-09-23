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

public class NodeUtil_visitPreOrder_858432265224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3220;

    public NodeUtil_visitPreOrder_858432265224() {
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
        Object term3233 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3243 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3220, term3220.getClass(), "type", -1652588127);
        setIntField(term3222, term3222.getClass(), "type", 1763217806);
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
        setField(term3233, term3233.getClass(), "next", null);
        setIntField(term3233, term3233.getClass(), "type", 0);
        setIntField(term3233, term3233.getClass(), "intValue", 0);
        setField(term3233, term3233.getClass(), "objectValue", null);
        setField(term3222, term3222.getClass(), "propListHead", term3233);
        setIntField(term3222, term3222.getClass(), "sourcePosition", 522440332);
        setField(term3222, term3222.getClass(), "jsType", null);
        setField(term3222, term3222.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "next", term3222);
        setIntField(term3237, term3237.getClass(), "type", 0);
        setField(term3237, term3237.getClass(), "next", null);
        setField(term3237, term3237.getClass(), "first", null);
        setField(term3237, term3237.getClass(), "last", null);
        setField(term3237, term3237.getClass(), "propListHead", null);
        setIntField(term3237, term3237.getClass(), "sourcePosition", 0);
        setField(term3237, term3237.getClass(), "jsType", null);
        setField(term3237, term3237.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "first", term3237);
        setIntField(term3240, term3240.getClass(), "type", 0);
        setField(term3240, term3240.getClass(), "next", null);
        setField(term3240, term3240.getClass(), "first", null);
        setField(term3240, term3240.getClass(), "last", null);
        setField(term3240, term3240.getClass(), "propListHead", null);
        setIntField(term3240, term3240.getClass(), "sourcePosition", 0);
        setField(term3240, term3240.getClass(), "jsType", null);
        setField(term3240, term3240.getClass(), "parent", null);
        setField(term3220, term3220.getClass(), "last", term3240);
        setField(term3243, term3243.getClass(), "next", null);
        setIntField(term3243, term3243.getClass(), "type", 0);
        setIntField(term3243, term3243.getClass(), "intValue", 0);
        setField(term3243, term3243.getClass(), "objectValue", null);
        setField(term3220, term3220.getClass(), "propListHead", term3243);
        setIntField(term3220, term3220.getClass(), "sourcePosition", 1516598327);
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
            callMethod(klass, "visitPreOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


