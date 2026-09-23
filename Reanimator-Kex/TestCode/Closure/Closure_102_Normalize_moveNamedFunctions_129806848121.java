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

public class Normalize_moveNamedFunctions_129806848121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;
     Object term599;

    public Normalize_moveNamedFunctions_129806848121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term597, term597.getClass(), "compiler", null);
        setBooleanField(term597, term597.getClass(), "assertOnChange", true);
        term599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term612 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term622 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term599, term599.getClass(), "type", 991356662);
        setIntField(term601, term601.getClass(), "type", -1896376975);
        setIntField(term603, term603.getClass(), "type", 0);
        setField(term603, term603.getClass(), "next", null);
        setField(term603, term603.getClass(), "first", null);
        setField(term603, term603.getClass(), "last", null);
        setField(term603, term603.getClass(), "propListHead", null);
        setIntField(term603, term603.getClass(), "sourcePosition", 0);
        setField(term603, term603.getClass(), "jsType", null);
        setField(term603, term603.getClass(), "parent", null);
        setField(term601, term601.getClass(), "next", term603);
        setIntField(term606, term606.getClass(), "type", 0);
        setField(term606, term606.getClass(), "next", null);
        setField(term606, term606.getClass(), "first", null);
        setField(term606, term606.getClass(), "last", null);
        setField(term606, term606.getClass(), "propListHead", null);
        setIntField(term606, term606.getClass(), "sourcePosition", 0);
        setField(term606, term606.getClass(), "jsType", null);
        setField(term606, term606.getClass(), "parent", null);
        setField(term601, term601.getClass(), "first", term606);
        setIntField(term609, term609.getClass(), "type", 0);
        setField(term609, term609.getClass(), "next", null);
        setField(term609, term609.getClass(), "first", null);
        setField(term609, term609.getClass(), "last", null);
        setField(term609, term609.getClass(), "propListHead", null);
        setIntField(term609, term609.getClass(), "sourcePosition", 0);
        setField(term609, term609.getClass(), "jsType", null);
        setField(term609, term609.getClass(), "parent", null);
        setField(term601, term601.getClass(), "last", term609);
        setField(term612, term612.getClass(), "next", null);
        setIntField(term612, term612.getClass(), "type", 0);
        setIntField(term612, term612.getClass(), "intValue", 0);
        setField(term612, term612.getClass(), "objectValue", null);
        setField(term601, term601.getClass(), "propListHead", term612);
        setIntField(term601, term601.getClass(), "sourcePosition", 1687361082);
        setField(term601, term601.getClass(), "jsType", null);
        setField(term601, term601.getClass(), "parent", null);
        setField(term599, term599.getClass(), "next", term601);
        setIntField(term616, term616.getClass(), "type", 0);
        setField(term616, term616.getClass(), "next", null);
        setField(term616, term616.getClass(), "first", null);
        setField(term616, term616.getClass(), "last", null);
        setField(term616, term616.getClass(), "propListHead", null);
        setIntField(term616, term616.getClass(), "sourcePosition", 0);
        setField(term616, term616.getClass(), "jsType", null);
        setField(term616, term616.getClass(), "parent", null);
        setField(term599, term599.getClass(), "first", term616);
        setIntField(term619, term619.getClass(), "type", 0);
        setField(term619, term619.getClass(), "next", null);
        setField(term619, term619.getClass(), "first", null);
        setField(term619, term619.getClass(), "last", null);
        setField(term619, term619.getClass(), "propListHead", null);
        setIntField(term619, term619.getClass(), "sourcePosition", 0);
        setField(term619, term619.getClass(), "jsType", null);
        setField(term619, term619.getClass(), "parent", null);
        setField(term599, term599.getClass(), "last", term619);
        setField(term622, term622.getClass(), "next", null);
        setIntField(term622, term622.getClass(), "type", 0);
        setIntField(term622, term622.getClass(), "intValue", 0);
        setField(term622, term622.getClass(), "objectValue", null);
        setField(term599, term599.getClass(), "propListHead", term622);
        setIntField(term599, term599.getClass(), "sourcePosition", 584893196);
        setField(term599, term599.getClass(), "jsType", null);
        setField(term599, term599.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term599;
        try {
            callMethod(klass, "moveNamedFunctions", argTypes, term597, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


