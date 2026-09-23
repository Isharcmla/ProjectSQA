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

public class NodeUtil_getOpFromAssignmentOp_1833167928201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1217;

    public NodeUtil_getOpFromAssignmentOp_1833167928201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1224 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1230 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1240 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1217, term1217.getClass(), "type", -380787857);
        setIntField(term1219, term1219.getClass(), "type", 1608016787);
        setIntField(term1221, term1221.getClass(), "type", 0);
        setField(term1221, term1221.getClass(), "next", null);
        setField(term1221, term1221.getClass(), "first", null);
        setField(term1221, term1221.getClass(), "last", null);
        setField(term1221, term1221.getClass(), "propListHead", null);
        setIntField(term1221, term1221.getClass(), "sourcePosition", 0);
        setField(term1221, term1221.getClass(), "jsType", null);
        setField(term1221, term1221.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "next", term1221);
        setIntField(term1224, term1224.getClass(), "type", 0);
        setField(term1224, term1224.getClass(), "next", null);
        setField(term1224, term1224.getClass(), "first", null);
        setField(term1224, term1224.getClass(), "last", null);
        setField(term1224, term1224.getClass(), "propListHead", null);
        setIntField(term1224, term1224.getClass(), "sourcePosition", 0);
        setField(term1224, term1224.getClass(), "jsType", null);
        setField(term1224, term1224.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "first", term1224);
        setIntField(term1227, term1227.getClass(), "type", 0);
        setField(term1227, term1227.getClass(), "next", null);
        setField(term1227, term1227.getClass(), "first", null);
        setField(term1227, term1227.getClass(), "last", null);
        setField(term1227, term1227.getClass(), "propListHead", null);
        setIntField(term1227, term1227.getClass(), "sourcePosition", 0);
        setField(term1227, term1227.getClass(), "jsType", null);
        setField(term1227, term1227.getClass(), "parent", null);
        setField(term1219, term1219.getClass(), "last", term1227);
        setField(term1230, term1230.getClass(), "next", null);
        setIntField(term1230, term1230.getClass(), "type", 0);
        setIntField(term1230, term1230.getClass(), "intValue", 0);
        setField(term1230, term1230.getClass(), "objectValue", null);
        setField(term1219, term1219.getClass(), "propListHead", term1230);
        setIntField(term1219, term1219.getClass(), "sourcePosition", -2138825831);
        setField(term1219, term1219.getClass(), "jsType", null);
        setField(term1219, term1219.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "next", term1219);
        setIntField(term1234, term1234.getClass(), "type", 0);
        setField(term1234, term1234.getClass(), "next", null);
        setField(term1234, term1234.getClass(), "first", null);
        setField(term1234, term1234.getClass(), "last", null);
        setField(term1234, term1234.getClass(), "propListHead", null);
        setIntField(term1234, term1234.getClass(), "sourcePosition", 0);
        setField(term1234, term1234.getClass(), "jsType", null);
        setField(term1234, term1234.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "first", term1234);
        setIntField(term1237, term1237.getClass(), "type", 0);
        setField(term1237, term1237.getClass(), "next", null);
        setField(term1237, term1237.getClass(), "first", null);
        setField(term1237, term1237.getClass(), "last", null);
        setField(term1237, term1237.getClass(), "propListHead", null);
        setIntField(term1237, term1237.getClass(), "sourcePosition", 0);
        setField(term1237, term1237.getClass(), "jsType", null);
        setField(term1237, term1237.getClass(), "parent", null);
        setField(term1217, term1217.getClass(), "last", term1237);
        setField(term1240, term1240.getClass(), "next", null);
        setIntField(term1240, term1240.getClass(), "type", 0);
        setIntField(term1240, term1240.getClass(), "intValue", 0);
        setField(term1240, term1240.getClass(), "objectValue", null);
        setField(term1217, term1217.getClass(), "propListHead", term1240);
        setIntField(term1217, term1217.getClass(), "sourcePosition", 1454781562);
        setField(term1217, term1217.getClass(), "jsType", null);
        setField(term1217, term1217.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1217;
        try {
            callMethod(klass, "getOpFromAssignmentOp", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


