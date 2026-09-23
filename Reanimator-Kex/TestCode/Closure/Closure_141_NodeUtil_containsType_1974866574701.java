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
import java.lang.StackOverflowError;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_containsType_1974866574701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58817;

    public NodeUtil_containsType_1974866574701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58817, term58817.getClass(), "type", 2);
        setIntField(term58887, term58887.getClass(), "type", 0);
        setIntField(term58957, term58957.getClass(), "type", 0);
        setField(term58957, term58957.getClass(), "first", term58887);
        setField(term58887, term58887.getClass(), "first", term58957);
        setField(term58817, term58817.getClass(), "first", term58887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term58817;
        args[1] = 2097152;
        try {
            callMethod(klass, "containsType", argTypes, null, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


