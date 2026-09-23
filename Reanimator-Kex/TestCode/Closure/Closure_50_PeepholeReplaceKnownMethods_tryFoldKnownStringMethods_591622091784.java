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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3666003;
     Object term3666089;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3666003 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3666089 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3666181 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666273 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666365 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3666489 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term3666089, term3666089.getClass(), "type", 37);
        setIntField(term3666181, term3666181.getClass(), "type", 33);
        setIntField(term3666365, term3666365.getClass(), "type", 40);
        setField(term3666365, term3666365.getClass(), "str", "lastIndexOf");
        setField(term3666273, term3666273.getClass(), "next", term3666365);
        setIntField(term3666273, term3666273.getClass(), "type", 40);
        setField(term3666181, term3666181.getClass(), "first", term3666273);
        setIntField(term3666489, term3666489.getClass(), "type", 39);
        setField(term3666181, term3666181.getClass(), "next", term3666489);
        setField(term3666089, term3666089.getClass(), "first", term3666181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3666089;
        try {
            callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3666003, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


