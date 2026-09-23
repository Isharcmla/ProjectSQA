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

public class TypeCheck_process_10560252651314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391267;
     Object term391509;

    public TypeCheck_process_10560252651314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391267 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term391365 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term391439 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term391267, term391267.getClass(), "scopeCreator", term391365);
        setField(term391439, term391439.getClass(), "parent", null);
        setField(term391267, term391267.getClass(), "topScope", term391439);
        setField(term391267, term391267.getClass(), "compiler", null);
        setBooleanField(term391267, term391267.getClass(), "inExterns", false);
        term391509 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term391579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term391509, term391509.getClass(), "parent", term391579);
        setIntField(term391509, term391509.getClass(), "type", 120);
        setField(term391509, term391509.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term391509;
        try {
            callMethod(klass, "process", argTypes, term391267, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


