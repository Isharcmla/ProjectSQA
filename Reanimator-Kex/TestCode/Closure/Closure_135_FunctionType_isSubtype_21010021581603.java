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

public class FunctionType_isSubtype_21010021581603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2146715;
     Object term2146971;

    public FunctionType_isSubtype_21010021581603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2148315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2148314 = ((Class) term2148315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2148314).setAccessible(true);
        Object enum4004 = ((Field) term2148314).get((Object) null);
        term2146715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2146715, term2146715.getClass(), "kind", enum4004);
        setField(term2146715, term2146715.getClass(), "typeOfThis", term2146715);
        Class<? extends Object> term2148615 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2148614 = ((Class) term2148615).getDeclaredField((String) "INTERFACE");
        ((Field) term2148614).setAccessible(true);
        Object enum4005 = ((Field) term2148614).get((Object) null);
        term2146971 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2147153 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2146971, term2146971.getClass(), "kind", enum4004);
        setField(term2147153, term2147153.getClass(), "kind", enum4005);
        setField(term2146971, term2146971.getClass(), "typeOfThis", term2147153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2146971;
        try {
            callMethod(klass, "isSubtype", argTypes, term2146715, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


