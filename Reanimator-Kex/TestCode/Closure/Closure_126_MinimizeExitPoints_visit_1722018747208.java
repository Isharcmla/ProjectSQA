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
import java.lang.Object;

public class MinimizeExitPoints_visit_1722018747208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67066;
     Object term67136;
     Object term67629;
     Object term67630;

    public MinimizeExitPoints_visit_1722018747208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67066 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term67136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67136, term67136.getClass(), "type", 113);
        setIntField(term67206, term67206.getClass(), "type", 117);
        setField(term67206, term67206.getClass(), "first", term67276);
        setField(term67136, term67136.getClass(), "last", term67206);
        term67629 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        setField(term67629, term67629.getClass(), "compiler", null);
        term67630 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67631 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67632 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term67630, term67630.getClass(), "type", 113);
        setField(term67630, term67630.getClass(), "next", null);
        setField(term67630, term67630.getClass(), "first", null);
        setIntField(term67631, term67631.getClass(), "type", 117);
        setField(term67631, term67631.getClass(), "next", null);
        setIntField(term67632, term67632.getClass(), "type", 0);
        setField(term67632, term67632.getClass(), "next", null);
        setField(term67632, term67632.getClass(), "first", null);
        setField(term67632, term67632.getClass(), "last", null);
        setField(term67632, term67632.getClass(), "propListHead", null);
        setIntField(term67632, term67632.getClass(), "sourcePosition", 0);
        setField(term67632, term67632.getClass(), "jsType", null);
        setField(term67632, term67632.getClass(), "parent", null);
        setField(term67631, term67631.getClass(), "first", term67632);
        setField(term67631, term67631.getClass(), "last", null);
        setField(term67631, term67631.getClass(), "propListHead", null);
        setIntField(term67631, term67631.getClass(), "sourcePosition", 0);
        setField(term67631, term67631.getClass(), "jsType", null);
        setField(term67631, term67631.getClass(), "parent", null);
        setField(term67630, term67630.getClass(), "last", term67631);
        setField(term67630, term67630.getClass(), "propListHead", null);
        setIntField(term67630, term67630.getClass(), "sourcePosition", 0);
        setField(term67630, term67630.getClass(), "jsType", null);
        setField(term67630, term67630.getClass(), "parent", null);
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
        args[1] = term67136;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term67066, args);
        assertTrue(recursiveEquals(term67066, term67629));
        assertTrue(recursiveEquals(term67136, null));
    }

};


