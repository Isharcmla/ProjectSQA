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
import java.lang.String;
import java.lang.Object;

public class FunctionType_supAndInfHelper_16039771041273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1757362;
     Object term1758012;

    public FunctionType_supAndInfHelper_16039771041273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1758869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1758868 = ((Class) term1758869).getDeclaredField((String) "INTERFACE");
        ((Field) term1758868).setAccessible(true);
        Object enum3129 = ((Field) term1758868).get((Object) null);
        term1757362 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1757902 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1757362, term1757362.getClass(), "kind", enum3129);
        setField(term1757362, term1757362.getClass(), "typeOfThis", term1757902);
        term1758012 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1758012, term1758012.getClass(), "kind", enum3129);
        setField(term1758012, term1758012.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1758012;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term1757362, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


