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

public class TypeCheck_visit_859524784748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202631;
     Object term202723;

    public TypeCheck_visit_859524784748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202631 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term202723 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term202815 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term202907 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term202723, term202723.getClass(), "type", 45);
        setIntField(term202815, term202815.getClass(), "type", 45);
        setField(term202723, term202723.getClass(), "first", term202815);
        setField(term202723, term202723.getClass(), "last", term202907);
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
        args[1] = term202723;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term202631, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


