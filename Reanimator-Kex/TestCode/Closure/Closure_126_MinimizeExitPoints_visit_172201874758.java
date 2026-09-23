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

public class MinimizeExitPoints_visit_172201874758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9105;
     Object term9175;
     Object term9208;
     Object term9209;

    public MinimizeExitPoints_visit_172201874758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9105 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term9175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9175, term9175.getClass(), "type", 105);
        setField(term9175, term9175.getClass(), "last", term9175);
        term9208 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term9208, term9208.getClass(), "compiler", null);
        term9209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9209, term9209.getClass(), "type", 105);
        setField(term9209, term9209.getClass(), "next", null);
        setField(term9209, term9209.getClass(), "first", null);
        setField(term9209, term9209.getClass(), "last", term9209);
        setField(term9209, term9209.getClass(), "propListHead", null);
        setIntField(term9209, term9209.getClass(), "sourcePosition", 0);
        setField(term9209, term9209.getClass(), "jsType", null);
        setField(term9209, term9209.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term9175;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term9105, args);
        assertTrue(recursiveEquals(term9105, term9208));
        assertTrue(recursiveEquals(term9175, null));
    }

};


