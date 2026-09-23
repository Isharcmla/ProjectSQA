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

public class TypeCheck_process_1056025265920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242144;
     Object term242392;

    public TypeCheck_process_1056025265920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242144 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term242248 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term242322 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term242144, term242144.getClass(), "scopeCreator", term242248);
        setField(term242322, term242322.getClass(), "parent", null);
        setField(term242144, term242144.getClass(), "topScope", term242322);
        setField(term242144, term242144.getClass(), "compiler", null);
        setBooleanField(term242144, term242144.getClass(), "inExterns", false);
        term242392 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term242462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term242392, term242392.getClass(), "parent", term242462);
        setIntField(term242392, term242392.getClass(), "type", 77);
        setField(term242392, term242392.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term242392;
        try {
            callMethod(klass, "process", argTypes, term242144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


