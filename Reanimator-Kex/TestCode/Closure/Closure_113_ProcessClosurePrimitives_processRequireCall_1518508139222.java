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

public class ProcessClosurePrimitives_processRequireCall_1518508139222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63875;
     Object term63967;

    public ProcessClosurePrimitives_processRequireCall_1518508139222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63875 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term63967 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64059 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term64151 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term64059, term64059.getClass(), "next", term64151);
        setField(term63967, term63967.getClass(), "first", term64059);
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
        args[1] = term63967;
        args[2] = null;
        callMethod(klass, "processRequireCall", argTypes, term63875, args);
    }

};


