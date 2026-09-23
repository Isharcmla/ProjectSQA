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

public class TypeCheck_process_10560252651022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283406;
     Object term283654;

    public TypeCheck_process_10560252651022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283406 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term283510 = newInstance(Class.forName("com.google.javascript.jscomp.MemoizedScopeCreator"));
        Object term283584 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term283406, term283406.getClass(), "scopeCreator", term283510);
        setField(term283584, term283584.getClass(), "parent", null);
        setField(term283406, term283406.getClass(), "topScope", term283584);
        setField(term283406, term283406.getClass(), "compiler", null);
        setBooleanField(term283406, term283406.getClass(), "inExterns", false);
        term283654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term283724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term283654, term283654.getClass(), "parent", term283724);
        setIntField(term283654, term283654.getClass(), "type", 36);
        setField(term283654, term283654.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term283654;
        try {
            callMethod(klass, "process", argTypes, term283406, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


