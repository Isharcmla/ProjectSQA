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

public class TypeCheck_check_233062943153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77705;
     Object term77953;

    public TypeCheck_check_233062943153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77705 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term77809 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term77883 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term77705, term77705.getClass(), "compiler", null);
        setField(term77705, term77705.getClass(), "scopeCreator", term77809);
        setBooleanField(term77705, term77705.getClass(), "inExterns", false);
        setField(term77883, term77883.getClass(), "parent", null);
        setField(term77705, term77705.getClass(), "topScope", term77883);
        term77953 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78023 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term78093 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term77953, term77953.getClass(), "type", 0);
        setField(term78023, term78023.getClass(), "next", term78093);
        setIntField(term78023, term78023.getClass(), "type", 130);
        setField(term78023, term78023.getClass(), "first", null);
        setField(term77953, term77953.getClass(), "first", term78023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term77953;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term77705, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


