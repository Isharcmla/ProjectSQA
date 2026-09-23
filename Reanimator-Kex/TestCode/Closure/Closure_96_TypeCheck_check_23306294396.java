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

public class TypeCheck_check_23306294396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57991;
     Object term58215;

    public TypeCheck_check_23306294396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57991 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term58071 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        Object term58145 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term57991, term57991.getClass(), "compiler", term58071);
        setField(term57991, term57991.getClass(), "scopeCreator", null);
        setBooleanField(term57991, term57991.getClass(), "inExterns", false);
        setField(term58145, term58145.getClass(), "parent", null);
        setField(term57991, term57991.getClass(), "topScope", term58145);
        term58215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58285 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term58215, term58215.getClass(), "type", 0);
        setField(term58285, term58285.getClass(), "next", term58355);
        setIntField(term58285, term58285.getClass(), "type", 68);
        setField(term58285, term58285.getClass(), "first", null);
        setField(term58215, term58215.getClass(), "first", term58285);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term58215;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term57991, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


