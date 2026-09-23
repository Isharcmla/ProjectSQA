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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4468231;
     Object term4468317;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4468231 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4468317 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4468409 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4468501 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4468593 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4468717 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term4468317, term4468317.getClass(), "type", 37);
        setIntField(term4468409, term4468409.getClass(), "type", 33);
        setIntField(term4468593, term4468593.getClass(), "type", 40);
        setField(term4468593, term4468593.getClass(), "str", "charAt");
        setField(term4468501, term4468501.getClass(), "next", term4468593);
        setIntField(term4468501, term4468501.getClass(), "type", 40);
        setField(term4468409, term4468409.getClass(), "first", term4468501);
        setIntField(term4468717, term4468717.getClass(), "type", 39);
        setField(term4468409, term4468409.getClass(), "next", term4468717);
        setField(term4468317, term4468317.getClass(), "first", term4468409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4468317;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4468231, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


