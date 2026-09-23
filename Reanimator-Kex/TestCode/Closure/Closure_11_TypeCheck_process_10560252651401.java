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

public class TypeCheck_process_10560252651401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term427328;
     Object term427570;

    public TypeCheck_process_10560252651401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term427328 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        Object term427426 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        Object term427500 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term427328, term427328.getClass(), "scopeCreator", term427426);
        setField(term427500, term427500.getClass(), "parent", null);
        setField(term427328, term427328.getClass(), "topScope", term427500);
        setField(term427328, term427328.getClass(), "compiler", null);
        setBooleanField(term427328, term427328.getClass(), "inExterns", false);
        term427570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term427640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term427570, term427570.getClass(), "parent", term427640);
        setIntField(term427570, term427570.getClass(), "type", 152);
        setField(term427570, term427570.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term427570;
        try {
            callMethod(klass, "process", argTypes, term427328, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


