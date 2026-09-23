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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3524489;
     Object term3524581;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3524489 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3524581 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3524673 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3524765 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3524857 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3524987 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term3524673, term3524673.getClass(), "type", 35);
        setIntField(term3524857, term3524857.getClass(), "type", 40);
        setField(term3524857, term3524857.getClass(), "str", "substr");
        setField(term3524765, term3524765.getClass(), "next", term3524857);
        setIntField(term3524765, term3524765.getClass(), "type", 40);
        setField(term3524765, term3524765.getClass(), "str", "substr");
        setField(term3524673, term3524673.getClass(), "first", term3524765);
        setIntField(term3524987, term3524987.getClass(), "type", 39);
        setDoubleField(term3524987, term3524987.getClass(), "number", 0.0);
        setField(term3524987, term3524987.getClass(), "next", null);
        setField(term3524673, term3524673.getClass(), "next", term3524987);
        setField(term3524581, term3524581.getClass(), "first", term3524673);
        setIntField(term3524581, term3524581.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3524581;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3524489, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


