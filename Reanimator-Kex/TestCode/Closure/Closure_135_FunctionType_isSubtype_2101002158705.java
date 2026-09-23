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

public class FunctionType_isSubtype_2101002158705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653503;
     Object term653859;

    public FunctionType_isSubtype_2101002158705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term655043 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term655042 = ((Class) term655043).getDeclaredField((String) "ORDINARY");
        ((Field) term655042).setAccessible(true);
        Object enum1217 = ((Field) term655042).get((Object) null);
        term653503 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term653751 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term653503, term653503.getClass(), "kind", enum1217);
        setField(term653503, term653503.getClass(), "typeOfThis", term653751);
        Class<? extends Object> term655334 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term655333 = ((Class) term655334).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term655333).setAccessible(true);
        Object enum1218 = ((Field) term655333).get((Object) null);
        term653859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term654115 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term653859, term653859.getClass(), "kind", enum1218);
        setField(term653859, term653859.getClass(), "typeOfThis", term654115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term653859;
        try {
            callMethod(klass, "isSubtype", argTypes, term653503, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


