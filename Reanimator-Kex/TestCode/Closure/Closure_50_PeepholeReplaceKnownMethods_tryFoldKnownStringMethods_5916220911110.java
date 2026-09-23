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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5483594;
     Object term5483680;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_5916220911110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5483594 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term5483680 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term5483772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5483864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5483956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term5484124 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term5483680, term5483680.getClass(), "type", 37);
        setIntField(term5483772, term5483772.getClass(), "type", 35);
        setIntField(term5483956, term5483956.getClass(), "type", 40);
        setField(term5483956, term5483956.getClass(), "str", "indexOf");
        setField(term5483864, term5483864.getClass(), "next", term5483956);
        setIntField(term5483864, term5483864.getClass(), "type", 40);
        setField(term5483864, term5483864.getClass(), "str", "");
        setField(term5483772, term5483772.getClass(), "first", term5483864);
        setIntField(term5484124, term5484124.getClass(), "type", 41);
        setField(term5484124, term5484124.getClass(), "next", null);
        setField(term5483772, term5483772.getClass(), "next", term5484124);
        setField(term5483680, term5483680.getClass(), "first", term5483772);
        setField(term5483680, term5483680.getClass(), "parent", term5484124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5483680;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term5483594, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


