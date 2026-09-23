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

public class TypeCheck_process_10560252651340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400690;
     Object term400938;

    public TypeCheck_process_10560252651340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400690 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term400794 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term400868 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term400690, term400690.getClass(), "scopeCreator", term400794);
        setField(term400868, term400868.getClass(), "parent", null);
        setField(term400690, term400690.getClass(), "topScope", term400868);
        setField(term400690, term400690.getClass(), "compiler", null);
        setBooleanField(term400690, term400690.getClass(), "inExterns", false);
        term400938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term401008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term400938, term400938.getClass(), "parent", term401008);
        setIntField(term400938, term400938.getClass(), "type", 95);
        setField(term400938, term400938.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term400938;
        try {
            callMethod(klass, "process", argTypes, term400690, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


