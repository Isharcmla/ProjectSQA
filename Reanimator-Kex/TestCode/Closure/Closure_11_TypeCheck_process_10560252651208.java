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

public class TypeCheck_process_10560252651208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term349796;
     Object term350038;

    public TypeCheck_process_10560252651208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term349796 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term349894 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term349968 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term349796, term349796.getClass(), "scopeCreator", term349894);
        setField(term349968, term349968.getClass(), "parent", null);
        setField(term349796, term349796.getClass(), "topScope", term349968);
        setField(term349796, term349796.getClass(), "compiler", null);
        setBooleanField(term349796, term349796.getClass(), "inExterns", false);
        term350038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term350108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term350038, term350038.getClass(), "parent", term350108);
        setIntField(term350038, term350038.getClass(), "type", 153);
        setField(term350038, term350038.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term350038;
        try {
            callMethod(klass, "process", argTypes, term349796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


