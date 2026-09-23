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

public class FunctionType_isSubtype_21010021581535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2242023;
     Object term2242683;

    public FunctionType_isSubtype_21010021581535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2245906 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2245905 = ((Class) term2245906).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2245905).setAccessible(true);
        Object enum4007 = ((Field) term2245905).get((Object) null);
        Class<? extends Object> term2246206 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2246205 = ((Class) term2246206).getDeclaredField((String) "INTERFACE");
        ((Field) term2246205).setAccessible(true);
        Object enum4008 = ((Field) term2246205).get((Object) null);
        term2242023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2242575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2242023, term2242023.getClass(), "kind", enum4007);
        setField(term2242575, term2242575.getClass(), "kind", enum4008);
        setField(term2242023, term2242023.getClass(), "typeOfThis", term2242575);
        Class<? extends Object> term2246500 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2246499 = ((Class) term2246500).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2246499).setAccessible(true);
        Object enum4009 = ((Field) term2246499).get((Object) null);
        term2242683 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2243013 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2242683, term2242683.getClass(), "kind", enum4007);
        setField(term2243013, term2243013.getClass(), "kind", enum4009);
        setField(term2242683, term2242683.getClass(), "typeOfThis", term2243013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2242683;
        try {
            callMethod(klass, "isSubtype", argTypes, term2242023, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


