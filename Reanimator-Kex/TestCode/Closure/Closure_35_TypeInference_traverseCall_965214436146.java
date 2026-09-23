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

public class TypeInference_traverseCall_965214436146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47479;
     Object term47549;

    public TypeInference_traverseCall_965214436146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47479 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term47549 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47619 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term47619, term47619.getClass(), "type", 1935707624);
        setField(term47619, term47619.getClass(), "propListHead", null);
        setIntField(term47689, term47689.getClass(), "type", 84);
        setField(term47619, term47619.getClass(), "next", term47689);
        setField(term47549, term47549.getClass(), "first", term47619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term47549;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term47479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


