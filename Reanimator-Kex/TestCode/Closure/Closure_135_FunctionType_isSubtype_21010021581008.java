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

public class FunctionType_isSubtype_21010021581008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1137391;
     Object term1137903;

    public FunctionType_isSubtype_21010021581008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1140838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1140837 = ((Class) term1140838).getDeclaredField((String) "ORDINARY");
        ((Field) term1140837).setAccessible(true);
        Object enum2120 = ((Field) term1140837).get((Object) null);
        Class<? extends Object> term1141129 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1141128 = ((Class) term1141129).getDeclaredField((String) "INTERFACE");
        ((Field) term1141128).setAccessible(true);
        Object enum2121 = ((Field) term1141128).get((Object) null);
        term1137391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1137647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1137391, term1137391.getClass(), "kind", enum2120);
        setField(term1137647, term1137647.getClass(), "kind", enum2121);
        setField(term1137391, term1137391.getClass(), "typeOfThis", term1137647);
        term1137903 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1138085 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1137903, term1137903.getClass(), "kind", enum2120);
        setField(term1138085, term1138085.getClass(), "kind", enum2120);
        setField(term1137903, term1137903.getClass(), "typeOfThis", term1138085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1137903;
        try {
            callMethod(klass, "isSubtype", argTypes, term1137391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


