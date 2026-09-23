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

public class TypeCheck_check_23306294393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56475;
     Object term56699;

    public TypeCheck_check_23306294393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56475 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term56555 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term56629 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term56475, term56475.getClass(), "compiler", term56555);
        setField(term56475, term56475.getClass(), "scopeCreator", null);
        setBooleanField(term56475, term56475.getClass(), "inExterns", false);
        setField(term56629, term56629.getClass(), "parent", null);
        setField(term56475, term56475.getClass(), "topScope", term56629);
        term56699 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56839 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56699, term56699.getClass(), "type", 0);
        setField(term56769, term56769.getClass(), "next", term56839);
        setIntField(term56769, term56769.getClass(), "type", 57);
        setField(term56769, term56769.getClass(), "first", null);
        setField(term56699, term56699.getClass(), "first", term56769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term56699;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term56475, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


