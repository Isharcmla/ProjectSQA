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

public class TypeCheck_process_10560252651746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568847;
     Object term569097;

    public TypeCheck_process_10560252651746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568847 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term568953 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term569027 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term568847, term568847.getClass(), "scopeCreator", term568953);
        setField(term569027, term569027.getClass(), "parent", null);
        setField(term568847, term568847.getClass(), "topScope", term569027);
        setField(term568847, term568847.getClass(), "compiler", null);
        setBooleanField(term568847, term568847.getClass(), "inExterns", false);
        term569097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term569167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term569097, term569097.getClass(), "parent", term569167);
        setIntField(term569097, term569097.getClass(), "type", 108);
        setField(term569097, term569097.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term569097;
        try {
            callMethod(klass, "process", argTypes, term568847, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


