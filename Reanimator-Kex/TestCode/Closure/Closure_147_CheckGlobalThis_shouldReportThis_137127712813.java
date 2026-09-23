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

public class CheckGlobalThis_shouldReportThis_137127712813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4964;
     Object term4978;

    public CheckGlobalThis_shouldReportThis_137127712813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4964 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term4964, term4964.getClass(), "assignLhsChild", null);
        term4978 = newInstance(Class.forName("com.google.javascript.jscomp.CheckGlobalThis"));
        setField(term4978, term4978.getClass(), "compiler", null);
        setField(term4978, term4978.getClass(), "level", null);
        setField(term4978, term4978.getClass(), "assignLhsChild", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckGlobalThis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "shouldReportThis", argTypes, term4964, args);
        assertTrue(recursiveEquals(term4964, term4978));
        assertTrue(recursiveEquals(retValue, false));
    }

};


