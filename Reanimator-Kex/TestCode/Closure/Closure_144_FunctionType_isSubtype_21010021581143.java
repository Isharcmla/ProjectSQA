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

public class FunctionType_isSubtype_21010021581143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518297;
     Object term1518749;

    public FunctionType_isSubtype_21010021581143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1521573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1521572 = ((Class) term1521573).getDeclaredField((String) "ORDINARY");
        ((Field) term1521572).setAccessible(true);
        Object enum2714 = ((Field) term1521572).get((Object) null);
        term1518297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1518553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1518641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term1518297, term1518297.getClass(), "kind", enum2714);
        setField(term1518553, term1518553.getClass(), "kind", enum2714);
        setField(term1518553, term1518553.getClass(), "typeOfThis", term1518641);
        setField(term1518297, term1518297.getClass(), "typeOfThis", term1518553);
        Class<? extends Object> term1521864 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1521863 = ((Class) term1521864).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1521863).setAccessible(true);
        Object enum2715 = ((Field) term1521863).get((Object) null);
        term1518749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1518931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1518749, term1518749.getClass(), "kind", enum2714);
        setField(term1518931, term1518931.getClass(), "kind", enum2715);
        setField(term1518931, term1518931.getClass(), "typeOfThis", null);
        setField(term1518749, term1518749.getClass(), "typeOfThis", term1518931);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1518749;
        try {
            callMethod(klass, "isSubtype", argTypes, term1518297, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


