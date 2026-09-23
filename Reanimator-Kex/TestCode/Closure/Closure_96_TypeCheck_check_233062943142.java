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

public class TypeCheck_check_233062943142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72380;
     Object term72604;

    public TypeCheck_check_233062943142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72380 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term72460 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term72534 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term72380, term72380.getClass(), "compiler", term72460);
        setField(term72380, term72380.getClass(), "scopeCreator", null);
        setBooleanField(term72380, term72380.getClass(), "inExterns", false);
        setField(term72534, term72534.getClass(), "parent", null);
        setField(term72380, term72380.getClass(), "topScope", term72534);
        term72604 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term72744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term72604, term72604.getClass(), "type", 0);
        setField(term72674, term72674.getClass(), "next", term72744);
        setIntField(term72674, term72674.getClass(), "type", 69);
        setField(term72674, term72674.getClass(), "first", null);
        setField(term72604, term72604.getClass(), "first", term72674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term72604;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term72380, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


