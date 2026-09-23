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

public class TypeCheck_check_233062943188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90099;
     Object term90323;

    public TypeCheck_check_233062943188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90099 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term90179 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term90253 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term90099, term90099.getClass(), "compiler", term90179);
        setField(term90099, term90099.getClass(), "scopeCreator", null);
        setBooleanField(term90099, term90099.getClass(), "inExterns", false);
        setField(term90253, term90253.getClass(), "parent", null);
        setField(term90099, term90099.getClass(), "topScope", term90253);
        term90323 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90393 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term90463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term90323, term90323.getClass(), "type", 0);
        setField(term90393, term90393.getClass(), "next", term90463);
        setIntField(term90393, term90393.getClass(), "type", 129);
        setField(term90393, term90393.getClass(), "first", null);
        setField(term90323, term90323.getClass(), "first", term90393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term90323;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term90099, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


