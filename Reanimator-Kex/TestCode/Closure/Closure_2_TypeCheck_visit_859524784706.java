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

public class TypeCheck_visit_859524784706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190915;
     Object term191007;

    public TypeCheck_visit_859524784706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190915 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term191007 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191099 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term191191 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term191007, term191007.getClass(), "type", 52);
        setField(term191007, term191007.getClass(), "first", term191099);
        setField(term191007, term191007.getClass(), "last", term191191);
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
        args[1] = term191007;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term190915, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


