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

public class FunctionType_getGreatestSubtype_679591709798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794376;
     Object term794732;

    public FunctionType_getGreatestSubtype_679591709798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term797239 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term797238 = ((Class) term797239).getDeclaredField((String) "ORDINARY");
        ((Field) term797238).setAccessible(true);
        Object enum1486 = ((Field) term797238).get((Object) null);
        term794376 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term794624 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term794376, term794376.getClass(), "kind", enum1486);
        setField(term794376, term794376.getClass(), "typeOfThis", term794624);
        Class<? extends Object> term797530 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term797529 = ((Class) term797530).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term797529).setAccessible(true);
        Object enum1487 = ((Field) term797529).get((Object) null);
        term794732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term794980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term794732, term794732.getClass(), "kind", enum1487);
        setField(term794732, term794732.getClass(), "typeOfThis", term794980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term794732;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term794376, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


