package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_resolveInternal_5807426187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99204;

    public FunctionType_resolveInternal_5807426187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term99310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term99204, term99204.getClass(), "resolveResult", term99310);
        setBooleanField(term99204, term99204.getClass(), "resolved", false);
        setField(term99204, term99204.getClass(), "call", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term99204, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


