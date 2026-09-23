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

public class TypeCheck_process_10560252651183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342668;
     Object term342910;

    public TypeCheck_process_10560252651183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342668 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term342766 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term342840 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term342668, term342668.getClass(), "scopeCreator", term342766);
        setField(term342840, term342840.getClass(), "parent", null);
        setField(term342668, term342668.getClass(), "topScope", term342840);
        setField(term342668, term342668.getClass(), "compiler", null);
        setBooleanField(term342668, term342668.getClass(), "inExterns", false);
        term342910 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term342980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term342910, term342910.getClass(), "parent", term342980);
        setIntField(term342910, term342910.getClass(), "type", 20);
        setField(term342910, term342910.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term342910;
        try {
            callMethod(klass, "process", argTypes, term342668, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


