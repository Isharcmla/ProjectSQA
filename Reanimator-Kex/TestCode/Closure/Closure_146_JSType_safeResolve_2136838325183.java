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

public class JSType_safeResolve_2136838325183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24077;
     Object term24384;
     Object term24375;

    public JSType_safeResolve_2136838325183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24077 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term24384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term24384, term24384.getClass(), "parameters", null);
        setField(term24384, term24384.getClass(), "returnType", null);
        setBooleanField(term24384, term24384.getClass(), "returnTypeInferred", false);
        setBooleanField(term24384, term24384.getClass(), "resolved", true);
        setField(term24384, term24384.getClass(), "resolveResult", term24384);
        setField(term24384, term24384.getClass(), "registry", null);
        term24375 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term24375, term24375.getClass(), "parameters", null);
        setField(term24375, term24375.getClass(), "returnType", null);
        setBooleanField(term24375, term24375.getClass(), "returnTypeInferred", false);
        setBooleanField(term24375, term24375.getClass(), "resolved", true);
        setField(term24375, term24375.getClass(), "resolveResult", term24375);
        setField(term24375, term24375.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term24077;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term24077, null));
        assertTrue(recursiveEquals(retValue, term24375));
    }

};


