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

public class FunctionType_isSubtype_21010021581123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1324984;
     Object term1325596;

    public FunctionType_isSubtype_21010021581123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1327482 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1327481 = ((Class) term1327482).getDeclaredField((String) "ORDINARY");
        ((Field) term1327481).setAccessible(true);
        Object enum2478 = ((Field) term1327481).get((Object) null);
        Class<? extends Object> term1327773 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1327772 = ((Class) term1327773).getDeclaredField((String) "INTERFACE");
        ((Field) term1327772).setAccessible(true);
        Object enum2479 = ((Field) term1327772).get((Object) null);
        term1324984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1325232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1325488 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1324984, term1324984.getClass(), "kind", enum2478);
        setField(term1325232, term1325232.getClass(), "kind", enum2479);
        setField(term1325232, term1325232.getClass(), "typeOfThis", term1325488);
        setField(term1324984, term1324984.getClass(), "typeOfThis", term1325232);
        Class<? extends Object> term1328067 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1328066 = ((Class) term1328067).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1328066).setAccessible(true);
        Object enum2480 = ((Field) term1328066).get((Object) null);
        term1325596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1325778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1325596, term1325596.getClass(), "kind", enum2478);
        setField(term1325778, term1325778.getClass(), "kind", enum2480);
        setField(term1325778, term1325778.getClass(), "typeOfThis", null);
        setField(term1325596, term1325596.getClass(), "typeOfThis", term1325778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1325596;
        try {
            callMethod(klass, "isSubtype", argTypes, term1324984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


