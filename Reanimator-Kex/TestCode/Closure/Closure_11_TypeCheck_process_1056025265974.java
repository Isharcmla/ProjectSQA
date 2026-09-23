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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_process_1056025265974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262414;
     Object term262662;

    public TypeCheck_process_1056025265974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term262414 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term262518 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term262592 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term262414, term262414.getClass(), "scopeCreator", term262518);
        setField(term262592, term262592.getClass(), "parent", null);
        setField(term262414, term262414.getClass(), "topScope", term262592);
        setField(term262414, term262414.getClass(), "compiler", null);
        setBooleanField(term262414, term262414.getClass(), "inExterns", false);
        term262662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term262732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term262662, term262662.getClass(), "parent", term262732);
        setIntField(term262662, term262662.getClass(), "type", 50);
        setField(term262662, term262662.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term262662;
        try {
            callMethod(klass, "process", argTypes, term262414, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


