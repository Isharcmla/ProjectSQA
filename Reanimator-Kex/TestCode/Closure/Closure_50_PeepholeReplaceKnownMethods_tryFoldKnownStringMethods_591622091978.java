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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3814768;
     Object term3814854;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3814768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3814854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3814946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3815038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3815168 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3814854, term3814854.getClass(), "type", 37);
        setIntField(term3814946, term3814946.getClass(), "type", 35);
        setField(term3815038, term3815038.getClass(), "next", term3815038);
        setIntField(term3815038, term3815038.getClass(), "type", 40);
        setField(term3815038, term3815038.getClass(), "str", "indexOf");
        setField(term3814946, term3814946.getClass(), "first", term3815038);
        setIntField(term3815168, term3815168.getClass(), "type", 43);
        setField(term3814946, term3814946.getClass(), "next", term3815168);
        setField(term3814854, term3814854.getClass(), "first", term3814946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3814854;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3814768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


