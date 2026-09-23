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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3731699;
     Object term3731785;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3731699 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3731785 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3731877 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3731969 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3732061 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3732191 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3731785, term3731785.getClass(), "type", 37);
        setIntField(term3731877, term3731877.getClass(), "type", 33);
        setIntField(term3732061, term3732061.getClass(), "type", 40);
        setField(term3732061, term3732061.getClass(), "str", "lastIndexOf");
        setField(term3731969, term3731969.getClass(), "next", term3732061);
        setIntField(term3731969, term3731969.getClass(), "type", 40);
        setField(term3731877, term3731877.getClass(), "first", term3731969);
        setIntField(term3732191, term3732191.getClass(), "type", 44);
        setField(term3731877, term3731877.getClass(), "next", term3732191);
        setField(term3731785, term3731785.getClass(), "first", term3731877);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3731785;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3731699, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


