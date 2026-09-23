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

public class TypeInference_traverseCall_82554492403 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1525212;
     Object term1525282;

    public TypeInference_traverseCall_82554492403() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1525212 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1525282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1525352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1525422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1525352, term1525352.getClass(), "type", -945116798);
        setIntField(term1525422, term1525422.getClass(), "type", 42);
        setField(term1525352, term1525352.getClass(), "next", term1525422);
        setField(term1525282, term1525282.getClass(), "first", term1525352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1525282;
        args[1] = null;
        try {
            callMethod(klass, "traverseCall", argTypes, term1525212, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


