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

public class TypeCheck_check_233062943264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116315;
     Object term116645;

    public TypeCheck_check_233062943264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116315 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term116395 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term116501 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term116575 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term116315, term116315.getClass(), "compiler", term116395);
        setField(term116315, term116315.getClass(), "scopeCreator", term116501);
        setBooleanField(term116315, term116315.getClass(), "inExterns", false);
        setField(term116575, term116575.getClass(), "parent", null);
        setField(term116315, term116315.getClass(), "topScope", term116575);
        term116645 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116645, term116645.getClass(), "type", 0);
        setField(term116785, term116785.getClass(), "next", term116855);
        setIntField(term116785, term116785.getClass(), "type", 108);
        setField(term116785, term116785.getClass(), "first", null);
        setField(term116715, term116715.getClass(), "next", term116785);
        setIntField(term116715, term116715.getClass(), "type", 130);
        setField(term116715, term116715.getClass(), "first", null);
        setField(term116645, term116645.getClass(), "first", term116715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term116645;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term116315, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


