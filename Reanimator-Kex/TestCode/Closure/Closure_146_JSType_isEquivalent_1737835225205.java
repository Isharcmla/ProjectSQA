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

public class JSType_isEquivalent_1737835225205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31226;
     Object term31322;
     Object term33265;
     Object term33266;

    public JSType_isEquivalent_1737835225205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term31322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        term33265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term33265, term33265.getClass(), "resolved", false);
        setField(term33265, term33265.getClass(), "resolveResult", null);
        setField(term33265, term33265.getClass(), "registry", null);
        term33266 = newInstance(Class.forName("com.google.javascript.rhino.jstype.StringType"));
        setBooleanField(term33266, term33266.getClass(), "resolved", false);
        setField(term33266, term33266.getClass(), "resolveResult", null);
        setField(term33266, term33266.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term31226;
        args[1] = term31322;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term31226, term33265));
        assertTrue(recursiveEquals(term31322, term33266));
        assertTrue(recursiveEquals(retValue, false));
    }

};


