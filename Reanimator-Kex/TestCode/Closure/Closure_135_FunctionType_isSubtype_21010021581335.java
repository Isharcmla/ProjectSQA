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

public class FunctionType_isSubtype_21010021581335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1694896;
     Object term1695260;

    public FunctionType_isSubtype_21010021581335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1696882 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1696881 = ((Class) term1696882).getDeclaredField((String) "ORDINARY");
        ((Field) term1696881).setAccessible(true);
        Object enum3167 = ((Field) term1696881).get((Object) null);
        term1694896 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1695152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1694896, term1694896.getClass(), "kind", enum3167);
        setField(term1695152, term1695152.getClass(), "kind", enum3167);
        setField(term1694896, term1694896.getClass(), "typeOfThis", term1695152);
        Class<? extends Object> term1697173 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1697172 = ((Class) term1697173).getDeclaredField((String) "INTERFACE");
        ((Field) term1697172).setAccessible(true);
        Object enum3168 = ((Field) term1697172).get((Object) null);
        term1695260 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1695442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1695260, term1695260.getClass(), "kind", enum3167);
        setField(term1695442, term1695442.getClass(), "kind", enum3168);
        setField(term1695260, term1695260.getClass(), "typeOfThis", term1695442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1695260;
        try {
            callMethod(klass, "isSubtype", argTypes, term1694896, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


