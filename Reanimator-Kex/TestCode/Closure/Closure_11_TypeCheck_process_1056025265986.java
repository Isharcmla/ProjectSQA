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

public class TypeCheck_process_1056025265986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265423;
     Object term265745;

    public TypeCheck_process_1056025265986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265423 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term265521 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term265595 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term265675 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term265423, term265423.getClass(), "scopeCreator", term265521);
        setField(term265595, term265595.getClass(), "parent", null);
        setField(term265423, term265423.getClass(), "topScope", term265595);
        setField(term265423, term265423.getClass(), "compiler", term265675);
        setBooleanField(term265423, term265423.getClass(), "inExterns", false);
        term265745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term265815 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term265745, term265745.getClass(), "parent", term265815);
        setIntField(term265745, term265745.getClass(), "type", 110);
        setField(term265745, term265745.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term265745;
        try {
            callMethod(klass, "process", argTypes, term265423, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


