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

public class FunctionType_isSubtype_21010021581231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518681;
     Object term1519433;

    public FunctionType_isSubtype_21010021581231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1520900 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1520899 = ((Class) term1520900).getDeclaredField((String) "ORDINARY");
        ((Field) term1520899).setAccessible(true);
        Object enum2838 = ((Field) term1520899).get((Object) null);
        term1518681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1519225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1519325 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1518681, term1518681.getClass(), "kind", enum2838);
        setField(term1519225, term1519225.getClass(), "kind", enum2838);
        setField(term1519225, term1519225.getClass(), "typeOfThis", term1519325);
        setField(term1518681, term1518681.getClass(), "typeOfThis", term1519225);
        Class<? extends Object> term1521191 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1521190 = ((Class) term1521191).getDeclaredField((String) "INTERFACE");
        ((Field) term1521190).setAccessible(true);
        Object enum2839 = ((Field) term1521190).get((Object) null);
        term1519433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1519763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1519861 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term1519433, term1519433.getClass(), "kind", enum2838);
        setField(term1519763, term1519763.getClass(), "kind", enum2839);
        setField(term1519763, term1519763.getClass(), "typeOfThis", term1519861);
        setField(term1519433, term1519433.getClass(), "typeOfThis", term1519763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1519433;
        try {
            callMethod(klass, "isSubtype", argTypes, term1518681, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


