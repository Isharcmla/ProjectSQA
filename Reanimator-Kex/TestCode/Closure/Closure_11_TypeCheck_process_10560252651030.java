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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_process_10560252651030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term286036;
     Object term286286;

    public TypeCheck_process_10560252651030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term286036 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term286142 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term286216 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term286036, term286036.getClass(), "scopeCreator", term286142);
        setField(term286216, term286216.getClass(), "parent", null);
        setField(term286036, term286036.getClass(), "topScope", term286216);
        setField(term286036, term286036.getClass(), "compiler", null);
        setBooleanField(term286036, term286036.getClass(), "inExterns", false);
        term286286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term286286, term286286.getClass(), "parent", term286356);
        setIntField(term286286, term286286.getClass(), "type", 53);
        setField(term286286, term286286.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term286286;
        try {
            callMethod(klass, "process", argTypes, term286036, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


