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

public class ReferenceCollectingCallback_visit_87227317498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18979;
     Object term19071;
     Object term19163;

    public ReferenceCollectingCallback_visit_87227317498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18979 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term19071 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term19071, term19071.getClass(), "type", 108);
        term19163 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term19163, term19163.getClass(), "type", 108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term19071;
        args[2] = term19163;
        try {
            callMethod(klass, "visit", argTypes, term18979, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


