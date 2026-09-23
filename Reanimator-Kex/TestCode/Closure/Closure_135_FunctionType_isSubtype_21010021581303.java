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

public class FunctionType_isSubtype_21010021581303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1637168;
     Object term1637828;

    public FunctionType_isSubtype_21010021581303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1639420 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1639419 = ((Class) term1639420).getDeclaredField((String) "INTERFACE");
        ((Field) term1639419).setAccessible(true);
        Object enum3053 = ((Field) term1639419).get((Object) null);
        Class<? extends Object> term1639714 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1639713 = ((Class) term1639714).getDeclaredField((String) "INTERFACE");
        ((Field) term1639713).setAccessible(true);
        Object enum3054 = ((Field) term1639713).get((Object) null);
        term1637168 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1637720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1637168, term1637168.getClass(), "kind", enum3053);
        setField(term1637720, term1637720.getClass(), "kind", enum3054);
        setField(term1637168, term1637168.getClass(), "typeOfThis", term1637720);
        Class<? extends Object> term1640008 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1640007 = ((Class) term1640008).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1640007).setAccessible(true);
        Object enum3055 = ((Field) term1640007).get((Object) null);
        term1637828 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1638010 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1637828, term1637828.getClass(), "kind", enum3055);
        setField(term1638010, term1638010.getClass(), "kind", enum3054);
        setField(term1637828, term1637828.getClass(), "typeOfThis", term1638010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1637828;
        try {
            callMethod(klass, "isSubtype", argTypes, term1637168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


