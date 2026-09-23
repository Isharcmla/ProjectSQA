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

public class NodeUtil_getRootOfQualifiedName_883329160266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3210;

    public NodeUtil_getRootOfQualifiedName_883329160266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3220 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3223 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3233 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3210, term3210.getClass(), "type", 1980267589);
        setIntField(term3212, term3212.getClass(), "type", -608393431);
        setIntField(term3214, term3214.getClass(), "type", 0);
        setField(term3214, term3214.getClass(), "next", null);
        setField(term3214, term3214.getClass(), "first", null);
        setField(term3214, term3214.getClass(), "last", null);
        setField(term3214, term3214.getClass(), "propListHead", null);
        setIntField(term3214, term3214.getClass(), "sourcePosition", 0);
        setField(term3214, term3214.getClass(), "jsType", null);
        setField(term3214, term3214.getClass(), "parent", null);
        setField(term3212, term3212.getClass(), "next", term3214);
        setIntField(term3217, term3217.getClass(), "type", 0);
        setField(term3217, term3217.getClass(), "next", null);
        setField(term3217, term3217.getClass(), "first", null);
        setField(term3217, term3217.getClass(), "last", null);
        setField(term3217, term3217.getClass(), "propListHead", null);
        setIntField(term3217, term3217.getClass(), "sourcePosition", 0);
        setField(term3217, term3217.getClass(), "jsType", null);
        setField(term3217, term3217.getClass(), "parent", null);
        setField(term3212, term3212.getClass(), "first", term3217);
        setIntField(term3220, term3220.getClass(), "type", 0);
        setField(term3220, term3220.getClass(), "next", null);
        setField(term3220, term3220.getClass(), "first", null);
        setField(term3220, term3220.getClass(), "last", null);
        setField(term3220, term3220.getClass(), "propListHead", null);
        setIntField(term3220, term3220.getClass(), "sourcePosition", 0);
        setField(term3220, term3220.getClass(), "jsType", null);
        setField(term3220, term3220.getClass(), "parent", null);
        setField(term3212, term3212.getClass(), "last", term3220);
        setField(term3223, term3223.getClass(), "next", null);
        setIntField(term3223, term3223.getClass(), "type", 0);
        setIntField(term3223, term3223.getClass(), "intValue", 0);
        setField(term3223, term3223.getClass(), "objectValue", null);
        setField(term3212, term3212.getClass(), "propListHead", term3223);
        setIntField(term3212, term3212.getClass(), "sourcePosition", 703799187);
        setField(term3212, term3212.getClass(), "jsType", null);
        setField(term3212, term3212.getClass(), "parent", null);
        setField(term3210, term3210.getClass(), "next", term3212);
        setIntField(term3227, term3227.getClass(), "type", 0);
        setField(term3227, term3227.getClass(), "next", null);
        setField(term3227, term3227.getClass(), "first", null);
        setField(term3227, term3227.getClass(), "last", null);
        setField(term3227, term3227.getClass(), "propListHead", null);
        setIntField(term3227, term3227.getClass(), "sourcePosition", 0);
        setField(term3227, term3227.getClass(), "jsType", null);
        setField(term3227, term3227.getClass(), "parent", null);
        setField(term3210, term3210.getClass(), "first", term3227);
        setIntField(term3230, term3230.getClass(), "type", 0);
        setField(term3230, term3230.getClass(), "next", null);
        setField(term3230, term3230.getClass(), "first", null);
        setField(term3230, term3230.getClass(), "last", null);
        setField(term3230, term3230.getClass(), "propListHead", null);
        setIntField(term3230, term3230.getClass(), "sourcePosition", 0);
        setField(term3230, term3230.getClass(), "jsType", null);
        setField(term3230, term3230.getClass(), "parent", null);
        setField(term3210, term3210.getClass(), "last", term3230);
        setField(term3233, term3233.getClass(), "next", null);
        setIntField(term3233, term3233.getClass(), "type", 0);
        setIntField(term3233, term3233.getClass(), "intValue", 0);
        setField(term3233, term3233.getClass(), "objectValue", null);
        setField(term3210, term3210.getClass(), "propListHead", term3233);
        setIntField(term3210, term3210.getClass(), "sourcePosition", -1305898281);
        setField(term3210, term3210.getClass(), "jsType", null);
        setField(term3210, term3210.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3210;
        try {
            callMethod(klass, "getRootOfQualifiedName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


