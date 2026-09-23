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

public class CheckAccessControls_hotSwapScript_739486180432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216221;
     Object term216291;

    public CheckAccessControls_hotSwapScript_739486180432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216221 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        setField(term216221, term216221.getClass(), "compiler", null);
        term216291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term216291, term216291.getClass(), "type", 30);
        setField(term216431, term216431.getClass(), "next", term216501);
        setIntField(term216431, term216431.getClass(), "type", 38);
        setField(term216431, term216431.getClass(), "first", null);
        setField(term216361, term216361.getClass(), "next", term216431);
        setIntField(term216361, term216361.getClass(), "type", 30);
        setField(term216361, term216361.getClass(), "first", null);
        setField(term216605, term216605.getClass(), "docInfo", null);
        setField(term216361, term216361.getClass(), "jsType", term216605);
        setField(term216291, term216291.getClass(), "first", term216361);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term216291;
        callMethod(klass, "hotSwapScript", argTypes, term216221, args);
    }

};


