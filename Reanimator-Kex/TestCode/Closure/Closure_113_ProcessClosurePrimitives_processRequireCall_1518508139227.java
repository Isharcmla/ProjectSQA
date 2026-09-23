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

public class ProcessClosurePrimitives_processRequireCall_1518508139227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65579;
     Object term65671;

    public ProcessClosurePrimitives_processRequireCall_1518508139227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65579 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term65671 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65763 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term65855 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term65855, term65855.getClass(), "type", 40);
        setField(term65855, term65855.getClass(), "next", null);
        setField(term65763, term65763.getClass(), "next", term65855);
        setField(term65671, term65671.getClass(), "first", term65763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term65671;
        args[2] = null;
        callMethod(klass, "processRequireCall", argTypes, term65579, args);
    }

};


