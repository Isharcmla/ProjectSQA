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

public class FunctionType_isSubtype_21010021581612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159203;
     Object term2159661;

    public FunctionType_isSubtype_21010021581612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2164144 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2164143 = ((Class) term2164144).getDeclaredField((String) "ORDINARY");
        ((Field) term2164143).setAccessible(true);
        Object enum4031 = ((Field) term2164143).get((Object) null);
        term2159203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2159451 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2159551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2159203, term2159203.getClass(), "kind", enum4031);
        setField(term2159451, term2159451.getClass(), "kind", enum4031);
        setField(term2159451, term2159451.getClass(), "typeOfThis", term2159551);
        setField(term2159203, term2159203.getClass(), "typeOfThis", term2159451);
        Class<? extends Object> term2164435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2164434 = ((Class) term2164435).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2164434).setAccessible(true);
        Object enum4032 = ((Field) term2164434).get((Object) null);
        term2159661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2159843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2159661, term2159661.getClass(), "kind", enum4031);
        setField(term2159843, term2159843.getClass(), "kind", enum4032);
        setField(term2159843, term2159843.getClass(), "typeOfThis", null);
        setField(term2159661, term2159661.getClass(), "typeOfThis", term2159843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2159661;
        try {
            callMethod(klass, "isSubtype", argTypes, term2159203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


