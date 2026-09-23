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
import java.lang.String;
import java.lang.Object;

public class FunctionType_getGreatestSubtype_6795917091590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2335450;
     Object term2336224;

    public FunctionType_getGreatestSubtype_6795917091590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2336603 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2336602 = ((Class) term2336603).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2336602).setAccessible(true);
        Object enum4167 = ((Field) term2336602).get((Object) null);
        Class<? extends Object> term2336903 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2336902 = ((Class) term2336903).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2336902).setAccessible(true);
        Object enum4168 = ((Field) term2336902).get((Object) null);
        term2335450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2336004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2336601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2335450, term2335450.getClass(), "kind", enum4167);
        setField(term2336004, term2336004.getClass(), "kind", enum4167);
        setField(term2336601, term2336601.getClass(), "kind", enum4168);
        setField(term2336601, term2336601.getClass(), "typeOfThis", null);
        setField(term2336004, term2336004.getClass(), "typeOfThis", term2336601);
        setField(term2335450, term2335450.getClass(), "typeOfThis", term2336004);
        term2336224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2336546 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2336224, term2336224.getClass(), "kind", enum4167);
        setField(term2336546, term2336546.getClass(), "kind", enum4167);
        setField(term2336546, term2336546.getClass(), "typeOfThis", term2336601);
        setField(term2336224, term2336224.getClass(), "typeOfThis", term2336546);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2336224;
        callMethod(klass, "getGreatestSubtype", argTypes, term2335450, args);
    }

};


