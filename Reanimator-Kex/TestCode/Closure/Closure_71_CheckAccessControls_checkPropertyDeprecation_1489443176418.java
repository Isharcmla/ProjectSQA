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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckAccessControls_checkPropertyDeprecation_1489443176418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208210;
     Object term208296;
     Object term208668;

    public CheckAccessControls_checkPropertyDeprecation_1489443176418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208210 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term208296 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208382 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term208490 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term208582 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term208382, term208382.getClass(), "jsType", term208490);
        setField(term208296, term208296.getClass(), "first", term208382);
        setField(term208296, term208296.getClass(), "last", term208582);
        term208668 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term208668, term208668.getClass(), "type", -31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term208296;
        args[2] = term208668;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term208210, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


