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

public class FunctionType_isSubtype_21010021581203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1465269;
     Object term1465921;

    public FunctionType_isSubtype_21010021581203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1467513 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1467512 = ((Class) term1467513).getDeclaredField((String) "ORDINARY");
        ((Field) term1467512).setAccessible(true);
        Object enum2740 = ((Field) term1467512).get((Object) null);
        Class<? extends Object> term1467804 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1467803 = ((Class) term1467804).getDeclaredField((String) "INTERFACE");
        ((Field) term1467803).setAccessible(true);
        Object enum2741 = ((Field) term1467803).get((Object) null);
        term1465269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1465813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1465269, term1465269.getClass(), "kind", enum2740);
        setField(term1465813, term1465813.getClass(), "kind", enum2741);
        setField(term1465269, term1465269.getClass(), "typeOfThis", term1465813);
        Class<? extends Object> term1468098 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1468097 = ((Class) term1468098).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1468097).setAccessible(true);
        Object enum2742 = ((Field) term1468097).get((Object) null);
        term1465921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1466103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1465921, term1465921.getClass(), "kind", enum2742);
        setField(term1466103, term1466103.getClass(), "kind", enum2741);
        setField(term1465921, term1465921.getClass(), "typeOfThis", term1466103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1465921;
        try {
            callMethod(klass, "isSubtype", argTypes, term1465269, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


