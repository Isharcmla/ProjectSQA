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

public class TypeCheck_check_233062943181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86950;
     Object term87198;

    public TypeCheck_check_233062943181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86950 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term87054 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term87128 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term86950, term86950.getClass(), "compiler", null);
        setField(term86950, term86950.getClass(), "scopeCreator", term87054);
        setBooleanField(term86950, term86950.getClass(), "inExterns", false);
        setField(term87128, term87128.getClass(), "parent", null);
        setField(term86950, term86950.getClass(), "topScope", term87128);
        term87198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87338 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term87198, term87198.getClass(), "type", 0);
        setField(term87268, term87268.getClass(), "next", term87338);
        setIntField(term87268, term87268.getClass(), "type", 27);
        setField(term87268, term87268.getClass(), "first", null);
        setField(term87198, term87198.getClass(), "first", term87268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term87198;
        args[1] = true;
        try {
            callMethod(klass, "check", argTypes, term86950, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


