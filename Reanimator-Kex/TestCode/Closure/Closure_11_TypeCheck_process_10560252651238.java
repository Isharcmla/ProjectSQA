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

public class TypeCheck_process_10560252651238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360949;
     Object term361199;

    public TypeCheck_process_10560252651238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360949 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term361055 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term361129 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term360949, term360949.getClass(), "scopeCreator", term361055);
        setField(term361129, term361129.getClass(), "parent", null);
        setField(term360949, term360949.getClass(), "topScope", term361129);
        setField(term360949, term360949.getClass(), "compiler", null);
        setBooleanField(term360949, term360949.getClass(), "inExterns", false);
        term361199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term361269 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term361199, term361199.getClass(), "parent", term361269);
        setIntField(term361199, term361199.getClass(), "type", 78);
        setField(term361199, term361199.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term361199;
        try {
            callMethod(klass, "process", argTypes, term360949, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


