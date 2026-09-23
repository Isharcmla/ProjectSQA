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

public class TypeCheck_process_10560252651646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530002;
     Object term530250;

    public TypeCheck_process_10560252651646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term530002 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term530106 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term530180 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term530002, term530002.getClass(), "scopeCreator", term530106);
        setField(term530180, term530180.getClass(), "parent", null);
        setField(term530002, term530002.getClass(), "topScope", term530180);
        setField(term530002, term530002.getClass(), "compiler", null);
        setBooleanField(term530002, term530002.getClass(), "inExterns", false);
        term530250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530320 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term530250, term530250.getClass(), "parent", term530320);
        setIntField(term530250, term530250.getClass(), "type", 134);
        setField(term530250, term530250.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term530250;
        try {
            callMethod(klass, "process", argTypes, term530002, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


