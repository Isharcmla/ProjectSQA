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

public class TypeCheck_process_1056025265936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247991;
     Object term248233;

    public TypeCheck_process_1056025265936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247991 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term248089 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term248163 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term247991, term247991.getClass(), "scopeCreator", term248089);
        setField(term248163, term248163.getClass(), "parent", null);
        setField(term247991, term247991.getClass(), "topScope", term248163);
        setField(term247991, term247991.getClass(), "compiler", null);
        setBooleanField(term247991, term247991.getClass(), "inExterns", false);
        term248233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term248303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term248233, term248233.getClass(), "parent", term248303);
        setIntField(term248233, term248233.getClass(), "type", 150);
        setField(term248233, term248233.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term248233;
        try {
            callMethod(klass, "process", argTypes, term247991, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


