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

public class FunctionType_isSubtype_21010021581283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1773972;
     Object term1774624;

    public FunctionType_isSubtype_21010021581283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1775948 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1775947 = ((Class) term1775948).getDeclaredField((String) "INTERFACE");
        ((Field) term1775947).setAccessible(true);
        Object enum3157 = ((Field) term1775947).get((Object) null);
        Class<? extends Object> term1776242 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1776241 = ((Class) term1776242).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1776241).setAccessible(true);
        Object enum3158 = ((Field) term1776241).get((Object) null);
        term1773972 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1774516 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1773972, term1773972.getClass(), "kind", enum3157);
        setField(term1774516, term1774516.getClass(), "kind", enum3158);
        setField(term1773972, term1773972.getClass(), "typeOfThis", term1774516);
        term1774624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1774808 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1774624, term1774624.getClass(), "kind", enum3158);
        setField(term1774808, term1774808.getClass(), "kind", enum3157);
        setField(term1774624, term1774624.getClass(), "typeOfThis", term1774808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1774624;
        try {
            callMethod(klass, "isSubtype", argTypes, term1773972, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


