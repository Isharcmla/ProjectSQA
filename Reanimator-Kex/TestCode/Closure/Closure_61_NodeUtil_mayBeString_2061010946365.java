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

public class NodeUtil_mayBeString_2061010946365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30838;
     Object term30888;

    public NodeUtil_mayBeString_2061010946365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30838, term30838.getClass(), "type", 26);
        term30888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30888, term30888.getClass(), "type", 26);
        setField(term30888, term30888.getClass(), "next", null);
        setField(term30888, term30888.getClass(), "first", null);
        setField(term30888, term30888.getClass(), "last", null);
        setField(term30888, term30888.getClass(), "propListHead", null);
        setIntField(term30888, term30888.getClass(), "sourcePosition", 0);
        setField(term30888, term30888.getClass(), "jsType", null);
        setField(term30888, term30888.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30838;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term30838, term30888));
    }

};


