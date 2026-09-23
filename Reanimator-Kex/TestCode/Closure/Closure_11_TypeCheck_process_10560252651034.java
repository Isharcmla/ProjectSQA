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

public class TypeCheck_process_10560252651034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288914;
     Object term289162;

    public TypeCheck_process_10560252651034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288914 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term289018 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term289092 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term288914, term288914.getClass(), "scopeCreator", term289018);
        setField(term289092, term289092.getClass(), "parent", null);
        setField(term288914, term288914.getClass(), "topScope", term289092);
        setField(term288914, term288914.getClass(), "compiler", null);
        setBooleanField(term288914, term288914.getClass(), "inExterns", false);
        term289162 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term289162, term289162.getClass(), "parent", term289232);
        setIntField(term289162, term289162.getClass(), "type", 52);
        setField(term289162, term289162.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term289162;
        try {
            callMethod(klass, "process", argTypes, term288914, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


