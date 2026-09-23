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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3742116;
     Object term3742202;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3742116 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3742202 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3742294 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3742386 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3742494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3742202, term3742202.getClass(), "type", 37);
        setIntField(term3742294, term3742294.getClass(), "type", 35);
        setField(term3742386, term3742386.getClass(), "next", term3742386);
        setIntField(term3742386, term3742386.getClass(), "type", 40);
        setField(term3742386, term3742386.getClass(), "str", "indexOf");
        setField(term3742294, term3742294.getClass(), "first", term3742386);
        setIntField(term3742494, term3742494.getClass(), "type", 44);
        setField(term3742294, term3742294.getClass(), "next", term3742494);
        setField(term3742202, term3742202.getClass(), "first", term3742294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3742202;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3742116, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


