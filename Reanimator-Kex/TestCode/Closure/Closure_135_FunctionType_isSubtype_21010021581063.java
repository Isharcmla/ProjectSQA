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

public class FunctionType_isSubtype_21010021581063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225317;
     Object term1225773;

    public FunctionType_isSubtype_21010021581063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1227803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1227802 = ((Class) term1227803).getDeclaredField((String) "ORDINARY");
        ((Field) term1227802).setAccessible(true);
        Object enum2286 = ((Field) term1227802).get((Object) null);
        term1225317 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1225565 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1225665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1225317, term1225317.getClass(), "kind", enum2286);
        setField(term1225565, term1225565.getClass(), "kind", enum2286);
        setField(term1225565, term1225565.getClass(), "typeOfThis", term1225665);
        setField(term1225565, term1225565.getClass(), "call", null);
        setField(term1225317, term1225317.getClass(), "typeOfThis", term1225565);
        Class<? extends Object> term1228094 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1228093 = ((Class) term1228094).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1228093).setAccessible(true);
        Object enum2287 = ((Field) term1228093).get((Object) null);
        term1225773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1225955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1226197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term1226291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1225773, term1225773.getClass(), "kind", enum2286);
        setField(term1225955, term1225955.getClass(), "kind", enum2287);
        setField(term1225955, term1225955.getClass(), "typeOfThis", term1226197);
        setField(term1225955, term1225955.getClass(), "call", term1226291);
        setField(term1225773, term1225773.getClass(), "typeOfThis", term1225955);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1225773;
        try {
            callMethod(klass, "isSubtype", argTypes, term1225317, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


