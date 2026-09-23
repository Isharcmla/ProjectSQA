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

public class ProcessClosurePrimitives_processRequireCall_1518508139148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40666;
     Object term40836;
     Object term40906;

    public ProcessClosurePrimitives_processRequireCall_1518508139148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40666 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term40746 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term40666, term40666.getClass(), "compiler", term40746);
        term40836 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        term40906 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term41046, term41046.getClass(), "type", 40);
        setField(term41046, term41046.getClass(), "next", term40976);
        setField(term40976, term40976.getClass(), "next", term41046);
        setIntField(term40976, term40976.getClass(), "type", 0);
        setField(term40906, term40906.getClass(), "first", term40976);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term40836;
        args[1] = term40906;
        args[2] = null;
        try {
            callMethod(klass, "processRequireCall", argTypes, term40666, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


