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

public class TypeCheck_process_10560252651380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419797;
     Object term420047;

    public TypeCheck_process_10560252651380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419797 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term419903 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term419977 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term419797, term419797.getClass(), "scopeCreator", term419903);
        setField(term419977, term419977.getClass(), "parent", null);
        setField(term419797, term419797.getClass(), "topScope", term419977);
        setField(term419797, term419797.getClass(), "compiler", null);
        setBooleanField(term419797, term419797.getClass(), "inExterns", false);
        term420047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term420047, term420047.getClass(), "parent", term420117);
        setIntField(term420047, term420047.getClass(), "type", 27);
        setField(term420047, term420047.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term420047;
        try {
            callMethod(klass, "process", argTypes, term419797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


