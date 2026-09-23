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

public class TypeCheck_process_10560252651442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442464;
     Object term442714;

    public TypeCheck_process_10560252651442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442464 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term442570 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term442644 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term442464, term442464.getClass(), "scopeCreator", term442570);
        setField(term442644, term442644.getClass(), "parent", null);
        setField(term442464, term442464.getClass(), "topScope", term442644);
        setField(term442464, term442464.getClass(), "compiler", null);
        setBooleanField(term442464, term442464.getClass(), "inExterns", false);
        term442714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term442714, term442714.getClass(), "parent", term442784);
        setIntField(term442714, term442714.getClass(), "type", 88);
        setField(term442714, term442714.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term442714;
        try {
            callMethod(klass, "process", argTypes, term442464, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


