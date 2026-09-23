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

public class TypeCheck_process_10560252651744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567621;
     Object term567863;

    public TypeCheck_process_10560252651744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term567621 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term567719 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term567793 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term567621, term567621.getClass(), "scopeCreator", term567719);
        setField(term567793, term567793.getClass(), "parent", null);
        setField(term567621, term567621.getClass(), "topScope", term567793);
        setField(term567621, term567621.getClass(), "compiler", null);
        setBooleanField(term567621, term567621.getClass(), "inExterns", false);
        term567863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term567933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term567863, term567863.getClass(), "parent", term567933);
        setIntField(term567863, term567863.getClass(), "type", 125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term567863;
        try {
            callMethod(klass, "process", argTypes, term567621, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


