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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3705387;
     Object term3705473;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3705387 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3705473 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3705565 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3705657 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3705765 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3705473, term3705473.getClass(), "type", 37);
        setIntField(term3705565, term3705565.getClass(), "type", 35);
        setField(term3705657, term3705657.getClass(), "next", term3705657);
        setIntField(term3705657, term3705657.getClass(), "type", 40);
        setField(term3705657, term3705657.getClass(), "str", "indexOf");
        setField(term3705565, term3705565.getClass(), "first", term3705657);
        setIntField(term3705765, term3705765.getClass(), "type", 39);
        setField(term3705565, term3705565.getClass(), "next", term3705765);
        setField(term3705473, term3705473.getClass(), "first", term3705565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3705473;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3705387, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


