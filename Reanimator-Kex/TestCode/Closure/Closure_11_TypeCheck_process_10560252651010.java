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

public class TypeCheck_process_10560252651010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278127;
     Object term278377;

    public TypeCheck_process_10560252651010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278127 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term278233 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term278307 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term278127, term278127.getClass(), "scopeCreator", term278233);
        setField(term278307, term278307.getClass(), "parent", null);
        setField(term278127, term278127.getClass(), "topScope", term278307);
        setField(term278127, term278127.getClass(), "compiler", null);
        setBooleanField(term278127, term278127.getClass(), "inExterns", false);
        term278377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term278447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term278377, term278377.getClass(), "parent", term278447);
        setIntField(term278377, term278377.getClass(), "type", 75);
        setField(term278377, term278377.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term278377;
        try {
            callMethod(klass, "process", argTypes, term278127, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


