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

public class FunctionType_isSubtype_21010021581035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1327603;
     Object term1328365;

    public FunctionType_isSubtype_21010021581035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1330125 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1330124 = ((Class) term1330125).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1330124).setAccessible(true);
        Object enum2381 = ((Field) term1330124).get((Object) null);
        term1327603 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1328147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1328257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1327603, term1327603.getClass(), "kind", enum2381);
        setField(term1328147, term1328147.getClass(), "kind", enum2381);
        setField(term1328147, term1328147.getClass(), "typeOfThis", term1328257);
        setField(term1327603, term1327603.getClass(), "typeOfThis", term1328147);
        Class<? extends Object> term1330425 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1330424 = ((Class) term1330425).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1330424).setAccessible(true);
        Object enum2382 = ((Field) term1330424).get((Object) null);
        term1328365 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1328697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1328797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term1328365, term1328365.getClass(), "kind", enum2381);
        setField(term1328697, term1328697.getClass(), "kind", enum2382);
        setField(term1328697, term1328697.getClass(), "typeOfThis", term1328797);
        setField(term1328365, term1328365.getClass(), "typeOfThis", term1328697);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1328365;
        try {
            callMethod(klass, "isSubtype", argTypes, term1327603, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


