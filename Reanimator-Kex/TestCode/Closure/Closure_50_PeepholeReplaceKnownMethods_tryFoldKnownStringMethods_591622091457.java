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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3216372;
     Object term3216458;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3216372 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3216458 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3216550 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216642 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216734 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3216804 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3216458, term3216458.getClass(), "type", 37);
        setIntField(term3216550, term3216550.getClass(), "type", 35);
        setIntField(term3216734, term3216734.getClass(), "type", 40);
        setField(term3216734, term3216734.getClass(), "str", null);
        setField(term3216642, term3216642.getClass(), "next", term3216734);
        setIntField(term3216642, term3216642.getClass(), "type", 40);
        setField(term3216550, term3216550.getClass(), "first", term3216642);
        setIntField(term3216804, term3216804.getClass(), "type", 43);
        setField(term3216550, term3216550.getClass(), "next", term3216804);
        setField(term3216458, term3216458.getClass(), "first", term3216550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3216458;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3216372, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


