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

public class ProcessClosurePrimitives_processSetCssNameMapping_188607169250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25462;
     Object term25632;
     Object term25740;

    public ProcessClosurePrimitives_processSetCssNameMapping_188607169250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25462 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object term25542 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25462, term25462.getClass(), "compiler", term25542);
        term25632 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term25632, term25632.getClass(), "sourceName", "");
        term25740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term25810, term25810.getClass(), "next", null);
        setIntField(term25810, term25810.getClass(), "type", 0);
        setIntField(term25810, term25810.getClass(), "sourcePosition", 0);
        setField(term25740, term25740.getClass(), "first", term25810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term25632;
        args[1] = term25740;
        args[2] = null;
        try {
            callMethod(klass, "processSetCssNameMapping", argTypes, term25462, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


