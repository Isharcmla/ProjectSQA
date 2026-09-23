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

public class FunctionType_isSubtype_21010021581080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1407680;
     Object term1408152;

    public FunctionType_isSubtype_21010021581080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1411633 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1411632 = ((Class) term1411633).getDeclaredField((String) "ORDINARY");
        ((Field) term1411632).setAccessible(true);
        Object enum2528 = ((Field) term1411632).get((Object) null);
        term1407680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1407936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1408044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1407680, term1407680.getClass(), "kind", enum2528);
        setField(term1407936, term1407936.getClass(), "kind", enum2528);
        setField(term1407936, term1407936.getClass(), "typeOfThis", term1408044);
        setField(term1407680, term1407680.getClass(), "typeOfThis", term1407936);
        Class<? extends Object> term1411924 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1411923 = ((Class) term1411924).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1411923).setAccessible(true);
        Object enum2529 = ((Field) term1411923).get((Object) null);
        term1408152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1408334 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1408152, term1408152.getClass(), "kind", enum2528);
        setField(term1408334, term1408334.getClass(), "kind", enum2529);
        setField(term1408334, term1408334.getClass(), "typeOfThis", null);
        setField(term1408152, term1408152.getClass(), "typeOfThis", term1408334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1408152;
        try {
            callMethod(klass, "isSubtype", argTypes, term1407680, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


