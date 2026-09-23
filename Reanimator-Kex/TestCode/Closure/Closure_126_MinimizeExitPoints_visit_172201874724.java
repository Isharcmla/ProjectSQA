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

public class MinimizeExitPoints_visit_172201874724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3152;
     Object term3222;
     Object term3228;
     Object term3229;

    public MinimizeExitPoints_visit_172201874724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3152 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term3222 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        term3228 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term3228, term3228.getClass(), "compiler", null);
        term3229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3229, term3229.getClass(), "type", 0);
        setField(term3229, term3229.getClass(), "next", null);
        setField(term3229, term3229.getClass(), "first", null);
        setField(term3229, term3229.getClass(), "last", null);
        setField(term3229, term3229.getClass(), "propListHead", null);
        setIntField(term3229, term3229.getClass(), "sourcePosition", 0);
        setField(term3229, term3229.getClass(), "jsType", null);
        setField(term3229, term3229.getClass(), "parent", null);
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
        args[1] = term3222;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term3152, args);
        assertTrue(recursiveEquals(term3152, term3228));
        assertTrue(recursiveEquals(term3222, null));
    }

};


