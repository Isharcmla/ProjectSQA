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

public class FunctionType_isSubtype_21010021581169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1403470;
     Object term1404222;

    public FunctionType_isSubtype_21010021581169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1407585 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1407584 = ((Class) term1407585).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1407584).setAccessible(true);
        Object enum2627 = ((Field) term1407584).get((Object) null);
        term1403470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1404014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1404114 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1403470, term1403470.getClass(), "kind", enum2627);
        setField(term1404014, term1404014.getClass(), "kind", enum2627);
        setField(term1404014, term1404014.getClass(), "typeOfThis", term1404114);
        setField(term1403470, term1403470.getClass(), "typeOfThis", term1404014);
        Class<? extends Object> term1407885 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1407884 = ((Class) term1407885).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1407884).setAccessible(true);
        Object enum2628 = ((Field) term1407884).get((Object) null);
        term1404222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1404404 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1404222, term1404222.getClass(), "kind", enum2628);
        setField(term1404404, term1404404.getClass(), "kind", enum2628);
        setField(term1404404, term1404404.getClass(), "typeOfThis", null);
        setField(term1404222, term1404222.getClass(), "typeOfThis", term1404404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1404222;
        try {
            callMethod(klass, "isSubtype", argTypes, term1403470, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


