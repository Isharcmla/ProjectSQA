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

public class TypeCheck_process_10560252651100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315920;
     Object term316170;

    public TypeCheck_process_10560252651100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315920 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term316026 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term316100 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term315920, term315920.getClass(), "scopeCreator", term316026);
        setField(term316100, term316100.getClass(), "parent", null);
        setField(term315920, term315920.getClass(), "topScope", term316100);
        setField(term315920, term315920.getClass(), "compiler", null);
        setBooleanField(term315920, term315920.getClass(), "inExterns", false);
        term316170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316240 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term316170, term316170.getClass(), "parent", term316240);
        setIntField(term316170, term316170.getClass(), "type", 124);
        setField(term316170, term316170.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term316170;
        try {
            callMethod(klass, "process", argTypes, term315920, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


