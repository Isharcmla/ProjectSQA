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

public class TypeCheck_check_233062943249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111103;
     Object term111353;

    public TypeCheck_check_233062943249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111103 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term111209 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term111283 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term111103, term111103.getClass(), "compiler", null);
        setField(term111103, term111103.getClass(), "scopeCreator", term111209);
        setBooleanField(term111103, term111103.getClass(), "inExterns", false);
        setField(term111283, term111283.getClass(), "parent", null);
        setField(term111103, term111103.getClass(), "topScope", term111283);
        term111353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term111493 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term111353, term111353.getClass(), "type", 0);
        setField(term111423, term111423.getClass(), "next", term111493);
        setIntField(term111423, term111423.getClass(), "type", 30);
        setField(term111423, term111423.getClass(), "first", null);
        setField(term111353, term111353.getClass(), "first", term111423);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term111353;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term111103, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


