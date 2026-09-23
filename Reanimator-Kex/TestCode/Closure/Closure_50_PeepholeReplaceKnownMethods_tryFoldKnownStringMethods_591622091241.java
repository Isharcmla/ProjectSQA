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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1183625;
     Object term1183717;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1183625 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term1183717 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term1183803 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term1183717, term1183717.getClass(), "type", 37);
        setIntField(term1183803, term1183803.getClass(), "type", 35);
        setField(term1183717, term1183717.getClass(), "first", term1183803);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1183717;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term1183625, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


