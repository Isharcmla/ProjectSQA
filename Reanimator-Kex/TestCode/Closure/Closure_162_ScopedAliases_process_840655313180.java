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

public class ScopedAliases_process_840655313180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102370;
     Object term102440;
     Object term102754;
     Object term102755;

    public ScopedAliases_process_840655313180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102370 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term102370, term102370.getClass(), "compiler", null);
        term102440 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102510 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102440, term102440.getClass(), "type", 105);
        setIntField(term102510, term102510.getClass(), "type", 0);
        setField(term102510, term102510.getClass(), "parent", null);
        setField(term102440, term102440.getClass(), "parent", term102510);
        term102754 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term102754, term102754.getClass(), "compiler", null);
        setField(term102754, term102754.getClass(), "preprocessorSymbolTable", null);
        setField(term102754, term102754.getClass(), "transformationHandler", null);
        term102755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term102756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term102755, term102755.getClass(), "type", 105);
        setField(term102755, term102755.getClass(), "next", null);
        setField(term102755, term102755.getClass(), "first", null);
        setField(term102755, term102755.getClass(), "last", null);
        setField(term102755, term102755.getClass(), "propListHead", null);
        setIntField(term102755, term102755.getClass(), "sourcePosition", 0);
        setField(term102755, term102755.getClass(), "jsType", null);
        setIntField(term102756, term102756.getClass(), "type", 0);
        setField(term102756, term102756.getClass(), "next", null);
        setField(term102756, term102756.getClass(), "first", null);
        setField(term102756, term102756.getClass(), "last", null);
        setField(term102756, term102756.getClass(), "propListHead", null);
        setIntField(term102756, term102756.getClass(), "sourcePosition", 0);
        setField(term102756, term102756.getClass(), "jsType", null);
        setField(term102756, term102756.getClass(), "parent", null);
        setField(term102755, term102755.getClass(), "parent", term102756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term102440;
        callMethod(klass, "process", argTypes, term102370, args);
        assertTrue(recursiveEquals(term102370, term102754));
        assertTrue(recursiveEquals(term102440, null));
    }

};


