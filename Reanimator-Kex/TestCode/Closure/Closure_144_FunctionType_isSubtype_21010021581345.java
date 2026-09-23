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

public class FunctionType_isSubtype_21010021581345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1889838;
     Object term1889561;

    public FunctionType_isSubtype_21010021581345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1890609 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1890608 = ((Class) term1890609).getDeclaredField((String) "INTERFACE");
        ((Field) term1890608).setAccessible(true);
        Object enum3354 = ((Field) term1890608).get((Object) null);
        term1889838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1889886 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1889838, term1889838.getClass(), "kind", enum3354);
        setField(term1889838, term1889838.getClass(), "typeOfThis", term1889886);
        term1889561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1889561, term1889561.getClass(), "kind", enum3354);
        setField(term1889561, term1889561.getClass(), "typeOfThis", term1889838);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1889561;
        try {
            callMethod(klass, "isSubtype", argTypes, term1889838, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


