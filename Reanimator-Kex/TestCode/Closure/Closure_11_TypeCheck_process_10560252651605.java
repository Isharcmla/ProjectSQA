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

public class TypeCheck_process_10560252651605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term509170;
     Object term509412;

    public TypeCheck_process_10560252651605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term509170 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term509268 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term509342 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term509170, term509170.getClass(), "scopeCreator", term509268);
        setField(term509342, term509342.getClass(), "parent", null);
        setField(term509170, term509170.getClass(), "topScope", term509342);
        setField(term509170, term509170.getClass(), "compiler", null);
        setBooleanField(term509170, term509170.getClass(), "inExterns", false);
        term509412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term509482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term509412, term509412.getClass(), "parent", term509482);
        setIntField(term509412, term509412.getClass(), "type", 35);
        setField(term509412, term509412.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term509412;
        try {
            callMethod(klass, "process", argTypes, term509170, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


