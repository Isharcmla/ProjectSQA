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

public class FunctionType_isSubtype_21010021581313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1656530;
     Object term1657290;

    public FunctionType_isSubtype_21010021581313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1658734 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1658733 = ((Class) term1658734).getDeclaredField((String) "INTERFACE");
        ((Field) term1658733).setAccessible(true);
        Object enum3092 = ((Field) term1658733).get((Object) null);
        term1656530 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1657082 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1657182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1656530, term1656530.getClass(), "kind", enum3092);
        setField(term1657082, term1657082.getClass(), "kind", enum3092);
        setField(term1657082, term1657082.getClass(), "typeOfThis", term1657182);
        setField(term1656530, term1656530.getClass(), "typeOfThis", term1657082);
        Class<? extends Object> term1659028 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1659027 = ((Class) term1659028).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1659027).setAccessible(true);
        Object enum3093 = ((Field) term1659027).get((Object) null);
        term1657290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1657472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1657728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1657290, term1657290.getClass(), "kind", enum3093);
        setField(term1657472, term1657472.getClass(), "kind", enum3092);
        setField(term1657472, term1657472.getClass(), "typeOfThis", term1657728);
        setField(term1657290, term1657290.getClass(), "typeOfThis", term1657472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1657290;
        try {
            callMethod(klass, "isSubtype", argTypes, term1656530, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


