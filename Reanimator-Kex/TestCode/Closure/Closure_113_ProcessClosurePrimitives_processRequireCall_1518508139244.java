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

public class ProcessClosurePrimitives_processRequireCall_1518508139244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70879;
     Object term71049;
     Object term71141;

    public ProcessClosurePrimitives_processRequireCall_1518508139244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70879 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term70959 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term70879, term70879.getClass(), "compiler", term70959);
        term71049 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term71141 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71233 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term71325 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term71325, term71325.getClass(), "type", 0);
        setField(term71233, term71233.getClass(), "next", term71325);
        setIntField(term71233, term71233.getClass(), "type", 0);
        setField(term71141, term71141.getClass(), "first", term71233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term71049;
        args[1] = term71141;
        args[2] = null;
        callMethod(klass, "processRequireCall", argTypes, term70879, args);
    }

};


