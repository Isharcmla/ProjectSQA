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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3752903;
     Object term3752989;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3752903 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3752989 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3753081 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3753173 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3753281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3752989, term3752989.getClass(), "type", 37);
        setIntField(term3753081, term3753081.getClass(), "type", 35);
        setField(term3753173, term3753173.getClass(), "next", term3753173);
        setIntField(term3753173, term3753173.getClass(), "type", 40);
        setField(term3753173, term3753173.getClass(), "str", "charCodeAt");
        setField(term3753081, term3753081.getClass(), "first", term3753173);
        setIntField(term3753281, term3753281.getClass(), "type", 39);
        setField(term3753081, term3753081.getClass(), "next", term3753281);
        setField(term3752989, term3752989.getClass(), "first", term3753081);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3752989;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3752903, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


