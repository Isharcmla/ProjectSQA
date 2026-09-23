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

public class TypeCheck_process_10560252651122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324169;
     Object term324411;

    public TypeCheck_process_10560252651122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324169 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term324267 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term324341 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term324169, term324169.getClass(), "scopeCreator", term324267);
        setField(term324341, term324341.getClass(), "parent", null);
        setField(term324169, term324169.getClass(), "topScope", term324341);
        setField(term324169, term324169.getClass(), "compiler", null);
        setBooleanField(term324169, term324169.getClass(), "inExterns", false);
        term324411 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term324481 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term324411, term324411.getClass(), "parent", term324481);
        setIntField(term324411, term324411.getClass(), "type", 79);
        setField(term324411, term324411.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term324411;
        try {
            callMethod(klass, "process", argTypes, term324169, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


