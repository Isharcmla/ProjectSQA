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

public class TypeCheck_visit_8595247841468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454015;
     Object term454107;

    public TypeCheck_visit_8595247841468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454015 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term454107 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term454199 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term454291 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term454107, term454107.getClass(), "type", 52);
        setField(term454107, term454107.getClass(), "first", term454199);
        setField(term454107, term454107.getClass(), "last", term454291);
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
        args[1] = term454107;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term454015, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


