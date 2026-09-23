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

public class ScopedAliases_process_840655313102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60622;
     Object term60692;
     Object term61421;
     Object term61422;

    public ScopedAliases_process_840655313102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60622 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term60622, term60622.getClass(), "compiler", null);
        term60692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term60692, term60692.getClass(), "type", 105);
        setField(term60692, term60692.getClass(), "parent", null);
        term61421 = newInstance(Class.forName("com.google.javascript.jscomp.ScopedAliases"));
        setField(term61421, term61421.getClass(), "compiler", null);
        setField(term61421, term61421.getClass(), "preprocessorSymbolTable", null);
        setField(term61421, term61421.getClass(), "transformationHandler", null);
        term61422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term61422, term61422.getClass(), "type", 105);
        setField(term61422, term61422.getClass(), "next", null);
        setField(term61422, term61422.getClass(), "first", null);
        setField(term61422, term61422.getClass(), "last", null);
        setField(term61422, term61422.getClass(), "propListHead", null);
        setIntField(term61422, term61422.getClass(), "sourcePosition", 0);
        setField(term61422, term61422.getClass(), "jsType", null);
        setField(term61422, term61422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ScopedAliases");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term60692;
        callMethod(klass, "process", argTypes, term60622, args);
        assertTrue(recursiveEquals(term60622, term61421));
        assertTrue(recursiveEquals(term60692, null));
    }

};


