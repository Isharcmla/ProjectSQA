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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3730148;
     Object term3730240;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3730148 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3730240 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3730332 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3730424 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3730516 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3730684 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3730332, term3730332.getClass(), "type", 35);
        setIntField(term3730516, term3730516.getClass(), "type", 40);
        setField(term3730516, term3730516.getClass(), "str", "indexOf");
        setField(term3730424, term3730424.getClass(), "next", term3730516);
        setIntField(term3730424, term3730424.getClass(), "type", 40);
        setField(term3730424, term3730424.getClass(), "str", "");
        setField(term3730332, term3730332.getClass(), "first", term3730424);
        setIntField(term3730684, term3730684.getClass(), "type", 40);
        setField(term3730684, term3730684.getClass(), "next", null);
        setField(term3730684, term3730684.getClass(), "str", "indexOf");
        setField(term3730332, term3730332.getClass(), "next", term3730684);
        setField(term3730240, term3730240.getClass(), "first", term3730332);
        setIntField(term3730240, term3730240.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3730240;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3730148, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


