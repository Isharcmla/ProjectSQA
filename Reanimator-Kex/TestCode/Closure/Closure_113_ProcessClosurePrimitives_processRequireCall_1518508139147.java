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

public class ProcessClosurePrimitives_processRequireCall_1518508139147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39717;
     Object term39787;

    public ProcessClosurePrimitives_processRequireCall_1518508139147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39717 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        term39787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39857 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39927, term39927.getClass(), "type", 40);
        setField(term39927, term39927.getClass(), "next", null);
        setField(term39857, term39857.getClass(), "next", term39927);
        setField(term39787, term39787.getClass(), "first", term39857);
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
        args[1] = term39787;
        args[2] = null;
        try {
            callMethod(klass, "processRequireCall", argTypes, term39717, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


