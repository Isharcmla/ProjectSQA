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

public class ScopedAliases_process_84065531329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16526;
     Object term16596;
     Object term17299;
     Object term17300;

    public ScopedAliases_process_84065531329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16526 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term16526, term16526.getClass(), "compiler", null);
        term16596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16596, term16596.getClass(), "type", 0);
        setIntField(term16666, term16666.getClass(), "type", 0);
        setField(term16666, term16666.getClass(), "parent", null);
        setField(term16596, term16596.getClass(), "parent", term16666);
        setField(term16596, term16596.getClass(), "first", null);
        term17299 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term17299, term17299.getClass(), "compiler", null);
        setField(term17299, term17299.getClass(), "preprocessorSymbolTable", null);
        setField(term17299, term17299.getClass(), "transformationHandler", null);
        term17300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17300, term17300.getClass(), "type", 0);
        setField(term17300, term17300.getClass(), "next", null);
        setField(term17300, term17300.getClass(), "first", null);
        setField(term17300, term17300.getClass(), "last", null);
        setField(term17300, term17300.getClass(), "propListHead", null);
        setIntField(term17300, term17300.getClass(), "sourcePosition", 0);
        setField(term17300, term17300.getClass(), "jsType", null);
        setIntField(term17301, term17301.getClass(), "type", 0);
        setField(term17301, term17301.getClass(), "next", null);
        setField(term17301, term17301.getClass(), "first", null);
        setField(term17301, term17301.getClass(), "last", null);
        setField(term17301, term17301.getClass(), "propListHead", null);
        setIntField(term17301, term17301.getClass(), "sourcePosition", 0);
        setField(term17301, term17301.getClass(), "jsType", null);
        setField(term17301, term17301.getClass(), "parent", null);
        setField(term17300, term17300.getClass(), "parent", term17301);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16596;
        callMethod(klass, "process", argTypes, term16526, args);
        assertTrue(recursiveEquals(term16526, term17299));
        assertTrue(recursiveEquals(term16596, null));
    }

};


