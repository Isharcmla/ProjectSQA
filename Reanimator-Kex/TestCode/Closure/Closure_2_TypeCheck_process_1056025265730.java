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

public class TypeCheck_process_1056025265730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198436;

    public TypeCheck_process_1056025265730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198436 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term198540 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term198614 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term198436, term198436.getClass(), "scopeCreator", term198540);
        setField(term198436, term198436.getClass(), "topScope", term198614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "process", argTypes, term198436, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


