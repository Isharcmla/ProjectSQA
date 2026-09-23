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

public class MinimizeExitPoints_visit_1722018747220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70903;
     Object term70973;

    public MinimizeExitPoints_visit_1722018747220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70903 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term70973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71043 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term70973, term70973.getClass(), "type", 114);
        setIntField(term71043, term71043.getClass(), "type", 117);
        setField(term71043, term71043.getClass(), "first", term71113);
        setField(term70973, term70973.getClass(), "first", term71043);
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
        args[1] = term70973;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term70903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


