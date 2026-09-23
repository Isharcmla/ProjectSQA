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

public class TypeCheck_process_10560252651630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521898;
     Object term522148;

    public TypeCheck_process_10560252651630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521898 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term522004 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term522078 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term521898, term521898.getClass(), "scopeCreator", term522004);
        setField(term522078, term522078.getClass(), "parent", null);
        setField(term521898, term521898.getClass(), "topScope", term522078);
        setField(term521898, term521898.getClass(), "compiler", null);
        setBooleanField(term521898, term521898.getClass(), "inExterns", false);
        term522148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term522218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term522148, term522148.getClass(), "parent", term522218);
        setIntField(term522148, term522148.getClass(), "type", 111);
        setField(term522148, term522148.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term522148;
        try {
            callMethod(klass, "process", argTypes, term521898, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


