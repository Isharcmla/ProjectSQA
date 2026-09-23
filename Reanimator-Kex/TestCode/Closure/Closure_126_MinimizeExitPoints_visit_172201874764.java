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

public class MinimizeExitPoints_visit_172201874764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10361;
     Object term10431;

    public MinimizeExitPoints_visit_172201874764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10361 = newInstance(Class.forName("com.google.javascript.jscomp.MinimizeExitPoints"));
        term10431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10431, term10431.getClass(), "type", 105);
        setIntField(term10501, term10501.getClass(), "type", 4);
        setField(term10431, term10431.getClass(), "last", term10501);
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
        args[1] = term10431;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term10361, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


