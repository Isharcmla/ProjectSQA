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

public class FunctionType_getLeastSupertype_4188508861279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1768991;
     Object term1769556;

    public FunctionType_getLeastSupertype_4188508861279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1770618 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1770617 = ((Class) term1770618).getDeclaredField((String) "ORDINARY");
        ((Field) term1770617).setAccessible(true);
        Object enum3147 = ((Field) term1770617).get((Object) null);
        Class<? extends Object> term1770909 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1770908 = ((Class) term1770909).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1770908).setAccessible(true);
        Object enum3148 = ((Field) term1770908).get((Object) null);
        term1768991 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        term1769556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1769501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term1768991, term1768991.getClass(), "kind", enum3147);
        setField(term1769556, term1769556.getClass(), "kind", enum3148);
        setField(term1769556, term1769556.getClass(), "typeOfThis", null);
        setField(term1768991, term1768991.getClass(), "typeOfThis", term1769556);
        setField(term1768991, term1768991.getClass(), "registry", term1769501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1769556;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1768991, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


