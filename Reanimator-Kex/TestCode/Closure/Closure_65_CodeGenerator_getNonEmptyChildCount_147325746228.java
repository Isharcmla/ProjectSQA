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
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2598;
     Object term2625;

    public CodeGenerator_getNonEmptyChildCount_147325746228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2598 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2611 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2621 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2598, term2598.getClass(), "type", 663292551);
        setIntField(term2600, term2600.getClass(), "type", 197109649);
        setIntField(term2602, term2602.getClass(), "type", 0);
        setField(term2602, term2602.getClass(), "next", null);
        setField(term2602, term2602.getClass(), "first", null);
        setField(term2602, term2602.getClass(), "last", null);
        setField(term2602, term2602.getClass(), "propListHead", null);
        setIntField(term2602, term2602.getClass(), "sourcePosition", 0);
        setField(term2602, term2602.getClass(), "jsType", null);
        setField(term2602, term2602.getClass(), "parent", null);
        setField(term2600, term2600.getClass(), "next", term2602);
        setIntField(term2605, term2605.getClass(), "type", 0);
        setField(term2605, term2605.getClass(), "next", null);
        setField(term2605, term2605.getClass(), "first", null);
        setField(term2605, term2605.getClass(), "last", null);
        setField(term2605, term2605.getClass(), "propListHead", null);
        setIntField(term2605, term2605.getClass(), "sourcePosition", 0);
        setField(term2605, term2605.getClass(), "jsType", null);
        setField(term2605, term2605.getClass(), "parent", null);
        setField(term2600, term2600.getClass(), "first", term2605);
        setIntField(term2608, term2608.getClass(), "type", 0);
        setField(term2608, term2608.getClass(), "next", null);
        setField(term2608, term2608.getClass(), "first", null);
        setField(term2608, term2608.getClass(), "last", null);
        setField(term2608, term2608.getClass(), "propListHead", null);
        setIntField(term2608, term2608.getClass(), "sourcePosition", 0);
        setField(term2608, term2608.getClass(), "jsType", null);
        setField(term2608, term2608.getClass(), "parent", null);
        setField(term2600, term2600.getClass(), "last", term2608);
        setField(term2611, term2611.getClass(), "next", null);
        setIntField(term2611, term2611.getClass(), "type", 0);
        setIntField(term2611, term2611.getClass(), "intValue", 0);
        setField(term2611, term2611.getClass(), "objectValue", null);
        setField(term2600, term2600.getClass(), "propListHead", term2611);
        setIntField(term2600, term2600.getClass(), "sourcePosition", -1504890659);
        setField(term2600, term2600.getClass(), "jsType", null);
        setField(term2600, term2600.getClass(), "parent", null);
        setField(term2598, term2598.getClass(), "next", term2600);
        setIntField(term2615, term2615.getClass(), "type", 0);
        setField(term2615, term2615.getClass(), "next", null);
        setField(term2615, term2615.getClass(), "first", null);
        setField(term2615, term2615.getClass(), "last", null);
        setField(term2615, term2615.getClass(), "propListHead", null);
        setIntField(term2615, term2615.getClass(), "sourcePosition", 0);
        setField(term2615, term2615.getClass(), "jsType", null);
        setField(term2615, term2615.getClass(), "parent", null);
        setField(term2598, term2598.getClass(), "first", term2615);
        setIntField(term2618, term2618.getClass(), "type", 0);
        setField(term2618, term2618.getClass(), "next", null);
        setField(term2618, term2618.getClass(), "first", null);
        setField(term2618, term2618.getClass(), "last", null);
        setField(term2618, term2618.getClass(), "propListHead", null);
        setIntField(term2618, term2618.getClass(), "sourcePosition", 0);
        setField(term2618, term2618.getClass(), "jsType", null);
        setField(term2618, term2618.getClass(), "parent", null);
        setField(term2598, term2598.getClass(), "last", term2618);
        setField(term2621, term2621.getClass(), "next", null);
        setIntField(term2621, term2621.getClass(), "type", 0);
        setIntField(term2621, term2621.getClass(), "intValue", 0);
        setField(term2621, term2621.getClass(), "objectValue", null);
        setField(term2598, term2598.getClass(), "propListHead", term2621);
        setIntField(term2598, term2598.getClass(), "sourcePosition", 1358829571);
        setField(term2598, term2598.getClass(), "jsType", null);
        setField(term2598, term2598.getClass(), "parent", null);
        term2625 = new Integer(991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2598;
        args[1] = term2625;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


