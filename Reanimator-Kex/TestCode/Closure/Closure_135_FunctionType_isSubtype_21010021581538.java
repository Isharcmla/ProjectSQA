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

public class FunctionType_isSubtype_21010021581538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037294;
     Object term2037766;

    public FunctionType_isSubtype_21010021581538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2040711 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2040710 = ((Class) term2040711).getDeclaredField((String) "ORDINARY");
        ((Field) term2040710).setAccessible(true);
        Object enum3799 = ((Field) term2040710).get((Object) null);
        term2037294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2037968 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2038096 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2037294, term2037294.getClass(), "kind", enum3799);
        setField(term2037968, term2037968.getClass(), "kind", enum3799);
        setField(term2037968, term2037968.getClass(), "typeOfThis", term2038096);
        setField(term2037294, term2037294.getClass(), "typeOfThis", term2037968);
        Class<? extends Object> term2041002 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2041001 = ((Class) term2041002).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2041001).setAccessible(true);
        Object enum3800 = ((Field) term2041001).get((Object) null);
        term2037766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2037766, term2037766.getClass(), "kind", enum3800);
        setField(term2037766, term2037766.getClass(), "typeOfThis", term2037968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2037766;
        try {
            callMethod(klass, "isSubtype", argTypes, term2037294, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


