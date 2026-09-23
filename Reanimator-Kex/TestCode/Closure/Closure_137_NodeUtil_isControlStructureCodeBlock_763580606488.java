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

public class NodeUtil_isControlStructureCodeBlock_763580606488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36251;
     Object term44413;

    public NodeUtil_isControlStructureCodeBlock_763580606488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term36251, term36251.getClass(), "type", 114);
        term44413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44413, term44413.getClass(), "type", 114);
        setField(term44413, term44413.getClass(), "next", null);
        setField(term44413, term44413.getClass(), "first", null);
        setField(term44413, term44413.getClass(), "last", null);
        setField(term44413, term44413.getClass(), "propListHead", null);
        setIntField(term44413, term44413.getClass(), "sourcePosition", 0);
        setField(term44413, term44413.getClass(), "jsType", null);
        setField(term44413, term44413.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term36251;
        args[1] = null;
        Object retValue = callMethod(klass, "isControlStructureCodeBlock", argTypes, null, args);
        assertTrue(recursiveEquals(term36251, term44413));
        assertTrue(recursiveEquals(retValue, true));
    }

};


