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

public class FunctionType_isSubtype_21010021581209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1637796;
     Object term1638146;

    public FunctionType_isSubtype_21010021581209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1639352 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1639351 = ((Class) term1639352).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1639351).setAccessible(true);
        Object enum2927 = ((Field) term1639351).get((Object) null);
        term1637796 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1638038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1637796, term1637796.getClass(), "kind", enum2927);
        setField(term1637796, term1637796.getClass(), "call", term1638038);
        Class<? extends Object> term1639652 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1639651 = ((Class) term1639652).getDeclaredField((String) "ORDINARY");
        ((Field) term1639651).setAccessible(true);
        Object enum2928 = ((Field) term1639651).get((Object) null);
        term1638146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1638388 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1638146, term1638146.getClass(), "kind", enum2928);
        setField(term1638146, term1638146.getClass(), "call", term1638388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1638146;
        try {
            callMethod(klass, "isSubtype", argTypes, term1637796, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


