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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class NodeUtil_mayEffectMutableState_1910072630287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22587;
     Object term22601;

    public NodeUtil_mayEffectMutableState_1910072630287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22587, term22587.getClass(), "type", 124);
        term22601 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22601, term22601.getClass(), "type", 124);
        setField(term22601, term22601.getClass(), "next", null);
        setField(term22601, term22601.getClass(), "first", null);
        setField(term22601, term22601.getClass(), "last", null);
        setField(term22601, term22601.getClass(), "propListHead", null);
        setIntField(term22601, term22601.getClass(), "sourcePosition", 0);
        setField(term22601, term22601.getClass(), "jsType", null);
        setField(term22601, term22601.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term22587;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term22587, term22601));
    }

};


