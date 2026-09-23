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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class FunctionType_resolveInternal_5807426489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409637;

    public FunctionType_resolveInternal_5807426489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term409803 = new ArrayList();
        Object term409893 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term409855 = new ArrayList();
        ((ArrayList) term409855).add(term409855);
        ((ArrayList) term409855).add(term409893);
        term409637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term409751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term409637, term409637.getClass(), "resolveResult", term409751);
        setBooleanField(term409637, term409637.getClass(), "resolved", false);
        setField(term409637, term409637.getClass(), "call", null);
        setField(term409637, term409637.getClass(), "prototype", null);
        setField(term409637, term409637.getClass(), "typeOfThis", null);
        setField(term409637, term409637.getClass(), "implementedInterfaces", term409803);
        setField(term409637, term409637.getClass(), "subTypes", term409855);
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
            callMethod(klass, "resolveInternal", argTypes, term409637, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


