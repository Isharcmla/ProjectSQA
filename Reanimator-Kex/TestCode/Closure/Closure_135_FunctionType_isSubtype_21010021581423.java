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

public class FunctionType_isSubtype_21010021581423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1840487;
     Object term1841247;

    public FunctionType_isSubtype_21010021581423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1842637 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1842636 = ((Class) term1842637).getDeclaredField((String) "INTERFACE");
        ((Field) term1842636).setAccessible(true);
        Object enum3432 = ((Field) term1842636).get((Object) null);
        term1840487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1841031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1841631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1840487, term1840487.getClass(), "kind", enum3432);
        setField(term1841031, term1841031.getClass(), "kind", enum3432);
        setField(term1841031, term1841031.getClass(), "typeOfThis", term1841631);
        setField(term1840487, term1840487.getClass(), "typeOfThis", term1841031);
        Class<? extends Object> term1842931 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1842930 = ((Class) term1842931).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1842930).setAccessible(true);
        Object enum3433 = ((Field) term1842930).get((Object) null);
        term1841247 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1841429 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1841247, term1841247.getClass(), "kind", enum3433);
        setField(term1841429, term1841429.getClass(), "kind", enum3432);
        setField(term1841429, term1841429.getClass(), "typeOfThis", term1841631);
        setField(term1841247, term1841247.getClass(), "typeOfThis", term1841429);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1841247;
        try {
            callMethod(klass, "isSubtype", argTypes, term1840487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


