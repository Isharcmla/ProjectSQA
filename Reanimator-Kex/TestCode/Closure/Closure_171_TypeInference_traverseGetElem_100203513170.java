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

public class TypeInference_traverseGetElem_100203513170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86471;
     Object term86541;

    public TypeInference_traverseGetElem_100203513170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86471 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term86541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term86681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term86611, term86611.getClass(), "type", -31751777);
        setIntField(term86681, term86681.getClass(), "type", 110);
        setField(term86611, term86611.getClass(), "next", term86681);
        setField(term86541, term86541.getClass(), "first", term86611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term86541;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term86471, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


