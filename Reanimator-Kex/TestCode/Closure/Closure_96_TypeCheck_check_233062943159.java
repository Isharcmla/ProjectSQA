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

public class TypeCheck_check_233062943159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80017;
     Object term80241;

    public TypeCheck_check_233062943159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80017 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term80097 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term80171 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term80017, term80017.getClass(), "compiler", term80097);
        setField(term80017, term80017.getClass(), "scopeCreator", null);
        setBooleanField(term80017, term80017.getClass(), "inExterns", false);
        setField(term80171, term80171.getClass(), "parent", null);
        setField(term80017, term80017.getClass(), "topScope", term80171);
        term80241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80381 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term80241, term80241.getClass(), "type", 0);
        setField(term80311, term80311.getClass(), "next", term80381);
        setIntField(term80311, term80311.getClass(), "type", 11);
        setField(term80311, term80311.getClass(), "first", null);
        setField(term80241, term80241.getClass(), "first", term80311);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term80241;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term80017, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


