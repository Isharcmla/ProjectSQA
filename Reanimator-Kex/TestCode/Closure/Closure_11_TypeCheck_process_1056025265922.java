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

public class TypeCheck_process_1056025265922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243030;
     Object term243278;

    public TypeCheck_process_1056025265922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term243030 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term243134 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term243208 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term243030, term243030.getClass(), "scopeCreator", term243134);
        setField(term243208, term243208.getClass(), "parent", null);
        setField(term243030, term243030.getClass(), "topScope", term243208);
        setField(term243030, term243030.getClass(), "compiler", null);
        setBooleanField(term243030, term243030.getClass(), "inExterns", false);
        term243278 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term243348 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term243278, term243278.getClass(), "parent", term243348);
        setIntField(term243278, term243278.getClass(), "type", 124);
        setField(term243278, term243278.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term243278;
        try {
            callMethod(klass, "process", argTypes, term243030, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


