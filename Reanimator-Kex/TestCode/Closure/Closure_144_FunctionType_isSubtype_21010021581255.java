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

public class FunctionType_isSubtype_21010021581255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1725055;
     Object term1725717;

    public FunctionType_isSubtype_21010021581255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1727201 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1727200 = ((Class) term1727201).getDeclaredField((String) "INTERFACE");
        ((Field) term1727200).setAccessible(true);
        Object enum3080 = ((Field) term1727200).get((Object) null);
        Class<? extends Object> term1727495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1727494 = ((Class) term1727495).getDeclaredField((String) "INTERFACE");
        ((Field) term1727494).setAccessible(true);
        Object enum3081 = ((Field) term1727494).get((Object) null);
        term1725055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1725607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1725055, term1725055.getClass(), "kind", enum3080);
        setField(term1725607, term1725607.getClass(), "kind", enum3081);
        setField(term1725055, term1725055.getClass(), "typeOfThis", term1725607);
        Class<? extends Object> term1727789 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1727788 = ((Class) term1727789).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1727788).setAccessible(true);
        Object enum3082 = ((Field) term1727788).get((Object) null);
        term1725717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1725899 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1725717, term1725717.getClass(), "kind", enum3082);
        setField(term1725717, term1725717.getClass(), "typeOfThis", term1725899);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1725717;
        try {
            callMethod(klass, "isSubtype", argTypes, term1725055, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


