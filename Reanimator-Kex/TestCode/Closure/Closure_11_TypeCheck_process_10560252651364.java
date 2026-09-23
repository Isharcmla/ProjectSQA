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

public class TypeCheck_process_10560252651364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413769;
     Object term414017;

    public TypeCheck_process_10560252651364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413769 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term413873 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term413947 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term413769, term413769.getClass(), "scopeCreator", term413873);
        setField(term413947, term413947.getClass(), "parent", null);
        setField(term413769, term413769.getClass(), "topScope", term413947);
        setField(term413769, term413769.getClass(), "compiler", null);
        setBooleanField(term413769, term413769.getClass(), "inExterns", false);
        term414017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term414017, term414017.getClass(), "parent", term414087);
        setIntField(term414017, term414017.getClass(), "type", 18);
        setField(term414017, term414017.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term414017;
        try {
            callMethod(klass, "process", argTypes, term413769, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


