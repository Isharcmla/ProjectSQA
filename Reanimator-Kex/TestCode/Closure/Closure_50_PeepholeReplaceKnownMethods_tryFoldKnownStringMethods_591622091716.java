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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3620595;
     Object term3620681;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3620595 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3620681 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3620773 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3620865 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3620957 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3621081 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3620681, term3620681.getClass(), "type", 37);
        setIntField(term3620773, term3620773.getClass(), "type", 33);
        setIntField(term3620957, term3620957.getClass(), "type", 40);
        setField(term3620957, term3620957.getClass(), "str", "substring");
        setField(term3620865, term3620865.getClass(), "next", term3620957);
        setIntField(term3620865, term3620865.getClass(), "type", 40);
        setField(term3620773, term3620773.getClass(), "first", term3620865);
        setIntField(term3621081, term3621081.getClass(), "type", 39);
        setField(term3620773, term3620773.getClass(), "next", term3621081);
        setField(term3620681, term3620681.getClass(), "first", term3620773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3620681;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3620595, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


