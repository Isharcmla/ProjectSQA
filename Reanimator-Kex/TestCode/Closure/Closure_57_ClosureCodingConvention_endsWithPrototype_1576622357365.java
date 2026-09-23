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

public class ClosureCodingConvention_endsWithPrototype_1576622357365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136847;
     Object term136939;

    public ClosureCodingConvention_endsWithPrototype_1576622357365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136847 = newInstance(Class.forName("com.google.javascript.jscomp.ClosureCodingConvention"));
        term136939 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term137031 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term136939, term136939.getClass(), "type", 33);
        setField(term136939, term136939.getClass(), "last", term137031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ClosureCodingConvention");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term136939;
        try {
            callMethod(klass, "endsWithPrototype", argTypes, term136847, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


