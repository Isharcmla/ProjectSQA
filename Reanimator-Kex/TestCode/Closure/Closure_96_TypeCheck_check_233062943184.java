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

public class TypeCheck_check_233062943184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88349;
     Object term88599;

    public TypeCheck_check_233062943184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88349 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term88455 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term88529 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term88349, term88349.getClass(), "compiler", null);
        setField(term88349, term88349.getClass(), "scopeCreator", term88455);
        setBooleanField(term88349, term88349.getClass(), "inExterns", false);
        setField(term88529, term88529.getClass(), "parent", null);
        setField(term88349, term88349.getClass(), "topScope", term88529);
        term88599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term88739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term88599, term88599.getClass(), "type", 0);
        setField(term88669, term88669.getClass(), "next", term88739);
        setIntField(term88669, term88669.getClass(), "type", 106);
        setField(term88669, term88669.getClass(), "first", null);
        setField(term88599, term88599.getClass(), "first", term88669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term88599;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term88349, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


