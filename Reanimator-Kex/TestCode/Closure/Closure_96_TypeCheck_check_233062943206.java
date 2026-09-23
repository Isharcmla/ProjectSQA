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

public class TypeCheck_check_233062943206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95023;
     Object term95167;

    public TypeCheck_check_233062943206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95023 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term95097 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term95023, term95023.getClass(), "compiler", null);
        setField(term95023, term95023.getClass(), "scopeCreator", null);
        setBooleanField(term95023, term95023.getClass(), "inExterns", false);
        setField(term95097, term95097.getClass(), "parent", null);
        setField(term95023, term95023.getClass(), "topScope", term95097);
        term95167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term95167, term95167.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term95167;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term95023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


