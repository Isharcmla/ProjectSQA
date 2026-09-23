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

public class TypeCheck_process_10560252651217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353142;
     Object term353390;

    public TypeCheck_process_10560252651217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353142 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term353246 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term353320 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term353142, term353142.getClass(), "scopeCreator", term353246);
        setField(term353320, term353320.getClass(), "parent", null);
        setField(term353142, term353142.getClass(), "topScope", term353320);
        setField(term353142, term353142.getClass(), "compiler", null);
        setBooleanField(term353142, term353142.getClass(), "inExterns", false);
        term353390 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term353460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term353390, term353390.getClass(), "parent", term353460);
        setIntField(term353390, term353390.getClass(), "type", 86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term353390;
        try {
            callMethod(klass, "process", argTypes, term353142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


