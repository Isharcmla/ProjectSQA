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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4459305;
     Object term4459391;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4459305 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term4459391 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term4459483 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4459575 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term4459705 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term4459391, term4459391.getClass(), "type", 37);
        setIntField(term4459483, term4459483.getClass(), "type", 35);
        setField(term4459575, term4459575.getClass(), "next", term4459575);
        setIntField(term4459575, term4459575.getClass(), "type", 40);
        setField(term4459575, term4459575.getClass(), "str", "indexOf");
        setField(term4459483, term4459483.getClass(), "first", term4459575);
        setIntField(term4459705, term4459705.getClass(), "type", 44);
        setField(term4459483, term4459483.getClass(), "next", term4459705);
        setField(term4459391, term4459391.getClass(), "first", term4459483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4459391;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term4459305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


