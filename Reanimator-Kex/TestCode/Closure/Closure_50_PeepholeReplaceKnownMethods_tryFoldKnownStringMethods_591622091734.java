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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3633240;
     Object term3633332;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3633240 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3633332 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term3633424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3633516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3633608 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3633332, term3633332.getClass(), "type", 37);
        setIntField(term3633424, term3633424.getClass(), "type", 35);
        setIntField(term3633608, term3633608.getClass(), "type", 40);
        setField(term3633608, term3633608.getClass(), "str", "toLowerCase");
        setField(term3633516, term3633516.getClass(), "next", term3633608);
        setIntField(term3633516, term3633516.getClass(), "type", 40);
        setField(term3633516, term3633516.getClass(), "str", "");
        setField(term3633424, term3633424.getClass(), "first", term3633516);
        setField(term3633424, term3633424.getClass(), "next", null);
        setField(term3633332, term3633332.getClass(), "first", term3633424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3633332;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3633240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


