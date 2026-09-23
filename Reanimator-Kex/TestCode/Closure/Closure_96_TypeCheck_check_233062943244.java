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

public class TypeCheck_check_233062943244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108689;
     Object term108913;

    public TypeCheck_check_233062943244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108689 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term108769 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term108843 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term108689, term108689.getClass(), "compiler", term108769);
        setField(term108689, term108689.getClass(), "scopeCreator", null);
        setBooleanField(term108689, term108689.getClass(), "inExterns", false);
        setField(term108843, term108843.getClass(), "parent", null);
        setField(term108689, term108689.getClass(), "topScope", term108843);
        term108913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109053 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108913, term108913.getClass(), "type", 0);
        setField(term108983, term108983.getClass(), "next", term109053);
        setIntField(term108983, term108983.getClass(), "type", 76);
        setField(term108983, term108983.getClass(), "first", null);
        setField(term108913, term108913.getClass(), "first", term108983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term108913;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term108689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


