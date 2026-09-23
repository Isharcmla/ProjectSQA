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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2637768;
     Object term2637854;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2637768 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term2637854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term2637946 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2638038 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term2638130 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term2637854, term2637854.getClass(), "type", 37);
        setIntField(term2637946, term2637946.getClass(), "type", 35);
        setIntField(term2638130, term2638130.getClass(), "type", 40);
        setField(term2638038, term2638038.getClass(), "next", term2638130);
        setIntField(term2638038, term2638038.getClass(), "type", 40);
        setField(term2637946, term2637946.getClass(), "first", term2638038);
        setField(term2637854, term2637854.getClass(), "first", term2637946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2637854;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term2637768, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


