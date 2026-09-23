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

public class TypeCheck_process_10560252651201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347417;
     Object term347665;

    public TypeCheck_process_10560252651201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term347417 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term347521 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term347595 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term347417, term347417.getClass(), "scopeCreator", term347521);
        setField(term347595, term347595.getClass(), "parent", null);
        setField(term347417, term347417.getClass(), "topScope", term347595);
        setField(term347417, term347417.getClass(), "compiler", null);
        setBooleanField(term347417, term347417.getClass(), "inExterns", false);
        term347665 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term347735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term347665, term347665.getClass(), "parent", term347735);
        setIntField(term347665, term347665.getClass(), "type", 31);
        setField(term347665, term347665.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term347665;
        try {
            callMethod(klass, "process", argTypes, term347417, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


