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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3554567;
     Object term3554653;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3554567 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3554653 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3554745 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554837 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3554945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3554653, term3554653.getClass(), "type", 37);
        setIntField(term3554745, term3554745.getClass(), "type", 35);
        setField(term3554837, term3554837.getClass(), "next", term3554837);
        setIntField(term3554837, term3554837.getClass(), "type", 40);
        setField(term3554837, term3554837.getClass(), "str", "indexOf");
        setField(term3554745, term3554745.getClass(), "first", term3554837);
        setIntField(term3554945, term3554945.getClass(), "type", 41);
        setField(term3554745, term3554745.getClass(), "next", term3554945);
        setField(term3554653, term3554653.getClass(), "first", term3554745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3554653;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3554567, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


