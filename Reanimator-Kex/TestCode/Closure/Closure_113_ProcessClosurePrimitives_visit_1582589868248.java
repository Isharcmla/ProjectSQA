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
import java.util.ArrayDeque;

public class ProcessClosurePrimitives_visit_1582589868248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72535;
     Object term72625;
     Object term72749;

    public ProcessClosurePrimitives_visit_1582589868248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72535 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ArrayDeque term72679 = new ArrayDeque();
        term72625 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term72625, term72625.getClass(), "scopes", term72679);
        term72749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72749, term72749.getClass(), "type", 105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term72625;
        args[1] = term72749;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term72535, args);
    }

};


