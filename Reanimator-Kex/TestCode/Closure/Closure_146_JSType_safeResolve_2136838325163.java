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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;

public class JSType_safeResolve_2136838325163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20957;
     Object term21495;
     Object term21489;

    public JSType_safeResolve_2136838325163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        term21495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term21495, term21495.getClass(), "resolved", true);
        setField(term21495, term21495.getClass(), "resolveResult", term21495);
        setField(term21495, term21495.getClass(), "registry", null);
        term21489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NullType"));
        setBooleanField(term21489, term21489.getClass(), "resolved", true);
        setField(term21489, term21489.getClass(), "resolveResult", term21489);
        setField(term21489, term21489.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term20957;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term20957, term21495));
        assertTrue(recursiveEquals(retValue, term21489));
    }

};


