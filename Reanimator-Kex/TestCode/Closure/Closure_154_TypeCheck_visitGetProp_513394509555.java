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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visitGetProp_513394509555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term153520;
     Object term153612;

    public TypeCheck_visitGetProp_513394509555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term153520 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term153612 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term153704 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term153790 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term153612, term153612.getClass(), "jsType", null);
        setField(term153612, term153612.getClass(), "last", term153704);
        setField(term153612, term153612.getClass(), "first", term153790);
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
        args[1] = term153612;
        args[2] = null;
        callMethod(klass, "visitGetProp", argTypes, term153520, args);
    }

};


