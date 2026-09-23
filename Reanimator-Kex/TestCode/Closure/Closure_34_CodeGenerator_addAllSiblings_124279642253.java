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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addAllSiblings_124279642253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643;
     Object term2654;

    public CodeGenerator_addAllSiblings_124279642253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2644 = new HashMap();
        term2643 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2643, term2643.getClass(), "ESCAPED_JS_STRINGS", term2644);
        setField(term2643, term2643.getClass(), "cc", null);
        setField(term2643, term2643.getClass(), "outputCharsetEncoder", null);
        term2654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2654, term2654.getClass(), "type", 568954359);
        setIntField(term2656, term2656.getClass(), "type", 53410913);
        setIntField(term2658, term2658.getClass(), "type", -375014958);
        setIntField(term2660, term2660.getClass(), "type", 1107176718);
        setIntField(term2662, term2662.getClass(), "type", 480137250);
        setField(term2662, term2662.getClass(), "next", null);
        setField(term2662, term2662.getClass(), "first", null);
        setField(term2662, term2662.getClass(), "last", null);
        setField(term2662, term2662.getClass(), "propListHead", null);
        setIntField(term2662, term2662.getClass(), "sourcePosition", 0);
        setField(term2662, term2662.getClass(), "jsType", null);
        setField(term2662, term2662.getClass(), "parent", null);
        setField(term2660, term2660.getClass(), "next", term2662);
        setIntField(term2665, term2665.getClass(), "type", -341152642);
        setField(term2665, term2665.getClass(), "next", null);
        setField(term2665, term2665.getClass(), "first", null);
        setField(term2665, term2665.getClass(), "last", term2662);
        setField(term2665, term2665.getClass(), "propListHead", null);
        setIntField(term2665, term2665.getClass(), "sourcePosition", 0);
        setField(term2665, term2665.getClass(), "jsType", null);
        setField(term2665, term2665.getClass(), "parent", null);
        setField(term2660, term2660.getClass(), "first", term2665);
        setField(term2660, term2660.getClass(), "last", term2658);
        setField(term2660, term2660.getClass(), "propListHead", null);
        setIntField(term2660, term2660.getClass(), "sourcePosition", 0);
        setField(term2660, term2660.getClass(), "jsType", null);
        setField(term2660, term2660.getClass(), "parent", null);
        setField(term2658, term2658.getClass(), "next", term2660);
        setField(term2658, term2658.getClass(), "first", term2662);
        setIntField(term2669, term2669.getClass(), "type", 538259104);
        setIntField(term2671, term2671.getClass(), "type", 96566506);
        setField(term2671, term2671.getClass(), "next", null);
        setField(term2671, term2671.getClass(), "first", term2665);
        setField(term2671, term2671.getClass(), "last", term2660);
        setField(term2671, term2671.getClass(), "propListHead", null);
        setIntField(term2671, term2671.getClass(), "sourcePosition", 0);
        setField(term2671, term2671.getClass(), "jsType", null);
        setField(term2671, term2671.getClass(), "parent", null);
        setField(term2669, term2669.getClass(), "next", term2671);
        setField(term2669, term2669.getClass(), "first", term2656);
        setField(term2669, term2669.getClass(), "last", term2656);
        setField(term2669, term2669.getClass(), "propListHead", null);
        setIntField(term2669, term2669.getClass(), "sourcePosition", 0);
        setField(term2669, term2669.getClass(), "jsType", null);
        setField(term2669, term2669.getClass(), "parent", null);
        setField(term2658, term2658.getClass(), "last", term2669);
        setField(term2658, term2658.getClass(), "propListHead", null);
        setIntField(term2658, term2658.getClass(), "sourcePosition", 0);
        setField(term2658, term2658.getClass(), "jsType", null);
        setField(term2658, term2658.getClass(), "parent", null);
        setField(term2656, term2656.getClass(), "next", term2658);
        setIntField(term2676, term2676.getClass(), "type", -343325701);
        setField(term2676, term2676.getClass(), "next", term2669);
        setField(term2676, term2676.getClass(), "first", term2671);
        setField(term2676, term2676.getClass(), "last", term2654);
        setField(term2676, term2676.getClass(), "propListHead", null);
        setIntField(term2676, term2676.getClass(), "sourcePosition", 0);
        setField(term2676, term2676.getClass(), "jsType", null);
        setField(term2676, term2676.getClass(), "parent", null);
        setField(term2656, term2656.getClass(), "first", term2676);
        setField(term2656, term2656.getClass(), "last", term2676);
        setField(term2656, term2656.getClass(), "propListHead", null);
        setIntField(term2656, term2656.getClass(), "sourcePosition", 0);
        setField(term2656, term2656.getClass(), "jsType", null);
        setField(term2656, term2656.getClass(), "parent", null);
        setField(term2654, term2654.getClass(), "next", term2656);
        setField(term2654, term2654.getClass(), "first", term2660);
        setField(term2654, term2654.getClass(), "last", term2662);
        setField(term2654, term2654.getClass(), "propListHead", null);
        setIntField(term2654, term2654.getClass(), "sourcePosition", 0);
        setField(term2654, term2654.getClass(), "jsType", null);
        setField(term2654, term2654.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2654;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term2643, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


