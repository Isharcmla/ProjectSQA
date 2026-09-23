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

public class FunctionType_isSubtype_21010021581105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1293132;
     Object term1293792;

    public FunctionType_isSubtype_21010021581105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1295471 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1295470 = ((Class) term1295471).getDeclaredField((String) "ORDINARY");
        ((Field) term1295470).setAccessible(true);
        Object enum2414 = ((Field) term1295470).get((Object) null);
        term1293132 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1293684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1293132, term1293132.getClass(), "kind", enum2414);
        setField(term1293684, term1293684.getClass(), "kind", enum2414);
        setField(term1293132, term1293132.getClass(), "typeOfThis", term1293684);
        Class<? extends Object> term1295762 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1295761 = ((Class) term1295762).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1295761).setAccessible(true);
        Object enum2415 = ((Field) term1295761).get((Object) null);
        Class<? extends Object> term1296062 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1296061 = ((Class) term1296062).getDeclaredField((String) "INTERFACE");
        ((Field) term1296061).setAccessible(true);
        Object enum2416 = ((Field) term1296061).get((Object) null);
        term1293792 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1293974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1293792, term1293792.getClass(), "kind", enum2415);
        setField(term1293974, term1293974.getClass(), "kind", enum2416);
        setField(term1293792, term1293792.getClass(), "typeOfThis", term1293974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1293792;
        try {
            callMethod(klass, "isSubtype", argTypes, term1293132, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


