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

public class CheckAccessControls_getTypeDeprecationInfo_97292440985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23443;
     Object term23913;

    public CheckAccessControls_getTypeDeprecationInfo_97292440985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23443 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        term23913 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term23913, term23913.getClass(), "call", null);
        setField(term23913, term23913.getClass(), "prototype", null);
        setField(term23913, term23913.getClass(), "kind", null);
        setField(term23913, term23913.getClass(), "typeOfThis", null);
        setField(term23913, term23913.getClass(), "source", null);
        setField(term23913, term23913.getClass(), "implementedInterfaces", null);
        setField(term23913, term23913.getClass(), "subTypes", null);
        setField(term23913, term23913.getClass(), "templateTypeName", null);
        setField(term23913, term23913.getClass(), "className", null);
        setField(term23913, term23913.getClass(), "properties", null);
        setBooleanField(term23913, term23913.getClass(), "nativeType", false);
        setField(term23913, term23913.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term23913, term23913.getClass(), "prettyPrint", false);
        setBooleanField(term23913, term23913.getClass(), "visited", false);
        setField(term23913, term23913.getClass(), "docInfo", null);
        setBooleanField(term23913, term23913.getClass(), "unknown", false);
        setBooleanField(term23913, term23913.getClass(), "resolved", false);
        setField(term23913, term23913.getClass(), "resolveResult", null);
        setField(term23913, term23913.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term23443;
        Object retValue = callMethod(klass, "getTypeDeprecationInfo", argTypes, null, args);
        assertTrue(recursiveEquals(term23443, term23913));
        assertTrue(recursiveEquals(retValue, null));
    }

};


