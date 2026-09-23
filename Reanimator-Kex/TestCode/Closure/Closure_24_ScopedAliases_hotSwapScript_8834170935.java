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

public class ScopedAliases_hotSwapScript_8834170935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19472;
     Object term19542;
     Object term19769;
     Object term19770;

    public ScopedAliases_hotSwapScript_8834170935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19472 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term19472, term19472.getClass(), "compiler", null);
        term19542 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19542, term19542.getClass(), "type", 105);
        setField(term19542, term19542.getClass(), "parent", null);
        term19769 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term19769, term19769.getClass(), "compiler", null);
        setField(term19769, term19769.getClass(), "preprocessorSymbolTable", null);
        setField(term19769, term19769.getClass(), "transformationHandler", null);
        term19770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19770, term19770.getClass(), "type", 105);
        setField(term19770, term19770.getClass(), "next", null);
        setField(term19770, term19770.getClass(), "first", null);
        setField(term19770, term19770.getClass(), "last", null);
        setField(term19770, term19770.getClass(), "propListHead", null);
        setIntField(term19770, term19770.getClass(), "sourcePosition", 0);
        setField(term19770, term19770.getClass(), "jsType", null);
        setField(term19770, term19770.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term19542;
        args[1] = null;
        callMethod(klass, "hotSwapScript", argTypes, term19472, args);
        assertTrue(recursiveEquals(term19472, term19769));
        assertTrue(recursiveEquals(term19542, term19770));
    }

};


