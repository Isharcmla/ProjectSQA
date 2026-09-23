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

public class NodeUtil_getFunctionInfo_472281683233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3490;

    public NodeUtil_getFunctionInfo_472281683233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3503 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3513 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3490, term3490.getClass(), "type", 848113442);
        setIntField(term3492, term3492.getClass(), "type", -568450686);
        setIntField(term3494, term3494.getClass(), "type", 0);
        setField(term3494, term3494.getClass(), "next", null);
        setField(term3494, term3494.getClass(), "first", null);
        setField(term3494, term3494.getClass(), "last", null);
        setField(term3494, term3494.getClass(), "propListHead", null);
        setIntField(term3494, term3494.getClass(), "sourcePosition", 0);
        setField(term3494, term3494.getClass(), "jsType", null);
        setField(term3494, term3494.getClass(), "parent", null);
        setField(term3492, term3492.getClass(), "next", term3494);
        setIntField(term3497, term3497.getClass(), "type", 0);
        setField(term3497, term3497.getClass(), "next", null);
        setField(term3497, term3497.getClass(), "first", null);
        setField(term3497, term3497.getClass(), "last", null);
        setField(term3497, term3497.getClass(), "propListHead", null);
        setIntField(term3497, term3497.getClass(), "sourcePosition", 0);
        setField(term3497, term3497.getClass(), "jsType", null);
        setField(term3497, term3497.getClass(), "parent", null);
        setField(term3492, term3492.getClass(), "first", term3497);
        setIntField(term3500, term3500.getClass(), "type", 0);
        setField(term3500, term3500.getClass(), "next", null);
        setField(term3500, term3500.getClass(), "first", null);
        setField(term3500, term3500.getClass(), "last", null);
        setField(term3500, term3500.getClass(), "propListHead", null);
        setIntField(term3500, term3500.getClass(), "sourcePosition", 0);
        setField(term3500, term3500.getClass(), "jsType", null);
        setField(term3500, term3500.getClass(), "parent", null);
        setField(term3492, term3492.getClass(), "last", term3500);
        setField(term3503, term3503.getClass(), "next", null);
        setIntField(term3503, term3503.getClass(), "type", 0);
        setIntField(term3503, term3503.getClass(), "intValue", 0);
        setField(term3503, term3503.getClass(), "objectValue", null);
        setField(term3492, term3492.getClass(), "propListHead", term3503);
        setIntField(term3492, term3492.getClass(), "sourcePosition", 318982923);
        setField(term3492, term3492.getClass(), "jsType", null);
        setField(term3492, term3492.getClass(), "parent", null);
        setField(term3490, term3490.getClass(), "next", term3492);
        setIntField(term3507, term3507.getClass(), "type", 0);
        setField(term3507, term3507.getClass(), "next", null);
        setField(term3507, term3507.getClass(), "first", null);
        setField(term3507, term3507.getClass(), "last", null);
        setField(term3507, term3507.getClass(), "propListHead", null);
        setIntField(term3507, term3507.getClass(), "sourcePosition", 0);
        setField(term3507, term3507.getClass(), "jsType", null);
        setField(term3507, term3507.getClass(), "parent", null);
        setField(term3490, term3490.getClass(), "first", term3507);
        setIntField(term3510, term3510.getClass(), "type", 0);
        setField(term3510, term3510.getClass(), "next", null);
        setField(term3510, term3510.getClass(), "first", null);
        setField(term3510, term3510.getClass(), "last", null);
        setField(term3510, term3510.getClass(), "propListHead", null);
        setIntField(term3510, term3510.getClass(), "sourcePosition", 0);
        setField(term3510, term3510.getClass(), "jsType", null);
        setField(term3510, term3510.getClass(), "parent", null);
        setField(term3490, term3490.getClass(), "last", term3510);
        setField(term3513, term3513.getClass(), "next", null);
        setIntField(term3513, term3513.getClass(), "type", 0);
        setIntField(term3513, term3513.getClass(), "intValue", 0);
        setField(term3513, term3513.getClass(), "objectValue", null);
        setField(term3490, term3490.getClass(), "propListHead", term3513);
        setIntField(term3490, term3490.getClass(), "sourcePosition", -154210001);
        setField(term3490, term3490.getClass(), "jsType", null);
        setField(term3490, term3490.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3490;
        try {
            callMethod(klass, "getFunctionInfo", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


