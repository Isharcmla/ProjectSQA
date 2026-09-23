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

public class FunctionType_isSubtype_21010021581349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1893659;
     Object term1894125;

    public FunctionType_isSubtype_21010021581349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1897099 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1897098 = ((Class) term1897099).getDeclaredField((String) "ORDINARY");
        ((Field) term1897098).setAccessible(true);
        Object enum3365 = ((Field) term1897098).get((Object) null);
        term1893659 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1893907 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1894017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1893659, term1893659.getClass(), "kind", enum3365);
        setField(term1893907, term1893907.getClass(), "kind", enum3365);
        setField(term1893907, term1893907.getClass(), "typeOfThis", term1894017);
        setField(term1893659, term1893659.getClass(), "typeOfThis", term1893907);
        Class<? extends Object> term1897390 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1897389 = ((Class) term1897390).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1897389).setAccessible(true);
        Object enum3366 = ((Field) term1897389).get((Object) null);
        term1894125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1894383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1894493 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1894125, term1894125.getClass(), "kind", enum3366);
        setField(term1894383, term1894383.getClass(), "kind", enum3366);
        setField(term1894383, term1894383.getClass(), "typeOfThis", term1894493);
        setField(term1894125, term1894125.getClass(), "typeOfThis", term1894383);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1894125;
        try {
            callMethod(klass, "isSubtype", argTypes, term1893659, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


