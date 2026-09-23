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

public class NodeUtil_getRootOfQualifiedName_883329160272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3486;

    public NodeUtil_getRootOfQualifiedName_883329160272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3503 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3486, term3486.getClass(), "type", 1054887169);
        setIntField(term3488, term3488.getClass(), "type", 692873905);
        setIntField(term3490, term3490.getClass(), "type", 1734759369);
        setIntField(term3492, term3492.getClass(), "type", 1841493736);
        setIntField(term3494, term3494.getClass(), "type", 320739944);
        setField(term3494, term3494.getClass(), "next", null);
        setField(term3494, term3494.getClass(), "first", null);
        setField(term3494, term3494.getClass(), "last", null);
        setField(term3494, term3494.getClass(), "propListHead", null);
        setIntField(term3494, term3494.getClass(), "sourcePosition", 0);
        setField(term3494, term3494.getClass(), "jsType", null);
        setField(term3494, term3494.getClass(), "parent", null);
        setField(term3492, term3492.getClass(), "next", term3494);
        setIntField(term3497, term3497.getClass(), "type", 760218111);
        setField(term3497, term3497.getClass(), "next", null);
        setField(term3497, term3497.getClass(), "first", null);
        setField(term3497, term3497.getClass(), "last", term3494);
        setField(term3497, term3497.getClass(), "propListHead", null);
        setIntField(term3497, term3497.getClass(), "sourcePosition", 0);
        setField(term3497, term3497.getClass(), "jsType", null);
        setField(term3497, term3497.getClass(), "parent", null);
        setField(term3492, term3492.getClass(), "first", term3497);
        setField(term3492, term3492.getClass(), "last", term3490);
        setField(term3492, term3492.getClass(), "propListHead", null);
        setIntField(term3492, term3492.getClass(), "sourcePosition", 0);
        setField(term3492, term3492.getClass(), "jsType", null);
        setField(term3492, term3492.getClass(), "parent", null);
        setField(term3490, term3490.getClass(), "next", term3492);
        setField(term3490, term3490.getClass(), "first", term3494);
        setIntField(term3501, term3501.getClass(), "type", -1963228619);
        setIntField(term3503, term3503.getClass(), "type", -709868952);
        setField(term3503, term3503.getClass(), "next", null);
        setField(term3503, term3503.getClass(), "first", term3497);
        setField(term3503, term3503.getClass(), "last", term3492);
        setField(term3503, term3503.getClass(), "propListHead", null);
        setIntField(term3503, term3503.getClass(), "sourcePosition", 0);
        setField(term3503, term3503.getClass(), "jsType", null);
        setField(term3503, term3503.getClass(), "parent", null);
        setField(term3501, term3501.getClass(), "next", term3503);
        setField(term3501, term3501.getClass(), "first", term3488);
        setField(term3501, term3501.getClass(), "last", term3488);
        setField(term3501, term3501.getClass(), "propListHead", null);
        setIntField(term3501, term3501.getClass(), "sourcePosition", 0);
        setField(term3501, term3501.getClass(), "jsType", null);
        setField(term3501, term3501.getClass(), "parent", null);
        setField(term3490, term3490.getClass(), "last", term3501);
        setField(term3490, term3490.getClass(), "propListHead", null);
        setIntField(term3490, term3490.getClass(), "sourcePosition", 0);
        setField(term3490, term3490.getClass(), "jsType", null);
        setField(term3490, term3490.getClass(), "parent", null);
        setField(term3488, term3488.getClass(), "next", term3490);
        setIntField(term3508, term3508.getClass(), "type", 847207929);
        setField(term3508, term3508.getClass(), "next", term3501);
        setField(term3508, term3508.getClass(), "first", term3503);
        setField(term3508, term3508.getClass(), "last", term3486);
        setField(term3508, term3508.getClass(), "propListHead", null);
        setIntField(term3508, term3508.getClass(), "sourcePosition", 0);
        setField(term3508, term3508.getClass(), "jsType", null);
        setField(term3508, term3508.getClass(), "parent", null);
        setField(term3488, term3488.getClass(), "first", term3508);
        setField(term3488, term3488.getClass(), "last", term3508);
        setField(term3488, term3488.getClass(), "propListHead", null);
        setIntField(term3488, term3488.getClass(), "sourcePosition", 0);
        setField(term3488, term3488.getClass(), "jsType", null);
        setField(term3488, term3488.getClass(), "parent", null);
        setField(term3486, term3486.getClass(), "next", term3488);
        setField(term3486, term3486.getClass(), "first", term3492);
        setField(term3486, term3486.getClass(), "last", term3494);
        setField(term3486, term3486.getClass(), "propListHead", null);
        setIntField(term3486, term3486.getClass(), "sourcePosition", 0);
        setField(term3486, term3486.getClass(), "jsType", null);
        setField(term3486, term3486.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3486;
        try {
            callMethod(klass, "getRootOfQualifiedName", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


