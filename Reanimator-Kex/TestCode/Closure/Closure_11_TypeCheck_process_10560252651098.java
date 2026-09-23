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

public class TypeCheck_process_10560252651098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315042;
     Object term315284;

    public TypeCheck_process_10560252651098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315042 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term315140 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term315214 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term315042, term315042.getClass(), "scopeCreator", term315140);
        setField(term315214, term315214.getClass(), "parent", null);
        setField(term315042, term315042.getClass(), "topScope", term315214);
        setField(term315042, term315042.getClass(), "compiler", null);
        setBooleanField(term315042, term315042.getClass(), "inExterns", false);
        term315284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term315354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term315284, term315284.getClass(), "parent", term315354);
        setIntField(term315284, term315284.getClass(), "type", 19);
        setField(term315284, term315284.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term315284;
        try {
            callMethod(klass, "process", argTypes, term315042, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


