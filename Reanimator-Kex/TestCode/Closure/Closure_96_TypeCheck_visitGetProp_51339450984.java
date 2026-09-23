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

public class TypeCheck_visitGetProp_51339450984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55133;
     Object term55225;

    public TypeCheck_visitGetProp_51339450984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55133 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term55225 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55317 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term55409 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term55225, term55225.getClass(), "jsType", null);
        setField(term55225, term55225.getClass(), "last", term55317);
        setField(term55225, term55225.getClass(), "first", term55409);
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
        args[1] = term55225;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term55133, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


