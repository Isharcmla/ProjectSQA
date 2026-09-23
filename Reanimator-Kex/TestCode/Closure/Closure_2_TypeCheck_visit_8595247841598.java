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

public class TypeCheck_visit_8595247841598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533649;
     Object term533741;

    public TypeCheck_visit_8595247841598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533649 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term533741 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term533833 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term533925 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term533741, term533741.getClass(), "type", 51);
        setField(term533741, term533741.getClass(), "first", term533833);
        setField(term533741, term533741.getClass(), "last", term533925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term533741;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term533649, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


