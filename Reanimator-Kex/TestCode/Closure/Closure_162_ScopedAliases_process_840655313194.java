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

public class ScopedAliases_process_840655313194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109305;
     Object term109397;
     Object term110332;
     Object term110333;

    public ScopedAliases_process_840655313194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109305 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term109305, term109305.getClass(), "compiler", null);
        term109397 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term109489 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term109397, term109397.getClass(), "type", 0);
        setIntField(term109489, term109489.getClass(), "type", 0);
        setField(term109489, term109489.getClass(), "parent", null);
        setField(term109397, term109397.getClass(), "parent", term109489);
        term110332 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term110332, term110332.getClass(), "compiler", null);
        setField(term110332, term110332.getClass(), "preprocessorSymbolTable", null);
        setField(term110332, term110332.getClass(), "transformationHandler", null);
        term110333 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term110334 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term110333, term110333.getClass(), "str", null);
        setIntField(term110333, term110333.getClass(), "type", 0);
        setField(term110333, term110333.getClass(), "next", null);
        setField(term110333, term110333.getClass(), "first", null);
        setField(term110333, term110333.getClass(), "last", null);
        setField(term110333, term110333.getClass(), "propListHead", null);
        setIntField(term110333, term110333.getClass(), "sourcePosition", 0);
        setField(term110333, term110333.getClass(), "jsType", null);
        setField(term110334, term110334.getClass(), "str", null);
        setIntField(term110334, term110334.getClass(), "type", 0);
        setField(term110334, term110334.getClass(), "next", null);
        setField(term110334, term110334.getClass(), "first", null);
        setField(term110334, term110334.getClass(), "last", null);
        setField(term110334, term110334.getClass(), "propListHead", null);
        setIntField(term110334, term110334.getClass(), "sourcePosition", 0);
        setField(term110334, term110334.getClass(), "jsType", null);
        setField(term110334, term110334.getClass(), "parent", null);
        setField(term110333, term110333.getClass(), "parent", term110334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term109397;
        callMethod(klass, "process", argTypes, term109305, args);
        assertTrue(recursiveEquals(term109305, term110332));
        assertTrue(recursiveEquals(term109397, null));
    }

};


