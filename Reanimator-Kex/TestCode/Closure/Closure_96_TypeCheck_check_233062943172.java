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

public class TypeCheck_check_233062943172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84197;
     Object term84421;

    public TypeCheck_check_233062943172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84197 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term84277 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term84351 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term84197, term84197.getClass(), "compiler", term84277);
        setField(term84197, term84197.getClass(), "scopeCreator", null);
        setBooleanField(term84197, term84197.getClass(), "inExterns", false);
        setField(term84351, term84351.getClass(), "parent", null);
        setField(term84197, term84197.getClass(), "topScope", term84351);
        term84421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84491 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term84561 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term84421, term84421.getClass(), "type", 0);
        setField(term84491, term84491.getClass(), "next", term84561);
        setIntField(term84491, term84491.getClass(), "type", 39);
        setField(term84491, term84491.getClass(), "first", null);
        setField(term84421, term84421.getClass(), "first", term84491);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term84421;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term84197, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


