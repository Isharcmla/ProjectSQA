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

public class TypeCheck_process_10560252651418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433465;
     Object term433713;

    public TypeCheck_process_10560252651418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term433465 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term433569 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term433643 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term433465, term433465.getClass(), "scopeCreator", term433569);
        setField(term433643, term433643.getClass(), "parent", null);
        setField(term433465, term433465.getClass(), "topScope", term433643);
        setField(term433465, term433465.getClass(), "compiler", null);
        setBooleanField(term433465, term433465.getClass(), "inExterns", false);
        term433713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term433783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term433713, term433713.getClass(), "parent", term433783);
        setIntField(term433713, term433713.getClass(), "type", 93);
        setField(term433713, term433713.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term433713;
        try {
            callMethod(klass, "process", argTypes, term433465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


