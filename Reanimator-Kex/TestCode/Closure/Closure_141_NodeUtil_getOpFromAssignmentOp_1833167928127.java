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

public class NodeUtil_getOpFromAssignmentOp_1833167928127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;

    public NodeUtil_getOpFromAssignmentOp_1833167928127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term548 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term551 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term564 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term567 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term544, term544.getClass(), "type", -159494544);
        setIntField(term546, term546.getClass(), "type", 388157121);
        setIntField(term548, term548.getClass(), "type", 0);
        setField(term548, term548.getClass(), "next", null);
        setField(term548, term548.getClass(), "first", null);
        setField(term548, term548.getClass(), "last", null);
        setField(term548, term548.getClass(), "propListHead", null);
        setIntField(term548, term548.getClass(), "sourcePosition", 0);
        setField(term548, term548.getClass(), "jsType", null);
        setField(term548, term548.getClass(), "parent", null);
        setField(term546, term546.getClass(), "next", term548);
        setIntField(term551, term551.getClass(), "type", 0);
        setField(term551, term551.getClass(), "next", null);
        setField(term551, term551.getClass(), "first", null);
        setField(term551, term551.getClass(), "last", null);
        setField(term551, term551.getClass(), "propListHead", null);
        setIntField(term551, term551.getClass(), "sourcePosition", 0);
        setField(term551, term551.getClass(), "jsType", null);
        setField(term551, term551.getClass(), "parent", null);
        setField(term546, term546.getClass(), "first", term551);
        setIntField(term554, term554.getClass(), "type", 0);
        setField(term554, term554.getClass(), "next", null);
        setField(term554, term554.getClass(), "first", null);
        setField(term554, term554.getClass(), "last", null);
        setField(term554, term554.getClass(), "propListHead", null);
        setIntField(term554, term554.getClass(), "sourcePosition", 0);
        setField(term554, term554.getClass(), "jsType", null);
        setField(term554, term554.getClass(), "parent", null);
        setField(term546, term546.getClass(), "last", term554);
        setField(term557, term557.getClass(), "next", null);
        setIntField(term557, term557.getClass(), "type", 0);
        setIntField(term557, term557.getClass(), "intValue", 0);
        setField(term557, term557.getClass(), "objectValue", null);
        setField(term546, term546.getClass(), "propListHead", term557);
        setIntField(term546, term546.getClass(), "sourcePosition", 1270666529);
        setField(term546, term546.getClass(), "jsType", null);
        setField(term546, term546.getClass(), "parent", null);
        setField(term544, term544.getClass(), "next", term546);
        setIntField(term561, term561.getClass(), "type", 0);
        setField(term561, term561.getClass(), "next", null);
        setField(term561, term561.getClass(), "first", null);
        setField(term561, term561.getClass(), "last", null);
        setField(term561, term561.getClass(), "propListHead", null);
        setIntField(term561, term561.getClass(), "sourcePosition", 0);
        setField(term561, term561.getClass(), "jsType", null);
        setField(term561, term561.getClass(), "parent", null);
        setField(term544, term544.getClass(), "first", term561);
        setIntField(term564, term564.getClass(), "type", 0);
        setField(term564, term564.getClass(), "next", null);
        setField(term564, term564.getClass(), "first", null);
        setField(term564, term564.getClass(), "last", null);
        setField(term564, term564.getClass(), "propListHead", null);
        setIntField(term564, term564.getClass(), "sourcePosition", 0);
        setField(term564, term564.getClass(), "jsType", null);
        setField(term564, term564.getClass(), "parent", null);
        setField(term544, term544.getClass(), "last", term564);
        setField(term567, term567.getClass(), "next", null);
        setIntField(term567, term567.getClass(), "type", 0);
        setIntField(term567, term567.getClass(), "intValue", 0);
        setField(term567, term567.getClass(), "objectValue", null);
        setField(term544, term544.getClass(), "propListHead", term567);
        setIntField(term544, term544.getClass(), "sourcePosition", -1146679443);
        setField(term544, term544.getClass(), "jsType", null);
        setField(term544, term544.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term544;
        try {
            callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


