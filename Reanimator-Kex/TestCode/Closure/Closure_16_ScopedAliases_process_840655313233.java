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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class ScopedAliases_process_840655313233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146283;
     Object term146375;
     Object term146762;
     Object term146763;

    public ScopedAliases_process_840655313233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146283 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term146283, term146283.getClass(), "compiler", null);
        term146375 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term146467 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term146375, term146375.getClass(), "type", 105);
        setIntField(term146467, term146467.getClass(), "type", 0);
        setField(term146467, term146467.getClass(), "parent", null);
        setField(term146375, term146375.getClass(), "parent", term146467);
        term146762 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term146762, term146762.getClass(), "compiler", null);
        setField(term146762, term146762.getClass(), "preprocessorSymbolTable", null);
        setField(term146762, term146762.getClass(), "transformationHandler", null);
        term146763 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term146764 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term146763, term146763.getClass(), "str", null);
        setIntField(term146763, term146763.getClass(), "type", 105);
        setField(term146763, term146763.getClass(), "next", null);
        setField(term146763, term146763.getClass(), "first", null);
        setField(term146763, term146763.getClass(), "last", null);
        setField(term146763, term146763.getClass(), "propListHead", null);
        setIntField(term146763, term146763.getClass(), "sourcePosition", 0);
        setField(term146763, term146763.getClass(), "jsType", null);
        setField(term146764, term146764.getClass(), "str", null);
        setIntField(term146764, term146764.getClass(), "type", 0);
        setField(term146764, term146764.getClass(), "next", null);
        setField(term146764, term146764.getClass(), "first", null);
        setField(term146764, term146764.getClass(), "last", null);
        setField(term146764, term146764.getClass(), "propListHead", null);
        setIntField(term146764, term146764.getClass(), "sourcePosition", 0);
        setField(term146764, term146764.getClass(), "jsType", null);
        setField(term146764, term146764.getClass(), "parent", null);
        setField(term146763, term146763.getClass(), "parent", term146764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term146375;
        callMethod(klass, "process", argTypes, term146283, args);
        assertTrue(recursiveEquals(term146283, term146762));
        assertTrue(recursiveEquals(term146375, null));
    }

};


