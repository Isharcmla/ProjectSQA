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

public class FunctionType_isSubtype_21010021581041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1338550;
     Object term1339202;

    public FunctionType_isSubtype_21010021581041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1340866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1340865 = ((Class) term1340866).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1340865).setAccessible(true);
        Object enum2400 = ((Field) term1340865).get((Object) null);
        Class<? extends Object> term1341166 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1341165 = ((Class) term1341166).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1341165).setAccessible(true);
        Object enum2401 = ((Field) term1341165).get((Object) null);
        term1338550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1339094 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1338550, term1338550.getClass(), "kind", enum2400);
        setField(term1339094, term1339094.getClass(), "kind", enum2401);
        setField(term1338550, term1338550.getClass(), "typeOfThis", term1339094);
        Class<? extends Object> term1341466 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1341465 = ((Class) term1341466).getDeclaredField((String) "INTERFACE");
        ((Field) term1341465).setAccessible(true);
        Object enum2402 = ((Field) term1341465).get((Object) null);
        term1339202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1339532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1339202, term1339202.getClass(), "kind", enum2400);
        setField(term1339532, term1339532.getClass(), "kind", enum2402);
        setField(term1339202, term1339202.getClass(), "typeOfThis", term1339532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1339202;
        try {
            callMethod(klass, "isSubtype", argTypes, term1338550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


