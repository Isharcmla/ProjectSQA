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
import java.util.HashMap;

public class JSType_safeResolve_2136838325215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34858;
     Object term34947;
     Object term34909;

    public JSType_safeResolve_2136838325215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34906 = new HashMap();
        term34858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setBooleanField(term34858, term34858.getClass(), "resolved", false);
        setField(term34858, term34858.getClass(), "resolveResult", null);
        setField(term34858, term34858.getClass(), "implicitPrototype", null);
        setField(term34858, term34858.getClass(), "properties", term34906);
        HashMap term34948 = new HashMap();
        term34947 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term34947, term34947.getClass(), "className", null);
        setField(term34947, term34947.getClass(), "properties", term34948);
        setField(term34947, term34947.getClass(), "implicitPrototype", null);
        setBooleanField(term34947, term34947.getClass(), "nativeType", false);
        setBooleanField(term34947, term34947.getClass(), "prettyPrint", false);
        setBooleanField(term34947, term34947.getClass(), "visited", false);
        setField(term34947, term34947.getClass(), "docInfo", null);
        setBooleanField(term34947, term34947.getClass(), "unknown", false);
        setBooleanField(term34947, term34947.getClass(), "resolved", true);
        setField(term34947, term34947.getClass(), "resolveResult", term34947);
        setField(term34947, term34947.getClass(), "registry", null);
        HashMap term34910 = new HashMap();
        term34909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term34909, term34909.getClass(), "className", null);
        setField(term34909, term34909.getClass(), "properties", term34910);
        setField(term34909, term34909.getClass(), "implicitPrototype", null);
        setBooleanField(term34909, term34909.getClass(), "nativeType", false);
        setBooleanField(term34909, term34909.getClass(), "prettyPrint", false);
        setBooleanField(term34909, term34909.getClass(), "visited", false);
        setField(term34909, term34909.getClass(), "docInfo", null);
        setBooleanField(term34909, term34909.getClass(), "unknown", false);
        setBooleanField(term34909, term34909.getClass(), "resolved", true);
        setField(term34909, term34909.getClass(), "resolveResult", term34909);
        setField(term34909, term34909.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[3];
        args[0] = term34858;
        args[1] = null;
        args[2] = null;
        Object retValue = callMethod(klass, "safeResolve", argTypes, null, args);
        assertTrue(recursiveEquals(term34858, term34947));
        assertTrue(recursiveEquals(retValue, term34909));
    }

};


