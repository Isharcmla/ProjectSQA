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

public class TypeCheck_check_233062943243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107940;
     Object term108270;

    public TypeCheck_check_233062943243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107940 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term108020 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term108126 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term108200 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term107940, term107940.getClass(), "compiler", term108020);
        setField(term107940, term107940.getClass(), "scopeCreator", term108126);
        setBooleanField(term107940, term107940.getClass(), "inExterns", false);
        setField(term108200, term108200.getClass(), "parent", null);
        setField(term107940, term107940.getClass(), "topScope", term108200);
        term108270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108340 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term108480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term108270, term108270.getClass(), "type", 0);
        setField(term108410, term108410.getClass(), "next", term108480);
        setIntField(term108410, term108410.getClass(), "type", 17);
        setField(term108410, term108410.getClass(), "first", null);
        setField(term108340, term108340.getClass(), "next", term108410);
        setIntField(term108340, term108340.getClass(), "type", 130);
        setField(term108340, term108340.getClass(), "first", null);
        setField(term108270, term108270.getClass(), "first", term108340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term108270;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term107940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


