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

public class TypeCheck_process_10560252651330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397588;
     Object term397838;

    public TypeCheck_process_10560252651330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397588 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term397694 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term397768 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term397588, term397588.getClass(), "scopeCreator", term397694);
        setField(term397768, term397768.getClass(), "parent", null);
        setField(term397588, term397588.getClass(), "topScope", term397768);
        setField(term397588, term397588.getClass(), "compiler", null);
        setBooleanField(term397588, term397588.getClass(), "inExterns", false);
        term397838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term397908 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term397838, term397838.getClass(), "parent", term397908);
        setIntField(term397838, term397838.getClass(), "type", 141);
        setField(term397838, term397838.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term397838;
        try {
            callMethod(klass, "process", argTypes, term397588, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


