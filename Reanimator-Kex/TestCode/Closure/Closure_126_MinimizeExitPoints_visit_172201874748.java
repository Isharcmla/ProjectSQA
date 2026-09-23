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

public class MinimizeExitPoints_visit_172201874748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7019;
     Object term7089;
     Object term7126;
     Object term7127;

    public MinimizeExitPoints_visit_172201874748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7019 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term7089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7089, term7089.getClass(), "type", 113);
        setField(term7089, term7089.getClass(), "last", term7089);
        term7126 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term7126, term7126.getClass(), "compiler", null);
        term7127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7127, term7127.getClass(), "type", 113);
        setField(term7127, term7127.getClass(), "next", null);
        setField(term7127, term7127.getClass(), "first", null);
        setField(term7127, term7127.getClass(), "last", term7127);
        setField(term7127, term7127.getClass(), "propListHead", null);
        setIntField(term7127, term7127.getClass(), "sourcePosition", 0);
        setField(term7127, term7127.getClass(), "jsType", null);
        setField(term7127, term7127.getClass(), "parent", null);
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
        args[1] = term7089;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term7019, args);
        assertTrue(recursiveEquals(term7019, term7126));
        assertTrue(recursiveEquals(term7089, null));
    }

};


