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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3534575;
     Object term3534661;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3534575 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3534661 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3534753 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3534937 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3535023 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3534661, term3534661.getClass(), "type", 37);
        setIntField(term3534753, term3534753.getClass(), "type", 35);
        setIntField(term3534937, term3534937.getClass(), "type", 40);
        setField(term3534937, term3534937.getClass(), "str", null);
        setField(term3534845, term3534845.getClass(), "next", term3534937);
        setIntField(term3534845, term3534845.getClass(), "type", 40);
        setField(term3534753, term3534753.getClass(), "first", term3534845);
        setIntField(term3535023, term3535023.getClass(), "type", 43);
        setField(term3534753, term3534753.getClass(), "next", term3535023);
        setField(term3534661, term3534661.getClass(), "first", term3534753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3534661;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3534575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


