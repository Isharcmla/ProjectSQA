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

public class NodeUtil_hasFinally_1906674990282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3657;

    public NodeUtil_hasFinally_1906674990282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3661 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3668 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3657, term3657.getClass(), "type", 719185716);
        setIntField(term3659, term3659.getClass(), "type", 1624820010);
        setIntField(term3661, term3661.getClass(), "type", -831921156);
        setIntField(term3663, term3663.getClass(), "type", -2085566906);
        setIntField(term3665, term3665.getClass(), "type", 1773193728);
        setField(term3665, term3665.getClass(), "next", null);
        setField(term3665, term3665.getClass(), "first", null);
        setField(term3665, term3665.getClass(), "last", null);
        setField(term3665, term3665.getClass(), "propListHead", null);
        setIntField(term3665, term3665.getClass(), "sourcePosition", 0);
        setField(term3665, term3665.getClass(), "jsType", null);
        setField(term3665, term3665.getClass(), "parent", null);
        setField(term3663, term3663.getClass(), "next", term3665);
        setIntField(term3668, term3668.getClass(), "type", -1341357647);
        setField(term3668, term3668.getClass(), "next", null);
        setField(term3668, term3668.getClass(), "first", null);
        setField(term3668, term3668.getClass(), "last", term3665);
        setField(term3668, term3668.getClass(), "propListHead", null);
        setIntField(term3668, term3668.getClass(), "sourcePosition", 0);
        setField(term3668, term3668.getClass(), "jsType", null);
        setField(term3668, term3668.getClass(), "parent", null);
        setField(term3663, term3663.getClass(), "first", term3668);
        setField(term3663, term3663.getClass(), "last", term3661);
        setField(term3663, term3663.getClass(), "propListHead", null);
        setIntField(term3663, term3663.getClass(), "sourcePosition", 0);
        setField(term3663, term3663.getClass(), "jsType", null);
        setField(term3663, term3663.getClass(), "parent", null);
        setField(term3661, term3661.getClass(), "next", term3663);
        setField(term3661, term3661.getClass(), "first", term3665);
        setIntField(term3672, term3672.getClass(), "type", 114915275);
        setIntField(term3674, term3674.getClass(), "type", 338519695);
        setField(term3674, term3674.getClass(), "next", null);
        setField(term3674, term3674.getClass(), "first", term3668);
        setField(term3674, term3674.getClass(), "last", term3663);
        setField(term3674, term3674.getClass(), "propListHead", null);
        setIntField(term3674, term3674.getClass(), "sourcePosition", 0);
        setField(term3674, term3674.getClass(), "jsType", null);
        setField(term3674, term3674.getClass(), "parent", null);
        setField(term3672, term3672.getClass(), "next", term3674);
        setField(term3672, term3672.getClass(), "first", term3659);
        setField(term3672, term3672.getClass(), "last", term3659);
        setField(term3672, term3672.getClass(), "propListHead", null);
        setIntField(term3672, term3672.getClass(), "sourcePosition", 0);
        setField(term3672, term3672.getClass(), "jsType", null);
        setField(term3672, term3672.getClass(), "parent", null);
        setField(term3661, term3661.getClass(), "last", term3672);
        setField(term3661, term3661.getClass(), "propListHead", null);
        setIntField(term3661, term3661.getClass(), "sourcePosition", 0);
        setField(term3661, term3661.getClass(), "jsType", null);
        setField(term3661, term3661.getClass(), "parent", null);
        setField(term3659, term3659.getClass(), "next", term3661);
        setIntField(term3679, term3679.getClass(), "type", 2025566580);
        setField(term3679, term3679.getClass(), "next", term3672);
        setField(term3679, term3679.getClass(), "first", term3674);
        setField(term3679, term3679.getClass(), "last", term3657);
        setField(term3679, term3679.getClass(), "propListHead", null);
        setIntField(term3679, term3679.getClass(), "sourcePosition", 0);
        setField(term3679, term3679.getClass(), "jsType", null);
        setField(term3679, term3679.getClass(), "parent", null);
        setField(term3659, term3659.getClass(), "first", term3679);
        setField(term3659, term3659.getClass(), "last", term3679);
        setField(term3659, term3659.getClass(), "propListHead", null);
        setIntField(term3659, term3659.getClass(), "sourcePosition", 0);
        setField(term3659, term3659.getClass(), "jsType", null);
        setField(term3659, term3659.getClass(), "parent", null);
        setField(term3657, term3657.getClass(), "next", term3659);
        setField(term3657, term3657.getClass(), "first", term3663);
        setField(term3657, term3657.getClass(), "last", term3665);
        setField(term3657, term3657.getClass(), "propListHead", null);
        setIntField(term3657, term3657.getClass(), "sourcePosition", 0);
        setField(term3657, term3657.getClass(), "jsType", null);
        setField(term3657, term3657.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3657;
        try {
            callMethod(klass, "hasFinally", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


