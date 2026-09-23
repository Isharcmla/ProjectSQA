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

public class TypeCheck_process_10560252651512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472276;
     Object term472526;

    public TypeCheck_process_10560252651512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472276 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term472382 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term472456 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term472276, term472276.getClass(), "scopeCreator", term472382);
        setField(term472456, term472456.getClass(), "parent", null);
        setField(term472276, term472276.getClass(), "topScope", term472456);
        setField(term472276, term472276.getClass(), "compiler", null);
        setBooleanField(term472276, term472276.getClass(), "inExterns", false);
        term472526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term472596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term472526, term472526.getClass(), "parent", term472596);
        setIntField(term472526, term472526.getClass(), "type", 49);
        setField(term472526, term472526.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term472526;
        try {
            callMethod(klass, "process", argTypes, term472276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


