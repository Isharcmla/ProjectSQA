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

public class TypeCheck_process_10560252651103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316810;
     Object term317060;

    public TypeCheck_process_10560252651103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term316810 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term316916 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term316990 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term316810, term316810.getClass(), "scopeCreator", term316916);
        setField(term316990, term316990.getClass(), "parent", null);
        setField(term316810, term316810.getClass(), "topScope", term316990);
        setField(term316810, term316810.getClass(), "compiler", null);
        setBooleanField(term316810, term316810.getClass(), "inExterns", false);
        term317060 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term317130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term317060, term317060.getClass(), "parent", term317130);
        setIntField(term317060, term317060.getClass(), "type", 113);
        setField(term317060, term317060.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term317060;
        try {
            callMethod(klass, "process", argTypes, term316810, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


