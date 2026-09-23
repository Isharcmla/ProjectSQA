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

public class FunctionType_isSubtype_21010021581187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1597500;
     Object term1598152;

    public FunctionType_isSubtype_21010021581187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1599840 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1599839 = ((Class) term1599840).getDeclaredField((String) "ORDINARY");
        ((Field) term1599839).setAccessible(true);
        Object enum2855 = ((Field) term1599839).get((Object) null);
        term1597500 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1598044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1597500, term1597500.getClass(), "kind", enum2855);
        setField(term1598044, term1598044.getClass(), "kind", enum2855);
        setField(term1597500, term1597500.getClass(), "typeOfThis", term1598044);
        Class<? extends Object> term1600131 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1600130 = ((Class) term1600131).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1600130).setAccessible(true);
        Object enum2856 = ((Field) term1600130).get((Object) null);
        Class<? extends Object> term1600431 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1600430 = ((Class) term1600431).getDeclaredField((String) "INTERFACE");
        ((Field) term1600430).setAccessible(true);
        Object enum2857 = ((Field) term1600430).get((Object) null);
        term1598152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1598336 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1598152, term1598152.getClass(), "kind", enum2856);
        setField(term1598336, term1598336.getClass(), "kind", enum2857);
        setField(term1598152, term1598152.getClass(), "typeOfThis", term1598336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1598152;
        try {
            callMethod(klass, "isSubtype", argTypes, term1597500, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


