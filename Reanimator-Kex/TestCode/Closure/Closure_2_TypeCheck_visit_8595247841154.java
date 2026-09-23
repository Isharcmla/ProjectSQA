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

public class TypeCheck_visit_8595247841154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331036;
     Object term331128;

    public TypeCheck_visit_8595247841154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term331036 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term331128 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term331220 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term331128, term331128.getClass(), "type", 45);
        setField(term331128, term331128.getClass(), "first", term331220);
        setField(term331128, term331128.getClass(), "last", null);
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
        args[1] = term331128;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term331036, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


