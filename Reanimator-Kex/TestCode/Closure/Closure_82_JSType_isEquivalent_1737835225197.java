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

public class JSType_isEquivalent_1737835225197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24971;
     Object term25061;
     Object term26381;
     Object term26382;

    public JSType_isEquivalent_1737835225197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term25061 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term26381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term26381, term26381.getClass(), "resolved", false);
        setField(term26381, term26381.getClass(), "resolveResult", null);
        setField(term26381, term26381.getClass(), "registry", null);
        term26382 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term26382, term26382.getClass(), "resolved", false);
        setField(term26382, term26382.getClass(), "resolveResult", null);
        setField(term26382, term26382.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term24971;
        args[1] = term25061;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term24971, term26381));
        assertTrue(recursiveEquals(term25061, term26382));
        assertTrue(recursiveEquals(retValue, false));
    }

};


