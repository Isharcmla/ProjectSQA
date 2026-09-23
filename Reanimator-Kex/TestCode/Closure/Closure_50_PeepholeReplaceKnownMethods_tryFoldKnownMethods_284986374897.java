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

public class PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3747559;
     Object term3747651;

    public PeepholeReplaceKnownMethods_tryFoldKnownMethods_284986374897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3747559 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3747651 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3747743 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3747835 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3747963 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term3747743, term3747743.getClass(), "type", 35);
        setField(term3747835, term3747835.getClass(), "next", term3747835);
        setIntField(term3747835, term3747835.getClass(), "type", 40);
        setField(term3747835, term3747835.getClass(), "str", "indexOf");
        setField(term3747743, term3747743.getClass(), "first", term3747835);
        setIntField(term3747963, term3747963.getClass(), "type", 43);
        setField(term3747743, term3747743.getClass(), "next", term3747963);
        setField(term3747651, term3747651.getClass(), "first", term3747743);
        setIntField(term3747651, term3747651.getClass(), "type", 37);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3747651;
        try {
            callMethod(klass, "tryFoldKnownMethods", argTypes, term3747559, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


