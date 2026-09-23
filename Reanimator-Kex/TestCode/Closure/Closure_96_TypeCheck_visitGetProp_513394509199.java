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

public class TypeCheck_visitGetProp_513394509199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93498;
     Object term93590;

    public TypeCheck_visitGetProp_513394509199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93498 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term93590 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93682 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term93774 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term93590, term93590.getClass(), "jsType", null);
        setField(term93590, term93590.getClass(), "last", term93682);
        setField(term93590, term93590.getClass(), "first", term93774);
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
        args[1] = term93590;
        args[2] = null;
        try {
            callMethod(klass, "visitGetProp", argTypes, term93498, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


