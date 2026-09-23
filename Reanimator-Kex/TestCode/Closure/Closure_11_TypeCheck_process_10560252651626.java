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

public class TypeCheck_process_10560252651626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520468;
     Object term520718;

    public TypeCheck_process_10560252651626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520468 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term520574 = newInstance(Class.forName("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Object term520648 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term520468, term520468.getClass(), "scopeCreator", term520574);
        setField(term520648, term520648.getClass(), "parent", null);
        setField(term520468, term520468.getClass(), "topScope", term520648);
        setField(term520468, term520468.getClass(), "compiler", null);
        setBooleanField(term520468, term520468.getClass(), "inExterns", false);
        term520718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term520788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term520718, term520718.getClass(), "parent", term520788);
        setIntField(term520718, term520718.getClass(), "type", 139);
        setField(term520718, term520718.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term520718;
        try {
            callMethod(klass, "process", argTypes, term520468, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


