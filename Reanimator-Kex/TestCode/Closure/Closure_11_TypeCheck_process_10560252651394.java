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

public class TypeCheck_process_10560252651394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424491;
     Object term424741;

    public TypeCheck_process_10560252651394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424491 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term424597 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term424671 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term424491, term424491.getClass(), "scopeCreator", term424597);
        setField(term424671, term424671.getClass(), "parent", null);
        setField(term424491, term424491.getClass(), "topScope", term424671);
        setField(term424491, term424491.getClass(), "compiler", null);
        setBooleanField(term424491, term424491.getClass(), "inExterns", false);
        term424741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term424811 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term424741, term424741.getClass(), "parent", term424811);
        setIntField(term424741, term424741.getClass(), "type", 12);
        setField(term424741, term424741.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term424741;
        try {
            callMethod(klass, "process", argTypes, term424491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


