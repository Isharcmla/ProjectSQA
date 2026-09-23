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

public class FunctionType_isSubtype_21010021581449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1882675;
     Object term1883335;

    public FunctionType_isSubtype_21010021581449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1884649 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1884648 = ((Class) term1884649).getDeclaredField((String) "INTERFACE");
        ((Field) term1884648).setAccessible(true);
        Object enum3511 = ((Field) term1884648).get((Object) null);
        Class<? extends Object> term1884943 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1884942 = ((Class) term1884943).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1884942).setAccessible(true);
        Object enum3512 = ((Field) term1884942).get((Object) null);
        term1882675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1883227 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1882675, term1882675.getClass(), "kind", enum3511);
        setField(term1883227, term1883227.getClass(), "kind", enum3512);
        setField(term1882675, term1882675.getClass(), "typeOfThis", term1883227);
        term1883335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1883665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term1883335, term1883335.getClass(), "kind", enum3511);
        setField(term1883665, term1883665.getClass(), "kind", enum3511);
        setField(term1883335, term1883335.getClass(), "typeOfThis", term1883665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1883335;
        try {
            callMethod(klass, "isSubtype", argTypes, term1882675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


