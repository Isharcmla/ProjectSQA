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

public class FunctionType_isSubtype_21010021581493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2165679;
     Object term2166333;

    public FunctionType_isSubtype_21010021581493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2167914 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2167913 = ((Class) term2167914).getDeclaredField((String) "ORDINARY");
        ((Field) term2167913).setAccessible(true);
        Object enum3861 = ((Field) term2167913).get((Object) null);
        Class<? extends Object> term2168205 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2168204 = ((Class) term2168205).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2168204).setAccessible(true);
        Object enum3862 = ((Field) term2168204).get((Object) null);
        term2165679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2166223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2165679, term2165679.getClass(), "kind", enum3861);
        setField(term2166223, term2166223.getClass(), "kind", enum3862);
        setField(term2165679, term2165679.getClass(), "typeOfThis", term2166223);
        term2166333 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2166663 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2166333, term2166333.getClass(), "kind", enum3861);
        setField(term2166663, term2166663.getClass(), "kind", enum3862);
        setField(term2166333, term2166333.getClass(), "typeOfThis", term2166663);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2166333;
        try {
            callMethod(klass, "isSubtype", argTypes, term2165679, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


