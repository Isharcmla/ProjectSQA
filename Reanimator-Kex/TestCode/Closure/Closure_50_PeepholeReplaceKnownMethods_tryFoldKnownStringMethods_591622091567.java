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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3528074;
     Object term3528160;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3528074 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3528160 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3528252 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3528344 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3528436 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3528506 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3528160, term3528160.getClass(), "type", 37);
        setIntField(term3528252, term3528252.getClass(), "type", 35);
        setIntField(term3528436, term3528436.getClass(), "type", 40);
        setField(term3528436, term3528436.getClass(), "str", null);
        setField(term3528344, term3528344.getClass(), "next", term3528436);
        setIntField(term3528344, term3528344.getClass(), "type", 40);
        setField(term3528252, term3528252.getClass(), "first", term3528344);
        setIntField(term3528506, term3528506.getClass(), "type", 40);
        setField(term3528252, term3528252.getClass(), "next", term3528506);
        setField(term3528160, term3528160.getClass(), "first", term3528252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3528160;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3528074, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


