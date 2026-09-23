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

public class TypeCheck_process_10560252651428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term436832;
     Object term437080;

    public TypeCheck_process_10560252651428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term436832 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term436936 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term437010 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term436832, term436832.getClass(), "scopeCreator", term436936);
        setField(term437010, term437010.getClass(), "parent", null);
        setField(term436832, term436832.getClass(), "topScope", term437010);
        setField(term436832, term436832.getClass(), "compiler", null);
        setBooleanField(term436832, term436832.getClass(), "inExterns", false);
        term437080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term437150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term437080, term437080.getClass(), "parent", term437150);
        setIntField(term437080, term437080.getClass(), "type", 77);
        setField(term437080, term437080.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term437080;
        try {
            callMethod(klass, "process", argTypes, term436832, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


