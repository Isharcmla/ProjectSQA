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

public class TypeCheck_process_10560252651278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378552;
     Object term378802;

    public TypeCheck_process_10560252651278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378552 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term378658 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term378732 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term378552, term378552.getClass(), "scopeCreator", term378658);
        setField(term378732, term378732.getClass(), "parent", null);
        setField(term378552, term378552.getClass(), "topScope", term378732);
        setField(term378552, term378552.getClass(), "compiler", null);
        setBooleanField(term378552, term378552.getClass(), "inExterns", false);
        term378802 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term378872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term378802, term378802.getClass(), "parent", term378872);
        setIntField(term378802, term378802.getClass(), "type", 137);
        setField(term378802, term378802.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term378802;
        try {
            callMethod(klass, "process", argTypes, term378552, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


