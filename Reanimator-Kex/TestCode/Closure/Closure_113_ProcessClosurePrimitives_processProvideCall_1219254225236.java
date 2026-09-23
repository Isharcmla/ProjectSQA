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

public class ProcessClosurePrimitives_processProvideCall_1219254225236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68287;
     Object term68357;

    public ProcessClosurePrimitives_processProvideCall_1219254225236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68287 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(term68287, term68287.getClass(), "compiler", null);
        term68357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term68427, term68427.getClass(), "next", null);
        setIntField(term68427, term68427.getClass(), "type", 33);
        setField(term68357, term68357.getClass(), "first", term68427);
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
        args[1] = term68357;
        args[2] = null;
        callMethod(klass, "processProvideCall", argTypes, term68287, args);
    }

};


