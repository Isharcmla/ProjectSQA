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

public class NodeUtil_canBeSideEffected_1382575805672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65258;

    public NodeUtil_canBeSideEffected_1382575805672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65328 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term65258, term65258.getClass(), "type", -506958186);
        setIntField(term65328, term65328.getClass(), "type", 32);
        setField(term65328, term65328.getClass(), "first", term65328);
        setField(term65258, term65258.getClass(), "first", term65328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term65258;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
    }

};


