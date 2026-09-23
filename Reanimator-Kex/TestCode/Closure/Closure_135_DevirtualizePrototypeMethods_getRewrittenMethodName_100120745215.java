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
import static com.google.javascript.jscomp.EqualityUtils.*;

public class DevirtualizePrototypeMethods_getRewrittenMethodName_100120745215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;
     Object term1697;

    public DevirtualizePrototypeMethods_getRewrittenMethodName_100120745215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term112, term112.getClass(), "compiler", null);
        term1697 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term1697, term1697.getClass(), "compiler", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object retValue = callMethod(klass, "getRewrittenMethodName", argTypes, term112, args);
        assertTrue(recursiveEquals(term112, term1697));
        assertTrue(recursiveEquals(retValue, "JSCompiler_StaticMethods_PAEBtnZtTD"));
    }

};


