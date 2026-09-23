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

public class TypeCheck_process_1056025265856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219991;
     Object term220233;

    public TypeCheck_process_1056025265856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219991 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term220089 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term220163 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term219991, term219991.getClass(), "scopeCreator", term220089);
        setField(term219991, term219991.getClass(), "topScope", term220163);
        term220233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term220303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term220233, term220233.getClass(), "parent", term220303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term220233;
        try {
            callMethod(klass, "process", argTypes, term219991, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


