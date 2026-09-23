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

public class TypeCheck_check_233062943267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117846;
     Object term118070;

    public TypeCheck_check_233062943267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117846 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term117926 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term118000 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term117846, term117846.getClass(), "compiler", term117926);
        setField(term117846, term117846.getClass(), "scopeCreator", null);
        setBooleanField(term117846, term117846.getClass(), "inExterns", false);
        setField(term118000, term118000.getClass(), "parent", null);
        setField(term117846, term117846.getClass(), "topScope", term118000);
        term118070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term118070, term118070.getClass(), "type", 0);
        setField(term118140, term118140.getClass(), "next", term118210);
        setIntField(term118140, term118140.getClass(), "type", 140);
        setField(term118140, term118140.getClass(), "first", null);
        setField(term118070, term118070.getClass(), "first", term118140);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term118070;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term117846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


