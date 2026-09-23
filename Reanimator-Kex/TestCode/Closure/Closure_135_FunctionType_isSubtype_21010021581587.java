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

public class FunctionType_isSubtype_21010021581587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2115506;
     Object term2116110;

    public FunctionType_isSubtype_21010021581587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2119953 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2119952 = ((Class) term2119953).getDeclaredField((String) "ORDINARY");
        ((Field) term2119952).setAccessible(true);
        Object enum3948 = ((Field) term2119952).get((Object) null);
        Class<? extends Object> term2120244 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2120243 = ((Class) term2120244).getDeclaredField((String) "INTERFACE");
        ((Field) term2120243).setAccessible(true);
        Object enum3949 = ((Field) term2120243).get((Object) null);
        term2115506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2115754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2116002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2115506, term2115506.getClass(), "kind", enum3948);
        setField(term2115754, term2115754.getClass(), "kind", enum3949);
        setField(term2115754, term2115754.getClass(), "typeOfThis", term2116002);
        setField(term2115506, term2115506.getClass(), "typeOfThis", term2115754);
        Class<? extends Object> term2120538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2120537 = ((Class) term2120538).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2120537).setAccessible(true);
        Object enum3950 = ((Field) term2120537).get((Object) null);
        term2116110 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2116292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2116110, term2116110.getClass(), "kind", enum3948);
        setField(term2116292, term2116292.getClass(), "kind", enum3950);
        setField(term2116292, term2116292.getClass(), "typeOfThis", null);
        setField(term2116110, term2116110.getClass(), "typeOfThis", term2116292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2116110;
        try {
            callMethod(klass, "isSubtype", argTypes, term2115506, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


