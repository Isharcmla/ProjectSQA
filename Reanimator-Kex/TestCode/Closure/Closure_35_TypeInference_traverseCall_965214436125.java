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

public class TypeInference_traverseCall_965214436125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40636;
     Object term40706;

    public TypeInference_traverseCall_965214436125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40636 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term40706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term40776, term40776.getClass(), "type", 1935707624);
        setField(term40776, term40776.getClass(), "propListHead", null);
        setIntField(term40846, term40846.getClass(), "type", 41);
        setField(term40776, term40776.getClass(), "next", term40846);
        setField(term40706, term40706.getClass(), "first", term40776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term40706;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term40636, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


