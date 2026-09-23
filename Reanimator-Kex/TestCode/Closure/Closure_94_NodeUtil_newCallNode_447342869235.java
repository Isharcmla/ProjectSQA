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

public class NodeUtil_newCallNode_447342869235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3544;
     Object term3571;

    public NodeUtil_newCallNode_447342869235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3557 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3567 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3544, term3544.getClass(), "type", -529831900);
        setIntField(term3546, term3546.getClass(), "type", 694100722);
        setIntField(term3548, term3548.getClass(), "type", 0);
        setField(term3548, term3548.getClass(), "next", null);
        setField(term3548, term3548.getClass(), "first", null);
        setField(term3548, term3548.getClass(), "last", null);
        setField(term3548, term3548.getClass(), "propListHead", null);
        setIntField(term3548, term3548.getClass(), "sourcePosition", 0);
        setField(term3548, term3548.getClass(), "jsType", null);
        setField(term3548, term3548.getClass(), "parent", null);
        setField(term3546, term3546.getClass(), "next", term3548);
        setIntField(term3551, term3551.getClass(), "type", 0);
        setField(term3551, term3551.getClass(), "next", null);
        setField(term3551, term3551.getClass(), "first", null);
        setField(term3551, term3551.getClass(), "last", null);
        setField(term3551, term3551.getClass(), "propListHead", null);
        setIntField(term3551, term3551.getClass(), "sourcePosition", 0);
        setField(term3551, term3551.getClass(), "jsType", null);
        setField(term3551, term3551.getClass(), "parent", null);
        setField(term3546, term3546.getClass(), "first", term3551);
        setIntField(term3554, term3554.getClass(), "type", 0);
        setField(term3554, term3554.getClass(), "next", null);
        setField(term3554, term3554.getClass(), "first", null);
        setField(term3554, term3554.getClass(), "last", null);
        setField(term3554, term3554.getClass(), "propListHead", null);
        setIntField(term3554, term3554.getClass(), "sourcePosition", 0);
        setField(term3554, term3554.getClass(), "jsType", null);
        setField(term3554, term3554.getClass(), "parent", null);
        setField(term3546, term3546.getClass(), "last", term3554);
        setField(term3557, term3557.getClass(), "next", null);
        setIntField(term3557, term3557.getClass(), "type", 0);
        setIntField(term3557, term3557.getClass(), "intValue", 0);
        setField(term3557, term3557.getClass(), "objectValue", null);
        setField(term3546, term3546.getClass(), "propListHead", term3557);
        setIntField(term3546, term3546.getClass(), "sourcePosition", 1169519385);
        setField(term3546, term3546.getClass(), "jsType", null);
        setField(term3546, term3546.getClass(), "parent", null);
        setField(term3544, term3544.getClass(), "next", term3546);
        setIntField(term3561, term3561.getClass(), "type", 0);
        setField(term3561, term3561.getClass(), "next", null);
        setField(term3561, term3561.getClass(), "first", null);
        setField(term3561, term3561.getClass(), "last", null);
        setField(term3561, term3561.getClass(), "propListHead", null);
        setIntField(term3561, term3561.getClass(), "sourcePosition", 0);
        setField(term3561, term3561.getClass(), "jsType", null);
        setField(term3561, term3561.getClass(), "parent", null);
        setField(term3544, term3544.getClass(), "first", term3561);
        setIntField(term3564, term3564.getClass(), "type", 0);
        setField(term3564, term3564.getClass(), "next", null);
        setField(term3564, term3564.getClass(), "first", null);
        setField(term3564, term3564.getClass(), "last", null);
        setField(term3564, term3564.getClass(), "propListHead", null);
        setIntField(term3564, term3564.getClass(), "sourcePosition", 0);
        setField(term3564, term3564.getClass(), "jsType", null);
        setField(term3564, term3564.getClass(), "parent", null);
        setField(term3544, term3544.getClass(), "last", term3564);
        setField(term3567, term3567.getClass(), "next", null);
        setIntField(term3567, term3567.getClass(), "type", 0);
        setIntField(term3567, term3567.getClass(), "intValue", 0);
        setField(term3567, term3567.getClass(), "objectValue", null);
        setField(term3544, term3544.getClass(), "propListHead", term3567);
        setIntField(term3544, term3544.getClass(), "sourcePosition", 1846078344);
        setField(term3544, term3544.getClass(), "jsType", null);
        setField(term3544, term3544.getClass(), "parent", null);
        term3571 = (Object[]) newArray("com.google.javascript.rhino.Node", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term3544;
        args[1] = term3571;
        try {
            callMethod(klass, "newCallNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


