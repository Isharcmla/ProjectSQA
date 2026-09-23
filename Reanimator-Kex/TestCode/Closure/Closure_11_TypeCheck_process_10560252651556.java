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

public class TypeCheck_process_10560252651556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490655;
     Object term490905;

    public TypeCheck_process_10560252651556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term490655 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term490761 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term490835 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term490655, term490655.getClass(), "scopeCreator", term490761);
        setField(term490835, term490835.getClass(), "parent", null);
        setField(term490655, term490655.getClass(), "topScope", term490835);
        setField(term490655, term490655.getClass(), "compiler", null);
        setBooleanField(term490655, term490655.getClass(), "inExterns", false);
        term490905 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term490905, term490905.getClass(), "parent", term490975);
        setIntField(term490905, term490905.getClass(), "type", 128);
        setField(term490905, term490905.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term490905;
        try {
            callMethod(klass, "process", argTypes, term490655, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


